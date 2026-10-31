package l;

/* JADX INFO: renamed from: l.ۡܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5JI */
/* JADX INFO: loaded from: classes4.dex */
public final class C8978 extends C13999 {

    /* JADX INFO: renamed from: ۤ֡, reason: not valid java name and contains not printable characters */
    public C23794 f27277;

    public C8978(C13268 c13268) {
        super(c13268);
        this.f27277 = null;
    }

    /* JADX INFO: renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public final C14658 m23200() {
        return this.f27277;
    }

    @Override // l.AbstractC22441
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23199(C14658 c14658, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56566.m32229());
        sb.append("[");
        sb.append(c14658.f44794);
        sb.append(",");
        String strM50967 = C22870.m50967(C3200.m9831(c14658.f44798, "]", sb), " ", mo10300(c14658, strArr));
        System.err.println(strM50967);
        if (this.f27277 == null) {
            this.f27277 = new C23794(strM50967, c14658);
        }
    }
}
