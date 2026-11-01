package com.amazonaws.services.p061s3.model;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class TagSet {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f1831;

    public TagSet(HashMap map) {
        HashMap map2 = new HashMap(1);
        this.f1831 = map2;
        map2.putAll(map);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append("Tags: " + this.f1831);
        stringBuffer.append(C0249l.f1198d);
        return stringBuffer.toString();
    }
}
