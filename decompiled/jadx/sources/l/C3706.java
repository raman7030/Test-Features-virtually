package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3706 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14016 f11702;

    public /* synthetic */ C3706(AbstractC14016 abstractC14016) {
        this.f11702 = abstractC14016;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f11702.mo26382((C16986) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
