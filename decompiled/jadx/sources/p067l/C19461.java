package p067l;

/* JADX INFO: renamed from: l.ᩳۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9FK */
/* JADX INFO: loaded from: classes4.dex */
public final class C19461 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC18119 f59287;

    /* JADX INFO: renamed from: ۧ */
    public String f59288;

    /* JADX INFO: renamed from: ܽ */
    public int f59289;

    /* JADX INFO: renamed from: ֫ */
    public final void m44276(C2460 c2460) {
        this.f59289 = c2460.m28124();
        this.f59287 = (EnumC18119) C16873.m38440(c2460.m28107(), EnumC18119.class, null);
        this.f59288 = c2460.m28098(((int) c2460.m28107()) / 2, C10169.f28135);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44275() {
        return this.f59289;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileNotifyInformation{action=");
        sb.append(this.f59287);
        sb.append(", fileName='");
        return C10965.m25286(sb, this.f59288, "'}");
    }
}
