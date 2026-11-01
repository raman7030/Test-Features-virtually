package p067l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C9566 implements InterfaceC3830, Comparable {

    /* JADX INFO: renamed from: ֡֫ */
    public static final C9566 f26299;

    /* JADX INFO: renamed from: ֨֫ */
    public static final C9566 f26300;

    /* JADX INFO: renamed from: ֫֫ */
    public static final C9566 f26301;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final C9566 f26302;

    /* JADX INFO: renamed from: ۗ֫ */
    public static final C9566 f26303;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final C9566 f26304;

    /* JADX INFO: renamed from: ۙ֫ */
    public static final C9566 f26305;

    /* JADX INFO: renamed from: ۚ֫ */
    public static final C9566 f26306;

    /* JADX INFO: renamed from: ۛ */
    public static final C9566 f26307;

    /* JADX INFO: renamed from: ۛ֫ */
    public static final C9566 f26308;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final C9566 f26309;

    /* JADX INFO: renamed from: ۟ */
    public static final C9566 f26310;

    /* JADX INFO: renamed from: ۠֫ */
    public static final C9566 f26311;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final C9566 f26312;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final C9566 f26313;

    /* JADX INFO: renamed from: ۤ */
    public static final C9566 f26314;

    /* JADX INFO: renamed from: ۤ֫ */
    public static final C9566 f26315;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final C9566 f26316;

    /* JADX INFO: renamed from: ۨ */
    public static final C9566 f26317;

    /* JADX INFO: renamed from: ۨ֫ */
    public static final C9566 f26318;

    /* JADX INFO: renamed from: ۫֫ */
    public static final C9566 f26319;

    /* JADX INFO: renamed from: ۬֫ */
    public static final C9566 f26320;

    /* JADX INFO: renamed from: ܰ */
    public static final C9566 f26321;

    /* JADX INFO: renamed from: ܰ֫ */
    public static final ConcurrentMapC12768 f26322 = new ConcurrentMapC12768(10000, 0.75f);

    /* JADX INFO: renamed from: ܳ֫ */
    public static final C9566 f26323;

    /* JADX INFO: renamed from: ܶ֫ */
    public static final C9566 f26324;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final C9566 f26325;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final C9566 f26326;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final C9566 f26327;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final C9566 f26328;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final C9566 f26329;

    /* JADX INFO: renamed from: ᩵֫ */
    public static final C9566 f26330;

    /* JADX INFO: renamed from: ᩶֫ */
    public static final C9566 f26331;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final C9566 f26332;

    /* JADX INFO: renamed from: ᩸֫ */
    public static final C9566 f26333;

    /* JADX INFO: renamed from: ᩹֫ */
    public static final C9566 f26334;

    /* JADX INFO: renamed from: ᩺ */
    public static final C9566 f26335;

    /* JADX INFO: renamed from: ᩺֫ */
    public static final C9566 f26336;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final C9566 f26337;

    /* JADX INFO: renamed from: ۗ */
    public final String f26338;

    /* JADX INFO: renamed from: ۙ */
    public C9566 f26339;

    /* JADX INFO: renamed from: ۫ */
    public final int f26340;

    /* JADX INFO: renamed from: ۬ */
    public C9566 f26341;

    /* JADX INFO: renamed from: ᩶ */
    public String f26342;

    /* JADX INFO: renamed from: ᩸ */
    public C9566 f26343;

    /* JADX INFO: renamed from: ᩹ */
    public final int f26344;

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return this;
    }

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo7482() {
        return false;
    }

    static {
        C9566 c9566 = new C9566("Z", 1, -1);
        f26314 = c9566;
        C9566 c9567 = new C9566("B", 2, -1);
        f26335 = c9567;
        C9566 c9568 = new C9566("C", 3, -1);
        f26301 = c9568;
        C9566 c9569 = new C9566("D", 4, -1);
        f26323 = c9569;
        C9566 c95610 = new C9566("F", 5, -1);
        f26332 = c95610;
        C9566 c95611 = new C9566("I", 6, -1);
        f26325 = c95611;
        C9566 c95612 = new C9566("J", 7, -1);
        f26330 = c95612;
        C9566 c95613 = new C9566("S", 8, -1);
        f26305 = c95613;
        f26318 = new C9566("V", 0, -1);
        f26329 = new C9566("<null>", 9, -1);
        f26334 = new C9566("<addr>", 10, -1);
        C9566 c95614 = new C9566("Ljava/lang/annotation/Annotation;", 9, -1);
        C9566 c95615 = new C9566("Ljava/lang/Class;", 9, -1);
        f26328 = c95615;
        C9566 c95616 = new C9566("Ljava/lang/Cloneable;", 9, -1);
        f26327 = c95616;
        C9566 c95617 = new C9566("Ljava/lang/invoke/MethodHandle;", 9, -1);
        f26300 = c95617;
        f26311 = new C9566("Ljava/lang/invoke/MethodType;", 9, -1);
        C9566 c95618 = new C9566("Ljava/lang/invoke/VarHandle;", 9, -1);
        f26308 = c95618;
        C9566 c95619 = new C9566("Ljava/lang/Object;", 9, -1);
        f26324 = c95619;
        C9566 c95620 = new C9566("Ljava/io/Serializable;", 9, -1);
        f26331 = c95620;
        C9566 c95621 = new C9566("Ljava/lang/String;", 9, -1);
        f26319 = c95621;
        C9566 c95622 = new C9566("Ljava/lang/Throwable;", 9, -1);
        f26315 = c95622;
        C9566 c95623 = new C9566("Ljava/lang/Boolean;", 9, -1);
        f26317 = c95623;
        C9566 c95624 = new C9566("Ljava/lang/Byte;", 9, -1);
        f26310 = c95624;
        C9566 c95625 = new C9566("Ljava/lang/Character;", 9, -1);
        f26316 = c95625;
        C9566 c95626 = new C9566("Ljava/lang/Double;", 9, -1);
        f26309 = c95626;
        C9566 c95627 = new C9566("Ljava/lang/Float;", 9, -1);
        f26312 = c95627;
        C9566 c95628 = new C9566("Ljava/lang/Integer;", 9, -1);
        f26302 = c95628;
        C9566 c95629 = new C9566("Ljava/lang/Long;", 9, -1);
        f26306 = c95629;
        C9566 c95630 = new C9566("Ljava/lang/Short;", 9, -1);
        f26320 = c95630;
        C9566 c95631 = new C9566("Ljava/lang/Void;", 9, -1);
        f26336 = c95631;
        C9566 c95632 = new C9566("[Z", 9, -1);
        f26307 = c95632;
        C9566 c95633 = new C9566("[B", 9, -1);
        f26321 = c95633;
        C9566 c95634 = new C9566("[C", 9, -1);
        f26326 = c95634;
        C9566 c95635 = new C9566("[D", 9, -1);
        f26337 = c95635;
        C9566 c95636 = new C9566("[F", 9, -1);
        f26313 = c95636;
        C9566 c95637 = new C9566("[I", 9, -1);
        f26304 = c95637;
        C9566 c95638 = new C9566("[J", 9, -1);
        f26299 = c95638;
        C9566 c95639 = new C9566("[Ljava/lang/Object;", 9, -1);
        f26333 = c95639;
        C9566 c95640 = new C9566("[S", 9, -1);
        f26303 = c95640;
        m22276(c9566);
        m22276(c9567);
        m22276(c9568);
        m22276(c9569);
        m22276(c95610);
        m22276(c95611);
        m22276(c95612);
        m22276(c95613);
        m22276(c95614);
        m22276(c95615);
        m22276(c95616);
        m22276(c95617);
        m22276(c95618);
        m22276(c95619);
        m22276(c95620);
        m22276(c95621);
        m22276(c95622);
        m22276(c95623);
        m22276(c95624);
        m22276(c95625);
        m22276(c95626);
        m22276(c95627);
        m22276(c95628);
        m22276(c95629);
        m22276(c95630);
        m22276(c95631);
        m22276(c95632);
        m22276(c95633);
        m22276(c95634);
        m22276(c95635);
        m22276(c95636);
        m22276(c95637);
        m22276(c95638);
        m22276(c95639);
        m22276(c95640);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9566 m22274(String str) {
        C9566 c9566 = (C9566) f26322.get(str);
        if (c9566 != null) {
            return c9566;
        }
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt == '[') {
                return m22274(str.substring(1)).m22284();
            }
            int length = str.length();
            if (cCharAt == 'L') {
                int i = length - 1;
                if (str.charAt(i) == ';') {
                    for (int i2 = 1; i2 < i; i2++) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 != '(' && cCharAt2 != ')' && cCharAt2 != '.') {
                            if (cCharAt2 == '/') {
                                if (i2 == 1 || i2 == i || str.charAt(i2 - 1) == '/') {
                                    throw new IllegalArgumentException("bad descriptor: ".concat(str));
                                }
                            } else if (cCharAt2 == ';' || cCharAt2 == '[') {
                            }
                        }
                        throw new IllegalArgumentException("bad descriptor: ".concat(str));
                    }
                    return m22276(new C9566(str, 9, -1));
                }
            }
            throw new IllegalArgumentException("bad descriptor: ".concat(str));
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("descriptor is empty");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("descriptor == null");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9566 m22275(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.startsWith("[")) {
            return m22274(str);
        }
        return m22274("L" + str + ';');
    }

    public C9566(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (i < 0 || i >= 11) {
            throw new IllegalArgumentException("bad basicType");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("newAt < -1");
        }
        this.f26338 = str;
        this.f26344 = i;
        this.f26340 = i2;
        this.f26343 = null;
        this.f26339 = null;
        this.f26341 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9566)) {
            return false;
        }
        return this.f26338.equals(((C9566) obj).f26338);
    }

    public final int hashCode() {
        return this.f26338.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C9566 c9566) {
        return this.f26338.compareTo(c9566.f26338);
    }

    public final String toString() {
        return this.f26338;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        switch (this.f26344) {
            case 0:
                return ClassTransform.VOID;
            case 1:
                return ClassTransform.BOOLEAN;
            case 2:
                return ClassTransform.BYTE;
            case 3:
                return ClassTransform.CHARACTER;
            case 4:
                return ClassTransform.DOUBLE;
            case 5:
                return ClassTransform.FLOAT;
            case 6:
                return ClassTransform.INTEGER;
            case 7:
                return ClassTransform.LONG;
            case 8:
                return ClassTransform.SHORT;
            case 9:
                if (m22278()) {
                    return m22287().mo4819() + "[]";
                }
                return m22286().replace("/", ".");
            default:
                return this.f26338;
        }
    }

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC3830 mo7483() {
        int i = this.f26344;
        return (i == 1 || i == 2 || i == 3 || i == 6 || i == 8) ? f26325 : this;
    }

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ܿ */
    public final int mo7484() {
        return this.f26344;
    }

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7485() {
        int i = this.f26344;
        if (i == 1 || i == 2 || i == 3 || i == 6 || i == 8) {
            return 6;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֡ */
    public final String m22277() {
        return this.f26338;
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m22286() {
        if (this.f26342 == null) {
            boolean zM22288 = m22288();
            String str = this.f26338;
            if (!zM22288) {
                throw new IllegalArgumentException(C21466.m48631("not an object type: ", str));
            }
            if (str.charAt(0) == '[') {
                this.f26342 = str;
            } else {
                this.f26342 = C17073.m38720(1, 1, str);
            }
        }
        return this.f26342;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m22291() {
        int i = this.f26344;
        return (i == 4 || i == 7) ? 2 : 1;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m22283() {
        int i = this.f26344;
        return (i == 4 || i == 7) ? false : true;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m22285() {
        int i = this.f26344;
        return i == 4 || i == 7;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m22289() {
        int i = this.f26344;
        return i == 1 || i == 2 || i == 3 || i == 6 || i == 8;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m22290() {
        switch (this.f26344) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m22288() {
        return this.f26344 == 9;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m22278() {
        return this.f26338.charAt(0) == '[';
    }

    /* JADX INFO: renamed from: ۙ */
    public final boolean m22281() {
        return this.f26340 >= 0;
    }

    /* JADX INFO: renamed from: ۚ */
    public final C9566 m22282() {
        C9566 c9566 = this.f26341;
        if (c9566 != null) {
            return c9566;
        }
        throw new IllegalArgumentException("initialized type: " + this.f26338);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9566 m22284() {
        if (this.f26343 == null) {
            this.f26343 = m22276(new C9566("[" + this.f26338, 9, -1));
        }
        return this.f26343;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C9566 m22287() {
        if (this.f26339 == null) {
            String str = this.f26338;
            if (str.charAt(0) != '[') {
                throw new IllegalArgumentException("not an array type: " + str);
            }
            this.f26339 = m22274(str.substring(1));
        }
        return this.f26339;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9566 m22280(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newAt < 0");
        }
        boolean zM22288 = m22288();
        String str = this.f26338;
        if (!zM22288) {
            throw new IllegalArgumentException(C21466.m48631("not a reference type: ", str));
        }
        if (m22281()) {
            throw new IllegalArgumentException(C21466.m48631("already uninitialized: ", str));
        }
        C9566 c9566 = new C9566("N" + C16351.m37153(i) + str, 9, i);
        c9566.f26341 = this;
        return m22276(c9566);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9566 m22276(C9566 c9566) {
        C9566 c9567 = (C9566) f26322.putIfAbsent(c9566.f26338, c9566);
        return c9567 != null ? c9567 : c9566;
    }
}
