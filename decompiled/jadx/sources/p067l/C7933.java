package p067l;

import java.util.ArrayList;
import org.bouncycastle.math.p080ec.rfc7748.X448Field;

/* JADX INFO: renamed from: l.ۛۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public class C7933 {

    /* JADX INFO: renamed from: ֫ */
    public C7933 f20809 = C16057.f47257;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18339(C14520 c14520) {
        C7933 c7933;
        ArrayList arrayList = new ArrayList();
        C7933 c7934 = this;
        while (true) {
            boolean z = false;
            if (c7934 != null) {
                if (!(c7934 instanceof C23888)) {
                    if (c7934 instanceof C14638) {
                        c14520.f41438 = false;
                        c14520.f41436 = false;
                    } else if (c7934 instanceof C9274) {
                        c7934 = ((C9274) c7934).f25224;
                    } else if (c7934 instanceof C2449) {
                        arrayList.add(new C13850(0, c7934, c14520));
                        c7934 = c7934.f20809;
                    } else if (c7934 instanceof C5922) {
                        arrayList.add(new C13850(1, c7934, c14520));
                    } else if (c7934 instanceof C12509) {
                        arrayList.add(new C13850(2, c7934, c14520));
                        c7934 = ((C12509) c7934).f35056;
                    } else if (c7934 instanceof C22016) {
                        C22016 c22016 = (C22016) c7934;
                        arrayList.add(new C13850(3, c7934, c14520, c22016.f69300, c22016.f69298));
                        c14520.m33185();
                        c7934 = c22016.f69297;
                    } else if (c7934 instanceof C2568) {
                        C2568 c2568 = (C2568) c7934;
                        arrayList.add(new C13850(3, c7934, c14520, c2568.f4241, c2568.f4242));
                        c14520.m33185();
                        c7934 = c2568.f4238;
                    } else if (c7934 instanceof C13160) {
                        C13160 c13160 = (C13160) c7934;
                        C13850 c13850 = new C13850(4, c7934, c14520);
                        arrayList.add(c13850);
                        c14520.m33185();
                        if (c13160.f36987 == 0) {
                            c13850.f39139 = 1;
                            c13850.f39136 += c13850.f39137;
                            c13850.f39134 += c13850.f39133;
                            c7933 = c13160.f36988.f20809;
                        } else {
                            c7933 = c13160.f36986[0];
                        }
                        c7934 = c7933;
                    } else {
                        if (c7934 instanceof C4462) {
                            int i = c14520.f41439;
                            int[] iArr = ((C4462) c7934).f10016;
                            c14520.f41439 = i + iArr.length;
                            c14520.f41437 += iArr.length;
                        } else if (c7934 instanceof C24697) {
                            c14520.f41439++;
                            c14520.f41437++;
                        } else if (c7934 instanceof C23356) {
                            c14520.f41439++;
                            c14520.f41437 += 2;
                        } else if ((c7934 instanceof C13968) || (c7934 instanceof C18740)) {
                            c14520.f41439++;
                            c14520.f41436 = false;
                        } else if (c7934 instanceof C8604) {
                            c14520.f41439 += ((C8604) c7934).f23120;
                            if (c14520.f41438) {
                                c14520.f41437 += Integer.MAX_VALUE;
                            }
                            c14520.f41436 = false;
                        } else if ((c7934 instanceof C2429) || (c7934 instanceof C15170)) {
                            c14520.f41438 = false;
                        } else if (c7934 instanceof C13830) {
                            c14520.f41439 += ((C13830) c7934).f39088.length;
                            c14520.f41438 = false;
                        }
                        c7934 = c7934.f20809;
                    }
                }
                c7934 = null;
            } else {
                if (arrayList.isEmpty()) {
                    return c14520.f41436;
                }
                C13850 c13851 = (C13850) C20013.m45383(arrayList, 1);
                int i2 = c13851.f39144;
                int i3 = c13851.f39140;
                C7933 c7935 = c13851.f39135;
                if (i2 == 0) {
                    c14520.f41438 = false;
                    c14520.f41436 = false;
                } else if (i2 == 1) {
                    c14520.f41438 = false;
                    c14520.f41436 = false;
                    C19925.m45229(arrayList, 1);
                    c7934 = c7935.f20809;
                } else if (i2 == 2) {
                    if (((C12509) c7935).f35057 != EnumC3791.INDEPENDENT) {
                        c14520.f41439 = c13851.f39136;
                        c14520.f41436 = false;
                    }
                    C19925.m45229(arrayList, 1);
                    c7934 = c7935.f20809;
                } else if (i2 == 3) {
                    int i4 = c14520.f41439;
                    int i5 = c13851.f39142;
                    int i6 = c13851.f39136;
                    int i7 = (i4 * i5) + i6;
                    if (i7 < i6) {
                        i7 = X448Field.M28;
                    }
                    c14520.f41439 = i7;
                    if (c13851.f39143 && c14520.f41438) {
                        int i8 = c14520.f41437 * i3;
                        int i9 = c13851.f39134;
                        int i10 = i8 + i9;
                        c14520.f41437 = i10;
                        if (i10 < i9) {
                            c14520.f41438 = false;
                        }
                    } else {
                        c14520.f41438 = false;
                    }
                    if (c14520.f41436 && i5 == i3 && c13851.f39141) {
                        z = true;
                    }
                    c14520.f41436 = z;
                    C19925.m45229(arrayList, 1);
                    c7934 = c7935.f20809;
                } else {
                    if (i2 != 4) {
                        throw new AssertionError(c13851.f39144);
                    }
                    C13160 c13161 = (C13160) c7935;
                    if (c13851.f39139 == 0) {
                        c13851.f39137 = Math.min(c13851.f39137, c14520.f41439);
                        c13851.f39133 = Math.max(c13851.f39133, c14520.f41437);
                        c13851.f39143 &= c14520.f41438;
                        c14520.m33185();
                        int i11 = c13851.f39138 + 1;
                        c13851.f39138 = i11;
                        if (i11 < c13161.f36987) {
                            c7934 = c13161.f36986[i11];
                        } else {
                            c13851.f39136 += c13851.f39137;
                            c13851.f39134 += c13851.f39133;
                            c13851.f39139 = 1;
                            c7934 = c13161.f36988.f20809;
                        }
                    } else {
                        c14520.f41439 += c13851.f39136;
                        c14520.f41437 += c13851.f39134;
                        c14520.f41438 &= c13851.f39143;
                        c14520.f41436 = false;
                    }
                }
                C19925.m45229(arrayList, 1);
            }
        }
    }
}
