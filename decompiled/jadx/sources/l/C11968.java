package l;

/* JADX INFO: renamed from: l.ۨ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes4.dex */
public class C11968 extends AbstractC5618 {
    @Override // l.AbstractC5618
    /* JADX INFO: renamed from: ֫ */
    public final String mo15922() {
        return "nth-last-of-type";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC5618
    /* JADX INFO: renamed from: ֫ */
    public final int mo15921(C19814 c19814) {
        int i = 0;
        if (c19814.mo28099() == null) {
            return 0;
        }
        C2090 c2090M45579 = c19814.mo28099().m45579();
        for (int iM45569 = c19814.m45569(); iM45569 < c2090M45579.size(); iM45569++) {
            if (((C19814) c2090M45579.get(iM45569)).m45571().equals(c19814.m45571())) {
                i++;
            }
        }
        return i;
    }
}
