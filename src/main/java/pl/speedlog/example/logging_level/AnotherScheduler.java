package pl.speedlog.example.logging_level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
class AnotherScheduler {

    private static final Logger log = LoggerFactory.getLogger(AnotherScheduler.class);

    @Scheduled(fixedRate = 2000)
    public void logExample() {
        log.trace("This is TRACE level message from class: {}", this.getClass().getSimpleName());
        log.debug("This is DEBUG level message from class: {}", this.getClass().getSimpleName());
        log.info("This is INFO level message from class: {}", this.getClass().getSimpleName());
    }
}
