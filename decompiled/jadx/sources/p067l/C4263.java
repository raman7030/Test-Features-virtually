package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T19G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4263 {

    /* JADX INFO: renamed from: ֫ */
    public final int f9453;

    /* JADX INFO: renamed from: ۧ */
    public final int f9454;

    /* JADX INFO: renamed from: ܽ */
    public final int f9455;

    /* JADX INFO: renamed from: ᩳ */
    public final short f9456;

    public C4263(short s, int i, int i2, int i3) {
        this.f9456 = s;
        this.f9454 = i;
        this.f9453 = i2;
        this.f9455 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8668(int i) throws IOException {
        short s = this.f9456;
        if (s != i) {
            throw new IOException(String.format("Invalid chunk type: expected=0x%04x, got=0x%04x, offset=0x%04x", Integer.valueOf(i), Short.valueOf(s), Integer.valueOf(this.f9455)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4263 m8665(C7972 c7972) {
        int iM18455 = c7972.m18455();
        if (c7972.m18451() < 8) {
            return new C4263((short) -1, 0, 0, iM18455);
        }
        return new C4263(c7972.m18460(), c7972.m18463(), c7972.m18461(), iM18455);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4263 m8667(C14677 c14677) {
        int iM33575 = c14677.m33575();
        if (c14677.available() < 8) {
            return new C4263((short) -1, 0, 0, iM33575);
        }
        return new C4263(c14677.readShort(), c14677.m33581(), c14677.readInt(), iM33575);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4263 m8666(C24618 c24618) {
        int iM54254 = c24618.m54254();
        if (c24618.length() - ((long) iM54254) < 8) {
            return new C4263((short) -1, 0, 0, iM54254);
        }
        return new C4263((short) c24618.mo23137(), c24618.mo23137(), c24618.readInt(), iM54254);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8669(C14677 c14677) {
        c14677.seek(this.f9455 + this.f9453);
    }
}
