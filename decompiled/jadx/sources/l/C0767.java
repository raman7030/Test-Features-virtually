package l;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֨֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0767 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f2833;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f2835;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f2836;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f2837;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f2839;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f2841;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17921 f2842;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f2843;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f2845;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f2846;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f2847;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f2848;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f2849;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f2850;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f2851;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final SparseArray f2834 = new SparseArray();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final SparseArray f2840 = new SparseArray();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5001 f2844 = new C5001();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C5001 f2838 = new C5001();

    public C0767(InterfaceC19383 interfaceC19383, boolean z, boolean z2) {
        this.f2841 = interfaceC19383;
        this.f2835 = z;
        this.f2846 = z2;
        byte[] bArr = new byte[128];
        this.f2845 = bArr;
        this.f2842 = new C17921(bArr, 0, 0);
        m2927();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2925() {
        return this.f2846;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2924(C10866 c10866) {
        this.f2834.append(c10866.f32645, c10866);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2923(C1693 c1693) {
        this.f2840.append(c1693.f5868, c1693);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2927() {
        this.f2843 = false;
        this.f2837 = false;
        this.f2838.m14487();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2922(int i, long j, long j2, boolean z) {
        this.f2850 = i;
        this.f2839 = j2;
        this.f2851 = j;
        this.f2836 = z;
        if (!this.f2835 || i != 1) {
            if (!this.f2846) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        C5001 c5001 = this.f2844;
        this.f2844 = this.f2838;
        this.f2838 = c5001;
        c5001.m14487();
        this.f2847 = 0;
        this.f2843 = true;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2921(int i, int i2, byte[] bArr) {
        boolean zM41927;
        boolean z;
        boolean z2;
        boolean zM41928;
        boolean z3;
        int iM41928;
        int i3;
        int iM41923;
        int iM41929;
        int i4;
        int i5;
        int i6;
        int iM419210;
        int i7;
        int i8;
        int iM419211;
        if (this.f2843) {
            int i9 = i2 - i;
            byte[] bArr2 = this.f2845;
            int length = bArr2.length;
            int i10 = this.f2847 + i9;
            if (length < i10) {
                this.f2845 = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i, this.f2845, this.f2847, i9);
            int i11 = this.f2847 + i9;
            this.f2847 = i11;
            byte[] bArr3 = this.f2845;
            C17921 c17921 = this.f2842;
            c17921.m41921(0, i11, bArr3);
            if (c17921.m41922(8)) {
                c17921.m41925();
                int iM41924 = c17921.m41923(2);
                c17921.m41926(5);
                if (c17921.m41924()) {
                    c17921.m41928();
                    if (c17921.m41924()) {
                        int iM419212 = c17921.m41928();
                        if (!this.f2846) {
                            this.f2843 = false;
                            this.f2838.m14488(iM419212);
                            return;
                        }
                        if (c17921.m41924()) {
                            int iM419213 = c17921.m41928();
                            SparseArray sparseArray = this.f2840;
                            if (sparseArray.indexOfKey(iM419213) < 0) {
                                this.f2843 = false;
                                return;
                            }
                            C1693 c1693 = (C1693) sparseArray.get(iM419213);
                            int i12 = c1693.f5869;
                            boolean z4 = c1693.f5867;
                            C10866 c10866 = (C10866) this.f2834.get(i12);
                            boolean z5 = c10866.f32640;
                            int i13 = c10866.f32643;
                            int i14 = c10866.f32657;
                            if (z5) {
                                if (!c17921.m41922(2)) {
                                    return;
                                } else {
                                    c17921.m41926(2);
                                }
                            }
                            if (c17921.m41922(i14)) {
                                int iM41925 = c17921.m41923(i14);
                                if (!c10866.f32646) {
                                    if (c17921.m41922(1)) {
                                        zM41927 = c17921.m41927();
                                        if (zM41927) {
                                            if (!c17921.m41922(1)) {
                                                return;
                                            }
                                            z2 = true;
                                            zM41928 = c17921.m41927();
                                            z = zM41927;
                                        }
                                        if (this.f2850 == 5) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            iM41928 = 0;
                                        } else if (!c17921.m41924()) {
                                            return;
                                        } else {
                                            iM41928 = c17921.m41928();
                                        }
                                        i3 = c10866.f32644;
                                        if (i3 == 0) {
                                            if (c17921.m41922(i13)) {
                                                iM41923 = c17921.m41923(i13);
                                                if (!z4 && !z) {
                                                    if (!c17921.m41924()) {
                                                        return;
                                                    } else {
                                                        iM419211 = c17921.m41929();
                                                    }
                                                }
                                                i5 = iM419211;
                                                i4 = iM41923;
                                                iM41929 = 0;
                                                i6 = iM41929;
                                                i7 = i4;
                                                i8 = i5;
                                                iM419210 = 0;
                                                this.f2838.m14489(c10866, iM41924, iM419212, iM41925, iM419213, z, z2, zM41928, z3, iM41928, i7, i8, i6, iM419210);
                                                this.f2843 = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || c10866.f32658) {
                                            iM41923 = 0;
                                        } else {
                                            if (!c17921.m41924()) {
                                                return;
                                            }
                                            iM41929 = c17921.m41929();
                                            if (!z4 || z) {
                                                i4 = 0;
                                                i5 = 0;
                                                i6 = iM41929;
                                                i7 = i4;
                                                i8 = i5;
                                                iM419210 = 0;
                                            } else {
                                                if (!c17921.m41924()) {
                                                    return;
                                                }
                                                i6 = iM41929;
                                                iM419210 = c17921.m41929();
                                                i7 = 0;
                                                i8 = 0;
                                            }
                                        }
                                        this.f2838.m14489(c10866, iM41924, iM419212, iM41925, iM419213, z, z2, zM41928, z3, iM41928, i7, i8, i6, iM419210);
                                        this.f2843 = false;
                                        iM419211 = 0;
                                        i5 = iM419211;
                                        i4 = iM41923;
                                        iM41929 = 0;
                                        i6 = iM41929;
                                        i7 = i4;
                                        i8 = i5;
                                        iM419210 = 0;
                                        this.f2838.m14489(c10866, iM41924, iM419212, iM41925, iM419213, z, z2, zM41928, z3, iM41928, i7, i8, i6, iM419210);
                                        this.f2843 = false;
                                    }
                                    return;
                                }
                                zM41927 = false;
                                z = zM41927;
                                z2 = false;
                                zM41928 = false;
                                if (this.f2850 == 5) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    iM41928 = 0;
                                } else if (!c17921.m41924()) {
                                    return;
                                } else {
                                    iM41928 = c17921.m41928();
                                }
                                i3 = c10866.f32644;
                                if (i3 == 0) {
                                    if (c17921.m41922(i13)) {
                                        return;
                                    }
                                    iM41923 = c17921.m41923(i13);
                                    if (!z4) {
                                    }
                                    i5 = iM419211;
                                    i4 = iM41923;
                                    iM41929 = 0;
                                    i6 = iM41929;
                                    i7 = i4;
                                    i8 = i5;
                                    iM419210 = 0;
                                    this.f2838.m14489(c10866, iM41924, iM419212, iM41925, iM419213, z, z2, zM41928, z3, iM41928, i7, i8, i6, iM419210);
                                    this.f2843 = false;
                                }
                                if (i3 == 1) {
                                }
                                iM41923 = 0;
                                iM419211 = 0;
                                i5 = iM419211;
                                i4 = iM41923;
                                iM41929 = 0;
                                i6 = iM41929;
                                i7 = i4;
                                i8 = i5;
                                iM419210 = 0;
                                this.f2838.m14489(c10866, iM41924, iM419212, iM41925, iM419213, z, z2, zM41928, z3, iM41928, i7, i8, i6, iM419210);
                                this.f2843 = false;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2926(long j, int i, boolean z) {
        boolean z2 = true;
        if (this.f2850 == 9 || (this.f2846 && C5001.m14486(this.f2838, this.f2844))) {
            if (z && this.f2837) {
                long j2 = this.f2851;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f2833;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.f2849;
                    if (j2 != j4) {
                        this.f2841.mo8455(j3, this.f2848 ? 1 : 0, (int) (j2 - j4), i2, null);
                    }
                }
            }
            this.f2849 = this.f2851;
            this.f2833 = this.f2839;
            this.f2848 = false;
            this.f2837 = true;
        }
        boolean zM14490 = this.f2835 ? this.f2838.m14490() : this.f2836;
        boolean z3 = this.f2848;
        int i3 = this.f2850;
        if (i3 != 5 && (!zM14490 || i3 != 1)) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        this.f2848 = z4;
        this.f2850 = 24;
        return z4;
    }
}
