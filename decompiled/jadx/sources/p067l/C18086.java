package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ܽۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18086 extends AbstractC25127 {
    public C18086(C8363 c8363, int i, long j, long j2) {
        long j3;
        long j4;
        C12826.requireNonNull(c8363);
        int i2 = c8363.f22399;
        C9512 c9512 = new C9512(1, c8363);
        C12723 c12723 = new C12723(c8363, i);
        long jM19375 = c8363.m19375();
        long j5 = c8363.f22404;
        int i3 = c8363.f22406;
        if (i3 > 0) {
            j3 = (((long) i3) + ((long) i2)) / 2;
            j4 = 1;
        } else {
            int i4 = c8363.f22409;
            j3 = ((((i4 != c8363.f22407 || i4 <= 0) ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF : i4) * ((long) c8363.f22405)) * ((long) c8363.f22398)) / 8;
            j4 = 64;
        }
        super(c9512, c12723, jM19375, j5, j, j2, j3 + j4, Math.max(6, i2));
    }
}
