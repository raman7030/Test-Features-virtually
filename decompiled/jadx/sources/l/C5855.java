package l;

import java.util.ArrayList;
import org.bouncycastle.math.ec.rfc7748.X448Field;

/* JADX INFO: renamed from: l.ۛۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public class C5855 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5855 f17958 = C14403.f44164;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16414(C12786 c12786) {
        C5855 c5855;
        ArrayList arrayList = new ArrayList();
        C5855 c5856 = this;
        while (true) {
            boolean z = false;
            if (c5856 != null) {
                if (!(c5856 instanceof C22643)) {
                    if (c5856 instanceof C12910) {
                        c12786.f38398 = false;
                        c12786.f38396 = false;
                    } else if (c5856 instanceof C7266) {
                        c5856 = ((C7266) c5856).f22335;
                    } else if (c5856 instanceof C0085) {
                        arrayList.add(new C12081(0, c5856, c12786));
                        c5856 = c5856.f17958;
                    } else if (c5856 instanceof C3739) {
                        arrayList.add(new C12081(1, c5856, c12786));
                    } else if (c5856 instanceof C10670) {
                        arrayList.add(new C12081(2, c5856, c12786));
                        c5856 = ((C10670) c5856).f32085;
                    } else if (c5856 instanceof C20673) {
                        C20673 c20673 = (C20673) c5856;
                        arrayList.add(new C12081(3, c5856, c12786, c20673.f66618, c20673.f66616));
                        c12786.m31101();
                        c5856 = c20673.f66615;
                    } else if (c5856 instanceof C0210) {
                        C0210 c0210 = (C0210) c5856;
                        arrayList.add(new C12081(3, c5856, c12786, c0210.f1462, c0210.f1463));
                        c12786.m31101();
                        c5856 = c0210.f1459;
                    } else if (c5856 instanceof C11355) {
                        C11355 c11355 = (C11355) c5856;
                        C12081 c12081 = new C12081(4, c5856, c12786);
                        arrayList.add(c12081);
                        c12786.m31101();
                        if (c11355.f33990 == 0) {
                            c12081.f36128 = 1;
                            c12081.f36125 += c12081.f36126;
                            c12081.f36123 += c12081.f36122;
                            c5855 = c11355.f33991.f17958;
                        } else {
                            c5855 = c11355.f33989[0];
                        }
                        c5856 = c5855;
                    } else {
                        if (c5856 instanceof C2203) {
                            int i = c12786.f38399;
                            int[] iArr = ((C2203) c5856).f7231;
                            c12786.f38399 = i + iArr.length;
                            c12786.f38397 += iArr.length;
                        } else if (c5856 instanceof C23494) {
                            c12786.f38399++;
                            c12786.f38397++;
                        } else if (c5856 instanceof C22083) {
                            c12786.f38399++;
                            c12786.f38397 += 2;
                        } else if ((c5856 instanceof C12205) || (c5856 instanceof C17226)) {
                            c12786.f38399++;
                            c12786.f38396 = false;
                        } else if (c5856 instanceof C6561) {
                            c12786.f38399 += ((C6561) c5856).f20242;
                            if (c12786.f38398) {
                                c12786.f38397 += Integer.MAX_VALUE;
                            }
                            c12786.f38396 = false;
                        } else if ((c5856 instanceof C0064) || (c5856 instanceof C13470)) {
                            c12786.f38398 = false;
                        } else if (c5856 instanceof C12060) {
                            c12786.f38399 += ((C12060) c5856).f36077.length;
                            c12786.f38398 = false;
                        }
                        c5856 = c5856.f17958;
                    }
                }
                c5856 = null;
            } else {
                if (arrayList.isEmpty()) {
                    return c12786.f38396;
                }
                C12081 c12082 = (C12081) C18566.m43105(arrayList, 1);
                int i2 = c12082.f36133;
                int i3 = c12082.f36129;
                C5855 c5857 = c12082.f36124;
                if (i2 == 0) {
                    c12786.f38398 = false;
                    c12786.f38396 = false;
                } else if (i2 == 1) {
                    c12786.f38398 = false;
                    c12786.f38396 = false;
                    C18473.m42953(arrayList, 1);
                    c5856 = c5857.f17958;
                } else if (i2 == 2) {
                    if (((C10670) c5857).f32086 != EnumC1497.INDEPENDENT) {
                        c12786.f38399 = c12082.f36125;
                        c12786.f38396 = false;
                    }
                    C18473.m42953(arrayList, 1);
                    c5856 = c5857.f17958;
                } else if (i2 == 3) {
                    int i4 = c12786.f38399;
                    int i5 = c12082.f36131;
                    int i6 = c12082.f36125;
                    int i7 = (i4 * i5) + i6;
                    if (i7 < i6) {
                        i7 = X448Field.M28;
                    }
                    c12786.f38399 = i7;
                    if (c12082.f36132 && c12786.f38398) {
                        int i8 = c12786.f38397 * i3;
                        int i9 = c12082.f36123;
                        int i10 = i8 + i9;
                        c12786.f38397 = i10;
                        if (i10 < i9) {
                            c12786.f38398 = false;
                        }
                    } else {
                        c12786.f38398 = false;
                    }
                    if (c12786.f38396 && i5 == i3 && c12082.f36130) {
                        z = true;
                    }
                    c12786.f38396 = z;
                    C18473.m42953(arrayList, 1);
                    c5856 = c5857.f17958;
                } else {
                    if (i2 != 4) {
                        throw new AssertionError(c12082.f36133);
                    }
                    C11355 c11356 = (C11355) c5857;
                    if (c12082.f36128 == 0) {
                        c12082.f36126 = Math.min(c12082.f36126, c12786.f38399);
                        c12082.f36122 = Math.max(c12082.f36122, c12786.f38397);
                        c12082.f36132 &= c12786.f38398;
                        c12786.m31101();
                        int i11 = c12082.f36127 + 1;
                        c12082.f36127 = i11;
                        if (i11 < c11356.f33990) {
                            c5856 = c11356.f33989[i11];
                        } else {
                            c12082.f36125 += c12082.f36126;
                            c12082.f36123 += c12082.f36122;
                            c12082.f36128 = 1;
                            c5856 = c11356.f33991.f17958;
                        }
                    } else {
                        c12786.f38399 += c12082.f36125;
                        c12786.f38397 += c12082.f36123;
                        c12786.f38398 &= c12082.f36132;
                        c12786.f38396 = false;
                    }
                }
                C18473.m42953(arrayList, 1);
            }
        }
    }
}
