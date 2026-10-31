package l;

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
public final class C19066 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f60049 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f60050 = new ArrayList();

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C19066(Map map, final Function function, final Function function2) {
        C11003.requireNonNull(map);
        C5378.stream(map.entrySet()).forEach(new Consumer() { // from class: l.ۖ᩺ۚ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C19066.m43933(this.f9071, function2, function, (Map.Entry) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43933(C19066 c19066, final Function function, Function function2, Map.Entry entry) {
        final ArrayList arrayList = new ArrayList();
        C19846.forEach((Set) entry.getValue(), new Consumer() { // from class: l.ۘ᩺ۚ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((C15869) function.apply((C22442) obj));
            }
        });
        if (((C22442) entry.getKey()).mo4335()) {
            c19066.f60049.add(new C19192((C15869) function2.apply((C22442) entry.getKey()), Integer.valueOf(((C1275) entry.getKey()).m4336()), arrayList));
        } else {
            c19066.f60050.add(new C6491((C15869) function2.apply((C22442) entry.getKey()), arrayList));
        }
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        ArrayList<C6491> arrayList = this.f60050;
        if (arrayList.isEmpty()) {
            ArrayList<C19192> arrayList2 = this.f60049;
            C6053 c6053 = (C6053) interfaceC0408;
            c6053.m16889(arrayList2.size());
            for (C19192 c19192 : arrayList2) {
                Object obj = c19192.f20042;
                Object obj2 = c19192.f60446;
                c6053.m16889(((C15869) obj).f20943);
                c6053.m16889(((Integer) c19192.f20043).intValue());
                List list = (List) obj2;
                c6053.m16889(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c6053.m16889(((C15869) it.next()).f20943);
                }
            }
            return;
        }
        C6053 c6054 = (C6053) interfaceC0408;
        c6054.m16889(arrayList.size());
        for (C6491 c6491 : arrayList) {
            c6054.m16889(((C15869) c6491.f20042).f20943);
            c6054.m16889(((List) c6491.f20043).size());
            Iterator it2 = ((List) c6491.f20043).iterator();
            while (it2.hasNext()) {
                c6054.m16889(((C15869) it2.next()).f20943);
            }
        }
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        int size;
        int iSum;
        ArrayList arrayList = this.f60050;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f60049;
            size = (arrayList2.size() * 6) + 2;
            iSum = C5378.stream(arrayList2).mapToInt(new C9894()).filter(new C9188()).sum();
        } else {
            size = (arrayList.size() * 4) + 2;
            iSum = C5378.stream(arrayList).mapToInt(new C5727(1)).filter(new C16242()).sum();
        }
        return (iSum * 2) + size;
    }
}
