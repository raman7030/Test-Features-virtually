package p067l;

/* JADX INFO: renamed from: l.ܶ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17106 extends AbstractC10402 implements InterfaceC9751 {

    /* JADX INFO: renamed from: ᩹ */
    public final int f50531;

    public AbstractC17106(InterfaceC13575 interfaceC13575) {
        super(interfaceC13575);
        this.f50531 = 2;
    }

    @Override // p067l.InterfaceC9751
    /* JADX INFO: renamed from: ܳ */
    public final int mo8871() {
        return this.f50531;
    }

    @Override // p067l.AbstractC5038
    public final String toString() {
        if (m10747() == null) {
            String strM20890 = C9021.m20890(this);
            C13045.m29865(strM20890, "renderLambdaToString(...)");
            return strM20890;
        }
        return super.toString();
    }
}
