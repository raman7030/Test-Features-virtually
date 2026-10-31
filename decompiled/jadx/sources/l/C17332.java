package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܿۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17332 implements LongConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C17332(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(Long.valueOf(j));
                break;
            default:
                ((InterfaceC0585) this.b).accept(j);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return C2351.$default$andThen(this, longConsumer);
    }
}
