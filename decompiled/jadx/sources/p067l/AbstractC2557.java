package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WE */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2557 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f4220;

    /* JADX INFO: renamed from: ۧ */
    public boolean f4221;

    /* JADX INFO: renamed from: ܽ */
    public String[] f4222;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3772(String str);

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m3773() {
        if (this.f4221) {
            return this.f4220;
        }
        this.f4221 = true;
        try {
            for (String str : this.f4222) {
                mo3772(str);
            }
            this.f4220 = true;
        } catch (UnsatisfiedLinkError unused) {
            C21334.m48351("Failed to load " + Arrays.toString(this.f4222));
        }
        return this.f4220;
    }

    public AbstractC2557(String... strArr) {
        this.f4222 = strArr;
    }
}
