package br.com.ebrockes.springbatchexample.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ebrockes.springbatchexample.model.User;
import br.com.ebrockes.springbatchexample.repository.UserRepository;

@Component
public class DbWriter implements ItemWriter<User>{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void write(List<? extends User> users) throws Exception {
		userRepository.saveAll(users);
	}

	
}
