package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ܽۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16538 extends AbstractC23946 {
    public C16538(C6307 c6307, int i, long j, long j2) {
        long j3;
        long j4;
        C11003.requireNonNull(c6307);
        int i2 = c6307.f19528;
        C7516 c7516 = new C7516(1, c6307);
        C10895 c10895 = new C10895(c6307, i);
        long jM17435 = c6307.m17435();
        long j5 = c6307.f19533;
        int i3 = c6307.f19535;
        if (i3 > 0) {
            j3 = (((long) i3) + ((long) i2)) / 2;
            j4 = 1;
        } else {
            int i4 = c6307.f19538;
            j3 = ((((i4 != c6307.f19536 || i4 <= 0) ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF : i4) * ((long) c6307.f19534)) * ((long) c6307.f19527)) / 8;
            j4 = 64;
        }
        super(c7516, c10895, jM17435, j5, j, j2, j3 + j4, Math.max(6, i2));
    }
}
