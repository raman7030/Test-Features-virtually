package p067l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6SK */
/* JADX INFO: loaded from: classes2.dex */
public final class C6827 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f17730;

    /* JADX INFO: renamed from: ۜ */
    public final int f17731;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f17732;

    /* JADX INFO: renamed from: ۢ */
    public final float f17733;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f17734;

    /* JADX INFO: renamed from: ܳ */
    public final int f17735;

    /* JADX INFO: renamed from: ܺ */
    public final boolean f17736;

    /* JADX INFO: renamed from: ܽ */
    public final String f17737;

    /* JADX INFO: renamed from: ܿ */
    public final float f17738;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f17739;

    /* JADX INFO: renamed from: ᩷ */
    public final int f17740;

    /* JADX INFO: renamed from: ᩻ */
    public final String f17741;

    public C6827(float f, float f2, int i, int i2, int i3, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f17741 = str;
        this.f17740 = i;
        this.f17733 = f;
        this.f17735 = i2;
        this.f17738 = f2;
        this.f17739 = z;
        this.f17730 = z2;
        this.f17732 = z3;
        this.f17734 = z4;
        this.f17731 = i3;
        this.f17737 = str2;
        this.f17736 = z5;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6827 m15642(ByteArrayInputStream byteArrayInputStream, long j, int i) throws IOException {
        C25112 c25112M55102 = C25112.m55102(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy preferences exceed app state limit");
            }
            int i2 = c25112M55102.readInt();
            int i3 = (i2 < 388441878 || i2 > 388441883) ? 0 : i2;
            String strM55107 = i3 == 0 ? c25112M55102.m55107(i2, i) : c25112M55102.m55114(i);
            int i4 = c25112M55102.readByte();
            float fIntBitsToFloat = Float.intBitsToFloat(c25112M55102.readInt());
            int i5 = c25112M55102.readInt();
            boolean zM55109 = c25112M55102.m55109();
            boolean z = i3 >= 388441879 && c25112M55102.m55109();
            boolean zM551010 = c25112M55102.m55109();
            if (i3 >= 388441878) {
                c25112M55102.readInt();
            }
            int i6 = c25112M55102.readInt();
            String strM55111 = i3 >= 388441880 ? c25112M55102.m55111(i) : "";
            boolean z2 = i3 < 388441881 || c25112M55102.m55109();
            boolean z3 = i3 < 388441882 || c25112M55102.m55109();
            float fIntBitsToFloat2 = i3 >= 388441883 ? Float.intBitsToFloat(c25112M55102.readInt()) : 1.0f;
            if (i3 >= 388441883 && (fIntBitsToFloat2 < 0.8f || fIntBitsToFloat2 > 2.0f)) {
                throw new IOException("Invalid line spacing");
            }
            c25112M55102.m55115();
            C6827 c6827 = new C6827(fIntBitsToFloat, fIntBitsToFloat2, i4, i5, i6, strM55107, strM55111, zM55109, z, z3, zM551010, z2);
            c25112M55102.close();
            return c6827;
        } catch (Throwable th) {
            try {
                c25112M55102.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
