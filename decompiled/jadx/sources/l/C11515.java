package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11515 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34378;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f34379;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f34380;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22803 f34381;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f34382;

    public C11515(C22803 c22803, long j) {
        this.f34381 = c22803;
        this.f34379 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28342() {
        C22803 c22803 = this.f34381;
        if (!C10104.m25379(c22803.f73638)) {
            this.f34379++;
            return c22803.m50890();
        }
        if (this.f34380 == 0) {
            int iM29710 = c22803.f73636.m29710();
            int i = (iM29710 & 127) + 1;
            this.f34380 = i;
            if (i > (((long) c22803.f73638.f30418) * ((long) c22803.f73638.f30425)) - this.f34379) {
                throw new IOException("TGA packet exceeds frame bounds");
            }
            boolean z = (iM29710 & 128) != 0;
            this.f34382 = z;
            if (z) {
                this.f34378 = c22803.m50890();
            }
        }
        this.f34380--;
        this.f34379++;
        return this.f34382 ? this.f34378 : c22803.m50890();
    }
}
