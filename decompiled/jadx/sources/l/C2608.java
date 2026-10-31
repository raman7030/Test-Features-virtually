package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۖܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8FZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2608 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f8234;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f8235;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f8236;

    public C2608(AbstractC13921 abstractC13921, List list, int i) {
        this.f8236 = abstractC13921;
        this.f8235 = list;
        this.f8234 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2608)) {
            return false;
        }
        C2608 c2608 = (C2608) obj;
        return this.f8234 == c2608.f8234 && C11003.equals(this.f8236, c2608.f8236) && C11003.equals(this.f8235, c2608.f8235);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f8235) + ((C11003.hashCode(this.f8236) + (this.f8234 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f8236, this.f8235, Integer.valueOf(this.f8234)};
        String[] strArrSplit = "visitor;fileItems;currentIndex".length() == 0 ? new String[0] : "visitor;fileItems;currentIndex".split(l.b);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8232() {
        return this.f8234;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m8233() {
        return this.f8235;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 m8234() {
        return this.f8236;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2608 m8231(AbstractActivityC3346 abstractActivityC3346, String str) {
        List<InterfaceC17889> list;
        try {
            int i = C16999.f52136;
            AbstractC15440 abstractC15440M39862 = C16999.m39862(abstractActivityC3346.getIntent());
            String name = abstractC15440M39862.getName();
            C2499 c2499 = C2499.f7958;
            Future futureSubmit = C1802.f6208.submit(new CallableC17621(1, c2499, abstractC15440M39862));
            try {
                list = (List) futureSubmit.get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
                futureSubmit.cancel(true);
                list = Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            int size = -1;
            for (InterfaceC17889 interfaceC17889 : list) {
                if (interfaceC17889.getName().equals(name)) {
                    size = arrayList.size();
                    arrayList.add(interfaceC17889);
                } else if (interfaceC17889.mo36971().startsWith(str)) {
                    arrayList.add(interfaceC17889);
                }
            }
            if (size == -1) {
                arrayList.add(0, new C9555(abstractC15440M39862));
                size = 0;
            }
            InterfaceC17889 interfaceC178810 = (InterfaceC17889) arrayList.get(size);
            C7489.m20119(arrayList, 0, false);
            return new C2608(c2499, arrayList, arrayList.indexOf(interfaceC178810));
        } catch (Exception unused2) {
            return null;
        }
    }
}
