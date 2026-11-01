package com.amazonaws.services.p061s3.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MultiObjectDeleteException extends AmazonS3Exception {
    public static final long serialVersionUID = -2004213552302446866L;

    /* JADX INFO: renamed from: ۤ */
    public final ArrayList f1781;

    public MultiObjectDeleteException(List list, List list2) {
        super("One or more objects could not be deleted");
        ArrayList arrayList = new ArrayList();
        this.f1781 = arrayList;
        new ArrayList().addAll(list2);
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList m1767() {
        return this.f1781;
    }

    /* JADX INFO: loaded from: classes.dex */
    public class DeleteError {

        /* JADX INFO: renamed from: ֫ */
        public String f1782;

        /* JADX INFO: renamed from: ֫ */
        public final String m1768() {
            return this.f1782;
        }

        /* JADX INFO: renamed from: ֫ */
        public final void m1769(String str) {
            this.f1782 = str;
        }
    }
}
