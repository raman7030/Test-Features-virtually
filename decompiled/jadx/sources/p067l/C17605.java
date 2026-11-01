package p067l;

/* JADX INFO: renamed from: l.ܺܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 956A */
/* JADX INFO: loaded from: classes5.dex */
public final class C17605 extends C6307 {

    /* JADX INFO: renamed from: ᩹ܺ */
    public C24982 f52616;

    public C17605(C20995 c20995) {
        super(c20995);
        this.f52616 = null;
    }

    /* JADX INFO: renamed from: ᩵ܽ */
    public final C16299 m40087() {
        return this.f52616;
    }

    @Override // p067l.AbstractC23696
    /* JADX INFO: renamed from: ֫ */
    public final void mo25143(C16299 c16299, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(m12338());
        sb.append("[");
        sb.append(c16299.f47904);
        sb.append(",");
        String strM53357 = C24104.m53357(C5410.m11876(c16299.f47908, "]", sb), " ", mo12337(c16299, strArr));
        System.err.println(strM53357);
        if (this.f52616 == null) {
            this.f52616 = new C24982(strM53357, c16299);
        }
    }
}
