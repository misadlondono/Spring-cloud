package com.easy.enginerules;

import com.easy.enginerules.rules.SolicitudAsociadaCrm;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnginerulesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnginerulesApplication.class, args);

		// define facts
		Facts facts = new Facts();
		facts.put("regla", true);

		// define rules
		SolicitudAsociadaCrm solicitudRule = new SolicitudAsociadaCrm();
		Rules rules = new Rules();
		rules.register(solicitudRule);

		// fire rules on known facts
		RulesEngine rulesEngine = new DefaultRulesEngine();
		rulesEngine.fire(rules, facts);

	}

}
