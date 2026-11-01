package p067l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E4Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14093 extends AbstractC12811 implements InterfaceC10921 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC3167 f39949 = EnumC3167.f6043;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractCollection f39950;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    public C14093(ArrayList arrayList, int i) {
        super(f39949);
        if (arrayList == null) {
            this.f39950 = AbstractC16192.m36872of();
            return;
        }
        this.f39950 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f39950.add(new C13423(this, i, (C18845) it.next()));
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // p067l.InterfaceC18811
    /* JADX INFO: renamed from: ۙ */
    public final List mo10139() {
        return this.f39950;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // p067l.AbstractC9476, p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۚ */
    public final int mo6216() {
        return (this.f39950.size() * 2) + 4;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f39949.f6090;
    }
}
