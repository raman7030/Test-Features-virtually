package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ᩳۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17770 extends AbstractC21340 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17064 f54356;

    @Override // l.AbstractC7933, l.InterfaceC15234
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17770(C17064 c17064, int i, int i2) {
        super(i, i2);
        this.f54356 = c17064;
    }

    @Override // l.AbstractC7933
    /* JADX INFO: renamed from: ֫ */
    public final long mo13904(int i) {
        return this.f54356.f52317.f28196[i];
    }

    @Override // l.AbstractC7933
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC0877 mo13905(int i, int i2) {
        return new C17770(this.f54356, i, i2);
    }

    @Override // l.AbstractC23099, l.InterfaceC1124
    public final void forEachRemaining(LongConsumer longConsumer) {
        C9304 c9304 = this.f54356.f52317;
        long[] jArr = c9304.f28196;
        int i = c9304.f28192;
        while (true) {
            int i2 = this.f24556;
            if (i2 >= i) {
                return;
            }
            this.f24556 = i2 + 1;
            longConsumer.accept(jArr[i2]);
        }
    }
}
