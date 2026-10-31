package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15729 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f48507;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17714 f48508;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48509;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f48510;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f48511;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6558 f48512;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f48513;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final SparseArray f48514;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f48515;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f48516;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f48517;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC0207 f48518;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48519;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20670 f48520;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f48521;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f48522;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f48523;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f48524;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20524 f48525;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f48526;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    public C15729(int i, int i2, InterfaceC6950 interfaceC6950, C9248 c9248, C20524 c20524) {
        this.f48525 = c20524;
        this.f48526 = i;
        this.f48522 = i2;
        this.f48510 = interfaceC6950;
        if (i == 1 || i == 2) {
            this.f48511 = Collections.singletonList(c9248);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f48511 = arrayList;
            arrayList.add(c9248);
        }
        this.f48508 = new C17714(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f48523 = sparseBooleanArray;
        this.f48524 = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f48514 = sparseArray;
        this.f48517 = new SparseIntArray();
        this.f48520 = new C20670();
        this.f48513 = InterfaceC21830.f69942;
        this.f48516 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (InterfaceC0207) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new C17141(new C9381(this)));
        this.f48518 = null;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        byte[] bArrM41482 = this.f48508.m41482();
        C16184 c16184 = (C16184) interfaceC8424;
        c16184.mo22068(false, 0, 940, bArrM41482);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    c16184.mo22062(i, false);
                    return true;
                }
                if (bArrM41482[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        if ((this.f48522 & 1) == 0) {
            interfaceC21830 = new C9067(interfaceC21830, this.f48510);
        }
        this.f48513 = interfaceC21830;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        C6558 c6558;
        C22632.m50634(this.f48526 != 2);
        List list = this.f48511;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C9248 c9248 = (C9248) list.get(i);
            boolean z = c9248.m23735() == -9223372036854775807L;
            if (!z) {
                long jM23730 = c9248.m23730();
                z = (jM23730 == -9223372036854775807L || jM23730 == 0 || jM23730 == j2) ? false : true;
            }
            if (z) {
                c9248.m23737(j2);
            }
        }
        if (j2 != 0 && (c6558 = this.f48512) != null) {
            c6558.m52772(j2);
        }
        this.f48508.m41481(0);
        this.f48517.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f48514;
            if (i2 < sparseArray.size()) {
                ((InterfaceC0207) sparseArray.valueAt(i2)).mo1450();
                i2++;
            } else {
                this.f48509 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        boolean z;
        long length = interfaceC8424.getLength();
        int i = 0;
        int i2 = this.f48526;
        boolean z2 = i2 == 2;
        if (this.f48507) {
            C20670 c20670 = this.f48520;
            if (length != -1 && !z2 && !c20670.m47290()) {
                return c20670.m47287(interfaceC8424, c23615, this.f48516);
            }
            if (!this.f48521) {
                this.f48521 = true;
                if (c20670.m47288() != -9223372036854775807L) {
                    C6558 c6558 = new C6558(c20670.m47289(), c20670.m47288(), length, this.f48516);
                    this.f48512 = c6558;
                    this.f48513.mo3430(c6558.m52771());
                } else {
                    this.f48513.mo3430(new C20794(c20670.m47288()));
                }
            }
            if (this.f48515) {
                this.f48515 = false;
                mo4839(0L, 0L);
                if (interfaceC8424.getPosition() != 0) {
                    c23615.f76532 = 0L;
                    return 1;
                }
            }
            C6558 c6559 = this.f48512;
            if (c6559 != null && c6559.m52773()) {
                return this.f48512.m52770(interfaceC8424, c23615);
            }
        } else {
            z2 = z2;
        }
        C17714 c17714 = this.f48508;
        byte[] bArrM41482 = c17714.m41482();
        int i3 = 188;
        if (9400 - c17714.m41485() < 188) {
            int iM41457 = c17714.m41457();
            if (iM41457 > 0) {
                System.arraycopy(bArrM41482, c17714.m41485(), bArrM41482, 0, iM41457);
            }
            c17714.m41462(iM41457, bArrM41482);
        }
        while (true) {
            int iM41458 = c17714.m41457();
            SparseArray sparseArray = this.f48514;
            if (iM41458 < i3) {
                int iM41483 = c17714.m41483();
                int i4 = interfaceC8424.read(bArrM41482, iM41483, 9400 - iM41483);
                if (i4 == -1) {
                    while (i < sparseArray.size()) {
                        InterfaceC0207 interfaceC0207 = (InterfaceC0207) sparseArray.valueAt(i);
                        if (interfaceC0207 instanceof C22640) {
                            C22640 c22640 = (C22640) interfaceC0207;
                            z = z2;
                            if (c22640.m50650(z)) {
                                c22640.mo1451(1, new C17714());
                            }
                        } else {
                            z = z2;
                        }
                        i++;
                        z2 = z;
                    }
                    return -1;
                }
                c17714.m41486(iM41483 + i4);
                i3 = 188;
            } else {
                int iM41485 = c17714.m41485();
                int iM41484 = c17714.m41483();
                byte[] bArrM41483 = c17714.m41482();
                int i5 = iM41485;
                while (i5 < iM41484 && bArrM41483[i5] != 71) {
                    i5++;
                }
                c17714.m41484(i5);
                int i6 = i5 + 188;
                if (i6 > iM41484) {
                    int i7 = (i5 - iM41485) + this.f48509;
                    this.f48509 = i7;
                    if (i2 == 2 && i7 > 376) {
                        throw C9080.m23440("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
                    }
                } else {
                    this.f48509 = 0;
                }
                int iM41486 = c17714.m41483();
                if (i6 > iM41486) {
                    return 0;
                }
                int iM41493 = c17714.m41493();
                if ((8388608 & iM41493) != 0) {
                    c17714.m41484(i6);
                    return 0;
                }
                int i8 = (4194304 & iM41493) != 0 ? 1 : 0;
                int i9 = (2096896 & iM41493) >> 8;
                boolean z3 = (iM41493 & 32) != 0;
                InterfaceC0207 interfaceC0208 = (iM41493 & 16) != 0 ? (InterfaceC0207) sparseArray.get(i9) : null;
                if (interfaceC0208 == null) {
                    c17714.m41484(i6);
                    return 0;
                }
                if (i2 != 2) {
                    int i10 = iM41493 & 15;
                    SparseIntArray sparseIntArray = this.f48517;
                    int i11 = sparseIntArray.get(i9, i10 - 1);
                    sparseIntArray.put(i9, i10);
                    if (i11 == i10) {
                        c17714.m41484(i6);
                        return 0;
                    }
                    if (i10 != ((i11 + 1) & 15)) {
                        interfaceC0208.mo1450();
                    }
                }
                if (z3) {
                    int iM41456 = c17714.m41456();
                    i8 |= (c17714.m41456() & 64) != 0 ? 2 : 0;
                    c17714.m41478(iM41456 - 1);
                }
                boolean z4 = this.f48507;
                if (i2 == 2 || z4 || !this.f48524.get(i9, false)) {
                    c17714.m41486(i6);
                    interfaceC0208.mo1451(i8, c17714);
                    c17714.m41486(iM41486);
                }
                if (i2 != 2 && !z4 && this.f48507 && length != -1) {
                    this.f48515 = true;
                }
                c17714.m41484(i6);
                return 0;
            }
        }
    }
}
