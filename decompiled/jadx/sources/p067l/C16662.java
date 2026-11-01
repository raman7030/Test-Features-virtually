package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ܶۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16662 {
    /* JADX INFO: renamed from: ֫ */
    public static C9958 m37738(long j, int i, int i2, int i3, long j2) {
        for (int i4 = 1; i4 <= 32768; i4 *= 2) {
            long jM15438 = (C6762.m15438(i, i2, i4) * ((long) i3)) + j;
            if (C6762.m15437(i, i4) <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX && C6762.m15437(i2, i4) <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX && jM15438 <= j2) {
                return new C9958(i4, jM15438);
            }
        }
        throw new C3409("Animation workspace exceeds allocation limit");
    }
}
