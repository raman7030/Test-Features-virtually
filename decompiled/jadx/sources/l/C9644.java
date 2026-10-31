package l;

import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۢܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9644 implements BiConsumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8938 f29221;

    public /* synthetic */ C9644(C8938 c8938) {
        this.f29221 = c8938;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C8938.m23047(this.f29221, (String) obj, (List) obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C17873.$default$andThen(this, biConsumer);
    }
}
