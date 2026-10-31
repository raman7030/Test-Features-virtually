package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ATX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2370 extends AbstractC9693 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f7566;

    public C2370(AbstractC9693 abstractC9693, C12951 c12951) {
        super(abstractC9693);
        C22124.m49721(c12951, 20227);
        c12951.readInt();
        int iM31494 = c12951.m31494();
        ArrayList arrayList = new ArrayList(iM31494);
        for (int i = 0; i < iM31494; i++) {
            arrayList.add(AbstractC9693.m24637(this, c12951));
        }
        this.f7566 = C20195.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1516(C10130 c10130) {
        c10130.mo13231(20227);
        c10130.m25436();
        c10130.mo13231(this.f7566.size());
        Iterator it = this.f7566.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1516(c10130);
        }
        c10130.m25418();
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1517(C20982 c20982) {
        Iterator it = this.f7566.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1517(c20982);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7685(ArrayList arrayList) {
        this.f7566 = C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m7684() {
        return this.f7566;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9693 mo1512(final AbstractC9693 abstractC9693) {
        C2370 c2370 = new C2370(abstractC9693);
        c2370.f29308 = this.f29308;
        c2370.f7566 = (List) C5378.stream(this.f7566).map(new Function() { // from class: l.ܺۜܿ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AbstractC9693) obj).mo1512(abstractC9693);
            }
        }).collect(C22976.toList());
        return c2370;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1514(StringBuilder sb, int i) {
        sb.append(C9679.m24608(i, "\t"));
        sb.append("{\n");
        Iterator it = this.f7566.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1514(sb, i + 1);
        }
        sb.append(C9679.m24608(i, "\t"));
        sb.append("}\n");
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1515(ArrayList arrayList) {
        Iterator it = this.f7566.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1515(arrayList);
        }
    }
}
