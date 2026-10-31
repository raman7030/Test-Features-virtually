package l;

import com.alipay.sdk.m.y.q;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۜ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6615 extends C1860 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f20349;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f20350;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f20351;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17904 f20352;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f20353;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Predicate f20354;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public EnumC15204 f20355;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f20356;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f20357;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f20358;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17198 f20359;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f20360;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20361;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public char[] f20362 = new char[32];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f20363;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f20364;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f20365;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f20366;

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ܿ۟ۚ] */
    public C6615(C3917 c3917) {
        C17904 c17904 = new C17904(0);
        this.f20352 = c17904;
        this.f20359 = new Predicate() { // from class: l.ܿ۟ۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C6615.m18123(this.f52738, (Integer) obj);
            }
        };
        this.f6339 = c3917;
        this.f20354 = c17904;
        this.f20361 = c3917.f12499.m37675();
        m18133();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m18123(C6615 c6615, Integer num) {
        boolean z = num.intValue() == 92 || num.intValue() == 58 || num.intValue() == 64;
        if (z) {
            c6615.m18121(92);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18131() {
        C17904 c17904 = this.f20352;
        try {
            this.f20354 = this.f20359;
            m18126();
        } finally {
            this.f20354 = c17904;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18126() {
        int[] iArr;
        this.f20364 = this.f20363;
        int i = 1;
        while (true) {
            m18133();
            iArr = C23548.f75603;
            if (iArr[this.f20355.ordinal()] != 1) {
                break;
            } else {
                i *= this.f20360;
            }
        }
        switch (iArr[this.f20355.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                this.f20353 = i;
                break;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18132(EnumC15204 enumC15204) {
        m18129(enumC15204);
        m18126();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18134(EnumC15204 enumC15204) {
        if (this.f20355 == EnumC15204.f46611 && this.f20350.equals(enumC15204.m35967())) {
            m18126();
        } else {
            this.f6339.m11951(this.f20363, "\"{0}\" token is expected", C21639.m48906(enumC15204, new StringBuilder("\""), "\""));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18128(List list, EnumC15204... enumC15204Arr) {
        boolean z;
        boolean zM18130 = m18130(enumC15204Arr);
        int i = 0;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (this.f20355 != EnumC15204.f46611) {
            z = false;
            break;
        }
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else {
                if (this.f20350.equals(strArr[i2])) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        if (zM18130 || z) {
            return;
        }
        this.f6339.mo9065(this.f20363, "One of {0} tokens is expected", String.format("[ %s,%s ]", (String) C5378.stream(list).map(new C23519(8)).collect(C22976.joining(",")), C22311.stream(enumC15204Arr).map(new C14375(i)).collect(C22976.joining(","))));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18130(EnumC15204... enumC15204Arr) {
        for (EnumC15204 enumC15204 : enumC15204Arr) {
            if (this.f20355 == enumC15204) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18129(EnumC15204 enumC15204) {
        EnumC15204 enumC15205 = this.f20355;
        if (enumC15205 != enumC15204) {
            EnumC15204 enumC15206 = EnumC15204.f46611;
            if (enumC15204 == enumC15206 && enumC15205.m35966()) {
                return;
            }
            this.f6339.m45778("expect: " + enumC15204 + " instead of " + this.f20355, new Object[0]);
            if (enumC15204 == enumC15206) {
                this.f6339.mo9065(this.f20363, "Jasm identifier expected", new Object[0]);
            } else {
                this.f6339.mo9065(this.f20363, "\"{0}\" token is expected", C21639.m48906(enumC15204, new StringBuilder("<"), ">"));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18121(int i) {
        int i2 = this.f20358;
        char[] cArr = this.f20362;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.f20362 = cArr2;
        }
        char[] cArr3 = this.f20362;
        int i3 = this.f20358;
        this.f20358 = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m18125() {
        int i = this.f20358;
        char[] cArr = new char[i];
        System.arraycopy(this.f20362, 0, cArr, 0, i);
        return new String(cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:67:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002c. Please report as an issue. */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m18124() {
        boolean z;
        int i = this.f20361;
        if (i == 46) {
            m18121(i);
            this.f20361 = this.f6339.f12499.m37675();
        }
        boolean z2 = false;
        while (true) {
            int i2 = this.f20361;
            if (i2 != 43 && i2 != 45) {
                switch (i2) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    case 56:
                    case 57:
                        m18121(i2);
                        this.f20361 = this.f6339.f12499.m37675();
                        break;
                    default:
                        switch (i2) {
                            case 68:
                                this.f20361 = this.f6339.f12499.m37675();
                                z = false;
                                break;
                            case 69:
                                if (z2) {
                                    m18121(i2);
                                    z2 = true;
                                    this.f20361 = this.f6339.f12499.m37675();
                                } else {
                                    z = false;
                                }
                                break;
                            case 70:
                                this.f20361 = this.f6339.f12499.m37675();
                                z = true;
                                break;
                            default:
                                switch (i2) {
                                    case 100:
                                        this.f20361 = this.f6339.f12499.m37675();
                                        z = false;
                                        break;
                                    case 101:
                                        if (z2) {
                                            m18121(i2);
                                            z2 = true;
                                            this.f20361 = this.f6339.f12499.m37675();
                                        } else {
                                            z = false;
                                        }
                                        break;
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                        this.f20361 = this.f6339.f12499.m37675();
                                        z = true;
                                        break;
                                    default:
                                        z = false;
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                char c = this.f20362[this.f20358 - 1];
                if (c == 'e' || c == 'E') {
                    m18121(i2);
                    this.f20361 = this.f6339.f12499.m37675();
                } else {
                    z = false;
                }
            }
            if (!Character.isLetterOrDigit(this.f20361) && this.f20361 != 46) {
                this.f20355 = z ? EnumC15204.f46522 : EnumC15204.f46627;
                try {
                    char c2 = this.f20362[this.f20358 - 1];
                    if (c2 == 'e' || c2 == 'E' || c2 == '+' || c2 == '-') {
                        C3917 c3917 = this.f6339;
                        c3917.mo9065(c3917.m11948() - 1, "Invalid floating point format", new Object[0]);
                        return;
                    }
                    if (z) {
                        float f = Float.parseFloat(m18125());
                        this.f20365 = f;
                        if (Float.isInfinite(f)) {
                            this.f6339.mo9065(this.f20363, "Numeric overflow", new Object[0]);
                            return;
                        }
                        return;
                    }
                    double d = Double.parseDouble(m18125());
                    this.f20366 = d;
                    if (Double.isInfinite(d)) {
                        this.f6339.mo9065(this.f20363, "Numeric overflow", new Object[0]);
                        this.f6339.mo9065(this.f20363, "Numeric overflow", new Object[0]);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    this.f6339.mo9065(this.f20363, "Invalid floating point format", new Object[0]);
                    this.f20366 = 0.0d;
                    this.f20365 = 0.0f;
                    return;
                }
            }
            C3917 c3918 = this.f6339;
            c3918.mo9065(c3918.m11948(), "Invalid character \"{0}\" in number", Character.toString((char) this.f20361));
            while (true) {
                int iM37675 = this.f6339.f12499.m37675();
                this.f20361 = iM37675;
                if (!Character.isLetterOrDigit(iM37675) && this.f20361 != 46) {
                    this.f20366 = 0.0d;
                    this.f20355 = EnumC15204.f46627;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18122(char[] cArr) {
        this.f20358 = 0;
        boolean z = true;
        if (cArr != null) {
            while (true) {
                for (char c : cArr) {
                    m18121(c);
                }
                int iM37675 = this.f6339.f12499.m37675();
                this.f20361 = iM37675;
                if (iM37675 != 92) {
                    break;
                }
                int iM37676 = this.f6339.f12499.m37675();
                this.f20361 = iM37676;
                if (iM37676 != 117) {
                    if (!this.f20354.test(Integer.valueOf(iM37676))) {
                        this.f6339.mo9065(this.f6339.m11948(), "Invalid escape character", new Object[0]);
                        break;
                    }
                    cArr = new char[]{(char) this.f20361};
                } else {
                    int iM37673 = this.f6339.f12499.m37673();
                    this.f20361 = iM37673;
                    if (Character.isLetterOrDigit(iM37673)) {
                        this.f6339.mo9065(this.f6339.m11948(), "Invalid escape character", new Object[0]);
                        break;
                    }
                    cArr = new char[]{(char) this.f20361};
                }
            }
        }
        int i = this.f20361;
        while (true) {
            m18121(this.f20361);
            int iM37677 = this.f6339.f12499.m37675();
            this.f20361 = iM37677;
            if (z && i == 64) {
                if (iM37677 == 84) {
                    m18121(iM37677);
                    this.f20361 = this.f6339.f12499.m37675();
                }
                int i2 = this.f20361;
                if (i2 == 43 || i2 == 45) {
                    m18121(i2);
                    this.f20361 = this.f6339.f12499.m37675();
                }
                String strM18125 = m18125();
                this.f20357 = strM18125;
                this.f20350 = strM18125;
                this.f20355 = EnumC15204.f46559;
                return;
            }
            if (!Character.isJavaIdentifierPart(iM37677)) {
                char[] cArr2 = {'-', '[', ']', '(', ')', '<', '>'};
                char c2 = (char) this.f20361;
                int i3 = 0;
                while (true) {
                    if (i3 >= 7) {
                        int i4 = this.f20361;
                        if (i4 == 47) {
                            int iM37674 = this.f6339.f12499.m37674();
                            if (iM37674 != 42 && iM37674 != 47) {
                                break;
                            } else {
                                break;
                            }
                        }
                        if (i4 == 92) {
                            int iM37678 = this.f6339.f12499.m37675();
                            this.f20361 = iM37678;
                            if (iM37678 == 117) {
                                int iM37679 = this.f6339.f12499.m37673();
                                this.f20361 = iM37679;
                                if (!Character.isLetterOrDigit(iM37679)) {
                                    break;
                                }
                                this.f6339.mo9065(this.f6339.m11948(), "Invalid escape character", new Object[0]);
                                break;
                            }
                            if (!this.f20354.test(Integer.valueOf(iM37678))) {
                                this.f6339.mo9065(this.f6339.m11948(), "Invalid escape character", new Object[0]);
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    if (cArr2[i3] == c2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z = false;
        }
        String strM18126 = m18125();
        this.f20357 = strM18126;
        this.f20350 = strM18126;
        EnumC15204 enumC15204 = (EnumC15204) EnumC15204.m35948(strM18126, EnumC19440.KEYWORD).orElse(EnumC15204.f46611);
        this.f20355 = enumC15204;
        C11003.toString(enumC15204);
    }

    /* JADX WARN: Code duplicated, block: B:306:0x062f  */
    /* JADX WARN: Code duplicated, block: B:310:0x0639  */
    /* JADX WARN: Code duplicated, block: B:314:0x0643  */
    /* JADX WARN: Code duplicated, block: B:315:0x0645  */
    /* JADX WARN: Code duplicated, block: B:319:0x0650  */
    /* JADX WARN: Code duplicated, block: B:443:0x0635 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0686 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18133() {
        int iM37675;
        int iM37676;
        int iM37677;
        long j;
        long j2;
        long j3;
        int iM37673;
        long j4;
        long j5;
        int i;
        char c;
        loop0: while (true) {
            this.f20363 = this.f6339.m11948();
            if (Character.isLetter(this.f20361)) {
                break;
            }
            char[] cArr = {'$', '_', '@', '[', ']', '(', ')', '<', '>'};
            char c2 = (char) this.f20361;
            for (int i2 = 0; i2 < 9; i2++) {
                if (cArr[i2] == c2) {
                    break loop0;
                }
            }
            int i3 = this.f20361;
            if (i3 == -1) {
                this.f20355 = EnumC15204.f46554;
                return;
            }
            if (i3 == 10 || i3 == 13 || i3 == 32 || i3 == 9 || i3 == 12) {
                this.f20361 = this.f6339.f12499.m37675();
            } else if (i3 == 47) {
                int iM37678 = this.f6339.f12499.m37675();
                this.f20361 = iM37678;
                if (iM37678 != 42) {
                    if (iM37678 != 47) {
                        this.f20355 = EnumC15204.f46445;
                        return;
                    }
                    do {
                        iM37675 = this.f6339.f12499.m37675();
                        this.f20361 = iM37675;
                        if (iM37675 == -1) {
                            break;
                        }
                    } while (iM37675 != 10);
                } else {
                    int iM37679 = this.f6339.f12499.m37675();
                    this.f20361 = iM37679;
                    if (iM37679 != 42) {
                        while (true) {
                            int i4 = this.f20361;
                            if (i4 == -1) {
                                this.f6339.mo9065(this.f20363, "Comment isn't terminated at the end of input", new Object[0]);
                                break;
                            } else if (i4 == 42) {
                                int iM376710 = this.f6339.f12499.m37675();
                                this.f20361 = iM376710;
                                if (iM376710 == 47) {
                                    this.f20361 = this.f6339.f12499.m37675();
                                    break;
                                }
                            } else {
                                this.f20361 = this.f6339.f12499.m37675();
                            }
                        }
                    } else {
                        this.f20358 = 0;
                        if (iM37679 == 42) {
                            do {
                                iM37677 = this.f6339.f12499.m37675();
                                this.f20361 = iM37677;
                            } while (iM37677 == 42);
                            if (iM37677 == 47) {
                                this.f20361 = this.f6339.f12499.m37675();
                            }
                        }
                        int i5 = this.f20361;
                        if (i5 == 10 || i5 == 32) {
                            this.f20361 = this.f6339.f12499.m37675();
                        }
                        int i6 = this.f20358;
                        while (true) {
                            boolean z = false;
                            while (true) {
                                int i7 = this.f20361;
                                if (i7 == -1) {
                                    this.f6339.mo9065(this.f20363, "Comment isn't terminated at the end of input", new Object[0]);
                                    m18125();
                                    break;
                                }
                                if (i7 != 32) {
                                    if (i7 != 42) {
                                        if (i7 != 9) {
                                            if (i7 != 10) {
                                                if (!z) {
                                                    z = true;
                                                }
                                                m18121(i7);
                                                this.f20361 = this.f6339.f12499.m37675();
                                                i6 = this.f20358;
                                            }
                                        }
                                    } else if (z) {
                                        int iM376711 = this.f6339.f12499.m37675();
                                        this.f20361 = iM376711;
                                        if (iM376711 == 47) {
                                            this.f20361 = this.f6339.f12499.m37675();
                                            this.f20358 = i6;
                                            m18125();
                                            break;
                                        }
                                        m18121(42);
                                    } else {
                                        this.f20358 = i6;
                                        do {
                                            iM37676 = this.f6339.f12499.m37675();
                                            this.f20361 = iM37676;
                                        } while (iM37676 == 42);
                                        if (iM37676 == 32) {
                                            this.f20361 = this.f6339.f12499.m37675();
                                        } else if (iM37676 == 47) {
                                            this.f20361 = this.f6339.f12499.m37675();
                                            this.f20358 = i6;
                                            m18125();
                                            break;
                                        }
                                        z = true;
                                    }
                                }
                                m18121(i7);
                                this.f20361 = this.f6339.f12499.m37675();
                            }
                            m18121(10);
                            this.f20361 = this.f6339.f12499.m37675();
                            i6 = this.f20358;
                        }
                    }
                }
            } else {
                int i8 = 34;
                if (i3 == 34) {
                    this.f20355 = EnumC15204.f46647;
                    this.f20358 = 0;
                    this.f20361 = this.f6339.f12499.m37675();
                    while (true) {
                        int i9 = this.f20361;
                        if (i9 == -1) {
                            this.f6339.mo9065(this.f20363, "String isn't terminated at the end of input", new Object[0]);
                            this.f20350 = m18125();
                            return;
                        }
                        if (i9 == 10) {
                            this.f20361 = this.f6339.f12499.m37675();
                            this.f6339.mo9065(this.f20363, "String isn't terminated at the end of line", new Object[0]);
                            this.f20350 = m18125();
                            return;
                        }
                        if (i9 == i8) {
                            this.f20361 = this.f6339.f12499.m37675();
                            this.f20350 = m18125();
                            return;
                        }
                        if (i9 != 92) {
                            m18121(i9);
                            this.f20361 = this.f6339.f12499.m37675();
                        } else {
                            long jM11948 = this.f6339.m11948();
                            int iM376712 = this.f6339.f12499.m37675();
                            this.f20361 = iM376712;
                            if (iM376712 == i8) {
                                j = 0;
                                this.f20361 = this.f6339.f12499.m37675();
                                j2 = 34;
                            } else if (iM376712 != 39) {
                                j2 = 92;
                                if (iM376712 == 92) {
                                    j = 0;
                                    this.f20361 = this.f6339.f12499.m37675();
                                } else if (iM376712 == 98) {
                                    j = 0;
                                    this.f20361 = this.f6339.f12499.m37675();
                                    j2 = 8;
                                } else if (iM376712 == 102) {
                                    j = 0;
                                    this.f20361 = this.f6339.f12499.m37675();
                                    j2 = 12;
                                } else if (iM376712 == 110) {
                                    this.f20361 = this.f6339.f12499.m37675();
                                    j = 0;
                                    j2 = 10;
                                } else if (iM376712 == 114) {
                                    j = 0;
                                    this.f20361 = this.f6339.f12499.m37675();
                                    j2 = 13;
                                } else if (iM376712 != 116) {
                                    if (iM376712 != 117) {
                                        switch (iM376712) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                iM37673 = iM376712 - 48;
                                                int i10 = 2;
                                                while (true) {
                                                    if (i10 <= 0) {
                                                        j3 = 0;
                                                        this.f20361 = this.f6339.f12499.m37675();
                                                        if (iM37673 > 255) {
                                                            this.f6339.mo9065(jM11948, "Invalid escape character", new Object[0]);
                                                        }
                                                        break;
                                                    } else {
                                                        j3 = 0;
                                                        int iM376713 = this.f6339.f12499.m37675();
                                                        this.f20361 = iM376713;
                                                        switch (iM376713) {
                                                            case 48:
                                                            case 49:
                                                            case 50:
                                                            case 51:
                                                            case 52:
                                                            case 53:
                                                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                                iM37673 = ((iM37673 << 3) + iM376713) - 48;
                                                                i10--;
                                                                break;
                                                            default:
                                                                if (iM37673 > 255) {
                                                                    this.f6339.mo9065(jM11948, "Invalid escape character", new Object[0]);
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                j = 0;
                                                break;
                                        }
                                    } else {
                                        j3 = 0;
                                        iM37673 = this.f6339.f12499.m37673();
                                        this.f20361 = this.f6339.f12499.m37675();
                                    }
                                    j2 = iM37673;
                                    j = j3;
                                } else {
                                    j = 0;
                                    this.f20361 = this.f6339.f12499.m37675();
                                    j2 = 9;
                                }
                            } else {
                                j = 0;
                                this.f20361 = this.f6339.f12499.m37675();
                                j2 = 39;
                            }
                            if (j2 >= j) {
                                m18121((char) j2);
                            }
                            i8 = 34;
                        }
                    }
                } else {
                    if (i3 == 45) {
                        this.f20360 = -1;
                        this.f20355 = EnumC15204.f46551;
                        this.f20361 = this.f6339.f12499.m37675();
                        return;
                    }
                    if (i3 == 43) {
                        this.f20360 = 1;
                        this.f20361 = this.f6339.f12499.m37675();
                        this.f20355 = EnumC15204.f46551;
                        return;
                    }
                    int i11 = 46;
                    if (i3 == 48 || i3 == 49 || i3 == 50 || i3 == 51 || i3 == 52 || i3 == 53 || i3 == 54 || i3 == 55 || i3 == 56 || i3 == 57) {
                        this.f20349 = i3 == 48 ? 8 : 10;
                        long lowerCase = i3 - 48;
                        this.f20358 = 0;
                        m18121(i3);
                        boolean z2 = false;
                        boolean z3 = false;
                        while (true) {
                            int iM376714 = this.f6339.f12499.m37675();
                            this.f20361 = iM376714;
                            if (iM376714 != i11) {
                                if (iM376714 != 76) {
                                    if (iM376714 != 88) {
                                        if (iM376714 != 108) {
                                            if (iM376714 != 120) {
                                                switch (iM376714) {
                                                    case 56:
                                                    case 57:
                                                        z3 = true;
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                        m18121(iM376714);
                                                        int i12 = this.f20349;
                                                        if (i12 == 10) {
                                                            boolean z4 = z2 || (lowerCase * 10) / 10 != lowerCase;
                                                            lowerCase = (lowerCase * 10) + ((long) (this.f20361 - 48));
                                                            z2 = z4 || lowerCase - 1 < -1;
                                                        } else {
                                                            if (i12 == 8) {
                                                                z2 = z2 || (lowerCase >>> 61) != 0;
                                                                j5 = lowerCase << 3;
                                                                i = this.f20361;
                                                            } else {
                                                                z2 = z2 || (lowerCase >>> 60) != 0;
                                                                j5 = lowerCase << 4;
                                                                i = this.f20361;
                                                            }
                                                            lowerCase = ((long) (i - 48)) + j5;
                                                        }
                                                        i11 = 46;
                                                        break;
                                                    default:
                                                        switch (iM376714) {
                                                            case 65:
                                                            case 66:
                                                            case 67:
                                                                c = '<';
                                                                m18121(iM376714);
                                                                if (this.f20349 != 16) {
                                                                    if (z2 && (lowerCase >>> c) == 0) {
                                                                        z2 = false;
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                    lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f20361))) - 97;
                                                                    i11 = 46;
                                                                }
                                                                break;
                                                            case 68:
                                                            case 69:
                                                            case 70:
                                                                c = '<';
                                                                if (this.f20349 != 16) {
                                                                    m18124();
                                                                    return;
                                                                }
                                                                m18121(iM376714);
                                                                if (this.f20349 != 16) {
                                                                    if (z2) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                    lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f20361))) - 97;
                                                                    i11 = 46;
                                                                }
                                                                break;
                                                            default:
                                                                switch (iM376714) {
                                                                    case 97:
                                                                    case 98:
                                                                    case q.f /* 99 */:
                                                                        c = '<';
                                                                        m18121(iM376714);
                                                                        if (this.f20349 != 16) {
                                                                            if (z2) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f20361))) - 97;
                                                                            i11 = 46;
                                                                        }
                                                                        break;
                                                                    case 100:
                                                                    case 101:
                                                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                                        c = '<';
                                                                        if (this.f20349 != 16) {
                                                                            m18124();
                                                                            return;
                                                                        }
                                                                        m18121(iM376714);
                                                                        if (this.f20349 != 16) {
                                                                            if (z2) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f20361))) - 97;
                                                                            i11 = 46;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        this.f20360 = (int) lowerCase;
                                                                        this.f20355 = EnumC15204.f46543;
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    if (this.f20358 == 1 && this.f20349 == 8) {
                                        this.f20349 = 16;
                                        i11 = 46;
                                    }
                                }
                                this.f20361 = this.f6339.f12499.m37675();
                                this.f20351 = lowerCase;
                                this.f20355 = EnumC15204.f46625;
                            } else if (this.f20349 != 16) {
                                m18124();
                                return;
                            }
                        }
                        if (!Character.isLetterOrDigit(this.f20361) && this.f20361 != 46) {
                            int i13 = this.f20349;
                            if (i13 == 8 && z3) {
                                this.f20360 = 0;
                                this.f20355 = EnumC15204.f46543;
                                C3917 c3917 = this.f6339;
                                c3917.mo9065(c3917.m11948(), "Invalid character in octal number", new Object[0]);
                                return;
                            }
                            if (z2) {
                                j4 = 0;
                            } else {
                                if (this.f20355 != EnumC15204.f46543) {
                                    return;
                                }
                                if (i13 == 10) {
                                    if (this.f20360 - 1 >= -1) {
                                        return;
                                    }
                                    j4 = 0;
                                } else {
                                    j4 = 0;
                                    if (((-4294967296L) & lowerCase) == 0) {
                                        return;
                                    }
                                }
                            }
                            this.f20360 = 0;
                            this.f20351 = j4;
                            this.f6339.mo9065(this.f20363, "Numeric overflow", new Object[0]);
                            return;
                        }
                        C3917 c3918 = this.f6339;
                        c3918.mo9065(c3918.m11948(), "Invalid character \"{0}\" in number", Character.toString((char) this.f20361));
                        while (true) {
                            int iM376715 = this.f6339.f12499.m37675();
                            this.f20361 = iM376715;
                            if (!Character.isLetterOrDigit(iM376715) && this.f20361 != 46) {
                                this.f20360 = 0;
                                this.f20355 = EnumC15204.f46543;
                                return;
                            }
                        }
                    } else {
                        if (i3 == 46) {
                            int iM376716 = this.f6339.f12499.m37675();
                            this.f20361 = iM376716;
                            switch (iM376716) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case 56:
                                case 57:
                                    this.f20358 = 0;
                                    m18121(46);
                                    m18124();
                                    return;
                                default:
                                    this.f20355 = EnumC15204.f46599;
                                    return;
                            }
                        }
                        if (i3 == 123) {
                            this.f20361 = this.f6339.f12499.m37675();
                            this.f20355 = EnumC15204.f46642;
                            return;
                        }
                        if (i3 == 125) {
                            this.f20361 = this.f6339.f12499.m37675();
                            this.f20355 = EnumC15204.f46442;
                            return;
                        }
                        if (i3 == 44) {
                            this.f20361 = this.f6339.f12499.m37675();
                            this.f20355 = EnumC15204.f46591;
                            return;
                        }
                        if (i3 == 59) {
                            this.f20361 = this.f6339.f12499.m37675();
                            this.f20355 = EnumC15204.f46479;
                            return;
                        }
                        if (i3 == 58) {
                            this.f20361 = this.f6339.f12499.m37675();
                            this.f20355 = EnumC15204.f46597;
                            return;
                        }
                        if (i3 == 61) {
                            int iM376717 = this.f6339.f12499.m37675();
                            this.f20361 = iM376717;
                            if (iM376717 != 61) {
                                this.f20355 = EnumC15204.f46608;
                                return;
                            } else {
                                this.f20361 = this.f6339.f12499.m37675();
                                this.f20355 = EnumC15204.f46548;
                                return;
                            }
                        }
                        if (i3 == 26) {
                            int iM376718 = this.f6339.f12499.m37675();
                            this.f20361 = iM376718;
                            if (iM376718 == -1) {
                                this.f20355 = EnumC15204.f46554;
                                return;
                            } else {
                                this.f6339.mo11949(this.f20364, "Invalid character with code {0} in input", Integer.valueOf(iM376718));
                                this.f20361 = this.f6339.f12499.m37675();
                            }
                        } else if (i3 == 35) {
                            if (this.f6339.f12499.m37674() == 123) {
                                this.f20361 = this.f6339.f12499.m37675();
                                this.f20355 = EnumC15204.f46594;
                                return;
                            }
                            int i14 = this.f20361;
                            int iM376719 = this.f6339.f12499.m37675();
                            this.f20361 = iM376719;
                            switch (iM376719) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case 56:
                                case 57:
                                    long j6 = iM376719 - 48;
                                    this.f20358 = 0;
                                    m18121(iM376719);
                                    while (true) {
                                        boolean z5 = false;
                                        while (true) {
                                            int iM376720 = this.f6339.f12499.m37675();
                                            this.f20361 = iM376720;
                                            switch (iM376720) {
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                case 56:
                                                case 57:
                                                    m18121(iM376720);
                                                    if (!z5) {
                                                        j6 = (j6 * 10) + ((long) (this.f20361 - 48));
                                                        if (j6 > 65535) {
                                                            z5 = true;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    this.f20360 = (int) j6;
                                                    this.f20350 = m18125();
                                                    this.f20355 = EnumC15204.f46579;
                                                    if (z5) {
                                                        this.f6339.mo9065(this.f20363, "Numeric overflow", new Object[0]);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    this.f20350 = Character.toString((char) i14);
                                    C3917 c3919 = this.f6339;
                                    c3919.m11951(c3919.m11948(), "Invalid character \"{0}\" in number", this.f20350);
                                    throw null;
                            }
                        } else if (i3 == 92) {
                            int iM376721 = this.f6339.f12499.m37675();
                            this.f20361 = iM376721;
                            if (iM376721 == 117) {
                                int iM37674 = this.f6339.f12499.m37673();
                                this.f20361 = iM37674;
                                if (Character.isLetterOrDigit(iM37674) && !Character.isDigit(this.f20361)) {
                                    m18122((char[]) null);
                                    return;
                                }
                            } else if (this.f20354.test(Integer.valueOf(iM376721))) {
                                m18122(new char[]{'\\', (char) this.f20361});
                                return;
                            }
                            final long jM11945 = this.f6339.m11945(this.f20363);
                            final long jM14623 = ((C5080) this.f6339.m45770()).m14623(jM11945, this.f20363);
                            this.f6339.m45762(new Supplier() { // from class: l.ۧ۟ۚ
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return String.format("Funny char with code='%c' at %d:%d", Integer.valueOf(this.f32600.f20361), Long.valueOf(jM11945), Long.valueOf(jM14623));
                                }
                            });
                            this.f6339.mo11949(this.f20363, "Invalid character with code {0} in input", Integer.valueOf(this.f20361));
                            this.f20361 = this.f6339.f12499.m37675();
                        } else {
                            final long jM11946 = this.f6339.m11945(this.f20363);
                            final long jM14624 = ((C5080) this.f6339.m45770()).m14623(jM11946, this.f20363);
                            this.f6339.m45762(new Supplier() { // from class: l.ܽ۟ۚ
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return String.format("Funny char with code='%c' at %d:%d", Integer.valueOf(this.f50685.f20361), Long.valueOf(jM11946), Long.valueOf(jM14624));
                                }
                            });
                            this.f6339.mo11949(this.f20363, "Invalid character with code {0} in input", Integer.valueOf(this.f20361));
                            this.f20361 = this.f6339.f12499.m37675();
                        }
                    }
                }
            }
        }
        m18122((char[]) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18127(String str) {
        if (this.f6339.m45768()) {
            EnumC15204 enumC15204 = this.f20355;
            if (enumC15204 == null) {
                this.f6339.m45778(str.concat("<<<NULL TOKEN>>>"), new Object[0]);
                return;
            }
            this.f6339.m45775(str.concat(enumC15204.toString()), new Object[0]);
            int i = C23548.f75603[this.f20355.ordinal()];
            if (i == 2) {
                this.f6339.m45778(" = {intValue}: " + this.f20360, new Object[0]);
                return;
            }
            if (i == 4) {
                this.f6339.m45778(" = {floatValue}: " + this.f20365, new Object[0]);
                return;
            }
            if (i == 5) {
                this.f6339.m45778(" = {doubleValue}: " + this.f20366, new Object[0]);
                return;
            }
            if (i != 8) {
                if (i != 9) {
                    this.f6339.m45778("", new Object[0]);
                    return;
                } else {
                    this.f6339.m45778(C9045.m23341(new StringBuilder(" = {stringValue}: \""), this.f20350, "\""), new Object[0]);
                    return;
                }
            }
            C3917 c3917 = this.f6339;
            StringBuilder sb = new StringBuilder(" = '");
            sb.append(this.f20350);
            sb.append("' {idValue = '");
            c3917.m45778(C9045.m23341(sb, this.f20357, "'}"), new Object[0]);
        }
    }
}
