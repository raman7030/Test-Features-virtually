package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23121 extends AbstractC13784 implements Consumer {
    public Object b;
    public C20215 c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.b = obj;
            this.a = i + 1;
        } else {
            if (i > 0) {
                if (this.c == null) {
                    C20215 c20215 = new C20215();
                    this.c = c20215;
                    c20215.accept(this.b);
                    this.a++;
                }
                this.c.accept(obj);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        C11003.requireNonNull(consumer);
        if (this.a != -2) {
            return false;
        }
        consumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C11003.requireNonNull(consumer);
        if (this.a == -2) {
            consumer.accept(this.b);
            this.a = -1;
        }
    }
}
