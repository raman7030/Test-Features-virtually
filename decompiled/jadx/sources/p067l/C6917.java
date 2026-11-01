package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۙܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N98Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C6917 extends AbstractC10818 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC6227 f18014;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C5576 f18015;

    public C6917(C5576 c5576, InterfaceC6227 interfaceC6227) {
        this.f18015 = c5576;
        this.f18014 = interfaceC6227;
    }

    @Override // p067l.InterfaceC6227
    public final String getName() {
        return this.f18014.getName();
    }

    @Override // p067l.InterfaceC6227
    public final int getIndex() {
        return this.f18014.getIndex();
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC20980 mo14105() {
        return C23190.m51665(this.f18014.mo14105(), this.f18015.f13477);
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ܺ */
    public final String mo14104() {
        return this.f18014.mo14104();
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2873 mo14103() {
        return new C3743(this.f18015.f13477.m41469(), this.f18014.mo14103());
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ۢ */
    public final List mo14102() {
        return C9468.m21989(this.f18014.mo14102(), new C21670(this));
    }
}
