package l;

import android.app.Activity;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8425 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25805;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25806;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25807;

    public /* synthetic */ RunnableC8425(int i, Object obj, Object obj2) {
        this.f25806 = i;
        this.f25807 = obj;
        this.f25805 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25806;
        int i2 = 0;
        Object obj = this.f25805;
        Object obj2 = this.f25807;
        switch (i) {
            case 0:
                C16560 c16560 = (C16560) obj2;
                RunnableC0663 runnableC0663 = (RunnableC0663) obj;
                if (!c16560.m39040()) {
                    runnableC0663.run();
                } else {
                    C4925.m14316(new RunnableC8425(i2, c16560, runnableC0663), 100L);
                }
                break;
            case 1:
                C0405.m1900((C0405) obj2, (Exception) obj);
                break;
            case 2:
                ActivityC17169.m40285((ActivityC17169) obj2, (C19452) obj);
                break;
            default:
                C10114 c10114 = (C10114) obj2;
                Activity activity = (Activity) obj;
                int i3 = DialogInterfaceC0206.f1451;
                C19258 c19258 = new C19258(activity);
                c19258.m44433(R.string.MT_Protector);
                c19258.m44424(activity.getString(R.string.MT_Protector, "1000+"));
                c19258.m44428(false);
                c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21259(2, c10114));
                c19258.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6792(1, c10114));
                c19258.m44438();
                break;
        }
    }
}
