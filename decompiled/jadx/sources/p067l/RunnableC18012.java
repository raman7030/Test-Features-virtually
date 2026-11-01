package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC18012 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f53776;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f53777;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f53778;

    public /* synthetic */ RunnableC18012(int i, Object obj, Object obj2) {
        this.f53777 = i;
        this.f53778 = obj;
        this.f53776 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f53777;
        Object obj = this.f53776;
        Object obj2 = this.f53778;
        switch (i) {
            case 0:
                ((C14146) obj2).m32296((AbstractC5390) obj);
                break;
            case 1:
                C16398 c16398 = (C16398) obj2;
                int i2 = C16398.f48189;
                c16398.m13472(R.string.MT_Protector);
                c16398.mo13456(((AbstractC17043) obj).getName());
                break;
            case 2:
                ViewOnClickListenerC5956.m13366((ViewOnClickListenerC5956) obj2, (C4615) obj);
                break;
            default:
                ((C17175) obj2).f51144 = (C4848) obj;
                break;
        }
    }
}
