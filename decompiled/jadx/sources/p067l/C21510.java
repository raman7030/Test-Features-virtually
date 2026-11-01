package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21510 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f67853;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f67854;

    public /* synthetic */ C21510(int i, Object obj) {
        this.f67853 = i;
        this.f67854 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        switch (this.f67853) {
            case 0:
                ((AbstractC7783) this.f67854).m18013((C4848) obj);
                break;
            default:
                C6814 c6814 = (C6814) this.f67854;
                c6814.getClass();
                ((AbstractC23743) obj).mo3382(c6814);
                break;
        }
    }
}
