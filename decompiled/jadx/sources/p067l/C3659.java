package p067l;

import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.pro.C0698cb;
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
public final class C3659 {

    /* JADX INFO: renamed from: ۬ */
    public static final Pattern f7696 = Pattern.compile("-?\\d{1,19}(?:\\.\\d{1,19})?");

    /* JADX INFO: renamed from: ֡ */
    public String f7697;

    /* JADX INFO: renamed from: ֨ */
    public boolean f7698;

    /* JADX INFO: renamed from: ֫ */
    public C6673 f7699;

    /* JADX INFO: renamed from: ۖ */
    public String f7700;

    /* JADX INFO: renamed from: ۗ */
    public String f7701;

    /* JADX INFO: renamed from: ۘ */
    public C6673 f7702;

    /* JADX INFO: renamed from: ۙ */
    public String f7703;

    /* JADX INFO: renamed from: ۚ */
    public boolean f7704;

    /* JADX INFO: renamed from: ۜ */
    public final HashMap f7705;

    /* JADX INFO: renamed from: ۠ */
    public long f7706;

    /* JADX INFO: renamed from: ۡ */
    public boolean f7707;

    /* JADX INFO: renamed from: ۢ */
    public String f7708;

    /* JADX INFO: renamed from: ۧ */
    public C6673 f7709;

    /* JADX INFO: renamed from: ܳ */
    public int f7710;

    /* JADX INFO: renamed from: ܶ */
    public long f7711;

    /* JADX INFO: renamed from: ܺ */
    public byte f7712;

    /* JADX INFO: renamed from: ܽ */
    public C6673 f7713;

    /* JADX INFO: renamed from: ܿ */
    public long f7714;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f7715;

    /* JADX INFO: renamed from: ᩴ */
    public String f7716;

    /* JADX INFO: renamed from: ᩵ */
    public int f7717;

    /* JADX INFO: renamed from: ᩶ */
    public long f7718;

    /* JADX INFO: renamed from: ᩷ */
    public long f7719;

    /* JADX INFO: renamed from: ᩸ */
    public List f7720;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f7721;

    /* JADX INFO: renamed from: ᩻ */
    public int f7722;

    /* JADX INFO: renamed from: ֫ */
    public static int m6961(long j, byte[] bArr, int i, int i2, boolean z) {
        if (!z && (j < 0 || j >= (1 << ((i2 - 1) * 3)))) {
            int i3 = i2 - 1;
            C8353.m19276(0L, bArr, i, i3);
            bArr[i3 + i] = UTF8.S_CS3;
        } else {
            int i4 = C8353.f22334;
            long j2 = i2 == 8 ? 2097151L : 8589934591L;
            boolean z2 = j < 0;
            if (!z2 && j <= j2) {
                int i5 = i2 - 1;
                C8353.m19276(j, bArr, i, i5);
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

    /* JADX INFO: renamed from: ܽ */
    public static C6673 m6965(long j) {
        if (j <= 0) {
            return null;
        }
        int i = C19438.f59188;
        return C6673.from(j, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m6998(String str) {
        String strReplace = str.replace(File.separatorChar, '/');
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        this.f7697 = strReplace;
    }

    /* JADX INFO: renamed from: ܿ */
    public static C6398 m6966(String str) throws IOException {
        if (!f7696.matcher(str).matches()) {
            throw new IOException(C6988.m16053("Corrupted PAX header. Time field value is invalid '", str, "'"));
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        try {
            return C6398.ofEpochSecond(bigDecimal.longValue(), bigDecimal.remainder(BigDecimal.ONE).movePointRight(9).longValue());
        } catch (ArithmeticException | C17796 e) {
            throw new IOException(C6988.m16053("Corrupted PAX header. Time field value is invalid '", str, "'"), e);
        }
    }

    public C3659() {
        this.f7697 = "";
        this.f7700 = "";
        this.f7716 = "ustar\u0000";
        this.f7701 = ChipTextInputComboView.TextFormatter.DEFAULT_TEXT;
        this.f7708 = "";
        this.f7705 = new HashMap();
        this.f7714 = -1L;
        String property = System.getProperty("user.name", "");
        this.f7703 = property.length() > 31 ? property.substring(0, 31) : property;
    }

    public C3659(HashMap map, byte[] bArr, InterfaceC24446 interfaceC24446) throws IOException {
        this();
        try {
            m6963(map, bArr, interfaceC24446);
        } catch (IllegalArgumentException e) {
            throw new IOException("Corrupted TAR archive.", e);
        }
    }

    public C3659(String str) {
        this();
        String strReplace = str.replace(File.separatorChar, '/');
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        boolean zEndsWith = strReplace.endsWith("/");
        this.f7697 = strReplace;
        this.f7717 = zEndsWith ? 16877 : 33188;
        this.f7712 = zEndsWith ? (byte) 53 : UTF8.S_P3A;
        this.f7702 = C6673.from(C6398.now());
        this.f7703 = "";
    }

    public C3659(byte b, String str) {
        this(str);
        this.f7712 = b;
        if (b == 76) {
            this.f7716 = "ustar ";
            this.f7701 = " \u0000";
        }
    }

    public final boolean equals(Object obj) {
        return obj != null && C3659.class == obj.getClass() && this.f7697.equals(((C3659) obj).f7697);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m6962(byte[] bArr, int i, byte b, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = b;
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6673 m6969() {
        return this.f7709;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m6988() {
        return this.f7714;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m6997() {
        return this.f7710;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m7000() {
        return this.f7722;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Map m6999() {
        return C21562.unmodifiableMap(this.f7705);
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m6994() {
        return this.f7708;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C6673 m7009() {
        return this.f7699;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C6673 m6983() {
        return this.f7702;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m7005() {
        return this.f7700;
    }

    /* JADX INFO: renamed from: ۢ */
    public final long m6986() {
        return this.f7719;
    }

    /* JADX INFO: renamed from: ۡ */
    public final long m6985() {
        return this.f7718;
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m6977() {
        return this.f7717;
    }

    /* JADX INFO: renamed from: ܺ */
    public final Date m6996() {
        C6673 c6673 = this.f7702;
        int i = C19438.f59188;
        if (c6673 != null) {
            return new Date(c6673.toMillis());
        }
        return null;
    }

    public final int hashCode() {
        return this.f7697.hashCode();
    }

    /* JADX INFO: renamed from: ۘ */
    public final String m6979() {
        return this.f7697;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final List m7002() throws IOException {
        List list = this.f7720;
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list2 = (List) C7480.stream(this.f7720).filter(new C6611(1)).sorted(C10162.comparingLong(new C7683())).collect(C24205.toList());
        int size = list2.size();
        int i = 0;
        while (i < size) {
            C7012 c7012 = (C7012) list2.get(i);
            i++;
            if (i < size) {
                if (c7012.m16133() + c7012.m16134() > ((C7012) list2.get(i)).m16134()) {
                    throw new IOException(C10965.m25286(new StringBuilder("Corrupted TAR archive. Sparse blocks for "), this.f7697, " overlap each other."));
                }
            }
            if (c7012.m16133() + c7012.m16134() < 0) {
                throw new IOException(C10965.m25286(new StringBuilder("Unreadable TAR archive. Offset and numbytes for sparse block in "), this.f7697, " too large."));
            }
        }
        if (!list2.isEmpty()) {
            C7012 c7013 = (C7012) list2.get(size - 1);
            if (c7013.m16133() + c7013.m16134() > m7003()) {
                throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final long m7003() {
        if (m6991()) {
            return this.f7706;
        }
        return this.f7711;
    }

    /* JADX INFO: renamed from: ֡ */
    public final long m6967() {
        return this.f7711;
    }

    /* JADX INFO: renamed from: ۚ */
    public final List m6981() {
        return this.f7720;
    }

    /* JADX INFO: renamed from: ֨ */
    public final C6673 m6968() {
        return this.f7713;
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m6984() {
        return this.f7703;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m6995() {
        return this.f7715;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m7006() {
        if (this.f7712 == 53) {
            return true;
        }
        return (m6982() || m6993() || !this.f7697.endsWith("/")) ? false : true;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m7007() {
        return this.f7707;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m7004() {
        byte b = this.f7712;
        if (b == 0 || b == 48) {
            return true;
        }
        return (b == 53 || this.f7697.endsWith("/")) ? false : true;
    }

    /* JADX INFO: renamed from: ۬ */
    public final boolean m6993() {
        return this.f7712 == 103;
    }

    /* JADX INFO: renamed from: ۙ */
    public final boolean m6980() {
        return this.f7712 == 75;
    }

    /* JADX INFO: renamed from: ۗ */
    public final boolean m6978() {
        return this.f7712 == 76;
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m6991() {
        return m6992() || this.f7698 || this.f7721;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m6964(int i, byte[] bArr) {
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

    /* JADX INFO: renamed from: ۫ */
    public final boolean m6992() {
        return this.f7712 == 83;
    }

    /* JADX INFO: renamed from: ۤ */
    public final boolean m6987() {
        return this.f7704;
    }

    /* JADX INFO: renamed from: ۛ */
    public final boolean m6982() {
        byte b = this.f7712;
        return b == 120 || b == 88;
    }

    /* JADX INFO: renamed from: ᩺ */
    public final boolean m7008() {
        return this.f7712 == 50;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m6963(Map map, byte[] bArr, InterfaceC24446 interfaceC24446) throws IOException {
        String str;
        byte b;
        this.f7697 = C8353.m19272(bArr, 0, 100, interfaceC24446);
        this.f7717 = (int) C8353.m19278(100, 8, bArr);
        this.f7718 = (int) C8353.m19278(108, 8, bArr);
        this.f7719 = (int) C8353.m19278(116, 8, bArr);
        long jM19278 = C8353.m19278(124, 12, bArr);
        this.f7711 = jM19278;
        long j = 0;
        if (jM19278 < 0) {
            throw new IOException("broken archive, entry with negative size");
        }
        long jM19279 = C8353.m19278(136, 12, bArr);
        int i = C19438.f59188;
        this.f7702 = C6673.from(jM19279, TimeUnit.SECONDS);
        int i2 = 148;
        long jM19271 = C8353.m19271(148, 8, bArr);
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
        this.f7715 = jM19271 == j || jM19271 == j2;
        this.f7712 = bArr[156];
        this.f7700 = C8353.m19272(bArr, 157, 100, interfaceC24446);
        InterfaceC24446 interfaceC24447 = C8353.f22335;
        this.f7716 = C8353.m19272(bArr, 257, 6, interfaceC24447);
        this.f7701 = C8353.m19272(bArr, 263, 2, interfaceC24447);
        this.f7703 = C8353.m19272(bArr, 265, 32, interfaceC24446);
        this.f7708 = C8353.m19272(bArr, 297, 32, interfaceC24446);
        byte b4 = this.f7712;
        if (b4 == 51 || b4 == 52) {
            this.f7710 = (int) C8353.m19278(329, 8, bArr);
            this.f7722 = (int) C8353.m19278(337, 8, bArr);
        }
        if (C9694.m22605(257, 6, "ustar ", bArr)) {
            this.f7699 = m6965(C8353.m19278(345, 12, bArr));
            this.f7713 = m6965(C8353.m19278(357, 12, bArr));
            this.f7720 = new ArrayList(C8353.m19279(386, 4, bArr));
            this.f7707 = bArr[482] == 1;
            this.f7706 = C8353.m19271(483, 12, bArr);
            return;
        }
        if (C9694.m22605(257, 6, "ustar\u0000", bArr) && (C9694.m22605(508, 4, "tar\u0000", bArr) || ((str = (String) map.get("SCHILY.archtype")) == null ? !(((b = bArr[475]) != 0 && (bArr[156] != 77 || ((bArr[464] & GCMSIVBlockCipher.MASK) == 0 && b != 32))) || m6964(476, bArr) || m6964(488, bArr)) : "xustar".equals(str) || "exustar".equals(str)))) {
            String strM19272 = C8353.m19272(bArr, 345, 131, interfaceC24446);
            if (!strM19272.isEmpty()) {
                StringBuilder sbM21133 = C9179.m21133(strM19272, "/");
                sbM21133.append(this.f7697);
                this.f7697 = sbM21133.toString();
            }
            this.f7699 = m6965(C8353.m19278(476, 12, bArr));
            this.f7713 = m6965(C8353.m19278(488, 12, bArr));
            return;
        }
        String strM19273 = C8353.m19272(bArr, 345, 155, interfaceC24446);
        if (m7006() && !this.f7697.endsWith("/")) {
            this.f7697 = C10965.m25286(new StringBuilder(), this.f7697, "/");
        }
        if (strM19273.isEmpty()) {
            return;
        }
        StringBuilder sbM21134 = C9179.m21133(strM19273, "/");
        sbM21134.append(this.f7697);
        this.f7697 = sbM21134.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6971(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("The offset can not be smaller than 0");
        }
        this.f7714 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6972(String str) {
        this.f7708 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6975(C6673 c6673) {
        C12826.requireNonNull(c6673, "time");
        this.f7702 = c6673;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6990(String str) {
        this.f7700 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6970(int i) {
        this.f7717 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6989(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C17588.m40051(j, "Size is out of range: "));
        }
        this.f7711 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6973(List list) {
        this.f7720 = list;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m7001(String str) {
        this.f7703 = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public final void m6974(Map map) throws IOException {
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
                        b = C0698cb.f2569k;
                    }
                    break;
                case 530706950:
                    if (str.equals("SCHILY.filetype")) {
                        b = C0698cb.f2570l;
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
                    int iM54488 = C24802.m54488(str2);
                    if (iM54488 < 0) {
                        throw new IOException("Corrupted TAR archive. Dev-Major is negative");
                    }
                    if (iM54488 < 0) {
                        throw new IllegalArgumentException(C20778.m46922(iM54488, "Major device number is out of range: "));
                    }
                    this.f7710 = iM54488;
                    break;
                    break;
                case 1:
                    int iM54489 = C24802.m54488(str2);
                    if (iM54489 < 0) {
                        throw new IOException("Corrupted TAR archive. Dev-Minor is negative");
                    }
                    if (iM54489 < 0) {
                        throw new IllegalArgumentException(C20778.m46922(iM54489, "Minor device number is out of range: "));
                    }
                    this.f7722 = iM54489;
                    break;
                    break;
                case 2:
                    this.f7698 = true;
                    this.f7704 = true;
                    if (map.containsKey("GNU.sparse.name")) {
                        this.f7697 = (String) map.get("GNU.sparse.name");
                    }
                    if (map.containsKey("GNU.sparse.realsize")) {
                        this.f7706 = C24802.m54488((String) map.get("GNU.sparse.realsize"));
                    }
                    break;
                case 3:
                    this.f7698 = true;
                    this.f7706 = C24802.m54488((String) map.get("GNU.sparse.size"));
                    if (map.containsKey("GNU.sparse.name")) {
                        this.f7697 = (String) map.get("GNU.sparse.name");
                    }
                    break;
                case 4:
                    this.f7719 = C24802.m54489(str2);
                    break;
                case 5:
                    this.f7718 = C24802.m54489(str2);
                    break;
                case 6:
                    m6998(str2);
                    break;
                case 7:
                    long jM54489 = C24802.m54489(str2);
                    if (jM54489 < 0) {
                        throw new IOException("Corrupted TAR archive. Entry size is negative");
                    }
                    m6989(jM54489);
                    break;
                    break;
                case 8:
                    this.f7699 = C6673.from(m6966(str2));
                    break;
                case 9:
                    this.f7713 = C6673.from(m6966(str2));
                    break;
                case 10:
                    this.f7708 = str2;
                    break;
                case 11:
                    m6975(C6673.from(m6966(str2)));
                    break;
                case 12:
                    this.f7703 = str2;
                    break;
                case 13:
                    this.f7709 = C6673.from(m6966(str2));
                    break;
                case 14:
                    if ("sparse".equals(str2)) {
                        this.f7721 = true;
                        if (map.containsKey("SCHILY.realsize")) {
                            this.f7706 = C24802.m54489((String) map.get("SCHILY.realsize"));
                        }
                    }
                    break;
                case 15:
                    this.f7700 = str2;
                    break;
                default:
                    this.f7705.put(str, str2);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6976(byte[] bArr, InterfaceC24446 interfaceC24446, boolean z) {
        int iM6961 = m6961(this.f7711, bArr, m6961(this.f7719, bArr, m6961(this.f7718, bArr, m6961(this.f7717, bArr, C8353.m19270(this.f7697, bArr, 0, 100, interfaceC24446), 8, z), 8, z), 8, z), 12, z);
        C6673 c6673 = this.f7702;
        int i = C8709.f23607;
        int i2 = C19438.f59188;
        long j = 0;
        int iM6962 = m6961(c6673 != null ? c6673.m15191to(TimeUnit.SECONDS) : 0L, bArr, iM6961, 12, z);
        int iM6963 = m6962(bArr, iM6962, UTF8.S_CS3, 8);
        bArr[iM6963] = this.f7712;
        int iM19270 = C8353.m19270(this.f7700, bArr, iM6963 + 1, 100, interfaceC24446);
        String str = this.f7716;
        InterfaceC24446 interfaceC24447 = C8353.f22335;
        int iM6964 = m6961(this.f7722, bArr, m6961(this.f7710, bArr, C8353.m19270(this.f7708, bArr, C8353.m19270(this.f7703, bArr, C8353.m19270(this.f7701, bArr, C8353.m19270(str, bArr, iM19270, 6, interfaceC24447), 2, interfaceC24447), 32, interfaceC24446), 32, interfaceC24446), 8, z), 8, z);
        if (z) {
            byte b = (byte) 0;
            int iM6965 = m6962(bArr, iM6964, b, 131);
            C6673 c6674 = this.f7699;
            int iM6966 = c6674 != null ? m6961(c6674.m15191to(TimeUnit.SECONDS), bArr, iM6965, 12, true) : m6962(bArr, iM6965, b, 12);
            C6673 c6675 = this.f7713;
            iM6964 = m6962(bArr, m6962(bArr, c6675 != null ? m6961(c6675.m15191to(TimeUnit.SECONDS), bArr, iM6966, 12, true) : m6962(bArr, iM6966, b, 12), b, 8), b, 4);
        }
        m6962(bArr, iM6964, (byte) 0, bArr.length - iM6964);
        for (byte b2 : bArr) {
            j += (long) (b2 & 255);
        }
        C8353.m19276(j, bArr, iM6962, 6);
        bArr[iM6962 + 6] = 0;
        bArr[iM6962 + 7] = UTF8.S_CS3;
    }
}
