package com.neuedu.service;

import com.neuedu.pojo.Leaguer;

import java.util.List;

public interface LeaguerService {
    List<Leaguer> getLeaguers(Leaguer leaguer);
    List<Leaguer> getAll(Leaguer leaguer);
    Leaguer getleaguerById(int gid);
    int add(Leaguer leaguer);
    int del(Leaguer leaguer);
    int update(Leaguer leaguer);
}
