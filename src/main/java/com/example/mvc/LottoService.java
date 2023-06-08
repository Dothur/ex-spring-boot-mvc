package com.example.mvc;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class LottoService {
    private int hits = 0;
    private List<List<Integer>> history = new ArrayList<>();

    // 누군가 방문했을 때 호출하는 메소드
    public int addHit() {
        hits++;
        return hits;
    }

    // lotto 메소드 만들기
    public List<Integer> nextLottoNum(){
        List<Integer> randLottoNumList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            randLottoNumList.add(random.nextInt(1, 46));
        }
        history.add(randLottoNumList);
        return randLottoNumList;
    }

    // history 메소드 추가
}
