package p067l;

import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۢܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11534 implements BiConsumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C10863 f32170;

    public /* synthetic */ C11534(C10863 c10863) {
        this.f32170 = c10863;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C10863.m25021(this.f32170, (String) obj, (List) obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C19355.$default$andThen(this, biConsumer);
    }
}
