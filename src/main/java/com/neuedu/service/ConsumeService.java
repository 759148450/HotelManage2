package com.neuedu.service;//package com.neuedu.service;

import com.neuedu.pojo.Consume;

import java.util.List;

public interface ConsumeService {
    List<Consume> getConsumes(Consume consume);
    List<Consume> getAll(Consume consume);
    Consume getconsumeById(int id);
    int add(Consume consume);
    int del(Consume consume);
    int update(Consume consume);
}
