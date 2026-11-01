package p067l;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LARZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10379 extends AbstractC11581 {

    /* JADX INFO: renamed from: ۖ */
    public AbstractC11581 f28722;

    /* JADX INFO: renamed from: ۘ */
    public int f28723;

    /* JADX INFO: renamed from: ۜ */
    public BitSet f28724;

    /* JADX INFO: renamed from: ۡ */
    public int f28725;

    /* JADX INFO: renamed from: ۢ */
    public String f28726;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC11581 f28727;

    /* JADX INFO: renamed from: ܺ */
    public boolean f28728;

    /* JADX INFO: renamed from: ܽ */
    public int f28729;

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f28730;

    /* JADX INFO: renamed from: ᩳ */
    public C3950 f28731;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f28732;

    /* JADX INFO: renamed from: ᩻ */
    public int f28733;

    public C10379(AbstractC11581 abstractC11581) {
        super(abstractC11581);
        this.f28730 = new ArrayList();
    }

    public C10379(AbstractC11581 abstractC11581, C14677 c14677) {
        super(abstractC11581);
        this.f28730 = new ArrayList();
        C23395.m52059(c14677, 20226);
        int iM33575 = c14677.m33575() + c14677.readInt();
        this.f28726 = c14677.m33590();
        this.f28723 = C7026.m16158(c14677.m33590());
        this.f28729 = C7026.m16158(c14677.m33590());
        this.f28722 = AbstractC11581.m26651(this, c14677);
        this.f28727 = AbstractC11581.m26651(this, c14677);
        int iM33581 = c14677.m33581();
        for (int i = 0; i < iM33581; i++) {
            this.f28730.add(AbstractC11581.m26651(this, c14677));
        }
        byte b = c14677.readByte();
        this.f28732 = (b & 1) != 0;
        this.f28728 = (b & 2) != 0;
        this.f28733 = c14677.readShort();
        int iM33580 = c14677.m33580();
        if (iM33580 > 0) {
            byte[] bArr = new byte[iM33580];
            c14677.m33576(iM33580, bArr);
            this.f28724 = BitSet.valueOf(bArr);
        }
        if (c14677.m33575() < iM33575) {
            this.f28731 = C3950.m7868(c14677);
            this.f28725 = C7026.m16158(c14677.m33590());
        }
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3914(C11996 c11996) {
        c11996.mo15113(20226);
        c11996.m27456();
        c11996.m27444(this.f28726);
        c11996.m27444(C7026.m16159(this.f28723));
        c11996.m27444(C7026.m16159(this.f28729));
        this.f28722.mo3914(c11996);
        this.f28727.mo3914(c11996);
        ArrayList arrayList = this.f28730;
        c11996.mo15113(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3914(c11996);
        }
        byte b = this.f28732 ? (byte) 1 : (byte) 0;
        if (this.f28728) {
            b = (byte) (b | 2);
        }
        c11996.writeByte(b);
        c11996.mo15111((short) this.f28733);
        BitSet bitSet = this.f28724;
        if (bitSet != null) {
            byte[] byteArray = bitSet.toByteArray();
            c11996.m27461(byteArray.length);
            c11996.write(byteArray, 0, byteArray.length);
        } else {
            c11996.m27461(0);
        }
        C3950.m7869(c11996, this.f28731);
        c11996.m27444(C7026.m16159(this.f28725));
        c11996.m27438();
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3915(C22310 c22310) {
        AbstractC11581 abstractC11581 = this.f28722;
        if (abstractC11581 == null) {
            throw new C5962(this.f32258, "Missing start matcher");
        }
        AbstractC11581 abstractC11582 = this.f28727;
        if (abstractC11582 == null) {
            throw new C5962(this.f32258, "Missing end matcher");
        }
        C3673 c3673 = abstractC11581 instanceof C3673 ? (C3673) abstractC11581 : null;
        C3673 c3674 = abstractC11582 instanceof C3673 ? (C3673) abstractC11582 : null;
        List<C24539> listM7087 = c3673 == null ? Collections.EMPTY_LIST : c3673.m7087();
        List<String> listM17835 = c3674 == null ? Collections.EMPTY_LIST : c3674.m7090().m17835();
        if (!listM7087.isEmpty() || !listM17835.isEmpty()) {
            if (!listM7087.isEmpty() && c3674 == null) {
                throw new C5962(this.f32258, "start exports require a direct end match");
            }
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            int iM17831 = c3673 == null ? -1 : c3673.m7090().m17831();
            for (C24539 c24539 : listM7087) {
                if (c24539.m54130() < 0 || c24539.m54130() > iM17831) {
                    Point point = c3673.f32258;
                    StringBuilder sb = new StringBuilder("No start capture group ");
                    sb.append(c24539.m54130());
                    sb.append(" for exported variable \"");
                    throw new C5962(point, C10965.m25286(sb, c24539.m54131(), "\""));
                }
                if (!hashSet.add(Integer.valueOf(c24539.m54130()))) {
                    throw new C5962(c3673.f32258, C5410.m11876(c24539.m54130(), " is exported more than once", new StringBuilder("Capture group ")));
                }
                if (!hashSet2.add(c24539.m54131())) {
                    throw new C5962(c3673.f32258, "Duplicate exported variable: " + c24539.m54131());
                }
            }
            HashSet hashSet3 = new HashSet();
            for (String str : listM17835) {
                if (!hashSet2.contains(str)) {
                    throw new C5962(c3674.f32258, C21466.m48631("Undefined scope variable: ", str));
                }
                hashSet3.add(str);
            }
            for (C24539 c245310 : listM7087) {
                if (!hashSet3.contains(c245310.m54131())) {
                    throw new C5962(c3673.f32258, "Exported variable is not used by end: " + c245310.m54131());
                }
            }
        }
        C3950 c3950 = this.f28731;
        ArrayList arrayList = this.f28730;
        if (c3950 != null) {
            if (!arrayList.isEmpty()) {
                throw new C5962(this.f32258, "childrenSyntax and contains cannot be used together");
            }
            try {
                C3950 c3950M7873 = this.f28731.m7873(this.f32257.mo26652());
                if (c3950M7873.m7879()) {
                    AbstractC11581 abstractC11583 = this.f28722;
                    if (!(abstractC11583 instanceof C3673)) {
                        throw new C5962(this.f32258, "Dynamic childrenSyntax requires a direct match start");
                    }
                    int iM7871 = c3950M7873.m7871();
                    int iM17832 = ((C3673) abstractC11583).m7090().m17831();
                    if (iM7871 < 0 || iM7871 > iM17832) {
                        throw new C5962(this.f32258, C20778.m46922(iM7871, "No start capture group "));
                    }
                }
            } catch (IllegalArgumentException e) {
                if (this.f32258 == null) {
                    throw e;
                }
                C5962 c5962 = new C5962(this.f32258, e.getMessage());
                c5962.initCause((Throwable) e);
                throw c5962;
            }
        } else if (this.f28725 != 0) {
            throw new C5962(this.f32258, "missingStyle requires childrenSyntax");
        }
        this.f28722.mo3915(c22310);
        this.f28727.mo3915(c22310);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3915(c22310);
        }
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 mo3910(AbstractC11581 abstractC11581) {
        C10379 c10379 = new C10379(abstractC11581);
        c10379.f32258 = this.f32258;
        c10379.f28726 = this.f28726;
        c10379.f28722 = this.f28722.mo3910(c10379);
        c10379.f28722 = this.f28722.mo3910(c10379);
        c10379.f28727 = this.f28727.mo3910(c10379);
        c10379.f28723 = this.f28723;
        c10379.f28729 = this.f28729;
        c10379.f28731 = this.f28731;
        c10379.f28725 = this.f28725;
        c10379.f28732 = this.f28732;
        c10379.f28728 = this.f28728;
        c10379.f28733 = this.f28733;
        BitSet bitSet = this.f28724;
        c10379.f28724 = bitSet == null ? null : (BitSet) bitSet.clone();
        Iterator it = this.f28730.iterator();
        while (it.hasNext()) {
            c10379.f28730.add(((AbstractC11581) it.next()).mo3910(c10379));
        }
        return c10379;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m24050() {
        return this.f28726;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24052(String str) {
        this.f28726 = str;
    }

    /* JADX INFO: renamed from: ܺ */
    public final AbstractC11581 m24056() {
        return this.f28722;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24059(AbstractC11581 abstractC11581) {
        this.f28722 = abstractC11581;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC11581 m24064() {
        return this.f28727;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24053(AbstractC11581 abstractC11581) {
        this.f28727 = abstractC11581;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m24062(String str) {
        this.f28723 = C7026.m16158(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24042(String str) {
        this.f28729 = C7026.m16158(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C3950 m24061() {
        return this.f28731;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24043(C3950 c3950) {
        this.f28731 = c3950;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24058(String str) {
        this.f28725 = C7026.m16158(str);
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m24055() {
        return this.f28723;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m24057() {
        return this.f28729;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m24049() {
        return this.f28725;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m24046() {
        return this.f28732;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24045(boolean z) {
        this.f28732 = z;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m24047() {
        return this.f28728;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24054(boolean z) {
        this.f28728 = z;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m24048() {
        return this.f28733;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24041(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 32767) {
            i = EnumC8055.f21261;
        }
        this.f28733 = i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final List m24060() {
        return this.f28730;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24044(AbstractC11581 abstractC11581, boolean z) {
        ArrayList arrayList = this.f28730;
        arrayList.add(abstractC11581);
        if (z) {
            if (this.f28724 == null) {
                this.f28724 = new BitSet();
            }
            this.f28724.set(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final BitSet m24063() {
        return this.f28724;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24051() {
        BitSet bitSet = this.f28724;
        if (bitSet == null || this.f28732) {
            return;
        }
        int i = this.f28733;
        BitSet bitSet2 = new BitSet();
        int length = this.f28724.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (bitSet.get(i2)) {
                if (i2 < i) {
                    bitSet2.set(i2);
                } else {
                    bitSet2.set(i2 + 1);
                }
            }
        }
        this.f28724 = bitSet2;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3912(StringBuilder sb, int i) {
        sb.append(C11567.m26622(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM26622 = C11567.m26622(i2, "\t");
        sb.append(strM26622);
        sb.append("start: ");
        sb.append('\n');
        this.f28722.mo3912(sb, i2);
        sb.append(strM26622);
        sb.append("end: ");
        sb.append('\n');
        this.f28727.mo3912(sb, i2);
        String strM16159 = C7026.m16159(this.f28723);
        if (strM16159 != null) {
            sb.append(strM26622);
            sb.append("style: ");
            sb.append('\"');
            sb.append(strM16159);
            sb.append('\"');
            sb.append('\n');
        }
        String strM161510 = C7026.m16159(this.f28729);
        if (strM161510 != null) {
            sb.append(strM26622);
            sb.append("childrenStyle: ");
            sb.append('\"');
            sb.append(strM161510);
            sb.append('\"');
            sb.append('\n');
        }
        C3950 c3950 = this.f28731;
        if (c3950 != null) {
            c3950.m7874(sb, strM26622);
        }
        String strM161511 = C7026.m16159(this.f28725);
        if (strM161511 != null) {
            sb.append(strM26622);
            sb.append("missingStyle: ");
            sb.append('\"');
            sb.append(strM161511);
            sb.append('\"');
            sb.append('\n');
        }
        if (this.f28733 != 0) {
            sb.append(strM26622);
            sb.append("endPriority: ");
            sb.append(this.f28733);
            sb.append('\n');
        }
        sb.append(strM26622);
        sb.append("contains: ");
        sb.append('\n');
        Iterator it = this.f28730.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3912(sb, i2);
        }
        if (this.f28724 != null) {
            sb.append(strM26622);
            sb.append("fails: ");
            sb.append(this.f28724);
            sb.append('\n');
        }
        sb.append(C11567.m26622(i, "\t"));
        sb.append("}\n");
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3913(ArrayList arrayList) {
        this.f28722.mo3913(arrayList);
    }
}
