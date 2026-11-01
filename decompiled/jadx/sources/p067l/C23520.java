package p067l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩹ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes.dex */
public final class C23520 {

    /* JADX INFO: renamed from: ֫ */
    public final int f74943;

    /* JADX INFO: renamed from: ۧ */
    public final int f74944;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C15472 f74945;

    public C23520(C15472 c15472, int i) {
        this.f74945 = c15472;
        this.f74943 = i;
        if (m52302() >= 225) {
            this.f74944 = 68;
            return;
        }
        if (m52302() >= 190) {
            this.f74944 = 64;
            return;
        }
        if (m52302() >= 180) {
            this.f74944 = 60;
            return;
        }
        if (m52302() >= 170) {
            this.f74944 = 56;
            return;
        }
        if (m52302() >= 166) {
            this.f74944 = 64;
            return;
        }
        if (m52302() >= 162) {
            this.f74944 = 68;
        } else if (m52302() >= 127) {
            this.f74944 = 76;
        } else {
            this.f74944 = 72;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m52303() {
        int i = 0;
        while (true) {
            int i2 = this.f74943;
            C15472 c15472 = this.f74945;
            if (i >= 4) {
                for (int i3 = 4; i3 < 7; i3++) {
                    int i4 = i2 + i3;
                    if (c15472.mo13853(i4) < 48 || c15472.mo13853(i4) > 57) {
                        return false;
                    }
                }
                return c15472.mo13853(i2 + 7) == 0;
            }
            if (c15472.mo13853(i2 + i) != C15472.f44181[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m52302() {
        int i = this.f74943 + 4;
        C15472 c15472 = this.f74945;
        c15472.getClass();
        return Integer.parseInt(c15472.m53399(i, 3, Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m52300() {
        return this.f74945.mo13855(this.f74943 + 20);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m52301() {
        int iM52302 = m52302();
        C15472 c15472 = this.f74945;
        int i = this.f74943;
        if (iM52302 < 127) {
            if (m52302() >= 56) {
                if (m52302() < 56) {
                    throw new IllegalStateException("Unsupported oat version");
                }
                int i2 = this.f74944;
                return c15472.mo13855((i2 - 4) + i) + i2 + i;
            }
            throw new IllegalStateException("Unsupported oat version");
        }
        return c15472.mo13855(i + 24) + i;
    }
}
