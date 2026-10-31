package l;

/* JADX INFO: renamed from: l.۟ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public class C7254 extends AbstractC4308 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC9454 f22270;

    public /* synthetic */ C7254(EnumC9454 enumC9454, AbstractC19810 abstractC19810, C20743 c20743, int i) {
        this(enumC9454, abstractC19810, c20743);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֡֫ */
    public final boolean mo12907() {
        return true;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ᩵֫ */
    public final boolean mo12941() {
        return true;
    }

    public C7254(EnumC9454 enumC9454) {
        this(enumC9454, null, C20743.f66779);
    }

    public C7254(EnumC9454 enumC9454, AbstractC19810 abstractC19810, C20743 c20743) {
        super(abstractC19810, c20743);
        this.f22270 = enumC9454;
        C12171.m29642(enumC9454.f28694);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4308 mo1357(C20743 c20743) {
        return new C22776(this, this.f22270, this.f13890, c20743);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۖ֫ */
    public final boolean mo12914() {
        return this.f22270 != EnumC9454.BOOLEAN;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean mo12926() {
        int i = C18544.f57475[this.f22270.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC9454 mo3258() {
        return this.f22270;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo3257(Object obj) {
        return new C13603(this.f22270, this.f13890, this.f13889, obj);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ᩶֫ */
    public final String mo3259() {
        Object objMo12915 = mo12915();
        C12171.m29637(objMo12915);
        EnumC9454 enumC9454 = EnumC9454.BOOLEAN;
        EnumC9454 enumC9455 = this.f22270;
        if (enumC9455 == enumC9454) {
            return ((Integer) objMo12915).intValue() == 0 ? "false" : "true";
        }
        if (enumC9455 == EnumC9454.CHAR) {
            return String.valueOf((char) ((Integer) objMo12915).intValue());
        }
        return objMo12915.toString();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean mo12942() {
        return this.f22270 == EnumC9454.BOOLEAN && mo12915() != null && ((Integer) mo12915()).intValue() == 0;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ܶ֫ */
    public final boolean mo12935() {
        return (this.f22270 != EnumC9454.BOOLEAN || mo12915() == null || ((Integer) mo12915()).intValue() == 0) ? false : true;
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    /* JADX INFO: renamed from: ֫ */
    public final EnumC0701 mo3256() {
        switch (C18544.f57475[this.f22270.ordinal()]) {
            case 1:
                return EnumC0701.CHAR;
            case 2:
                return EnumC0701.BYTE;
            case 3:
                return EnumC0701.SHORT;
            case 4:
                return EnumC0701.INT;
            case 5:
                return EnumC0701.LONG;
            case 6:
                return EnumC0701.FLOAT;
            case 7:
                return EnumC0701.DOUBLE;
            case 8:
                return EnumC0701.BOOLEAN;
            default:
                throw new AssertionError();
        }
    }
}
