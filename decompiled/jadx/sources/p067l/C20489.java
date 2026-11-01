package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20489 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f63283 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f63284 = new ArrayList();

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C20489(Map map, final Function function, final Function function2) {
        C12826.requireNonNull(map);
        C7480.stream(map.entrySet()).forEach(new Consumer() { // from class: l.ۖ᩺ۚ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C20489.m46227(this.f11868, function2, function, (Map.Entry) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46227(C20489 c20489, final Function function, Function function2, Map.Entry entry) {
        final ArrayList arrayList = new ArrayList();
        C21230.forEach((Set) entry.getValue(), new Consumer() { // from class: l.ۘ᩺ۚ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((C17450) function.apply((C23697) obj));
            }
        });
        if (((C23697) entry.getKey()).mo6581()) {
            c20489.f63283.add(new C20608((C17450) function2.apply((C23697) entry.getKey()), Integer.valueOf(((C3580) entry.getKey()).m6582()), arrayList));
        } else {
            c20489.f63284.add(new C8537((C17450) function2.apply((C23697) entry.getKey()), arrayList));
        }
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        ArrayList<C8537> arrayList = this.f63284;
        if (arrayList.isEmpty()) {
            ArrayList<C20608> arrayList2 = this.f63283;
            C8121 c8121 = (C8121) interfaceC2756;
            c8121.m18818(arrayList2.size());
            for (C20608 c20608 : arrayList2) {
                Object obj = c20608.f22916;
                Object obj2 = c20608.f63676;
                c8121.m18818(((C17450) obj).f23817);
                c8121.m18818(((Integer) c20608.f22917).intValue());
                List list = (List) obj2;
                c8121.m18818(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c8121.m18818(((C17450) it.next()).f23817);
                }
            }
            return;
        }
        C8121 c8122 = (C8121) interfaceC2756;
        c8122.m18818(arrayList.size());
        for (C8537 c8537 : arrayList) {
            c8122.m18818(((C17450) c8537.f22916).f23817);
            c8122.m18818(((List) c8537.f22917).size());
            Iterator it2 = ((List) c8537.f22917).iterator();
            while (it2.hasNext()) {
                c8122.m18818(((C17450) it2.next()).f23817);
            }
        }
    }

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        int size;
        int iSum;
        ArrayList arrayList = this.f63284;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f63283;
            size = (arrayList2.size() * 6) + 2;
            iSum = C7480.stream(arrayList2).mapToInt(new C11772()).filter(new C11101()).sum();
        } else {
            size = (arrayList.size() * 4) + 2;
            iSum = C7480.stream(arrayList).mapToInt(new C7811(1)).filter(new C17805()).sum();
        }
        return (iSum * 2) + size;
    }
}
