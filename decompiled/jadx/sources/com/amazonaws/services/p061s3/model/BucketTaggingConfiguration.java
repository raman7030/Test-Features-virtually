package com.amazonaws.services.p061s3.model;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class BucketTaggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f1708;

    public BucketTaggingConfiguration() {
        this.f1708 = null;
        this.f1708 = new ArrayList(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m1702() {
        return this.f1708;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append("TagSets: " + this.f1708);
        stringBuffer.append(C0249l.f1198d);
        return stringBuffer.toString();
    }
}
