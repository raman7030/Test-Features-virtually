package p067l;

/* JADX INFO: renamed from: l.۟ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public class C9262 extends AbstractC6462 {

    /* JADX INFO: renamed from: ۤ */
    public EnumC11353 f25160;

    public /* synthetic */ C9262(EnumC11353 enumC11353, AbstractC21195 abstractC21195, C22082 c22082, int i) {
        this(enumC11353, abstractC21195, c22082);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֡֫ */
    public final boolean mo14771() {
        return true;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩵֫ */
    public final boolean mo14805() {
        return true;
    }

    public C9262(EnumC11353 enumC11353) {
        this(enumC11353, null, C22082.f69463);
    }

    public C9262(EnumC11353 enumC11353, AbstractC21195 abstractC21195, C22082 c22082) {
        super(abstractC21195, c22082);
        this.f25160 = enumC11353;
        C1446.m31704(enumC11353.f31643);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo3770(C22082 c22082) {
        return new C24014(this, this.f25160, this.f16705, c22082);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۖ֫ */
    public final boolean mo14778() {
        return this.f25160 != EnumC11353.BOOLEAN;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean mo14790() {
        int i = C19992.f60699[this.f25160.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC11353 mo5577() {
        return this.f25160;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo5576(Object obj) {
        return new C15296(this.f25160, this.f16705, this.f16704, obj);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩶֫ */
    public final String mo5578() {
        Object objMo14779 = mo14779();
        C1446.m31699(objMo14779);
        EnumC11353 enumC11353 = EnumC11353.BOOLEAN;
        EnumC11353 enumC11354 = this.f25160;
        if (enumC11354 == enumC11353) {
            return ((Integer) objMo14779).intValue() == 0 ? "false" : "true";
        }
        if (enumC11354 == EnumC11353.CHAR) {
            return String.valueOf((char) ((Integer) objMo14779).intValue());
        }
        return objMo14779.toString();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean mo14806() {
        return this.f25160 == EnumC11353.BOOLEAN && mo14779() != null && ((Integer) mo14779()).intValue() == 0;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ܶ֫ */
    public final boolean mo14799() {
        return (this.f25160 != EnumC11353.BOOLEAN || mo14779() == null || ((Integer) mo14779()).intValue() == 0) ? false : true;
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3035 mo5575() {
        switch (C19992.f60699[this.f25160.ordinal()]) {
            case 1:
                return EnumC3035.CHAR;
            case 2:
                return EnumC3035.BYTE;
            case 3:
                return EnumC3035.SHORT;
            case 4:
                return EnumC3035.INT;
            case 5:
                return EnumC3035.LONG;
            case 6:
                return EnumC3035.FLOAT;
            case 7:
                return EnumC3035.DOUBLE;
            case 8:
                return EnumC3035.BOOLEAN;
            default:
                throw new AssertionError();
        }
    }
}
