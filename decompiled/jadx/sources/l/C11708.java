package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۨ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11708 implements DoubleConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C11708(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(Double.valueOf(d));
                break;
            default:
                ((InterfaceC0585) this.b).accept(d);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return AbstractC16169.a(this, doubleConsumer);
    }
}
