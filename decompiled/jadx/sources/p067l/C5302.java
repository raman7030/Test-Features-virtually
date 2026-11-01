package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5302 extends AbstractC15359 {

    /* JADX INFO: renamed from: ᩹ */
    public ArrayList f12464;

    public C5302(EnumC19222 enumC19222, int i) {
        super(enumC19222);
        this.f12464 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11480(int i, int i2, int i3) {
        C6643 c6643 = new C6643();
        c6643.f17143 = i;
        c6643.f17142 = i2;
        c6643.f17141 = i3;
        this.f12464.add(c6643);
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        ArrayList<C6643> arrayList = this.f12464;
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(arrayList.size());
        for (C6643 c6643 : arrayList) {
            c8121.m18818(c6643.f17143);
            c8121.m18818(c6643.f17142);
            c8121.m18818(c6643.f17141);
        }
    }

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return (this.f12464.size() * 6) + 2;
    }

    @Override // p067l.AbstractC15359
    /* JADX INFO: renamed from: ܽ */
    public final String mo11481() {
        ArrayList arrayList = this.f12464;
        String strConcat = String.format("{ %d {", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            strConcat = strConcat.concat(String.format(" [%d]: %s;", Integer.valueOf(i), ((C6643) it.next()).toString()));
            i++;
        }
        return strConcat.concat(" } }");
    }

    @Override // p067l.AbstractC15359
    /* JADX INFO: renamed from: ֫ */
    public final String mo11479() {
        final StringBuilder sb = new StringBuilder();
        C7480.stream(this.f12464).forEach(new Consumer() { // from class: l.᩶۟ۚ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C6643 c6643 = (C6643) obj;
                sb.append("{ " + c6643.f17143 + " " + c6643.f17142 + " " + c6643.f17141 + " }");
            }
        });
        return sb.toString();
    }
}
