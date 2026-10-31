package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10297 implements Consumer {
    public Object a;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a = obj;
    }
}
