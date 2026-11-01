package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22333 extends AbstractC10262 implements Consumer {

    /* JADX INFO: renamed from: b */
    public final Object[] f70501b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public C22333(int i) {
        this.f70501b = new Object[i];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f28412a;
        this.f28412a = i + 1;
        this.f70501b[i] = obj;
    }
}
