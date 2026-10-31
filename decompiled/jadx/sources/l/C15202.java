package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9EA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15202 extends C16614 {
    @Override // l.C16614
    /* JADX INFO: renamed from: ۧ */
    public final void mo7050(C0097 c0097) throws C13146 {
        c0097.m26096(2);
        int iM26100 = c0097.m26100();
        int iM26099 = c0097.m26099();
        if (iM26100 > 0 && iM26099 > 0) {
            ArrayList arrayList = new ArrayList();
            c0097.m26097(((C23670) this.f2936).mo14552() + iM26100);
            while (true) {
                int iM26083 = c0097.m26083();
                C17985 c17985 = new C17985();
                c17985.m42026(c0097);
                arrayList.add(c17985);
                if (c17985.m42025() == 0) {
                    break;
                } else {
                    c0097.m26097(c17985.m42025() + iM26083);
                }
            }
        }
        c0097.m26097(((C23670) this.f2936).mo14552() + iM26100 + iM26099);
    }
}
