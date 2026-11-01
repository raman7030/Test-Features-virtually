package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes4.dex */
public final class C9849 extends AbstractC6082 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C22591 f27329;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9849(C22591 c22591, int i) {
        super(i);
        this.f27329 = c22591;
    }

    @Override // p067l.AbstractC4741
    /* JADX INFO: renamed from: ۧ */
    public final char mo10043(int i) {
        C22591 c22591 = this.f27329;
        return c22591.f71311.f73099[c22591.f15430 + i];
    }

    @Override // p067l.AbstractC6082
    /* JADX INFO: renamed from: ֫ */
    public final void mo10142(char c, int i) {
        this.f27329.mo6023(c, i);
    }

    @Override // p067l.AbstractC6082
    /* JADX INFO: renamed from: ۧ */
    public final void mo10143(char c, int i) {
        this.f27329.mo6018(c, i);
    }

    @Override // p067l.AbstractC4741
    /* JADX INFO: renamed from: ܽ */
    public final void mo10044(int i) {
        this.f27329.mo6017(i);
    }

    @Override // p067l.AbstractC4741
    /* JADX INFO: renamed from: ֫ */
    public final int mo10042() {
        C22591 c22591 = this.f27329;
        return c22591.f15429 - c22591.f15430;
    }

    @Override // p067l.AbstractC4741, p067l.InterfaceC17480
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo9752() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C22591 c22591 = this.f27329;
        char[] cArr = c22591.f71311.f73099;
        int i = c22591.f15430;
        int i2 = this.f10739;
        this.f10739 = i2 + 1;
        this.f10738 = i2;
        return cArr[i + i2];
    }

    @Override // p067l.AbstractC6082, p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩺֫ */
    public final char mo9758() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C22591 c22591 = this.f27329;
        char[] cArr = c22591.f71311.f73099;
        int i = c22591.f15430;
        int i2 = this.f10739 - 1;
        this.f10739 = i2;
        this.f10738 = i2;
        return cArr[i + i2];
    }

    @Override // p067l.AbstractC11512, p067l.InterfaceC22214
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC24857 interfaceC24857) {
        C22591 c22591 = this.f27329;
        char[] cArr = c22591.f71311.f73099;
        int i = c22591.f15429 - c22591.f15430;
        while (true) {
            int i2 = this.f10739;
            if (i2 >= i) {
                return;
            }
            int i3 = c22591.f15430;
            this.f10739 = i2 + 1;
            this.f10738 = i2;
            interfaceC24857.mo20276(cArr[i3 + i2]);
        }
    }
}
