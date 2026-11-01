package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩻۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24897 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f79516;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f79517;

    public /* synthetic */ RunnableC24897(int i, Object obj) {
        this.f79516 = i;
        this.f79517 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f79516;
        Object obj = this.f79517;
        switch (i) {
            case 0:
                ActivityC18686 activityC18686 = (ActivityC18686) obj;
                int i2 = ActivityC18686.f55776;
                activityC18686.getClass();
                int i3 = C8362.f22369;
                activityC18686.m42610(R.layout.MT_Protector);
                activityC18686.m42610(R.layout.MT_Protector);
                break;
            default:
                C4723 c4723 = ((C17462) obj).f52204;
                c4723.f10681.m53437("resources.arsc");
                c4723.f10681.m53429(R.string.MT_Protector);
                c4723.f10681.m53436(0);
                break;
        }
    }
}
