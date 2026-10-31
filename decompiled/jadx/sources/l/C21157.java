package l;

/* JADX INFO: renamed from: l.᩷᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T590 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21157 extends AbstractC2043 implements InterfaceC14742 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f68211 = new C7045();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f68212;

    public C21157(EnumC23915 enumC23915, int i) {
        super(enumC23915);
        this.f68212 = i;
    }

    public C21157(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f68212 = C11807.m28859(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(0);
        c1547.m5302(this.f68212);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format30t;
    }

    @Override // l.InterfaceC14742
    /* JADX INFO: renamed from: ᩳ */
    public final int mo4860() {
        return this.f68212;
    }
}
