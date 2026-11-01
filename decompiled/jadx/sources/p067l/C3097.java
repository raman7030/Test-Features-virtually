package p067l;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֨֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3097 {

    /* JADX INFO: renamed from: ֡ */
    public long f5605;

    /* JADX INFO: renamed from: ֫ */
    public final boolean f5607;

    /* JADX INFO: renamed from: ۖ */
    public boolean f5608;

    /* JADX INFO: renamed from: ۘ */
    public boolean f5609;

    /* JADX INFO: renamed from: ۜ */
    public long f5611;

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC20790 f5613;

    /* JADX INFO: renamed from: ۧ */
    public final C19400 f5614;

    /* JADX INFO: renamed from: ܳ */
    public boolean f5615;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f5617;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f5618;

    /* JADX INFO: renamed from: ᩳ */
    public int f5619;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f5620;

    /* JADX INFO: renamed from: ᩵ */
    public long f5621;

    /* JADX INFO: renamed from: ᩷ */
    public int f5622;

    /* JADX INFO: renamed from: ᩻ */
    public long f5623;

    /* JADX INFO: renamed from: ֨ */
    public final SparseArray f5606 = new SparseArray();

    /* JADX INFO: renamed from: ۡ */
    public final SparseArray f5612 = new SparseArray();

    /* JADX INFO: renamed from: ܺ */
    public C7121 f5616 = new C7121();

    /* JADX INFO: renamed from: ۚ */
    public C7121 f5610 = new C7121();

    public C3097(InterfaceC20790 interfaceC20790, boolean z, boolean z2) {
        this.f5613 = interfaceC20790;
        this.f5607 = z;
        this.f5618 = z2;
        byte[] bArr = new byte[128];
        this.f5617 = bArr;
        this.f5614 = new C19400(bArr, 0, 0);
        m5255();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m5253() {
        return this.f5618;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5252(C12695 c12695) {
        this.f5606.append(c12695.f35622, c12695);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5251(C3977 c3977) {
        this.f5612.append(c3977.f8647, c3977);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5255() {
        this.f5615 = false;
        this.f5609 = false;
        this.f5610.m16391();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5250(int i, long j, long j2, boolean z) {
        this.f5622 = i;
        this.f5611 = j2;
        this.f5623 = j;
        this.f5608 = z;
        if (!this.f5607 || i != 1) {
            if (!this.f5618) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        C7121 c7121 = this.f5616;
        this.f5616 = this.f5610;
        this.f5610 = c7121;
        c7121.m16391();
        this.f5619 = 0;
        this.f5615 = true;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:72:0x011a  */
    /* JADX INFO: renamed from: ֫ */
    public final void m5249(int i, int i2, byte[] bArr) {
        boolean zM44176;
        boolean z;
        boolean z2;
        boolean zM44177;
        boolean z3;
        int iM44177;
        int i3;
        int iM44172;
        int iM44178;
        int i4;
        int i5;
        int i6;
        int iM44179;
        int i7;
        int i8;
        int iM441710;
        if (this.f5615) {
            int i9 = i2 - i;
            byte[] bArr2 = this.f5617;
            int length = bArr2.length;
            int i10 = this.f5619 + i9;
            if (length < i10) {
                this.f5617 = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i, this.f5617, this.f5619, i9);
            int i11 = this.f5619 + i9;
            this.f5619 = i11;
            byte[] bArr3 = this.f5617;
            C19400 c19400 = this.f5614;
            c19400.m44170(0, i11, bArr3);
            if (c19400.m44171(8)) {
                c19400.m44174();
                int iM44173 = c19400.m44172(2);
                c19400.m44175(5);
                if (c19400.m44173()) {
                    c19400.m44177();
                    if (c19400.m44173()) {
                        int iM441711 = c19400.m44177();
                        if (!this.f5618) {
                            this.f5615 = false;
                            this.f5610.m16392(iM441711);
                            return;
                        }
                        if (c19400.m44173()) {
                            int iM441712 = c19400.m44177();
                            SparseArray sparseArray = this.f5612;
                            if (sparseArray.indexOfKey(iM441712) < 0) {
                                this.f5615 = false;
                                return;
                            }
                            C3977 c3977 = (C3977) sparseArray.get(iM441712);
                            int i12 = c3977.f8648;
                            boolean z4 = c3977.f8646;
                            C12695 c12695 = (C12695) this.f5606.get(i12);
                            boolean z5 = c12695.f35617;
                            int i13 = c12695.f35620;
                            int i14 = c12695.f35634;
                            if (z5) {
                                if (!c19400.m44171(2)) {
                                    return;
                                } else {
                                    c19400.m44175(2);
                                }
                            }
                            if (c19400.m44171(i14)) {
                                int iM44174 = c19400.m44172(i14);
                                if (!c12695.f35623) {
                                    if (c19400.m44171(1)) {
                                        zM44176 = c19400.m44176();
                                        if (zM44176) {
                                            if (!c19400.m44171(1)) {
                                                return;
                                            }
                                            z2 = true;
                                            zM44177 = c19400.m44176();
                                            z = zM44176;
                                        }
                                        if (this.f5622 == 5) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            iM44177 = 0;
                                        } else if (!c19400.m44173()) {
                                            return;
                                        } else {
                                            iM44177 = c19400.m44177();
                                        }
                                        i3 = c12695.f35621;
                                        if (i3 == 0) {
                                            if (c19400.m44171(i13)) {
                                                iM44172 = c19400.m44172(i13);
                                                if (!z4 && !z) {
                                                    if (!c19400.m44173()) {
                                                        return;
                                                    } else {
                                                        iM441710 = c19400.m44178();
                                                    }
                                                }
                                                i5 = iM441710;
                                                i4 = iM44172;
                                                iM44178 = 0;
                                                i6 = iM44178;
                                                i7 = i4;
                                                i8 = i5;
                                                iM44179 = 0;
                                                this.f5610.m16393(c12695, iM44173, iM441711, iM44174, iM441712, z, z2, zM44177, z3, iM44177, i7, i8, i6, iM44179);
                                                this.f5615 = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || c12695.f35635) {
                                            iM44172 = 0;
                                        } else {
                                            if (!c19400.m44173()) {
                                                return;
                                            }
                                            iM44178 = c19400.m44178();
                                            if (!z4 || z) {
                                                i4 = 0;
                                                i5 = 0;
                                                i6 = iM44178;
                                                i7 = i4;
                                                i8 = i5;
                                                iM44179 = 0;
                                            } else {
                                                if (!c19400.m44173()) {
                                                    return;
                                                }
                                                i6 = iM44178;
                                                iM44179 = c19400.m44178();
                                                i7 = 0;
                                                i8 = 0;
                                            }
                                        }
                                        this.f5610.m16393(c12695, iM44173, iM441711, iM44174, iM441712, z, z2, zM44177, z3, iM44177, i7, i8, i6, iM44179);
                                        this.f5615 = false;
                                        iM441710 = 0;
                                        i5 = iM441710;
                                        i4 = iM44172;
                                        iM44178 = 0;
                                        i6 = iM44178;
                                        i7 = i4;
                                        i8 = i5;
                                        iM44179 = 0;
                                        this.f5610.m16393(c12695, iM44173, iM441711, iM44174, iM441712, z, z2, zM44177, z3, iM44177, i7, i8, i6, iM44179);
                                        this.f5615 = false;
                                    }
                                    return;
                                }
                                zM44176 = false;
                                z = zM44176;
                                z2 = false;
                                zM44177 = false;
                                if (this.f5622 == 5) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    iM44177 = 0;
                                } else if (!c19400.m44173()) {
                                    return;
                                } else {
                                    iM44177 = c19400.m44177();
                                }
                                i3 = c12695.f35621;
                                if (i3 == 0) {
                                    if (c19400.m44171(i13)) {
                                        return;
                                    }
                                    iM44172 = c19400.m44172(i13);
                                    if (!z4) {
                                    }
                                    i5 = iM441710;
                                    i4 = iM44172;
                                    iM44178 = 0;
                                    i6 = iM44178;
                                    i7 = i4;
                                    i8 = i5;
                                    iM44179 = 0;
                                    this.f5610.m16393(c12695, iM44173, iM441711, iM44174, iM441712, z, z2, zM44177, z3, iM44177, i7, i8, i6, iM44179);
                                    this.f5615 = false;
                                }
                                if (i3 == 1) {
                                }
                                iM44172 = 0;
                                iM441710 = 0;
                                i5 = iM441710;
                                i4 = iM44172;
                                iM44178 = 0;
                                i6 = iM44178;
                                i7 = i4;
                                i8 = i5;
                                iM44179 = 0;
                                this.f5610.m16393(c12695, iM44173, iM441711, iM44174, iM441712, z, z2, zM44177, z3, iM44177, i7, i8, i6, iM44179);
                                this.f5615 = false;
                            }
                        }
                    }
                }
            }
        }
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
    /* JADX INFO: renamed from: ֫ */
    public final boolean m5254(long j, int i, boolean z) {
        boolean z2 = true;
        if (this.f5622 == 9 || (this.f5618 && C7121.m16390(this.f5610, this.f5616))) {
            if (z && this.f5609) {
                long j2 = this.f5623;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f5605;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.f5621;
                    if (j2 != j4) {
                        this.f5613.mo10502(j3, this.f5620 ? 1 : 0, (int) (j2 - j4), i2, null);
                    }
                }
            }
            this.f5621 = this.f5623;
            this.f5605 = this.f5611;
            this.f5620 = false;
            this.f5609 = true;
        }
        boolean zM16394 = this.f5607 ? this.f5610.m16394() : this.f5608;
        boolean z3 = this.f5620;
        int i3 = this.f5622;
        if (i3 != 5 && (!zM16394 || i3 != 1)) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        this.f5620 = z4;
        this.f5622 = 24;
        return z4;
    }
}
