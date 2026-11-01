package p067l;

import com.umeng.analytics.pro.C0655am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBI4 */
/* JADX INFO: loaded from: classes.dex */
public final class C24537 {

    /* JADX INFO: renamed from: ۖ */
    public final int f77713;

    /* JADX INFO: renamed from: ۘ */
    public boolean f77714;

    /* JADX INFO: renamed from: ۡ */
    public final C22268 f77716;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC7893 f77718;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f77719;

    /* JADX INFO: renamed from: ܺ */
    public String f77720;

    /* JADX INFO: renamed from: ܽ */
    public final int f77721;

    /* JADX INFO: renamed from: ܿ */
    public final C3948 f77722;

    /* JADX INFO: renamed from: ᩳ */
    public final C24318 f77723;

    /* JADX INFO: renamed from: ᩷ */
    public final C4162 f77724;

    /* JADX INFO: renamed from: ᩻ */
    public final C15640[] f77725;

    /* JADX INFO: renamed from: ֫ */
    public int f77712 = 0;

    /* JADX INFO: renamed from: ۜ */
    public int f77715 = 1;

    /* JADX INFO: renamed from: ۢ */
    public final C19705 f77717 = new C19705();

    public C24537(C22268 c22268, C4162 c4162, C3948 c3948, int i, int i2, boolean z, C23648 c23648) {
        this.f77716 = c22268;
        this.f77724 = c4162;
        this.f77722 = c3948;
        this.f77723 = c23648.m41622();
        this.f77719 = z;
        this.f77721 = i;
        this.f77713 = i2;
        this.f77725 = new C15640[i2];
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54118(int i, String str) {
        if (this.f77720 != null) {
            str = C10965.m25286(new StringBuilder(), this.f77720, str);
        }
        InterfaceC7893 interfaceC7893 = this.f77718;
        if (interfaceC7893 != null) {
            if (!this.f77714) {
                i = 0;
            }
            ((C19705) interfaceC7893).m44760(i, str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m54126() {
        try {
            return m54124();
        } catch (IOException e) {
            throw C10101.m23569("...while encoding debug info", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m54127(String str, InterfaceC7893 interfaceC7893, boolean z) {
        this.f77720 = str;
        this.f77718 = interfaceC7893;
        this.f77714 = z;
        return m54126();
    }

    /* JADX INFO: renamed from: ۧ */
    private byte[] m54124() {
        char c;
        C3948 c3948;
        C14930 c14930;
        C15640 c15640;
        C22268 c22268 = this.f77716;
        int size = c22268 == null ? 0 : c22268.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(c22268.m56514get(i));
        }
        Collections.sort(arrayList, new C8444());
        C24318 c24318 = this.f77723;
        ArrayList<C15640> arrayList2 = new ArrayList(c24318.m53653().size());
        int iM35476 = c24318.m53653().m35476();
        int i2 = this.f77713;
        boolean z = this.f77719;
        int i3 = (i2 - iM35476) - (!z ? 1 : 0);
        BitSet bitSet = new BitSet(i2 - i3);
        C4162 c4162 = this.f77724;
        int size2 = c4162.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C15640 c15640M56520get = c4162.m56520get(i4);
            int iM35541 = c15640M56520get.m35541();
            if (iM35541 >= i3) {
                int i5 = iM35541 - i3;
                if (!bitSet.get(i5)) {
                    bitSet.set(i5);
                    arrayList2.add(c15640M56520get);
                }
            }
        }
        Collections.sort(arrayList2, new C13809());
        boolean z2 = this.f77718 != null;
        C19705 c19705 = this.f77717;
        int iM44769 = c19705.m44769();
        if (arrayList.size() > 0) {
            this.f77715 = ((C8856) arrayList.get(0)).m20463().m27610();
        }
        c19705.m44766(this.f77715);
        if (z2) {
            m54118(c19705.m44769() - iM44769, "line_start: " + this.f77715);
        }
        int iM35477 = (i2 - c24318.m53653().m35476()) - (!z ? 1 : 0);
        C15600 c15600M53653 = c24318.m53653();
        int size3 = c15600M53653.size();
        C15640[] c15640Arr = this.f77725;
        if (!z) {
            for (C15640 c15641 : arrayList2) {
                if (iM35477 == c15641.m35541()) {
                    c15640Arr[iM35477] = c15641;
                    break;
                }
            }
            iM35477++;
        }
        int iM447610 = c19705.m44769();
        c19705.m44766(size3);
        if (z2) {
            m54118(c19705.m44769() - iM447610, String.format("parameters_size: %04x", Integer.valueOf(size3)));
        }
        for (int i6 = 0; i6 < size3; i6++) {
            C9566 c9566M56515get = c15600M53653.m56515get(i6);
            int iM447611 = c19705.m44769();
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c14930 = null;
                    c15640 = null;
                    break;
                }
                c15640 = (C15640) it.next();
                if (iM35477 == c15640.m35541()) {
                    if (c15640.getSignature() != null) {
                        c14930 = null;
                        m54120((C14930) null);
                    } else {
                        c14930 = null;
                        m54120(c15640.getName());
                    }
                    c15640Arr[iM35477] = c15640;
                    break;
                }
            }
            if (c15640 == null) {
                m54120(c14930);
            }
            if (z2) {
                m54118(c19705.m44769() - iM447611, "parameter " + ((c15640 == null || c15640.getSignature() != null) ? "<unnamed>" : c15640.getName().mo4819()) + " v" + iM35477);
            }
            iM35477 += c9566M56515get.m22291();
        }
        char c2 = 0;
        for (C15640 c15642 : c15640Arr) {
            if (c15642 != null && c15642.getSignature() != null) {
                m54121(c15642);
            }
        }
        if (this.f77718 != null) {
            m54118(1, String.format("%04x: prologue end", Integer.valueOf(this.f77712)));
        }
        int size4 = arrayList.size();
        int size5 = c4162.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int size6 = c4162.size();
            while (i7 < size6 && c4162.m56520get(i7).m35535() == this.f77712) {
                int i9 = i7 + 1;
                C15640 c15640M56520get2 = c4162.m56520get(i7);
                int iM35542 = c15640M56520get2.m35541();
                C15640 c15643 = c15640Arr[iM35542];
                if (c15640M56520get2 != c15643) {
                    c15640Arr[iM35542] = c15640M56520get2;
                    if (c15640M56520get2.m35542()) {
                        if (c15643 != null && c15640M56520get2.m35540(c15643)) {
                            if (c15643.m35542()) {
                                throw new RuntimeException("shouldn't happen");
                            }
                            int iM447612 = c19705.m44769();
                            c19705.m44776(6);
                            m54125(c15640M56520get2.m35541());
                            if (this.f77718 != null) {
                                int iM447613 = c19705.m44769() - iM447612;
                                Integer numValueOf = Integer.valueOf(this.f77712);
                                String strM54122 = m54122(c15640M56520get2);
                                Object[] objArr = new Object[2];
                                objArr[c2] = numValueOf;
                                objArr[1] = strM54122;
                                m54118(iM447613, String.format("%04x: +local restart %s", objArr));
                            }
                        } else if (c15640M56520get2.getSignature() != null) {
                            m54121(c15640M56520get2);
                        } else {
                            int iM447614 = c19705.m44769();
                            c19705.m44776(3);
                            m54125(c15640M56520get2.m35541());
                            m54120(c15640M56520get2.getName());
                            C14260 type = c15640M56520get2.getType();
                            if (type == null || (c3948 = this.f77722) == null) {
                                c = 0;
                                c19705.m44766(0);
                            } else {
                                c19705.m44766(c3948.m7862().m41989(type) + 1);
                                c = 0;
                            }
                            if (this.f77718 != null) {
                                int iM447615 = c19705.m44769() - iM447614;
                                Integer numValueOf2 = Integer.valueOf(this.f77712);
                                String strM54123 = m54122(c15640M56520get2);
                                Object[] objArr2 = new Object[2];
                                objArr2[c] = numValueOf2;
                                objArr2[1] = strM54123;
                                m54118(iM447615, String.format("%04x: +local %s", objArr2));
                            }
                        }
                    } else if (c15640M56520get2.m35539() != EnumC24358.END_REPLACED) {
                        int iM447616 = c19705.m44769();
                        c19705.m44776(5);
                        c19705.m44766(c15640M56520get2.m35541());
                        if (this.f77718 != null) {
                            m54118(c19705.m44769() - iM447616, String.format("%04x: -local %s", Integer.valueOf(this.f77712), m54122(c15640M56520get2)));
                        }
                    }
                }
                c2 = 0;
                i7 = i9;
            }
            int size7 = arrayList.size();
            while (i8 < size7 && ((C8856) arrayList.get(i8)).m20462() == this.f77712) {
                m54119((C8856) arrayList.get(i8));
                i8++;
            }
            int iM35535 = i7 < size5 ? c4162.m56520get(i7).m35535() : Integer.MAX_VALUE;
            int iM20462 = i8 < size4 ? ((C8856) arrayList.get(i8)).m20462() : Integer.MAX_VALUE;
            int iMin = Math.min(iM20462, iM35535);
            if (iMin == Integer.MAX_VALUE || (iMin == this.f77721 && iM35535 == Integer.MAX_VALUE && iM20462 == Integer.MAX_VALUE)) {
                break;
            }
            if (iMin == iM20462) {
                m54119((C8856) arrayList.get(i8));
                i8++;
            } else {
                m54123(iMin - this.f77712);
            }
            c2 = 0;
        }
        c19705.m44776(0);
        if (this.f77718 != null) {
            m54118(1, "end sequence");
        }
        return c19705.m44779();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m54122(C15640 c15640) {
        StringBuilder sb = new StringBuilder(C0655am.f2277aE);
        sb.append(c15640.m35541());
        sb.append(' ');
        C14930 name = c15640.getName();
        if (name == null) {
            sb.append("null");
        } else {
            sb.append(name.mo4819());
        }
        sb.append(' ');
        C14260 type = c15640.getType();
        if (type == null) {
            sb.append("null");
        } else {
            sb.append(type.mo4819());
        }
        C14930 signature = c15640.getSignature();
        if (signature != null) {
            sb.append(' ');
            sb.append(signature.mo4819());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54120(C14930 c14930) {
        C3948 c3948;
        C19705 c19705 = this.f77717;
        if (c14930 == null || (c3948 = this.f77722) == null) {
            c19705.m44766(0);
        } else {
            c19705.m44766(c3948.m7861().m8956(c14930) + 1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54121(C15640 c15640) {
        C3948 c3948;
        C19705 c19705 = this.f77717;
        int iM44769 = c19705.m44769();
        c19705.m44776(4);
        m54125(c15640.m35541());
        m54120(c15640.getName());
        C14260 type = c15640.getType();
        if (type == null || (c3948 = this.f77722) == null) {
            c19705.m44766(0);
        } else {
            c19705.m44766(c3948.m7862().m41989(type) + 1);
        }
        m54120(c15640.getSignature());
        if (this.f77718 == null) {
            return;
        }
        m54118(c19705.m44769() - iM44769, String.format("%04x: +localx %s", Integer.valueOf(this.f77712), m54122(c15640)));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54119(C8856 c8856) {
        int iM27610 = c8856.m20463().m27610();
        int iM20462 = c8856.m20462();
        int i = iM27610 - this.f77715;
        int i2 = iM20462 - this.f77712;
        if (i2 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        if (i < -4 || i > 10) {
            m54117(i);
            i = 0;
        }
        int iM54116 = m54116(i, i2);
        if ((iM54116 & (-256)) > 0) {
            m54123(i2);
            iM54116 = m54116(i, 0);
            if ((iM54116 & (-256)) > 0) {
                m54117(i);
                iM54116 = m54116(0, 0);
                i2 = 0;
                i = 0;
            } else {
                i2 = 0;
            }
        }
        this.f77717.m44776(iM54116);
        this.f77715 += i;
        int i3 = this.f77712 + i2;
        this.f77712 = i3;
        if (this.f77718 == null) {
            return;
        }
        m54118(1, String.format("%04x: line %d", Integer.valueOf(i3), Integer.valueOf(this.f77715)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m54116(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return C24420.m53892(i2, 15, i - (-4), 10);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54117(int i) {
        C19705 c19705 = this.f77717;
        int iM44769 = c19705.m44769();
        c19705.m44776(2);
        c19705.m44778(i);
        this.f77715 += i;
        if (this.f77718 == null) {
            return;
        }
        m54118(c19705.m44769() - iM44769, String.format("line = %d", Integer.valueOf(this.f77715)));
    }

    /* JADX INFO: renamed from: ۧ */
    private void m54123(int i) {
        C19705 c19705 = this.f77717;
        int iM44769 = c19705.m44769();
        c19705.m44776(1);
        c19705.m44766(i);
        this.f77712 += i;
        if (this.f77718 == null) {
            return;
        }
        m54118(c19705.m44769() - iM44769, String.format("%04x: advance pc", Integer.valueOf(this.f77712)));
    }

    /* JADX INFO: renamed from: ܽ */
    private void m54125(int i) {
        if (i < 0) {
            throw new RuntimeException(C20778.m46922(i, "Signed value where unsigned required: "));
        }
        this.f77717.m44766(i);
    }
}
