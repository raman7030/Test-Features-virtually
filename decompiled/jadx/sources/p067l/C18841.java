package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܿۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18841 implements LongConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56291a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f56292b;

    public /* synthetic */ C18841(Consumer consumer, int i) {
        this.f56291a = i;
        this.f56292b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.f56291a) {
            case 0:
                this.f56292b.accept(Long.valueOf(j));
                break;
            default:
                ((InterfaceC2925) this.f56292b).accept(j);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f56291a) {
            case 0:
                break;
        }
        return C4603.$default$andThen(this, longConsumer);
    }
}
