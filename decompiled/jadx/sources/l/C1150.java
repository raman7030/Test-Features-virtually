package l;

import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1150 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4167;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4168;

    public /* synthetic */ C1150(int i, Object obj) {
        this.f4167 = i;
        this.f4168 = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f4167) {
            case 0:
                ((LinkedHashSet) this.f4168).add((C0052) obj);
                break;
            default:
                ((C3581) this.f4168).m16074((C2609) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
