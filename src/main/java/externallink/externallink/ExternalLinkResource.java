package externallink.externallink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author Maksym Shamanovskyi
 */
@RequestMapping(path = "/api")
@RestController
public class ExternalLinkResource {

    private static final Logger LOG = LoggerFactory.getLogger(ExternalLinkResource.class);

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public void getExternalLink() {
        LOG.info("Received Impression.");
    }
}
