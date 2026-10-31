package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes4.dex */
public final class C9511 extends AbstractC20984 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8805 f28881;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9511(C8805 c8805) {
        super(c8805.f37861);
        this.f28881 = c8805;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9511(C8805 c8805, int i, int i2) {
        super(i, i2);
        this.f28881 = c8805;
    }

    @Override // l.AbstractC20984
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo24371() {
        return this.f28881.f37860;
    }

    @Override // l.AbstractC18161
    /* JADX INFO: renamed from: ֫ */
    public final int mo3394(int i) {
        return this.f28881.f26810.f49020[i];
    }

    @Override // l.AbstractC18161
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16749 mo3395(int i, int i2) {
        return new C9511(this.f28881, i, i2);
    }

    @Override // l.AbstractC23141, l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f56469 >= mo42266()) {
            return false;
        }
        int[] iArr = this.f28881.f26810.f49020;
        int i = this.f56469;
        this.f56469 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.AbstractC23141, l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f28881.f26810.f49020;
        int iMo42266 = mo42266();
        while (true) {
            int i = this.f56469;
            if (i >= iMo42266) {
                return;
            }
            this.f56469 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
