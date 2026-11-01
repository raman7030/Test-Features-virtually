package p067l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16QU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5154 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f12114;

    /* JADX INFO: renamed from: ۖ */
    public final int f12115;

    /* JADX INFO: renamed from: ۜ */
    public final int f12116;

    /* JADX INFO: renamed from: ۡ */
    public final int f12117;

    /* JADX INFO: renamed from: ۢ */
    public final int f12118;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f12119;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f12120;

    /* JADX INFO: renamed from: ܺ */
    public final boolean f12121;

    /* JADX INFO: renamed from: ܽ */
    public final C14873 f12122;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f12123;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f12124;

    /* JADX INFO: renamed from: ᩷ */
    public final int f12125;

    /* JADX INFO: renamed from: ᩻ */
    public final int f12126;

    public C5154(int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5, byte[] bArr, byte[] bArr2, byte[] bArr3, int i6) throws IOException {
        if (i6 < 0 || (i6 & (-32)) != 0) {
            throw new IOException("Invalid session view field mask");
        }
        this.f12126 = i6;
        if (i3 < 0 || i3 > 255 || i4 < -1 || i5 < -1) {
            throw new IOException("Invalid session view coordinates or wrap mode");
        }
        this.f12118 = i;
        this.f12117 = i2;
        this.f12115 = i3;
        this.f12121 = z;
        this.f12114 = z2;
        this.f12120 = z3;
        this.f12125 = i4;
        this.f12116 = i5;
        int i7 = i6 & 2;
        this.f12122 = i7 != 0 ? C14873.m33977(new ByteArrayInputStream(bArr), bArr.length, bArr.length) : null;
        if (i7 == 0 && bArr.length != 0) {
            throw new IOException("Unexpected session text config");
        }
        if ((i6 & 8) != 0) {
            m11006(bArr2);
        } else if (bArr2.length != 0) {
            throw new IOException("Unexpected backward navigation stack");
        }
        if ((i6 & 16) != 0) {
            m11006(bArr3);
        } else if (bArr3.length != 0) {
            throw new IOException("Unexpected forward navigation stack");
        }
        this.f12124 = bArr;
        this.f12119 = bArr2;
        this.f12123 = bArr3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5154 m11003(int i, int i2, int i3, boolean z, boolean z2, boolean z3, C23929 c23929, C23416 c23416, C23416 c23417) {
        C11996 c11996 = new C11996();
        c23929.m53012(c11996);
        C11996 c11997 = new C11996();
        c23416.m52091(c11997);
        C11996 c11998 = new C11996();
        c23417.m52091(c11998);
        return new C5154(i, i2, i3, z, z2, z3, c23929.f75975, c23929.f75954, c11996.m27464(), c11997.m27464(), c11998.m27464(), 31);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5154 m11005(C8168 c8168) {
        int i = (c8168.f21555 ? 1 : 0) | (c8168.f21561 != null ? 2 : 0);
        boolean z = c8168.f21566;
        int i2 = i | (z ? 4 : 0) | (c8168.f21558 != null ? 8 : 0) | (c8168.f21559 != null ? 16 : 0);
        int i3 = c8168.f21564;
        int i4 = c8168.f21565;
        int i5 = c8168.f21554;
        boolean z2 = c8168.f21550;
        boolean z3 = c8168.f21551;
        boolean z4 = c8168.f21557;
        int i6 = z ? c8168.f21552 : -1;
        int i7 = z ? c8168.f21560 : -1;
        byte[] bArr = c8168.f21562;
        return new C5154(i3, i4, i5, z2, z3, z4, i6, i7, bArr == null ? new byte[0] : (byte[]) bArr.clone(), m11007(c8168.f21558), m11007(c8168.f21559), i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m11011(String str) {
        return (this.f12126 & 2) == 0 ? str : new C14677(this.f12124).m33591();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5154 m11017(String str) {
        if ((this.f12126 & 2) == 0) {
            return this;
        }
        byte[] bArr = this.f12124;
        C14677 c14677 = new C14677(bArr);
        c14677.m33591();
        C11996 c11996 = new C11996(bArr.length + 8);
        c11996.m27443((CharSequence) str);
        int iAvailable = (int) c14677.available();
        byte[] bArr2 = new byte[iAvailable];
        c14677.m33576(iAvailable, bArr2);
        c11996.write(bArr2, 0, iAvailable);
        return new C5154(this.f12118, this.f12117, this.f12115, this.f12121, this.f12114, this.f12120, this.f12125, this.f12116, c11996.m27464(), this.f12119, this.f12123, this.f12126);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5154 m11014(C5154 c5154) throws IOException {
        if ((c5154.f12126 & 3) != 3) {
            throw new IOException("Page switch requires captured current view settings");
        }
        int iMin = this.f12117;
        C14873 c14873 = this.f12122;
        if (c14873 != null) {
            float f = c14873.f42384;
            if (f > 0.0f) {
                float f2 = c5154.f12122.f42384;
                if (f2 > 0.0f) {
                    iMin = (int) Math.min(2147483647L, Math.round((((double) iMin) / ((double) f)) * ((double) f2)));
                }
            }
        }
        int i = c5154.f12115;
        boolean z = c5154.f12121;
        boolean z2 = c5154.f12114;
        boolean z3 = c5154.f12120;
        byte[] bArr = c5154.f12124;
        int i2 = this.f12126 | 3;
        return new C5154(this.f12118, iMin, i, z, z2, z3, this.f12125, this.f12116, bArr, this.f12119, this.f12123, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5154 m11013(int i, int i2, String str) throws IOException {
        int i3 = this.f12126;
        int i4 = i3 & 2;
        if (i4 == 0) {
            throw new IOException("Reload requires a captured current view config");
        }
        byte[] bArrM27464 = this.f12124;
        if (i4 != 0) {
            C14677 c14677 = new C14677(bArrM27464);
            c14677.m33591();
            C11996 c11996 = new C11996(bArrM27464.length + 8);
            c11996.m27443((CharSequence) str);
            byte[] bArr = new byte[11];
            c14677.m33576(11, bArr);
            c11996.write(bArr, 0, 11);
            c14677.m33585();
            c11996.writeByte(0);
            int iAvailable = (int) c14677.available();
            byte[] bArr2 = new byte[iAvailable];
            c14677.m33576(iAvailable, bArr2);
            c11996.write(bArr2, 0, iAvailable);
            bArrM27464 = c11996.m27464();
        }
        return new C5154(i, i2, this.f12115, this.f12121, this.f12114, this.f12120, -1, -1, bArrM27464, this.f12119, this.f12123, i3 | 5);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m11007(ArrayList arrayList) {
        if (arrayList == null) {
            return new byte[0];
        }
        C11996 c11996 = new C11996((arrayList.size() * 8) + 6);
        c11996.writeInt(-1568513661);
        c11996.mo15113(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C22746 c22746 = (C22746) it.next();
            c11996.writeInt(c22746.f71724);
            c11996.writeInt(c22746.f71723);
        }
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m11018() {
        return (this.f12126 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m11019() {
        return (this.f12126 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5154 m11012(int i, int i2) {
        if (this.f12121 || i <= i2) {
            return this;
        }
        return new C5154(this.f12118, this.f12117, this.f12115, true, this.f12114, this.f12120, this.f12125, this.f12116, this.f12124, this.f12119, this.f12123, this.f12126);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5154 m11004(int i, byte[] bArr) throws IOException {
        if (i < 0 || bArr.length > i || bArr.length < 47) {
            throw new IOException("Invalid session view state length");
        }
        try {
            C14677 c14677 = new C14677(bArr);
            if (c14677.readInt() != 844519237) {
                throw new IOException("Unsupported session view state");
            }
            int i2 = c14677.readInt();
            if (i2 != 1 && i2 != 2) {
                throw new IOException("Unsupported session view state");
            }
            int i3 = i2 == 2 ? c14677.readInt() : 31;
            int i4 = c14677.readInt();
            int i5 = c14677.readInt();
            int i6 = c14677.readInt();
            boolean zM11009 = m11009(c14677);
            boolean zM110010 = m11009(c14677);
            boolean zM110011 = m11009(c14677);
            int i7 = c14677.readInt();
            int i8 = c14677.readInt();
            byte[] bArrM11008 = m11008(c14677);
            byte[] bArrM11009 = m11008(c14677);
            byte[] bArrM110010 = m11008(c14677);
            if (c14677.available() != 4 || c14677.readInt() != 844519237) {
                throw new IOException("Trailing or truncated session view state");
            }
            return new C5154(i4, i5, i6, zM11009, zM110010, zM110011, i7, i8, bArrM11008, bArrM11009, bArrM110010, i3);
        } catch (IndexOutOfBoundsException e) {
            throw new IOException("Truncated session view state", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11015(C11996 c11996) {
        c11996.writeInt(844519237);
        int i = this.f12126;
        c11996.writeInt(i == 31 ? 1 : 2);
        if (i != 31) {
            c11996.writeInt(i);
        }
        c11996.writeInt(this.f12118);
        c11996.writeInt(this.f12117);
        c11996.writeInt(this.f12115);
        c11996.m27445(this.f12121);
        c11996.m27445(this.f12114);
        c11996.m27445(this.f12120);
        c11996.writeInt(this.f12125);
        c11996.writeInt(this.f12116);
        c11996.m27454(this.f12124);
        c11996.m27454(this.f12119);
        c11996.m27454(this.f12123);
        c11996.writeInt(844519237);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m11010() {
        return (this.f12126 == 31 ? 47L : 51L) + ((long) this.f12124.length) + ((long) this.f12119.length) + ((long) this.f12123.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11016(C23416 c23416, C23416 c23417) {
        int i = this.f12126;
        if ((i & 8) != 0) {
            c23416.m52092(new C14677(this.f12119));
        }
        if ((i & 16) != 0) {
            c23417.m52092(new C14677(this.f12123));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m11008(C14677 c14677) throws IOException {
        if (c14677.available() < 4) {
            throw new IOException("Missing session view field");
        }
        int i = c14677.readInt();
        if (i < 0 || i > c14677.available()) {
            throw new IOException("Invalid session view field length");
        }
        byte[] bArr = new byte[i];
        c14677.m33576(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m11009(C14677 c14677) throws IOException {
        int i = c14677.readByte() & 255;
        if (i == 0 || i == 255) {
            return i != 0;
        }
        throw new IOException("Invalid session view flag");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11006(byte[] bArr) throws IOException {
        if (bArr.length < 6) {
            throw new IOException("Truncated session navigation stack");
        }
        C14677 c14677 = new C14677(bArr);
        if (c14677.readInt() != -1568513661 || ((long) c14677.m33581()) * 8 != c14677.available()) {
            throw new IOException("Invalid session navigation stack");
        }
    }
}
