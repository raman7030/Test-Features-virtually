package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes.dex */
public final enum C25182 extends EnumC9089 {
    public /* synthetic */ C25182() {
        this(AbstractC18164.MATCH_INSTANCE_STR, 0);
    }

    @Override // p067l.EnumC9089, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public /* bridge */ /* synthetic */ boolean mo5158() {
        return true;
    }

    public C25182(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC9089, p067l.InterfaceC4079
    public int getLength() {
        this.f24642.getClass();
        return this.f24637.getLength() + 6 + this.f24641.getLength() + this.f24640.getLength() + this.f24639.getLength() + this.f24638.getLength();
    }

    @Override // p067l.EnumC9089, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        this.f24642.mo5157(interfaceC2756);
        this.f24637.mo5157(interfaceC2756);
        this.f24641.mo5157(interfaceC2756);
        this.f24640.mo5157(interfaceC2756);
        this.f24639.mo5157(interfaceC2756);
        this.f24638.mo5157(interfaceC2756);
    }
}
