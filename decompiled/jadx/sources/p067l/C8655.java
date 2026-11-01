package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۜ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8655 extends C4136 {

    /* JADX INFO: renamed from: ֡ */
    public int f23226;

    /* JADX INFO: renamed from: ֨ */
    public String f23227;

    /* JADX INFO: renamed from: ۖ */
    public long f23228;

    /* JADX INFO: renamed from: ۘ */
    public final C19384 f23229;

    /* JADX INFO: renamed from: ۚ */
    public int f23230;

    /* JADX INFO: renamed from: ۜ */
    public Predicate f23231;

    /* JADX INFO: renamed from: ۠ */
    public EnumC16818 f23232;

    /* JADX INFO: renamed from: ۡ */
    public boolean f23233;

    /* JADX INFO: renamed from: ۢ */
    public String f23234;

    /* JADX INFO: renamed from: ܳ */
    public int f23235;

    /* JADX INFO: renamed from: ܶ */
    public final C18713 f23236;

    /* JADX INFO: renamed from: ܺ */
    public int f23237;

    /* JADX INFO: renamed from: ܿ */
    public int f23238;

    /* JADX INFO: renamed from: ᩳ */
    public char[] f23239 = new char[32];

    /* JADX INFO: renamed from: ᩴ */
    public long f23240;

    /* JADX INFO: renamed from: ᩵ */
    public long f23241;

    /* JADX INFO: renamed from: ᩷ */
    public float f23242;

    /* JADX INFO: renamed from: ᩻ */
    public double f23243;

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ܿ۟ۚ] */
    public C8655(C6091 c6091) {
        C19384 c19384 = new C19384(0);
        this.f23229 = c19384;
        this.f23236 = new Predicate() { // from class: l.ܿ۟ۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m42707or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C8655.m20075(this.f55919, (Integer) obj);
            }
        };
        this.f9120 = c6091;
        this.f23231 = c19384;
        this.f23238 = c6091.f15307.m39849();
        m20085();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m20075(C8655 c8655, Integer num) {
        boolean z = num.intValue() == 92 || num.intValue() == 58 || num.intValue() == 64;
        if (z) {
            c8655.m20073(92);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20083() {
        C19384 c19384 = this.f23229;
        try {
            this.f23231 = this.f23236;
            m20078();
        } finally {
            this.f23231 = c19384;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20078() {
        int[] iArr;
        this.f23241 = this.f23240;
        int i = 1;
        while (true) {
            m20085();
            iArr = C24748.f78349;
            if (iArr[this.f23232.ordinal()] != 1) {
                break;
            } else {
                i *= this.f23237;
            }
        }
        switch (iArr[this.f23232.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                this.f23230 = i;
                break;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20084(EnumC16818 enumC16818) {
        m20081(enumC16818);
        m20078();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20086(EnumC16818 enumC16818) {
        if (this.f23232 == EnumC16818.f49736 && this.f23227.equals(enumC16818.m38127())) {
            m20078();
        } else {
            this.f9120.m13871(this.f23240, "\"{0}\" token is expected", C22934.m51254(enumC16818, new StringBuilder("\""), "\""));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20080(List list, EnumC16818... enumC16818Arr) {
        boolean z;
        boolean zM20082 = m20082(enumC16818Arr);
        int i = 0;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (this.f23232 != EnumC16818.f49736) {
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
                if (this.f23227.equals(strArr[i2])) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        if (zM20082 || z) {
            return;
        }
        this.f9120.mo11117(this.f23240, "One of {0} tokens is expected", String.format("[ %s,%s ]", (String) C7480.stream(list).map(new C24721(8)).collect(C24205.joining(",")), C23573.stream(enumC16818Arr).map(new C16030(i)).collect(C24205.joining(","))));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20082(EnumC16818... enumC16818Arr) {
        for (EnumC16818 enumC16818 : enumC16818Arr) {
            if (this.f23232 == enumC16818) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20081(EnumC16818 enumC16818) {
        EnumC16818 enumC16819 = this.f23232;
        if (enumC16819 != enumC16818) {
            EnumC16818 enumC168110 = EnumC16818.f49736;
            if (enumC16818 == enumC168110 && enumC16819.m38126()) {
                return;
            }
            this.f9120.m48090("expect: " + enumC16818 + " instead of " + this.f23232, new Object[0]);
            if (enumC16818 == enumC168110) {
                this.f9120.mo11117(this.f23240, "Jasm identifier expected", new Object[0]);
            } else {
                this.f9120.mo11117(this.f23240, "\"{0}\" token is expected", C22934.m51254(enumC16818, new StringBuilder("<"), ">"));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20073(int i) {
        int i2 = this.f23235;
        char[] cArr = this.f23239;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.f23239 = cArr2;
        }
        char[] cArr3 = this.f23239;
        int i3 = this.f23235;
        this.f23235 = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* JADX INFO: renamed from: ᩳ */
    private String m20077() {
        int i = this.f23235;
        char[] cArr = new char[i];
        System.arraycopy(this.f23239, 0, cArr, 0, i);
        return new String(cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:67:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002c. Please report as an issue. */
    /* JADX INFO: renamed from: ܿ */
    private void m20076() {
        boolean z;
        int i = this.f23238;
        if (i == 46) {
            m20073(i);
            this.f23238 = this.f9120.f15307.m39849();
        }
        boolean z2 = false;
        while (true) {
            int i2 = this.f23238;
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
                        m20073(i2);
                        this.f23238 = this.f9120.f15307.m39849();
                        break;
                    default:
                        switch (i2) {
                            case 68:
                                this.f23238 = this.f9120.f15307.m39849();
                                z = false;
                                break;
                            case 69:
                                if (z2) {
                                    m20073(i2);
                                    z2 = true;
                                    this.f23238 = this.f9120.f15307.m39849();
                                } else {
                                    z = false;
                                }
                                break;
                            case 70:
                                this.f23238 = this.f9120.f15307.m39849();
                                z = true;
                                break;
                            default:
                                switch (i2) {
                                    case 100:
                                        this.f23238 = this.f9120.f15307.m39849();
                                        z = false;
                                        break;
                                    case 101:
                                        if (z2) {
                                            m20073(i2);
                                            z2 = true;
                                            this.f23238 = this.f9120.f15307.m39849();
                                        } else {
                                            z = false;
                                        }
                                        break;
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                        this.f23238 = this.f9120.f15307.m39849();
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
                char c = this.f23239[this.f23235 - 1];
                if (c == 'e' || c == 'E') {
                    m20073(i2);
                    this.f23238 = this.f9120.f15307.m39849();
                } else {
                    z = false;
                }
            }
            if (!Character.isLetterOrDigit(this.f23238) && this.f23238 != 46) {
                this.f23232 = z ? EnumC16818.f49647 : EnumC16818.f49752;
                try {
                    char c2 = this.f23239[this.f23235 - 1];
                    if (c2 == 'e' || c2 == 'E' || c2 == '+' || c2 == '-') {
                        C6091 c6091 = this.f9120;
                        c6091.mo11117(c6091.m13868() - 1, "Invalid floating point format", new Object[0]);
                        return;
                    }
                    if (z) {
                        float f = Float.parseFloat(m20077());
                        this.f23242 = f;
                        if (Float.isInfinite(f)) {
                            this.f9120.mo11117(this.f23240, "Numeric overflow", new Object[0]);
                            return;
                        }
                        return;
                    }
                    double d = Double.parseDouble(m20077());
                    this.f23243 = d;
                    if (Double.isInfinite(d)) {
                        this.f9120.mo11117(this.f23240, "Numeric overflow", new Object[0]);
                        this.f9120.mo11117(this.f23240, "Numeric overflow", new Object[0]);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    this.f9120.mo11117(this.f23240, "Invalid floating point format", new Object[0]);
                    this.f23243 = 0.0d;
                    this.f23242 = 0.0f;
                    return;
                }
            }
            C6091 c6092 = this.f9120;
            c6092.mo11117(c6092.m13868(), "Invalid character \"{0}\" in number", Character.toString((char) this.f23238));
            while (true) {
                int iM39849 = this.f9120.f15307.m39849();
                this.f23238 = iM39849;
                if (!Character.isLetterOrDigit(iM39849) && this.f23238 != 46) {
                    this.f23243 = 0.0d;
                    this.f23232 = EnumC16818.f49752;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20074(char[] cArr) {
        this.f23235 = 0;
        boolean z = true;
        if (cArr != null) {
            while (true) {
                for (char c : cArr) {
                    m20073(c);
                }
                int iM39849 = this.f9120.f15307.m39849();
                this.f23238 = iM39849;
                if (iM39849 != 92) {
                    break;
                }
                int iM398410 = this.f9120.f15307.m39849();
                this.f23238 = iM398410;
                if (iM398410 != 117) {
                    if (!this.f23231.test(Integer.valueOf(iM398410))) {
                        this.f9120.mo11117(this.f9120.m13868(), "Invalid escape character", new Object[0]);
                        break;
                    }
                    cArr = new char[]{(char) this.f23238};
                } else {
                    int iM39847 = this.f9120.f15307.m39847();
                    this.f23238 = iM39847;
                    if (Character.isLetterOrDigit(iM39847)) {
                        this.f9120.mo11117(this.f9120.m13868(), "Invalid escape character", new Object[0]);
                        break;
                    }
                    cArr = new char[]{(char) this.f23238};
                }
            }
        }
        int i = this.f23238;
        while (true) {
            m20073(this.f23238);
            int iM398411 = this.f9120.f15307.m39849();
            this.f23238 = iM398411;
            if (z && i == 64) {
                if (iM398411 == 84) {
                    m20073(iM398411);
                    this.f23238 = this.f9120.f15307.m39849();
                }
                int i2 = this.f23238;
                if (i2 == 43 || i2 == 45) {
                    m20073(i2);
                    this.f23238 = this.f9120.f15307.m39849();
                }
                String strM20077 = m20077();
                this.f23234 = strM20077;
                this.f23227 = strM20077;
                this.f23232 = EnumC16818.f49684;
                return;
            }
            if (!Character.isJavaIdentifierPart(iM398411)) {
                char[] cArr2 = {'-', '[', ']', '(', ')', '<', '>'};
                char c2 = (char) this.f23238;
                int i3 = 0;
                while (true) {
                    if (i3 >= 7) {
                        int i4 = this.f23238;
                        if (i4 == 47) {
                            int iM39848 = this.f9120.f15307.m39848();
                            if (iM39848 != 42 && iM39848 != 47) {
                                break;
                            } else {
                                break;
                            }
                        }
                        if (i4 == 92) {
                            int iM398412 = this.f9120.f15307.m39849();
                            this.f23238 = iM398412;
                            if (iM398412 == 117) {
                                int iM398413 = this.f9120.f15307.m39847();
                                this.f23238 = iM398413;
                                if (!Character.isLetterOrDigit(iM398413)) {
                                    break;
                                }
                                this.f9120.mo11117(this.f9120.m13868(), "Invalid escape character", new Object[0]);
                                break;
                            }
                            if (!this.f23231.test(Integer.valueOf(iM398412))) {
                                this.f9120.mo11117(this.f9120.m13868(), "Invalid escape character", new Object[0]);
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
        String strM20078 = m20077();
        this.f23234 = strM20078;
        this.f23227 = strM20078;
        EnumC16818 enumC16818 = (EnumC16818) EnumC16818.m38108(strM20078, EnumC20844.KEYWORD).orElse(EnumC16818.f49736);
        this.f23232 = enumC16818;
        C12826.toString(enumC16818);
    }

    /* JADX WARN: Code duplicated, block: B:306:0x062f  */
    /* JADX WARN: Code duplicated, block: B:310:0x0639  */
    /* JADX WARN: Code duplicated, block: B:314:0x0643  */
    /* JADX WARN: Code duplicated, block: B:315:0x0645  */
    /* JADX WARN: Code duplicated, block: B:319:0x0650  */
    /* JADX WARN: Code duplicated, block: B:443:0x0635 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0686 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ */
    public final void m20085() {
        int iM39849;
        int iM398410;
        int iM398411;
        long j;
        long j2;
        long j3;
        int iM39847;
        long j4;
        long j5;
        int i;
        char c;
        loop0: while (true) {
            this.f23240 = this.f9120.m13868();
            if (Character.isLetter(this.f23238)) {
                break;
            }
            char[] cArr = {'$', '_', '@', '[', ']', '(', ')', '<', '>'};
            char c2 = (char) this.f23238;
            for (int i2 = 0; i2 < 9; i2++) {
                if (cArr[i2] == c2) {
                    break loop0;
                }
            }
            int i3 = this.f23238;
            if (i3 == -1) {
                this.f23232 = EnumC16818.f49679;
                return;
            }
            if (i3 == 10 || i3 == 13 || i3 == 32 || i3 == 9 || i3 == 12) {
                this.f23238 = this.f9120.f15307.m39849();
            } else if (i3 == 47) {
                int iM398412 = this.f9120.f15307.m39849();
                this.f23238 = iM398412;
                if (iM398412 != 42) {
                    if (iM398412 != 47) {
                        this.f23232 = EnumC16818.f49570;
                        return;
                    }
                    do {
                        iM39849 = this.f9120.f15307.m39849();
                        this.f23238 = iM39849;
                        if (iM39849 == -1) {
                            break;
                        }
                    } while (iM39849 != 10);
                } else {
                    int iM398413 = this.f9120.f15307.m39849();
                    this.f23238 = iM398413;
                    if (iM398413 != 42) {
                        while (true) {
                            int i4 = this.f23238;
                            if (i4 == -1) {
                                this.f9120.mo11117(this.f23240, "Comment isn't terminated at the end of input", new Object[0]);
                                break;
                            } else if (i4 == 42) {
                                int iM398414 = this.f9120.f15307.m39849();
                                this.f23238 = iM398414;
                                if (iM398414 == 47) {
                                    this.f23238 = this.f9120.f15307.m39849();
                                    break;
                                }
                            } else {
                                this.f23238 = this.f9120.f15307.m39849();
                            }
                        }
                    } else {
                        this.f23235 = 0;
                        if (iM398413 == 42) {
                            do {
                                iM398411 = this.f9120.f15307.m39849();
                                this.f23238 = iM398411;
                            } while (iM398411 == 42);
                            if (iM398411 == 47) {
                                this.f23238 = this.f9120.f15307.m39849();
                            }
                        }
                        int i5 = this.f23238;
                        if (i5 == 10 || i5 == 32) {
                            this.f23238 = this.f9120.f15307.m39849();
                        }
                        int i6 = this.f23235;
                        while (true) {
                            boolean z = false;
                            while (true) {
                                int i7 = this.f23238;
                                if (i7 == -1) {
                                    this.f9120.mo11117(this.f23240, "Comment isn't terminated at the end of input", new Object[0]);
                                    m20077();
                                    break;
                                }
                                if (i7 != 32) {
                                    if (i7 != 42) {
                                        if (i7 != 9) {
                                            if (i7 != 10) {
                                                if (!z) {
                                                    z = true;
                                                }
                                                m20073(i7);
                                                this.f23238 = this.f9120.f15307.m39849();
                                                i6 = this.f23235;
                                            }
                                        }
                                    } else if (z) {
                                        int iM398415 = this.f9120.f15307.m39849();
                                        this.f23238 = iM398415;
                                        if (iM398415 == 47) {
                                            this.f23238 = this.f9120.f15307.m39849();
                                            this.f23235 = i6;
                                            m20077();
                                            break;
                                        }
                                        m20073(42);
                                    } else {
                                        this.f23235 = i6;
                                        do {
                                            iM398410 = this.f9120.f15307.m39849();
                                            this.f23238 = iM398410;
                                        } while (iM398410 == 42);
                                        if (iM398410 == 32) {
                                            this.f23238 = this.f9120.f15307.m39849();
                                        } else if (iM398410 == 47) {
                                            this.f23238 = this.f9120.f15307.m39849();
                                            this.f23235 = i6;
                                            m20077();
                                            break;
                                        }
                                        z = true;
                                    }
                                }
                                m20073(i7);
                                this.f23238 = this.f9120.f15307.m39849();
                            }
                            m20073(10);
                            this.f23238 = this.f9120.f15307.m39849();
                            i6 = this.f23235;
                        }
                    }
                }
            } else {
                int i8 = 34;
                if (i3 == 34) {
                    this.f23232 = EnumC16818.f49772;
                    this.f23235 = 0;
                    this.f23238 = this.f9120.f15307.m39849();
                    while (true) {
                        int i9 = this.f23238;
                        if (i9 == -1) {
                            this.f9120.mo11117(this.f23240, "String isn't terminated at the end of input", new Object[0]);
                            this.f23227 = m20077();
                            return;
                        }
                        if (i9 == 10) {
                            this.f23238 = this.f9120.f15307.m39849();
                            this.f9120.mo11117(this.f23240, "String isn't terminated at the end of line", new Object[0]);
                            this.f23227 = m20077();
                            return;
                        }
                        if (i9 == i8) {
                            this.f23238 = this.f9120.f15307.m39849();
                            this.f23227 = m20077();
                            return;
                        }
                        if (i9 != 92) {
                            m20073(i9);
                            this.f23238 = this.f9120.f15307.m39849();
                        } else {
                            long jM13868 = this.f9120.m13868();
                            int iM398416 = this.f9120.f15307.m39849();
                            this.f23238 = iM398416;
                            if (iM398416 == i8) {
                                j = 0;
                                this.f23238 = this.f9120.f15307.m39849();
                                j2 = 34;
                            } else if (iM398416 != 39) {
                                j2 = 92;
                                if (iM398416 == 92) {
                                    j = 0;
                                    this.f23238 = this.f9120.f15307.m39849();
                                } else if (iM398416 == 98) {
                                    j = 0;
                                    this.f23238 = this.f9120.f15307.m39849();
                                    j2 = 8;
                                } else if (iM398416 == 102) {
                                    j = 0;
                                    this.f23238 = this.f9120.f15307.m39849();
                                    j2 = 12;
                                } else if (iM398416 == 110) {
                                    this.f23238 = this.f9120.f15307.m39849();
                                    j = 0;
                                    j2 = 10;
                                } else if (iM398416 == 114) {
                                    j = 0;
                                    this.f23238 = this.f9120.f15307.m39849();
                                    j2 = 13;
                                } else if (iM398416 != 116) {
                                    if (iM398416 != 117) {
                                        switch (iM398416) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                iM39847 = iM398416 - 48;
                                                int i10 = 2;
                                                while (true) {
                                                    if (i10 <= 0) {
                                                        j3 = 0;
                                                        this.f23238 = this.f9120.f15307.m39849();
                                                        if (iM39847 > 255) {
                                                            this.f9120.mo11117(jM13868, "Invalid escape character", new Object[0]);
                                                        }
                                                        break;
                                                    } else {
                                                        j3 = 0;
                                                        int iM398417 = this.f9120.f15307.m39849();
                                                        this.f23238 = iM398417;
                                                        switch (iM398417) {
                                                            case 48:
                                                            case 49:
                                                            case 50:
                                                            case 51:
                                                            case 52:
                                                            case 53:
                                                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                                iM39847 = ((iM39847 << 3) + iM398417) - 48;
                                                                i10--;
                                                                break;
                                                            default:
                                                                if (iM39847 > 255) {
                                                                    this.f9120.mo11117(jM13868, "Invalid escape character", new Object[0]);
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
                                        iM39847 = this.f9120.f15307.m39847();
                                        this.f23238 = this.f9120.f15307.m39849();
                                    }
                                    j2 = iM39847;
                                    j = j3;
                                } else {
                                    j = 0;
                                    this.f23238 = this.f9120.f15307.m39849();
                                    j2 = 9;
                                }
                            } else {
                                j = 0;
                                this.f23238 = this.f9120.f15307.m39849();
                                j2 = 39;
                            }
                            if (j2 >= j) {
                                m20073((char) j2);
                            }
                            i8 = 34;
                        }
                    }
                } else {
                    if (i3 == 45) {
                        this.f23237 = -1;
                        this.f23232 = EnumC16818.f49676;
                        this.f23238 = this.f9120.f15307.m39849();
                        return;
                    }
                    if (i3 == 43) {
                        this.f23237 = 1;
                        this.f23238 = this.f9120.f15307.m39849();
                        this.f23232 = EnumC16818.f49676;
                        return;
                    }
                    int i11 = 46;
                    if (i3 == 48 || i3 == 49 || i3 == 50 || i3 == 51 || i3 == 52 || i3 == 53 || i3 == 54 || i3 == 55 || i3 == 56 || i3 == 57) {
                        this.f23226 = i3 == 48 ? 8 : 10;
                        long lowerCase = i3 - 48;
                        this.f23235 = 0;
                        m20073(i3);
                        boolean z2 = false;
                        boolean z3 = false;
                        while (true) {
                            int iM398418 = this.f9120.f15307.m39849();
                            this.f23238 = iM398418;
                            if (iM398418 != i11) {
                                if (iM398418 != 76) {
                                    if (iM398418 != 88) {
                                        if (iM398418 != 108) {
                                            if (iM398418 != 120) {
                                                switch (iM398418) {
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
                                                        m20073(iM398418);
                                                        int i12 = this.f23226;
                                                        if (i12 == 10) {
                                                            boolean z4 = z2 || (lowerCase * 10) / 10 != lowerCase;
                                                            lowerCase = (lowerCase * 10) + ((long) (this.f23238 - 48));
                                                            z2 = z4 || lowerCase - 1 < -1;
                                                        } else {
                                                            if (i12 == 8) {
                                                                z2 = z2 || (lowerCase >>> 61) != 0;
                                                                j5 = lowerCase << 3;
                                                                i = this.f23238;
                                                            } else {
                                                                z2 = z2 || (lowerCase >>> 60) != 0;
                                                                j5 = lowerCase << 4;
                                                                i = this.f23238;
                                                            }
                                                            lowerCase = ((long) (i - 48)) + j5;
                                                        }
                                                        i11 = 46;
                                                        break;
                                                    default:
                                                        switch (iM398418) {
                                                            case 65:
                                                            case 66:
                                                            case 67:
                                                                c = '<';
                                                                m20073(iM398418);
                                                                if (this.f23226 != 16) {
                                                                    if (z2 && (lowerCase >>> c) == 0) {
                                                                        z2 = false;
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                    lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f23238))) - 97;
                                                                    i11 = 46;
                                                                }
                                                                break;
                                                            case 68:
                                                            case 69:
                                                            case 70:
                                                                c = '<';
                                                                if (this.f23226 != 16) {
                                                                    m20076();
                                                                    return;
                                                                }
                                                                m20073(iM398418);
                                                                if (this.f23226 != 16) {
                                                                    if (z2) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                    lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f23238))) - 97;
                                                                    i11 = 46;
                                                                }
                                                                break;
                                                            default:
                                                                switch (iM398418) {
                                                                    case 97:
                                                                    case 98:
                                                                    case C0254q.f1216f /* 99 */:
                                                                        c = '<';
                                                                        m20073(iM398418);
                                                                        if (this.f23226 != 16) {
                                                                            if (z2) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f23238))) - 97;
                                                                            i11 = 46;
                                                                        }
                                                                        break;
                                                                    case 100:
                                                                    case 101:
                                                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                                        c = '<';
                                                                        if (this.f23226 != 16) {
                                                                            m20076();
                                                                            return;
                                                                        }
                                                                        m20073(iM398418);
                                                                        if (this.f23226 != 16) {
                                                                            if (z2) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f23238))) - 97;
                                                                            i11 = 46;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        this.f23237 = (int) lowerCase;
                                                                        this.f23232 = EnumC16818.f49668;
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    if (this.f23235 == 1 && this.f23226 == 8) {
                                        this.f23226 = 16;
                                        i11 = 46;
                                    }
                                }
                                this.f23238 = this.f9120.f15307.m39849();
                                this.f23228 = lowerCase;
                                this.f23232 = EnumC16818.f49750;
                            } else if (this.f23226 != 16) {
                                m20076();
                                return;
                            }
                        }
                        if (!Character.isLetterOrDigit(this.f23238) && this.f23238 != 46) {
                            int i13 = this.f23226;
                            if (i13 == 8 && z3) {
                                this.f23237 = 0;
                                this.f23232 = EnumC16818.f49668;
                                C6091 c6091 = this.f9120;
                                c6091.mo11117(c6091.m13868(), "Invalid character in octal number", new Object[0]);
                                return;
                            }
                            if (z2) {
                                j4 = 0;
                            } else {
                                if (this.f23232 != EnumC16818.f49668) {
                                    return;
                                }
                                if (i13 == 10) {
                                    if (this.f23237 - 1 >= -1) {
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
                            this.f23237 = 0;
                            this.f23228 = j4;
                            this.f9120.mo11117(this.f23240, "Numeric overflow", new Object[0]);
                            return;
                        }
                        C6091 c6092 = this.f9120;
                        c6092.mo11117(c6092.m13868(), "Invalid character \"{0}\" in number", Character.toString((char) this.f23238));
                        while (true) {
                            int iM398419 = this.f9120.f15307.m39849();
                            this.f23238 = iM398419;
                            if (!Character.isLetterOrDigit(iM398419) && this.f23238 != 46) {
                                this.f23237 = 0;
                                this.f23232 = EnumC16818.f49668;
                                return;
                            }
                        }
                    } else {
                        if (i3 == 46) {
                            int iM398420 = this.f9120.f15307.m39849();
                            this.f23238 = iM398420;
                            switch (iM398420) {
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
                                    this.f23235 = 0;
                                    m20073(46);
                                    m20076();
                                    return;
                                default:
                                    this.f23232 = EnumC16818.f49724;
                                    return;
                            }
                        }
                        if (i3 == 123) {
                            this.f23238 = this.f9120.f15307.m39849();
                            this.f23232 = EnumC16818.f49767;
                            return;
                        }
                        if (i3 == 125) {
                            this.f23238 = this.f9120.f15307.m39849();
                            this.f23232 = EnumC16818.f49567;
                            return;
                        }
                        if (i3 == 44) {
                            this.f23238 = this.f9120.f15307.m39849();
                            this.f23232 = EnumC16818.f49716;
                            return;
                        }
                        if (i3 == 59) {
                            this.f23238 = this.f9120.f15307.m39849();
                            this.f23232 = EnumC16818.f49604;
                            return;
                        }
                        if (i3 == 58) {
                            this.f23238 = this.f9120.f15307.m39849();
                            this.f23232 = EnumC16818.f49722;
                            return;
                        }
                        if (i3 == 61) {
                            int iM398421 = this.f9120.f15307.m39849();
                            this.f23238 = iM398421;
                            if (iM398421 != 61) {
                                this.f23232 = EnumC16818.f49733;
                                return;
                            } else {
                                this.f23238 = this.f9120.f15307.m39849();
                                this.f23232 = EnumC16818.f49673;
                                return;
                            }
                        }
                        if (i3 == 26) {
                            int iM398422 = this.f9120.f15307.m39849();
                            this.f23238 = iM398422;
                            if (iM398422 == -1) {
                                this.f23232 = EnumC16818.f49679;
                                return;
                            } else {
                                this.f9120.mo13869(this.f23241, "Invalid character with code {0} in input", Integer.valueOf(iM398422));
                                this.f23238 = this.f9120.f15307.m39849();
                            }
                        } else if (i3 == 35) {
                            if (this.f9120.f15307.m39848() == 123) {
                                this.f23238 = this.f9120.f15307.m39849();
                                this.f23232 = EnumC16818.f49719;
                                return;
                            }
                            int i14 = this.f23238;
                            int iM398423 = this.f9120.f15307.m39849();
                            this.f23238 = iM398423;
                            switch (iM398423) {
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
                                    long j6 = iM398423 - 48;
                                    this.f23235 = 0;
                                    m20073(iM398423);
                                    while (true) {
                                        boolean z5 = false;
                                        while (true) {
                                            int iM398424 = this.f9120.f15307.m39849();
                                            this.f23238 = iM398424;
                                            switch (iM398424) {
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
                                                    m20073(iM398424);
                                                    if (!z5) {
                                                        j6 = (j6 * 10) + ((long) (this.f23238 - 48));
                                                        if (j6 > 65535) {
                                                            z5 = true;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    this.f23237 = (int) j6;
                                                    this.f23227 = m20077();
                                                    this.f23232 = EnumC16818.f49704;
                                                    if (z5) {
                                                        this.f9120.mo11117(this.f23240, "Numeric overflow", new Object[0]);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    this.f23227 = Character.toString((char) i14);
                                    C6091 c6093 = this.f9120;
                                    c6093.m13871(c6093.m13868(), "Invalid character \"{0}\" in number", this.f23227);
                                    throw null;
                            }
                        } else if (i3 == 92) {
                            int iM398425 = this.f9120.f15307.m39849();
                            this.f23238 = iM398425;
                            if (iM398425 == 117) {
                                int iM39848 = this.f9120.f15307.m39847();
                                this.f23238 = iM39848;
                                if (Character.isLetterOrDigit(iM39848) && !Character.isDigit(this.f23238)) {
                                    m20074((char[]) null);
                                    return;
                                }
                            } else if (this.f23231.test(Integer.valueOf(iM398425))) {
                                m20074(new char[]{'\\', (char) this.f23238});
                                return;
                            }
                            final long jM13865 = this.f9120.m13865(this.f23240);
                            final long jM16531 = ((C7196) this.f9120.m48082()).m16531(jM13865, this.f23240);
                            this.f9120.m48074(new Supplier() { // from class: l.ۧ۟ۚ
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return String.format("Funny char with code='%c' at %d:%d", Integer.valueOf(this.f35576.f23238), Long.valueOf(jM13865), Long.valueOf(jM16531));
                                }
                            });
                            this.f9120.mo13869(this.f23240, "Invalid character with code {0} in input", Integer.valueOf(this.f23238));
                            this.f23238 = this.f9120.f15307.m39849();
                        } else {
                            final long jM13866 = this.f9120.m13865(this.f23240);
                            final long jM16532 = ((C7196) this.f9120.m48082()).m16531(jM13866, this.f23240);
                            this.f9120.m48074(new Supplier() { // from class: l.ܽ۟ۚ
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return String.format("Funny char with code='%c' at %d:%d", Integer.valueOf(this.f53862.f23238), Long.valueOf(jM13866), Long.valueOf(jM16532));
                                }
                            });
                            this.f9120.mo13869(this.f23240, "Invalid character with code {0} in input", Integer.valueOf(this.f23238));
                            this.f23238 = this.f9120.f15307.m39849();
                        }
                    }
                }
            }
        }
        m20074((char[]) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20079(String str) {
        if (this.f9120.m48080()) {
            EnumC16818 enumC16818 = this.f23232;
            if (enumC16818 == null) {
                this.f9120.m48090(str.concat("<<<NULL TOKEN>>>"), new Object[0]);
                return;
            }
            this.f9120.m48087(str.concat(enumC16818.toString()), new Object[0]);
            int i = C24748.f78349[this.f23232.ordinal()];
            if (i == 2) {
                this.f9120.m48090(" = {intValue}: " + this.f23237, new Object[0]);
                return;
            }
            if (i == 4) {
                this.f9120.m48090(" = {floatValue}: " + this.f23242, new Object[0]);
                return;
            }
            if (i == 5) {
                this.f9120.m48090(" = {doubleValue}: " + this.f23243, new Object[0]);
                return;
            }
            if (i != 8) {
                if (i != 9) {
                    this.f9120.m48090("", new Object[0]);
                    return;
                } else {
                    this.f9120.m48090(C10965.m25286(new StringBuilder(" = {stringValue}: \""), this.f23227, "\""), new Object[0]);
                    return;
                }
            }
            C6091 c6091 = this.f9120;
            StringBuilder sb = new StringBuilder(" = '");
            sb.append(this.f23227);
            sb.append("' {idValue = '");
            c6091.m48090(C10965.m25286(sb, this.f23234, "'}"), new Object[0]);
        }
    }
}
