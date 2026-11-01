package p067l;

/* JADX INFO: renamed from: l.ܺᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8CT */
/* JADX INFO: loaded from: classes4.dex */
public class C17684 extends C23050 {

    /* JADX INFO: renamed from: ܽ */
    public C8968[] f52824;

    public C17684(int i, String str, double d) {
        super(str);
        mo23925(i, d);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo23925(int i, double d) {
        this.f52824 = new C8968[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f52824[i2] = new C8968(this, d);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final double[] m40212() {
        return this.f52824[0].mo20721();
    }

    /* JADX INFO: renamed from: ֫ */
    public final double[] m40211(int i) {
        return this.f52824[i].mo20721();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m40213() {
        this.f52824[0].m20715();
    }
}
