package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.az;

/* JADX INFO: loaded from: classes.dex */
public enum Gender implements az {
    MALE(0),
    FEMALE(1),
    UNKNOWN(2);

    public final int value;

    Gender(int i) {
        this.value = i;
    }

    @Override // com.umeng.analytics.pro.az
    public int getValue() {
        return this.value;
    }

    public static Gender findByValue(int i) {
        if (i == 0) {
            return MALE;
        }
        if (i == 1) {
            return FEMALE;
        }
        if (i != 2) {
            return null;
        }
        return UNKNOWN;
    }
}
