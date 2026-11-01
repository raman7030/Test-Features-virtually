package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5567 extends AbstractC17005 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C14284 f13459;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5567(C14284 c14284, int i) {
        super(i);
        this.f13459 = c14284;
    }

    @Override // p067l.AbstractC10301
    /* JADX INFO: renamed from: ۧ */
    public final float mo12326(int i) {
        C14284 c14284 = this.f13459;
        return c14284.f40688.f34289[c14284.f7212 + i];
    }

    @Override // p067l.AbstractC17005
    /* JADX INFO: renamed from: ֫ */
    public final void mo12325(float f, int i) {
        this.f13459.mo6348(f, i);
    }

    @Override // p067l.AbstractC17005
    /* JADX INFO: renamed from: ۧ */
    public final void mo12327(float f, int i) {
        this.f13459.mo6343(f, i);
    }

    @Override // p067l.AbstractC10301
    /* JADX INFO: renamed from: ܽ */
    public final void mo12328(int i) {
        this.f13459.mo6349(i);
    }

    @Override // p067l.AbstractC10301
    /* JADX INFO: renamed from: ֫ */
    public final int mo12324() {
        C14284 c14284 = this.f13459;
        return c14284.f7211 - c14284.f7212;
    }

    @Override // p067l.AbstractC10301, p067l.InterfaceC3595
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C14284 c14284 = this.f13459;
        float[] fArr = c14284.f40688.f34289;
        int i = c14284.f7212;
        int i2 = this.f28486;
        this.f28486 = i2 + 1;
        this.f28485 = i2;
        return fArr[i + i2];
    }

    @Override // p067l.AbstractC17005, p067l.InterfaceC5607
    /* JADX INFO: renamed from: ᩹ */
    public final float mo4648() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C14284 c14284 = this.f13459;
        float[] fArr = c14284.f40688.f34289;
        int i = c14284.f7212;
        int i2 = this.f28486 - 1;
        this.f28486 = i2;
        this.f28485 = i2;
        return fArr[i + i2];
    }

    @Override // p067l.AbstractC20320, p067l.InterfaceC22214
    /* JADX INFO: renamed from: ܽ */
    public final void forEachRemaining(InterfaceC6278 interfaceC6278) {
        C14284 c14284 = this.f13459;
        float[] fArr = c14284.f40688.f34289;
        int i = c14284.f7211 - c14284.f7212;
        while (true) {
            int i2 = this.f28486;
            if (i2 >= i) {
                return;
            }
            int i3 = c14284.f7212;
            this.f28486 = i2 + 1;
            this.f28485 = i2;
            interfaceC6278.mo14251(fArr[i3 + i2]);
        }
    }
}
