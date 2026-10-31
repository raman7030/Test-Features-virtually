package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DeleteObjectsRequest extends AmazonWebServiceRequest {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f586;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f587 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f588;

    public DeleteObjectsRequest(String str) {
        this.f588 = str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m564() {
        return this.f588;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m561() {
        this.f586 = true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m562() {
        return this.f586;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m560(List list) {
        ArrayList arrayList = this.f587;
        arrayList.clear();
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList m563() {
        return this.f587;
    }

    public class KeyVersion implements Serializable {

        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
        public final String f589;

        public KeyVersion(String str) {
            this.f589 = str;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final String m565() {
            return this.f589;
        }
    }
}
