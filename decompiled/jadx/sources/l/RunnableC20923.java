package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20923 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67679;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67680;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67681;

    public /* synthetic */ RunnableC20923(int i, Object obj, Object obj2) {
        this.f67680 = i;
        this.f67681 = obj;
        this.f67679 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f67680;
        Object obj = this.f67679;
        Object obj2 = this.f67681;
        switch (i) {
            case 0:
                ViewOnClickListenerC21628.m48871((ViewOnClickListenerC21628) obj2, (Runnable) obj);
                break;
            case 1:
                C10784.m26982((C10784) obj2, (InterfaceC16724) obj);
                break;
            case 2:
                C10833.m27080((C10833) obj2, (C6404) obj);
                break;
            default:
                C22586 c22586 = (C22586) obj2;
                int i2 = C22586.f73005;
                c22586.m11536(R.string.MT_Protector);
                c22586.mo11520(((AbstractC15440) obj).getName());
                break;
        }
    }
}
