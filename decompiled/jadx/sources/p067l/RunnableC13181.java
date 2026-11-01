package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۨ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13181 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Comparable f37035;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f37036;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f37037;

    public /* synthetic */ RunnableC13181(Object obj, Comparable comparable, int i) {
        this.f37036 = i;
        this.f37037 = obj;
        this.f37035 = comparable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f37036;
        Comparable comparable = this.f37035;
        Object obj = this.f37037;
        switch (i) {
            case 0:
                C6001.m13508((C6001) obj, (C4566) comparable);
                break;
            case 1:
                C3047 c3047 = (C3047) obj;
                int i2 = C3047.f5459;
                c3047.m13472(R.string.MT_Protector);
                c3047.mo13456(((AbstractC17043) comparable).getName());
                break;
            default:
                ViewOnClickListenerC22924.m51233((ViewOnClickListenerC22924) obj, (String) comparable);
                break;
        }
    }
}
