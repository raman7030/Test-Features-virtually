package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes.dex */
public final enum C24004 extends EnumC7071 {
    public /* synthetic */ C24004() {
        this(AbstractC16620.MATCH_INSTANCE_STR, 0);
    }

    @Override // l.EnumC7071, l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public /* bridge */ /* synthetic */ boolean mo2829() {
        return true;
    }

    public C24004(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC7071, l.InterfaceC1800
    public int getLength() {
        this.f21761.getClass();
        return this.f21756.getLength() + 6 + this.f21760.getLength() + this.f21759.getLength() + this.f21758.getLength() + this.f21757.getLength();
    }

    @Override // l.EnumC7071, l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        this.f21761.mo2828(interfaceC0408);
        this.f21756.mo2828(interfaceC0408);
        this.f21760.mo2828(interfaceC0408);
        this.f21759.mo2828(interfaceC0408);
        this.f21758.mo2828(interfaceC0408);
        this.f21757.mo2828(interfaceC0408);
    }
}
