package p067l;

/* JADX INFO: renamed from: l.֡۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2765 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f4660;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f4661;

    public /* synthetic */ RunnableC2765(int i, Object obj) {
        this.f4660 = i;
        this.f4661 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4660;
        Object obj = this.f4661;
        switch (i) {
            case 0:
                int i2 = C9471.f25926;
                ((C9471) obj).m22057(false);
                break;
            default:
                SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51630((SharedPreferencesOnSharedPreferenceChangeListenerC23180) obj);
                break;
        }
    }
}
