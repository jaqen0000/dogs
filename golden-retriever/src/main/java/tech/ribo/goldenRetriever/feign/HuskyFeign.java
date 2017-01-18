package tech.ribo.goldenRetriever.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${service.husky.name}")
public interface HuskyFeign {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String index();

	@RequestMapping(value = "/local", method = RequestMethod.GET)
	String husky();
}
