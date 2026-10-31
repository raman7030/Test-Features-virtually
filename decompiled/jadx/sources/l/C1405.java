package l;

/* JADX INFO: renamed from: l.֨᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes3.dex */
public final class C1405 extends AbstractC21867 {
    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        if (c19814 == c19815) {
            return false;
        }
        for (C19814 c19814Mo28099 = c19815.mo28099(); c19814Mo28099 != null; c19814Mo28099 = c19814Mo28099.mo28099()) {
            if (this.f70032.mo2753(c19814, c19814Mo28099)) {
                return true;
            }
            if (c19814Mo28099 == c19814) {
                return false;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ", this.f70032);
    }
}
