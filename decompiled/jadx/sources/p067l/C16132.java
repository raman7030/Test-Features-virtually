package p067l;

/* JADX INFO: renamed from: l.ܳۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16132 {

    /* JADX INFO: renamed from: ֫ */
    public int f47469;

    /* JADX INFO: renamed from: ۧ */
    public String f47470;

    /* JADX INFO: renamed from: ܳ */
    public String f47471;

    /* JADX INFO: renamed from: ܽ */
    public boolean f47472;

    /* JADX INFO: renamed from: ܿ */
    public int f47473;

    /* JADX INFO: renamed from: ᩳ */
    public String f47474;

    /* JADX INFO: renamed from: ᩻ */
    public String f47475;

    /* JADX INFO: renamed from: ᩳ */
    public final String m36722() {
        return this.f47474;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m36719() {
        return this.f47471;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m36720() {
        return this.f47470;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m36717() {
        if (this.f47475 == null) {
            return this.f47471;
        }
        return this.f47471 + " = " + this.f47475;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m36721() {
        return this.f47473;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m36718() {
        return this.f47469;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m36723() {
        return this.f47474 + ":" + this.f47471;
    }

    public final String toString() {
        String str = this.f47474 + ":" + this.f47471;
        if (this.f47475 == null) {
            return str;
        }
        StringBuilder sbM21133 = C9179.m21133(str, " = ");
        sbM21133.append(this.f47475);
        return sbM21133.toString();
    }
}
