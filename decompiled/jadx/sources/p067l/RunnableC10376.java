package p067l;

import android.app.Activity;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10376 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f28718;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f28719;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f28720;

    public /* synthetic */ RunnableC10376(int i, Object obj, Object obj2) {
        this.f28719 = i;
        this.f28720 = obj;
        this.f28718 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f28719;
        int i2 = 0;
        Object obj = this.f28718;
        Object obj2 = this.f28720;
        switch (i) {
            case 0:
                C18107 c18107 = (C18107) obj2;
                RunnableC2999 runnableC2999 = (RunnableC2999) obj;
                if (!c18107.m41266()) {
                    runnableC2999.run();
                } else {
                    C7050.m16213(new RunnableC10376(i2, c18107, runnableC2999), 100L);
                }
                break;
            case 1:
                C2753.m4292((C2753) obj2, (Exception) obj);
                break;
            case 2:
                ActivityC18686.m42530((ActivityC18686) obj2, (C20856) obj);
                break;
            default:
                C11981 c11981 = (C11981) obj2;
                Activity activity = (Activity) obj;
                int i3 = DialogInterfaceC2564.f4230;
                C20671 c20671 = new C20671(activity);
                c20671.m46727(R.string.MT_Protector);
                c20671.m46718(activity.getString(R.string.MT_Protector, "1000+"));
                c20671.m46722(false);
                c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22573(2, c11981));
                c20671.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8824(1, c11981));
                c20671.m46732();
                break;
        }
    }
}
