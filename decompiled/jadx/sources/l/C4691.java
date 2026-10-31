package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6SK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4691 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f14901;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f14902;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f14903;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float f14904;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f14905;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f14906;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f14907;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f14908;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f14909;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f14910;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f14911;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f14912;

    public C4691(float f, float f2, int i, int i2, int i3, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f14912 = str;
        this.f14911 = i;
        this.f14904 = f;
        this.f14906 = i2;
        this.f14909 = f2;
        this.f14910 = z;
        this.f14901 = z2;
        this.f14903 = z3;
        this.f14905 = z4;
        this.f14902 = i3;
        this.f14908 = str2;
        this.f14907 = z5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4691 m13767(ByteArrayInputStream byteArrayInputStream, long j, int i) throws IOException {
        C23930 c23930M52696 = C23930.m52696(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy preferences exceed app state limit");
            }
            int i2 = c23930M52696.readInt();
            int i3 = (i2 < 388441878 || i2 > 388441883) ? 0 : i2;
            String strM52701 = i3 == 0 ? c23930M52696.m52701(i2, i) : c23930M52696.m52708(i);
            int i4 = c23930M52696.readByte();
            float fIntBitsToFloat = Float.intBitsToFloat(c23930M52696.readInt());
            int i5 = c23930M52696.readInt();
            boolean zM52703 = c23930M52696.m52703();
            boolean z = i3 >= 388441879 && c23930M52696.m52703();
            boolean zM52704 = c23930M52696.m52703();
            if (i3 >= 388441878) {
                c23930M52696.readInt();
            }
            int i6 = c23930M52696.readInt();
            String strM52705 = i3 >= 388441880 ? c23930M52696.m52705(i) : "";
            boolean z2 = i3 < 388441881 || c23930M52696.m52703();
            boolean z3 = i3 < 388441882 || c23930M52696.m52703();
            float fIntBitsToFloat2 = i3 >= 388441883 ? Float.intBitsToFloat(c23930M52696.readInt()) : 1.0f;
            if (i3 >= 388441883 && (fIntBitsToFloat2 < 0.8f || fIntBitsToFloat2 > 2.0f)) {
                throw new IOException("Invalid line spacing");
            }
            c23930M52696.m52709();
            C4691 c4691 = new C4691(fIntBitsToFloat, fIntBitsToFloat2, i4, i5, i6, strM52701, strM52705, zM52703, z, z3, zM52704, z2);
            c23930M52696.close();
            return c4691;
        } catch (Throwable th) {
            try {
                c23930M52696.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
