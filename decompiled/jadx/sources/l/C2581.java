package l;

/* JADX INFO: renamed from: l.ۖܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4NK */
/* JADX INFO: loaded from: classes2.dex */
public class C2581 extends RuntimeException {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC18809 f8167;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 f8168;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f8169;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8931 f8170;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC14574 f8171;

    public C2581(AbstractC18809 abstractC18809, InterfaceC14574 interfaceC14574, C8931 c8931) {
        this.f8169 = -1;
        this.f8167 = abstractC18809;
        this.f8171 = interfaceC14574;
        this.f8170 = c8931;
        if (abstractC18809 != null) {
            this.f8169 = abstractC18809.m43462();
        }
    }

    public C2581(String str, AbstractC9637 abstractC9637, InterfaceC14574 interfaceC14574, C8931 c8931) {
        super(str);
        this.f8169 = -1;
        this.f8167 = abstractC9637;
        this.f8171 = interfaceC14574;
        this.f8170 = c8931;
        if (abstractC9637 != null) {
            this.f8169 = abstractC9637.m43462();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8183(int i) {
        this.f8169 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23936 m8182() {
        AbstractC18809 abstractC18809 = this.f8167;
        if (abstractC18809 != null) {
            return abstractC18809.mo1330().m48893(this.f8169, this.f8170);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14574 m8185() {
        return this.f8171;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0463 m8186() {
        return this.f8168;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8184(InterfaceC0463 interfaceC0463) {
        this.f8168 = interfaceC0463;
    }
}
