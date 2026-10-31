package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ᩴܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2S6 */
/* JADX INFO: loaded from: classes5.dex */
public class C18814 extends AbstractC15945 implements InterfaceC3627 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC3627 f59365;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19520 f59366;

    public C18814(C19520 c19520, InterfaceC3627 interfaceC3627) {
        this.f59366 = c19520;
        this.f59365 = interfaceC3627;
    }

    @Override // l.InterfaceC18877
    /* JADX INFO: renamed from: ܳ */
    public final String mo8192() {
        return ((InterfaceC18877) this.f59366.f63087.m39237().mo4329(this.f59365)).mo8192();
    }

    @Override // l.InterfaceC18877
    public final String getName() {
        return ((InterfaceC18877) this.f59366.f63087.m39237().mo4329(this.f59365)).getName();
    }

    @Override // l.InterfaceC18877
    public final String getType() {
        return ((InterfaceC18877) this.f59366.f63087.m39237().mo4329(this.f59365)).getType();
    }

    @Override // l.InterfaceC3627
    /* JADX INFO: renamed from: ܽ */
    public final int mo11110() {
        return this.f59365.mo11110();
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public InterfaceC10410 mo11109() {
        return (InterfaceC10410) C21908.m49309(this.f59366.f63087.m39241(), this.f59365.mo11109());
    }

    @Override // l.InterfaceC3627
    public final Set getAnnotations() {
        return new C9208(this.f59365.getAnnotations(), this.f59366.f63087.m39240());
    }

    @Override // l.InterfaceC3627
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo11111() {
        return this.f59365.mo11111();
    }
}
