package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 699M */
/* JADX INFO: loaded from: classes5.dex */
public final class C19304 extends AbstractC9693 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f60715;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60716;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f60717;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f60718;

    public C19304(AbstractC9693 abstractC9693) {
        super(abstractC9693);
        this.f60716 = new ArrayList();
    }

    public C19304(AbstractC9693 abstractC9693, C12951 c12951) {
        super(abstractC9693);
        this.f60716 = new ArrayList();
        C22124.m49721(c12951, 20231);
        c12951.readInt();
        this.f60718 = c12951.m31503();
        this.f60715 = c12951.readByte();
        this.f60717 = C4900.m14261(c12951.m31503());
        int iM31494 = c12951.m31494();
        for (int i = 0; i < iM31494; i++) {
            this.f60716.add(AbstractC9693.m24637(this, c12951));
        }
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1516(C10130 c10130) {
        c10130.mo13231(20231);
        c10130.m25436();
        c10130.m25424(this.f60718);
        c10130.writeByte(this.f60715);
        c10130.m25424(C4900.m14262(this.f60717));
        ArrayList arrayList = this.f60716;
        c10130.mo13231(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1516(c10130);
        }
        c10130.m25418();
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1517(C20982 c20982) {
        Iterator it = this.f60716.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1517(c20982);
        }
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9693 mo1512(AbstractC9693 abstractC9693) {
        C19304 c19304 = new C19304(abstractC9693);
        c19304.f29308 = this.f29308;
        c19304.f60718 = this.f60718;
        c19304.f60715 = this.f60715;
        c19304.f60717 = this.f60717;
        Iterator it = this.f60716.iterator();
        while (it.hasNext()) {
            c19304.f60716.add(((AbstractC9693) it.next()).mo1512(c19304));
        }
        return c19304;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m44503() {
        return this.f60718;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44496(String str) {
        this.f60718 = str;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1515(ArrayList arrayList) {
        int i = this.f60715;
        ArrayList arrayList2 = this.f60716;
        if (i == 2) {
            if (arrayList2.size() == 1) {
                ((AbstractC9693) arrayList2.get(0)).mo1515(arrayList);
            }
        } else {
            if (arrayList2.isEmpty()) {
                return;
            }
            ((AbstractC9693) arrayList2.get(0)).mo1515(arrayList);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m44502() {
        return this.f60715;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44501(String str) {
        str.getClass();
        int i = 2;
        switch (str) {
            case "select":
                break;
            case "link":
                i = 0;
                break;
            case "linkAll":
                i = 1;
                break;
            default:
                throw new IllegalArgumentException("Unknown group type: ".concat(str));
        }
        this.f60715 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44498(String str) {
        this.f60717 = C4900.m14261(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44499(AbstractC9693 abstractC9693) {
        this.f60716.add(abstractC9693);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m44497() {
        return this.f60716;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m44500() {
        return this.f60717;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1514(StringBuilder sb, int i) {
        String str;
        sb.append(C9679.m24608(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM24608 = C9679.m24608(i2, "\t");
        sb.append(strM24608);
        sb.append("group: ");
        int i3 = this.f60715;
        if (i3 == 0) {
            str = "link";
        } else if (i3 == 1) {
            str = "linkAll";
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("group type=" + this.f60715);
            }
            str = "select";
        }
        sb.append(str);
        sb.append('\n');
        String strM14262 = C4900.m14262(this.f60717);
        if (strM14262 != null) {
            sb.append(strM24608);
            sb.append("style: ");
            sb.append('\"');
            sb.append(strM14262);
            sb.append('\"');
            sb.append('\n');
        }
        sb.append(strM24608);
        sb.append("contains: ");
        sb.append('\n');
        Iterator it = this.f60716.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1514(sb, i2);
        }
        sb.append(C9679.m24608(i, "\t"));
        sb.append("}\n");
    }
}
