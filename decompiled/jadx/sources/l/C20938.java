package l;

/* JADX INFO: renamed from: l.᩷ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BBU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20938 extends C17535 {
    static {
        new C20938(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20938 m47760(C3382 c3382) {
        C10191 c10191 = C10191.f30620;
        int size = c3382.size();
        C6826[] c6826Arr = new C6826[size];
        int i = 0;
        C10191 c10192 = c10191;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC4793 abstractC4793M40993get = c3382.m40993get(i2);
            if (!(abstractC4793M40993get instanceof C15375)) {
                C10191 c10191M13983 = abstractC4793M40993get.m13983();
                if (!c10191M13983.equals(c10191) && !c10191M13983.m25589(c10192)) {
                    c6826Arr[i] = new C6826(abstractC4793M40993get.m13990(), c10191M13983);
                    i++;
                    c10192 = c10191M13983;
                }
            }
        }
        C20938 c20938 = new C20938(i);
        for (int i3 = 0; i3 < i; i3++) {
            c20938.m40981(i3, c6826Arr[i3]);
        }
        c20938.mo20349();
        return c20938;
    }
}
