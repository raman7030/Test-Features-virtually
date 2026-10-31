package l;

import java.util.Deque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23394 extends AbstractC5050 {
    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC5214 interfaceC5214A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.c == null && (interfaceC5214A = AbstractC5050.a(this.e)) != null) {
                InterfaceC15234 interfaceC15234Spliterator = interfaceC5214A.spliterator();
                this.d = interfaceC15234Spliterator;
                return interfaceC15234Spliterator.tryAdvance(consumer);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            InterfaceC15234 interfaceC15234 = this.c;
            if (interfaceC15234 == null) {
                Deque dequeB = b();
                while (true) {
                    InterfaceC5214 interfaceC5214A = AbstractC5050.a(dequeB);
                    if (interfaceC5214A != null) {
                        interfaceC5214A.forEach(consumer);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                interfaceC15234.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
