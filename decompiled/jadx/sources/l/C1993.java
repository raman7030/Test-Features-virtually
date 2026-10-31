package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T19G */
/* JADX INFO: loaded from: classes2.dex */
public final class C1993 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f6673;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f6674;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f6675;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short f6676;

    public C1993(short s, int i, int i2, int i3) {
        this.f6676 = s;
        this.f6674 = i;
        this.f6673 = i2;
        this.f6675 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6526(int i) throws IOException {
        short s = this.f6676;
        if (s != i) {
            throw new IOException(String.format("Invalid chunk type: expected=0x%04x, got=0x%04x, offset=0x%04x", Integer.valueOf(i), Short.valueOf(s), Integer.valueOf(this.f6675)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1993 m6523(C5896 c5896) {
        int iM16529 = c5896.m16529();
        if (c5896.m16525() < 8) {
            return new C1993((short) -1, 0, 0, iM16529);
        }
        return new C1993(c5896.m16534(), c5896.m16537(), c5896.m16535(), iM16529);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1993 m6525(C12951 c12951) {
        int iM31488 = c12951.m31488();
        if (c12951.available() < 8) {
            return new C1993((short) -1, 0, 0, iM31488);
        }
        return new C1993(c12951.readShort(), c12951.m31494(), c12951.readInt(), iM31488);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1993 m6524(C23411 c23411) {
        int iM51856 = c23411.m51856();
        if (c23411.length() - ((long) iM51856) < 8) {
            return new C1993((short) -1, 0, 0, iM51856);
        }
        return new C1993((short) c23411.mo21172(), c23411.mo21172(), c23411.readInt(), iM51856);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6527(C12951 c12951) {
        c12951.seek(this.f6675 + this.f6673);
    }
}
