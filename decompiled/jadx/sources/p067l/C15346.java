package p067l;

/* JADX INFO: renamed from: l.ܰۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15346 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public final C14930 f43803;

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
    }

    public C15346(C14930 c14930) {
        super(1, c14930.m34149() + C3395.m5939(c14930.m34152()) + 1);
        this.f43803 = c14930;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_STRING_DATA_ITEM;
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        C14930 c14930 = this.f43803;
        C13000 c13000M34151 = c14930.m34151();
        int iM34152 = c14930.m34152();
        if (c19705.m44765()) {
            c19705.m44760(C3395.m5939(iM34152), "utf16_size: ".concat(C16351.m37155(iM34152)));
            c19705.m44760(c13000M34151.m29810() + 1, c14930.m34150());
        }
        c19705.m44766(iM34152);
        c19705.m44763(c13000M34151);
        c19705.m44776(0);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        return this.f43803.m34150();
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ֫ */
    public final int mo5190(AbstractC5289 abstractC5289) {
        return this.f43803.compareTo(((C15346) abstractC5289).f43803);
    }
}
