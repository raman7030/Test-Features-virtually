package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩻ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24926 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean[] f79602;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f79603;

    /* JADX INFO: renamed from: ܽ */
    public final boolean[] f79604;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean[] f79605;

    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00cf, please report this as an issue */
    public C24926(C10856 c10856, int i, C4810 c4810) {
        boolean z;
        this.f79605 = new boolean[i];
        this.f79604 = new boolean[i];
        this.f79603 = new int[i];
        this.f79602 = new boolean[i];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c10856);
        while (!arrayDeque.isEmpty()) {
            c4810.m10153();
            C10856 c10857 = (C10856) arrayDeque.pop();
            int iMo3481 = c10857.mo3481();
            if (iMo3481 == 162 || iMo3481 == 167) {
                this.f79603[c10857.f30091.mo4432()] = c10857.f30090.mo4432();
            } else {
                for (int i2 = 0; i2 < c10857.getChildCount(); i2++) {
                    InterfaceC17740 interfaceC17740Mo25014 = c10857.mo25014(i2);
                    if (interfaceC17740Mo25014 instanceof C10856) {
                        arrayDeque.push((C10856) interfaceC17740Mo25014);
                    } else if (interfaceC17740Mo25014 instanceof InterfaceC6342) {
                        InterfaceC2808 interfaceC2808Mo14503 = ((InterfaceC6342) interfaceC17740Mo25014).mo14503();
                        boolean[] zArr = this.f79605;
                        boolean[] zArr2 = this.f79604;
                        int iMo4432 = interfaceC2808Mo14503.mo4432();
                        int iMo3482 = c10857.mo3481();
                        String text = interfaceC2808Mo14503.getText();
                        boolean[] zArr3 = this.f79602;
                        boolean z2 = true;
                        if (iMo3482 != 109) {
                            if (iMo3482 != 139) {
                                if (iMo3482 != 178) {
                                    if (iMo3482 == 117 || iMo3482 == 118) {
                                        if (iMo4432 != c10857.f30091.mo4432()) {
                                        }
                                    } else {
                                        switch (iMo3482) {
                                            case 122:
                                            case 123:
                                            case 124:
                                            case C0254q.f1218h /* 125 */:
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
                                                if (iMo4432 != c10857.f30091.mo4432()) {
                                                    break;
                                                }
                                            default:
                                                break;
                                        }
                                    }
                                } else {
                                    z = text.equals("async") || (text.equals("for") && !c10857.f30091.getText().equals("async")) || text.equals("if");
                                }
                            } else if (iMo4432 != c10857.f30091.mo4432() || (c10857.mo25014(0) instanceof C10856)) {
                            }
                        } else if (text.equals("if") || text.equals("else")) {
                        }
                        zArr3[iMo4432] = z;
                        if ((text.equals(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) || text.equals("-") || text.equals("~")) && iMo3482 == 138) {
                            zArr2[iMo4432] = true;
                        } else if ((text.equals("*") || text.equals("**")) && iMo3482 != 137 && iMo3482 != 139 && iMo3482 != 63) {
                            zArr2[iMo4432] = true;
                        } else if (text.equals("*") && iMo3482 == 63) {
                            zArr[iMo4432] = true;
                        } else if (text.equals("@") && iMo3482 == 34) {
                            zArr2[iMo4432] = true;
                        } else if (text.equals(":") && iMo3482 == 143) {
                            zArr[iMo4432] = true;
                            zArr2[iMo4432] = true;
                        } else if (text.equals("=")) {
                            boolean z3 = iMo3482 == 187 || iMo3482 == 188 || iMo3482 == 100;
                            if (iMo3482 == 53) {
                                InterfaceC17740 interfaceC17740Mo25015 = c10857.f65695.mo25014(0);
                                if ((interfaceC17740Mo25015 instanceof C17628) && ((C6821) ((C17628) interfaceC17740Mo25015).m25013(C6821.class, 0)) != null) {
                                    z2 = false;
                                }
                                z3 = z2;
                            }
                            zArr[iMo4432] = z3;
                            zArr2[iMo4432] = z3;
                        } else if (text.equals("/") && (iMo3482 == 41 || iMo3482 == 42 || iMo3482 == 149 || iMo3482 == 150)) {
                            zArr2[iMo4432] = true;
                        } else if (text.equals(MotionUtils.EASING_TYPE_FORMAT_START) || text.equals("[")) {
                            zArr[iMo4432] = iMo3482 == 141 || iMo3482 == 197 || iMo3482 == 38 || iMo3482 == 36 || iMo3482 == 97 || iMo3482 == 102 || iMo3482 == 193 || iMo3482 == 196;
                            if (iMo3482 == 181) {
                                int iMo3483 = c10857.f65695.mo3481();
                                if (iMo3483 != 141 && iMo3483 != 197) {
                                    z2 = false;
                                }
                                zArr[iMo4432] = z2;
                            }
                        }
                    }
                }
            }
        }
    }
}
