package p067l;

/* JADX INFO: renamed from: l.᩵᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21110 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f66356;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f66357;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f66358;

    public /* synthetic */ RunnableC21110(int i, Object obj, Object obj2) {
        this.f66357 = i;
        this.f66358 = obj;
        this.f66356 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66357) {
            case 0:
                C11084 c11084 = (C11084) this.f66358;
                C14146 c14146 = (C14146) this.f66356;
                if (c11084.m25532()) {
                    c14146.m32520(false);
                }
                break;
            case 1:
                SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51631((SharedPreferencesOnSharedPreferenceChangeListenerC23180) this.f66358, (C14853) this.f66356);
                break;
            case 2:
                ((C2942) this.f66358).m4835((C14146) this.f66356);
                break;
            default:
                C8126.m18838((C18107) this.f66358, (InterfaceC19370) this.f66356);
                break;
        }
    }
}
