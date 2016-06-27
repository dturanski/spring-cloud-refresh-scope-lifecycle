package org.dturanski;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RefreshScopeSmartlifecycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefreshScopeSmartlifecycleApplication.class, args);
	}
	
	@Bean
	@RefreshScope
	public Foo foo() {
		return new Foo();
	}
}

class Foo implements SmartLifecycle {

	@Override
	public void start() {
		throw new RuntimeException("throw this on start");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getPhase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void stop(Runnable callback) {
		// TODO Auto-generated method stub
		
	}
	
}