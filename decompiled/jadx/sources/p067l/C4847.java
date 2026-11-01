package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۖܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8FZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4847 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f11028;

    /* JADX INFO: renamed from: ۧ */
    public final List f11029;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15599 f11030;

    public C4847(AbstractC15599 abstractC15599, List list, int i) {
        this.f11030 = abstractC15599;
        this.f11029 = list;
        this.f11028 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4847)) {
            return false;
        }
        C4847 c4847 = (C4847) obj;
        return this.f11028 == c4847.f11028 && C12826.equals(this.f11030, c4847.f11030) && C12826.equals(this.f11029, c4847.f11029);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f11029) + ((C12826.hashCode(this.f11030) + (this.f11028 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f11030, this.f11029, Integer.valueOf(this.f11028)};
        String[] strArrSplit = "visitor;fileItems;currentIndex".length() == 0 ? new String[0] : "visitor;fileItems;currentIndex".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder("MediaArguments[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10273() {
        return this.f11028;
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m10274() {
        return this.f11029;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC15599 m10275() {
        return this.f11030;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4847 m10272(AbstractActivityC5549 abstractActivityC5549, String str) {
        List<InterfaceC19370> list;
        try {
            int i = C18524.f55316;
            AbstractC17043 abstractC17043M42105 = C18524.m42105(abstractActivityC5549.getIntent());
            String name = abstractC17043M42105.getName();
            C4744 c4744 = C4744.f10749;
            Future futureSubmit = C4081.f8987.submit(new CallableC19116(1, c4744, abstractC17043M42105));
            try {
                list = (List) futureSubmit.get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
                futureSubmit.cancel(true);
                list = Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            int size = -1;
            for (InterfaceC19370 interfaceC19370 : list) {
                if (interfaceC19370.getName().equals(name)) {
                    size = arrayList.size();
                    arrayList.add(interfaceC19370);
                } else if (interfaceC19370.mo39137().startsWith(str)) {
                    arrayList.add(interfaceC19370);
                }
            }
            if (size == -1) {
                arrayList.add(0, new C11450(abstractC17043M42105));
                size = 0;
            }
            InterfaceC19370 interfaceC19371 = (InterfaceC19370) arrayList.get(size);
            C9486.m22095(arrayList, 0, false);
            return new C4847(c4744, arrayList, arrayList.indexOf(interfaceC19371));
        } catch (Exception unused2) {
            return null;
        }
    }
}
