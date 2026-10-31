package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5878 implements IntConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C5878(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(Integer.valueOf(i));
                break;
            default:
                ((InterfaceC0585) this.b).accept(i);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return C9407.$default$andThen(this, intConsumer);
    }
}
