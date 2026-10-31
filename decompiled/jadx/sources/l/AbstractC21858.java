package l;

/* JADX INFO: renamed from: l.᩸᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC21858 extends AbstractC19036 implements InterfaceC7767 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f70024;

    public AbstractC21858(InterfaceC11791 interfaceC11791) {
        super(interfaceC11791);
        this.f70024 = 2;
    }

    @Override // l.InterfaceC7767
    /* JADX INFO: renamed from: ܳ */
    public final int mo6745() {
        return this.f70024;
    }

    @Override // l.AbstractC2808
    public final String toString() {
        if (m8686() == null) {
            String strM18933 = C6999.m18933(this);
            C11233.m27803(strM18933, "renderLambdaToString(...)");
            return strM18933;
        }
        return super.toString();
    }
}
