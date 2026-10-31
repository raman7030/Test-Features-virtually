package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: SARS */
/* JADX INFO: loaded from: classes2.dex */
public final class C1372 extends AbstractC9693 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f5004;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f5005;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f5006;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f5007;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5606 f5008;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f5009;

    public C1372(AbstractC9693 abstractC9693) {
        super(abstractC9693);
        List list = Collections.EMPTY_LIST;
        this.f5006 = list;
        this.f5009 = list;
        this.f5004 = list;
    }

    public C1372(AbstractC9693 abstractC9693, C12951 c12951) {
        super(abstractC9693);
        List list = Collections.EMPTY_LIST;
        this.f5006 = list;
        this.f5009 = list;
        this.f5004 = list;
        C22124.m49721(c12951, 20225);
        c12951.readInt();
        this.f5007 = c12951.m31503();
        int iM31494 = c12951.m31494();
        int iM31495 = c12951.m31494();
        ArrayList arrayList = new ArrayList(iM31495 + 1);
        ArrayList arrayList2 = new ArrayList(iM31495);
        arrayList.add(c12951.m31504());
        for (int i = 0; i < iM31495; i++) {
            arrayList2.add(c12951.m31504());
            arrayList.add(c12951.m31504());
        }
        this.f5008 = C5606.m15901(arrayList, arrayList2, iM31494);
        this.f5005 = c12951.m31498();
        int iM31496 = c12951.m31494();
        ArrayList arrayList3 = new ArrayList(iM31496);
        for (int i2 = 0; i2 < iM31496; i2++) {
            arrayList3.add(new C23327(c12951.m31494(), c12951.m31504()));
        }
        this.f5006 = C20195.unmodifiableList(arrayList3);
        int iM31497 = c12951.m31494();
        ArrayList arrayList4 = new ArrayList(iM31497);
        for (int i3 = 0; i3 < iM31497; i3++) {
            arrayList4.add(C3489.m10672(c12951.m31494(), c12951.m31506()));
        }
        this.f5009 = C20195.unmodifiableList(arrayList4);
        int iM31498 = c12951.m31494();
        ArrayList arrayList5 = new ArrayList(iM31498);
        for (int i4 = 0; i4 < iM31498; i4++) {
            arrayList5.add(new C8987(c12951.m31494(), AbstractC9693.m24637(this, c12951)));
        }
        this.f5004 = C20195.unmodifiableList(arrayList5);
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1516(C10130 c10130) {
        c10130.mo13231(20225);
        c10130.m25436();
        c10130.m25424(this.f5007);
        this.f5008.m15908(c10130);
        c10130.m25425(this.f5005);
        c10130.mo13231(this.f5006.size());
        for (C23327 c23327 : this.f5006) {
            c10130.mo13231(c23327.m51733());
            c10130.m25423((CharSequence) c23327.m51734());
        }
        List list = this.f5009;
        int size = list.size();
        c10130.mo13231(size);
        for (int i = 0; i < size; i++) {
            C3489 c3489 = (C3489) list.get(i);
            c10130.m25439(c3489.f11054);
            c10130.mo13231(c3489.f11057);
        }
        c10130.mo13231(this.f5004.size());
        for (C8987 c8987 : this.f5004) {
            c10130.mo13231(c8987.m23222());
            c8987.m23224().mo1516(c10130);
        }
        c10130.m25418();
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1517(C20982 c20982) {
        this.f5008.getClass();
        boolean zIsEmpty = this.f5006.isEmpty();
        AbstractC9693 abstractC9693 = this.f29307;
        if (!zIsEmpty && (!(abstractC9693 instanceof C8428) || ((C8428) abstractC9693).m22086() != this)) {
            throw new C3781(this.f29308, "export is only allowed on a direct start match");
        }
        if (this.f5008.m15912() && (!(abstractC9693 instanceof C8428) || ((C8428) abstractC9693).m22094() != this)) {
            throw new C3781(this.f29308, "var() is only allowed on a direct end match");
        }
        Iterator it = this.f5004.iterator();
        while (it.hasNext()) {
            ((C8987) it.next()).m23224().mo1517(c20982);
        }
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9693 mo1512(AbstractC9693 abstractC9693) {
        C1372 c1372 = new C1372(abstractC9693);
        c1372.f29308 = this.f29308;
        c1372.f5007 = this.f5007;
        c1372.f5008 = this.f5008;
        c1372.f5006 = this.f5006;
        c1372.f5009 = this.f5009;
        if (!this.f5004.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f5004.size());
            Iterator it = this.f5004.iterator();
            while (it.hasNext()) {
                arrayList.add(((C8987) it.next()).m23223(c1372));
            }
            c1372.f5004 = arrayList;
        }
        c1372.f5005 = this.f5005;
        return c1372;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m4855() {
        return this.f5007;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4844(String str) {
        this.f5007 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4847(C11459 c11459) {
        this.f5008 = C5606.m15902(c11459);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5606 m4852() {
        return this.f5008;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4846(C5606 c5606) {
        this.f5008 = c5606;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m4849() {
        return this.f5006;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4850(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C11003.requireNonNull(obj);
            arrayList2.add(obj);
        }
        this.f5006 = C20195.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m4854() {
        return this.f5009;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m4853(ArrayList arrayList) {
        this.f5009 = C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4845(C3489 c3489) {
        this.f5009 = Collections.singletonList(c3489);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m4851() {
        return this.f5004;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m4856(ArrayList arrayList) {
        if (arrayList.isEmpty() && this.f5004.isEmpty()) {
            return;
        }
        this.f5004 = arrayList;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m4857() {
        return this.f5005;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4848(boolean z) {
        this.f5005 = z;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1514(StringBuilder sb, int i) {
        sb.append(C9679.m24608(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM24608 = C9679.m24608(i2, "\t");
        sb.append(strM24608);
        sb.append("match: ");
        this.f5008.m15907(sb);
        sb.append('\n');
        sb.append(strM24608);
        sb.append("recordAllGroups: ");
        sb.append(this.f5005);
        sb.append('\n');
        for (C23327 c23327 : this.f5006) {
            sb.append(strM24608);
            sb.append("export: ");
            sb.append(c23327.m51733());
            sb.append(" => \"");
            sb.append(C14020.m33622(c23327.m51734()));
            sb.append("\"\n");
        }
        for (C3489 c3489 : this.f5009) {
            sb.append(strM24608);
            sb.append(c3489.f11057);
            sb.append(": \"");
            sb.append(c3489.f11054);
            sb.append("\"\n");
        }
        for (C8987 c8987 : this.f5004) {
            sb.append(strM24608);
            sb.append("subMatcher: ");
            sb.append(c8987.m23222());
            sb.append('\n');
            c8987.m23224().mo1514(sb, i2);
        }
        sb.append(C9679.m24608(i, "\t"));
        sb.append("}\n");
    }
}
