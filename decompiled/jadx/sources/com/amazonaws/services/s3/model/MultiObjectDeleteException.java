package com.amazonaws.services.s3.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MultiObjectDeleteException extends AmazonS3Exception {
    public static final long serialVersionUID = -2004213552302446866L;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f621;

    public MultiObjectDeleteException(List list, List list2) {
        super("One or more objects could not be deleted");
        ArrayList arrayList = new ArrayList();
        this.f621 = arrayList;
        new ArrayList().addAll(list2);
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m601() {
        return this.f621;
    }

    /* JADX INFO: loaded from: classes.dex */
    public class DeleteError {

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public String f622;

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final String m602() {
            return this.f622;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m603(String str) {
            this.f622 = str;
        }
    }
}
