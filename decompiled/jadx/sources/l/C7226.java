package l;

/* JADX INFO: renamed from: l.۟ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAPN */
/* JADX INFO: loaded from: classes3.dex */
public final class C7226 implements InterfaceC13303 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2015 f22123;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1309 f22124;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1309 f22125;

    public C7226(C2015 c2015, C1309 c1309, C1309 c13010) {
        this.f22123 = c2015;
        this.f22124 = c1309;
        this.f22125 = c13010;
    }

    @Override // l.InterfaceC13303
    public final void beforeStart() {
        this.f22123.f6725.beforeStart();
    }

    @Override // l.InterfaceC13303
    public final void onStart() {
        this.f22123.f6725.onStart();
    }

    @Override // l.InterfaceC13303
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo19329(String str) {
        return this.f22123.f6727.m41890(str, this.f22124.f4711.f17148, this.f22125.f4711.f17148);
    }

    @Override // l.InterfaceC13303
    public final void onFinish() {
        this.f22123.f6725.onFinish();
    }

    @Override // l.InterfaceC13303
    public final void afterFinish() {
        this.f22123.f6725.afterFinish();
    }

    @Override // l.InterfaceC13303
    public final boolean onError(Exception exc) {
        return this.f22123.f6725.onError(exc);
    }

    @Override // l.InterfaceC13303
    public final String getId() {
        StringBuilder sb = new StringBuilder();
        C2015 c2015 = this.f22123;
        sb.append(c2015.f6725.getClass());
        sb.append(":");
        sb.append(c2015.f6725.hashCode());
        sb.append(":");
        sb.append(this.f22124.f4711.f17148);
        sb.append(":");
        sb.append(this.f22125.f4711.f17148);
        return sb.toString();
    }
}
