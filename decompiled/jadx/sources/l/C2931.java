package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16QU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2931 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f9315;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f9316;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f9317;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f9318;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f9319;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f9320;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f9321;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f9322;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13157 f9323;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f9324;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f9325;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f9326;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f9327;

    public C2931(int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5, byte[] bArr, byte[] bArr2, byte[] bArr3, int i6) throws IOException {
        if (i6 < 0 || (i6 & (-32)) != 0) {
            throw new IOException("Invalid session view field mask");
        }
        this.f9327 = i6;
        if (i3 < 0 || i3 > 255 || i4 < -1 || i5 < -1) {
            throw new IOException("Invalid session view coordinates or wrap mode");
        }
        this.f9319 = i;
        this.f9318 = i2;
        this.f9316 = i3;
        this.f9322 = z;
        this.f9315 = z2;
        this.f9321 = z3;
        this.f9326 = i4;
        this.f9317 = i5;
        int i7 = i6 & 2;
        this.f9323 = i7 != 0 ? C13157.m31884(new ByteArrayInputStream(bArr), bArr.length, bArr.length) : null;
        if (i7 == 0 && bArr.length != 0) {
            throw new IOException("Unexpected session text config");
        }
        if ((i6 & 8) != 0) {
            m8938(bArr2);
        } else if (bArr2.length != 0) {
            throw new IOException("Unexpected backward navigation stack");
        }
        if ((i6 & 16) != 0) {
            m8938(bArr3);
        } else if (bArr3.length != 0) {
            throw new IOException("Unexpected forward navigation stack");
        }
        this.f9325 = bArr;
        this.f9320 = bArr2;
        this.f9324 = bArr3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2931 m8935(int i, int i2, int i3, boolean z, boolean z2, boolean z3, C22686 c22686, C22146 c22146, C22146 c22147) {
        C10130 c10130 = new C10130();
        c22686.m50686(c10130);
        C10130 c10131 = new C10130();
        c22146.m49753(c10131);
        C10130 c10132 = new C10130();
        c22147.m49753(c10132);
        return new C2931(i, i2, i3, z, z2, z3, c22686.f73250, c22686.f73229, c10130.m25444(), c10131.m25444(), c10132.m25444(), 31);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2931 m8937(C6102 c6102) {
        int i = (c6102.f18700 ? 1 : 0) | (c6102.f18706 != null ? 2 : 0);
        boolean z = c6102.f18711;
        int i2 = i | (z ? 4 : 0) | (c6102.f18703 != null ? 8 : 0) | (c6102.f18704 != null ? 16 : 0);
        int i3 = c6102.f18709;
        int i4 = c6102.f18710;
        int i5 = c6102.f18699;
        boolean z2 = c6102.f18695;
        boolean z3 = c6102.f18696;
        boolean z4 = c6102.f18702;
        int i6 = z ? c6102.f18697 : -1;
        int i7 = z ? c6102.f18705 : -1;
        byte[] bArr = c6102.f18707;
        return new C2931(i3, i4, i5, z2, z3, z4, i6, i7, bArr == null ? new byte[0] : (byte[]) bArr.clone(), m8939(c6102.f18703), m8939(c6102.f18704), i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m8943(String str) {
        return (this.f9327 & 2) == 0 ? str : new C12951(this.f9325).m31504();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2931 m8949(String str) {
        if ((this.f9327 & 2) == 0) {
            return this;
        }
        byte[] bArr = this.f9325;
        C12951 c12951 = new C12951(bArr);
        c12951.m31504();
        C10130 c10130 = new C10130(bArr.length + 8);
        c10130.m25423((CharSequence) str);
        int iAvailable = (int) c12951.available();
        byte[] bArr2 = new byte[iAvailable];
        c12951.m31489(iAvailable, bArr2);
        c10130.write(bArr2, 0, iAvailable);
        return new C2931(this.f9319, this.f9318, this.f9316, this.f9322, this.f9315, this.f9321, this.f9326, this.f9317, c10130.m25444(), this.f9320, this.f9324, this.f9327);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2931 m8946(C2931 c2931) throws IOException {
        if ((c2931.f9327 & 3) != 3) {
            throw new IOException("Page switch requires captured current view settings");
        }
        int iMin = this.f9318;
        C13157 c13157 = this.f9323;
        if (c13157 != null) {
            float f = c13157.f39329;
            if (f > 0.0f) {
                float f2 = c2931.f9323.f39329;
                if (f2 > 0.0f) {
                    iMin = (int) Math.min(2147483647L, Math.round((((double) iMin) / ((double) f)) * ((double) f2)));
                }
            }
        }
        int i = c2931.f9316;
        boolean z = c2931.f9322;
        boolean z2 = c2931.f9315;
        boolean z3 = c2931.f9321;
        byte[] bArr = c2931.f9325;
        int i2 = this.f9327 | 3;
        return new C2931(this.f9319, iMin, i, z, z2, z3, this.f9326, this.f9317, bArr, this.f9320, this.f9324, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2931 m8945(int i, int i2, String str) throws IOException {
        int i3 = this.f9327;
        int i4 = i3 & 2;
        if (i4 == 0) {
            throw new IOException("Reload requires a captured current view config");
        }
        byte[] bArrM25444 = this.f9325;
        if (i4 != 0) {
            C12951 c12951 = new C12951(bArrM25444);
            c12951.m31504();
            C10130 c10130 = new C10130(bArrM25444.length + 8);
            c10130.m25423((CharSequence) str);
            byte[] bArr = new byte[11];
            c12951.m31489(11, bArr);
            c10130.write(bArr, 0, 11);
            c12951.m31498();
            c10130.writeByte(0);
            int iAvailable = (int) c12951.available();
            byte[] bArr2 = new byte[iAvailable];
            c12951.m31489(iAvailable, bArr2);
            c10130.write(bArr2, 0, iAvailable);
            bArrM25444 = c10130.m25444();
        }
        return new C2931(i, i2, this.f9316, this.f9322, this.f9315, this.f9321, -1, -1, bArrM25444, this.f9320, this.f9324, i3 | 5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m8939(ArrayList arrayList) {
        if (arrayList == null) {
            return new byte[0];
        }
        C10130 c10130 = new C10130((arrayList.size() * 8) + 6);
        c10130.writeInt(-1568513661);
        c10130.mo13231(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C21441 c21441 = (C21441) it.next();
            c10130.writeInt(c21441.f69027);
            c10130.writeInt(c21441.f69026);
        }
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m8950() {
        return (this.f9327 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m8951() {
        return (this.f9327 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2931 m8944(int i, int i2) {
        if (this.f9322 || i <= i2) {
            return this;
        }
        return new C2931(this.f9319, this.f9318, this.f9316, true, this.f9315, this.f9321, this.f9326, this.f9317, this.f9325, this.f9320, this.f9324, this.f9327);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2931 m8936(int i, byte[] bArr) throws IOException {
        if (i < 0 || bArr.length > i || bArr.length < 47) {
            throw new IOException("Invalid session view state length");
        }
        try {
            C12951 c12951 = new C12951(bArr);
            if (c12951.readInt() != 844519237) {
                throw new IOException("Unsupported session view state");
            }
            int i2 = c12951.readInt();
            if (i2 != 1 && i2 != 2) {
                throw new IOException("Unsupported session view state");
            }
            int i3 = i2 == 2 ? c12951.readInt() : 31;
            int i4 = c12951.readInt();
            int i5 = c12951.readInt();
            int i6 = c12951.readInt();
            boolean zM8941 = m8941(c12951);
            boolean zM8942 = m8941(c12951);
            boolean zM8943 = m8941(c12951);
            int i7 = c12951.readInt();
            int i8 = c12951.readInt();
            byte[] bArrM8940 = m8940(c12951);
            byte[] bArrM8941 = m8940(c12951);
            byte[] bArrM8942 = m8940(c12951);
            if (c12951.available() != 4 || c12951.readInt() != 844519237) {
                throw new IOException("Trailing or truncated session view state");
            }
            return new C2931(i4, i5, i6, zM8941, zM8942, zM8943, i7, i8, bArrM8940, bArrM8941, bArrM8942, i3);
        } catch (IndexOutOfBoundsException e) {
            throw new IOException("Truncated session view state", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8947(C10130 c10130) {
        c10130.writeInt(844519237);
        int i = this.f9327;
        c10130.writeInt(i == 31 ? 1 : 2);
        if (i != 31) {
            c10130.writeInt(i);
        }
        c10130.writeInt(this.f9319);
        c10130.writeInt(this.f9318);
        c10130.writeInt(this.f9316);
        c10130.m25425(this.f9322);
        c10130.m25425(this.f9315);
        c10130.m25425(this.f9321);
        c10130.writeInt(this.f9326);
        c10130.writeInt(this.f9317);
        c10130.m25434(this.f9325);
        c10130.m25434(this.f9320);
        c10130.m25434(this.f9324);
        c10130.writeInt(844519237);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m8942() {
        return (this.f9327 == 31 ? 47L : 51L) + ((long) this.f9325.length) + ((long) this.f9320.length) + ((long) this.f9324.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8948(C22146 c22146, C22146 c22147) {
        int i = this.f9327;
        if ((i & 8) != 0) {
            c22146.m49754(new C12951(this.f9320));
        }
        if ((i & 16) != 0) {
            c22147.m49754(new C12951(this.f9324));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m8940(C12951 c12951) throws IOException {
        if (c12951.available() < 4) {
            throw new IOException("Missing session view field");
        }
        int i = c12951.readInt();
        if (i < 0 || i > c12951.available()) {
            throw new IOException("Invalid session view field length");
        }
        byte[] bArr = new byte[i];
        c12951.m31489(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8941(C12951 c12951) throws IOException {
        int i = c12951.readByte() & 255;
        if (i == 0 || i == 255) {
            return i != 0;
        }
        throw new IOException("Invalid session view flag");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8938(byte[] bArr) throws IOException {
        if (bArr.length < 6) {
            throw new IOException("Truncated session navigation stack");
        }
        C12951 c12951 = new C12951(bArr);
        if (c12951.readInt() != -1568513661 || ((long) c12951.m31494()) * 8 != c12951.available()) {
            throw new IOException("Invalid session navigation stack");
        }
    }
}
