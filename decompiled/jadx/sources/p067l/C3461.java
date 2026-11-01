package p067l;

import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3461 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f6936;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f6937;

    public /* synthetic */ C3461(int i, Object obj) {
        this.f6936 = i;
        this.f6937 = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        switch (this.f6936) {
            case 0:
                ((LinkedHashSet) this.f6937).add((C2417) obj);
                break;
            default:
                ((C5771) this.f6937).m17993((C4848) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
