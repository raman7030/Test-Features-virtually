package p067l;

import java.util.Deque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24602 extends AbstractC7168 {
    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC7324 interfaceC7324M16475a;
        if (!m16477c()) {
            return false;
        }
        boolean zTryAdvance = this.f18717d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f18716c == null && (interfaceC7324M16475a = AbstractC7168.m16475a(this.f18718e)) != null) {
                InterfaceC16847 interfaceC16847Spliterator = interfaceC7324M16475a.spliterator();
                this.f18717d = interfaceC16847Spliterator;
                return interfaceC16847Spliterator.tryAdvance(consumer);
            }
            this.f18714a = null;
        }
        return zTryAdvance;
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        if (this.f18714a == null) {
            return;
        }
        if (this.f18717d == null) {
            InterfaceC16847 interfaceC16847 = this.f18716c;
            if (interfaceC16847 == null) {
                Deque dequeM16476b = m16476b();
                while (true) {
                    InterfaceC7324 interfaceC7324M16475a = AbstractC7168.m16475a(dequeM16476b);
                    if (interfaceC7324M16475a != null) {
                        interfaceC7324M16475a.forEach(consumer);
                    } else {
                        this.f18714a = null;
                        return;
                    }
                }
            } else {
                interfaceC16847.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
