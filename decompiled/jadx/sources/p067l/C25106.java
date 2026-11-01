package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.᩻᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1TX */
/* JADX INFO: loaded from: classes.dex */
public final class C25106 {

    /* JADX INFO: renamed from: ֫ */
    public static final long f80348 = m55094(256, 257, 0);

    /* JADX INFO: renamed from: ֫ */
    public static int m55093(long j) {
        long j2 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j;
        long j3 = j >>> 16;
        return j2 == 0 ? (int) (j3 & 511) : (-16777216) | ((int) (j3 & 16777215));
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m55094(int i, int i2, int i3) {
        long j = i;
        return ((i2 & (-16777216)) == -16777216 ? ((((long) i2) & 16777215) << 16) | ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS : (((long) i2) & 511) << 16) | ((long) (i3 & SecP521R1Field.P16)) | ((i & (-16777216)) == -16777216 ? ((j & 16777215) << 40) | 512 : (j & 511) << 40);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m55095(long j) {
        long j2 = 512 & j;
        long j3 = j >>> 40;
        return j2 == 0 ? (int) (j3 & 511) : (-16777216) | ((int) (j3 & 16777215));
    }
}
