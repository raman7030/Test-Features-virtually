package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBAF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18905 extends AbstractC1181 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15375 f59575;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f59576;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 f59577;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f59578;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f59579;

    public C18905(C10191 c10191, C15375 c15375, ArrayList arrayList, AbstractC13717 abstractC13717) {
        super(c10191, C20069.f65002);
        if (c15375 == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.f59577 = abstractC13717;
        if (abstractC13717 == C12512.f37593 || abstractC13717 == C12512.f37584) {
            this.f59576 = 1;
        } else if (abstractC13717 == C12512.f37602 || abstractC13717 == C12512.f37589) {
            this.f59576 = 2;
        } else if (abstractC13717 == C12512.f37582 || abstractC13717 == C12512.f37594) {
            this.f59576 = 4;
        } else if (abstractC13717 == C12512.f37596 || abstractC13717 == C12512.f37591) {
            this.f59576 = 8;
        } else {
            throw new IllegalArgumentException("Unexpected constant type");
        }
        this.f59575 = c15375;
        this.f59578 = arrayList;
        this.f59579 = arrayList.size();
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ۧ */
    public final int mo2084() {
        return (((this.f59579 * this.f59576) + 1) / 2) + 4;
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final void mo2082(C18241 c18241) {
        ArrayList arrayList = this.f59578;
        int size = arrayList.size();
        c18241.m42511(768);
        int i = this.f59576;
        c18241.m42511(i);
        c18241.m42514(this.f59579);
        if (i == 1) {
            for (int i2 = 0; i2 < size; i2++) {
                c18241.m42517((byte) ((AbstractC0517) ((AbstractC13717) arrayList.get(i2))).mo2231());
            }
        } else if (i == 2) {
            for (int i3 = 0; i3 < size; i3++) {
                c18241.m42511((short) ((AbstractC0517) ((AbstractC13717) arrayList.get(i3))).mo2231());
            }
        } else if (i == 4) {
            for (int i4 = 0; i4 < size; i4++) {
                c18241.m42514(((AbstractC0517) ((AbstractC13717) arrayList.get(i4))).mo2231());
            }
        } else if (i == 8) {
            for (int i5 = 0; i5 < size; i5++) {
                c18241.m42502(((AbstractC5457) ((AbstractC13717) arrayList.get(i5))).mo2227());
            }
        }
        if (i != 1 || size % 2 == 0) {
            return;
        }
        c18241.m42517(0);
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4793 mo2081(C20069 c20069) {
        return new C18905(m13983(), this.f59575, this.f59578, this.f59577);
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final String mo2080() {
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f59578;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n    ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC13717) arrayList.get(i)).mo2463());
        }
        return sb.toString();
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ܺ */
    public final String mo2085() {
        int iM13990 = this.f59575.m13990();
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f59578;
        int size = arrayList.size();
        sb.append("fill-array-data-payload // for fill-array-data @ ");
        sb.append(C14712.m35006(iM13990));
        for (int i = 0; i < size; i++) {
            sb.append("\n  ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC13717) arrayList.get(i)).mo2463());
        }
        return sb.toString();
    }
}
