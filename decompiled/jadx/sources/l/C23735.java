package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩻ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23735 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f76851;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f76852;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean[] f76853;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f76854;

    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00cf, please report this as an issue */
    public C23735(C8931 c8931, int i, C2569 c2569) {
        boolean z;
        this.f76854 = new boolean[i];
        this.f76853 = new boolean[i];
        this.f76852 = new int[i];
        this.f76851 = new boolean[i];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c8931);
        while (!arrayDeque.isEmpty()) {
            c2569.m8120();
            C8931 c8932 = (C8931) arrayDeque.pop();
            int iMo1085 = c8932.mo1085();
            if (iMo1085 == 162 || iMo1085 == 167) {
                this.f76852[c8932.f27156.mo2052()] = c8932.f27155.mo2052();
            } else {
                for (int i2 = 0; i2 < c8932.getChildCount(); i2++) {
                    InterfaceC16174 interfaceC16174Mo23040 = c8932.mo23040(i2);
                    if (interfaceC16174Mo23040 instanceof C8931) {
                        arrayDeque.push((C8931) interfaceC16174Mo23040);
                    } else if (interfaceC16174Mo23040 instanceof InterfaceC4181) {
                        InterfaceC0463 interfaceC0463Mo12628 = ((InterfaceC4181) interfaceC16174Mo23040).mo12628();
                        boolean[] zArr = this.f76854;
                        boolean[] zArr2 = this.f76853;
                        int iMo2052 = interfaceC0463Mo12628.mo2052();
                        int iMo1086 = c8932.mo1085();
                        String text = interfaceC0463Mo12628.getText();
                        boolean[] zArr3 = this.f76851;
                        boolean z2 = true;
                        if (iMo1086 != 109) {
                            if (iMo1086 != 139) {
                                if (iMo1086 != 178) {
                                    if (iMo1086 == 117 || iMo1086 == 118) {
                                        if (iMo2052 != c8932.f27156.mo2052()) {
                                        }
                                    } else {
                                        switch (iMo1086) {
                                            case 122:
                                            case 123:
                                            case 124:
                                            case q.h /* 125 */:
                                            case 126:
                                            case 127:
                                            case 128:
                                            case 129:
                                            case 130:
                                            case 131:
                                            case 132:
                                            case 133:
                                            case 134:
                                            case 135:
                                            case 136:
                                            case 137:
                                                if (iMo2052 != c8932.f27156.mo2052()) {
                                                    break;
                                                }
                                            default:
                                                break;
                                        }
                                    }
                                } else {
                                    z = text.equals("async") || (text.equals("for") && !c8932.f27156.getText().equals("async")) || text.equals("if");
                                }
                            } else if (iMo2052 != c8932.f27156.mo2052() || (c8932.mo23040(0) instanceof C8931)) {
                            }
                        } else if (text.equals("if") || text.equals("else")) {
                        }
                        zArr3[iMo2052] = z;
                        if ((text.equals(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) || text.equals("-") || text.equals("~")) && iMo1086 == 138) {
                            zArr2[iMo2052] = true;
                        } else if ((text.equals("*") || text.equals("**")) && iMo1086 != 137 && iMo1086 != 139 && iMo1086 != 63) {
                            zArr2[iMo2052] = true;
                        } else if (text.equals("*") && iMo1086 == 63) {
                            zArr[iMo2052] = true;
                        } else if (text.equals("@") && iMo1086 == 34) {
                            zArr2[iMo2052] = true;
                        } else if (text.equals(":") && iMo1086 == 143) {
                            zArr[iMo2052] = true;
                            zArr2[iMo2052] = true;
                        } else if (text.equals("=")) {
                            boolean z3 = iMo1086 == 187 || iMo1086 == 188 || iMo1086 == 100;
                            if (iMo1086 == 53) {
                                InterfaceC16174 interfaceC16174Mo23041 = c8932.f63075.mo23040(0);
                                if ((interfaceC16174Mo23041 instanceof C16056) && ((C4685) ((C16056) interfaceC16174Mo23041).m23039(C4685.class, 0)) != null) {
                                    z2 = false;
                                }
                                z3 = z2;
                            }
                            zArr[iMo2052] = z3;
                            zArr2[iMo2052] = z3;
                        } else if (text.equals("/") && (iMo1086 == 41 || iMo1086 == 42 || iMo1086 == 149 || iMo1086 == 150)) {
                            zArr2[iMo2052] = true;
                        } else if (text.equals(MotionUtils.EASING_TYPE_FORMAT_START) || text.equals("[")) {
                            zArr[iMo2052] = iMo1086 == 141 || iMo1086 == 197 || iMo1086 == 38 || iMo1086 == 36 || iMo1086 == 97 || iMo1086 == 102 || iMo1086 == 193 || iMo1086 == 196;
                            if (iMo1086 == 181) {
                                int iMo1087 = c8932.f63075.mo1085();
                                if (iMo1087 != 141 && iMo1087 != 197) {
                                    z2 = false;
                                }
                                zArr[iMo2052] = z2;
                            }
                        }
                    }
                }
            }
        }
    }
}
