package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13312 {

    /* JADX INFO: renamed from: ֫ */
    public int f37375;

    /* JADX INFO: renamed from: ۧ */
    public long f37376;

    /* JADX INFO: renamed from: ܽ */
    public int f37377;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C24040 f37378;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f37379;

    public C13312(C24040 c24040, long j) {
        this.f37378 = c24040;
        this.f37376 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30388() {
        C24040 c24040 = this.f37378;
        if (!C11971.m27398(c24040.f76368)) {
            this.f37376++;
            return c24040.m53280();
        }
        if (this.f37377 == 0) {
            int iM31772 = c24040.f76366.m31772();
            int i = (iM31772 & 127) + 1;
            this.f37377 = i;
            if (i > (((long) c24040.f76368.f33377) * ((long) c24040.f76368.f33384)) - this.f37376) {
                throw new IOException("TGA packet exceeds frame bounds");
            }
            boolean z = (iM31772 & 128) != 0;
            this.f37379 = z;
            if (z) {
                this.f37375 = c24040.m53280();
            }
        }
        this.f37377--;
        this.f37376++;
        return this.f37379 ? this.f37375 : c24040.m53280();
    }
}
