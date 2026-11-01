package p067l;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۜܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8871 implements BiConsumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f24056;

    public /* synthetic */ C8871(int i) {
        this.f24056 = i;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C19355.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f24056) {
            case 0:
                ((C20271) obj).m45777(obj2);
                break;
            default:
                ((C20539) obj).add(obj2);
                break;
        }
    }
}
