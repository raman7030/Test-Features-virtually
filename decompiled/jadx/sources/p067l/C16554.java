package p067l;

/* JADX INFO: renamed from: l.ܶ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16554 extends AbstractC22332 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C22591 f48621;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16554(C22591 c22591) {
        super(c22591.f15430);
        this.f48621 = c22591;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16554(C22591 c22591, int i, int i2) {
        super(i, i2);
        this.f48621 = c22591;
    }

    @Override // p067l.AbstractC22332
    /* JADX INFO: renamed from: ۧ */
    public final int mo37522() {
        return this.f48621.f15429;
    }

    @Override // p067l.AbstractC19649
    /* JADX INFO: renamed from: ֫ */
    public final char mo15611(int i) {
        return this.f48621.f71311.f73099[i];
    }

    @Override // p067l.AbstractC19649
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18307 mo15612(int i, int i2) {
        return new C16554(this.f48621, i, i2);
    }

    @Override // p067l.AbstractC19649, p067l.InterfaceC3437
    /* JADX INFO: renamed from: ۧ */
    public final boolean tryAdvance(InterfaceC24857 interfaceC24857) {
        if (this.f59774 >= mo44674()) {
            return false;
        }
        char[] cArr = this.f48621.f71311.f73099;
        int i = this.f59774;
        this.f59774 = i + 1;
        interfaceC24857.mo20276(cArr[i]);
        return true;
    }

    @Override // p067l.AbstractC19649, p067l.AbstractC3464, p067l.InterfaceC3437
    /* JADX INFO: renamed from: ֫ */
    public final void forEachRemaining(InterfaceC24857 interfaceC24857) {
        char[] cArr = this.f48621.f71311.f73099;
        int iMo44674 = mo44674();
        while (true) {
            int i = this.f59774;
            if (i >= iMo44674) {
                return;
            }
            this.f59774 = i + 1;
            interfaceC24857.mo20276(cArr[i]);
        }
    }
}
