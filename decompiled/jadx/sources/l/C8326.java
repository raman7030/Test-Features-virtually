package l;

import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8326 extends AbstractC11854 implements Consumer {
    public final Predicate e;
    public Object f;
    public final /* synthetic */ int g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8326(InterfaceC15234 interfaceC15234, Predicate predicate, int i) {
        super(interfaceC15234);
        this.g = i;
        this.e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8326(InterfaceC15234 interfaceC15234, C8326 c8326, int i) {
        super(interfaceC15234, c8326);
        this.g = i;
        this.e = c8326.e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d = (this.d + 1) & 63;
        this.f = obj;
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.g) {
            case 0:
                boolean z = this.c;
                InterfaceC15234 interfaceC15234 = this.a;
                if (z) {
                    boolean z2 = false;
                    this.c = false;
                    while (true) {
                        zTryAdvance = interfaceC15234.tryAdvance(this);
                        if (zTryAdvance && a() && this.e.test(this.f)) {
                            z2 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z2) {
                        this.b.set(true);
                    }
                    consumer.accept(this.f);
                    return zTryAdvance;
                }
                return interfaceC15234.tryAdvance(consumer);
            default:
                if (this.c && a() && this.a.tryAdvance(this)) {
                    zTest = this.e.test(this.f);
                    if (zTest) {
                        consumer.accept(this.f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.c = false;
                if (!zTest) {
                    this.b.set(true);
                }
                return false;
        }
    }

    @Override // l.AbstractC11854, l.InterfaceC15234
    public InterfaceC15234 trySplit() {
        switch (this.g) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // l.AbstractC11854
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        switch (this.g) {
            case 0:
                return new C8326(interfaceC15234, this, 0);
            default:
                return new C8326(interfaceC15234, this, 1);
        }
    }
}
