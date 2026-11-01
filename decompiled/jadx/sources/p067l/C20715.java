package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 699M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20715 extends AbstractC11581 {

    /* JADX INFO: renamed from: ܳ */
    public int f63945;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f63946;

    /* JADX INFO: renamed from: ܿ */
    public int f63947;

    /* JADX INFO: renamed from: ᩳ */
    public String f63948;

    public C20715(AbstractC11581 abstractC11581) {
        super(abstractC11581);
        this.f63946 = new ArrayList();
    }

    public C20715(AbstractC11581 abstractC11581, C14677 c14677) {
        super(abstractC11581);
        this.f63946 = new ArrayList();
        C23395.m52059(c14677, 20231);
        c14677.readInt();
        this.f63948 = c14677.m33590();
        this.f63945 = c14677.readByte();
        this.f63947 = C7026.m16158(c14677.m33590());
        int iM33581 = c14677.m33581();
        for (int i = 0; i < iM33581; i++) {
            this.f63946.add(AbstractC11581.m26651(this, c14677));
        }
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3914(C11996 c11996) {
        c11996.mo15113(20231);
        c11996.m27456();
        c11996.m27444(this.f63948);
        c11996.writeByte(this.f63945);
        c11996.m27444(C7026.m16159(this.f63947));
        ArrayList arrayList = this.f63946;
        c11996.mo15113(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3914(c11996);
        }
        c11996.m27438();
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3915(C22310 c22310) {
        Iterator it = this.f63946.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3915(c22310);
        }
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 mo3910(AbstractC11581 abstractC11581) {
        C20715 c20715 = new C20715(abstractC11581);
        c20715.f32258 = this.f32258;
        c20715.f63948 = this.f63948;
        c20715.f63945 = this.f63945;
        c20715.f63947 = this.f63947;
        Iterator it = this.f63946.iterator();
        while (it.hasNext()) {
            c20715.f63946.add(((AbstractC11581) it.next()).mo3910(c20715));
        }
        return c20715;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m46797() {
        return this.f63948;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46790(String str) {
        this.f63948 = str;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3913(ArrayList arrayList) {
        int i = this.f63945;
        ArrayList arrayList2 = this.f63946;
        if (i == 2) {
            if (arrayList2.size() == 1) {
                ((AbstractC11581) arrayList2.get(0)).mo3913(arrayList);
            }
        } else {
            if (arrayList2.isEmpty()) {
                return;
            }
            ((AbstractC11581) arrayList2.get(0)).mo3913(arrayList);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m46796() {
        return this.f63945;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46795(String str) {
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
        this.f63945 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46792(String str) {
        this.f63947 = C7026.m16158(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46793(AbstractC11581 abstractC11581) {
        this.f63946.add(abstractC11581);
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m46791() {
        return this.f63946;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m46794() {
        return this.f63947;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3912(StringBuilder sb, int i) {
        String str;
        sb.append(C11567.m26622(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM26622 = C11567.m26622(i2, "\t");
        sb.append(strM26622);
        sb.append("group: ");
        int i3 = this.f63945;
        if (i3 == 0) {
            str = "link";
        } else if (i3 == 1) {
            str = "linkAll";
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("group type=" + this.f63945);
            }
            str = "select";
        }
        sb.append(str);
        sb.append('\n');
        String strM16159 = C7026.m16159(this.f63947);
        if (strM16159 != null) {
            sb.append(strM26622);
            sb.append("style: ");
            sb.append('\"');
            sb.append(strM16159);
            sb.append('\"');
            sb.append('\n');
        }
        sb.append(strM26622);
        sb.append("contains: ");
        sb.append('\n');
        Iterator it = this.f63946.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3912(sb, i2);
        }
        sb.append(C11567.m26622(i, "\t"));
        sb.append("}\n");
    }
}
