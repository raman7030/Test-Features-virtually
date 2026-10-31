package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BucketCrossOriginConfiguration implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f541;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m529() {
        return this.f541;
    }

    public BucketCrossOriginConfiguration(ArrayList arrayList) {
        this.f541 = arrayList;
    }
}
