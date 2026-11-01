package p067l;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ܿ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19144 implements InterfaceC19583, InterfaceC8854, InterfaceC2878, InterfaceC23116, InterfaceC4891 {

    /* JADX INFO: renamed from: ᩳۧ */
    public static final Set f57158 = C21562.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: ֡֫ */
    public int f57159;

    /* JADX INFO: renamed from: ֨֫ */
    public int f57160;

    /* JADX INFO: renamed from: ֫֫ */
    public final InterfaceC12878 f57161;

    /* JADX INFO: renamed from: ֫ۧ */
    public boolean f57162;

    /* JADX INFO: renamed from: ۖ֫ */
    public final Map f57163;

    /* JADX INFO: renamed from: ۗ */
    public final C16658 f57164;

    /* JADX INFO: renamed from: ۗ֫ */
    public int[] f57165;

    /* JADX INFO: renamed from: ۘ֫ */
    public long f57166;

    /* JADX INFO: renamed from: ۙ */
    public C10307 f57167;

    /* JADX INFO: renamed from: ۙ֫ */
    public HashSet f57168;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f57169;

    /* JADX INFO: renamed from: ۛ */
    public int f57170;

    /* JADX INFO: renamed from: ۛ֫ */
    public boolean f57171;

    /* JADX INFO: renamed from: ۜ֫ */
    public final int f57172;

    /* JADX INFO: renamed from: ۟ */
    public long f57173;

    /* JADX INFO: renamed from: ۟֫ */
    public final int f57174;

    /* JADX INFO: renamed from: ۠֫ */
    public final List f57175;

    /* JADX INFO: renamed from: ۡ֫ */
    public final RunnableC15474 f57176;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C2734 f57177;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC20790 f57178;

    /* JADX INFO: renamed from: ۤ֫ */
    public boolean[] f57179;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C10866 f57180 = new C10866("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: ۧۧ */
    public final String f57181;

    /* JADX INFO: renamed from: ۨ */
    public final Handler f57182;

    /* JADX INFO: renamed from: ۨ֫ */
    public C21511 f57183;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC6601 f57184;

    /* JADX INFO: renamed from: ۫֫ */
    public boolean f57185;

    /* JADX INFO: renamed from: ۬ */
    public C21037 f57186;

    /* JADX INFO: renamed from: ۬֫ */
    public C19815[] f57187;

    /* JADX INFO: renamed from: ܰ */
    public final ArrayList f57188;

    /* JADX INFO: renamed from: ܰ֫ */
    public C8243 f57189;

    /* JADX INFO: renamed from: ܳ֫ */
    public final ArrayList f57190;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f57191;

    /* JADX INFO: renamed from: ܺ֫ */
    public Set f57192;

    /* JADX INFO: renamed from: ܽ֫ */
    public AbstractC9584 f57193;

    /* JADX INFO: renamed from: ܽۧ */
    public C10307 f57194;

    /* JADX INFO: renamed from: ܿ֫ */
    public final RunnableC24192 f57195;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f57196;

    /* JADX INFO: renamed from: ᩴ֫ */
    public boolean f57197;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f57198;

    /* JADX INFO: renamed from: ᩶ */
    public final C16815 f57199;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean[] f57200;

    /* JADX INFO: renamed from: ᩷֫ */
    public final C10307 f57201;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC23016 f57202;

    /* JADX INFO: renamed from: ᩸֫ */
    public long f57203;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC13110 f57204;

    /* JADX INFO: renamed from: ᩹֫ */
    public SparseIntArray f57205;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f57206;

    /* JADX INFO: renamed from: ᩺֫ */
    public int[] f57207;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C10099 f57208;

    /* JADX INFO: renamed from: ᩻ */
    public static int m43602(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final void mo5733(InterfaceC11402 interfaceC11402) {
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final C18912 mo14657(InterfaceC24947 interfaceC24947, long j, long j2, IOException iOException, int i) {
        C18912 c18912M25032;
        int i2;
        AbstractC9584 abstractC9584 = (AbstractC9584) interfaceC24947;
        boolean z = abstractC9584 instanceof C21511;
        if (z && !((C21511) abstractC9584).m48713() && (iOException instanceof C24959) && ((i2 = ((C24959) iOException).f79694) == 410 || i2 == 404)) {
            return C10866.f30115;
        }
        long jM22320 = abstractC9584.m22320();
        abstractC9584.m22321();
        C12782 c12782 = new C12782(j2, abstractC9584.m22322());
        C5792.m13013(abstractC9584.f26381);
        C5792.m13013(abstractC9584.f26380);
        C4160 c4160 = new C4160(iOException, i);
        C16815 c16815 = this.f57199;
        C15638 c15638M47345 = C21005.m47345(c16815.m38103());
        InterfaceC12878 interfaceC12878 = this.f57161;
        C9604 c9604Mo29504 = interfaceC12878.mo29504(c15638M47345, c4160);
        boolean zM38100 = (c9604Mo29504 == null || c9604Mo29504.f26469 != 2) ? false : c16815.m38100(abstractC9584, c9604Mo29504.f26468);
        if (zM38100) {
            if (z && jM22320 == 0) {
                ArrayList arrayList = this.f57190;
                C23877.m52960(((C21511) C6406.m14670(arrayList, 1)) == abstractC9584);
                if (arrayList.isEmpty()) {
                    this.f57166 = this.f57173;
                } else {
                    ((C21511) C10810.m24926(arrayList)).m48711();
                }
            }
            c18912M25032 = C10866.f30117;
        } else {
            long jMo29503 = interfaceC12878.mo29503(c4160);
            c18912M25032 = jMo29503 != -9223372036854775807L ? C10866.m25032(jMo29503, false) : C10866.f30116;
        }
        C18912 c18912 = c18912M25032;
        boolean zM43018 = c18912.m43018();
        this.f57208.m23561(c12782, abstractC9584.f26383, this.f57174, abstractC9584.f26379, abstractC9584.f26377, abstractC9584.f26384, abstractC9584.f26381, abstractC9584.f26380, iOException, !zM43018);
        if (!zM43018) {
            this.f57193 = null;
        }
        if (zM38100) {
            if (!this.f57198) {
                C7903 c7903 = new C7903();
                c7903.m18255(this.f57173);
                mo4632(c7903.m18252());
                return c18912;
            }
            ((C14804) this.f57204).mo13095(this);
        }
        return c18912;
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14658(InterfaceC24947 interfaceC24947, long j, long j2) {
        AbstractC9584 abstractC9584 = (AbstractC9584) interfaceC24947;
        this.f57193 = null;
        this.f57199.m38093(abstractC9584);
        long j3 = abstractC9584.f26382;
        abstractC9584.m22321();
        Map mapM22322 = abstractC9584.m22322();
        abstractC9584.m22320();
        C12782 c12782 = new C12782(j2, mapM22322);
        this.f57161.getClass();
        this.f57208.m23564(c12782, abstractC9584.f26383, this.f57174, abstractC9584.f26379, abstractC9584.f26377, abstractC9584.f26384, abstractC9584.f26381, abstractC9584.f26380);
        if (!this.f57198) {
            C7903 c7903 = new C7903();
            c7903.m18255(this.f57173);
            mo4632(c7903.m18252());
            return;
        }
        ((C14804) this.f57204).mo13095(this);
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14659(InterfaceC24947 interfaceC24947, long j, long j2, int i) {
        C12782 c12782;
        AbstractC9584 abstractC9584 = (AbstractC9584) interfaceC24947;
        if (i == 0) {
            long j3 = abstractC9584.f26382;
            c12782 = new C12782(abstractC9584.f26378);
        } else {
            long j4 = abstractC9584.f26382;
            abstractC9584.m22321();
            Map mapM22322 = abstractC9584.m22322();
            abstractC9584.m22320();
            c12782 = new C12782(j2, mapM22322);
        }
        this.f57208.m23560(c12782, abstractC9584.f26383, this.f57174, abstractC9584.f26379, abstractC9584.f26377, abstractC9584.f26384, abstractC9584.f26381, abstractC9584.f26380, i);
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14660(InterfaceC24947 interfaceC24947, long j, long j2, boolean z) {
        AbstractC9584 abstractC9584 = (AbstractC9584) interfaceC24947;
        this.f57193 = null;
        long j3 = abstractC9584.f26382;
        abstractC9584.m22321();
        Map mapM22322 = abstractC9584.m22322();
        abstractC9584.m22320();
        C12782 c12782 = new C12782(j2, mapM22322);
        this.f57161.getClass();
        this.f57208.m23559(c12782, abstractC9584.f26383, this.f57174, abstractC9584.f26379, abstractC9584.f26377, abstractC9584.f26384, abstractC9584.f26381, abstractC9584.f26380);
        if (z) {
            return;
        }
        if (m43595() || this.f57170 == 0) {
            m43596();
        }
        if (this.f57170 > 0) {
            ((C14804) this.f57204).mo13095(this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [l.᩺ۨ֫] */
    /* JADX WARN: Type inference failed for: r1v13, types: [l.ܰۨ֫] */
    public C19144(String str, int i, InterfaceC13110 interfaceC13110, C16815 c16815, Map map, InterfaceC23016 interfaceC23016, long j, C10307 c10307, InterfaceC6601 interfaceC6601, C16658 c16658, InterfaceC12878 interfaceC12878, C10099 c10099, int i2) {
        this.f57181 = str;
        this.f57174 = i;
        this.f57204 = interfaceC13110;
        this.f57199 = c16815;
        this.f57163 = map;
        this.f57202 = interfaceC23016;
        this.f57201 = c10307;
        this.f57184 = interfaceC6601;
        this.f57164 = c16658;
        this.f57161 = interfaceC12878;
        this.f57208 = c10099;
        this.f57172 = i2;
        C2734 c2734 = new C2734();
        c2734.f4595 = null;
        c2734.f4596 = false;
        c2734.f4597 = null;
        this.f57177 = c2734;
        this.f57165 = new int[0];
        Set set = f57158;
        this.f57168 = new HashSet(set.size());
        this.f57205 = new SparseIntArray(set.size());
        this.f57187 = new C19815[0];
        this.f57200 = new boolean[0];
        this.f57179 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f57190 = arrayList;
        this.f57175 = C21562.unmodifiableList(arrayList);
        this.f57188 = new ArrayList();
        this.f57195 = new Runnable() { // from class: l.᩺ۨ֫
            @Override // java.lang.Runnable
            public final void run() {
                this.f76686.m43590();
            }
        };
        this.f57176 = new Runnable() { // from class: l.ܰۨ֫
            @Override // java.lang.Runnable
            public final void run() {
                C19144.m43598(this.f44185);
            }
        };
        this.f57182 = C5792.m12995((Handler.Callback) null);
        this.f57173 = j;
        this.f57166 = j;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m43616() {
        if (this.f57198) {
            return;
        }
        C7903 c7903 = new C7903();
        c7903.m18255(this.f57173);
        mo4632(c7903.m18252());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43610(C15020[] c15020Arr, int... iArr) {
        this.f57189 = m43591(c15020Arr);
        this.f57192 = new HashSet();
        for (int i : iArr) {
            this.f57192.add(this.f57189.m19034(i));
        }
        this.f57160 = 0;
        final InterfaceC13110 interfaceC13110 = this.f57204;
        this.f57182.post(new Runnable() { // from class: l.۟ۨ֫
            @Override // java.lang.Runnable
            public final void run() {
                ((C14804) interfaceC13110).m33811();
            }
        });
        this.f57198 = true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m43622() {
        m43619();
        if (this.f57196 && !this.f57198) {
            throw C10998.m25387("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C8243 m43625() {
        m43601();
        return this.f57189;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43603(int i) {
        m43601();
        this.f57207.getClass();
        int i2 = this.f57207[i];
        if (i2 == -1) {
            return this.f57192.contains(this.f57189.m19034(i)) ? -3 : -2;
        }
        boolean[] zArr = this.f57179;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m43623(int i) {
        m43601();
        this.f57207.getClass();
        int i2 = this.f57207[i];
        C23877.m52960(this.f57179[i2]);
        this.f57179[i2] = false;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m43612(InterfaceC11617[] interfaceC11617Arr, boolean[] zArr, InterfaceC20314[] interfaceC20314Arr, boolean[] zArr2, long j, boolean z) {
        boolean z2;
        m43601();
        int i = this.f57170;
        for (int i2 = 0; i2 < interfaceC11617Arr.length; i2++) {
            C13464 c13464 = (C13464) interfaceC20314Arr[i2];
            if (c13464 != null && (interfaceC11617Arr[i2] == null || !zArr[i2])) {
                this.f57170--;
                c13464.m30609();
                interfaceC20314Arr[i2] = null;
            }
        }
        boolean z3 = z || (!this.f57171 ? j == this.f57173 : i != 0);
        C16815 c16815 = this.f57199;
        InterfaceC11617 interfaceC11617M38103 = c16815.m38103();
        boolean z4 = z3;
        InterfaceC11617 interfaceC11617 = interfaceC11617M38103;
        for (int i3 = 0; i3 < interfaceC11617Arr.length; i3++) {
            InterfaceC11617 interfaceC11618 = interfaceC11617Arr[i3];
            if (interfaceC11618 != null) {
                int iM19033 = this.f57189.m19033(interfaceC11618.mo4759());
                if (iM19033 == this.f57160) {
                    c16815.m38094(interfaceC11618);
                    interfaceC11617 = interfaceC11618;
                }
                if (interfaceC20314Arr[i3] == null) {
                    this.f57170++;
                    C13464 c13465 = new C13464(this, iM19033);
                    interfaceC20314Arr[i3] = c13465;
                    zArr2[i3] = true;
                    if (this.f57207 != null) {
                        c13465.m30608();
                        if (!z4) {
                            C19815 c19815 = this.f57187[this.f57207[iM19033]];
                            z4 = (c19815.m14133() == 0 || c19815.m14132(j, true)) ? false : true;
                        }
                    }
                }
            }
        }
        int i4 = this.f57170;
        ArrayList arrayList = this.f57190;
        if (i4 == 0) {
            c16815.m38105();
            this.f57167 = null;
            this.f57197 = true;
            arrayList.clear();
            C10866 c10866 = this.f57180;
            if (c10866.m25042()) {
                if (this.f57185) {
                    for (C19815 c19816 : this.f57187) {
                        c19816.m14117();
                    }
                }
                c10866.m25036();
            } else {
                m43596();
            }
        } else {
            if (arrayList.isEmpty() || C12826.equals(interfaceC11617, interfaceC11617M38103)) {
                z2 = z;
            } else {
                if (!this.f57171) {
                    long j2 = j < 0 ? -j : 0L;
                    C21511 c21511M43589 = m43589();
                    interfaceC11617.mo6030(j, j2, -9223372036854775807L, this.f57175, c16815.m38101(c21511M43589, j));
                    if (interfaceC11617.mo4761() == c16815.m38092().m34394(c21511M43589.f26379)) {
                        z2 = z;
                    }
                }
                this.f57197 = true;
                z2 = true;
                z4 = true;
            }
            if (z4) {
                m43618(j, z2);
                for (int i5 = 0; i5 < interfaceC20314Arr.length; i5++) {
                    if (interfaceC20314Arr[i5] != null) {
                        zArr2[i5] = true;
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f57188;
        arrayList2.clear();
        for (InterfaceC20314 interfaceC20314 : interfaceC20314Arr) {
            if (interfaceC20314 != null) {
                arrayList2.add((C13464) interfaceC20314);
            }
        }
        this.f57171 = true;
        return z4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43607(long j, boolean z) {
        if (!this.f57185 || m43595()) {
            return;
        }
        int length = this.f57187.length;
        for (int i = 0; i < length; i++) {
            this.f57187[i].m14119(j, z, this.f57179[i]);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m43618(long j, boolean z) {
        C21511 c21511;
        boolean z2;
        boolean zM14132;
        this.f57173 = j;
        if (m43595()) {
            this.f57166 = j;
            return true;
        }
        boolean zM38104 = this.f57199.m38104();
        ArrayList arrayList = this.f57190;
        if (!zM38104) {
            c21511 = null;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                c21511 = null;
                break;
            }
            c21511 = (C21511) arrayList.get(i);
            if (c21511.f26381 == j) {
                break;
            }
            i++;
        }
        if (this.f57185 && !z && !arrayList.isEmpty()) {
            int length = this.f57187.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = true;
                    break;
                }
                C19815 c19815 = this.f57187[i2];
                if (c21511 != null) {
                    zM14132 = c19815.m14131(c21511.m48708(i2));
                } else {
                    long jMo4634 = mo4634();
                    zM14132 = c19815.m14132(j, jMo4634 == Long.MIN_VALUE || j < jMo4634);
                }
                if (!zM14132 && (this.f57200[i2] || !this.f57206)) {
                    z2 = false;
                    break;
                }
                i2++;
            }
            if (z2) {
                return false;
            }
        }
        this.f57166 = j;
        this.f57196 = false;
        arrayList.clear();
        C10866 c10866 = this.f57180;
        if (c10866.m25042()) {
            if (this.f57185) {
                for (C19815 c19816 : this.f57187) {
                    c19816.m14117();
                }
            }
            c10866.m25036();
            return true;
        }
        c10866.m25040();
        m43596();
        return true;
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m43614() {
        ArrayList arrayList = this.f57190;
        if (arrayList.isEmpty()) {
            return;
        }
        final C21511 c21511 = (C21511) C10810.m24926(arrayList);
        C16815 c16815 = this.f57199;
        int iM38090 = c16815.m38090(c21511);
        if (iM38090 == 1) {
            if (c21511.m48713()) {
                return;
            }
            c21511.m48709(c16815.m38102(c21511));
        } else if (iM38090 == 0) {
            this.f57182.post(new Runnable() { // from class: l.֫᩺֫
                @Override // java.lang.Runnable
                public final void run() {
                    C19144.m43594(this.f9876, c21511);
                }
            });
        } else {
            if (iM38090 != 2 || this.f57196) {
                return;
            }
            C10866 c10866 = this.f57180;
            if (c10866.m25042()) {
                c10866.m25036();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43594(C19144 c19144, C21511 c21511) {
        InterfaceC13110 interfaceC13110 = c19144.f57204;
        ((C14804) interfaceC13110).f42229.f40148.mo11233(c21511.f67870);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m43624() {
        if (this.f57198) {
            for (C19815 c19815 : this.f57187) {
                c19815.m14122();
            }
        }
        this.f57199.m38105();
        this.f57180.m25038(this);
        this.f57182.removeCallbacksAndMessages(null);
        this.f57191 = true;
        this.f57188.clear();
    }

    @Override // p067l.InterfaceC8854
    /* JADX INFO: renamed from: ᩳ */
    public final void mo20461() {
        for (C19815 c19815 : this.f57187) {
            c19815.m14123();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43609(boolean z) {
        this.f57199.m38096(z);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m43611(Uri uri, C4160 c4160, boolean z) {
        long j;
        C16815 c16815 = this.f57199;
        if (!c16815.m38098(uri)) {
            return true;
        }
        if (z) {
            j = -9223372036854775807L;
        } else {
            C9604 c9604Mo29504 = this.f57161.mo29504(C21005.m47345(c16815.m38103()), c4160);
            if (c9604Mo29504 == null || c9604Mo29504.f26469 != 2) {
                j = -9223372036854775807L;
            } else {
                j = c9604Mo29504.f26468;
            }
        }
        return c16815.m38099(uri, j);
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m43615() {
        return this.f57169 == 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m43606(long j, C11491 c11491) {
        return this.f57199.m38091(j, c11491);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m43617(int i) {
        return !m43595() && this.f57187[i].m14121(this.f57196);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m43620(int i) {
        m43619();
        this.f57187[i].m14125();
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m43619() {
        this.f57180.m25037(Integer.MIN_VALUE);
        this.f57199.m38106();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43605(int i, C5221 c5221, C23128 c23128, int i2) {
        int i3;
        C10307 c10307;
        if (m43595()) {
            return -3;
        }
        ArrayList arrayList = this.f57190;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            loop0: while (i4 < arrayList.size() - 1) {
                int i5 = ((C21511) arrayList.get(i4)).f67877;
                int length = this.f57187.length;
                for (int i6 = 0; i6 < length; i6++) {
                    if (this.f57179[i6] && this.f57187[i6].m14134() == i5) {
                        break loop0;
                    }
                }
                i4++;
            }
            String str = C5792.f14228;
            if (i4 > arrayList.size() || i4 < 0) {
                throw new IllegalArgumentException();
            }
            if (i4 != 0) {
                arrayList.subList(0, i4).clear();
            }
            C21511 c21511 = (C21511) arrayList.get(0);
            C10307 c10308 = c21511.f26379;
            if (!c10308.equals(this.f57167)) {
                C8758 c8758 = new C8758(1, this.f57174, c10308, c21511.f26377, c21511.f26384, C5792.m13013(c21511.f26381), -9223372036854775807L);
                C10099 c10099 = this.f57208;
                c10099.m23563(new C14496(c10099, c8758));
            }
            this.f57167 = c10308;
        }
        if (arrayList.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 0;
            if (!((C21511) arrayList.get(0)).m48713()) {
                return -3;
            }
        }
        int iM14116 = this.f57187[i].m14116(c5221, c23128, i2, this.f57196);
        if (iM14116 == -5) {
            C10307 c10307M23921 = c5221.f12253;
            c10307M23921.getClass();
            if (i == this.f57159) {
                int iM34548 = C15129.m34548(this.f57187[i].m14134());
                while (i3 < arrayList.size() && ((C21511) arrayList.get(i3)).f67877 != iM34548) {
                    i3++;
                }
                if (i3 < arrayList.size()) {
                    c10307 = ((C21511) arrayList.get(i3)).f26379;
                } else {
                    c10307 = this.f57194;
                    c10307.getClass();
                }
                c10307M23921 = c10307M23921.m23921(c10307);
            }
            c5221.f12253 = c10307M23921;
        }
        return iM14116;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX INFO: renamed from: ֫ */
    public final int m43604(int i, long j) {
        Object next;
        Object objM45383;
        if (m43595()) {
            return 0;
        }
        C19815 c19815 = this.f57187[i];
        int iM14115 = c19815.m14115(j, this.f57196);
        ArrayList arrayList = this.f57190;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objM45383 = next;
            } else {
                objM45383 = null;
            }
        } else if (arrayList.isEmpty()) {
            objM45383 = null;
        } else {
            objM45383 = C20013.m45383(arrayList, 1);
        }
        C21511 c21511 = (C21511) objM45383;
        if (c21511 != null && !c21511.m48713()) {
            iM14115 = Math.min(iM14115, c21511.m48708(i) - c19815.m14133());
        }
        c19815.m14136(iM14115);
        return iM14115;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۜ */
    public final long mo4633() {
        if (this.f57196) {
            return Long.MIN_VALUE;
        }
        if (m43595()) {
            return this.f57166;
        }
        long jMax = this.f57173;
        C21511 c21511M43589 = m43589();
        if (!c21511M43589.m48715()) {
            ArrayList arrayList = this.f57190;
            c21511M43589 = arrayList.size() > 1 ? (C21511) C20013.m45383(arrayList, 2) : null;
        }
        if (c21511M43589 != null) {
            jMax = Math.max(jMax, c21511M43589.f26380);
        }
        if (this.f57185) {
            for (C19815 c19815 : this.f57187) {
                jMax = Math.max(jMax, c19815.m14139());
            }
        }
        return jMax;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final long mo4634() {
        if (m43595()) {
            return this.f57166;
        }
        if (this.f57196) {
            return Long.MIN_VALUE;
        }
        return m43589().f26380;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4632(C13268 c13268) {
        long jMax;
        long j;
        long j2;
        List list;
        if (!this.f57196) {
            C10866 c10866 = this.f57180;
            if (!c10866.m25042() && !c10866.m25041()) {
                if (m43595()) {
                    List list2 = Collections.EMPTY_LIST;
                    long j3 = this.f57166;
                    for (C19815 c19815 : this.f57187) {
                        c19815.m14137(this.f57166);
                    }
                    list = list2;
                    j = j3;
                    j2 = j;
                } else {
                    C21511 c21511M43589 = m43589();
                    if (!c21511M43589.m48715() || !c21511M43589.m48713()) {
                        jMax = Math.max(this.f57173, c21511M43589.f26381);
                    } else {
                        jMax = c21511M43589.m48716();
                    }
                    long j4 = jMax;
                    long jMax2 = this.f57173;
                    boolean z = this.f57185;
                    List list3 = this.f57175;
                    if (z) {
                        for (C19815 c19816 : this.f57187) {
                            jMax2 = Math.max(jMax2, c19816.m14138());
                        }
                    }
                    j = j4;
                    j2 = jMax2;
                    list = list3;
                }
                C2734 c2734 = this.f57177;
                c2734.f4595 = null;
                c2734.f4596 = false;
                c2734.f4597 = null;
                this.f57199.m38095(c13268, j, j2, list, this.f57198 || !list.isEmpty(), this.f57177);
                boolean z2 = c2734.f4596;
                AbstractC9584 abstractC9584 = c2734.f4595;
                Uri uri = c2734.f4597;
                if (z2) {
                    this.f57166 = -9223372036854775807L;
                    this.f57196 = true;
                    return true;
                }
                if (abstractC9584 != null) {
                    if (abstractC9584 instanceof C21511) {
                        C21511 c21511 = (C21511) abstractC9584;
                        ArrayList arrayList = this.f57190;
                        if (!arrayList.isEmpty()) {
                            if (!m43589().m48713()) {
                                m43599(arrayList.size() - 1);
                            }
                            if (c21511.f67881 && c21511.m48712()) {
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    long j5 = ((C21511) arrayList.get(size)).f26381;
                                    long j6 = c21511.f26381;
                                    if (j5 < j6) {
                                        break;
                                    }
                                    if (j5 == j6 && m43600(size)) {
                                        m43599(size);
                                        c21511.m48714();
                                        break;
                                    }
                                }
                            }
                        }
                        this.f57183 = c21511;
                        this.f57194 = c21511.f26379;
                        this.f57166 = -9223372036854775807L;
                        arrayList.add(c21511);
                        int i = AbstractC16192.f47662;
                        C4123 c4123 = new C4123();
                        for (C19815 c19817 : this.f57187) {
                            c4123.m18184(Integer.valueOf(c19817.m14124()));
                        }
                        c21511.m48710(this, c4123.m8329());
                        for (C19815 c19818 : this.f57187) {
                            c19818.getClass();
                            c19818.m14140(c21511.f67877);
                            if (c21511.m48712()) {
                                c19818.m14141();
                            }
                        }
                    }
                    this.f57193 = abstractC9584;
                    c10866.m25039(abstractC9584, this, this.f57161.mo29502(abstractC9584.f26383));
                    return true;
                }
                if (uri != null) {
                    ((C14804) this.f57204).f42229.f40148.mo11233(uri);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4631() {
        return this.f57180.m25042();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final void mo4635(long j) {
        C10866 c10866 = this.f57180;
        if (c10866.m25041() || m43595()) {
            return;
        }
        boolean zM25042 = c10866.m25042();
        C16815 c16815 = this.f57199;
        List list = this.f57175;
        if (zM25042) {
            this.f57193.getClass();
            if (c16815.m38097(j, this.f57193, list)) {
                c10866.m25036();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && c16815.m38090((C21511) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            m43599(size);
        }
        int iM38089 = c16815.m38089(j, list);
        if (iM38089 < this.f57190.size()) {
            m43599(iM38089);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m43599(int i) {
        ArrayList arrayList;
        C23877.m52960(!this.f57180.m25042());
        while (true) {
            arrayList = this.f57190;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (m43600(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = m43589().f26380;
        C21511 c21511 = (C21511) arrayList.get(i);
        int size = arrayList.size();
        String str = C5792.f14228;
        if (i < 0 || size > arrayList.size() || i > size) {
            throw new IllegalArgumentException();
        }
        if (i != size) {
            arrayList.subList(i, size).clear();
        }
        for (int i2 = 0; i2 < this.f57187.length; i2++) {
            this.f57187[i2].m14118(c21511.m48708(i2));
        }
        if (arrayList.isEmpty()) {
            this.f57166 = this.f57173;
        } else {
            ((C21511) C10810.m24926(arrayList)).m48711();
        }
        this.f57196 = false;
        C8758 c8758 = new C8758(1, this.f57169, null, 3, null, C5792.m13013(c21511.f26381), C5792.m13013(j));
        C10099 c10099 = this.f57208;
        C17474 c17474 = c10099.f28019;
        c17474.getClass();
        c10099.m23563(new C24692(c10099, c17474, c8758));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [l.ᩳ᩺֫[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ᩳ᩺֫[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [l.᩵ۢۧ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.ۘܽۧ, l.ᩳ᩺֫] */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.᩵᩷ۧ] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20790 mo5732(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = f57158;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f57168;
        SparseIntArray sparseIntArray = this.f57205;
        ?? c19815 = 0;
        c19815 = 0;
        if (zContains) {
            C23877.m52957(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.f57165[i3] = i;
                }
                if (this.f57165[i3] == i) {
                    c19815 = this.f57187[i3];
                } else {
                    c19815 = m43597(i, i2);
                }
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.f57187;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.f57165[i4] == i) {
                    c19815 = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (c19815 == 0) {
            if (this.f57162) {
                return m43597(i, i2);
            }
            int length = this.f57187.length;
            boolean z = i2 == 1 || i2 == 2;
            c19815 = new C19815(this.f57202, this.f57184, this.f57164, this.f57163);
            c19815.m14137(this.f57173);
            if (z) {
                c19815.m45056(this.f57186);
            }
            c19815.m14129(this.f57203);
            C21511 c21511 = this.f57183;
            if (c21511 != null) {
                c19815.m14140(c21511.f67877);
            }
            c19815.m14120(this);
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f57165, i5);
            this.f57165 = iArrCopyOf;
            iArrCopyOf[length] = i;
            C19815[] c19815Arr = this.f57187;
            String str = C5792.f14228;
            ?? CopyOf = Arrays.copyOf(c19815Arr, c19815Arr.length + 1);
            CopyOf[c19815Arr.length] = c19815;
            this.f57187 = (C19815[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f57200, i5);
            this.f57200 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.f57206 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (m43602(i2) > m43602(this.f57169)) {
                this.f57159 = length;
                this.f57169 = i2;
            }
            this.f57179 = Arrays.copyOf(this.f57179, i5);
        }
        if (i2 != 5) {
            return c19815;
        }
        if (this.f57178 == null) {
            this.f57178 = new C18473(c19815, this.f57172);
        }
        return this.f57178;
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ܳ */
    public final void mo5734() {
        this.f57162 = true;
        this.f57182.post(this.f57176);
    }

    @Override // p067l.InterfaceC4891
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10365() {
        this.f57182.post(this.f57195);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m43613() {
        this.f57168.clear();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m43621(long j) {
        if (this.f57203 != j) {
            this.f57203 = j;
            for (C19815 c19815 : this.f57187) {
                c19815.m14129(j);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43608(C21037 c21037) {
        if (C12826.equals(this.f57186, c21037)) {
            return;
        }
        this.f57186 = c21037;
        int i = 0;
        while (true) {
            C19815[] c19815Arr = this.f57187;
            if (i >= c19815Arr.length) {
                return;
            }
            if (this.f57200[i]) {
                c19815Arr[i].m45056(c21037);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m43600(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.f57190;
            if (i2 < arrayList.size()) {
                if (((C21511) arrayList.get(i2)).m48712()) {
                    return false;
                }
                i2++;
            } else {
                C21511 c21511 = (C21511) arrayList.get(i);
                for (int i3 = 0; i3 < this.f57187.length; i3++) {
                    if (this.f57187[i3].m14133() > c21511.m48708(i3)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۠ */
    private void m43596() {
        for (C19815 c19815 : this.f57187) {
            c19815.m14130(this.f57197);
        }
        this.f57197 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m43598(C19144 c19144) {
        c19144.f57185 = true;
        c19144.m43590();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨ */
    public void m43590() {
        if (!this.f57191 && this.f57207 == null && this.f57185) {
            for (C19815 c19815 : this.f57187) {
                if (c19815.m14143() == null) {
                    return;
                }
            }
            C8243 c8243 = this.f57189;
            if (c8243 != null) {
                int i = c8243.f21837;
                int[] iArr = new int[i];
                this.f57207 = iArr;
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = 0;
                    while (true) {
                        C19815[] c19815Arr = this.f57187;
                        if (i3 >= c19815Arr.length) {
                            break;
                        }
                        C10307 c10307M14143 = c19815Arr[i3].m14143();
                        C23877.m52958(c10307M14143);
                        C10307 c10307M34395 = this.f57189.m19034(i2).m34395(0);
                        String str = c10307M14143.f28528;
                        String str2 = c10307M34395.f28528;
                        int iM26822 = C11669.m26822(str);
                        if (iM26822 != 3) {
                            if (iM26822 == C11669.m26822(str2)) {
                                this.f57207[i2] = i3;
                                break;
                            }
                            i3++;
                        } else {
                            if (C12826.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c10307M14143.f28512 == c10307M34395.f28512)) {
                                this.f57207[i2] = i3;
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
                Iterator it = this.f57188.iterator();
                while (it.hasNext()) {
                    ((C13464) it.next()).m30608();
                }
                return;
            }
            int length = this.f57187.length;
            int i4 = 0;
            int i5 = -2;
            int i6 = -1;
            while (true) {
                int i7 = 1;
                if (i4 >= length) {
                    break;
                }
                C10307 c10307M14144 = this.f57187[i4].m14143();
                C23877.m52958(c10307M14144);
                String str3 = c10307M14144.f28528;
                if (C11669.m26816(str3)) {
                    i7 = 2;
                } else if (!C11669.m26825(str3)) {
                    i7 = C11669.m26824(str3) ? 3 : -2;
                }
                if (m43602(i7) > m43602(i5)) {
                    i6 = i4;
                    i5 = i7;
                } else if (i7 == i5 && i6 != -1) {
                    i6 = -1;
                }
                i4++;
            }
            C15020 c15020M38092 = this.f57199.m38092();
            int i8 = c15020M38092.f42921;
            this.f57160 = -1;
            this.f57207 = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                this.f57207[i9] = i9;
            }
            C15020[] c15020Arr = new C15020[length];
            int i10 = 0;
            while (i10 < length) {
                C10307 c10307M14145 = this.f57187[i10].m14143();
                C23877.m52958(c10307M14145);
                String str4 = this.f57181;
                C10307 c10307 = this.f57201;
                if (i10 == i6) {
                    C10307[] c10307Arr = new C10307[i8];
                    for (int i11 = 0; i11 < i8; i11++) {
                        C10307 c10307M34396 = c15020M38092.m34395(i11);
                        if (i5 == 1 && c10307 != null) {
                            c10307M34396 = c10307M34396.m23921(c10307);
                        }
                        c10307Arr[i11] = i8 == 1 ? c10307M14145.m23921(c10307M34396) : m43592(c10307M34396, c10307M14145, true);
                    }
                    c15020Arr[i10] = new C15020(str4, c10307Arr);
                    this.f57160 = i10;
                } else {
                    if (i5 != 2 || !C11669.m26825(c10307M14145.f28528)) {
                        c10307 = null;
                    }
                    StringBuilder sbM21133 = C9179.m21133(str4, ":muxed:");
                    sbM21133.append(i10 < i6 ? i10 : i10 - 1);
                    c15020Arr[i10] = new C15020(sbM21133.toString(), m43592(c10307, c10307M14145, false));
                }
                i10++;
            }
            this.f57189 = m43591(c15020Arr);
            C23877.m52960(this.f57192 == null);
            this.f57192 = Collections.EMPTY_SET;
            this.f57198 = true;
            ((C14804) this.f57204).m33811();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C8243 m43591(C15020[] c15020Arr) {
        for (int i = 0; i < c15020Arr.length; i++) {
            C15020 c15020 = c15020Arr[i];
            C10307[] c10307Arr = new C10307[c15020.f42921];
            for (int i2 = 0; i2 < c15020.f42921; i2++) {
                C10307 c10307M34395 = c15020.m34395(i2);
                c10307Arr[i2] = c10307M34395.m23919(this.f57184.mo9695(c10307M34395));
            }
            c15020Arr[i] = new C15020(c15020.f42919, c10307Arr);
        }
        return new C8243(c15020Arr);
    }

    /* JADX INFO: renamed from: ֡ */
    private C21511 m43589() {
        return (C21511) C20013.m45383(this.f57190, 1);
    }

    /* JADX INFO: renamed from: ۚ */
    private boolean m43595() {
        return this.f57166 != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* JADX INFO: renamed from: ᩵ */
    private void m43601() {
        C23877.m52960(this.f57198);
        this.f57189.getClass();
        this.f57192.getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10307 m43592(C10307 c10307, C10307 c10308, boolean z) {
        String strM26818;
        if (c10307 == null) {
            return c10308;
        }
        String str = c10307.f28533;
        String strM26817 = c10308.f28528;
        int iM26822 = C11669.m26822(strM26817);
        if (C5792.m12978(iM26822, str) == 1) {
            strM26818 = C5792.m13017(iM26822, str);
            strM26817 = C11669.m26817(strM26818);
        } else {
            strM26818 = C11669.m26818(str, strM26817);
        }
        C3601 c3601M23918 = c10308.m23918();
        c3601M23918.m6701(c10307.f28535);
        c3601M23918.m6705(c10307.f28549);
        c3601M23918.m6695(c10307.f28545);
        c3601M23918.m6703(c10307.f28517);
        c3601M23918.m6698(c10307.f28542);
        c3601M23918.m6686(c10307.f28522);
        c3601M23918.m6700(z ? c10307.f28537 : -1);
        c3601M23918.m6670(z ? c10307.f28529 : -1);
        c3601M23918.m6677(strM26818);
        if (iM26822 == 2) {
            c3601M23918.m6685(c10307.f28547);
            c3601M23918.m6689(c10307.f28523);
            c3601M23918.m6673(c10307.f28510);
        }
        if (strM26817 != null) {
            c3601M23918.m6697(strM26817);
        }
        int i = c10307.f28539;
        if (i != -1 && iM26822 == 1) {
            c3601M23918.m6704(i);
        }
        C25079 c25079M55051 = c10307.f28526;
        if (c25079M55051 != null) {
            C25079 c25079 = c10308.f28526;
            if (c25079 != null) {
                c25079M55051 = c25079.m55051(c25079M55051);
            }
            c3601M23918.m6681(c25079M55051);
        }
        return c3601M23918.m6672();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C21105 m43597(int i, int i2) {
        C21334.m48351("Unmapped track with id " + i + " of type " + i2);
        return new C21105();
    }
}
