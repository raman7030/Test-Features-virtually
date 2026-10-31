package l;

/* JADX INFO: renamed from: l.ܿܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: U7DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17461 extends C7151 {

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f53341;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17461(C20826 c20826) {
        super(c20826);
        EnumC15204 enumC15204 = EnumC15204.f46440;
        this.f21950 = enumC15204;
        this.f53341 = -1;
        this.f29348 = EnumC0970.EXCEPTIONS;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m40826(int i) {
        this.f53341 = i;
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۡ */
    public final int mo18675() {
        int i = this.f53341;
        return i == -1 ? super.mo18675() : i;
    }
}
