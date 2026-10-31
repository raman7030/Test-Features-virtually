package l;

import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.pro.cb;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֨᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AHN */
/* JADX INFO: loaded from: classes2.dex */
public final class C1358 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f4924 = Pattern.compile("-?\\d{1,19}(?:\\.\\d{1,19})?");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f4925;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f4926;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4529 f4927;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f4928;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f4929;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C4529 f4930;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f4931;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f4932;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashMap f4933;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f4934;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f4935;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f4936;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4529 f4937;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f4938;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f4939;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte f4940;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4529 f4941;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f4942;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f4943;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f4944;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f4945;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f4946;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f4947;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f4948;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f4949;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f4950;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4723(long j, byte[] bArr, int i, int i2, boolean z) {
        if (!z && (j < 0 || j >= (1 << ((i2 - 1) * 3)))) {
            int i3 = i2 - 1;
            C6297.m17336(0L, bArr, i, i3);
            bArr[i3 + i] = UTF8.S_CS3;
        } else {
            int i4 = C6297.f19463;
            long j2 = i2 == 8 ? 2097151L : 8589934591L;
            boolean z2 = j < 0;
            if (!z2 && j <= j2) {
                int i5 = i2 - 1;
                C6297.m17336(j, bArr, i, i5);
                bArr[i + i5] = UTF8.S_CS3;
            } else {
                if (i2 >= 9) {
                    byte[] byteArray = BigInteger.valueOf(j).toByteArray();
                    int length = byteArray.length;
                    if (length > i2 - 1) {
                        throw new IllegalArgumentException("Value " + j + " is too large for " + i2 + " byte field.");
                    }
                    int i6 = (i + i2) - length;
                    System.arraycopy(byteArray, 0, bArr, i6, length);
                    byte b = (byte) (z2 ? 255 : 0);
                    for (int i7 = i + 1; i7 < i6; i7++) {
                        bArr[i7] = b;
                    }
                } else {
                    int i8 = (i2 - 1) * 8;
                    long j3 = 1 << i8;
                    long jAbs = Math.abs(j);
                    if (jAbs < 0 || jAbs >= j3) {
                        throw new IllegalArgumentException("Value " + j + " is too large for " + i2 + " byte field.");
                    }
                    if (z2) {
                        jAbs = ((jAbs ^ (j3 - 1)) + 1) | (255 << i8);
                    }
                    long j4 = jAbs;
                    for (int i9 = (i + i2) - 1; i9 >= i; i9--) {
                        bArr[i9] = (byte) j4;
                        j4 >>= 8;
                    }
                }
                bArr[i] = (byte) (z2 ? 255 : 128);
            }
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C4529 m4727(long j) {
        if (j <= 0) {
            return null;
        }
        int i = C17961.f55991;
        return C4529.from(j, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m4760(String str) {
        String strReplace = str.replace(File.separatorChar, '/');
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        this.f4925 = strReplace;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C4239 m4728(String str) throws IOException {
        if (!f4924.matcher(str).matches()) {
            throw new IOException(C4860.m14172("Corrupted PAX header. Time field value is invalid '", str, "'"));
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        try {
            return C4239.ofEpochSecond(bigDecimal.longValue(), bigDecimal.remainder(BigDecimal.ONE).movePointRight(9).longValue());
        } catch (ArithmeticException | C16232 e) {
            throw new IOException(C4860.m14172("Corrupted PAX header. Time field value is invalid '", str, "'"), e);
        }
    }

    public C1358() {
        this.f4925 = "";
        this.f4928 = "";
        this.f4944 = "ustar\u0000";
        this.f4929 = ChipTextInputComboView.TextFormatter.DEFAULT_TEXT;
        this.f4936 = "";
        this.f4933 = new HashMap();
        this.f4942 = -1L;
        String property = System.getProperty("user.name", "");
        this.f4931 = property.length() > 31 ? property.substring(0, 31) : property;
    }

    public C1358(HashMap map, byte[] bArr, InterfaceC23230 interfaceC23230) throws IOException {
        this();
        try {
            m4725(map, bArr, interfaceC23230);
        } catch (IllegalArgumentException e) {
            throw new IOException("Corrupted TAR archive.", e);
        }
    }

    public C1358(String str) {
        this();
        String strReplace = str.replace(File.separatorChar, '/');
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        boolean zEndsWith = strReplace.endsWith("/");
        this.f4925 = strReplace;
        this.f4945 = zEndsWith ? 16877 : 33188;
        this.f4940 = zEndsWith ? (byte) 53 : UTF8.S_P3A;
        this.f4930 = C4529.from(C4239.now());
        this.f4931 = "";
    }

    public C1358(byte b, String str) {
        this(str);
        this.f4940 = b;
        if (b == 76) {
            this.f4944 = "ustar ";
            this.f4929 = " \u0000";
        }
    }

    public final boolean equals(Object obj) {
        return obj != null && C1358.class == obj.getClass() && this.f4925.equals(((C1358) obj).f4925);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4724(byte[] bArr, int i, byte b, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = b;
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4529 m4731() {
        return this.f4937;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m4750() {
        return this.f4942;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m4759() {
        return this.f4938;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m4762() {
        return this.f4950;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map m4761() {
        return C20195.unmodifiableMap(this.f4933);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m4756() {
        return this.f4936;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C4529 m4771() {
        return this.f4927;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4529 m4745() {
        return this.f4930;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m4767() {
        return this.f4928;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long m4748() {
        return this.f4947;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m4747() {
        return this.f4946;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m4739() {
        return this.f4945;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Date m4758() {
        C4529 c4529 = this.f4930;
        int i = C17961.f55991;
        if (c4529 != null) {
            return new Date(c4529.toMillis());
        }
        return null;
    }

    public final int hashCode() {
        return this.f4925.hashCode();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m4741() {
        return this.f4925;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m4764() throws IOException {
        List list = this.f4948;
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list2 = (List) C5378.stream(this.f4948).filter(new C4464(1)).sorted(C8200.comparingLong(new C5592())).collect(C22976.toList());
        int size = list2.size();
        int i = 0;
        while (i < size) {
            C4886 c4886 = (C4886) list2.get(i);
            i++;
            if (i < size) {
                if (c4886.m14236() + c4886.m14237() > ((C4886) list2.get(i)).m14237()) {
                    throw new IOException(C9045.m23341(new StringBuilder("Corrupted TAR archive. Sparse blocks for "), this.f4925, " overlap each other."));
                }
            }
            if (c4886.m14236() + c4886.m14237() < 0) {
                throw new IOException(C9045.m23341(new StringBuilder("Unreadable TAR archive. Offset and numbytes for sparse block in "), this.f4925, " too large."));
            }
        }
        if (!list2.isEmpty()) {
            C4886 c4887 = (C4886) list2.get(size - 1);
            if (c4887.m14236() + c4887.m14237() > m4765()) {
                throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m4765() {
        if (m4753()) {
            return this.f4934;
        }
        return this.f4939;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long m4729() {
        return this.f4939;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m4743() {
        return this.f4948;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4529 m4730() {
        return this.f4941;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m4746() {
        return this.f4931;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m4757() {
        return this.f4943;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m4768() {
        if (this.f4940 == 53) {
            return true;
        }
        return (m4744() || m4755() || !this.f4925.endsWith("/")) ? false : true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m4769() {
        return this.f4935;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m4766() {
        byte b = this.f4940;
        if (b == 0 || b == 48) {
            return true;
        }
        return (b == 53 || this.f4925.endsWith("/")) ? false : true;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m4755() {
        return this.f4940 == 103;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4742() {
        return this.f4940 == 75;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m4740() {
        return this.f4940 == 76;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m4753() {
        return m4754() || this.f4926 || this.f4949;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m4726(int i, byte[] bArr) {
        if ((bArr[i] & GCMSIVBlockCipher.MASK) == 0) {
            for (int i2 = 0; i2 < 11; i2++) {
                byte b = bArr[i + i2];
                if (b < 48 || b > 55) {
                    return true;
                }
            }
            byte b2 = bArr[i + 11];
            if (b2 != 32 && b2 != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m4754() {
        return this.f4940 == 83;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m4749() {
        return this.f4932;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m4744() {
        byte b = this.f4940;
        return b == 120 || b == 88;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m4770() {
        return this.f4940 == 50;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4725(Map map, byte[] bArr, InterfaceC23230 interfaceC23230) throws IOException {
        String str;
        byte b;
        this.f4925 = C6297.m17332(bArr, 0, 100, interfaceC23230);
        this.f4945 = (int) C6297.m17338(100, 8, bArr);
        this.f4946 = (int) C6297.m17338(108, 8, bArr);
        this.f4947 = (int) C6297.m17338(116, 8, bArr);
        long jM17338 = C6297.m17338(124, 12, bArr);
        this.f4939 = jM17338;
        long j = 0;
        if (jM17338 < 0) {
            throw new IOException("broken archive, entry with negative size");
        }
        long jM17339 = C6297.m17338(136, 12, bArr);
        int i = C17961.f55991;
        this.f4930 = C4529.from(jM17339, TimeUnit.SECONDS);
        int i2 = 148;
        long jM17331 = C6297.m17331(148, 8, bArr);
        int i3 = 0;
        long j2 = 0;
        while (true) {
            int length = bArr.length;
            byte b2 = UTF8.S_CS3;
            if (i3 >= length) {
                break;
            }
            byte b3 = bArr[i3];
            if (i2 > i3 || i3 >= 156) {
                b2 = b3;
            }
            j += (long) (b2 & 255);
            j2 += (long) b2;
            i3++;
            i2 = 148;
        }
        this.f4943 = jM17331 == j || jM17331 == j2;
        this.f4940 = bArr[156];
        this.f4928 = C6297.m17332(bArr, 157, 100, interfaceC23230);
        InterfaceC23230 interfaceC23231 = C6297.f19464;
        this.f4944 = C6297.m17332(bArr, 257, 6, interfaceC23231);
        this.f4929 = C6297.m17332(bArr, 263, 2, interfaceC23231);
        this.f4931 = C6297.m17332(bArr, 265, 32, interfaceC23230);
        this.f4936 = C6297.m17332(bArr, 297, 32, interfaceC23230);
        byte b4 = this.f4940;
        if (b4 == 51 || b4 == 52) {
            this.f4938 = (int) C6297.m17338(329, 8, bArr);
            this.f4950 = (int) C6297.m17338(337, 8, bArr);
        }
        if (C7708.m20625(257, 6, "ustar ", bArr)) {
            this.f4927 = m4727(C6297.m17338(345, 12, bArr));
            this.f4941 = m4727(C6297.m17338(357, 12, bArr));
            this.f4948 = new ArrayList(C6297.m17339(386, 4, bArr));
            this.f4935 = bArr[482] == 1;
            this.f4934 = C6297.m17331(483, 12, bArr);
            return;
        }
        if (C7708.m20625(257, 6, "ustar\u0000", bArr) && (C7708.m20625(508, 4, "tar\u0000", bArr) || ((str = (String) map.get("SCHILY.archtype")) == null ? !(((b = bArr[475]) != 0 && (bArr[156] != 77 || ((bArr[464] & GCMSIVBlockCipher.MASK) == 0 && b != 32))) || m4726(476, bArr) || m4726(488, bArr)) : "xustar".equals(str) || "exustar".equals(str)))) {
            String strM17332 = C6297.m17332(bArr, 345, 131, interfaceC23230);
            if (!strM17332.isEmpty()) {
                StringBuilder sbM19190 = C7166.m19190(strM17332, "/");
                sbM19190.append(this.f4925);
                this.f4925 = sbM19190.toString();
            }
            this.f4927 = m4727(C6297.m17338(476, 12, bArr));
            this.f4941 = m4727(C6297.m17338(488, 12, bArr));
            return;
        }
        String strM17333 = C6297.m17332(bArr, 345, 155, interfaceC23230);
        if (m4768() && !this.f4925.endsWith("/")) {
            this.f4925 = C9045.m23341(new StringBuilder(), this.f4925, "/");
        }
        if (strM17333.isEmpty()) {
            return;
        }
        StringBuilder sbM19191 = C7166.m19190(strM17333, "/");
        sbM19191.append(this.f4925);
        this.f4925 = sbM19191.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4733(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("The offset can not be smaller than 0");
        }
        this.f4942 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4734(String str) {
        this.f4936 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4737(C4529 c4529) {
        C11003.requireNonNull(c4529, "time");
        this.f4930 = c4529;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4752(String str) {
        this.f4928 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4732(int i) {
        this.f4945 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4751(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "Size is out of range: "));
        }
        this.f4939 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4735(List list) {
        this.f4948 = list;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m4763(String str) {
        this.f4931 = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4736(Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1916861932:
                    if (str.equals("SCHILY.devmajor")) {
                        b = 0;
                    }
                    break;
                case -1916619760:
                    if (str.equals("SCHILY.devminor")) {
                        b = 1;
                    }
                    break;
                case -277496563:
                    if (str.equals("GNU.sparse.realsize")) {
                        b = 2;
                    }
                    break;
                case -160380561:
                    if (str.equals("GNU.sparse.size")) {
                        b = 3;
                    }
                    break;
                case 102338:
                    if (str.equals("gid")) {
                        b = 4;
                    }
                    break;
                case 115792:
                    if (str.equals(DhizukuVariables.PARAM_CLIENT_UID)) {
                        b = 5;
                    }
                    break;
                case 3433509:
                    if (str.equals(MotionUtils.EASING_TYPE_PATH)) {
                        b = 6;
                    }
                    break;
                case 3530753:
                    if (str.equals("size")) {
                        b = 7;
                    }
                    break;
                case 93141678:
                    if (str.equals("atime")) {
                        b = 8;
                    }
                    break;
                case 94988720:
                    if (str.equals("ctime")) {
                        b = 9;
                    }
                    break;
                case 98496370:
                    if (str.equals("gname")) {
                        b = 10;
                    }
                    break;
                case 104223930:
                    if (str.equals("mtime")) {
                        b = 11;
                    }
                    break;
                case 111425664:
                    if (str.equals("uname")) {
                        b = 12;
                    }
                    break;
                case 304222685:
                    if (str.equals("LIBARCHIVE.creationtime")) {
                        b = cb.k;
                    }
                    break;
                case 530706950:
                    if (str.equals("SCHILY.filetype")) {
                        b = cb.f77931l;
                    }
                    break;
                case 1195018015:
                    if (str.equals("linkpath")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    int iM52085 = C23605.m52085(str2);
                    if (iM52085 < 0) {
                        throw new IOException("Corrupted TAR archive. Dev-Major is negative");
                    }
                    if (iM52085 < 0) {
                        throw new IllegalArgumentException(C19370.m44628(iM52085, "Major device number is out of range: "));
                    }
                    this.f4938 = iM52085;
                    break;
                    break;
                case 1:
                    int iM52086 = C23605.m52085(str2);
                    if (iM52086 < 0) {
                        throw new IOException("Corrupted TAR archive. Dev-Minor is negative");
                    }
                    if (iM52086 < 0) {
                        throw new IllegalArgumentException(C19370.m44628(iM52086, "Minor device number is out of range: "));
                    }
                    this.f4950 = iM52086;
                    break;
                    break;
                case 2:
                    this.f4926 = true;
                    this.f4932 = true;
                    if (map.containsKey("GNU.sparse.name")) {
                        this.f4925 = (String) map.get("GNU.sparse.name");
                    }
                    if (map.containsKey("GNU.sparse.realsize")) {
                        this.f4934 = C23605.m52085((String) map.get("GNU.sparse.realsize"));
                    }
                    break;
                case 3:
                    this.f4926 = true;
                    this.f4934 = C23605.m52085((String) map.get("GNU.sparse.size"));
                    if (map.containsKey("GNU.sparse.name")) {
                        this.f4925 = (String) map.get("GNU.sparse.name");
                    }
                    break;
                case 4:
                    this.f4947 = C23605.m52086(str2);
                    break;
                case 5:
                    this.f4946 = C23605.m52086(str2);
                    break;
                case 6:
                    m4760(str2);
                    break;
                case 7:
                    long jM52086 = C23605.m52086(str2);
                    if (jM52086 < 0) {
                        throw new IOException("Corrupted TAR archive. Entry size is negative");
                    }
                    m4751(jM52086);
                    break;
                    break;
                case 8:
                    this.f4927 = C4529.from(m4728(str2));
                    break;
                case 9:
                    this.f4941 = C4529.from(m4728(str2));
                    break;
                case 10:
                    this.f4936 = str2;
                    break;
                case 11:
                    m4737(C4529.from(m4728(str2)));
                    break;
                case 12:
                    this.f4931 = str2;
                    break;
                case 13:
                    this.f4937 = C4529.from(m4728(str2));
                    break;
                case 14:
                    if ("sparse".equals(str2)) {
                        this.f4949 = true;
                        if (map.containsKey("SCHILY.realsize")) {
                            this.f4934 = C23605.m52086((String) map.get("SCHILY.realsize"));
                        }
                    }
                    break;
                case 15:
                    this.f4928 = str2;
                    break;
                default:
                    this.f4933.put(str, str2);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4738(byte[] bArr, InterfaceC23230 interfaceC23230, boolean z) {
        int iM4723 = m4723(this.f4939, bArr, m4723(this.f4947, bArr, m4723(this.f4946, bArr, m4723(this.f4945, bArr, C6297.m17330(this.f4925, bArr, 0, 100, interfaceC23230), 8, z), 8, z), 8, z), 12, z);
        C4529 c4529 = this.f4930;
        int i = C6672.f20732;
        int i2 = C17961.f55991;
        long j = 0;
        int iM4724 = m4723(c4529 != null ? c4529.to(TimeUnit.SECONDS) : 0L, bArr, iM4723, 12, z);
        int iM4725 = m4724(bArr, iM4724, UTF8.S_CS3, 8);
        bArr[iM4725] = this.f4940;
        int iM17330 = C6297.m17330(this.f4928, bArr, iM4725 + 1, 100, interfaceC23230);
        String str = this.f4944;
        InterfaceC23230 interfaceC23231 = C6297.f19464;
        int iM4726 = m4723(this.f4950, bArr, m4723(this.f4938, bArr, C6297.m17330(this.f4936, bArr, C6297.m17330(this.f4931, bArr, C6297.m17330(this.f4929, bArr, C6297.m17330(str, bArr, iM17330, 6, interfaceC23231), 2, interfaceC23231), 32, interfaceC23230), 32, interfaceC23230), 8, z), 8, z);
        if (z) {
            byte b = (byte) 0;
            int iM4727 = m4724(bArr, iM4726, b, 131);
            C4529 c45210 = this.f4927;
            int iM4728 = c45210 != null ? m4723(c45210.to(TimeUnit.SECONDS), bArr, iM4727, 12, true) : m4724(bArr, iM4727, b, 12);
            C4529 c45211 = this.f4941;
            iM4726 = m4724(bArr, m4724(bArr, c45211 != null ? m4723(c45211.to(TimeUnit.SECONDS), bArr, iM4728, 12, true) : m4724(bArr, iM4728, b, 12), b, 8), b, 4);
        }
        m4724(bArr, iM4726, (byte) 0, bArr.length - iM4726);
        for (byte b2 : bArr) {
            j += (long) (b2 & 255);
        }
        C6297.m17336(j, bArr, iM4724, 6);
        bArr[iM4724 + 6] = 0;
        bArr[iM4724 + 7] = UTF8.S_CS3;
    }
}
