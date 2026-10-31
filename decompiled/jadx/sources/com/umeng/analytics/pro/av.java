package com.umeng.analytics.pro;

import java.io.Serializable;

/* JADX INFO: compiled from: N66S */
/* JADX INFO: loaded from: classes.dex */
public interface av extends Serializable {
    void clear();

    av deepCopy();

    bc fieldForId(int i);

    void read(bu buVar);

    void write(bu buVar);
}
