package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9717 extends AbstractC13784 implements IntConsumer, InterfaceC18764 {
    public int b;
    public C19532 c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C3947.a(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C3947.b(this, consumer);
    }

    @Override // l.AbstractC13784, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return null;
    }

    @Override // l.AbstractC13784, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC18764 trySplit() {
        return null;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            this.b = i;
            this.a = i2 + 1;
        } else {
            if (i2 > 0) {
                if (this.c == null) {
                    C19532 c19532 = new C19532();
                    this.c = c19532;
                    c19532.accept(this.b);
                    this.a++;
                }
                this.c.accept(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        if (this.a != -2) {
            return false;
        }
        intConsumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        if (this.a == -2) {
            intConsumer.accept(this.b);
            this.a = -1;
        }
    }
}
