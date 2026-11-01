package com.amazonaws.services.p061s3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BucketLifecycleConfiguration implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f1702;

    public class NoncurrentVersionTransition implements Serializable {
    }

    public class Transition implements Serializable {
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m1696() {
        return this.f1702;
    }

    public BucketLifecycleConfiguration(ArrayList arrayList) {
        this.f1702 = arrayList;
    }

    public class Rule implements Serializable {

        /* JADX INFO: renamed from: ᩸ */
        public ArrayList f1703;

        /* JADX INFO: renamed from: ᩹ */
        public ArrayList f1704;

        /* JADX INFO: renamed from: ֫ */
        public final void m1698(Transition transition) {
            if (transition == null) {
                throw new IllegalArgumentException("Transition cannot be null.");
            }
            if (this.f1704 == null) {
                this.f1704 = new ArrayList();
            }
            this.f1704.add(transition);
        }

        /* JADX INFO: renamed from: ֫ */
        public final void m1697(NoncurrentVersionTransition noncurrentVersionTransition) {
            if (noncurrentVersionTransition == null) {
                throw new IllegalArgumentException("NoncurrentVersionTransition cannot be null.");
            }
            if (this.f1703 == null) {
                this.f1703 = new ArrayList();
            }
            this.f1703.add(noncurrentVersionTransition);
        }
    }
}
