package com.company.data;

import java.util.ArrayList;
import java.util.List;

public class Relations {
    public Relations() {
        relationList = new ArrayList<>();
    }

    public void add(Relation relation) {
        relationList.add(relation);
    }

    private List<Relation> relationList;

}
