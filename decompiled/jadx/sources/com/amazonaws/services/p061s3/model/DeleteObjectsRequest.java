package com.amazonaws.services.p061s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DeleteObjectsRequest extends AmazonWebServiceRequest {

    /* JADX INFO: renamed from: ۗ */
    public boolean f1746;

    /* JADX INFO: renamed from: ۙ */
    public final ArrayList f1747 = new ArrayList();

    /* JADX INFO: renamed from: ᩶ */
    public String f1748;

    public DeleteObjectsRequest(String str) {
        this.f1748 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1730() {
        return this.f1748;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m1727() {
        this.f1746 = true;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m1728() {
        return this.f1746;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1726(List list) {
        ArrayList arrayList = this.f1747;
        arrayList.clear();
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList m1729() {
        return this.f1747;
    }

    public class KeyVersion implements Serializable {

        /* JADX INFO: renamed from: ᩸ */
        public final String f1749;

        public KeyVersion(String str) {
            this.f1749 = str;
        }

        /* JADX INFO: renamed from: ֫ */
        public final String m1731() {
            return this.f1749;
        }
    }
}
