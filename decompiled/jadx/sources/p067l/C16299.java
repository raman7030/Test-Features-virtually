package p067l;

/* JADX INFO: renamed from: l.ܳܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4NK */
/* JADX INFO: loaded from: classes4.dex */
public class C16299 extends Exception {

    /* JADX INFO: renamed from: ۗ */
    public Object f47903;

    /* JADX INFO: renamed from: ۙ */
    public int f47904;

    /* JADX INFO: renamed from: ۬ */
    public InterfaceC8924 f47905;

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC13638 f47906;

    /* JADX INFO: renamed from: ᩸ */
    public int f47907;

    /* JADX INFO: renamed from: ᩹ */
    public int f47908;

    public C16299() {
    }

    public C16299(InterfaceC13638 interfaceC13638) {
        Object objMo4661;
        this.f47906 = interfaceC13638;
        interfaceC13638.getClass();
        if (interfaceC13638 instanceof InterfaceC22336) {
            InterfaceC8924 interfaceC8924Mo34327 = ((InterfaceC22336) interfaceC13638).mo34327(1);
            this.f47905 = interfaceC8924Mo34327;
            this.f47904 = interfaceC8924Mo34327.getLine();
            this.f47908 = this.f47905.mo12370();
        }
        if (!(interfaceC13638 instanceof InterfaceC6912)) {
            if (interfaceC13638 instanceof InterfaceC6932) {
                this.f47907 = interfaceC13638.mo31015(1);
                InterfaceC6932 interfaceC6932 = (InterfaceC6932) interfaceC13638;
                this.f47904 = interfaceC6932.getLine();
                this.f47908 = interfaceC6932.m15892();
                return;
            }
            this.f47907 = interfaceC13638.mo31015(1);
            return;
        }
        InterfaceC6912 interfaceC6912 = (InterfaceC6912) interfaceC13638;
        this.f47903 = interfaceC6912.m15844(1);
        if (interfaceC6912 instanceof InterfaceC2888) {
            InterfaceC2888 interfaceC2888 = (InterfaceC2888) interfaceC6912;
            objMo4661 = interfaceC2888.mo4661(false);
            if (objMo4661 == null) {
                objMo4661 = interfaceC2888.mo4661(true);
            }
        } else {
            objMo4661 = null;
        }
        C8377 c8377Mo15845 = interfaceC6912.mo15845();
        objMo4661 = objMo4661 == null ? this.f47903 : objMo4661;
        c8377Mo15845.getClass();
        InterfaceC8924 interfaceC8924 = objMo4661 instanceof C20324 ? ((C20324) objMo4661).f62784 : null;
        if (interfaceC8924 != null) {
            this.f47905 = interfaceC8924;
            if (interfaceC8924.getLine() <= 0) {
                Object objM15844 = interfaceC6912.m15844(-1);
                int i = -1;
                while (objM15844 != null) {
                    InterfaceC8924 interfaceC8925 = objM15844 instanceof C20324 ? ((C20324) objM15844).f62784 : null;
                    if (interfaceC8925 != null && interfaceC8925.getLine() > 0) {
                        this.f47904 = interfaceC8925.getLine();
                        this.f47908 = interfaceC8925.mo12370();
                        return;
                    } else {
                        i--;
                        try {
                            objM15844 = interfaceC6912.m15844(i);
                        } catch (UnsupportedOperationException unused) {
                            objM15844 = null;
                        }
                    }
                }
                return;
            }
            this.f47904 = interfaceC8924.getLine();
            this.f47908 = interfaceC8924.mo12370();
            return;
        }
        Object obj = this.f47903;
        if (!(obj instanceof InterfaceC23676)) {
            int type = obj != null ? ((InterfaceC23676) obj).getType() : 0;
            Object obj2 = this.f47903;
            this.f47905 = new C5591(type, obj2 != null ? ((InterfaceC23676) obj2).getText() : null);
        } else {
            this.f47904 = ((InterfaceC23676) obj).getLine();
            this.f47908 = ((InterfaceC23676) this.f47903).mo10395();
            Object obj3 = this.f47903;
            if (obj3 instanceof C20324) {
                this.f47905 = ((C20324) obj3).f62784;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m37092() {
        InterfaceC13638 interfaceC13638 = this.f47906;
        if (interfaceC13638 instanceof InterfaceC22336) {
            return this.f47905.getType();
        }
        if (interfaceC13638 instanceof InterfaceC6912) {
            ((InterfaceC6912) interfaceC13638).mo15845().getClass();
            Object obj = this.f47903;
            if (obj == null) {
                return 0;
            }
            return ((InterfaceC23676) obj).getType();
        }
        return this.f47907;
    }
}
