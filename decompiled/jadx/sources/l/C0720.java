package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0720 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f2708 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f2707 = new ArrayList();

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C0720(Set set, final Function function, final C16948 c16948) {
        C11003.requireNonNull(set);
        C19846.forEach(set, new Consumer() { // from class: l.᩵᩺ۚ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C15869 c15869;
                C22442 c22442 = (C22442) obj;
                boolean zMo4335 = c22442.mo4335();
                C0720 c0720 = this.f63837;
                Function function2 = function;
                if (!zMo4335) {
                    c0720.f2708.add((C15869) function2.apply(c22442));
                    return;
                }
                ArrayList arrayList = c0720.f2707;
                C15869 c158610 = (C15869) function2.apply(c22442);
                Integer numValueOf = Integer.valueOf(((C1275) c22442).m4336());
                C4803 c4803 = (C4803) c22442;
                if (c4803.m14014() == null) {
                    c15869 = null;
                } else {
                    c15869 = (C15869) c16948.apply(c4803.m14014());
                }
                arrayList.add(new C19192(c158610, numValueOf, c15869));
            }
        });
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        ArrayList arrayList = this.f2708;
        if (arrayList.isEmpty()) {
            ArrayList<C19192> arrayList2 = this.f2707;
            C6053 c6053 = (C6053) interfaceC0408;
            c6053.m16889(arrayList2.size());
            for (C19192 c19192 : arrayList2) {
                c6053.m16889(((C15869) c19192.f20042).f20943);
                c6053.m16889(((Integer) c19192.f20043).intValue());
                Object obj = c19192.f60446;
                c6053.m16889(obj == null ? 0 : ((C15869) obj).f20943);
            }
            return;
        }
        C6053 c6054 = (C6053) interfaceC0408;
        c6054.m16889(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c6054.m16889(((C15869) it.next()).f20943);
        }
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        int size;
        ArrayList arrayList = this.f2708;
        if (arrayList.isEmpty()) {
            size = this.f2707.size() * 6;
        } else {
            size = arrayList.size() * 2;
        }
        return size + 2;
    }
}
