package l;

/* JADX INFO: renamed from: l.ᩳۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9FK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17985 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC16573 f56090;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f56091;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56092;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42026(C0097 c0097) {
        this.f56092 = c0097.m26099();
        this.f56090 = (EnumC16573) C15262.m36279(c0097.m26082(), EnumC16573.class, null);
        this.f56091 = c0097.m26073(((int) c0097.m26082()) / 2, C8208.f25225);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42025() {
        return this.f56092;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileNotifyInformation{action=");
        sb.append(this.f56090);
        sb.append(", fileName='");
        return C9045.m23341(sb, this.f56091, "'}");
    }
}
