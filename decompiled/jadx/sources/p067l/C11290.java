package p067l;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۢۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11290 implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((C5925) obj).add(obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C19355.$default$andThen(this, biConsumer);
    }
}
