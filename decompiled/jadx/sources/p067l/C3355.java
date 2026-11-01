package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3355 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f6559;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f6560;

    public /* synthetic */ C3355(int i, Object obj) {
        this.f6559 = i;
        this.f6560 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f6559) {
            case 0:
                C14084.m31965((C14084) this.f6560, (InterfaceC19370) obj);
                break;
            default:
                C20271 c20271 = (C20271) this.f6560;
                try {
                    ((Closeable) obj).close();
                } catch (IOException e) {
                    c20271.m45777(e);
                }
                break;
        }
    }
}
