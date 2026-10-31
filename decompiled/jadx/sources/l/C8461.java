package l;

/* JADX INFO: renamed from: l.۠᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes4.dex */
public final class C8461 extends AbstractC21867 {
    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        if (c19814 == c19815) {
            return false;
        }
        for (C19814 c19814M45583 = c19815.m45583(); c19814M45583 != null; c19814M45583 = c19814M45583.m45583()) {
            if (this.f70032.mo2753(c19814, c19814M45583)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", this.f70032);
    }
}
