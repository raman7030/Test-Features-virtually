package p067l;

/* JADX INFO: renamed from: l.ᩳܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes5.dex */
public class C19577 extends AbstractC18906 {

    /* JADX INFO: renamed from: ܳ */
    public C8177 f59575;

    /* JADX INFO: renamed from: ܿ */
    public C8177 f59576;

    @Override // p067l.AbstractC18906
    /* JADX INFO: renamed from: ֫ */
    public void mo36978(int i, int i2, int i3, int i4) {
        C8177 c8177 = new C8177(i, i2, i3 - i, i4 - i2);
        C8177 c8178 = this.f59575;
        if (c8178 != null) {
            c8178.f21586 = c8177;
        } else {
            this.f59576 = c8177;
        }
        this.f59575 = c8177;
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC4154 m44486() {
        m43006();
        return new C24350(this.f59576, m43012(), m43011());
    }
}
