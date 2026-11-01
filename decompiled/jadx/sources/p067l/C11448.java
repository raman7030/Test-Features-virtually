package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11448 extends AbstractC24187 implements IntConsumer {

    /* JADX INFO: renamed from: c */
    public final int[] f31916c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    public C11448(int i) {
        this.f31916c = new int[i];
    }

    @Override // p067l.AbstractC24187
    /* JADX INFO: renamed from: a */
    public final void mo26438a(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < j; i++) {
            intConsumer.accept(this.f31916c[i]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.f76672b;
        this.f76672b = i2 + 1;
        this.f31916c[i2] = i;
    }
}
