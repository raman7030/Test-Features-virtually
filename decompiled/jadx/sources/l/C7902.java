package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7E3 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7902 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14957 f24485;

    public /* synthetic */ C7902(C14957 c14957) {
        this.f24485 = c14957;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C14957.m35433(this.f24485, (String) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
