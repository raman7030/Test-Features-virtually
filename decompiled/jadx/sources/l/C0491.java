package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.֡ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0491 extends AbstractC1197 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22364 f2115;

    public C0491(C22364 c22364) {
        this.f2115 = c22364;
    }

    @Override // l.AbstractC1197
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2165(C16719 c16719) {
        C22364 c22364 = this.f2115;
        HashSet hashSet = c22364.f72462;
        if (hashSet != null) {
            hashSet.remove(c16719.mo29298());
        }
        int i = C19543.f63196[c16719.m39353().ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i != 2) {
            if (i == 3) {
                if (c22364.f72458 || c16719.m39347()) {
                    if (c22364.f72451 < c22364.f72463) {
                        c22364.m50121(c16719);
                        c22364.f72451++;
                    } else {
                        c22364.f72466++;
                    }
                }
            } else if (i == 4 && (c16719.m39346(EnumC20043.API) || C22364.m50105(c22364, c16719))) {
                if (c22364.f72454 < c22364.f72464) {
                    c22364.m50121(c16719);
                    c22364.f72454++;
                } else {
                    c22364.f72465++;
                }
            }
        } else if ((c22364.f72458 || c16719.m39347()) && !c22364.f72461) {
            c22364.m50121(c16719);
        }
        if (c16719.m39346(EnumC20043.COMPRESSED)) {
            c22364.f72460 = true;
        }
    }
}
