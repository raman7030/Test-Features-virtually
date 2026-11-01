package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3053 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f5480 = new ArrayList();

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f5479 = new ArrayList();

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C3053(Set set, final Function function, final C18476 c18476) {
        C12826.requireNonNull(set);
        C21230.forEach(set, new Consumer() { // from class: l.᩵᩺ۚ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C17450 c17450;
                C23697 c23697 = (C23697) obj;
                boolean zMo6581 = c23697.mo6581();
                C3053 c3053 = this.f66475;
                Function function2 = function;
                if (!zMo6581) {
                    c3053.f5480.add((C17450) function2.apply(c23697));
                    return;
                }
                ArrayList arrayList = c3053.f5479;
                C17450 c17451 = (C17450) function2.apply(c23697);
                Integer numValueOf = Integer.valueOf(((C3580) c23697).m6582());
                C6933 c6933 = (C6933) c23697;
                if (c6933.m15894() == null) {
                    c17450 = null;
                } else {
                    c17450 = (C17450) c18476.apply(c6933.m15894());
                }
                arrayList.add(new C20608(c17451, numValueOf, c17450));
            }
        });
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        ArrayList arrayList = this.f5480;
        if (arrayList.isEmpty()) {
            ArrayList<C20608> arrayList2 = this.f5479;
            C8121 c8121 = (C8121) interfaceC2756;
            c8121.m18818(arrayList2.size());
            for (C20608 c20608 : arrayList2) {
                c8121.m18818(((C17450) c20608.f22916).f23817);
                c8121.m18818(((Integer) c20608.f22917).intValue());
                Object obj = c20608.f63676;
                c8121.m18818(obj == null ? 0 : ((C17450) obj).f23817);
            }
            return;
        }
        C8121 c8122 = (C8121) interfaceC2756;
        c8122.m18818(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c8122.m18818(((C17450) it.next()).f23817);
        }
    }

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        int size;
        ArrayList arrayList = this.f5480;
        if (arrayList.isEmpty()) {
            size = this.f5479.size() * 6;
        } else {
            size = arrayList.size() * 2;
        }
        return size + 2;
    }
}
