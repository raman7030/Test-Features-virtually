package p067l;

/* JADX INFO: renamed from: l.᩷ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BBU */
/* JADX INFO: loaded from: classes5.dex */
public final class C22268 extends C19034 {
    static {
        new C22268(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22268 m50090(C5583 c5583) {
        C12054 c12054 = C12054.f33582;
        int size = c5583.size();
        C8856[] c8856Arr = new C8856[size];
        int i = 0;
        C12054 c12055 = c12054;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC6924 abstractC6924M56513get = c5583.m56513get(i2);
            if (!(abstractC6924M56513get instanceof C16981)) {
                C12054 c12054M15863 = abstractC6924M56513get.m15863();
                if (!c12054M15863.equals(c12054) && !c12054M15863.m27611(c12055)) {
                    c8856Arr[i] = new C8856(abstractC6924M56513get.m15870(), c12054M15863);
                    i++;
                    c12055 = c12054M15863;
                }
            }
        }
        C22268 c22268 = new C22268(i);
        for (int i3 = 0; i3 < i; i3++) {
            c22268.m43241(i3, c8856Arr[i3]);
        }
        c22268.mo22326();
        return c22268;
    }
}
