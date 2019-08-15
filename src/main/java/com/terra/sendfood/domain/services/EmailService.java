package com.terra.sendfood.domain.services;
import org.springframework.mail.SimpleMailMessage;

import com.terra.sendfood.domain.Cliente;
import com.terra.sendfood.domain.Pedido;


public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
