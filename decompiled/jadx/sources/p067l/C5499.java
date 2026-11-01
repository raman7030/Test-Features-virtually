package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5499 implements IntConsumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f13142;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f13143;

    public /* synthetic */ C5499(int i, Object obj) {
        this.f13142 = i;
        this.f13143 = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.f13142) {
            case 0:
                C15556.m35361((C15556) this.f13143, i);
                break;
            default:
                ((Consumer) this.f13143).accept(Integer.valueOf(i));
                break;
        }
    }

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }
}
