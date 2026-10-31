package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2254 implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((Runnable) obj).run();
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
