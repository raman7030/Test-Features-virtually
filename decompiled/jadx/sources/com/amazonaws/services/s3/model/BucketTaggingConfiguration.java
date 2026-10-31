package com.amazonaws.services.s3.model;

import com.alipay.sdk.m.y.l;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class BucketTaggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f548;

    public BucketTaggingConfiguration() {
        this.f548 = null;
        this.f548 = new ArrayList(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m536() {
        return this.f548;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append("TagSets: " + this.f548);
        stringBuffer.append(l.d);
        return stringBuffer.toString();
    }
}
