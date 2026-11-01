package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۛ۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8129 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f21427;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f21428;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f21429;

    public /* synthetic */ RunnableC8129(int i, Object obj, Object obj2) {
        this.f21428 = i;
        this.f21429 = obj;
        this.f21427 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21428) {
            case 0:
                ((TextView) this.f21429).setText((String) this.f21427);
                break;
            case 1:
                C12617.m29028((C12617) this.f21429, this.f21427);
                break;
            default:
                C15099 c15099 = (C15099) this.f21429;
                C4848 c4848 = (C4848) this.f21427;
                c15099.getClass();
                C1446.m31704(c4848.m10289() == C15099.m34491(c4848).m10289());
                break;
        }
    }
}
