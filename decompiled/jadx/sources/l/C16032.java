package l;

/* JADX INFO: renamed from: l.ܺܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 956A */
/* JADX INFO: loaded from: classes5.dex */
public final class C16032 extends C4144 {

    /* JADX INFO: renamed from: ᩹ܺ, reason: not valid java name and contains not printable characters */
    public C23794 f49452;

    public C16032(C19599 c19599) {
        super(c19599);
        this.f49452 = null;
    }

    /* JADX INFO: renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public final C14658 m37900() {
        return this.f49452;
    }

    @Override // l.AbstractC22441
    /* JADX INFO: renamed from: ֫ */
    public final void mo23199(C14658 c14658, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(m10301());
        sb.append("[");
        sb.append(c14658.f44794);
        sb.append(",");
        String strM50967 = C22870.m50967(C3200.m9831(c14658.f44798, "]", sb), " ", mo10300(c14658, strArr));
        System.err.println(strM50967);
        if (this.f49452 == null) {
            this.f49452 = new C23794(strM50967, c14658);
        }
    }
}
