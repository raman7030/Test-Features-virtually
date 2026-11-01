package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9475 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ Object f25966;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f25967;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ Object f25968;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f25969;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f25970;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f25971;

    public /* synthetic */ RunnableC9475(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f25970 = i;
        this.f25971 = obj;
        this.f25969 = obj2;
        this.f25967 = obj3;
        this.f25966 = obj4;
        this.f25968 = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25970) {
            case 0:
                boolean[] zArr = (boolean[]) this.f25971;
                ActivityC10363 activityC10363 = (ActivityC10363) this.f25969;
                DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) this.f25967;
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f25966;
                C0990 c0990 = (C0990) this.f25968;
                zArr[0] = false;
                if (activityC10363 != null) {
                    activityC10363.m23986(false);
                }
                if (dialogInterfaceC2564.m3855() && C11164.m25765(abstractActivityC5549)) {
                    c0990.setChecked(true);
                    break;
                }
                break;
            default:
                C22365.m50197((C22365) this.f25971, (ArrayList) this.f25969, (ArrayList) this.f25967, (ArrayList) this.f25966, (ArrayList) this.f25968);
                break;
        }
    }
}
