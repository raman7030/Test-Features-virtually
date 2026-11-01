package p067l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17317 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f51647;

    /* JADX INFO: renamed from: ֨ */
    public final C19203 f51648;

    /* JADX INFO: renamed from: ֫ */
    public int f51649;

    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC8974 f51650;

    /* JADX INFO: renamed from: ۘ */
    public final List f51651;

    /* JADX INFO: renamed from: ۚ */
    public C8601 f51652;

    /* JADX INFO: renamed from: ۜ */
    public InterfaceC23116 f51653;

    /* JADX INFO: renamed from: ۠ */
    public final SparseArray f51654;

    /* JADX INFO: renamed from: ۡ */
    public boolean f51655;

    /* JADX INFO: renamed from: ۢ */
    public int f51656;

    /* JADX INFO: renamed from: ۧ */
    public final SparseIntArray f51657;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC2565 f51658;

    /* JADX INFO: renamed from: ܺ */
    public int f51659;

    /* JADX INFO: renamed from: ܽ */
    public final C22013 f51660;

    /* JADX INFO: renamed from: ܿ */
    public boolean f51661;

    /* JADX INFO: renamed from: ᩳ */
    public final int f51662;

    /* JADX INFO: renamed from: ᩴ */
    public final SparseBooleanArray f51663;

    /* JADX INFO: renamed from: ᩵ */
    public final SparseBooleanArray f51664;

    /* JADX INFO: renamed from: ᩷ */
    public final C21874 f51665;

    /* JADX INFO: renamed from: ᩻ */
    public final int f51666;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    public C17317(int i, int i2, InterfaceC8974 interfaceC8974, C11157 c11157, C21874 c21874) {
        this.f51665 = c21874;
        this.f51666 = i;
        this.f51662 = i2;
        this.f51650 = interfaceC8974;
        if (i == 1 || i == 2) {
            this.f51651 = Collections.singletonList(c11157);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f51651 = arrayList;
            arrayList.add(c11157);
        }
        this.f51648 = new C19203(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f51663 = sparseBooleanArray;
        this.f51664 = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f51654 = sparseArray;
        this.f51657 = new SparseIntArray();
        this.f51660 = new C22013();
        this.f51653 = InterfaceC23116.f72651;
        this.f51656 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (InterfaceC2565) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new C18659(new C11284(this)));
        this.f51658 = null;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        byte[] bArrM43728 = this.f51648.m43728();
        C17750 c17750 = (C17750) interfaceC10375;
        c17750.mo24038(false, 0, 940, bArrM43728);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    c17750.mo24032(i, false);
                    return true;
                }
                if (bArrM43728[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        if ((this.f51662 & 1) == 0) {
            interfaceC23116 = new C10986(interfaceC23116, this.f51650);
        }
        this.f51653 = interfaceC23116;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        C8601 c8601;
        C23877.m52960(this.f51666 != 2);
        List list = this.f51651;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C11157 c11157 = (C11157) list.get(i);
            boolean z = c11157.m25736() == -9223372036854775807L;
            if (!z) {
                long jM25731 = c11157.m25731();
                z = (jM25731 == -9223372036854775807L || jM25731 == 0 || jM25731 == j2) ? false : true;
            }
            if (z) {
                c11157.m25738(j2);
            }
        }
        if (j2 != 0 && (c8601 = this.f51652) != null) {
            c8601.m55178(j2);
        }
        this.f51648.m43727(0);
        this.f51657.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f51654;
            if (i2 < sparseArray.size()) {
                ((InterfaceC2565) sparseArray.valueAt(i2)).mo3863();
                i2++;
            } else {
                this.f51649 = 0;
                return;
            }
        }
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        boolean z;
        long length = interfaceC10375.getLength();
        int i = 0;
        int i2 = this.f51666;
        boolean z2 = i2 == 2;
        if (this.f51647) {
            C22013 c22013 = this.f51660;
            if (length != -1 && !z2 && !c22013.m49617()) {
                return c22013.m49614(interfaceC10375, c24812, this.f51656);
            }
            if (!this.f51661) {
                this.f51661 = true;
                if (c22013.m49615() != -9223372036854775807L) {
                    C8601 c8601 = new C8601(c22013.m49616(), c22013.m49615(), length, this.f51656);
                    this.f51652 = c8601;
                    this.f51653.mo5733(c8601.m55177());
                } else {
                    this.f51653.mo5733(new C22131(c22013.m49615()));
                }
            }
            if (this.f51655) {
                this.f51655 = false;
                mo7077(0L, 0L);
                if (interfaceC10375.getPosition() != 0) {
                    c24812.f79276 = 0L;
                    return 1;
                }
            }
            C8601 c8602 = this.f51652;
            if (c8602 != null && c8602.m55179()) {
                return this.f51652.m55176(interfaceC10375, c24812);
            }
        } else {
            z2 = z2;
        }
        C19203 c19203 = this.f51648;
        byte[] bArrM43728 = c19203.m43728();
        int i3 = 188;
        if (9400 - c19203.m43731() < 188) {
            int iM43703 = c19203.m43703();
            if (iM43703 > 0) {
                System.arraycopy(bArrM43728, c19203.m43731(), bArrM43728, 0, iM43703);
            }
            c19203.m43708(iM43703, bArrM43728);
        }
        while (true) {
            int iM43704 = c19203.m43703();
            SparseArray sparseArray = this.f51654;
            if (iM43704 < i3) {
                int iM43729 = c19203.m43729();
                int i4 = interfaceC10375.read(bArrM43728, iM43729, 9400 - iM43729);
                if (i4 == -1) {
                    while (i < sparseArray.size()) {
                        InterfaceC2565 interfaceC2565 = (InterfaceC2565) sparseArray.valueAt(i);
                        if (interfaceC2565 instanceof C23885) {
                            C23885 c23885 = (C23885) interfaceC2565;
                            z = z2;
                            if (c23885.m52976(z)) {
                                c23885.mo3864(1, new C19203());
                            }
                        } else {
                            z = z2;
                        }
                        i++;
                        z2 = z;
                    }
                    return -1;
                }
                c19203.m43732(iM43729 + i4);
                i3 = 188;
            } else {
                int iM43731 = c19203.m43731();
                int iM437210 = c19203.m43729();
                byte[] bArrM43729 = c19203.m43728();
                int i5 = iM43731;
                while (i5 < iM437210 && bArrM43729[i5] != 71) {
                    i5++;
                }
                c19203.m43730(i5);
                int i6 = i5 + 188;
                if (i6 > iM437210) {
                    int i7 = (i5 - iM43731) + this.f51649;
                    this.f51649 = i7;
                    if (i2 == 2 && i7 > 376) {
                        throw C10998.m25387("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
                    }
                } else {
                    this.f51649 = 0;
                }
                int iM437211 = c19203.m43729();
                if (i6 > iM437211) {
                    return 0;
                }
                int iM43739 = c19203.m43739();
                if ((8388608 & iM43739) != 0) {
                    c19203.m43730(i6);
                    return 0;
                }
                int i8 = (4194304 & iM43739) != 0 ? 1 : 0;
                int i9 = (2096896 & iM43739) >> 8;
                boolean z3 = (iM43739 & 32) != 0;
                InterfaceC2565 interfaceC2566 = (iM43739 & 16) != 0 ? (InterfaceC2565) sparseArray.get(i9) : null;
                if (interfaceC2566 == null) {
                    c19203.m43730(i6);
                    return 0;
                }
                if (i2 != 2) {
                    int i10 = iM43739 & 15;
                    SparseIntArray sparseIntArray = this.f51657;
                    int i11 = sparseIntArray.get(i9, i10 - 1);
                    sparseIntArray.put(i9, i10);
                    if (i11 == i10) {
                        c19203.m43730(i6);
                        return 0;
                    }
                    if (i10 != ((i11 + 1) & 15)) {
                        interfaceC2566.mo3863();
                    }
                }
                if (z3) {
                    int iM43702 = c19203.m43702();
                    i8 |= (c19203.m43702() & 64) != 0 ? 2 : 0;
                    c19203.m43724(iM43702 - 1);
                }
                boolean z4 = this.f51647;
                if (i2 == 2 || z4 || !this.f51664.get(i9, false)) {
                    c19203.m43732(i6);
                    interfaceC2566.mo3864(i8, c19203);
                    c19203.m43732(iM437211);
                }
                if (i2 != 2 && !z4 && this.f51647 && length != -1) {
                    this.f51655 = true;
                }
                c19203.m43730(i6);
                return 0;
            }
        }
    }
}
