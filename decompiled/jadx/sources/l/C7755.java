package l;

/* JADX INFO: renamed from: l.۟᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4LM */
/* JADX INFO: loaded from: classes3.dex */
public final class C7755 extends AbstractC14104 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6281 f23981;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f23982;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18276 f23983;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23984;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C7755 f23985;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f23986;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7755 f23987;

    public C7755(C6281 c6281, boolean z, C18276 c18276, C7755 c7755) {
        super(589824, null);
        this.f23981 = c6281;
        this.f23986 = z;
        this.f23983 = c18276;
        int i = c18276.f56819;
        this.f23982 = i == 0 ? -1 : i - 2;
        this.f23987 = c7755;
        if (c7755 != null) {
            c7755.f23985 = this;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7755 m20785(C6281 c6281, String str, C7755 c7755) {
        C18276 c18276 = new C18276();
        c18276.m42618(c6281.m17326(str));
        c18276.m42618(0);
        return new C7755(c6281, true, c18276, c7755);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7755 m20784(C6281 c6281, int i, C23214 c23214, String str, C7755 c7755) {
        C18276 c18276 = new C18276();
        int i2 = i >>> 24;
        if (i2 == 0 || i2 == 1) {
            c18276.m42618(i >>> 16);
        } else {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    c18276.m42619(i2, (i & 16776960) >> 8);
                    break;
                case 19:
                case 20:
                case 21:
                    c18276.m42609(i2);
                    break;
                case 22:
                    c18276.m42618(i >>> 16);
                    break;
                default:
                    switch (i2) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            c18276.m42619(i2, (i & 16776960) >> 8);
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            c18276.m42616(i);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        }
        C23214.m51506(c23214, c18276);
        c18276.m42618(c6281.m17326(str));
        c18276.m42618(0);
        return new C7755(c6281, true, c18276, c7755);
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
    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20792(Object obj, String str) {
        this.f23984++;
        boolean z = this.f23986;
        C6281 c6281 = this.f23981;
        C18276 c18276 = this.f23983;
        if (z) {
            c18276.m42618(c6281.m17326(str));
        }
        if (obj instanceof String) {
            c18276.m42619(115, c6281.m17326((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            c18276.m42619(66, c6281.m17305((int) ((Byte) obj).byteValue()).f39901);
            return;
        }
        if (obj instanceof Boolean) {
            c18276.m42619(90, c6281.m17305(((Boolean) obj).booleanValue() ? 1 : 0).f39901);
            return;
        }
        if (obj instanceof Character) {
            c18276.m42619(67, c6281.m17305((int) ((Character) obj).charValue()).f39901);
            return;
        }
        if (obj instanceof Short) {
            c18276.m42619(83, c6281.m17305((int) ((Short) obj).shortValue()).f39901);
            return;
        }
        if (obj instanceof C11926) {
            c18276.m42619(99, c6281.m17326(((C11926) obj).m29099()));
            return;
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c18276.m42619(91, bArr.length);
            int length = bArr.length;
            while (i < length) {
                c18276.m42619(66, c6281.m17305((int) bArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c18276.m42619(91, zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                c18276.m42619(90, c6281.m17305(zArr[i] ? 1 : 0).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c18276.m42619(91, sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                c18276.m42619(83, c6281.m17305((int) sArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            c18276.m42619(91, cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                c18276.m42619(67, c6281.m17305((int) cArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c18276.m42619(91, iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                c18276.m42619(73, c6281.m17305(iArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c18276.m42619(91, jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                c18276.m42619(74, c6281.m17307(jArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            c18276.m42619(91, fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                c18276.m42619(70, c6281.m17304(fArr[i]).f39901);
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            c18276.m42619(91, dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                c18276.m42619(68, c6281.m17303(dArr[i]).f39901);
                i++;
            }
            return;
        }
        C12631 c12631M17308 = c6281.m17308(obj);
        c18276.m42619(".s.IFJDCS".charAt(c12631M17308.f39902), c12631M17308.f39901);
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20793(String str, String str2, String str3) {
        this.f23984++;
        boolean z = this.f23986;
        C18276 c18276 = this.f23983;
        C6281 c6281 = this.f23981;
        if (z) {
            c18276.m42618(c6281.m17326(str));
        }
        c18276.m42619(101, c6281.m17326(str2));
        c18276.m42618(c6281.m17326(str3));
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo20789(String str, String str2) {
        this.f23984++;
        boolean z = this.f23986;
        C6281 c6281 = this.f23981;
        C18276 c18276 = this.f23983;
        if (z) {
            c18276.m42618(c6281.m17326(str));
        }
        c18276.m42619(64, c6281.m17326(str2));
        c18276.m42618(0);
        return new C7755(c6281, true, c18276, null);
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo20788(String str) {
        this.f23984++;
        boolean z = this.f23986;
        C6281 c6281 = this.f23981;
        C18276 c18276 = this.f23983;
        if (z) {
            c18276.m42618(c6281.m17326(str));
        }
        c18276.m42619(91, 0);
        return new C7755(c6281, false, c18276, null);
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20790() {
        int i = this.f23982;
        if (i != -1) {
            byte[] bArr = this.f23983.f56818;
            int i2 = this.f23984;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m20794(String str) {
        if (str != null) {
            this.f23981.m17326(str);
        }
        int i = 8;
        for (C7755 c7755 = this; c7755 != null; c7755 = c7755.f23987) {
            i += c7755.f23983.f56819;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20783(C7755 c7755, C7755 c7756, C7755 c7757, C7755 c7758) {
        int iM20794 = c7755 != null ? c7755.m20794("RuntimeVisibleAnnotations") : 0;
        if (c7756 != null) {
            iM20794 += c7756.m20794("RuntimeInvisibleAnnotations");
        }
        if (c7757 != null) {
            iM20794 += c7757.m20794("RuntimeVisibleTypeAnnotations");
        }
        return c7758 != null ? iM20794 + c7758.m20794("RuntimeInvisibleTypeAnnotations") : iM20794;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20791(int i, C18276 c18276) {
        int i2 = 2;
        int i3 = 0;
        C7755 c7755 = null;
        for (C7755 c7756 = this; c7756 != null; c7756 = c7756.f23987) {
            c7756.mo20790();
            i2 += c7756.f23983.f56819;
            i3++;
            c7755 = c7756;
        }
        c18276.m42618(i);
        c18276.m42616(i2);
        c18276.m42618(i3);
        while (c7755 != null) {
            C18276 c18277 = c7755.f23983;
            c18276.m42613(0, c18277.f56819, c18277.f56818);
            c7755 = c7755.f23985;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20787(C6281 c6281, C7755 c7755, C7755 c7756, C7755 c7757, C7755 c7758, C18276 c18276) {
        if (c7755 != null) {
            c7755.m20791(c6281.m17326("RuntimeVisibleAnnotations"), c18276);
        }
        if (c7756 != null) {
            c7756.m20791(c6281.m17326("RuntimeInvisibleAnnotations"), c18276);
        }
        if (c7757 != null) {
            c7757.m20791(c6281.m17326("RuntimeVisibleTypeAnnotations"), c18276);
        }
        if (c7758 != null) {
            c7758.m20791(c6281.m17326("RuntimeInvisibleTypeAnnotations"), c18276);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20782(String str, C7755[] c7755Arr, int i) {
        int iM20794 = (i * 2) + 7;
        for (int i2 = 0; i2 < i; i2++) {
            C7755 c7755 = c7755Arr[i2];
            iM20794 += c7755 == null ? 0 : c7755.m20794(str) - 8;
        }
        return iM20794;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20786(int i, C7755[] c7755Arr, int i2, C18276 c18276) {
        int iM20794 = (i2 * 2) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            C7755 c7755 = c7755Arr[i3];
            iM20794 += c7755 == null ? 0 : c7755.m20794(null) - 8;
        }
        c18276.m42618(i);
        c18276.m42616(iM20794);
        c18276.m42609(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            C7755 c7756 = null;
            for (C7755 c7757 = c7755Arr[i4]; c7757 != null; c7757 = c7757.f23987) {
                c7757.mo20790();
                i5++;
                c7756 = c7757;
            }
            c18276.m42618(i5);
            while (c7756 != null) {
                C18276 c18277 = c7756.f23983;
                c18276.m42613(0, c18277.f56819, c18277.f56818);
                c7756 = c7756.f23985;
            }
        }
    }
}
