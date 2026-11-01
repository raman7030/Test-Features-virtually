package p067l;

/* JADX INFO: renamed from: l.ۤܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12182 extends AbstractC25013 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C8158 f34038;

    @Override // p067l.AbstractC19649, p067l.InterfaceC16847
    public final int characteristics() {
        return 16720;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12182(C8158 c8158, int i, int i2) {
        super(i, i2);
        this.f34038 = c8158;
    }

    @Override // p067l.AbstractC19649
    /* JADX INFO: renamed from: ֫ */
    public final char mo15611(int i) {
        return this.f34038.f21527.f38005[i];
    }

    @Override // p067l.AbstractC19649
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18307 mo15612(int i, int i2) {
        return new C12182(this.f34038, i, i2);
    }

    @Override // p067l.AbstractC19649, p067l.AbstractC3464, p067l.InterfaceC3437
    /* JADX INFO: renamed from: ֫ */
    public final void forEachRemaining(InterfaceC24857 interfaceC24857) {
        C13523 c13523 = this.f34038.f21527;
        char[] cArr = c13523.f38005;
        int i = c13523.f38006;
        while (true) {
            int i2 = this.f59774;
            if (i2 >= i) {
                return;
            }
            this.f59774 = i2 + 1;
            interfaceC24857.mo20276(cArr[i2]);
        }
    }
}
