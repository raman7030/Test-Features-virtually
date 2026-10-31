package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22257 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72222;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72223;

    public /* synthetic */ C22257(int i, Object obj) {
        this.f72222 = i;
        this.f72223 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f72222) {
            case 0:
                ((AbstractC5698) this.f72223).m16106((C2609) obj);
                break;
            default:
                C20201 c20201 = (C20201) this.f72223;
                c20201.getClass();
                ((AbstractC22490) obj).mo988(c20201);
                break;
        }
    }
}
