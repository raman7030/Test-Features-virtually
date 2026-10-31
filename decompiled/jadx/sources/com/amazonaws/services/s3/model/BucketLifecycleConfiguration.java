package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BucketLifecycleConfiguration implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f542;

    public class NoncurrentVersionTransition implements Serializable {
    }

    public class Transition implements Serializable {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m530() {
        return this.f542;
    }

    public BucketLifecycleConfiguration(ArrayList arrayList) {
        this.f542 = arrayList;
    }

    public class Rule implements Serializable {

        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
        public ArrayList f543;

        /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
        public ArrayList f544;

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m532(Transition transition) {
            if (transition == null) {
                throw new IllegalArgumentException("Transition cannot be null.");
            }
            if (this.f544 == null) {
                this.f544 = new ArrayList();
            }
            this.f544.add(transition);
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m531(NoncurrentVersionTransition noncurrentVersionTransition) {
            if (noncurrentVersionTransition == null) {
                throw new IllegalArgumentException("NoncurrentVersionTransition cannot be null.");
            }
            if (this.f543 == null) {
                this.f543 = new ArrayList();
            }
            this.f543.add(noncurrentVersionTransition);
        }
    }
}
