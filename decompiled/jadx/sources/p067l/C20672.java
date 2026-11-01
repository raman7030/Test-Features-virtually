package p067l;

/* JADX INFO: renamed from: l.᩵ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38SD */
/* JADX INFO: loaded from: classes4.dex */
public final class C20672 {

    /* JADX INFO: renamed from: ֫ */
    public final int f63856;

    /* JADX INFO: renamed from: ۧ */
    public String f63857;

    /* JADX INFO: renamed from: ܽ */
    public final String f63858;

    /* JADX INFO: renamed from: ܿ */
    public final int f63859;

    /* JADX INFO: renamed from: ᩳ */
    public int f63860;

    public C20672(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public C20672(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f63858 = str;
        this.f63856 = i2;
        this.f63859 = i3;
        this.f63860 = Integer.MIN_VALUE;
        this.f63857 = "";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46737() {
        int i = this.f63860;
        this.f63860 = i == Integer.MIN_VALUE ? this.f63856 : i + this.f63859;
        this.f63857 = this.f63858 + this.f63860;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m46738() {
        if (this.f63860 != Integer.MIN_VALUE) {
            return this.f63857;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m46739() {
        int i = this.f63860;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
}
