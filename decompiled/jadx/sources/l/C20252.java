package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20252 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4729 f65483;

    public /* synthetic */ C20252(C4729 c4729) {
        this.f65483 = c4729;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C4729.m13845(this.f65483, (C13900) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
