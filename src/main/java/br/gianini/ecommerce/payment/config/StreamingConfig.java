package br.gianini.ecommerce.payment.config;

import br.gianini.ecommerce.payment.streaming.CheckoutProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(CheckoutProcessor.class)
public class StreamingConfig {
}
