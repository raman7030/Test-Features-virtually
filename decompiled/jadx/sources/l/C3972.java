package l;

/* JADX INFO: renamed from: l.ۘܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 951O */
/* JADX INFO: loaded from: classes3.dex */
public final class C3972 implements InterfaceC18007 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18789 f12607;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12608;

    public C3972(C18789 c18789, int i) {
        this.f12607 = c18789;
        this.f12608 = i;
    }

    @Override // l.InterfaceC18007
    public final int getKey() {
        C18789 c18789 = this.f12607;
        return c18789.f59305.f29163.m31418().mo11937((this.f12608 * 4) + c18789.f59305.f29164 + 4);
    }

    @Override // l.InterfaceC18007
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo12019() {
        C19495 c19495 = this.f12607.f59305;
        return c19495.f29163.m31418().mo11937((this.f12608 * 4) + (c19495.f62994 * 4) + c19495.f29164 + 4);
    }
}
