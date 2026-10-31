package l;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۢۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9387 implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((C3742) obj).add(obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C17873.$default$andThen(this, biConsumer);
    }
}
