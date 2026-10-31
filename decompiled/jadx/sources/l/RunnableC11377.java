package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11377 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Comparable f34038;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34039;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34040;

    public /* synthetic */ RunnableC11377(Object obj, Comparable comparable, int i) {
        this.f34039 = i;
        this.f34040 = obj;
        this.f34038 = comparable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34039;
        Comparable comparable = this.f34038;
        Object obj = this.f34040;
        switch (i) {
            case 0:
                C3822.m11572((C3822) obj, (C2312) comparable);
                break;
            case 1:
                C0713 c0713 = (C0713) obj;
                int i2 = C0713.f2686;
                c0713.m11536(R.string.MT_Protector);
                c0713.mo11520(((AbstractC15440) comparable).getName());
                break;
            default:
                ViewOnClickListenerC21628.m48885((ViewOnClickListenerC21628) obj, (String) comparable);
                break;
        }
    }
}
