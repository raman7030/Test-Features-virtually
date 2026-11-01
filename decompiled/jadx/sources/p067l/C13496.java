package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۨ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13496 implements DoubleConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f37921b;

    public /* synthetic */ C13496(Consumer consumer, int i) {
        this.f37920a = i;
        this.f37921b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.f37920a) {
            case 0:
                this.f37921b.accept(Double.valueOf(d));
                break;
            default:
                ((InterfaceC2925) this.f37921b).accept(d);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f37920a) {
            case 0:
                break;
        }
        return AbstractC17736.m40299a(this, doubleConsumer);
    }
}
