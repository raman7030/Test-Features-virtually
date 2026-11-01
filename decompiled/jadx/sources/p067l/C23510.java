package p067l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.᩹ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8Q3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23510 implements InterfaceC11441, InterfaceC22170 {

    /* JADX INFO: renamed from: ۗ */
    public final C19781 f74903;

    /* JADX INFO: renamed from: ۙ */
    public C21244 f74904;

    /* JADX INFO: renamed from: ۛ */
    public final IdentityHashMap f74905;

    /* JADX INFO: renamed from: ۤ */
    public final boolean[] f74906;

    /* JADX INFO: renamed from: ۨ */
    public C8243 f74907;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC11441[] f74908;

    /* JADX INFO: renamed from: ۬ */
    public InterfaceC11441[] f74909;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC22170 f74911;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f74910 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public final HashMap f74912 = new HashMap();

    @Override // p067l.InterfaceC20985
    /* JADX INFO: renamed from: ֫ */
    public final void mo13095(InterfaceC2878 interfaceC2878) {
        InterfaceC22170 interfaceC22170 = this.f74911;
        interfaceC22170.getClass();
        interfaceC22170.mo13095((InterfaceC2878) this);
    }

    public C23510(C19781 c19781, long[] jArr, InterfaceC11441... interfaceC11441Arr) {
        this.f74903 = c19781;
        this.f74908 = interfaceC11441Arr;
        c19781.getClass();
        this.f74904 = new C21244(AbstractC16192.m36872of(), AbstractC16192.m36872of());
        this.f74905 = new IdentityHashMap();
        this.f74909 = new InterfaceC11441[0];
        this.f74906 = new boolean[interfaceC11441Arr.length];
        for (int i = 0; i < interfaceC11441Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f74906[i] = true;
                this.f74908[i] = new C14278(interfaceC11441Arr[i], j);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11441 m52279(int i) {
        boolean z = this.f74906[i];
        InterfaceC11441[] interfaceC11441Arr = this.f74908;
        if (z) {
            return ((C14278) interfaceC11441Arr[i]).m32809();
        }
        return interfaceC11441Arr[i];
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13097(InterfaceC22170 interfaceC22170, long j) {
        this.f74911 = interfaceC22170;
        ArrayList arrayList = this.f74910;
        InterfaceC11441[] interfaceC11441Arr = this.f74908;
        Collections.addAll(arrayList, interfaceC11441Arr);
        for (InterfaceC11441 interfaceC11441 : interfaceC11441Arr) {
            interfaceC11441.mo13097(this, j);
        }
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܿ */
    public final void mo13100() {
        for (InterfaceC11441 interfaceC11441 : this.f74908) {
            interfaceC11441.mo13100();
        }
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ᩻ */
    public final C8243 mo13102() {
        C8243 c8243 = this.f74907;
        c8243.getClass();
        return c8243;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13092(InterfaceC11617[] interfaceC11617Arr, boolean[] zArr, InterfaceC20314[] interfaceC20314Arr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        C23510 c23510 = this;
        InterfaceC20314[] interfaceC20314Arr2 = interfaceC20314Arr;
        int[] iArr = new int[interfaceC11617Arr.length];
        int[] iArr2 = new int[interfaceC11617Arr.length];
        int i = 0;
        while (true) {
            int length = interfaceC11617Arr.length;
            identityHashMap = c23510.f74905;
            if (i >= length) {
                break;
            }
            InterfaceC20314 interfaceC20314 = interfaceC20314Arr2[i];
            Integer num = interfaceC20314 == null ? null : (Integer) identityHashMap.get(interfaceC20314);
            iArr[i] = num == null ? -1 : num.intValue();
            InterfaceC11617 interfaceC11617 = interfaceC11617Arr[i];
            if (interfaceC11617 != null) {
                String str = interfaceC11617.mo4759().f42919;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = interfaceC11617Arr.length;
        InterfaceC20314[] interfaceC20314Arr3 = new InterfaceC20314[length2];
        InterfaceC20314[] interfaceC20314Arr4 = new InterfaceC20314[interfaceC11617Arr.length];
        InterfaceC11617[] interfaceC11617Arr2 = new InterfaceC11617[interfaceC11617Arr.length];
        InterfaceC11441[] interfaceC11441Arr = c23510.f74908;
        ArrayList arrayList = new ArrayList(interfaceC11441Arr.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < interfaceC11441Arr.length) {
            int i3 = 0;
            while (i3 < interfaceC11617Arr.length) {
                interfaceC20314Arr4[i3] = iArr[i3] == i2 ? interfaceC20314Arr2[i3] : null;
                if (iArr2[i3] == i2) {
                    InterfaceC11617 interfaceC11618 = interfaceC11617Arr[i3];
                    interfaceC11618.getClass();
                    C15020 c15020 = (C15020) c23510.f74912.get(interfaceC11618.mo4759());
                    c15020.getClass();
                    interfaceC11617Arr2[i3] = new C22840(interfaceC11618, c15020);
                } else {
                    interfaceC11617Arr2[i3] = null;
                }
                i3++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i4 = i2;
            InterfaceC11441[] interfaceC11441Arr2 = interfaceC11441Arr;
            InterfaceC11617[] interfaceC11617Arr3 = interfaceC11617Arr2;
            long jMo13092 = interfaceC11441Arr[i2].mo13092(interfaceC11617Arr2, zArr, interfaceC20314Arr4, zArr2, j2);
            if (i4 == 0) {
                j2 = jMo13092;
            } else if (jMo13092 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < interfaceC11617Arr.length; i5++) {
                if (iArr2[i5] == i4) {
                    InterfaceC20314 interfaceC20315 = interfaceC20314Arr4[i5];
                    interfaceC20315.getClass();
                    interfaceC20314Arr3[i5] = interfaceC20314Arr4[i5];
                    identityHashMap.put(interfaceC20315, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    C23877.m52960(interfaceC20314Arr4[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(interfaceC11441Arr2[i4]);
            }
            i2 = i4 + 1;
            interfaceC20314Arr2 = interfaceC20314Arr;
            arrayList = arrayList2;
            interfaceC11617Arr2 = interfaceC11617Arr3;
            interfaceC11441Arr = interfaceC11441Arr2;
            c23510 = this;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(interfaceC20314Arr3, 0, interfaceC20314Arr, 0, length2);
        this.f74909 = (InterfaceC11441[]) arrayList3.toArray(new InterfaceC11441[0]);
        AbstractList abstractListM21989 = C9468.m21989(arrayList3, new C19158(5));
        this.f74903.getClass();
        this.f74904 = new C21244(arrayList3, abstractListM21989);
        return j2;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13093(long j, boolean z) {
        for (InterfaceC11441 interfaceC11441 : this.f74909) {
            interfaceC11441.mo13093(j, z);
        }
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final void mo4635(long j) {
        this.f74904.mo4635(j);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4632(C13268 c13268) {
        ArrayList arrayList = this.f74910;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC11441) arrayList.get(i)).mo4632(c13268);
            }
            return false;
        }
        return this.f74904.mo4632(c13268);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4631() {
        return this.f74904.mo4631();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final long mo4634() {
        return this.f74904.mo4634();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܽ */
    public final long mo13098() {
        long j = -9223372036854775807L;
        for (InterfaceC11441 interfaceC11441 : this.f74909) {
            long jMo13098 = interfaceC11441.mo13098();
            if (jMo13098 == -9223372036854775807L) {
                if (j != -9223372036854775807L && interfaceC11441.mo13090(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (InterfaceC11441 interfaceC11442 : this.f74909) {
                    if (interfaceC11442 == interfaceC11441) {
                        break;
                    }
                    if (interfaceC11442.mo13090(jMo13098) != jMo13098) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jMo13098;
            } else if (jMo13098 != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۜ */
    public final long mo4633() {
        return this.f74904.mo4633();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13090(long j) {
        long jMo13090 = this.f74909[0].mo13090(j);
        int i = 1;
        while (true) {
            InterfaceC11441[] interfaceC11441Arr = this.f74909;
            if (i >= interfaceC11441Arr.length) {
                return jMo13090;
            }
            if (interfaceC11441Arr[i].mo13090(jMo13090) != jMo13090) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13091(long j, C11491 c11491) {
        InterfaceC11441[] interfaceC11441Arr = this.f74909;
        return (interfaceC11441Arr.length > 0 ? interfaceC11441Arr[0] : this.f74908[0]).mo13091(j, c11491);
    }

    @Override // p067l.InterfaceC22170
    /* JADX INFO: renamed from: ֫ */
    public final void mo13096(InterfaceC11441 interfaceC11441) {
        ArrayList arrayList = this.f74910;
        arrayList.remove(interfaceC11441);
        if (arrayList.isEmpty()) {
            InterfaceC11441[] interfaceC11441Arr = this.f74908;
            int i = 0;
            for (InterfaceC11441 interfaceC11442 : interfaceC11441Arr) {
                i += interfaceC11442.mo13102().f21837;
            }
            C15020[] c15020Arr = new C15020[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC11441Arr.length; i3++) {
                C8243 c8243Mo13102 = interfaceC11441Arr[i3].mo13102();
                int i4 = c8243Mo13102.f21837;
                int i5 = 0;
                while (i5 < i4) {
                    C15020 c15020M19034 = c8243Mo13102.m19034(i5);
                    C10307[] c10307Arr = new C10307[c15020M19034.f42921];
                    for (int i6 = 0; i6 < c15020M19034.f42921; i6++) {
                        C10307 c10307M34395 = c15020M19034.m34395(i6);
                        C3601 c3601M23918 = c10307M34395.m23918();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = c10307M34395.f28535;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c3601M23918.m6701(sb.toString());
                        c10307Arr[i6] = c3601M23918.m6672();
                    }
                    C15020 c15020 = new C15020(i3 + ":" + c15020M19034.f42919, c10307Arr);
                    this.f74912.put(c15020, c15020M19034);
                    c15020Arr[i2] = c15020;
                    i5++;
                    i2++;
                }
            }
            this.f74907 = new C8243(c15020Arr);
            InterfaceC22170 interfaceC22170 = this.f74911;
            interfaceC22170.getClass();
            interfaceC22170.mo13096((InterfaceC11441) this);
        }
    }
}
