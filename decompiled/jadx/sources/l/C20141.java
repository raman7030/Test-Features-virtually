package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20141 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65211;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65212;

    public /* synthetic */ C20141(int i, Object obj) {
        this.f65211 = i;
        this.f65212 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f65211) {
            case 0:
                ((AbstractC5698) this.f65212).m16094((C2609) obj);
                break;
            default:
                C4678 c4678 = (C4678) this.f65212;
                c4678.getClass();
                ((AbstractC22490) obj).mo988(c4678);
                break;
        }
    }
}
