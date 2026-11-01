package p067l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11198 extends AbstractC3150 implements InterfaceC15001 {

    /* JADX INFO: renamed from: ۗ */
    public final C7174 f31111;

    /* JADX INFO: renamed from: ۙ */
    public final int f31112;

    /* JADX INFO: renamed from: ۛ */
    public final C4492[] f31113;

    /* JADX INFO: renamed from: ۤ */
    public HashMap f31114;

    /* JADX INFO: renamed from: ۨ */
    public final C4492[] f31115;

    /* JADX INFO: renamed from: ۫ */
    public C24449 f31116;

    /* JADX INFO: renamed from: ۬ */
    public final String f31117;

    /* JADX INFO: renamed from: ᩶ */
    public ReferenceQueue f31118;

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC24548 mo3533() {
        return this.f31116;
    }

    @Override // p067l.AbstractC3150
    public final String getName() {
        return this.f31116.getName();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ܿ */
    public final String mo3542() {
        return this.f31117;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۧ */
    public final C7174 mo3535() {
        return this.f31111;
    }

    /* JADX INFO: renamed from: ܺ */
    public final List m25863() {
        return C21562.unmodifiableList(Arrays.asList(this.f31113));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4492 m25861(String str) {
        C24608 c24608 = this.f31111.f18731;
        String str2 = this.f31117 + '.' + str;
        c24608.getClass();
        AbstractC3150 abstractC3150M54246 = c24608.m54246(str2, EnumC15890.ALL_SYMBOLS);
        if (abstractC3150M54246 instanceof C4492) {
            return (C4492) abstractC3150M54246;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m25862(int i) {
        C4492 c4492;
        C4492 c4492M25860 = m25860(i);
        if (c4492M25860 != null) {
            return c4492M25860;
        }
        synchronized (this) {
            if (this.f31118 == null) {
                this.f31118 = new ReferenceQueue();
                this.f31114 = new HashMap();
            } else {
                while (true) {
                    C21927 c21927 = (C21927) this.f31118.poll();
                    if (c21927 == null) {
                        break;
                    }
                    this.f31114.remove(Integer.valueOf(c21927.f68945));
                }
            }
            WeakReference weakReference = (WeakReference) this.f31114.get(Integer.valueOf(i));
            c4492 = weakReference == null ? null : (C4492) weakReference.get();
            if (c4492 == null) {
                c4492 = new C4492(this, Integer.valueOf(i));
                this.f31114.put(Integer.valueOf(i), new C21927(i, c4492));
            }
        }
        return c4492;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C11198(C24449 c24449, C7174 c7174, C19244 c19244) throws C8515 {
        int i = 0;
        super(i);
        this.f31114 = null;
        this.f31118 = null;
        if (c19244 == null) {
            this.f5767 = c7174;
        } else {
            this.f5767 = c19244;
        }
        this.f31116 = c24449;
        this.f31117 = C23268.m51807(c7174, c19244, c24449.getName());
        this.f31111 = c7174;
        if (c24449.m53956() == 0) {
            throw new C8515(this, "Enums must contain at least one value.", i);
        }
        this.f31113 = new C4492[c24449.m53956()];
        for (int i2 = 0; i2 < c24449.m53956(); i2++) {
            this.f31113[i2] = new C4492(c24449.m53953(i2), c7174, this, i2);
        }
        C4492[] c4492Arr = (C4492[]) this.f31113.clone();
        this.f31115 = c4492Arr;
        Arrays.sort(c4492Arr, C4492.f10086);
        for (int i3 = 1; i3 < c24449.m53956(); i3++) {
            C4492[] c4492Arr2 = this.f31115;
            C4492 c4492 = c4492Arr2[i];
            C4492 c4493 = c4492Arr2[i3];
            if (c4492.getNumber() != c4493.getNumber()) {
                i++;
                this.f31115[i] = c4493;
            }
        }
        int i4 = i + 1;
        this.f31112 = i4;
        Arrays.fill(this.f31115, i4, c24449.m53956(), (Object) null);
        c7174.f18731.m54247(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25858(C11198 c11198) {
        c11198.m5384(c11198.f31116.m53954().m8014());
        for (C4492 c4492 : c11198.f31113) {
            C4492.m9499(c4492);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4492 m25860(int i) {
        int i2 = this.f31112 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            C4492 c4492 = this.f31115[i4];
            int number = c4492.getNumber();
            if (i < number) {
                i2 = i4 - 1;
            } else {
                if (i <= number) {
                    return c4492;
                }
                i3 = i4 + 1;
            }
        }
        return null;
    }
}
