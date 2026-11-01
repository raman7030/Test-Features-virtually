package p067l;

/* JADX INFO: renamed from: l.᩺ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24165 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f76642;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f76643;

    public /* synthetic */ RunnableC24165(int i, Object obj) {
        this.f76642 = i;
        this.f76643 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f76642) {
            case 0:
                C14146.m32325((C14146) this.f76643);
                break;
            case 1:
                ((ActivityC2023) this.f76643).invalidateOptionsMenu();
                break;
            case 2:
                ((C0988) this.f76643).mo6617();
                break;
            default:
                ((C14853) this.f76643).m33949();
                break;
        }
    }
}
