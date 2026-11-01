package p067l;

/* JADX INFO: renamed from: l.֫᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4418 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f9923;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f9924;

    public /* synthetic */ RunnableC4418(int i, Object obj) {
        this.f9923 = i;
        this.f9924 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9923) {
            case 0:
                ((C17828) this.f9924).m36360(new C16487(0));
                break;
            default:
                ViewOnClickListenerC7968 viewOnClickListenerC7968 = (ViewOnClickListenerC7968) this.f9924;
                C16408 c16408 = viewOnClickListenerC7968.f20944;
                c16408.f48229.notifyItemChanged(viewOnClickListenerC7968.getAdapterPosition());
                c16408.m37287();
                break;
        }
    }
}
