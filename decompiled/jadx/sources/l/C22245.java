package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.᩹ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8Q3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22245 implements InterfaceC9546, InterfaceC20835 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18321 f72178;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19861 f72179;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f72180;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean[] f72181;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6181 f72182;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9546[] f72183;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC9546[] f72184;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC20835 f72186;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f72185 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f72187 = new HashMap();

    @Override // l.InterfaceC19588
    /* JADX INFO: renamed from: ֫ */
    public final void mo11119(InterfaceC0536 interfaceC0536) {
        InterfaceC20835 interfaceC20835 = this.f72186;
        interfaceC20835.getClass();
        interfaceC20835.mo11119((InterfaceC0536) this);
    }

    public C22245(C18321 c18321, long[] jArr, InterfaceC9546... interfaceC9546Arr) {
        this.f72178 = c18321;
        this.f72183 = interfaceC9546Arr;
        c18321.getClass();
        this.f72179 = new C19861(AbstractC14545.of(), AbstractC14545.of());
        this.f72180 = new IdentityHashMap();
        this.f72184 = new InterfaceC9546[0];
        this.f72181 = new boolean[interfaceC9546Arr.length];
        for (int i = 0; i < interfaceC9546Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f72181[i] = true;
                this.f72183[i] = new C12531(interfaceC9546Arr[i], j);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9546 m49951(int i) {
        boolean z = this.f72181[i];
        InterfaceC9546[] interfaceC9546Arr = this.f72183;
        if (z) {
            return ((C12531) interfaceC9546Arr[i]).m30737();
        }
        return interfaceC9546Arr[i];
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final void mo11121(InterfaceC20835 interfaceC20835, long j) {
        this.f72186 = interfaceC20835;
        ArrayList arrayList = this.f72185;
        InterfaceC9546[] interfaceC9546Arr = this.f72183;
        Collections.addAll(arrayList, interfaceC9546Arr);
        for (InterfaceC9546 interfaceC9546 : interfaceC9546Arr) {
            interfaceC9546.mo11121(this, j);
        }
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ܿ */
    public final void mo11124() {
        for (InterfaceC9546 interfaceC9546 : this.f72183) {
            interfaceC9546.mo11124();
        }
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ᩻ */
    public final C6181 mo11126() {
        C6181 c6181 = this.f72182;
        c6181.getClass();
        return c6181;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11116(InterfaceC9731[] interfaceC9731Arr, boolean[] zArr, InterfaceC18882[] interfaceC18882Arr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        C22245 c22245 = this;
        InterfaceC18882[] interfaceC18882Arr2 = interfaceC18882Arr;
        int[] iArr = new int[interfaceC9731Arr.length];
        int[] iArr2 = new int[interfaceC9731Arr.length];
        int i = 0;
        while (true) {
            int length = interfaceC9731Arr.length;
            identityHashMap = c22245.f72180;
            if (i >= length) {
                break;
            }
            InterfaceC18882 interfaceC18882 = interfaceC18882Arr2[i];
            Integer num = interfaceC18882 == null ? null : (Integer) identityHashMap.get(interfaceC18882);
            iArr[i] = num == null ? -1 : num.intValue();
            InterfaceC9731 interfaceC9731 = interfaceC9731Arr[i];
            if (interfaceC9731 != null) {
                String str = interfaceC9731.mo2388().f39852;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = interfaceC9731Arr.length;
        InterfaceC18882[] interfaceC18882Arr3 = new InterfaceC18882[length2];
        InterfaceC18882[] interfaceC18882Arr4 = new InterfaceC18882[interfaceC9731Arr.length];
        InterfaceC9731[] interfaceC9731Arr2 = new InterfaceC9731[interfaceC9731Arr.length];
        InterfaceC9546[] interfaceC9546Arr = c22245.f72183;
        ArrayList arrayList = new ArrayList(interfaceC9546Arr.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < interfaceC9546Arr.length) {
            int i3 = 0;
            while (i3 < interfaceC9731Arr.length) {
                interfaceC18882Arr4[i3] = iArr[i3] == i2 ? interfaceC18882Arr2[i3] : null;
                if (iArr2[i3] == i2) {
                    InterfaceC9731 interfaceC9732 = interfaceC9731Arr[i3];
                    interfaceC9732.getClass();
                    C13312 c13312 = (C13312) c22245.f72187.get(interfaceC9732.mo2388());
                    c13312.getClass();
                    interfaceC9731Arr2[i3] = new C21540(interfaceC9732, c13312);
                } else {
                    interfaceC9731Arr2[i3] = null;
                }
                i3++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i4 = i2;
            InterfaceC9546[] interfaceC9546Arr2 = interfaceC9546Arr;
            InterfaceC9731[] interfaceC9731Arr3 = interfaceC9731Arr2;
            long jMo11116 = interfaceC9546Arr[i2].mo11116(interfaceC9731Arr2, zArr, interfaceC18882Arr4, zArr2, j2);
            if (i4 == 0) {
                j2 = jMo11116;
            } else if (jMo11116 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < interfaceC9731Arr.length; i5++) {
                if (iArr2[i5] == i4) {
                    InterfaceC18882 interfaceC18883 = interfaceC18882Arr4[i5];
                    interfaceC18883.getClass();
                    interfaceC18882Arr3[i5] = interfaceC18882Arr4[i5];
                    identityHashMap.put(interfaceC18883, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    C22632.m50634(interfaceC18882Arr4[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(interfaceC9546Arr2[i4]);
            }
            i2 = i4 + 1;
            interfaceC18882Arr2 = interfaceC18882Arr;
            arrayList = arrayList2;
            interfaceC9731Arr2 = interfaceC9731Arr3;
            interfaceC9546Arr = interfaceC9546Arr2;
            c22245 = this;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(interfaceC18882Arr3, 0, interfaceC18882Arr, 0, length2);
        this.f72184 = (InterfaceC9546[]) arrayList3.toArray(new InterfaceC9546[0]);
        AbstractList abstractListM20014 = C7470.m20014(arrayList3, new C17665(5));
        this.f72178.getClass();
        this.f72179 = new C19861(arrayList3, abstractListM20014);
        return j2;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final void mo11117(long j, boolean z) {
        for (InterfaceC9546 interfaceC9546 : this.f72184) {
            interfaceC9546.mo11117(j, z);
        }
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final void mo2268(long j) {
        this.f72179.mo2268(j);
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2265(C11469 c11469) {
        ArrayList arrayList = this.f72185;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC9546) arrayList.get(i)).mo2265(c11469);
            }
            return false;
        }
        return this.f72179.mo2265(c11469);
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2264() {
        return this.f72179.mo2264();
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final long mo2267() {
        return this.f72179.mo2267();
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ܽ */
    public final long mo11122() {
        long j = -9223372036854775807L;
        for (InterfaceC9546 interfaceC9546 : this.f72184) {
            long jMo11122 = interfaceC9546.mo11122();
            if (jMo11122 == -9223372036854775807L) {
                if (j != -9223372036854775807L && interfaceC9546.mo11114(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (InterfaceC9546 interfaceC9547 : this.f72184) {
                    if (interfaceC9547 == interfaceC9546) {
                        break;
                    }
                    if (interfaceC9547.mo11114(jMo11122) != jMo11122) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jMo11122;
            } else if (jMo11122 != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۜ */
    public final long mo2266() {
        return this.f72179.mo2266();
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11114(long j) {
        long jMo11114 = this.f72184[0].mo11114(j);
        int i = 1;
        while (true) {
            InterfaceC9546[] interfaceC9546Arr = this.f72184;
            if (i >= interfaceC9546Arr.length) {
                return jMo11114;
            }
            if (interfaceC9546Arr[i].mo11114(jMo11114) != jMo11114) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11115(long j, C9599 c9599) {
        InterfaceC9546[] interfaceC9546Arr = this.f72184;
        return (interfaceC9546Arr.length > 0 ? interfaceC9546Arr[0] : this.f72183[0]).mo11115(j, c9599);
    }

    @Override // l.InterfaceC20835
    /* JADX INFO: renamed from: ֫ */
    public final void mo11120(InterfaceC9546 interfaceC9546) {
        ArrayList arrayList = this.f72185;
        arrayList.remove(interfaceC9546);
        if (arrayList.isEmpty()) {
            InterfaceC9546[] interfaceC9546Arr = this.f72183;
            int i = 0;
            for (InterfaceC9546 interfaceC9547 : interfaceC9546Arr) {
                i += interfaceC9547.mo11126().f18978;
            }
            C13312[] c13312Arr = new C13312[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC9546Arr.length; i3++) {
                C6181 c6181Mo11126 = interfaceC9546Arr[i3].mo11126();
                int i4 = c6181Mo11126.f18978;
                int i5 = 0;
                while (i5 < i4) {
                    C13312 c13312M17102 = c6181Mo11126.m17102(i5);
                    C8353[] c8353Arr = new C8353[c13312M17102.f39854];
                    for (int i6 = 0; i6 < c13312M17102.f39854; i6++) {
                        C8353 c8353M32295 = c13312M17102.m32295(i6);
                        C1297 c1297M21948 = c8353M32295.m21948();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = c8353M32295.f25621;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c1297M21948.m4469(sb.toString());
                        c8353Arr[i6] = c1297M21948.m4440();
                    }
                    C13312 c13312 = new C13312(i3 + ":" + c13312M17102.f39852, c8353Arr);
                    this.f72187.put(c13312, c13312M17102);
                    c13312Arr[i2] = c13312;
                    i5++;
                    i2++;
                }
            }
            this.f72182 = new C6181(c13312Arr);
            InterfaceC20835 interfaceC20835 = this.f72186;
            interfaceC20835.getClass();
            interfaceC20835.mo11120((InterfaceC9546) this);
        }
    }
}
