package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3294 implements IntConsumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10334;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10335;

    public /* synthetic */ C3294(int i, Object obj) {
        this.f10334 = i;
        this.f10335 = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.f10334) {
            case 0:
                C13876.m33242((C13876) this.f10335, i);
                break;
            default:
                ((Consumer) this.f10335).accept(Integer.valueOf(i));
                break;
        }
    }

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }
}
