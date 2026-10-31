package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1428 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC9187 f5122 = new C2840();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9241 f5123;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9241 f5124;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract long mo4932(Object obj);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo4935(long j, Object obj);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract String mo4936(Object obj);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo4938(long j, Object obj);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract long mo4939(Object obj);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract Object mo4940(String str);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo4941(long j, Object obj);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract long mo4942(Object obj);

    public AbstractC1428(Collection collection) {
        boolean z;
        long jMo12803;
        boolean z2;
        C0722 c0722;
        AbstractC1428 abstractC1428 = this;
        abstractC1428.f5123 = new C9241(f5122);
        abstractC1428.f5124 = new C9241(f5122);
        C21393 c21393 = C21393.f68892;
        C0722 c0723 = new C0722(c21393, c21393);
        Iterator it = collection.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C21393 c21393M48474 = C21393.m48474(abstractC1428.mo4936(next));
            if (!c21393M48474.isEmpty()) {
                int iIndexOf = c21393M48474.indexOf(0);
                int i = 0;
                C0722 c0724 = c0723;
                while (iIndexOf != -1) {
                    int i2 = iIndexOf + 1;
                    C21393 c21393M48477 = c21393M48474.m48477(i, i2);
                    C0722 c0725 = (C0722) c0724.f2717.get(c21393M48477);
                    if (c0725 == null) {
                        C0722 c0726 = new C0722(c21393M48474.m48477(0, i2), c21393M48477);
                        c0724.f2717.put(c21393M48477, c0726);
                        if (c0724.f2717.size() == 20) {
                            c0724.f2717 = new HashMap(c0724.f2717);
                        }
                        c0725 = c0726;
                    }
                    if (iIndexOf == c21393M48474.length() - 1) {
                        c0725.f2718 = new C19774(abstractC1428, next);
                        c0725.f2721 = abstractC1428.mo4942(next);
                        break;
                    } else {
                        iIndexOf = c21393M48474.indexOf(i2);
                        i = i2;
                        c0724 = c0725;
                    }
                }
                if (iIndexOf == -1) {
                    C21393 c21393M48476 = c21393M48474.m48476(i);
                    C0722 c0727 = new C0722(c21393M48474, c21393M48476);
                    c0727.f2718 = new C19774(abstractC1428, next);
                    c0727.f2721 = abstractC1428.mo4942(next);
                    c0724.m2830(c21393M48476, c0727);
                }
            }
        }
        C19119 c19119 = new C19119();
        for (C0722 c0728 : c0723.f2717.values()) {
            if (c0728.m2831()) {
                c19119.add(new C19068(c0728));
            }
        }
        while (!c19119.isEmpty()) {
            C19068 c19068 = (C19068) c19119.get(c19119.size() - 1);
            C0722 c0729 = c19068.f60051;
            if (c19068.f60052) {
                c19119.pop();
                AbstractC4251 c5662 = c0729.f2718;
                long j = 0;
                if (c5662 == null) {
                    C21393 c21394 = c0729.f2719;
                    c5662 = new C5662(abstractC1428, c21394);
                    abstractC1428.f5124.put(c21394, c5662);
                    c0729.f2718 = c5662;
                    z2 = true;
                    jMo12803 = 0;
                } else {
                    jMo12803 = c5662.mo12803();
                    z2 = false;
                }
                long j2 = jMo12803;
                long j3 = 0;
                for (C0722 c07210 : c0729.f2717.values()) {
                    AbstractC4251 abstractC4251 = c07210.f2718;
                    C0722 c07211 = c0723;
                    long j4 = c07210.f2721;
                    long jMo12801 = abstractC4251.mo12801();
                    j = jMo12801 != -1 ? j + jMo12801 : j;
                    long jMo12797 = abstractC4251.mo12797();
                    j3 = jMo12797 != -1 ? j3 + jMo12797 : j3;
                    if (j4 > j2) {
                        j2 = j4;
                    }
                    c0723 = c07211;
                }
                c0722 = c0723;
                c5662.mo12800(j);
                c5662.mo12798(j3);
                if (z2) {
                    c5662.mo12802(j2);
                }
                c0729.f2721 = j2;
            } else {
                c19068.f60052 = z;
                for (C0722 c07212 : c0729.f2717.values()) {
                    if (c07212.m2831()) {
                        c19119.add(new C19068(c07212));
                    }
                }
                c0722 = c0723;
            }
            z = true;
            abstractC1428 = this;
            c0723 = c0722;
        }
        C19119 c191110 = new C19119();
        c191110.add(c0723);
        while (!c191110.isEmpty()) {
            C0722 c07213 = (C0722) c191110.pop();
            Collection<C0722> collectionValues = c07213.f2717.values();
            ArrayList arrayList = new ArrayList(collectionValues.size());
            for (C0722 c07214 : collectionValues) {
                AbstractC4251 abstractC4252 = c07214.f2718;
                C11003.requireNonNull(abstractC4252);
                arrayList.add(abstractC4252);
                if (c07214.m2831()) {
                    c191110.add(c07214);
                }
            }
            this.f5123.put(c07213.f2719, arrayList);
        }
        this.f5123.m23688();
        this.f5124.m23688();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m4933(String str) {
        AbstractC4251 abstractC4251 = (AbstractC4251) this.f5124.get(str);
        if (abstractC4251 == null) {
            return null;
        }
        return abstractC4251.mo12799();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private InterfaceC17664 m4931(String str) {
        if (str == null) {
            str = "";
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        List list = (List) this.f5123.get(str);
        if (list == null) {
            return C16958.empty();
        }
        return C5378.stream(list).map(new C16244());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m4937(String str) {
        return (List) m4931(str).collect(C22976.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m4934(String str, Comparator comparator) {
        return (List) m4931(str).sorted(comparator).collect(C22976.toUnmodifiableList());
    }
}
