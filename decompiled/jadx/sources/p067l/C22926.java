package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩸ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: OARO */
/* JADX INFO: loaded from: classes4.dex */
public final class C22926 {

    /* JADX INFO: renamed from: ۜ */
    public int[] f72146;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC15548 f72147;

    /* JADX INFO: renamed from: ܳ */
    public C22042[] f72148;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC20503[] f72149;

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f72150;

    /* JADX INFO: renamed from: ᩳ */
    public final int f72151;

    /* JADX INFO: renamed from: ᩻ */
    public C11313[] f72153;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f72152 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f72145 = new ArrayList();

    public C22926(EnumC15548 enumC15548, int i) {
        new LinkedHashMap();
        this.f72150 = new ArrayList();
        this.f72147 = enumC15548;
        this.f72151 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C25117 m51243(AbstractC24266 abstractC24266, C20915 c20915) {
        C11115 c11115 = new C11115(this);
        C25117 c25117 = new C25117(new int[0]);
        c11115.m25636(abstractC24266, c20915 != null ? AbstractC18017.m40995(abstractC24266.f76891, c20915) : null, c25117, new HashSet(), new BitSet());
        return c25117;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C25117 m51242(AbstractC24266 abstractC24266) {
        C25117 c25117 = abstractC24266.f76894;
        if (c25117 != null) {
            return c25117;
        }
        C25117 c25117M51243 = m51243(abstractC24266, (C20915) null);
        abstractC24266.f76894 = c25117M51243;
        c25117M51243.m55132();
        return abstractC24266.f76894;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9103 m51240(int i) {
        ArrayList arrayList = this.f72145;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (AbstractC9103) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C25117 m51241(int i, C20915 c20915) {
        if (i >= 0) {
            ArrayList arrayList = this.f72152;
            if (i < arrayList.size()) {
                C25117 c25117M51242 = m51242((AbstractC24266) arrayList.get(i));
                if (!c25117M51242.m55129(-2)) {
                    return c25117M51242;
                }
                C25117 c25117 = new C25117(new int[0]);
                c25117.m55127(c25117M51242);
                c25117.m55130();
                while (c20915 != null && c20915.f65694 >= 0 && c25117M51242.m55129(-2)) {
                    c25117M51242 = m51242(((C10642) ((AbstractC24266) arrayList.get(c20915.f65694)).m53604(0)).f29431);
                    c25117.m55127(c25117M51242);
                    c25117.m55130();
                    c20915 = c20915.f65695;
                }
                if (c25117M51242.m55129(-2)) {
                    c25117.m55125(-1);
                }
                return c25117;
            }
        }
        throw new IllegalArgumentException("Invalid state number.");
    }
}
