package p067l;

import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10282 extends AbstractC13635 implements Consumer {

    /* JADX INFO: renamed from: e */
    public final Predicate f28452e;

    /* JADX INFO: renamed from: f */
    public Object f28453f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28454g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10282(InterfaceC16847 interfaceC16847, Predicate predicate, int i) {
        super(interfaceC16847);
        this.f28454g = i;
        this.f28452e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10282(InterfaceC16847 interfaceC16847, C10282 c10282, int i) {
        super(interfaceC16847, c10282);
        this.f28454g = i;
        this.f28452e = c10282.f28452e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f38388d = (this.f38388d + 1) & 63;
        this.f28453f = obj;
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.f28454g) {
            case 0:
                boolean z = this.f38387c;
                InterfaceC16847 interfaceC16847 = this.f38385a;
                if (z) {
                    boolean z2 = false;
                    this.f38387c = false;
                    while (true) {
                        zTryAdvance = interfaceC16847.tryAdvance(this);
                        if (zTryAdvance && m31013a() && this.f28452e.test(this.f28453f)) {
                            z2 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z2) {
                        this.f38386b.set(true);
                    }
                    consumer.accept(this.f28453f);
                    return zTryAdvance;
                }
                return interfaceC16847.tryAdvance(consumer);
            default:
                if (this.f38387c && m31013a() && this.f38385a.tryAdvance(this)) {
                    zTest = this.f28452e.test(this.f28453f);
                    if (zTest) {
                        consumer.accept(this.f28453f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f38387c = false;
                if (!zTest) {
                    this.f38386b.set(true);
                }
                return false;
        }
    }

    @Override // p067l.AbstractC13635, p067l.InterfaceC16847
    public InterfaceC16847 trySplit() {
        switch (this.f28454g) {
            case 1:
                if (this.f38386b.get()) {
                    return null;
                }
                return super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p067l.AbstractC13635
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo21942b(InterfaceC16847 interfaceC16847) {
        switch (this.f28454g) {
            case 0:
                return new C10282(interfaceC16847, this, 0);
            default:
                return new C10282(interfaceC16847, this, 1);
        }
    }
}
