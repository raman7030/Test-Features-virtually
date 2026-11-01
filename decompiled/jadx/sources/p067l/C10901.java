package p067l;

/* JADX INFO: renamed from: l.ۡܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5JI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10901 extends C15673 {

    /* JADX INFO: renamed from: ۤ֡ */
    public C24982 f30212;

    public C10901(C14978 c14978) {
        super(c14978);
        this.f30212 = null;
    }

    /* JADX INFO: renamed from: ۘܽ */
    public final C16299 m25144() {
        return this.f30212;
    }

    @Override // p067l.AbstractC23696
    /* JADX INFO: renamed from: ֫ */
    public final void mo25143(C16299 c16299, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f59779.m34328());
        sb.append("[");
        sb.append(c16299.f47904);
        sb.append(",");
        String strM53357 = C24104.m53357(C5410.m11876(c16299.f47908, "]", sb), " ", mo12337(c16299, strArr));
        System.err.println(strM53357);
        if (this.f30212 == null) {
            this.f30212 = new C24982(strM53357, c16299);
        }
    }
}
