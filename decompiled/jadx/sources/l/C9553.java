package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9553 extends AbstractC22957 implements IntConsumer {
    public final int[] c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    public C9553(int i) {
        this.c = new int[i];
    }

    @Override // l.AbstractC22957
    public final void a(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < j; i++) {
            intConsumer.accept(this.c[i]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }
}
