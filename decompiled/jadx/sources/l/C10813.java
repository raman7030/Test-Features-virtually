package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10813 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15750 f32529;

    public /* synthetic */ C10813(C15750 c15750) {
        this.f32529 = c15750;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f32529.m37147((AbstractC15440) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
