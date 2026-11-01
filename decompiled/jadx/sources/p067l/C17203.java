package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17203 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11249 f51204;

    /* JADX INFO: renamed from: ֫ */
    public final void m38952(boolean z) {
        this.f51204.m26142(z);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m38952(((Boolean) obj).booleanValue());
    }

    public final Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
