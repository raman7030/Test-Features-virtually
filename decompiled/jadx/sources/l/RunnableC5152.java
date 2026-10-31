package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5152 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16096;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16097;

    public /* synthetic */ RunnableC5152(int i, Object obj) {
        this.f16096 = i;
        this.f16097 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16096;
        Object obj = this.f16097;
        switch (i) {
            case 0:
                int i2 = ActivityC16315.f50233;
                ((ActivityC16315) obj).m38459(R.layout.MT_Protector);
                break;
            default:
                ((C4028) obj).m12126();
                break;
        }
    }
}
