package l;

/* JADX INFO: renamed from: l.֡۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0417 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1883;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1884;

    public /* synthetic */ RunnableC0417(int i, Object obj) {
        this.f1883 = i;
        this.f1884 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1883;
        Object obj = this.f1884;
        switch (i) {
            case 0:
                int i2 = C7473.f23014;
                ((C7473) obj).m20082(false);
                break;
            default:
                SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49277((SharedPreferencesOnSharedPreferenceChangeListenerC21897) obj);
                break;
        }
    }
}
