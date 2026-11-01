package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import java.util.ArrayDeque;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.util.encoders.UTF8;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86QM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9921 extends AbstractC24937 {

    /* JADX INFO: renamed from: ֡ */
    public String f27483;

    /* JADX INFO: renamed from: ֨ */
    public final ArrayDeque f27484;

    /* JADX INFO: renamed from: ۗ */
    public Boolean f27485;

    /* JADX INFO: renamed from: ۙ */
    public boolean f27486;

    /* JADX INFO: renamed from: ۚ */
    public int f27487;

    /* JADX INFO: renamed from: ۛ */
    public final ArrayDeque f27488;

    /* JADX INFO: renamed from: ۠ */
    public final ArrayDeque f27489;

    /* JADX INFO: renamed from: ۤ */
    public boolean f27490;

    /* JADX INFO: renamed from: ۫ */
    public String f27491;

    /* JADX INFO: renamed from: ۬ */
    public Boolean f27492;

    /* JADX INFO: renamed from: ܶ */
    public boolean f27493;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f27494;

    /* JADX INFO: renamed from: ᩶ */
    public C19524 f27495;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f27496;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f27497;

    public AbstractC9921(InterfaceC24346 interfaceC24346) {
        super(interfaceC24346);
        this.f27488 = new ArrayDeque();
        this.f27489 = new ArrayDeque();
        this.f27484 = new ArrayDeque();
        this.f27493 = true;
        this.f27490 = true;
        this.f27491 = "";
        this.f27483 = "";
        this.f27496 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23219(boolean z) {
        this.f27497 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23218(C19524 c19524) {
        this.f27495 = c19524;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m23222() {
        if (!this.f27497) {
            InterfaceC24346 interfaceC24346 = this.f79642;
            int iIndex = interfaceC24346.index() - this.f79637;
            if (iIndex == 4) {
                int i = 0;
                while (interfaceC24346.mo8405(((-iIndex) - 1) - i) == 60) {
                    i++;
                }
                if ((i & 1) == 0) {
                    return true;
                }
            } else {
                return this.f27496;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m23221() {
        if (this.f27497 || !this.f27493) {
            return false;
        }
        InterfaceC24346 interfaceC24346 = this.f79642;
        return (interfaceC24346.mo8405(1) == 42 || interfaceC24346.mo8405(1) == 47) ? false : true;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m23223() {
        this.f27487++;
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m23217() {
        this.f27488.push(Integer.valueOf(this.f27487));
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m23220() {
        ArrayDeque arrayDeque = this.f27488;
        if (!arrayDeque.isEmpty() && ((Integer) arrayDeque.peek()).intValue() == this.f27487) {
            arrayDeque.pop();
            m54804();
        } else {
            this.f27487--;
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
    @Override // p067l.AbstractC24937, p067l.InterfaceC3479
    public final InterfaceC2808 nextToken() {
        Object obj;
        Object obj2;
        byte b;
        boolean z;
        boolean z2;
        boolean z3;
        byte b2;
        boolean z4;
        C20195.m45697();
        InterfaceC2808 interfaceC2808NextToken = super.nextToken();
        if (interfaceC2808NextToken.getType() == -1) {
            return interfaceC2808NextToken;
        }
        if (interfaceC2808NextToken.mo4430() != 0) {
            boolean zM23617 = C10136.m23617(interfaceC2808NextToken.getText());
            if (zM23617) {
                this.f27496 = true;
            }
            if (!zM23617 || this.f27483.equals(".") || this.f27483.equals("?.")) {
                return interfaceC2808NextToken;
            }
            String str = this.f27491;
            str.getClass();
            switch (str) {
                case "return":
                case "continue":
                case "break":
                    break;
                case "yield":
                    C19524 c19524 = this.f27495;
                    if (c19524 != null && !c19524.m44361(interfaceC2808NextToken.mo4434())) {
                        return interfaceC2808NextToken;
                    }
                    break;
                default:
                    return interfaceC2808NextToken;
            }
            this.f27493 = true;
            this.f27490 = true;
            return interfaceC2808NextToken;
        }
        this.f27496 = false;
        String text = interfaceC2808NextToken.getText();
        if (interfaceC2808NextToken.getType() == 145) {
            return interfaceC2808NextToken;
        }
        ArrayDeque arrayDeque = this.f27489;
        C3215 c3215 = (C3215) arrayDeque.peek();
        boolean z5 = this.f27491.equals(".") || this.f27491.equals("?.");
        boolean z6 = (!text.equals("of") || c3215 == null || !c3215.f6237 || this.f27493 || z5 || (this.f27483.equals(MotionUtils.EASING_TYPE_FORMAT_START) && (this.f27491.equals("var") || this.f27491.equals("let") || this.f27491.equals("const")))) ? false : true;
        if (c3215 != null && (text.equals(C0249l.f1196b) || z6 || (text.equals("in") && !z5))) {
            c3215.f6237 = false;
        }
        if (text.equals("async")) {
            this.f27494 = this.f27490;
        }
        int type = interfaceC2808NextToken.getType();
        boolean z7 = z6;
        ArrayDeque arrayDeque2 = this.f27484;
        if (type == 144) {
            this.f27493 = true;
            this.f27490 = false;
            arrayDeque.push(new C3215(false, false));
        } else if (text.equals(MotionUtils.EASING_TYPE_FORMAT_START)) {
            if (!this.f27483.equals(".") && !this.f27483.equals("?.")) {
                String str2 = this.f27491;
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
                        if (!this.f27491.equals("await") || !this.f27483.equals("for")) {
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
            Boolean bool = this.f27492;
            arrayDeque.push(new C3215(z2, bool != null && bool.booleanValue()));
            ((C3215) arrayDeque.peek()).f6237 = z2 && (this.f27491.equals("for") || this.f27491.equals("await"));
            if (this.f27492 != null) {
                z3 = true;
                ((C3215) arrayDeque.peek()).f6238 = true;
                this.f27492 = null;
            } else {
                z3 = true;
            }
            this.f27493 = z3;
            this.f27490 = false;
        } else if (text.equals("[")) {
            arrayDeque.push(new C3215(false, false));
            this.f27493 = true;
            this.f27490 = false;
        } else {
            if (text.equals("{")) {
                C7239 c7239 = (C7239) arrayDeque2.peek();
                boolean z8 = c7239 != null && arrayDeque.size() == c7239.f18882;
                boolean z9 = this.f27490 || this.f27486 || this.f27491.equals(MotionUtils.EASING_TYPE_FORMAT_END) || this.f27491.equals("=>") || this.f27485 != null || z8;
                arrayDeque.push(new C3215(z9, Boolean.FALSE.equals(this.f27485) || (z8 && !c7239.f18881)));
                this.f27485 = null;
                if (z8) {
                    arrayDeque2.pop();
                }
                this.f27493 = true;
                this.f27490 = z9;
            } else {
                obj = "?.";
                if (text.equals(MotionUtils.EASING_TYPE_FORMAT_END) || text.equals("]") || text.equals(C0249l.f1198d)) {
                    obj2 = ".";
                    C3215 c3216 = arrayDeque.isEmpty() ? null : (C3215) arrayDeque.pop();
                    while (!arrayDeque2.isEmpty() && ((C7239) arrayDeque2.peek()).f18882 > arrayDeque.size()) {
                        arrayDeque2.pop();
                    }
                    this.f27486 = text.equals(MotionUtils.EASING_TYPE_FORMAT_END) && c3216 != null && c3216.f6235;
                    if (c3216 != null && c3216.f6238) {
                        this.f27485 = Boolean.valueOf(c3216.f6236);
                    }
                    boolean z10 = this.f27486 || (text.equals(C0249l.f1198d) && c3216 != null && c3216.f6235 && !c3216.f6236);
                    this.f27493 = z10;
                    this.f27490 = z10;
                } else {
                    obj2 = ".";
                    if (text.equals("function")) {
                        this.f27492 = Boolean.valueOf(this.f27490 || this.f27491.equals("export") || this.f27491.equals("default") || (this.f27491.equals("async") && this.f27494));
                        this.f27493 = true;
                        this.f27490 = false;
                    } else if (text.equals(Name.LABEL) && !z5) {
                        arrayDeque2.push(new C7239(arrayDeque.size(), this.f27490 || this.f27491.equals("export") || this.f27491.equals("default")));
                        this.f27493 = true;
                        this.f27490 = false;
                    } else if (text.equals(C0249l.f1196b)) {
                        this.f27493 = true;
                        this.f27490 = true;
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
                                if (!text.equals(C0233a.f1084p)) {
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
                                    b = C0698cb.f2569k;
                                }
                                break;
                            case 62:
                                if (!text.equals(">")) {
                                    b = -1;
                                } else {
                                    b = C0698cb.f2570l;
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
                                    b = C0684bo.f2505j;
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
                                C19524 c19525 = this.f27495;
                                if (c19525 == null || c19525.m44358(interfaceC2808NextToken.mo4434())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                break;
                            case 50:
                                C19524 c19526 = this.f27495;
                                if (c19526 == null || c19526.m44361(interfaceC2808NextToken.mo4434())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                break;
                            default:
                                z = false;
                                break;
                        }
                        this.f27493 = z;
                        this.f27490 = text.equals("else") || text.equals("do") || text.equals("try") || text.equals("finally");
                    }
                }
            }
            if (!this.f27491.equals(obj2) || this.f27491.equals(obj)) {
                z4 = false;
                this.f27493 = false;
                this.f27490 = false;
                this.f27492 = null;
            } else {
                z4 = false;
            }
            if (!text.equals(MotionUtils.EASING_TYPE_FORMAT_END)) {
                this.f27486 = z4;
            }
            this.f27483 = this.f27491;
            this.f27491 = text;
            if (arrayDeque.size() <= 256 || arrayDeque2.size() > 256 || this.f27488.size() > 128) {
                throw new IllegalArgumentException("Source nesting exceeds formatter limit");
            }
            return interfaceC2808NextToken;
        }
        obj = "?.";
        obj2 = ".";
        if (this.f27491.equals(obj2)) {
            z4 = false;
            this.f27493 = false;
            this.f27490 = false;
            this.f27492 = null;
        } else {
            z4 = false;
            this.f27493 = false;
            this.f27490 = false;
            this.f27492 = null;
        }
        if (!text.equals(MotionUtils.EASING_TYPE_FORMAT_END)) {
            this.f27486 = z4;
        }
        this.f27483 = this.f27491;
        this.f27491 = text;
        if (arrayDeque.size() <= 256) {
        }
        throw new IllegalArgumentException("Source nesting exceeds formatter limit");
    }
}
