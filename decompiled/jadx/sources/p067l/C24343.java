package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24343 extends AbstractC15469 implements Consumer {

    /* JADX INFO: renamed from: b */
    public Object f77108b;

    /* JADX INFO: renamed from: c */
    public C21581 f77109c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f44175a;
        if (i == 0) {
            this.f77108b = obj;
            this.f44175a = i + 1;
        } else {
            if (i > 0) {
                if (this.f77109c == null) {
                    C21581 c21581 = new C21581();
                    this.f77109c = c21581;
                    c21581.accept(this.f77108b);
                    this.f44175a++;
                }
                this.f77109c.accept(obj);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        C12826.requireNonNull(consumer);
        if (this.f44175a != -2) {
            return false;
        }
        consumer.accept(this.f77108b);
        this.f44175a = -1;
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C12826.requireNonNull(consumer);
        if (this.f44175a == -2) {
            consumer.accept(this.f77108b);
            this.f44175a = -1;
        }
    }
}
