package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23704 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76766;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76767;

    public /* synthetic */ RunnableC23704(int i, Object obj) {
        this.f76766 = i;
        this.f76767 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f76766;
        Object obj = this.f76767;
        switch (i) {
            case 0:
                ActivityC17169 activityC17169 = (ActivityC17169) obj;
                int i2 = ActivityC17169.f52595;
                activityC17169.getClass();
                int i3 = C6306.f19498;
                activityC17169.m40365(R.layout.MT_Protector);
                activityC17169.m40365(R.layout.MT_Protector);
                break;
            default:
                C2477 c2477 = ((C15881) obj).f49064;
                c2477.f7893.m51046("resources.arsc");
                c2477.f7893.m51038(R.string.MT_Protector);
                c2477.f7893.m51045(0);
                break;
        }
    }
}
