package l;

/* JADX INFO: renamed from: l.᩺᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes.dex */
public class C23256 extends AbstractC5618 {
    @Override // l.AbstractC5618
    /* JADX INFO: renamed from: ֫ */
    public final String mo15922() {
        return "nth-of-type";
    }

    @Override // l.AbstractC5618
    /* JADX INFO: renamed from: ֫ */
    public final int mo15921(C19814 c19814) {
        int i = 0;
        if (c19814.mo28099() == null) {
            return 0;
        }
        for (C19814 c19815 : c19814.mo28099().m45579()) {
            if (c19815.m45571().equals(c19814.m45571())) {
                i++;
            }
            if (c19815 == c19814) {
                break;
            }
        }
        return i;
    }
}
