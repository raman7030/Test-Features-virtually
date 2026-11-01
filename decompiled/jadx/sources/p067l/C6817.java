package p067l;

/* JADX INFO: renamed from: l.ۙܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6817 extends AbstractC25013 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C5476 f17701;

    @Override // p067l.AbstractC19649, p067l.InterfaceC16847
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6817(C5476 c5476, int i, int i2) {
        super(i, i2);
        this.f17701 = c5476;
    }

    @Override // p067l.AbstractC19649
    /* JADX INFO: renamed from: ֫ */
    public final char mo15611(int i) {
        return this.f17701.f13111.f38010[i];
    }

    @Override // p067l.AbstractC19649
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18307 mo15612(int i, int i2) {
        return new C6817(this.f17701, i, i2);
    }

    @Override // p067l.AbstractC19649, p067l.AbstractC3464, p067l.InterfaceC3437
    /* JADX INFO: renamed from: ֫ */
    public final void forEachRemaining(InterfaceC24857 interfaceC24857) {
        C13523 c13523 = this.f17701.f13111;
        char[] cArr = c13523.f38010;
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
