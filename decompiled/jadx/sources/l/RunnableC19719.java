package l;

/* JADX INFO: renamed from: l.᩵᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19719 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63725;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63726;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63727;

    public /* synthetic */ RunnableC19719(int i, Object obj, Object obj2) {
        this.f63726 = i;
        this.f63727 = obj;
        this.f63725 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63726) {
            case 0:
                C9170 c9170 = (C9170) this.f63727;
                C12392 c12392 = (C12392) this.f63725;
                if (c9170.m23581()) {
                    c12392.m30456(false);
                }
                break;
            case 1:
                SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49278((SharedPreferencesOnSharedPreferenceChangeListenerC21897) this.f63727, (C13136) this.f63725);
                break;
            case 2:
                ((C0603) this.f63727).m2479((C12392) this.f63725);
                break;
            default:
                C6058.m16909((C16560) this.f63727, (InterfaceC17889) this.f63725);
                break;
        }
    }
}
