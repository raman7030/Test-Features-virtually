package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.util.ArrayDeque;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.util.encoders.UTF8;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86QM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7947 extends AbstractC23747 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f24570;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f24571;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Boolean f24572;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24573;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f24574;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f24575;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f24576;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f24577;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f24578;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Boolean f24579;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f24580;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f24581;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18051 f24582;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f24583;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f24584;

    public AbstractC7947(InterfaceC23125 interfaceC23125) {
        super(interfaceC23125);
        this.f24575 = new ArrayDeque();
        this.f24576 = new ArrayDeque();
        this.f24571 = new ArrayDeque();
        this.f24580 = true;
        this.f24577 = true;
        this.f24578 = "";
        this.f24570 = "";
        this.f24583 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21253(boolean z) {
        this.f24584 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21252(C18051 c18051) {
        this.f24582 = c18051;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m21256() {
        if (!this.f24584) {
            InterfaceC23125 interfaceC23125 = this.f76890;
            int iIndex = interfaceC23125.index() - this.f76885;
            if (iIndex == 4) {
                int i = 0;
                while (interfaceC23125.mo6203(((-iIndex) - 1) - i) == 60) {
                    i++;
                }
                if ((i & 1) == 0) {
                    return true;
                }
            } else {
                return this.f24583;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m21255() {
        if (this.f24584 || !this.f24580) {
            return false;
        }
        InterfaceC23125 interfaceC23125 = this.f76890;
        return (interfaceC23125.mo6203(1) == 42 || interfaceC23125.mo6203(1) == 47) ? false : true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m21257() {
        this.f24574++;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m21251() {
        this.f24575.push(Integer.valueOf(this.f24574));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m21254() {
        ArrayDeque arrayDeque = this.f24575;
        if (!arrayDeque.isEmpty() && ((Integer) arrayDeque.peek()).intValue() == this.f24574) {
            arrayDeque.pop();
            m52395();
        } else {
            this.f24574--;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:118:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:433:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:447:0x060f  */
    /* JADX WARN: Code duplicated, block: B:448:0x0611  */
    /* JADX WARN: Code duplicated, block: B:501:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:504:0x06bf  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.AbstractC23747, l.InterfaceC1169
    public final InterfaceC0463 nextToken() {
        Object obj;
        Object obj2;
        byte b;
        boolean z;
        boolean z2;
        boolean z3;
        byte b2;
        boolean z4;
        C18757.m43430();
        InterfaceC0463 interfaceC0463NextToken = super.nextToken();
        if (interfaceC0463NextToken.getType() == -1) {
            return interfaceC0463NextToken;
        }
        if (interfaceC0463NextToken.mo2050() != 0) {
            boolean zM21648 = C8173.m21648(interfaceC0463NextToken.getText());
            if (zM21648) {
                this.f24583 = true;
            }
            if (!zM21648 || this.f24570.equals(".") || this.f24570.equals("?.")) {
                return interfaceC0463NextToken;
            }
            String str = this.f24578;
            str.getClass();
            switch (str) {
                case "return":
                case "continue":
                case "break":
                    break;
                case "yield":
                    C18051 c18051 = this.f24582;
                    if (c18051 != null && !c18051.m42110(interfaceC0463NextToken.mo2054())) {
                        return interfaceC0463NextToken;
                    }
                    break;
                default:
                    return interfaceC0463NextToken;
            }
            this.f24580 = true;
            this.f24577 = true;
            return interfaceC0463NextToken;
        }
        this.f24583 = false;
        String text = interfaceC0463NextToken.getText();
        if (interfaceC0463NextToken.getType() == 145) {
            return interfaceC0463NextToken;
        }
        ArrayDeque arrayDeque = this.f24576;
        C0891 c0891 = (C0891) arrayDeque.peek();
        boolean z5 = this.f24578.equals(".") || this.f24578.equals("?.");
        boolean z6 = (!text.equals("of") || c0891 == null || !c0891.f3464 || this.f24580 || z5 || (this.f24570.equals(MotionUtils.EASING_TYPE_FORMAT_START) && (this.f24578.equals("var") || this.f24578.equals("let") || this.f24578.equals("const")))) ? false : true;
        if (c0891 != null && (text.equals(l.b) || z6 || (text.equals("in") && !z5))) {
            c0891.f3464 = false;
        }
        if (text.equals("async")) {
            this.f24581 = this.f24577;
        }
        int type = interfaceC0463NextToken.getType();
        boolean z7 = z6;
        ArrayDeque arrayDeque2 = this.f24571;
        if (type == 144) {
            this.f24580 = true;
            this.f24577 = false;
            arrayDeque.push(new C0891(false, false));
        } else if (text.equals(MotionUtils.EASING_TYPE_FORMAT_START)) {
            if (!this.f24570.equals(".") && !this.f24570.equals("?.")) {
                String str2 = this.f24578;
                str2.getClass();
                switch (str2.hashCode()) {
                    case -889473228:
                        if (!str2.equals("switch")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 3357:
                        if (!str2.equals("if")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 101577:
                        if (!str2.equals("for")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 3649734:
                        if (!str2.equals("with")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 94432955:
                        if (!str2.equals("catch")) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case 113101617:
                        if (!str2.equals("while")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    default:
                        if (!this.f24578.equals("await") || !this.f24570.equals("for")) {
                            z2 = false;
                            break;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        z2 = true;
                        break;
                }
            } else {
                z2 = false;
            }
            Boolean bool = this.f24579;
            arrayDeque.push(new C0891(z2, bool != null && bool.booleanValue()));
            ((C0891) arrayDeque.peek()).f3464 = z2 && (this.f24578.equals("for") || this.f24578.equals("await"));
            if (this.f24579 != null) {
                z3 = true;
                ((C0891) arrayDeque.peek()).f3465 = true;
                this.f24579 = null;
            } else {
                z3 = true;
            }
            this.f24580 = z3;
            this.f24577 = false;
        } else if (text.equals("[")) {
            arrayDeque.push(new C0891(false, false));
            this.f24580 = true;
            this.f24577 = false;
        } else {
            if (text.equals("{")) {
                C5125 c5125 = (C5125) arrayDeque2.peek();
                boolean z8 = c5125 != null && arrayDeque.size() == c5125.f16048;
                boolean z9 = this.f24577 || this.f24573 || this.f24578.equals(MotionUtils.EASING_TYPE_FORMAT_END) || this.f24578.equals("=>") || this.f24572 != null || z8;
                arrayDeque.push(new C0891(z9, Boolean.FALSE.equals(this.f24572) || (z8 && !c5125.f16047)));
                this.f24572 = null;
                if (z8) {
                    arrayDeque2.pop();
                }
                this.f24580 = true;
                this.f24577 = z9;
            } else {
                obj = "?.";
                if (text.equals(MotionUtils.EASING_TYPE_FORMAT_END) || text.equals("]") || text.equals(l.d)) {
                    obj2 = ".";
                    C0891 c0892 = arrayDeque.isEmpty() ? null : (C0891) arrayDeque.pop();
                    while (!arrayDeque2.isEmpty() && ((C5125) arrayDeque2.peek()).f16048 > arrayDeque.size()) {
                        arrayDeque2.pop();
                    }
                    this.f24573 = text.equals(MotionUtils.EASING_TYPE_FORMAT_END) && c0892 != null && c0892.f3462;
                    if (c0892 != null && c0892.f3465) {
                        this.f24572 = Boolean.valueOf(c0892.f3463);
                    }
                    boolean z10 = this.f24573 || (text.equals(l.d) && c0892 != null && c0892.f3462 && !c0892.f3463);
                    this.f24580 = z10;
                    this.f24577 = z10;
                } else {
                    obj2 = ".";
                    if (text.equals("function")) {
                        this.f24579 = Boolean.valueOf(this.f24577 || this.f24578.equals("export") || this.f24578.equals("default") || (this.f24578.equals("async") && this.f24581));
                        this.f24580 = true;
                        this.f24577 = false;
                    } else if (text.equals(Name.LABEL) && !z5) {
                        arrayDeque2.push(new C5125(arrayDeque.size(), this.f24577 || this.f24578.equals("export") || this.f24578.equals("default")));
                        this.f24580 = true;
                        this.f24577 = false;
                    } else if (text.equals(l.b)) {
                        this.f24580 = true;
                        this.f24577 = true;
                    } else {
                        switch (text.hashCode()) {
                            case -1335458389:
                                if (!text.equals("delete")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -934396624:
                                if (!text.equals("return")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case -858802543:
                                if (!text.equals("typeof")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 33:
                                if (!text.equals("!")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 37:
                                if (!text.equals("%")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 38:
                                if (!text.equals(a.p)) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 42:
                                if (!text.equals("*")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 43:
                                if (!text.equals(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX)) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 44:
                                if (!text.equals(",")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                if (!text.equals("-")) {
                                    b = -1;
                                } else {
                                    b = 9;
                                }
                                break;
                            case 47:
                                if (!text.equals("/")) {
                                    b = -1;
                                } else {
                                    b = 10;
                                }
                                break;
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                if (!text.equals(":")) {
                                    b = -1;
                                } else {
                                    b = 11;
                                }
                                break;
                            case 60:
                                if (!text.equals("<")) {
                                    b = -1;
                                } else {
                                    b = 12;
                                }
                                break;
                            case 61:
                                if (!text.equals("=")) {
                                    b = -1;
                                } else {
                                    b = cb.k;
                                }
                                break;
                            case 62:
                                if (!text.equals(">")) {
                                    b = -1;
                                } else {
                                    b = cb.f77931l;
                                }
                                break;
                            case 63:
                                if (!text.equals("?")) {
                                    b = -1;
                                } else {
                                    b = 15;
                                }
                                break;
                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                if (!text.equals("^")) {
                                    b = -1;
                                } else {
                                    b = 16;
                                }
                                break;
                            case 124:
                                if (!text.equals("|")) {
                                    b = -1;
                                } else {
                                    b = 17;
                                }
                                break;
                            case 126:
                                if (!text.equals("~")) {
                                    b = -1;
                                } else {
                                    b = 18;
                                }
                                break;
                            case 1084:
                                if (!text.equals("!=")) {
                                    b = -1;
                                } else {
                                    b = 19;
                                }
                                break;
                            case 1208:
                                if (!text.equals("%=")) {
                                    b = -1;
                                } else {
                                    b = 20;
                                }
                                break;
                            case 1216:
                                if (!text.equals("&&")) {
                                    b = -1;
                                } else {
                                    b = 21;
                                }
                                break;
                            case 1239:
                                if (!text.equals("&=")) {
                                    b = -1;
                                } else {
                                    b = 22;
                                }
                                break;
                            case 1344:
                                if (!text.equals("**")) {
                                    b = -1;
                                } else {
                                    b = 23;
                                }
                                break;
                            case 1363:
                                if (!text.equals("*=")) {
                                    b = -1;
                                } else {
                                    b = 24;
                                }
                                break;
                            case 1394:
                                if (!text.equals("+=")) {
                                    b = -1;
                                } else {
                                    b = 25;
                                }
                                break;
                            case 1456:
                                if (!text.equals("-=")) {
                                    b = -1;
                                } else {
                                    b = 26;
                                }
                                break;
                            case 1518:
                                if (!text.equals("/=")) {
                                    b = -1;
                                } else {
                                    b = 27;
                                }
                                break;
                            case 1921:
                                if (!text.equals("<=")) {
                                    b = -1;
                                } else {
                                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                                }
                                break;
                            case 1952:
                                if (!text.equals("==")) {
                                    b = -1;
                                } else {
                                    b = 29;
                                }
                                break;
                            case 1953:
                                if (!text.equals("=>")) {
                                    b = -1;
                                } else {
                                    b = 30;
                                }
                                break;
                            case 2016:
                                if (!text.equals("??")) {
                                    b = -1;
                                } else {
                                    b = bo.j;
                                }
                                break;
                            case 2975:
                                if (!text.equals("^=")) {
                                    b = -1;
                                } else {
                                    b = UTF8.S_CS3;
                                }
                                break;
                            case 3211:
                                if (!text.equals("do")) {
                                    b = -1;
                                } else {
                                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                                }
                                break;
                            case 3365:
                                if (!text.equals("in")) {
                                    b = -1;
                                } else {
                                    b = 34;
                                }
                                break;
                            case 3543:
                                if (!text.equals("of")) {
                                    b = -1;
                                } else {
                                    b = 35;
                                }
                                break;
                            case 3905:
                                if (!text.equals("|=")) {
                                    b = -1;
                                } else {
                                    b = 36;
                                }
                                break;
                            case 3968:
                                if (!text.equals("||")) {
                                    b = -1;
                                } else {
                                    b = 37;
                                }
                                break;
                            case 33665:
                                if (!text.equals("!==")) {
                                    b = -1;
                                } else {
                                    b = 38;
                                }
                                break;
                            case 37757:
                                if (!text.equals("&&=")) {
                                    b = -1;
                                } else {
                                    b = 39;
                                }
                                break;
                            case 41725:
                                if (!text.equals("**=")) {
                                    b = -1;
                                } else {
                                    b = 40;
                                }
                                break;
                            case 60573:
                                if (!text.equals("===")) {
                                    b = -1;
                                } else {
                                    b = 41;
                                }
                                break;
                            case 62557:
                                if (!text.equals("??=")) {
                                    b = -1;
                                } else {
                                    b = 42;
                                }
                                break;
                            case 108960:
                                if (!text.equals("new")) {
                                    b = -1;
                                } else {
                                    b = 43;
                                }
                                break;
                            case 123069:
                                if (!text.equals("||=")) {
                                    b = -1;
                                } else {
                                    b = 44;
                                }
                                break;
                            case 3046192:
                                if (!text.equals("case")) {
                                    b = -1;
                                } else {
                                    b = 45;
                                }
                                break;
                            case 3116345:
                                if (!text.equals("else")) {
                                    b = -1;
                                } else {
                                    b = 46;
                                }
                                break;
                            case 3625364:
                                if (!text.equals(ClassTransform.VOID)) {
                                    b = -1;
                                } else {
                                    b = 47;
                                }
                                break;
                            case 93223254:
                                if (!text.equals("await")) {
                                    b = -1;
                                } else {
                                    b = UTF8.S_P3A;
                                }
                                break;
                            case 110339814:
                                if (!text.equals("throw")) {
                                    b = -1;
                                } else {
                                    b = 49;
                                }
                                break;
                            case 114974605:
                                if (!text.equals("yield")) {
                                    b = -1;
                                } else {
                                    b = 50;
                                }
                                break;
                            case 902025516:
                                if (!text.equals("instanceof")) {
                                    b = -1;
                                } else {
                                    b = 51;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            case 46:
                            case 47:
                            case 49:
                            case 51:
                                z = true;
                                break;
                            case 35:
                                z = z7;
                                break;
                            case 48:
                                C18051 c18052 = this.f24582;
                                if (c18052 == null || c18052.m42107(interfaceC0463NextToken.mo2054())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                break;
                            case 50:
                                C18051 c18053 = this.f24582;
                                if (c18053 == null || c18053.m42110(interfaceC0463NextToken.mo2054())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                break;
                            default:
                                z = false;
                                break;
                        }
                        this.f24580 = z;
                        this.f24577 = text.equals("else") || text.equals("do") || text.equals("try") || text.equals("finally");
                    }
                }
            }
            if (!this.f24578.equals(obj2) || this.f24578.equals(obj)) {
                z4 = false;
                this.f24580 = false;
                this.f24577 = false;
                this.f24579 = null;
            } else {
                z4 = false;
            }
            if (!text.equals(MotionUtils.EASING_TYPE_FORMAT_END)) {
                this.f24573 = z4;
            }
            this.f24570 = this.f24578;
            this.f24578 = text;
            if (arrayDeque.size() <= 256 || arrayDeque2.size() > 256 || this.f24575.size() > 128) {
                throw new IllegalArgumentException("Source nesting exceeds formatter limit");
            }
            return interfaceC0463NextToken;
        }
        obj = "?.";
        obj2 = ".";
        if (this.f24578.equals(obj2)) {
            z4 = false;
            this.f24580 = false;
            this.f24577 = false;
            this.f24579 = null;
        } else {
            z4 = false;
            this.f24580 = false;
            this.f24577 = false;
            this.f24579 = null;
        }
        if (!text.equals(MotionUtils.EASING_TYPE_FORMAT_END)) {
            this.f24573 = z4;
        }
        this.f24570 = this.f24578;
        this.f24578 = text;
        if (arrayDeque.size() <= 256) {
        }
        throw new IllegalArgumentException("Source nesting exceeds formatter limit");
    }
}
