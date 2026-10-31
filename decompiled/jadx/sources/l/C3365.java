package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes3.dex */
public final class C3365 extends AbstractC15400 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12537 f10651;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3365(C12537 c12537, int i) {
        super(i);
        this.f10651 = c12537;
    }

    @Override // l.AbstractC8346
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float mo10289(int i) {
        C12537 c12537 = this.f10651;
        return c12537.f37664.f31324[c12537.f4443 + i];
    }

    @Override // l.AbstractC15400
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10288(float f, int i) {
        this.f10651.mo4104(f, i);
    }

    @Override // l.AbstractC15400
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo10290(float f, int i) {
        this.f10651.mo4099(f, i);
    }

    @Override // l.AbstractC8346
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo10291(int i) {
        this.f10651.mo4105(i);
    }

    @Override // l.AbstractC8346
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo10287() {
        C12537 c12537 = this.f10651;
        return c12537.f4442 - c12537.f4443;
    }

    @Override // l.AbstractC8346, l.InterfaceC1290
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C12537 c12537 = this.f10651;
        float[] fArr = c12537.f37664.f31324;
        int i = c12537.f4443;
        int i2 = this.f25572;
        this.f25572 = i2 + 1;
        this.f25571 = i2;
        return fArr[i + i2];
    }

    @Override // l.AbstractC15400, l.InterfaceC3407
    /* JADX INFO: renamed from: ᩹ */
    public final float mo2281() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C12537 c12537 = this.f10651;
        float[] fArr = c12537.f37664.f31324;
        int i = c12537.f4443;
        int i2 = this.f25572 - 1;
        this.f25572 = i2;
        this.f25571 = i2;
        return fArr[i + i2];
    }

    @Override // l.AbstractC18888, l.InterfaceC20881
    /* JADX INFO: renamed from: ܽ */
    public final void forEachRemaining(InterfaceC4113 interfaceC4113) {
        C12537 c12537 = this.f10651;
        float[] fArr = c12537.f37664.f31324;
        int i = c12537.f4442 - c12537.f4443;
        while (true) {
            int i2 = this.f25572;
            if (i2 >= i) {
                return;
            }
            int i3 = c12537.f4443;
            this.f25572 = i2 + 1;
            this.f25571 = i2;
            interfaceC4113.mo12346(fArr[i3 + i2]);
        }
    }
}
