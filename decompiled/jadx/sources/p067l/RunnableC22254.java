package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC22254 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f70364;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f70365;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f70366;

    public /* synthetic */ RunnableC22254(int i, Object obj, Object obj2) {
        this.f70365 = i;
        this.f70366 = obj;
        this.f70364 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f70365;
        Object obj = this.f70364;
        Object obj2 = this.f70366;
        switch (i) {
            case 0:
                ViewOnClickListenerC22924.m51219((ViewOnClickListenerC22924) obj2, (Runnable) obj);
                break;
            case 1:
                C12617.m29027((C12617) obj2, (InterfaceC18263) obj);
                break;
            case 2:
                C12664.m29125((C12664) obj2, (C8454) obj);
                break;
            default:
                C23835 c23835 = (C23835) obj2;
                int i2 = C23835.f75732;
                c23835.m13472(R.string.MT_Protector);
                c23835.mo13456(((AbstractC17043) obj).getName());
                break;
        }
    }
}
