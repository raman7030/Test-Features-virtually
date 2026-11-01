package p067l;

/* JADX INFO: renamed from: l.ۢܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11611 extends AbstractC17644 {

    /* JADX INFO: renamed from: ۜ */
    public final CharSequence f32421;

    /* JADX INFO: renamed from: ܳ */
    public final C14982 f32422;

    /* JADX INFO: renamed from: ᩷ */
    public final CharSequence f32423;

    /* JADX INFO: renamed from: ᩻ */
    public final C14982 f32424;

    public C11611(C14982 c14982, C14982 c14983, CharSequence charSequence, CharSequence charSequence2, InterfaceC8848 interfaceC8848, C6836 c6836) {
        super(charSequence.length(), charSequence2.length(), interfaceC8848, c6836);
        this.f32422 = c14982;
        this.f32424 = c14983;
        this.f32421 = charSequence;
        this.f32423 = charSequence2;
    }

    @Override // p067l.AbstractC17644
    /* JADX INFO: renamed from: ֫ */
    public final void mo25214(int i, int i2, int i3, int i4) {
        for (C23600 c23600 : C14312.m32879(this.f32421.subSequence(i, i2), this.f32423.subSequence(i3, i4), this.f52708).mo8421()) {
            int i5 = c23600.f75123;
            this.f52706.m43007(i + i5, c23600.f75124 + i3, c23600.f75121 - i5);
        }
    }

    @Override // p067l.AbstractC17644
    /* JADX INFO: renamed from: ֫ */
    public final C22930 mo25213(int i) {
        C14982 c14982 = this.f32422;
        return new C22930(c14982.f42808[i], c14982.m34336(i));
    }

    @Override // p067l.AbstractC17644
    /* JADX INFO: renamed from: ۧ */
    public final C22930 mo25215(int i) {
        C14982 c14982 = this.f32424;
        return new C22930(c14982.f42808[i], c14982.m34336(i));
    }
}
