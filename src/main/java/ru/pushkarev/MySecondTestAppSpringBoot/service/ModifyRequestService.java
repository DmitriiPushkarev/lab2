package ru.pushkarev.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.pushkarev.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
