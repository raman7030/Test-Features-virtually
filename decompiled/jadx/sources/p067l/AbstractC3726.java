package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3726 {

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC11100 f7895 = new C5068();

    /* JADX INFO: renamed from: ֫ */
    public final C11151 f7896;

    /* JADX INFO: renamed from: ۧ */
    public final C11151 f7897;

    /* JADX INFO: renamed from: ֫ */
    public abstract long mo7175(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7178(long j, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo7179(Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo7181(long j, Object obj);

    /* JADX INFO: renamed from: ܽ */
    public abstract long mo7182(Object obj);

    /* JADX INFO: renamed from: ܽ */
    public abstract Object mo7183(String str);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo7184(long j, Object obj);

    /* JADX INFO: renamed from: ᩳ */
    public abstract long mo7185(Object obj);

    public AbstractC3726(Collection collection) {
        boolean z;
        long jMo14683;
        boolean z2;
        C3055 c3055;
        AbstractC3726 abstractC3726 = this;
        abstractC3726.f7896 = new C11151(f7895);
        abstractC3726.f7897 = new C11151(f7895);
        C22700 c22700 = C22700.f71587;
        C3055 c3056 = new C3055(c22700, c22700);
        Iterator it = collection.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C22700 c22700M50810 = C22700.m50810(abstractC3726.mo7179(next));
            if (!c22700M50810.isEmpty()) {
                int iIndexOf = c22700M50810.indexOf(0);
                int i = 0;
                C3055 c3057 = c3056;
                while (iIndexOf != -1) {
                    int i2 = iIndexOf + 1;
                    C22700 c22700M50813 = c22700M50810.m50813(i, i2);
                    C3055 c3058 = (C3055) c3057.f5489.get(c22700M50813);
                    if (c3058 == null) {
                        C3055 c3059 = new C3055(c22700M50810.m50813(0, i2), c22700M50813);
                        c3057.f5489.put(c22700M50813, c3059);
                        if (c3057.f5489.size() == 20) {
                            c3057.f5489 = new HashMap(c3057.f5489);
                        }
                        c3058 = c3059;
                    }
                    if (iIndexOf == c22700M50810.length() - 1) {
                        c3058.f5490 = new C21162(abstractC3726, next);
                        c3058.f5493 = abstractC3726.mo7185(next);
                        break;
                    } else {
                        iIndexOf = c22700M50810.indexOf(i2);
                        i = i2;
                        c3057 = c3058;
                    }
                }
                if (iIndexOf == -1) {
                    C22700 c22700M50812 = c22700M50810.m50812(i);
                    C3055 c30510 = new C3055(c22700M50810, c22700M50812);
                    c30510.f5490 = new C21162(abstractC3726, next);
                    c30510.f5493 = abstractC3726.mo7185(next);
                    c3057.m5159(c22700M50812, c30510);
                }
            }
        }
        C20539 c20539 = new C20539();
        for (C3055 c30511 : c3056.f5489.values()) {
            if (c30511.m5160()) {
                c20539.add(new C20491(c30511));
            }
        }
        while (!c20539.isEmpty()) {
            C20491 c20491 = (C20491) c20539.get(c20539.size() - 1);
            C3055 c30512 = c20491.f63285;
            if (c20491.f63286) {
                c20539.pop();
                AbstractC6409 c7750 = c30512.f5490;
                long j = 0;
                if (c7750 == null) {
                    C22700 c22701 = c30512.f5491;
                    c7750 = new C7750(abstractC3726, c22701);
                    abstractC3726.f7897.put(c22701, c7750);
                    c30512.f5490 = c7750;
                    z2 = true;
                    jMo14683 = 0;
                } else {
                    jMo14683 = c7750.mo14683();
                    z2 = false;
                }
                long j2 = jMo14683;
                long j3 = 0;
                for (C3055 c30513 : c30512.f5489.values()) {
                    AbstractC6409 abstractC6409 = c30513.f5490;
                    C3055 c30514 = c3056;
                    long j4 = c30513.f5493;
                    long jMo14681 = abstractC6409.mo14681();
                    j = jMo14681 != -1 ? j + jMo14681 : j;
                    long jMo14677 = abstractC6409.mo14677();
                    j3 = jMo14677 != -1 ? j3 + jMo14677 : j3;
                    if (j4 > j2) {
                        j2 = j4;
                    }
                    c3056 = c30514;
                }
                c3055 = c3056;
                c7750.mo14680(j);
                c7750.mo14678(j3);
                if (z2) {
                    c7750.mo14682(j2);
                }
                c30512.f5493 = j2;
            } else {
                c20491.f63286 = z;
                for (C3055 c30515 : c30512.f5489.values()) {
                    if (c30515.m5160()) {
                        c20539.add(new C20491(c30515));
                    }
                }
                c3055 = c3056;
            }
            z = true;
            abstractC3726 = this;
            c3056 = c3055;
        }
        C20539 c205310 = new C20539();
        c205310.add(c3056);
        while (!c205310.isEmpty()) {
            C3055 c30516 = (C3055) c205310.pop();
            Collection<C3055> collectionValues = c30516.f5489.values();
            ArrayList arrayList = new ArrayList(collectionValues.size());
            for (C3055 c30517 : collectionValues) {
                AbstractC6409 abstractC64010 = c30517.f5490;
                C12826.requireNonNull(abstractC64010);
                arrayList.add(abstractC64010);
                if (c30517.m5160()) {
                    c205310.add(c30517);
                }
            }
            this.f7896.put(c30516.f5491, arrayList);
        }
        this.f7896.m25688();
        this.f7897.m25688();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m7176(String str) {
        AbstractC6409 abstractC6409 = (AbstractC6409) this.f7897.get(str);
        if (abstractC6409 == null) {
            return null;
        }
        return abstractC6409.mo14679();
    }

    /* JADX INFO: renamed from: ᩳ */
    private InterfaceC19157 m7174(String str) {
        if (str == null) {
            str = "";
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        List list = (List) this.f7896.get(str);
        if (list == null) {
            return C18486.empty();
        }
        return C7480.stream(list).map(new C17807());
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m7180(String str) {
        return (List) m7174(str).collect(C24205.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m7177(String str, Comparator comparator) {
        return (List) m7174(str).sorted(comparator).collect(C24205.toUnmodifiableList());
    }
}
