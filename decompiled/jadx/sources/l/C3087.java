package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes3.dex */
public final class C3087 extends AbstractC13669 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f9661;

    public C3087(EnumC17734 enumC17734, int i) {
        super(enumC17734);
        this.f9661 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9437(int i, int i2, int i3) {
        C4498 c4498 = new C4498();
        c4498.f14316 = i;
        c4498.f14315 = i2;
        c4498.f14314 = i3;
        this.f9661.add(c4498);
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        ArrayList<C4498> arrayList = this.f9661;
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(arrayList.size());
        for (C4498 c4498 : arrayList) {
            c6053.m16889(c4498.f14316);
            c6053.m16889(c4498.f14315);
            c6053.m16889(c4498.f14314);
        }
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        return (this.f9661.size() * 6) + 2;
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo9438() {
        ArrayList arrayList = this.f9661;
        String strConcat = String.format("{ %d {", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            strConcat = strConcat.concat(String.format(" [%d]: %s;", Integer.valueOf(i), ((C4498) it.next()).toString()));
            i++;
        }
        return strConcat.concat(" } }");
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo9436() {
        final StringBuilder sb = new StringBuilder();
        C5378.stream(this.f9661).forEach(new Consumer() { // from class: l.᩶۟ۚ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4498 c4498 = (C4498) obj;
                sb.append("{ " + c4498.f14316 + " " + c4498.f14315 + " " + c4498.f14314 + " }");
            }
        });
        return sb.toString();
    }
}
