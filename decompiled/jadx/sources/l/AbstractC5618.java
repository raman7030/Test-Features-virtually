package l;

/* JADX INFO: renamed from: l.ۚ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5618 extends AbstractC21162 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17384;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f17385;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo15921(C19814 c19814);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract String mo15922();

    public AbstractC5618(int i, int i2) {
        this.f17384 = i;
        this.f17385 = i2;
    }

    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        C19814 c19814Mo28099 = c19815.mo28099();
        if (c19814Mo28099 == null || (c19814Mo28099 instanceof C0762)) {
            return false;
        }
        int iMo15921 = mo15921(c19815);
        int i = this.f17385;
        int i2 = this.f17384;
        if (i2 == 0) {
            return iMo15921 == i;
        }
        int i3 = iMo15921 - i;
        return i3 * i2 >= 0 && i3 % i2 == 0;
    }

    public String toString() {
        int i = this.f17385;
        int i2 = this.f17384;
        if (i2 == 0) {
            return String.format(":%s(%d)", mo15922(), Integer.valueOf(i));
        }
        return i == 0 ? String.format(":%s(%dn)", mo15922(), Integer.valueOf(i2)) : String.format(":%s(%dn%+d)", mo15922(), Integer.valueOf(i2), Integer.valueOf(i));
    }
}
