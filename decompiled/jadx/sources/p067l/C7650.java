package p067l;

/* JADX INFO: renamed from: l.ۚ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes3.dex */
public final class C7650 extends AbstractC13154 implements InterfaceC10702 {

    /* JADX INFO: renamed from: ۗ */
    public C4848 f20020;

    /* JADX INFO: renamed from: ۛ */
    public AbstractC12224 f20021;

    /* JADX INFO: renamed from: ۤ */
    public C4436 f20022;

    /* JADX INFO: renamed from: ۨ */
    public C4848 f20023;

    /* JADX INFO: renamed from: ۫ */
    public C4848 f20024;

    /* JADX INFO: renamed from: ۬ */
    public AbstractC14355 f20025;

    /* JADX INFO: renamed from: ܰ */
    public C4848 f20026;

    /* JADX INFO: renamed from: ᩺ */
    public C15828 f20027;

    public C7650() {
        throw null;
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ֫ */
    public final void mo3382(AbstractC2562 abstractC2562) {
        abstractC2562.mo3617(this);
    }

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5532 mo3381() {
        long j = this.f20022.f9954;
        if ((8192 & j) != 0) {
            return EnumC5532.ANNOTATION_TYPE;
        }
        if ((512 & j) != 0) {
            return EnumC5532.INTERFACE;
        }
        if ((16384 & j) != 0) {
            return EnumC5532.ENUM;
        }
        if ((j & 2305843009213693952L) != 0) {
            return EnumC5532.RECORD;
        }
        return EnumC5532.CLASS;
    }

    @Override // p067l.AbstractC7257, p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3380(InterfaceC14249 interfaceC14249, Object obj) {
        return interfaceC14249.mo13727(this, obj);
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC19998 mo3383() {
        return EnumC19998.f60806;
    }
}
