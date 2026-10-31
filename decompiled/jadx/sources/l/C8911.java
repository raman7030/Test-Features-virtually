package l;

/* JADX INFO: renamed from: l.ۡܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 950L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8911 implements InterfaceC18007 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15965 f27090;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27091;

    public C8911(C15965 c15965, int i) {
        this.f27090 = c15965;
        this.f27091 = i;
    }

    @Override // l.InterfaceC18007
    public final int getKey() {
        return this.f27090.f49274 + this.f27091;
    }

    @Override // l.InterfaceC18007
    /* JADX INFO: renamed from: ֫ */
    public final int mo12019() {
        C15965 c15965 = this.f27090;
        return c15965.f49273.f29163.m31418().mo11937((this.f27091 * 4) + c15965.f49273.f29164 + 8);
    }
}
