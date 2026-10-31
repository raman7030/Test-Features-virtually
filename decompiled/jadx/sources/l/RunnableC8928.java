package l;

/* JADX INFO: renamed from: l.ۡܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8928 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27146;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27147;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27148;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27149;

    public /* synthetic */ RunnableC8928(Object obj, Object obj2, Object obj3, int i) {
        this.f27148 = i;
        this.f27149 = obj;
        this.f27147 = obj2;
        this.f27146 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27148) {
            case 0:
                final ViewOnClickListenerC21628 viewOnClickListenerC21628 = (ViewOnClickListenerC21628) this.f27149;
                final C19452 c19452 = (C19452) this.f27147;
                final byte[] bArr = (byte[]) this.f27146;
                final C17159 c17159M44834 = c19452.m44834();
                C4925.m14315(new Runnable() { // from class: l.᩻ܰ᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC21628.m48877(viewOnClickListenerC21628, c17159M44834, bArr, c19452);
                    }
                });
                break;
            default:
                C10833.m27081((C10833) this.f27149, (C8353) this.f27147, (C13396) this.f27146);
                break;
        }
    }
}
