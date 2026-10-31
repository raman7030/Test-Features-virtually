package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16460 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50598;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50599;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50600;

    public /* synthetic */ RunnableC16460(int i, Object obj, Object obj2) {
        this.f50599 = i;
        this.f50600 = obj;
        this.f50598 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f50599;
        Object obj = this.f50598;
        Object obj2 = this.f50600;
        switch (i) {
            case 0:
                ((C12392) obj2).m30232((AbstractC3179) obj);
                break;
            case 1:
                C14761 c14761 = (C14761) obj2;
                int i2 = C14761.f45075;
                c14761.m11536(R.string.MT_Protector);
                c14761.mo11520(((AbstractC15440) obj).getName());
                break;
            case 2:
                ViewOnClickListenerC3775.m11430((ViewOnClickListenerC3775) obj2, (C2364) obj);
                break;
            default:
                ((C15580) obj2).f48012 = (C2609) obj;
                break;
        }
    }
}
