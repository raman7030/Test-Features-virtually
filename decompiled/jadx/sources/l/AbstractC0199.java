package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WE */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0199 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f1441;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f1442;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f1443;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo1359(String str);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m1360() {
        if (this.f1442) {
            return this.f1441;
        }
        this.f1442 = true;
        try {
            for (String str : this.f1443) {
                mo1359(str);
            }
            this.f1441 = true;
        } catch (UnsatisfiedLinkError unused) {
            C19956.m46037("Failed to load " + Arrays.toString(this.f1443));
        }
        return this.f1441;
    }

    public AbstractC0199(String... strArr) {
        this.f1443 = strArr;
    }
}
