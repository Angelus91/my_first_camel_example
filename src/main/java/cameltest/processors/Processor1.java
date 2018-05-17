/**
 * 
 */
package cameltest.processors;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Processor;

public class Processor1 implements Processor {
    public void process(Exchange exchange) throws Exception {
    	exchange.setPattern(ExchangePattern.InOut);
    	System.out.println("Pattern: "+exchange.getPattern());
    	// System.out.println("Received Exchange: " + exchange.getIn().getBody(String.class) + ", And: " + exchange.getPattern());
    	
    }
}
