package p067l;

/* JADX INFO: renamed from: l.۟᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4LM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9739 extends AbstractC15773 {

    /* JADX INFO: renamed from: ۜ */
    public final C8338 f26895;

    /* JADX INFO: renamed from: ܳ */
    public final int f26896;

    /* JADX INFO: renamed from: ܽ */
    public final C19738 f26897;

    /* JADX INFO: renamed from: ܿ */
    public int f26898;

    /* JADX INFO: renamed from: ᩳ */
    public C9739 f26899;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f26900;

    /* JADX INFO: renamed from: ᩻ */
    public final C9739 f26901;

    public C9739(C8338 c8338, boolean z, C19738 c19738, C9739 c9739) {
        super(589824, null);
        this.f26895 = c8338;
        this.f26900 = z;
        this.f26897 = c19738;
        int i = c19738.f60036;
        this.f26896 = i == 0 ? -1 : i - 2;
        this.f26901 = c9739;
        if (c9739 != null) {
            c9739.f26899 = this;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9739 m22766(C8338 c8338, String str, C9739 c9739) {
        C19738 c19738 = new C19738();
        c19738.m44877(c8338.m19265(str));
        c19738.m44877(0);
        return new C9739(c8338, true, c19738, c9739);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX INFO: renamed from: ֫ */
    public static C9739 m22765(C8338 c8338, int i, C24431 c24431, String str, C9739 c9739) {
        C19738 c19738 = new C19738();
        int i2 = i >>> 24;
        if (i2 == 0 || i2 == 1) {
            c19738.m44877(i >>> 16);
        } else {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    c19738.m44878(i2, (i & 16776960) >> 8);
                    break;
                case 19:
                case 20:
                case 21:
                    c19738.m44868(i2);
                    break;
                case 22:
                    c19738.m44877(i >>> 16);
                    break;
                default:
                    switch (i2) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            c19738.m44878(i2, (i & 16776960) >> 8);
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            c19738.m44875(i);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        }
        C24431.m53903(c24431, c19738);
        c19738.m44877(c8338.m19265(str));
        c19738.m44877(0);
        return new C9739(c8338, true, c19738, c9739);
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
    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final void mo22773(Object obj, String str) {
        this.f26898++;
        boolean z = this.f26900;
        C8338 c8338 = this.f26895;
        C19738 c19738 = this.f26897;
        if (z) {
            c19738.m44877(c8338.m19265(str));
        }
        if (obj instanceof String) {
            c19738.m44878(115, c8338.m19265((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            c19738.m44878(66, c8338.m19244((int) ((Byte) obj).byteValue()).f42967);
            return;
        }
        if (obj instanceof Boolean) {
            c19738.m44878(90, c8338.m19244(((Boolean) obj).booleanValue() ? 1 : 0).f42967);
            return;
        }
        if (obj instanceof Character) {
            c19738.m44878(67, c8338.m19244((int) ((Character) obj).charValue()).f42967);
            return;
        }
        if (obj instanceof Short) {
            c19738.m44878(83, c8338.m19244((int) ((Short) obj).shortValue()).f42967);
            return;
        }
        if (obj instanceof C13703) {
            c19738.m44878(99, c8338.m19265(((C13703) obj).m31152()));
            return;
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c19738.m44878(91, bArr.length);
            int length = bArr.length;
            while (i < length) {
                c19738.m44878(66, c8338.m19244((int) bArr[i]).f42967);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c19738.m44878(91, zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                c19738.m44878(90, c8338.m19244(zArr[i] ? 1 : 0).f42967);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c19738.m44878(91, sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                c19738.m44878(83, c8338.m19244((int) sArr[i]).f42967);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            c19738.m44878(91, cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                c19738.m44878(67, c8338.m19244((int) cArr[i]).f42967);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c19738.m44878(91, iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                c19738.m44878(73, c8338.m19244(iArr[i]).f42967);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c19738.m44878(91, jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                c19738.m44878(74, c8338.m19246(jArr[i]).f42967);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            c19738.m44878(91, fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                c19738.m44878(70, c8338.m19243(fArr[i]).f42967);
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            c19738.m44878(91, dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                c19738.m44878(68, c8338.m19242(dArr[i]).f42967);
                i++;
            }
            return;
        }
        C14373 c14373M19247 = c8338.m19247(obj);
        c19738.m44878(".s.IFJDCS".charAt(c14373M19247.f42968), c14373M19247.f42967);
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final void mo22774(String str, String str2, String str3) {
        this.f26898++;
        boolean z = this.f26900;
        C19738 c19738 = this.f26897;
        C8338 c8338 = this.f26895;
        if (z) {
            c19738.m44877(c8338.m19265(str));
        }
        c19738.m44878(101, c8338.m19265(str2));
        c19738.m44877(c8338.m19265(str3));
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo22770(String str, String str2) {
        this.f26898++;
        boolean z = this.f26900;
        C8338 c8338 = this.f26895;
        C19738 c19738 = this.f26897;
        if (z) {
            c19738.m44877(c8338.m19265(str));
        }
        c19738.m44878(64, c8338.m19265(str2));
        c19738.m44877(0);
        return new C9739(c8338, true, c19738, null);
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo22769(String str) {
        this.f26898++;
        boolean z = this.f26900;
        C8338 c8338 = this.f26895;
        C19738 c19738 = this.f26897;
        if (z) {
            c19738.m44877(c8338.m19265(str));
        }
        c19738.m44878(91, 0);
        return new C9739(c8338, false, c19738, null);
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final void mo22771() {
        int i = this.f26896;
        if (i != -1) {
            byte[] bArr = this.f26897.f60035;
            int i2 = this.f26898;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m22775(String str) {
        if (str != null) {
            this.f26895.m19265(str);
        }
        int i = 8;
        for (C9739 c9739 = this; c9739 != null; c9739 = c9739.f26901) {
            i += c9739.f26897.f60036;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m22764(C9739 c9739, C9739 c97310, C9739 c97311, C9739 c97312) {
        int iM22775 = c9739 != null ? c9739.m22775("RuntimeVisibleAnnotations") : 0;
        if (c97310 != null) {
            iM22775 += c97310.m22775("RuntimeInvisibleAnnotations");
        }
        if (c97311 != null) {
            iM22775 += c97311.m22775("RuntimeVisibleTypeAnnotations");
        }
        return c97312 != null ? iM22775 + c97312.m22775("RuntimeInvisibleTypeAnnotations") : iM22775;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22772(int i, C19738 c19738) {
        int i2 = 2;
        int i3 = 0;
        C9739 c9739 = null;
        for (C9739 c97310 = this; c97310 != null; c97310 = c97310.f26901) {
            c97310.mo22771();
            i2 += c97310.f26897.f60036;
            i3++;
            c9739 = c97310;
        }
        c19738.m44877(i);
        c19738.m44875(i2);
        c19738.m44877(i3);
        while (c9739 != null) {
            C19738 c19739 = c9739.f26897;
            c19738.m44872(0, c19739.f60036, c19739.f60035);
            c9739 = c9739.f26899;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22768(C8338 c8338, C9739 c9739, C9739 c97310, C9739 c97311, C9739 c97312, C19738 c19738) {
        if (c9739 != null) {
            c9739.m22772(c8338.m19265("RuntimeVisibleAnnotations"), c19738);
        }
        if (c97310 != null) {
            c97310.m22772(c8338.m19265("RuntimeInvisibleAnnotations"), c19738);
        }
        if (c97311 != null) {
            c97311.m22772(c8338.m19265("RuntimeVisibleTypeAnnotations"), c19738);
        }
        if (c97312 != null) {
            c97312.m22772(c8338.m19265("RuntimeInvisibleTypeAnnotations"), c19738);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m22763(String str, C9739[] c9739Arr, int i) {
        int iM22775 = (i * 2) + 7;
        for (int i2 = 0; i2 < i; i2++) {
            C9739 c9739 = c9739Arr[i2];
            iM22775 += c9739 == null ? 0 : c9739.m22775(str) - 8;
        }
        return iM22775;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22767(int i, C9739[] c9739Arr, int i2, C19738 c19738) {
        int iM22775 = (i2 * 2) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            C9739 c9739 = c9739Arr[i3];
            iM22775 += c9739 == null ? 0 : c9739.m22775(null) - 8;
        }
        c19738.m44877(i);
        c19738.m44875(iM22775);
        c19738.m44868(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            C9739 c97310 = null;
            for (C9739 c97311 = c9739Arr[i4]; c97311 != null; c97311 = c97311.f26901) {
                c97311.mo22771();
                i5++;
                c97310 = c97311;
            }
            c19738.m44877(i5);
            while (c97310 != null) {
                C19738 c19739 = c97310.f26897;
                c19738.m44872(0, c19739.f60036, c19739.f60035);
                c97310 = c97310.f26899;
            }
        }
    }
}
