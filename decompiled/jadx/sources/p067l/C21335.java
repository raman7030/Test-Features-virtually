package p067l;

/* JADX INFO: renamed from: l.᩶ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21335 implements InterfaceC8455 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f67265;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC10467 f67266;

    /* JADX INFO: renamed from: ܽ */
    public final C17270[] f67267;

    /* JADX INFO: renamed from: ܿ */
    public final EnumC7785 f67268;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f67269;

    public C21335(EnumC7785 enumC7785, boolean z, int[] iArr, C17270[] c17270Arr, Object obj) {
        this.f67268 = enumC7785;
        this.f67269 = z;
        this.f67265 = iArr;
        this.f67267 = c17270Arr;
        C15671.m35602(obj, "defaultInstance");
        this.f67266 = (InterfaceC10467) obj;
    }

    @Override // p067l.InterfaceC8455
    /* JADX INFO: renamed from: ܽ */
    public final EnumC7785 mo19678() {
        return this.f67268;
    }

    @Override // p067l.InterfaceC8455
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19676() {
        return this.f67269;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int[] m48353() {
        return this.f67265;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C17270[] m48352() {
        return this.f67267;
    }

    @Override // p067l.InterfaceC8455
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC10467 mo19677() {
        return this.f67266;
    }
}
