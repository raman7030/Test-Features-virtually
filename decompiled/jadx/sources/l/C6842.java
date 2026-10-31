package l;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۜܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6842 implements BiConsumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21177;

    public /* synthetic */ C6842(int i) {
        this.f21177 = i;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C17873.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f21177) {
            case 0:
                ((C18837) obj).m43511(obj2);
                break;
            default:
                ((C19119) obj).add(obj2);
                break;
        }
    }
}
