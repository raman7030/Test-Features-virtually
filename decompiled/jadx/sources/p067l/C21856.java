package p067l;

import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.᩶᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB9V */
/* JADX INFO: loaded from: classes4.dex */
public final class C21856 {

    /* JADX INFO: renamed from: ֫ */
    public final C21677 f68761;

    /* JADX INFO: renamed from: ܿ */
    public C10277 f68764 = null;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f68763 = null;

    /* JADX INFO: renamed from: ۧ */
    public int f68762 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public TreeMap f68765 = null;

    public C21856(C21677 c21677) {
        this.f68761 = c21677;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49299() {
        if (this.f68764 == null) {
            this.f68764 = this.f68761.m48923();
        }
        return this.f68764.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49300(C3948 c3948) {
        if (this.f68764 == null) {
            this.f68764 = this.f68761.m48923();
        }
        C18423 c18423M7862 = c3948.m7862();
        int size = this.f68764.size();
        this.f68765 = new TreeMap();
        for (int i = 0; i < size; i++) {
            this.f68765.put(this.f68764.m56512get(i).m6571(), null);
        }
        if (this.f68765.size() > 65535) {
            throw new UnsupportedOperationException("too many catch handlers");
        }
        C19705 c19705 = new C19705();
        this.f68762 = c19705.m44766(this.f68765.size());
        for (Map.Entry entry : this.f68765.entrySet()) {
            C7595 c7595 = (C7595) entry.getKey();
            int size2 = c7595.size();
            boolean zM17543 = c7595.m17543();
            entry.setValue(Integer.valueOf(c19705.m44769()));
            if (zM17543) {
                c19705.m44778(-(size2 - 1));
                size2--;
            } else {
                c19705.m44778(size2);
            }
            for (int i2 = 0; i2 < size2; i2++) {
                C2900 c2900 = c7595.get(i2);
                c19705.m44766(c18423M7862.m41989(c2900.m4675()));
                c19705.m44766(c2900.m4673());
            }
            if (zM17543) {
                c19705.m44766(c7595.get(size2).m4673());
            }
        }
        this.f68763 = c19705.m44779();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49301(C19705 c19705) {
        String strM37155;
        String strM37156;
        C10277 c10277 = this.f68764;
        C21677 c21677 = this.f68761;
        if (c10277 == null) {
            this.f68764 = c21677.m48923();
        }
        if (c19705.m44765()) {
            if (this.f68764 == null) {
                this.f68764 = c21677.m48923();
            }
            int size = this.f68764.size();
            c19705.m44760(0, "  tries:");
            for (int i = 0; i < size; i++) {
                C3571 c3571M56512get = this.f68764.m56512get(i);
                C7595 c7595M6571 = c3571M56512get.m6571();
                StringBuilder sb = new StringBuilder("    try ");
                int iM6572 = c3571M56512get.m6572();
                if (iM6572 == ((char) iM6572)) {
                    strM37155 = C16351.m37153(iM6572);
                } else {
                    strM37155 = C16351.m37155(iM6572);
                }
                sb.append(strM37155);
                sb.append("..");
                int iM6569 = c3571M56512get.m6569();
                if (iM6569 == ((char) iM6569)) {
                    strM37156 = C16351.m37153(iM6569);
                } else {
                    strM37156 = C16351.m37155(iM6569);
                }
                sb.append(strM37156);
                String string = sb.toString();
                String strM17546 = c7595M6571.m17546(ASN1Dump.TAB, "");
                c19705.m44760(6, string);
                c19705.m44760(2, strM17546);
            }
            c19705.m44760(0, "  handlers:");
            c19705.m44760(this.f68762, "    size: ".concat(C16351.m37153(this.f68765.size())));
            C7595 c7595 = null;
            int i2 = 0;
            for (Map.Entry entry : this.f68765.entrySet()) {
                C7595 c7596 = (C7595) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                if (c7595 != null) {
                    c19705.m44760(iIntValue - i2, c7595.m17546(ASN1Dump.TAB, C16351.m37153(i2).concat(": ")));
                }
                i2 = iIntValue;
                c7595 = c7596;
            }
            c19705.m44760(this.f68763.length - i2, c7595.m17546(ASN1Dump.TAB, C16351.m37153(i2).concat(": ")));
        }
        int size2 = this.f68764.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C3571 c3571M56512get2 = this.f68764.m56512get(i3);
            int iM6573 = c3571M56512get2.m6572();
            int iM65610 = c3571M56512get2.m6569();
            int i4 = iM65610 - iM6573;
            if (i4 >= 65536) {
                throw new UnsupportedOperationException("bogus exception range: " + C16351.m37155(iM6573) + ".." + C16351.m37155(iM65610));
            }
            c19705.m44773(iM6573);
            c19705.m44770(i4);
            c19705.m44770(((Integer) this.f68765.get(c3571M56512get2.m6571())).intValue());
        }
        c19705.m44764(this.f68763);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m49302() {
        return (m49299() * 8) + this.f68763.length;
    }
}
