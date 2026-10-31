package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9BM */
/* JADX INFO: loaded from: classes2.dex */
public final class C0252 extends AbstractC9693 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f1535;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC9693 f1536;

    public C0252(AbstractC9693 abstractC9693, C12951 c12951) {
        super(abstractC9693);
        C22124.m49721(c12951, 20230);
        c12951.readInt();
        this.f1535 = c12951.m31506();
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1516(C10130 c10130) {
        c10130.mo13231(20230);
        c10130.m25436();
        c10130.m25439(this.f1535);
        c10130.m25418();
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1517(C20982 c20982) {
        if (c20982.f67769.add(this.f1535)) {
            try {
                AbstractC9693 abstractC9693Mo1512 = this.f29307.mo24638().m35658(this.f1535).mo1512(this);
                this.f1536 = abstractC9693Mo1512;
                abstractC9693Mo1512.mo1517(c20982);
            } catch (RuntimeException e) {
                throw new C3781(this.f29308, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m1518() {
        return this.f1535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1513(String str) {
        this.f1535 = str;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9693 mo1512(AbstractC9693 abstractC9693) {
        C0252 c0252 = new C0252(abstractC9693);
        c0252.f29308 = this.f29308;
        c0252.f1535 = this.f1535;
        return c0252;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1514(StringBuilder sb, int i) {
        sb.append(C9679.m24608(i, "\t"));
        sb.append("{\n");
        sb.append(C9679.m24608(i + 1, "\t"));
        sb.append("include: \"");
        sb.append(this.f1535);
        sb.append("\"\n");
        sb.append(C9679.m24608(i, "\t"));
        sb.append("}\n");
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1515(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C0252) it.next()).f1535.equals(this.f1535)) {
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add("include \"" + ((C0252) it2.next()).f1535 + "\"");
                }
                arrayList2.add("include \"" + this.f1535 + "\"");
                throw new C10837("There is a circular hard dependency: " + C9679.m24609(arrayList2, " > "));
            }
        }
        ArrayList arrayList3 = (ArrayList) arrayList.clone();
        arrayList3.add(this);
        if (this.f1536 == null) {
            this.f1536 = this.f29307.mo24638().m35658(this.f1535).mo1512(this);
        }
        this.f1536.mo1515(arrayList3);
    }
}
