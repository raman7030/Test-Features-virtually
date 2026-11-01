package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܶۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16810 extends AbstractC24187 implements LongConsumer {

    /* JADX INFO: renamed from: c */
    public final long[] f49536c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    public C16810(int i) {
        this.f49536c = new long[i];
    }

    @Override // p067l.AbstractC24187
    /* JADX INFO: renamed from: a */
    public final void mo26438a(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < j; i++) {
            longConsumer.accept(this.f49536c[i]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.f76672b;
        this.f76672b = i + 1;
        this.f49536c[i] = j;
    }
}
