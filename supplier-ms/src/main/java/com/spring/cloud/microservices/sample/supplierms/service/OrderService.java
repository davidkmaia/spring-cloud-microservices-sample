package com.spring.cloud.microservices.sample.supplierms.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cloud.microservices.sample.supplierms.dto.OrderItemDTO;
import com.spring.cloud.microservices.sample.supplierms.model.Order;
import com.spring.cloud.microservices.sample.supplierms.model.OrderItem;
import com.spring.cloud.microservices.sample.supplierms.model.Product;
import com.spring.cloud.microservices.sample.supplierms.repository.OrderRepository;
import com.spring.cloud.microservices.sample.supplierms.repository.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public Order makeOrder(List<OrderItemDTO> itens) {
		
		if(itens == null) {
			return null;
		}
		
		List<OrderItem> orderItens = toOrderItem(itens);
		Order order = new Order(orderItens);
		order.setPreparationTime(itens.size());
		return orderRepository.save(order);
	}
	
	public Order getOrderById(Long id) {
		return this.orderRepository.findById(id).orElse(new Order());
	}

	private List<OrderItem> toOrderItem(List<OrderItemDTO> itens) {
		
		List<Long> productIds = itens
				.stream()
				.map(item -> item.getId())
				.collect(Collectors.toList());
		
		List<Product> productsOrder = productRepository.findByIdIn(productIds);
		
		List<OrderItem> orderItens = itens
			.stream()
			.map(item -> {
				Product product = productsOrder
						.stream()
						.filter(p -> p.getId() == item.getId())
						.findFirst().get();
				
				OrderItem orderItem = new OrderItem();
				orderItem.setProduct(product);
				orderItem.setQuantity(item.getQuantity());
				return orderItem;
			})
			.collect(Collectors.toList());
		return orderItens;
	}
}