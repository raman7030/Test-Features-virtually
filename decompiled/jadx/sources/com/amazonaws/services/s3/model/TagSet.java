package com.amazonaws.services.s3.model;

import com.alipay.sdk.m.y.l;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class TagSet {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f671;

    public TagSet(HashMap map) {
        HashMap map2 = new HashMap(1);
        this.f671 = map2;
        map2.putAll(map);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append("Tags: " + this.f671);
        stringBuffer.append(l.d);
        return stringBuffer.toString();
    }
}
