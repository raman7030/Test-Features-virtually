package p067l;

/* JADX INFO: renamed from: l.ܿܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: U7DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18963 extends C9164 {

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f56528;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18963(C22161 c22161) {
        super(c22161);
        EnumC16818 enumC16818 = EnumC16818.f49565;
        this.f24829 = enumC16818;
        this.f56528 = -1;
        this.f32297 = EnumC3290.EXCEPTIONS;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m43084(int i) {
        this.f56528 = i;
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۡ */
    public final int mo20624() {
        int i = this.f56528;
        return i == -1 ? super.mo20624() : i;
    }
}
