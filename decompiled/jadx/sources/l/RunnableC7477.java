package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7477 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23053;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23054;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23055;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23056;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23057;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23058;

    public /* synthetic */ RunnableC7477(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f23057 = i;
        this.f23058 = obj;
        this.f23056 = obj2;
        this.f23054 = obj3;
        this.f23053 = obj4;
        this.f23055 = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23057) {
            case 0:
                boolean[] zArr = (boolean[]) this.f23058;
                ActivityC8411 activityC8411 = (ActivityC8411) this.f23056;
                DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) this.f23054;
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f23053;
                C2978 c2978 = (C2978) this.f23055;
                zArr[0] = false;
                if (activityC8411 != null) {
                    activityC8411.m22016(false);
                }
                if (dialogInterfaceC0206.m1442() && C9255.m23764(abstractActivityC3346)) {
                    c2978.setChecked(true);
                    break;
                }
                break;
            default:
                C21040.m47867((C21040) this.f23058, (ArrayList) this.f23056, (ArrayList) this.f23054, (ArrayList) this.f23053, (ArrayList) this.f23055);
                break;
        }
    }
}
