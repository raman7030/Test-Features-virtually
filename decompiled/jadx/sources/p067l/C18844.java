package p067l;

import bin.p000mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K7A5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18844 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f56294;

    public /* synthetic */ C18844(int i) {
        this.f56294 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        switch (this.f56294) {
            case 0:
                break;
            default:
                int i = C8362.f22369;
                ((ActivityC18686) obj).m42610(R.layout.MT_Protector);
                break;
        }
    }
}
