package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7955 implements IntConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f20882b;

    public /* synthetic */ C7955(Consumer consumer, int i) {
        this.f20881a = i;
        this.f20882b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.f20881a) {
            case 0:
                this.f20882b.accept(Integer.valueOf(i));
                break;
            default:
                ((InterfaceC2925) this.f20882b).accept(i);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f20881a) {
            case 0:
                break;
        }
        return C11309.$default$andThen(this, intConsumer);
    }
}
