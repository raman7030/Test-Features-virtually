package p067l;

/* JADX INFO: renamed from: l.ۡܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10854 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f30081;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f30082;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30083;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f30084;

    public /* synthetic */ RunnableC10854(Object obj, Object obj2, Object obj3, int i) {
        this.f30083 = i;
        this.f30084 = obj;
        this.f30082 = obj2;
        this.f30081 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30083) {
            case 0:
                final ViewOnClickListenerC22924 viewOnClickListenerC22924 = (ViewOnClickListenerC22924) this.f30084;
                final C20856 c20856 = (C20856) this.f30082;
                final byte[] bArr = (byte[]) this.f30081;
                final C18676 c18676M47130 = c20856.m47130();
                C7050.m16212(new Runnable() { // from class: l.᩻ܰ᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC22924.m51225(viewOnClickListenerC22924, c18676M47130, bArr, c20856);
                    }
                });
                break;
            default:
                C12664.m29126((C12664) this.f30084, (C10307) this.f30082, (C15100) this.f30081);
                break;
        }
    }
}
