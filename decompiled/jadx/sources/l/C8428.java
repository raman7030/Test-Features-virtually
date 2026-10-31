package l;

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
public final class C8428 extends AbstractC9693 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC9693 f25809;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f25810;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public BitSet f25811;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f25812;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f25813;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC9693 f25814;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f25815;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f25816;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f25817;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C1664 f25818;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f25819;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f25820;

    public C8428(AbstractC9693 abstractC9693) {
        super(abstractC9693);
        this.f25817 = new ArrayList();
    }

    public C8428(AbstractC9693 abstractC9693, C12951 c12951) {
        super(abstractC9693);
        this.f25817 = new ArrayList();
        C22124.m49721(c12951, 20226);
        int iM31488 = c12951.m31488() + c12951.readInt();
        this.f25813 = c12951.m31503();
        this.f25810 = C4900.m14261(c12951.m31503());
        this.f25816 = C4900.m14261(c12951.m31503());
        this.f25809 = AbstractC9693.m24637(this, c12951);
        this.f25814 = AbstractC9693.m24637(this, c12951);
        int iM31494 = c12951.m31494();
        for (int i = 0; i < iM31494; i++) {
            this.f25817.add(AbstractC9693.m24637(this, c12951));
        }
        byte b = c12951.readByte();
        this.f25819 = (b & 1) != 0;
        this.f25815 = (b & 2) != 0;
        this.f25820 = c12951.readShort();
        int iM31493 = c12951.m31493();
        if (iM31493 > 0) {
            byte[] bArr = new byte[iM31493];
            c12951.m31489(iM31493, bArr);
            this.f25811 = BitSet.valueOf(bArr);
        }
        if (c12951.m31488() < iM31488) {
            this.f25818 = C1664.m5638(c12951);
            this.f25812 = C4900.m14261(c12951.m31503());
        }
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1516(C10130 c10130) {
        c10130.mo13231(20226);
        c10130.m25436();
        c10130.m25424(this.f25813);
        c10130.m25424(C4900.m14262(this.f25810));
        c10130.m25424(C4900.m14262(this.f25816));
        this.f25809.mo1516(c10130);
        this.f25814.mo1516(c10130);
        ArrayList arrayList = this.f25817;
        c10130.mo13231(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1516(c10130);
        }
        byte b = this.f25819 ? (byte) 1 : (byte) 0;
        if (this.f25815) {
            b = (byte) (b | 2);
        }
        c10130.writeByte(b);
        c10130.mo13229((short) this.f25820);
        BitSet bitSet = this.f25811;
        if (bitSet != null) {
            byte[] byteArray = bitSet.toByteArray();
            c10130.m25441(byteArray.length);
            c10130.write(byteArray, 0, byteArray.length);
        } else {
            c10130.m25441(0);
        }
        C1664.m5639(c10130, this.f25818);
        c10130.m25424(C4900.m14262(this.f25812));
        c10130.m25418();
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1517(C20982 c20982) {
        AbstractC9693 abstractC9693 = this.f25809;
        if (abstractC9693 == null) {
            throw new C3781(this.f29308, "Missing start matcher");
        }
        AbstractC9693 abstractC9694 = this.f25814;
        if (abstractC9694 == null) {
            throw new C3781(this.f29308, "Missing end matcher");
        }
        C1372 c1372 = abstractC9693 instanceof C1372 ? (C1372) abstractC9693 : null;
        C1372 c1373 = abstractC9694 instanceof C1372 ? (C1372) abstractC9694 : null;
        List<C23327> listM4849 = c1372 == null ? Collections.EMPTY_LIST : c1372.m4849();
        List<String> listM15914 = c1373 == null ? Collections.EMPTY_LIST : c1373.m4852().m15914();
        if (!listM4849.isEmpty() || !listM15914.isEmpty()) {
            if (!listM4849.isEmpty() && c1373 == null) {
                throw new C3781(this.f29308, "start exports require a direct end match");
            }
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            int iM15910 = c1372 == null ? -1 : c1372.m4852().m15910();
            for (C23327 c23327 : listM4849) {
                if (c23327.m51733() < 0 || c23327.m51733() > iM15910) {
                    Point point = c1372.f29308;
                    StringBuilder sb = new StringBuilder("No start capture group ");
                    sb.append(c23327.m51733());
                    sb.append(" for exported variable \"");
                    throw new C3781(point, C9045.m23341(sb, c23327.m51734(), "\""));
                }
                if (!hashSet.add(Integer.valueOf(c23327.m51733()))) {
                    throw new C3781(c1372.f29308, C3200.m9831(c23327.m51733(), " is exported more than once", new StringBuilder("Capture group ")));
                }
                if (!hashSet2.add(c23327.m51734())) {
                    throw new C3781(c1372.f29308, "Duplicate exported variable: " + c23327.m51734());
                }
            }
            HashSet hashSet3 = new HashSet();
            for (String str : listM15914) {
                if (!hashSet2.contains(str)) {
                    throw new C3781(c1373.f29308, C20094.m46315("Undefined scope variable: ", str));
                }
                hashSet3.add(str);
            }
            for (C23327 c23328 : listM4849) {
                if (!hashSet3.contains(c23328.m51734())) {
                    throw new C3781(c1372.f29308, "Exported variable is not used by end: " + c23328.m51734());
                }
            }
        }
        C1664 c1664 = this.f25818;
        ArrayList arrayList = this.f25817;
        if (c1664 != null) {
            if (!arrayList.isEmpty()) {
                throw new C3781(this.f29308, "childrenSyntax and contains cannot be used together");
            }
            try {
                C1664 c1664M5643 = this.f25818.m5643(this.f29307.mo24638());
                if (c1664M5643.m5649()) {
                    AbstractC9693 abstractC9695 = this.f25809;
                    if (!(abstractC9695 instanceof C1372)) {
                        throw new C3781(this.f29308, "Dynamic childrenSyntax requires a direct match start");
                    }
                    int iM5641 = c1664M5643.m5641();
                    int iM15911 = ((C1372) abstractC9695).m4852().m15910();
                    if (iM5641 < 0 || iM5641 > iM15911) {
                        throw new C3781(this.f29308, C19370.m44628(iM5641, "No start capture group "));
                    }
                }
            } catch (IllegalArgumentException e) {
                if (this.f29308 == null) {
                    throw e;
                }
                C3781 c3781 = new C3781(this.f29308, e.getMessage());
                c3781.initCause((Throwable) e);
                throw c3781;
            }
        } else if (this.f25812 != 0) {
            throw new C3781(this.f29308, "missingStyle requires childrenSyntax");
        }
        this.f25809.mo1517(c20982);
        this.f25814.mo1517(c20982);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1517(c20982);
        }
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9693 mo1512(AbstractC9693 abstractC9693) {
        C8428 c8428 = new C8428(abstractC9693);
        c8428.f29308 = this.f29308;
        c8428.f25813 = this.f25813;
        c8428.f25809 = this.f25809.mo1512(c8428);
        c8428.f25809 = this.f25809.mo1512(c8428);
        c8428.f25814 = this.f25814.mo1512(c8428);
        c8428.f25810 = this.f25810;
        c8428.f25816 = this.f25816;
        c8428.f25818 = this.f25818;
        c8428.f25812 = this.f25812;
        c8428.f25819 = this.f25819;
        c8428.f25815 = this.f25815;
        c8428.f25820 = this.f25820;
        BitSet bitSet = this.f25811;
        c8428.f25811 = bitSet == null ? null : (BitSet) bitSet.clone();
        Iterator it = this.f25817.iterator();
        while (it.hasNext()) {
            c8428.f25817.add(((AbstractC9693) it.next()).mo1512(c8428));
        }
        return c8428;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m22080() {
        return this.f25813;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22082(String str) {
        this.f25813 = str;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC9693 m22086() {
        return this.f25809;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22089(AbstractC9693 abstractC9693) {
        this.f25809 = abstractC9693;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC9693 m22094() {
        return this.f25814;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22083(AbstractC9693 abstractC9693) {
        this.f25814 = abstractC9693;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m22092(String str) {
        this.f25810 = C4900.m14261(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22072(String str) {
        this.f25816 = C4900.m14261(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1664 m22091() {
        return this.f25818;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22073(C1664 c1664) {
        this.f25818 = c1664;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22088(String str) {
        this.f25812 = C4900.m14261(str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m22085() {
        return this.f25810;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22087() {
        return this.f25816;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m22079() {
        return this.f25812;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m22076() {
        return this.f25819;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22075(boolean z) {
        this.f25819 = z;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m22077() {
        return this.f25815;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22084(boolean z) {
        this.f25815 = z;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m22078() {
        return this.f25820;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22071(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 32767) {
            i = EnumC5983.f18409;
        }
        this.f25820 = i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m22090() {
        return this.f25817;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22074(AbstractC9693 abstractC9693, boolean z) {
        ArrayList arrayList = this.f25817;
        arrayList.add(abstractC9693);
        if (z) {
            if (this.f25811 == null) {
                this.f25811 = new BitSet();
            }
            this.f25811.set(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BitSet m22093() {
        return this.f25811;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22081() {
        BitSet bitSet = this.f25811;
        if (bitSet == null || this.f25819) {
            return;
        }
        int i = this.f25820;
        BitSet bitSet2 = new BitSet();
        int length = this.f25811.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (bitSet.get(i2)) {
                if (i2 < i) {
                    bitSet2.set(i2);
                } else {
                    bitSet2.set(i2 + 1);
                }
            }
        }
        this.f25811 = bitSet2;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1514(StringBuilder sb, int i) {
        sb.append(C9679.m24608(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM24608 = C9679.m24608(i2, "\t");
        sb.append(strM24608);
        sb.append("start: ");
        sb.append('\n');
        this.f25809.mo1514(sb, i2);
        sb.append(strM24608);
        sb.append("end: ");
        sb.append('\n');
        this.f25814.mo1514(sb, i2);
        String strM14262 = C4900.m14262(this.f25810);
        if (strM14262 != null) {
            sb.append(strM24608);
            sb.append("style: ");
            sb.append('\"');
            sb.append(strM14262);
            sb.append('\"');
            sb.append('\n');
        }
        String strM14263 = C4900.m14262(this.f25816);
        if (strM14263 != null) {
            sb.append(strM24608);
            sb.append("childrenStyle: ");
            sb.append('\"');
            sb.append(strM14263);
            sb.append('\"');
            sb.append('\n');
        }
        C1664 c1664 = this.f25818;
        if (c1664 != null) {
            c1664.m5644(sb, strM24608);
        }
        String strM14264 = C4900.m14262(this.f25812);
        if (strM14264 != null) {
            sb.append(strM24608);
            sb.append("missingStyle: ");
            sb.append('\"');
            sb.append(strM14264);
            sb.append('\"');
            sb.append('\n');
        }
        if (this.f25820 != 0) {
            sb.append(strM24608);
            sb.append("endPriority: ");
            sb.append(this.f25820);
            sb.append('\n');
        }
        sb.append(strM24608);
        sb.append("contains: ");
        sb.append('\n');
        Iterator it = this.f25817.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1514(sb, i2);
        }
        if (this.f25811 != null) {
            sb.append(strM24608);
            sb.append("fails: ");
            sb.append(this.f25811);
            sb.append('\n');
        }
        sb.append(C9679.m24608(i, "\t"));
        sb.append("}\n");
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1515(ArrayList arrayList) {
        this.f25809.mo1515(arrayList);
    }
}
