package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21006 extends AbstractC8305 implements Consumer {
    public final Object[] b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    public C21006(int i) {
        this.b = new Object[i];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        this.a = i + 1;
        this.b[i] = obj;
    }
}
