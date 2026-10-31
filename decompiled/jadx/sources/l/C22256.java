package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩹ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes.dex */
public final class C22256 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f72219;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f72220;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13788 f72221;

    public C22256(C13788 c13788, int i) {
        this.f72221 = c13788;
        this.f72219 = i;
        if (m49974() >= 225) {
            this.f72220 = 68;
            return;
        }
        if (m49974() >= 190) {
            this.f72220 = 64;
            return;
        }
        if (m49974() >= 180) {
            this.f72220 = 60;
            return;
        }
        if (m49974() >= 170) {
            this.f72220 = 56;
            return;
        }
        if (m49974() >= 166) {
            this.f72220 = 64;
            return;
        }
        if (m49974() >= 162) {
            this.f72220 = 68;
        } else if (m49974() >= 127) {
            this.f72220 = 76;
        } else {
            this.f72220 = 72;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m49975() {
        int i = 0;
        while (true) {
            int i2 = this.f72219;
            C13788 c13788 = this.f72221;
            if (i >= 4) {
                for (int i3 = 4; i3 < 7; i3++) {
                    int i4 = i2 + i3;
                    if (c13788.mo11933(i4) < 48 || c13788.mo11933(i4) > 57) {
                        return false;
                    }
                }
                return c13788.mo11933(i2 + 7) == 0;
            }
            if (c13788.mo11933(i2 + i) != C13788.f41103[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m49974() {
        int i = this.f72219 + 4;
        C13788 c13788 = this.f72221;
        c13788.getClass();
        return Integer.parseInt(c13788.m51008(i, 3, Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m49972() {
        return this.f72221.mo11935(this.f72219 + 20);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m49973() {
        int iM49974 = m49974();
        C13788 c13788 = this.f72221;
        int i = this.f72219;
        if (iM49974 < 127) {
            if (m49974() >= 56) {
                if (m49974() < 56) {
                    throw new IllegalStateException("Unsupported oat version");
                }
                int i2 = this.f72220;
                return c13788.mo11935((i2 - 4) + i) + i2 + i;
            }
            throw new IllegalStateException("Unsupported oat version");
        }
        return c13788.mo11935(i + 24) + i;
    }
}
