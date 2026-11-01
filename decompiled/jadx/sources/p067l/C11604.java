package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11604 extends AbstractC15469 implements IntConsumer, InterfaceC20202 {

    /* JADX INFO: renamed from: b */
    public int f32368b;

    /* JADX INFO: renamed from: c */
    public C20932 f32369c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C6120.m13914a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C6120.m13915b(this, consumer);
    }

    @Override // p067l.AbstractC15469, p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return null;
    }

    @Override // p067l.AbstractC15469, p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC20202 trySplit() {
        return null;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.f44175a;
        if (i2 == 0) {
            this.f32368b = i;
            this.f44175a = i2 + 1;
        } else {
            if (i2 > 0) {
                if (this.f32369c == null) {
                    C20932 c20932 = new C20932();
                    this.f32369c = c20932;
                    c20932.accept(this.f32368b);
                    this.f44175a++;
                }
                this.f32369c.accept(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        if (this.f44175a != -2) {
            return false;
        }
        intConsumer.accept(this.f32368b);
        this.f44175a = -1;
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        if (this.f44175a == -2) {
            intConsumer.accept(this.f32368b);
            this.f44175a = -1;
        }
    }
}
