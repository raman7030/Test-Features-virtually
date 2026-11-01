package p067l;

/* JADX INFO: renamed from: l.ۛ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAUC */
/* JADX INFO: loaded from: classes2.dex */
public final class C8338 {

    /* JADX INFO: renamed from: ֫ */
    public int f22292;

    /* JADX INFO: renamed from: ۖ */
    public int f22293;

    /* JADX INFO: renamed from: ۘ */
    public C14373[] f22294;

    /* JADX INFO: renamed from: ۜ */
    public int f22295;

    /* JADX INFO: renamed from: ۡ */
    public C12362[] f22296;

    /* JADX INFO: renamed from: ۢ */
    public C12362[] f22297;

    /* JADX INFO: renamed from: ۧ */
    public C19738 f22298;

    /* JADX INFO: renamed from: ܺ */
    public int f22300;

    /* JADX INFO: renamed from: ܽ */
    public String f22301;

    /* JADX INFO: renamed from: ᩳ */
    public final C9009 f22303;

    /* JADX INFO: renamed from: ᩷ */
    public int f22304;

    /* JADX INFO: renamed from: ᩻ */
    public C14373[] f22305 = new C14373[256];

    /* JADX INFO: renamed from: ܳ */
    public int f22299 = 1;

    /* JADX INFO: renamed from: ܿ */
    public C19738 f22302 = new C19738();

    public C8338(C9009 c9009) {
        this.f22303 = c9009;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m19262() {
        return this.f22300;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m19255() {
        return this.f22301;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m19254(int i, String str) {
        this.f22300 = i;
        this.f22301 = str;
        return m19235(7, str).f42967;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m19259() {
        return this.f22299;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m19264() {
        return this.f22302.f60036;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19258(C19738 c19738) {
        c19738.m44877(this.f22299);
        C19738 c19739 = this.f22302;
        c19738.m44872(0, c19739.f60036, c19739.f60035);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19237() {
        if (this.f22298 == null) {
            return 0;
        }
        m19265("BootstrapMethods");
        return this.f22298.f60036 + 8;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19253(C19738 c19738) {
        if (this.f22298 != null) {
            c19738.m44877(m19265("BootstrapMethods"));
            c19738.m44875(this.f22298.f60036 + 2);
            c19738.m44877(this.f22292);
            C19738 c19739 = this.f22298;
            c19738.m44872(0, c19739.f60036, c19739.f60035);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private C14373 m19236(int i) {
        C14373[] c14373Arr = this.f22305;
        return c14373Arr[i % c14373Arr.length];
    }

    /* JADX INFO: renamed from: ۧ */
    private void m19234(C14373 c14373) {
        int i = this.f22295;
        C14373[] c14373Arr = this.f22305;
        if (i > (c14373Arr.length * 3) / 4) {
            int length = c14373Arr.length;
            int i2 = (length * 2) + 1;
            C14373[] c14373Arr2 = new C14373[i2];
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                C14373 c14374 = this.f22305[length];
                while (c14374 != null) {
                    int i3 = c14374.f41081 % i2;
                    C14373 c14375 = c14374.f41082;
                    c14374.f41082 = c14373Arr2[i3];
                    c14373Arr2[i3] = c14374;
                    c14374 = c14375;
                }
            }
            this.f22305 = c14373Arr2;
        }
        this.f22295++;
        int i4 = c14373.f41081;
        C14373[] c14373Arr3 = this.f22305;
        int length2 = i4 % c14373Arr3.length;
        c14373.f41082 = c14373Arr3[length2];
        c14373Arr3[length2] = c14373;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19247(Object obj) {
        if (obj instanceof Integer) {
            return m19233(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m19233(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m19233(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m19233(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m19233(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m19243(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return m19230(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m19242(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return m19235(8, (String) obj);
        }
        if (obj instanceof C13703) {
            C13703 c13703 = (C13703) obj;
            int iM31155 = c13703.m31155();
            if (iM31155 == 10) {
                return m19235(7, c13703.m31156());
            }
            return iM31155 == 11 ? m19235(16, c13703.m31152()) : m19235(7, c13703.m31152());
        }
        if (obj instanceof C2973) {
            C2973 c2973 = (C2973) obj;
            return m19245(c2973.m4929(), c2973.m4927(), c2973.m4926(), c2973.m4925(), c2973.m4928());
        }
        if (!(obj instanceof C22421)) {
            throw new IllegalArgumentException("value ".concat(String.valueOf(obj)));
        }
        C22421 c22421 = (C22421) obj;
        return m19231(c22421.m50339(), 17, m19252(c22421.m50336(), c22421.m50338()).f42967, c22421.m50340());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19248(String str) {
        return m19235(7, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19249(String str, String str2, String str3) {
        return m19232(str, 9, str2, str3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19250(String str, String str2, String str3, boolean z) {
        return m19232(str, z ? 11 : 10, str2, str3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19244(int i) {
        return m19233(3, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19243(float f) {
        return m19233(4, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: ۧ */
    private C14373 m19233(int i, int i2) {
        int i3 = (i + i2) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(i3); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == i && c14373M19236.f41081 == i3 && c14373M19236.f42966 == i2) {
                return c14373M19236;
            }
        }
        C19738 c19738 = this.f22302;
        c19738.m44868(i);
        c19738.m44875(i2);
        int i4 = this.f22299;
        this.f22299 = i4 + 1;
        C14373 c14373 = new C14373(i4, i, i3, i2);
        m19234(c14373);
        return c14373;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19246(long j) {
        return m19230(5, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19242(double d) {
        return m19230(6, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: ֫ */
    private C14373 m19230(int i, long j) {
        int i2 = (((int) j) + i + ((int) (j >>> 32))) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(i2); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == i && c14373M19236.f41081 == i2 && c14373M19236.f42966 == j) {
                return c14373M19236;
            }
        }
        int i3 = this.f22299;
        C19738 c19738 = this.f22302;
        c19738.m44868(i);
        c19738.m44873(j);
        this.f22299 += 2;
        C14373 c14373 = new C14373(i3, i, i2, j);
        m19234(c14373);
        return c14373;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19251(String str, String str2, C2973 c2973, Object... objArr) {
        return m19231(str, 18, m19252(c2973, objArr).f42967, str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C14373 m19257(String str) {
        return m19235(19, str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C14373 m19261(String str) {
        return m19235(20, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19252(C2973 c2973, Object... objArr) {
        C19738 c19738 = this.f22298;
        if (c19738 == null) {
            c19738 = new C19738();
            this.f22298 = c19738;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = m19247(objArr[i]).f42967;
        }
        int i2 = c19738.f60036;
        c19738.m44877(m19245(c2973.m4929(), c2973.m4927(), c2973.m4926(), c2973.m4925(), c2973.m4928()).f42967);
        c19738.m44877(length);
        for (int i3 = 0; i3 < length; i3++) {
            c19738.m44877(iArr[i3]);
        }
        int i4 = c19738.f60036 - i2;
        int iHashCode = c2973.hashCode();
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
        }
        int i5 = iHashCode & Integer.MAX_VALUE;
        byte[] bArr = this.f22298.f60035;
        for (C14373 c14373M19236 = m19236(i5); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == 64 && c14373M19236.f41081 == i5) {
                int i6 = (int) c14373M19236.f42966;
                int i7 = 0;
                while (true) {
                    if (i7 < i4) {
                        if (bArr[i2 + i7] != bArr[i6 + i7]) {
                            break;
                        }
                        i7++;
                    } else {
                        this.f22298.f60036 = i2;
                        return c14373M19236;
                    }
                }
            }
        }
        int i8 = this.f22292;
        this.f22292 = i8 + 1;
        C14373 c14373 = new C14373(i8, 64, i5, i2);
        m19234(c14373);
        return c14373;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C14373 m19260(int i) {
        return this.f22294[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final C3644 m19256(int i) {
        return this.f22296[(int) this.f22294[i].f42966].f34490;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19238(int i, int i2) {
        long j;
        long j2;
        if (i < i2) {
            j = i;
            j2 = i2;
        } else {
            j = i2;
            j2 = i;
        }
        long j3 = j | (j2 << 32);
        int i3 = (i + i2 + 131) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(i3); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == 131 && c14373M19236.f41081 == i3 && c14373M19236.f42966 == j3) {
                return c14373M19236.f42969;
            }
        }
        C14373[] c14373Arr = this.f22294;
        String strReplace = c14373Arr[i].f42972;
        String str = c14373Arr[i2].f42972;
        ClassLoader classLoader = C9009.class.getClassLoader();
        try {
            Class<?> cls = Class.forName(strReplace.replace('/', '.'), false, classLoader);
            try {
                Class<?> cls2 = Class.forName(str.replace('/', '.'), false, classLoader);
                if (!cls.isAssignableFrom(cls2)) {
                    if (cls2.isAssignableFrom(cls)) {
                        strReplace = str;
                    } else if (cls.isInterface() || cls2.isInterface()) {
                        strReplace = "java/lang/Object";
                    } else {
                        do {
                            cls = cls.getSuperclass();
                        } while (!cls.isAssignableFrom(cls2));
                        strReplace = cls.getName().replace('.', '/');
                    }
                }
                int iM19263 = m19263(strReplace);
                C14373 c14373 = new C14373(this.f22293, 131, i3, j3);
                m19234(c14373);
                c14373.f42969 = iM19263;
                return iM19263;
            } catch (ClassNotFoundException e) {
                throw new TypeNotPresentException(str, e);
            }
        } catch (ClassNotFoundException e2) {
            throw new TypeNotPresentException(strReplace, e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m19229(C14373 c14373) {
        if (this.f22294 == null) {
            this.f22294 = new C14373[16];
        }
        int i = this.f22293;
        C14373[] c14373Arr = this.f22294;
        if (i == c14373Arr.length) {
            C14373[] c14373Arr2 = new C14373[c14373Arr.length * 2];
            System.arraycopy(c14373Arr, 0, c14373Arr2, 0, c14373Arr.length);
            this.f22294 = c14373Arr2;
        }
        C14373[] c14373Arr3 = this.f22294;
        int i2 = this.f22293;
        this.f22293 = i2 + 1;
        c14373Arr3[i2] = c14373;
        m19234(c14373);
        return c14373.f42967;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19241(C3644 c3644) {
        if (this.f22297 == null) {
            this.f22297 = new C12362[16];
            this.f22296 = new C12362[16];
        }
        int iIdentityHashCode = System.identityHashCode(c3644);
        C12362[] c12362Arr = this.f22297;
        C12362 c12362 = c12362Arr[iIdentityHashCode % c12362Arr.length];
        while (c12362 != null && c12362.f34490 != c3644) {
            c12362 = c12362.f34491;
        }
        if (c12362 == null) {
            int i = this.f22304;
            C12362[] c12362Arr2 = this.f22297;
            if (i > (c12362Arr2.length * 3) / 4) {
                int length = c12362Arr2.length;
                int i2 = (length * 2) + 1;
                C12362[] c12362Arr3 = new C12362[i2];
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    C12362 c12363 = this.f22297[length];
                    while (c12363 != null) {
                        int iIdentityHashCode2 = System.identityHashCode(c12363.f34490) % i2;
                        C12362 c12364 = c12363.f34491;
                        c12363.f34491 = c12362Arr3[iIdentityHashCode2];
                        c12362Arr3[iIdentityHashCode2] = c12363;
                        c12363 = c12364;
                    }
                }
                this.f22297 = c12362Arr3;
            }
            int i3 = this.f22304;
            C12362[] c12362Arr4 = this.f22296;
            if (i3 == c12362Arr4.length) {
                C12362[] c12362Arr5 = new C12362[c12362Arr4.length * 2];
                System.arraycopy(c12362Arr4, 0, c12362Arr5, 0, c12362Arr4.length);
                this.f22296 = c12362Arr5;
            }
            int i4 = this.f22304;
            c12362 = new C12362(i4, c3644);
            C12362[] c12362Arr6 = this.f22297;
            int length2 = iIdentityHashCode % c12362Arr6.length;
            c12362.f34491 = c12362Arr6[length2];
            c12362Arr6[length2] = c12362;
            C12362[] c12362Arr7 = this.f22296;
            this.f22304 = i4 + 1;
            c12362Arr7[i4] = c12362;
        }
        int i5 = c12362.f34489;
        int i6 = (i5 + 130) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(i6); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == 130 && c14373M19236.f41081 == i6 && c14373M19236.f42966 == i5 && c14373M19236.f42972.equals("")) {
                return c14373M19236.f42967;
            }
        }
        return m19229(new C14373(this.f22293, 130, i6, i5, ""));
    }

    /* JADX INFO: renamed from: ܽ */
    private C14373 m19235(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(iHashCode); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == i && c14373M19236.f41081 == iHashCode && c14373M19236.f42972.equals(str)) {
                return c14373M19236;
            }
        }
        this.f22302.m44878(i, m19265(str));
        int i2 = this.f22299;
        this.f22299 = i2 + 1;
        C14373 c14373 = new C14373(i2, i, iHashCode, str);
        m19234(c14373);
        return c14373;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m19263(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(iHashCode); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == 128 && c14373M19236.f41081 == iHashCode && c14373M19236.f42972.equals(str)) {
                return c14373M19236.f42967;
            }
        }
        return m19229(new C14373(this.f22293, 128, iHashCode, str));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m19265(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(iHashCode); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == 1 && c14373M19236.f41081 == iHashCode && c14373M19236.f42972.equals(str)) {
                return c14373M19236.f42967;
            }
        }
        C19738 c19738 = this.f22302;
        c19738.m44868(1);
        c19738.m44874(str);
        int i = this.f22299;
        this.f22299 = i + 1;
        m19234(new C14373(i, 1, iHashCode, str));
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19239(int i, String str) {
        int iHashCode = (str.hashCode() + 129 + i) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(iHashCode); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == 129 && c14373M19236.f41081 == iHashCode && c14373M19236.f42966 == i && c14373M19236.f42972.equals(str)) {
                return c14373M19236.f42967;
            }
        }
        return m19229(new C14373(this.f22293, 129, iHashCode, i, str));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19240(String str, String str2) {
        int iHashCode = ((str2.hashCode() * str.hashCode()) + 12) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(iHashCode); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == 12 && c14373M19236.f41081 == iHashCode && c14373M19236.f42971.equals(str) && c14373M19236.f42972.equals(str2)) {
                return c14373M19236.f42967;
            }
        }
        this.f22302.m44870(12, m19265(str), m19265(str2));
        int i = this.f22299;
        this.f22299 = i + 1;
        m19234(new C14373(str, i, iHashCode, str2));
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    private C14373 m19231(String str, int i, int i2, String str2) {
        int iM48630 = C21466.m48630(i2, 1, str2.hashCode() * str.hashCode(), i) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(iM48630); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == i && c14373M19236.f41081 == iM48630 && c14373M19236.f42966 == i2 && c14373M19236.f42971.equals(str) && c14373M19236.f42972.equals(str2)) {
                return c14373M19236;
            }
        }
        this.f22302.m44870(i, i2, m19240(str, str2));
        int i3 = this.f22299;
        this.f22299 = i3 + 1;
        C14373 c14373 = new C14373(i3, i, null, str, str2, i2, iM48630);
        m19234(c14373);
        return c14373;
    }

    /* JADX INFO: renamed from: ֫ */
    private C14373 m19232(String str, int i, String str2, String str3) {
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C14373 c14373M19236 = m19236(iHashCode); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == i && c14373M19236.f41081 == iHashCode && c14373M19236.f42970.equals(str) && c14373M19236.f42971.equals(str2) && c14373M19236.f42972.equals(str3)) {
                return c14373M19236;
            }
        }
        this.f22302.m44870(i, m19235(7, str).f42967, m19240(str2, str3));
        int i2 = this.f22299;
        this.f22299 = i2 + 1;
        C14373 c14373 = new C14373(i2, i, str, str2, str3, 0L, iHashCode);
        m19234(c14373);
        return c14373;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14373 m19245(int i, String str, String str2, String str3, boolean z) {
        int i2 = (i <= 4 || !z) ? i : i << 8;
        int iHashCode = Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode() * str.hashCode() * i2) + 15);
        for (C14373 c14373M19236 = m19236(iHashCode); c14373M19236 != null; c14373M19236 = c14373M19236.f41082) {
            if (c14373M19236.f42968 == 15 && c14373M19236.f41081 == iHashCode && c14373M19236.f42966 == i2 && c14373M19236.f42970.equals(str) && c14373M19236.f42971.equals(str2) && c14373M19236.f42972.equals(str3)) {
                return c14373M19236;
            }
        }
        C19738 c19738 = this.f22302;
        if (i <= 4) {
            c19738.m44876(i, m19232(str, 9, str2, str3).f42967);
        } else {
            c19738.m44876(i, m19250(str, str2, str3, z).f42967);
        }
        int i3 = this.f22299;
        this.f22299 = i3 + 1;
        C14373 c14373 = new C14373(i3, 15, str, str2, str3, i2, iHashCode);
        m19234(c14373);
        return c14373;
    }
}
