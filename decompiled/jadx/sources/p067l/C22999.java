package p067l;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.timepicker.TimeModel;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.encoders.UTF8;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩸ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5DR */
/* JADX INFO: loaded from: classes.dex */
public final class C22999 implements Cloneable {

    /* JADX INFO: renamed from: ֫֫ */
    public byte f72335;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f72340;

    /* JADX INFO: renamed from: ۬ */
    public int f72351;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f72357;

    /* JADX INFO: renamed from: ᩶ */
    public byte[] f72361;

    /* JADX INFO: renamed from: ᩹֫ */
    public static final C2582 f72332 = new C2582(2);

    /* JADX INFO: renamed from: ᩶֫ */
    public static final Pattern f72330 = Pattern.compile("(\\d+)x(\\d+)");

    /* JADX INFO: renamed from: ᩸֫ */
    public static final Pattern f72331 = Pattern.compile("(\\d+)dpi");

    /* JADX INFO: renamed from: ۙ֫ */
    public static final int[][] f72326 = {new int[]{19, 1}, new int[]{12, 4}, new int[]{16, 3}, new int[]{20, 4}, new int[]{24, 4}, new int[]{28, 1}, new int[]{48, 1}, new int[]{49, 1}, new int[]{29, 1}, new int[]{30, 2}, new int[]{32, 4}};

    /* JADX INFO: renamed from: ۗ֫ */
    public static final char[] f72325 = {'e', 'n'};

    /* JADX INFO: renamed from: ۤ֫ */
    public static final char[] f72327 = {'U', 'S'};

    /* JADX INFO: renamed from: ۬֫ */
    public static final char[] f72329 = {173, 5};

    /* JADX INFO: renamed from: ۫֫ */
    public static final char[] f72328 = {'t', 'l'};

    /* JADX INFO: renamed from: ᩺ */
    public EnumC12270 f72365 = EnumC12270.AOSP;

    /* JADX INFO: renamed from: ۗ */
    public final byte[] f72337 = new byte[3];

    /* JADX INFO: renamed from: ܽ֫ */
    public short f72356 = 0;

    /* JADX INFO: renamed from: ᩳ֫ */
    public short f72358 = 0;

    /* JADX INFO: renamed from: ۨ */
    public char[] f72349 = new char[2];

    /* JADX INFO: renamed from: ᩹ */
    public char[] f72364 = new char[2];

    /* JADX INFO: renamed from: ᩻֫ */
    public byte f72366 = 0;

    /* JADX INFO: renamed from: ֨֫ */
    public byte f72334 = 0;

    /* JADX INFO: renamed from: ۙ */
    public int f72339 = 0;

    /* JADX INFO: renamed from: ۛ */
    public byte f72341 = 0;

    /* JADX INFO: renamed from: ܳ֫ */
    public byte f72353 = 0;

    /* JADX INFO: renamed from: ۤ */
    public byte f72347 = 0;

    /* JADX INFO: renamed from: ۫ */
    public byte f72350 = 0;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f72338 = 0;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f72346 = 0;

    /* JADX INFO: renamed from: ᩵֫ */
    public short f72360 = 0;

    /* JADX INFO: renamed from: ܺ֫ */
    public byte f72355 = 0;

    /* JADX INFO: renamed from: ۠֫ */
    public byte f72344 = 0;

    /* JADX INFO: renamed from: ֡֫ */
    public int f72333 = 0;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f72359 = 0;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f72345 = 0;

    /* JADX INFO: renamed from: ۟ */
    public char[] f72343 = new char[4];

    /* JADX INFO: renamed from: ۧ֫ */
    public char[] f72348 = new char[8];

    /* JADX INFO: renamed from: ۖ֫ */
    public byte f72336 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public byte f72363 = 0;

    /* JADX INFO: renamed from: ᩷֫ */
    public short f72362 = 0;

    /* JADX INFO: renamed from: ܰ */
    public char[] f72352 = new char[8];

    /* JADX INFO: renamed from: ܶ֫ */
    public byte[] f72354 = null;

    /* JADX INFO: renamed from: ۜ֫ */
    public String f72342 = null;

    /* JADX INFO: renamed from: ֫ */
    public static int m51343(int i, int i2) {
        if ((i & i2) == 0) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static char[] m51355(byte b, byte b2, char c) {
        if (((b >> 7) & 1) != 1) {
            return new char[]{(char) b, (char) b2};
        }
        return new char[]{(char) ((b2 & C0684bo.f2505j) + c), (char) (((b2 & C0684bo.f2506k) >> 5) + ((b & 3) << 3) + c), (char) (((b & 124) >> 2) + c)};
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22999 m51349(C7972 c7972, EnumC12270 enumC12270) throws IOException {
        C22999 c22999 = new C22999();
        C12826.requireNonNull(enumC12270);
        c22999.f72365 = enumC12270;
        c22999.m51352(c7972);
        return c22999;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22999 m51348(String str, EnumC12270 enumC12270) throws Exception {
        C22999 c22999 = new C22999();
        C12826.requireNonNull(enumC12270);
        c22999.f72365 = enumC12270;
        c22999.m51350(str);
        return c22999;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC12270 m51370() {
        return this.f72365;
    }

    /* JADX INFO: renamed from: ܿ */
    private byte[] m51367() {
        int length;
        byte[] bArr = this.f72361;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = this.f72354;
        byte[] bArr3 = this.f72337;
        if (bArr2 != null) {
            length = this.f72365.f34283 + bArr2.length;
        } else {
            if (this.f72340 != 0 || this.f72351 != 0 || this.f72357 != 0 || this.f72335 != 0 || !m51366(this.f72352)) {
                length = this.f72365.f34283;
                break;
            }
            int length2 = bArr3.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    if (this.f72336 != 0 || this.f72363 != 0 || this.f72362 != 0) {
                        length = 52;
                        break;
                    }
                    if (!m51366(this.f72343) || !m51366(this.f72348)) {
                        length = 48;
                        break;
                    }
                    if (this.f72359 != 0 || this.f72345 != 0) {
                        length = 36;
                        break;
                    }
                    if (this.f72355 != 0 || this.f72344 != 0 || this.f72333 != 0) {
                        length = 32;
                        break;
                    }
                    length = 28;
                    break;
                }
                if (bArr3[i] != 0) {
                    length = this.f72365.f34283;
                    break;
                }
                i++;
            }
        }
        int i2 = length - 4;
        C11996 c11996 = new C11996(i2);
        c11996.mo15111(this.f72356);
        c11996.mo15111(this.f72358);
        byte[] bArr4 = new byte[2];
        m51353(bArr4, this.f72349, 'a');
        c11996.write(bArr4, 0, 2);
        m51353(bArr4, this.f72364, '0');
        c11996.write(bArr4, 0, 2);
        c11996.writeByte(this.f72366);
        c11996.writeByte(this.f72334);
        c11996.mo15113(this.f72339);
        c11996.writeByte(this.f72341);
        c11996.writeByte(this.f72353);
        c11996.writeByte(this.f72347);
        c11996.writeByte(this.f72350);
        c11996.mo15113(this.f72338);
        c11996.mo15113(this.f72346);
        c11996.mo15111(this.f72360);
        c11996.mo15111((short) 0);
        if (length >= 32) {
            c11996.writeByte(this.f72355);
            c11996.writeByte(this.f72344);
            c11996.mo15113(this.f72333);
        }
        if (length >= 36) {
            c11996.mo15113(this.f72359);
            c11996.mo15113(this.f72345);
        }
        if (length >= 48) {
            byte[] bArr5 = new byte[12];
            for (int i3 = 0; i3 < 4; i3++) {
                bArr5[i3] = (byte) this.f72343[i3];
            }
            for (int i4 = 0; i4 < 8; i4++) {
                bArr5[i4 + 4] = (byte) this.f72348[i4];
            }
            c11996.write(bArr5, 0, 12);
        }
        if (length >= 52) {
            c11996.writeByte(this.f72336);
            c11996.writeByte(this.f72363);
            c11996.mo15111(this.f72362);
        }
        EnumC12270 enumC12270 = this.f72365;
        if (enumC12270 == EnumC12270.MOTOROLA_76 && length >= enumC12270.f34283) {
            c11996.writeInt(this.f72340);
            c11996.writeInt(this.f72351);
            c11996.writeInt(this.f72357);
        }
        if (length >= this.f72365.f34283) {
            c11996.writeByte(this.f72335);
            for (char c : this.f72352) {
                c11996.writeByte((byte) c);
            }
            c11996.write(bArr3);
        }
        if (length > this.f72365.f34283) {
            c11996.write(this.f72354);
        }
        byte[] bArrM27464 = c11996.m27464();
        this.f72361 = bArrM27464;
        if (bArrM27464.length == i2) {
            return bArrM27464;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m51369(C22999 c22999) {
        int iCompare;
        byte[] bArrM51367 = m51367();
        byte[] bArrM51368 = c22999.m51367();
        int iM51344 = m51344(4, 4, bArrM51367, bArrM51368);
        if (iM51344 != 0) {
            return iM51344;
        }
        int iM51345 = m51344(8, 4, bArrM51367, bArrM51368);
        if (iM51345 != 0) {
            return iM51345;
        }
        int i = 36;
        while (true) {
            if (i >= 40) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 8) {
                        iCompare = 0;
                        break;
                    }
                    int i3 = 40 + i2;
                    iCompare = Integer.compare(m51345(i3, bArrM51367), m51345(i3, bArrM51368));
                    if (iCompare != 0) {
                        break;
                    }
                    i2++;
                }
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = 0;
                for (int i4 = 0; i4 < 8 && iCompare2 == 0; i4++) {
                    iCompare2 = Integer.compare(this.f72352[i4], c22999.f72352[i4]);
                }
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                for (int[] iArr : f72326) {
                    int iM51346 = m51344(iArr[0], iArr[1], bArrM51367, bArrM51368);
                    if (iM51346 != 0) {
                        return iM51346;
                    }
                }
                int iCompare3 = Integer.compare(this.f72365.ordinal(), c22999.f72365.ordinal());
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                if (this.f72365 == EnumC12270.MOTOROLA_76) {
                    for (int i5 = 52; i5 < 64; i5 += 4) {
                        int iM51347 = m51344(i5, 4, bArrM51367, bArrM51368);
                        if (iM51347 != 0) {
                            return iM51347;
                        }
                    }
                }
                return 0;
            }
            int iCompare4 = Integer.compare(this.f72335 != 0 ? 0 : m51345(i, bArrM51367), c22999.f72335 == 0 ? m51345(i, bArrM51368) : 0);
            if (iCompare4 != 0) {
                return iCompare4;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m51345(int i, byte[] bArr) {
        int i2 = i - 4;
        if (i2 < bArr.length) {
            return bArr[i2] & 255;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m51344(int i, int i2, byte[] bArr, byte[] bArr2) {
        int iCompare;
        do {
            i2--;
            if (i2 < 0) {
                return 0;
            }
            int i3 = i + i2;
            iCompare = Integer.compare(m51345(i3, bArr), m51345(i3, bArr2));
        } while (iCompare == 0);
        return iCompare;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m51376() {
        return m51367().length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51371(InterfaceC6631 interfaceC6631) {
        byte[] bArrM51367 = m51367();
        interfaceC6631.writeInt(bArrM51367.length + 4);
        interfaceC6631.write(bArrM51367);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51352(C7972 c7972) throws IOException {
        int i;
        int iM18461 = c7972.m18461();
        if (iM18461 < 8) {
            throw new IOException(C19768.m44906(iM18461, "Config size = ", " is too small"));
        }
        if (iM18461 > 255) {
            iM18461 = Math.min(this.f72365.f34283, c7972.m18451());
        }
        byte[] bArr = new byte[iM18461 - 4];
        try {
            c7972.m18452(bArr);
            C14677 c14677 = new C14677(bArr);
            this.f72356 = c14677.readShort();
            this.f72358 = c14677.readShort();
            if (iM18461 >= 12) {
                this.f72349 = m51355(c14677.readByte(), c14677.readByte(), 'a');
                this.f72364 = m51355(c14677.readByte(), c14677.readByte(), '0');
            } else {
                this.f72349 = new char[2];
                this.f72364 = new char[2];
            }
            if (iM18461 >= 14) {
                this.f72366 = c14677.readByte();
                this.f72334 = c14677.readByte();
            }
            if (iM18461 >= 16) {
                this.f72339 = c14677.m33581();
            }
            if (iM18461 >= 28) {
                this.f72341 = c14677.readByte();
                this.f72353 = c14677.readByte();
                this.f72347 = c14677.readByte();
                this.f72350 = c14677.readByte();
                this.f72338 = c14677.m33581();
                this.f72346 = c14677.m33581();
                this.f72360 = c14677.readShort();
                c14677.skipBytes(2);
            }
            if (iM18461 >= 32) {
                this.f72355 = c14677.readByte();
                this.f72344 = c14677.readByte();
                this.f72333 = c14677.m33581();
            }
            if (iM18461 >= 36) {
                this.f72359 = c14677.m33581();
                this.f72345 = c14677.m33581();
            }
            if (iM18461 >= 48) {
                char[] cArr = new char[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    cArr[i2] = (char) c14677.readByte();
                }
                this.f72343 = cArr;
                char[] cArr2 = new char[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    cArr2[i3] = (char) c14677.readByte();
                }
                this.f72348 = cArr2;
            }
            if (iM18461 >= 52) {
                this.f72336 = c14677.readByte();
                this.f72363 = c14677.readByte();
                this.f72362 = c14677.readShort();
            }
            if (this.f72365 == EnumC12270.MOTOROLA_76 && iM18461 > 52) {
                if (iM18461 < 76) {
                    throw new IOException("Truncated Motorola config");
                }
                this.f72340 = c14677.readInt();
                this.f72351 = c14677.readInt();
                this.f72357 = c14677.readInt();
            }
            int i4 = this.f72365.f34283 - 12;
            if (iM18461 > i4) {
                this.f72335 = c14677.readByte();
                int i5 = 0;
                while (true) {
                    i = iM18461 - i4;
                    if (i5 >= Math.min(8, i - 1)) {
                        break;
                    }
                    this.f72352[i5] = (char) (c14677.readByte() & 255);
                    i5++;
                }
                for (int i6 = 0; i6 < Math.min(3, i - 9); i6++) {
                    this.f72337[i6] = c14677.readByte();
                }
            }
            int i7 = iM18461 - this.f72365.f34283;
            if (i7 > 0) {
                byte[] bArr2 = new byte[i7];
                c14677.m33576(i7, bArr2);
                for (int i8 = 0; i8 < i7; i8++) {
                    if (bArr2[i8] != 0) {
                        this.f72354 = bArr2;
                        return;
                    }
                }
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:248:0x0367  */
    /* JADX WARN: Code duplicated, block: B:440:0x077d  */
    /* JADX WARN: Code duplicated, block: B:484:0x0869  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    private void m51350(String str) throws Exception {
        int iM51343;
        int iM51344;
        int iM51345;
        byte b;
        StringBuilder sb;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        String str2 = str;
        if (str.isEmpty()) {
            return;
        }
        Matcher matcher = f72331.matcher("");
        Matcher matcher2 = f72330.matcher("");
        StringBuilder sb2 = new StringBuilder();
        String[] strArrSplit = str2.split("-");
        int length = strArrSplit.length;
        int i3 = 0;
        byte[] bArr = null;
        boolean z4 = true;
        int i4 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (i3 < length) {
            String str3 = strArrSplit[i3];
            if (!z4) {
                if (!str3.startsWith("unknown")) {
                    sb2.append('-');
                    sb2.append(str3);
                }
                switch (str3.hashCode()) {
                    case -2097775141:
                        if (str3.equals("smallui")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case -2090048083:
                        if (str3.equals("appliance")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1619189395:
                        if (str3.equals("xxxhdpi")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1412647951:
                        if (str3.equals("anydpi")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1317750766:
                        if (str3.equals("television")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1274444951:
                        if (str3.equals("finger")) {
                            b = 5;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1217394256:
                        if (str3.equals("highdr")) {
                            b = 6;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1206314369:
                        if (str3.equals("hugeui")) {
                            b = 7;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1186939235:
                        if (str3.equals("navexposed")) {
                            b = 8;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1048884797:
                        if (str3.equals("neuter")) {
                            b = 9;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1039961291:
                        if (str3.equals("nokeys")) {
                            b = 10;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1039745817:
                        if (str3.equals("normal")) {
                            b = 11;
                        } else {
                            b = -1;
                        }
                        break;
                    case -946852072:
                        if (str3.equals("qwerty")) {
                            b = 12;
                        } else {
                            b = -1;
                        }
                        break;
                    case -919025594:
                        if (str3.equals("vrheadset")) {
                            b = C0698cb.f2569k;
                        } else {
                            b = -1;
                        }
                        break;
                    case -900164407:
                        if (str3.equals("mediumui")) {
                            b = C0698cb.f2570l;
                        } else {
                            b = -1;
                        }
                        break;
                    case -894674659:
                        if (str3.equals("square")) {
                            b = 15;
                        } else {
                            b = -1;
                        }
                        break;
                    case -891774254:
                        if (str3.equals("stylus")) {
                            b = 16;
                        } else {
                            b = -1;
                        }
                        break;
                    case -788049289:
                        if (str3.equals("widecg")) {
                            b = 17;
                        } else {
                            b = -1;
                        }
                        break;
                    case -756726333:
                        if (str3.equals("xlarge")) {
                            b = 18;
                        } else {
                            b = -1;
                        }
                        break;
                    case -745448715:
                        if (str3.equals("xxhdpi")) {
                            b = 19;
                        } else {
                            b = -1;
                        }
                        break;
                    case -260762235:
                        if (str3.equals("masculine")) {
                            b = 20;
                        } else {
                            b = -1;
                        }
                        break;
                    case -48371953:
                        if (str3.equals("largeui")) {
                            b = 21;
                        } else {
                            b = -1;
                        }
                        break;
                    case 98260:
                        if (str3.equals("car")) {
                            b = 22;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3079833:
                        if (str3.equals("desk")) {
                            b = 23;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3089839:
                        if (str3.equals("dpad")) {
                            b = 24;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3197941:
                        if (str3.equals("hdpi")) {
                            b = 25;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3314155:
                        if (str3.equals("land")) {
                            b = 26;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3317105:
                        if (str3.equals("ldpi")) {
                            b = 27;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3327612:
                        if (str3.equals(ClassTransform.LONG)) {
                            b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3346896:
                        if (str3.equals("mdpi")) {
                            b = 29;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3446913:
                        if (str3.equals("port")) {
                            b = 30;
                        } else {
                            b = -1;
                        }
                        break;
                    case 42514893:
                        if (str3.equals("feminine")) {
                            b = C0684bo.f2505j;
                        } else {
                            b = -1;
                        }
                        break;
                    case 46848158:
                        if (str3.equals("12key")) {
                            b = UTF8.S_CS3;
                        } else {
                            b = -1;
                        }
                        break;
                    case 102742843:
                        if (str3.equals("large")) {
                            b = PublicSuffixDatabase.EXCEPTION_MARKER;
                        } else {
                            b = -1;
                        }
                        break;
                    case 102826866:
                        if (str3.equals("ldltr")) {
                            b = 34;
                        } else {
                            b = -1;
                        }
                        break;
                    case 102832626:
                        if (str3.equals("ldrtl")) {
                            b = 35;
                        } else {
                            b = -1;
                        }
                        break;
                    case 103164642:
                        if (str3.equals("lowdr")) {
                            b = 36;
                        } else {
                            b = -1;
                        }
                        break;
                    case 104817688:
                        if (str3.equals("night")) {
                            b = 37;
                        } else {
                            b = -1;
                        }
                        break;
                    case 104993788:
                        if (str3.equals("nodpi")) {
                            b = 38;
                        } else {
                            b = -1;
                        }
                        break;
                    case 105002946:
                        if (str3.equals("nonav")) {
                            b = 39;
                        } else {
                            b = -1;
                        }
                        break;
                    case 108704142:
                        if (str3.equals("round")) {
                            b = 40;
                        } else {
                            b = -1;
                        }
                        break;
                    case 109548807:
                        if (str3.equals("small")) {
                            b = 41;
                        } else {
                            b = -1;
                        }
                        break;
                    case 110743451:
                        if (str3.equals("tvdpi")) {
                            b = 42;
                        } else {
                            b = -1;
                        }
                        break;
                    case 112903375:
                        if (str3.equals("watch")) {
                            b = 43;
                        } else {
                            b = -1;
                        }
                        break;
                    case 113097563:
                        if (str3.equals("wheel")) {
                            b = 44;
                        } else {
                            b = -1;
                        }
                        break;
                    case 114020461:
                        if (str3.equals("xhdpi")) {
                            b = 45;
                        } else {
                            b = -1;
                        }
                        break;
                    case 218717356:
                        if (str3.equals("keysexposed")) {
                            b = 46;
                        } else {
                            b = -1;
                        }
                        break;
                    case 372752234:
                        if (str3.equals("godzillaui")) {
                            b = 47;
                        } else {
                            b = -1;
                        }
                        break;
                    case 519571486:
                        if (str3.equals("keyssoft")) {
                            b = UTF8.S_P3A;
                        } else {
                            b = -1;
                        }
                        break;
                    case 726114445:
                        if (str3.equals("navhidden")) {
                            b = 49;
                        } else {
                            b = -1;
                        }
                        break;
                    case 730225098:
                        if (str3.equals("trackball")) {
                            b = 50;
                        } else {
                            b = -1;
                        }
                        break;
                    case 771458206:
                        if (str3.equals("keyshidden")) {
                            b = 51;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1590068517:
                        if (str3.equals("notnight")) {
                            b = 52;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1593954971:
                        if (str3.equals("notround")) {
                            b = 53;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1671187320:
                        if (str3.equals("nowidecg")) {
                            b = 54;
                        } else {
                            b = -1;
                        }
                        break;
                    case 2129448911:
                        if (str3.equals("notlong")) {
                            b = 55;
                        } else {
                            b = -1;
                        }
                        break;
                    case 2129543710:
                        if (str3.equals("notouch")) {
                            b = 56;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        this.f72344 = (byte) (this.f72344 | 12);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 1:
                        this.f72344 = (byte) (this.f72344 | 5);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 2:
                        this.f72339 = 640;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 3:
                        this.f72339 = 65534;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 4:
                        this.f72344 = (byte) (this.f72344 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 5:
                        this.f72334 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 6:
                        this.f72363 = (byte) (this.f72363 | 8);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 7:
                        this.f72344 = (byte) (this.f72344 | 15);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 8:
                        this.f72347 = (byte) (this.f72347 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 9:
                        this.f72350 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 10:
                        this.f72341 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 11:
                        this.f72355 = (byte) (this.f72355 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 12:
                        this.f72341 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 13:
                        this.f72344 = (byte) (this.f72344 | 7);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 14:
                        this.f72344 = (byte) (this.f72344 | C0698cb.f2569k);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 15:
                        this.f72366 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 16:
                        this.f72334 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 17:
                        this.f72363 = (byte) (this.f72363 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 18:
                        this.f72355 = (byte) (this.f72355 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 19:
                        this.f72339 = 480;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 20:
                        this.f72350 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 21:
                        this.f72344 = (byte) (this.f72344 | C0698cb.f2570l);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 22:
                        this.f72344 = (byte) (this.f72344 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 23:
                        this.f72344 = (byte) (this.f72344 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 24:
                        this.f72353 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 25:
                        this.f72339 = 240;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 26:
                        this.f72366 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 27:
                        this.f72339 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 28:
                        this.f72355 = (byte) (this.f72355 | UTF8.S_CS3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 29:
                        this.f72339 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 30:
                        this.f72366 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 31:
                        this.f72350 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 32:
                        this.f72341 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 33:
                        this.f72355 = (byte) (this.f72355 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 34:
                        this.f72355 = (byte) (this.f72355 | 64);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 35:
                        this.f72355 = (byte) (this.f72355 | GCMSIVBlockCipher.MASK);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 36:
                        this.f72363 = (byte) (this.f72363 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 37:
                        this.f72344 = (byte) (this.f72344 | UTF8.S_CS3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 38:
                        this.f72339 = 65535;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 39:
                        this.f72353 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 40:
                        this.f72336 = (byte) (this.f72336 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 41:
                        this.f72355 = (byte) (this.f72355 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 42:
                        this.f72339 = 213;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 43:
                        this.f72344 = (byte) (this.f72344 | 6);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 44:
                        this.f72353 = (byte) 4;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        this.f72339 = 320;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 46:
                        this.f72347 = (byte) (this.f72347 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 47:
                        this.f72344 = (byte) (this.f72344 | 11);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 48:
                        this.f72347 = (byte) (this.f72347 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 49:
                        this.f72347 = (byte) (this.f72347 | 8);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 50:
                        this.f72353 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 51:
                        this.f72347 = (byte) (this.f72347 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 52:
                        this.f72344 = (byte) (this.f72344 | 16);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 53:
                        this.f72336 = (byte) (this.f72336 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        this.f72363 = (byte) (this.f72363 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        this.f72355 = (byte) (this.f72355 | 16);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 56:
                        this.f72334 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    default:
                        if (str3.startsWith("mcc")) {
                            this.f72356 = Short.parseShort(str3.substring(3));
                        } else if (str3.startsWith("mnc")) {
                            short s = Short.parseShort(str3.substring(3));
                            this.f72358 = s;
                            if (s == 0) {
                                this.f72358 = (short) -1;
                            }
                        } else if (str3.matches("[a-z]{2,3}")) {
                            this.f72349 = str3.toCharArray();
                        } else if (str3.matches("r[A-Z0-9]{2}")) {
                            this.f72364 = str3.substring(1).toCharArray();
                        } else if (str3.startsWith("b+")) {
                            String[] strArrSplit2 = str3.substring(2).split("\\+");
                            C20125 c20125 = new C20125(4);
                            int i5 = 0;
                            while (i5 < strArrSplit2.length) {
                                String str4 = strArrSplit2[i5];
                                boolean z8 = z4;
                                char[] charArray = str4.toCharArray();
                                StringBuilder sb3 = sb2;
                                if (c20125.add(0)) {
                                    z3 = z5;
                                    if (charArray.length == 2 || charArray.length == 3) {
                                        this.f72349 = charArray;
                                    }
                                    i5++;
                                    z4 = z8;
                                    sb2 = sb3;
                                    z5 = z3;
                                } else {
                                    z3 = z5;
                                }
                                if (c20125.add(1) && charArray.length == 4) {
                                    this.f72343 = charArray;
                                } else {
                                    if (c20125.add(2)) {
                                        if (charArray.length != 2) {
                                            i = 3;
                                            if (charArray.length == 3) {
                                            }
                                        }
                                        this.f72364 = charArray;
                                    } else {
                                        i = 3;
                                    }
                                    if (c20125.add(i) && charArray.length >= 5 && charArray.length <= 8) {
                                        this.f72348 = Arrays.copyOf(charArray, 8);
                                    } else {
                                        if (!c20125.add(4) || (i2 = i5 + 2) >= strArrSplit2.length || !str4.equals(C0655am.f2280aH) || !strArrSplit2[i5 + 1].equals("nu") || strArrSplit2[i2].isEmpty()) {
                                            throw new Exception(str3);
                                        }
                                        if (z7) {
                                            throw new Exception("Duplicate numbering system: ".concat(str3));
                                        }
                                        char[] charArray2 = strArrSplit2[i2].toCharArray();
                                        if (!m51361(charArray2)) {
                                            throw new Exception("Invalid numbering system: ".concat(str3));
                                        }
                                        this.f72352 = Arrays.copyOf(charArray2, 8);
                                        i5 = i2;
                                        z7 = true;
                                    }
                                }
                                i5++;
                                z4 = z8;
                                sb2 = sb3;
                                z5 = z3;
                            }
                            sb = sb2;
                            z2 = z4;
                            z = z5;
                            z4 = z2;
                            z5 = z;
                        } else {
                            sb = sb2;
                            strArrSplit = strArrSplit;
                            length = length;
                            z2 = z4;
                            z = z5;
                            if (!str3.startsWith("sw") || !str3.endsWith("dp")) {
                                if (!str3.startsWith("w") || !str3.endsWith("dp")) {
                                    if (!str3.startsWith(C0655am.f2279aG) || !str3.endsWith("dp")) {
                                        if (!str3.startsWith(C0655am.f2277aE)) {
                                            if (!matcher.reset(str3).matches()) {
                                                if (!matcher2.reset(str3).matches()) {
                                                    EnumC12270 enumC12270 = this.f72365;
                                                    EnumC12270 enumC12271 = EnumC12270.MOTOROLA_76;
                                                    if (enumC12270 != enumC12271 || !str3.startsWith("spn")) {
                                                        if (this.f72365 != enumC12271 || !str3.startsWith("gid1")) {
                                                            if (this.f72365 != enumC12271 || !str3.startsWith("mot")) {
                                                                if (!str3.startsWith("unknown")) {
                                                                    throw new Exception("Unknown config part: ".concat(str3));
                                                                }
                                                                if (z6) {
                                                                    throw new Exception("Duplicate unknown config bytes: ".concat(str3));
                                                                }
                                                                int iIndexOf = str3.indexOf(43);
                                                                if (iIndexOf < 7) {
                                                                    throw new Exception("Invalid unknown config bytes: ".concat(str3));
                                                                }
                                                                int iM51365 = iIndexOf == 7 ? 60 : m51365(str3.substring(7, iIndexOf));
                                                                byte[] bArrM30015 = AbstractC13119.m30013().mo9161().mo9157().m30015(str3.substring(iIndexOf + 1));
                                                                if (iM51365 < 4 || bArrM30015.length == 0 || ((long) iM51365) + ((long) bArrM30015.length) > 255) {
                                                                    throw new Exception("Invalid unknown config range: ".concat(str3));
                                                                }
                                                                bArr = bArrM30015;
                                                                i4 = iM51365;
                                                                z4 = z2;
                                                                z5 = z;
                                                                z6 = true;
                                                                break;
                                                            } else {
                                                                switch (str3) {
                                                                    case "motcli":
                                                                        this.f72357 = 4;
                                                                        break;
                                                                    case "motmobile":
                                                                        this.f72357 = 3;
                                                                        break;
                                                                    case "motphone":
                                                                        this.f72357 = 1;
                                                                        break;
                                                                    case "motdesk":
                                                                        this.f72357 = 2;
                                                                        break;
                                                                    default:
                                                                        if (!str3.startsWith("motuimode")) {
                                                                            throw new Exception("Unknown config part: ".concat(str3));
                                                                        }
                                                                        this.f72357 = m51365(str3.substring(9));
                                                                        break;
                                                                        break;
                                                                }
                                                            }
                                                        } else {
                                                            this.f72351 = m51365(str3.substring(4));
                                                        }
                                                    } else {
                                                        this.f72340 = m51365(str3.substring(3));
                                                    }
                                                } else {
                                                    String strGroup = matcher2.group(1);
                                                    C12826.requireNonNull(strGroup);
                                                    this.f72338 = m51360(strGroup);
                                                    String strGroup2 = matcher2.group(2);
                                                    C12826.requireNonNull(strGroup2);
                                                    this.f72346 = m51360(strGroup2);
                                                }
                                            } else {
                                                String strGroup3 = matcher.group(1);
                                                C12826.requireNonNull(strGroup3);
                                                this.f72339 = Integer.parseInt(strGroup3);
                                            }
                                        } else {
                                            short s2 = Short.parseShort(str3.substring(1));
                                            if (this.f72360 < s2) {
                                                this.f72360 = s2;
                                            }
                                            z4 = z2;
                                            z5 = true;
                                            break;
                                        }
                                    } else {
                                        this.f72345 = m51360(C17073.m38720(2, 1, str3));
                                    }
                                } else {
                                    this.f72359 = m51360(C17073.m38720(2, 1, str3));
                                }
                            } else {
                                this.f72333 = m51360(C17073.m38720(2, 2, str3));
                            }
                            z4 = z2;
                            z5 = z;
                        }
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                }
            } else {
                if (!str3.isEmpty()) {
                    throw new Exception(str2);
                }
                z4 = false;
                sb = sb2;
                strArrSplit = strArrSplit;
                length = length;
            }
            i3++;
            str2 = str;
            strArrSplit = strArrSplit;
            length = length;
            sb2 = sb;
        }
        StringBuilder sb4 = sb2;
        boolean z9 = z5;
        if (bArr != null) {
            byte[] bArrM51367 = m51367();
            int iMax = Math.max(this.f72365.f34283, bArr.length + i4);
            byte[] bArr2 = new byte[iMax];
            System.arraycopy(bArrM51367, 0, bArr2, 4, bArrM51367.length);
            for (int i6 = 0; i6 < bArr.length; i6++) {
                int i7 = i4 + i6;
                if (!z9 || i7 < 24 || i7 >= 26) {
                    int i8 = bArr2[i7] & 255;
                    if (i7 == 18) {
                        iM51343 = m51343(i8, 3);
                        iM51344 = m51343(i8, 12);
                    } else if (i7 == 28) {
                        iM51343 = m51343(i8, 15) | m51343(i8, 48);
                        iM51344 = m51343(i8, 192);
                    } else if (i7 == 29) {
                        iM51343 = m51343(i8, 15);
                        iM51344 = m51343(i8, 48);
                    } else if (i7 == 48) {
                        iM51345 = m51343(i8, 3);
                    } else if (i7 == 49) {
                        iM51343 = m51343(i8, 3);
                        iM51344 = m51343(i8, 12);
                    } else if (i8 == 0) {
                        iM51345 = 0;
                    } else {
                        iM51345 = 255;
                    }
                    iM51345 = iM51344 | iM51343;
                } else {
                    iM51345 = 255;
                }
                if (((bArr2[i7] ^ bArr[i6]) & iM51345) != 0) {
                    throw new Exception("Unknown bytes conflict with explicit qualifiers");
                }
            }
            System.arraycopy(bArr, 0, bArr2, i4, bArr.length);
            C17548.m39930(0, iMax, bArr2);
            m51352(new C5290(bArr2).m11445(0));
            this.f72361 = null;
            byte[] bArrM51368 = m51367();
            m51350(sb4.toString());
            this.f72361 = null;
            if (!Arrays.equals(bArrM51368, m51367())) {
                throw new Exception("Unknown bytes conflict with explicit qualifiers");
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m51365(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Empty unsigned config field");
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                throw new IllegalArgumentException("Invalid unsigned config field: ".concat(str));
            }
        }
        long j = Long.parseLong(str);
        if (j <= 4294967295L) {
            return (int) j;
        }
        throw new IllegalArgumentException("Config field overflow: ".concat(str));
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m51366(char[] cArr) {
        for (char c : cArr) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m51361(char[] cArr) {
        char c;
        int i = 0;
        while (i < cArr.length && (c = cArr[i]) != 0) {
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && (c < '0' || c > '9'))) {
                return false;
            }
            i++;
        }
        if (i < 3 || i > 8) {
            return false;
        }
        while (i < cArr.length) {
            if (cArr[i] != 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m51360(String str) {
        int i = Integer.parseInt(str);
        if (i < 0 || i > 65535) {
            throw new NumberFormatException(C6988.m16053("Value out of range. Value:\"", str, "\""));
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:257:0x03d9  */
    /* JADX INFO: renamed from: ܽ */
    public final String m51374() {
        if (this.f72342 == null) {
            C2582 c2582 = f72332;
            StringBuilder sb = (StringBuilder) c2582.m3892();
            if (sb == null) {
                sb = new StringBuilder();
            } else {
                sb.setLength(0);
            }
            if (this.f72356 != 0) {
                sb.append("-mcc");
                C11419.m26411(sb, this.f72356);
                short s = this.f72358;
                if (s == -1) {
                    sb.append("-mnc00");
                } else if (s != 0) {
                    sb.append("-mnc");
                    short s2 = this.f72358;
                    if (s2 <= 0 || s2 >= 10) {
                        C11419.m26411(sb, s2);
                    } else if (s2 < 0 || s2 >= 100) {
                        sb.append(String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(s2)));
                    } else {
                        sb.append((s2 / 10) % 10);
                        sb.append(s2 % 10);
                    }
                }
            } else if (this.f72358 != 0) {
                sb.append("-mnc");
                sb.append((int) this.f72358);
            }
            String strM51346 = m51346(this.f72349);
            String strM51347 = m51346(this.f72364);
            String strM51348 = m51346(this.f72343);
            String strM51349 = m51346(this.f72348);
            String strM513410 = (this.f72349[0] == 0 || !m51361(this.f72352)) ? "" : m51346(this.f72352);
            if (!strM51346.isEmpty() || !strM51347.isEmpty()) {
                if (strM51348.length() == 4 || strM51349.length() >= 5 || strM51347.length() == 3 || !strM513410.isEmpty()) {
                    sb.append("-b+");
                    if (!strM51346.isEmpty()) {
                        sb.append(strM51346);
                    }
                    if (strM51348.length() == 4) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM51348);
                    }
                    if (strM51347.length() == 2 || strM51347.length() == 3) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM51347);
                    }
                    if (strM51349.length() >= 5) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM51349.toUpperCase());
                    }
                    if (!strM513410.isEmpty()) {
                        sb.append("+u+nu+");
                        sb.append(strM513410);
                    }
                } else {
                    sb.append("-");
                    sb.append(strM51346);
                    if (!strM51347.isEmpty()) {
                        sb.append("-r");
                        sb.append(strM51347);
                    }
                }
            }
            int i = this.f72355 & 192;
            if (i == 64) {
                sb.append("-ldltr");
            } else if (i == 128) {
                sb.append("-ldrtl");
            }
            if (this.f72333 != 0) {
                sb.append("-sw");
                sb.append(this.f72333);
                sb.append("dp");
            }
            if (this.f72359 != 0) {
                sb.append("-w");
                sb.append(this.f72359);
                sb.append("dp");
            }
            if (this.f72345 != 0) {
                sb.append("-h");
                sb.append(this.f72345);
                sb.append("dp");
            }
            int i2 = this.f72355 & 15;
            if (i2 == 1) {
                sb.append("-small");
            } else if (i2 == 2) {
                sb.append("-normal");
            } else if (i2 == 3) {
                sb.append("-large");
            } else if (i2 == 4) {
                sb.append("-xlarge");
            }
            int i3 = this.f72355 & UTF8.S_P3A;
            if (i3 == 16) {
                sb.append("-notlong");
            } else if (i3 == 32) {
                sb.append("-long");
            }
            int i4 = this.f72336 & 3;
            if (i4 == 1) {
                sb.append("-notround");
            } else if (i4 == 2) {
                sb.append("-round");
            }
            int i5 = this.f72363 & 12;
            short s3 = 8;
            if (i5 == 4) {
                sb.append("-lowdr");
            } else if (i5 == 8) {
                sb.append("-highdr");
            }
            int i6 = this.f72363 & 3;
            if (i6 == 1) {
                sb.append("-nowidecg");
            } else if (i6 == 2) {
                sb.append("-widecg");
            }
            byte b = this.f72366;
            if (b == 1) {
                sb.append("-port");
            } else if (b == 2) {
                sb.append("-land");
            } else if (b == 3) {
                sb.append("-square");
            }
            switch (this.f72344 & 15) {
                case 2:
                    sb.append("-desk");
                    break;
                case 3:
                    sb.append("-car");
                    break;
                case 4:
                    sb.append("-television");
                    break;
                case 5:
                    sb.append("-appliance");
                    break;
                case 6:
                    sb.append("-watch");
                    break;
                case 7:
                    sb.append("-vrheadset");
                    break;
                case 11:
                    sb.append("-godzillaui");
                    break;
                case 12:
                    sb.append("-smallui");
                    break;
                case 13:
                    sb.append("-mediumui");
                    break;
                case 14:
                    sb.append("-largeui");
                    break;
                case 15:
                    sb.append("-hugeui");
                    break;
            }
            int i7 = this.f72344 & UTF8.S_P3A;
            if (i7 == 16) {
                sb.append("-notnight");
            } else if (i7 == 32) {
                sb.append("-night");
            }
            int i8 = this.f72339;
            if (i8 != 0) {
                if (i8 != 120) {
                    if (i8 != 160) {
                        if (i8 != 213) {
                            if (i8 != 240) {
                                if (i8 != 320) {
                                    if (i8 != 480) {
                                        if (i8 == 640) {
                                            sb.append("-xxxhdpi");
                                        } else {
                                            switch (i8) {
                                                case 65534:
                                                    sb.append("-anydpi");
                                                    break;
                                                case 65535:
                                                    sb.append("-nodpi");
                                                    break;
                                                default:
                                                    sb.append('-');
                                                    sb.append(this.f72339);
                                                    sb.append("dpi");
                                                    break;
                                            }
                                        }
                                    } else {
                                        sb.append("-xxhdpi");
                                    }
                                } else {
                                    sb.append("-xhdpi");
                                }
                            } else {
                                sb.append("-hdpi");
                            }
                        } else {
                            sb.append("-tvdpi");
                        }
                    } else {
                        sb.append("-mdpi");
                    }
                } else {
                    sb.append("-ldpi");
                }
            }
            byte b2 = this.f72334;
            if (b2 == 1) {
                sb.append("-notouch");
            } else if (b2 == 2) {
                sb.append("-stylus");
            } else if (b2 == 3) {
                sb.append("-finger");
            }
            int i9 = this.f72347 & 3;
            if (i9 == 1) {
                sb.append("-keysexposed");
            } else if (i9 == 2) {
                sb.append("-keyshidden");
            } else if (i9 == 3) {
                sb.append("-keyssoft");
            }
            byte b3 = this.f72341;
            if (b3 == 1) {
                sb.append("-nokeys");
            } else if (b3 == 2) {
                sb.append("-qwerty");
            } else if (b3 == 3) {
                sb.append("-12key");
            }
            int i10 = this.f72347 & 12;
            if (i10 == 4) {
                sb.append("-navexposed");
            } else if (i10 == 8) {
                sb.append("-navhidden");
            }
            byte b4 = this.f72353;
            if (b4 == 1) {
                sb.append("-nonav");
            } else if (b4 == 2) {
                sb.append("-dpad");
            } else if (b4 == 3) {
                sb.append("-trackball");
            } else if (b4 == 4) {
                sb.append("-wheel");
            }
            byte b5 = this.f72350;
            if (b5 == 1) {
                sb.append("-neuter");
            } else if (b5 == 2) {
                sb.append("-feminine");
            } else if (b5 == 3) {
                sb.append("-masculine");
            }
            if (this.f72338 != 0 && this.f72346 != 0) {
                sb.append('-');
                sb.append(this.f72338);
                sb.append('x');
                sb.append(this.f72346);
            }
            short s4 = this.f72360;
            if (s4 > 0) {
                byte b6 = this.f72344;
                if ((b6 & 15) != 7) {
                    byte b7 = this.f72363;
                    if ((b7 & 3) != 0 || (b7 & 12) != 0) {
                        s3 = 26;
                    } else if ((this.f72336 & 3) != 0) {
                        s3 = 23;
                    } else {
                        int i11 = this.f72339;
                        if (i11 == 65534) {
                            s3 = 21;
                        } else if (this.f72333 != 0 || this.f72359 != 0 || this.f72345 != 0) {
                            s3 = 13;
                        } else if ((b6 & 63) == 0) {
                            s3 = ((this.f72355 & 63) == 0 && i11 == 0) ? (short) 0 : (short) 4;
                        }
                    }
                } else {
                    s3 = 26;
                }
                if (s4 >= s3) {
                    sb.append("-v");
                    sb.append((int) this.f72360);
                }
            }
            if (this.f72365 == EnumC12270.MOTOROLA_76) {
                if (this.f72340 != 0) {
                    sb.append("-spn");
                    sb.append(((long) this.f72340) & 4294967295L);
                }
                if (this.f72351 != 0) {
                    sb.append("-gid1");
                    sb.append(((long) this.f72351) & 4294967295L);
                }
                int i12 = this.f72357;
                if (i12 != 0) {
                    if (i12 == 1) {
                        sb.append("-motphone");
                    } else if (i12 == 2) {
                        sb.append("-motdesk");
                    } else if (i12 == 3) {
                        sb.append("-motmobile");
                    } else if (i12 == 4) {
                        sb.append("-motcli");
                    } else {
                        sb.append("-motuimode");
                        sb.append(((long) this.f72357) & 4294967295L);
                    }
                }
            }
            int i13 = this.f72365.f34283;
            if (m51366(this.f72352) || (this.f72349[0] != 0 && m51361(this.f72352))) {
                for (byte b8 : this.f72337) {
                    if (b8 != 0) {
                        i13 = this.f72365.f34283 - 3;
                    }
                }
            } else {
                i13 = this.f72365.f34283 - 11;
            }
            if (i13 < this.f72365.f34283 || this.f72354 != null) {
                byte[] bArrM51367 = m51367();
                sb.append("-unknown");
                sb.append(i13);
                sb.append('+');
                sb.append(AbstractC13119.m30013().mo9161().mo9157().m30014(Arrays.copyOfRange(bArrM51367, i13 - 4, bArrM51367.length)));
            }
            String string = sb.toString();
            c2582.m3890(sb);
            this.f72342 = string;
        }
        return this.f72342;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51353(byte[] bArr, char[] cArr, char c) {
        if (cArr.length == 2) {
            bArr[0] = (byte) cArr[0];
            bArr[1] = (byte) cArr[1];
        } else {
            if (cArr.length == 3) {
                int i = (((cArr[2] - c) & 31) << 10) | 32768 | (((cArr[1] - c) & 31) << 5) | ((cArr[0] - c) & 31);
                bArr[0] = (byte) ((i >> 8) & 255);
                bArr[1] = (byte) (i & 255);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m51373(C22999 c22999) {
        int i = this.f72356 != c22999.f72356 ? 1 : 0;
        if (this.f72358 != c22999.f72358) {
            i |= 2;
        }
        if (!Arrays.equals(this.f72349, c22999.f72349) || !Arrays.equals(this.f72364, c22999.f72364)) {
            i |= 4;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                if (!Arrays.equals(this.f72348, c22999.f72348) || !Arrays.equals(this.f72352, c22999.f72352)) {
                    break;
                }
                break;
            }
            if ((this.f72335 != 0 ? (char) 0 : this.f72343[i2]) == (c22999.f72335 != 0 ? (char) 0 : c22999.f72343[i2])) {
                i2++;
            }
            i |= 4;
            break;
        }
        if (this.f72366 != c22999.f72366) {
            i |= 128;
        }
        if (this.f72339 != c22999.f72339) {
            i |= 256;
        }
        if (this.f72334 != c22999.f72334) {
            i |= 8;
        }
        if (((this.f72347 ^ c22999.f72347) & 15) != 0) {
            i |= 32;
        }
        if (this.f72341 != c22999.f72341) {
            i |= 16;
        }
        if (this.f72353 != c22999.f72353) {
            i |= 64;
        }
        if (this.f72338 != c22999.f72338 || this.f72346 != c22999.f72346 || this.f72359 != c22999.f72359 || this.f72345 != c22999.f72345) {
            i |= 512;
        }
        if (this.f72360 != c22999.f72360) {
            i |= 1024;
        }
        byte b = this.f72355;
        byte b2 = c22999.f72355;
        if (((b ^ b2) & 192) != 0) {
            i |= 16384;
        }
        if (((b ^ b2) & 63) != 0) {
            i |= 2048;
        }
        if (((this.f72336 ^ c22999.f72336) & 3) != 0) {
            i |= 32768;
        }
        if (((this.f72363 ^ c22999.f72363) & 15) != 0) {
            i |= 65536;
        }
        if (this.f72344 != c22999.f72344) {
            i |= 4096;
        }
        if (this.f72333 != c22999.f72333) {
            i |= 8192;
        }
        if (this.f72350 != c22999.f72350) {
            i |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
        EnumC12270 enumC12270 = this.f72365;
        if (enumC12270 == EnumC12270.MOTOROLA_76 && c22999.f72365 == enumC12270) {
            if (this.f72340 != c22999.f72340) {
                i |= 262144;
            }
            if (this.f72351 != c22999.f72351) {
                i |= 524288;
            }
            if (this.f72357 != c22999.f72357) {
                return 1048576 | i;
            }
        }
        return i;
    }

    public final String toString() {
        if (m51374().isEmpty()) {
            return "[DEFAULT]";
        }
        String strM51374 = m51374();
        return strM51374.charAt(0) == '-' ? strM51374.substring(1) : strM51374;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C22999.class != obj.getClass()) {
            return false;
        }
        C22999 c22999 = (C22999) obj;
        return this.f72365 == c22999.f72365 && this.f72335 == c22999.f72335 && m51374().equals(c22999.m51374());
    }

    public final int hashCode() {
        return m51374().hashCode() + (((this.f72365.hashCode() * 31) + this.f72335) * 31);
    }

    public final Object clone() {
        try {
            return (C22999) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:412:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:414:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:416:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:417:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:420:0x03de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:421:0x03df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012b, code lost:
    
        if ((r10.f72333 != 0) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0149, code lost:
    
        if ((r10.m51358() != 0) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0187, code lost:
    
        if ((r10.f72355 != 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01e0, code lost:
    
        if ((r10.f72336 != 0) != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x020a, code lost:
    
        if ((r10.f72363 != 0) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x025c, code lost:
    
        if ((r10.f72344 != 0) != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x029f, code lost:
    
        if ((r10.m51364() != 0) != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0311, code lost:
    
        if ((r10.m51357() != 0) != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x038b, code lost:
    
        if ((r10.m51359() != 0) != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f9, code lost:
    
        if ((r10.f72355 != 0) != false) goto L79;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m51372(C22999 c22999, C22999 c229910) {
        boolean zEquals;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        short s;
        short s2;
        boolean z;
        boolean z2 = false;
        if (m51363() != 0 || c22999.m51363() != 0) {
            short s3 = this.f72356;
            if (s3 != c22999.f72356 && c229910.f72356 != 0) {
                if (s3 != 0) {
                    return true;
                }
                return false;
            }
            short s4 = this.f72358;
            if (s4 != c22999.f72358 && c229910.f72358 != 0) {
                if (s4 != 0) {
                    return true;
                }
                return false;
            }
        }
        if (c229910.m51368() == 0 || (m51368() == 0 && c22999.m51368() == 0)) {
            zEquals = false;
        } else if (!m51362(this.f72349, c22999.f72349)) {
            if (m51354(c229910.f72349, f72325)) {
                char[] cArr = c229910.f72364;
                char[] cArr2 = f72327;
                if (m51354(cArr, cArr2)) {
                    if (this.f72349[0] != 0) {
                        char[] cArr3 = this.f72364;
                        if (cArr3[0] == 0 || m51354(cArr3, cArr2)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else {
                        char[] cArr4 = c22999.f72364;
                        if (cArr4[0] == 0 || m51354(cArr4, cArr2)) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    }
                } else if (C9984.m23297(c229910.f72364)) {
                    if (this.f72349[0] != 0) {
                        zEquals = C9984.m23297(this.f72364);
                    } else {
                        zEquals = !C9984.m23297(c22999.f72364);
                    }
                } else if (this.f72349[0] != 0) {
                    zEquals = true;
                } else {
                    zEquals = false;
                }
            } else if (this.f72349[0] != 0) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else {
            int iM23293 = C9984.m23293(this.f72364, c22999.f72364, c229910.f72349, m51346(c229910.f72343), c229910.f72364);
            if (iM23293 == 0) {
                zEquals = Arrays.equals(this.f72348, c229910.f72348);
                if (zEquals == Arrays.equals(c22999.f72348, c229910.f72348)) {
                    if (!m51354(this.f72349, c229910.f72349) || m51354(c22999.f72349, c229910.f72349)) {
                        zEquals = false;
                    } else {
                        zEquals = true;
                    }
                }
            } else if (iM23293 > 0) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        }
        if (!zEquals) {
            byte b = this.f72355;
            if (!(b != 0)) {
            }
            byte b2 = c22999.f72355;
            if (((b ^ b2) & 192) != 0) {
                if ((c229910.f72355 & 192) != 0) {
                    if ((b & 192) <= (b2 & 192)) {
                        return false;
                    }
                }
            }
            int i6 = this.f72333;
            if (!(i6 != 0)) {
            }
            int i7 = c22999.f72333;
            if (i6 != i7) {
                if (i6 <= i7) {
                    return false;
                }
            }
            if (!(m51358() != 0)) {
            }
            int i8 = c229910.f72359;
            if (i8 != 0) {
                i2 = i8 - this.f72359;
                i = i8 - c22999.f72359;
            } else {
                i = 0;
                i2 = 0;
            }
            int i9 = c229910.f72345;
            if (i9 != 0) {
                i2 += i9 - this.f72345;
                i += i9 - c22999.f72345;
            }
            if (i2 != i) {
                if (i2 >= i) {
                    return false;
                }
            }
            byte b3 = this.f72355;
            int i10 = 2;
            if (!(b3 != 0)) {
            }
            byte b4 = c22999.f72355;
            int i11 = b3 ^ b4;
            if ((i11 & 15) != 0) {
                int i12 = c229910.f72355 & 15;
                if (i12 != 0) {
                    int i13 = b3 & 15;
                    int i14 = b4 & 15;
                    if (i12 >= 2) {
                        i3 = i13 == 0 ? 2 : i13;
                        if (i14 != 0) {
                        }
                        if (i3 == i10 ? i3 <= i10 : i13 == 0) {
                            return false;
                        }
                    } else {
                        i3 = i13;
                    }
                    i10 = i14;
                    if (i3 == i10) {
                        return false;
                    }
                    return false;
                }
            }
            if ((i11 & 48) != 0) {
                if ((c229910.f72355 & UTF8.S_P3A) != 0) {
                    if ((b3 & UTF8.S_P3A) == 0) {
                        return false;
                    }
                }
            }
            byte b5 = this.f72336;
            if (!(b5 != 0)) {
            }
            if (((c22999.f72336 ^ b5) & 3) != 0) {
                if ((c229910.f72336 & 3) != 0) {
                    if ((b5 & 3) == 0) {
                        return false;
                    }
                }
            }
            byte b6 = this.f72363;
            if (!(b6 != 0)) {
            }
            int i15 = c22999.f72363 ^ b6;
            if ((i15 & 3) != 0) {
                if ((c229910.f72363 & 3) != 0) {
                    if ((b6 & 3) == 0) {
                        return false;
                    }
                }
            }
            if ((i15 & 12) != 0) {
                if ((c229910.f72363 & 12) != 0) {
                    if ((b6 & 12) == 0) {
                        return false;
                    }
                }
            }
            byte b7 = this.f72366;
            if (b7 != c22999.f72366) {
                if (c229910.f72366 != 0) {
                    if (b7 == 0) {
                        return false;
                    }
                }
            }
            byte b8 = this.f72344;
            if (!(b8 != 0)) {
            }
            int i16 = c22999.f72344 ^ b8;
            if ((i16 & 15) != 0) {
                if ((c229910.f72344 & 15) != 0) {
                    if ((b8 & 15) == 0) {
                        return false;
                    }
                }
            }
            if ((i16 & 48) != 0) {
                if ((c229910.f72344 & UTF8.S_P3A) != 0) {
                    if ((b8 & UTF8.S_P3A) == 0) {
                        return false;
                    }
                }
            }
            if (!(m51364() != 0)) {
            }
            int i17 = this.f72339;
            int i18 = c22999.f72339;
            if (i17 == i18) {
                byte b9 = this.f72334;
                if (b9 != c22999.f72334) {
                    if (c229910.f72334 != 0) {
                        if (b9 == 0) {
                            return false;
                        }
                    }
                }
                if (!(m51357() != 0)) {
                }
                byte b10 = this.f72347;
                int i19 = b10 & 3;
                byte b11 = c22999.f72347;
                int i20 = b11 & 3;
                if (i19 != i20) {
                    int i21 = c229910.f72347 & 3;
                    if (i21 != 0) {
                        if (i19 != 0) {
                            if (i20 != 0 && i21 != i19) {
                                if (i21 != i20) {
                                }
                            }
                        }
                        return false;
                    }
                }
                int i22 = b10 & 12;
                int i23 = b11 & 12;
                if (i22 != i23) {
                    if ((c229910.f72347 & 12) != 0) {
                        if (i22 != 0) {
                            if (i23 != 0) {
                            }
                        }
                        return false;
                    }
                }
                byte b12 = this.f72341;
                if (b12 != c22999.f72341) {
                    if (c229910.f72341 != 0) {
                        if (b12 == 0) {
                            return false;
                        }
                    }
                }
                byte b13 = this.f72353;
                if (b13 != c22999.f72353) {
                    if (c229910.f72353 != 0) {
                        if (b13 == 0) {
                            return false;
                        }
                    }
                }
                if (!(m51359() != 0)) {
                }
                int i24 = c229910.f72338;
                if (i24 != 0) {
                    i5 = i24 - this.f72338;
                    i4 = i24 - c22999.f72338;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i25 = c229910.f72346;
                if (i25 != 0) {
                    i5 += i25 - this.f72346;
                    i4 += i25 - c22999.f72346;
                }
                if (i5 != i4) {
                    if (i5 >= i4) {
                        return false;
                    }
                }
                if (m51356() != 0) {
                    s = this.f72360;
                    s2 = c22999.f72360;
                    if (s != s2) {
                        if (c229910.f72360 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z || s <= s2) {
                        }
                    }
                } else {
                    if (c22999.m51356() != 0) {
                        s = this.f72360;
                        s2 = c22999.f72360;
                        if (s != s2) {
                            if (c229910.f72360 != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                            }
                        }
                    }
                }
                return false;
            }
            boolean z3 = i17 != 0;
            int i26 = DHParameters.DEFAULT_MINIMUM_LENGTH;
            if (!z3) {
                i17 = DHParameters.DEFAULT_MINIMUM_LENGTH;
            }
            if (!(i18 != 0)) {
                i18 = DHParameters.DEFAULT_MINIMUM_LENGTH;
            }
            if (i17 != 65534) {
                if (i18 != 65534) {
                    int i27 = c229910.f72339;
                    if (i27 != 0 && i27 != 65534) {
                        i26 = i27;
                    }
                    if (i18 > i17) {
                        int i28 = i18;
                        i18 = i17;
                        i17 = i28;
                    } else {
                        z2 = true;
                    }
                    return (i26 < i17 && (i18 >= i26 || ((i18 * 2) - i26) * i17 > i26 * i26)) ? !z2 : z2;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:124:0x0159  */
    /* JADX WARN: Code duplicated, block: B:126:0x015f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0171  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:126:0x015f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ܽ */
    public final boolean m51375(p067l.C22999 r10) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C22999.m51375(l.᩸ܽܽ):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX INFO: renamed from: ֫ */
    public static C22999 m51347(Resources resources) {
        C22999 c22999 = new C22999();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 26 ? configuration.colorMode : 0;
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        if (i3 >= i4) {
            i3 = i4;
            i4 = i3;
        }
        int i5 = configuration.keyboardHidden;
        if (i5 == 1 && configuration.hardKeyboardHidden == 2) {
            i5 = 3;
        }
        int i6 = configuration.mcc;
        int i7 = configuration.mnc;
        Locale locale = configuration.locale;
        int i8 = configuration.orientation;
        int i9 = configuration.touchscreen;
        int i10 = configuration.densityDpi;
        int i11 = configuration.keyboard;
        int i12 = configuration.navigation;
        int i13 = configuration.smallestScreenWidthDp;
        int i14 = configuration.screenWidthDp;
        int i15 = configuration.screenHeightDp;
        int i16 = i2;
        int i17 = configuration.screenLayout;
        int i18 = configuration.uiMode;
        c22999.f72356 = (short) i6;
        c22999.f72358 = (short) i7;
        c22999.f72366 = (byte) i8;
        c22999.f72334 = (byte) i9;
        c22999.f72339 = (short) i10;
        c22999.f72341 = (byte) i11;
        c22999.f72347 = (byte) i5;
        c22999.f72353 = (byte) i12;
        c22999.f72338 = (short) i4;
        c22999.f72346 = (short) i3;
        c22999.f72333 = (short) i13;
        c22999.f72359 = (short) i14;
        c22999.f72345 = (short) i15;
        c22999.f72355 = (byte) i17;
        c22999.f72344 = (byte) i18;
        c22999.f72363 = (byte) i16;
        c22999.f72360 = (short) i;
        if (locale != null) {
            String language = locale.getLanguage();
            language.getClass();
            switch (language) {
                case "he":
                    language = "iw";
                    break;
                case "id":
                    language = "in";
                    break;
                case "yi":
                    language = "ji";
                    break;
            }
            m51351(language, c22999.f72349);
            m51351(locale.getCountry(), c22999.f72364);
            m51351(locale.getScript(), c22999.f72343);
            m51351(locale.getVariant(), c22999.f72348);
        }
        c22999.f72336 = (byte) ((i17 & 768) >> 8);
        return c22999;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m51346(char[] cArr) {
        int i = 0;
        while (i < cArr.length) {
            if (cArr[i] == 0) {
                return i == 0 ? "" : new String(cArr, 0, i);
            }
            i++;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51351(String str, char[] cArr) {
        int iMin = Math.min(str.length(), cArr.length);
        Arrays.fill(cArr, (char) 0);
        for (int i = 0; i < iMin; i++) {
            cArr[i] = str.charAt(i);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private int m51363() {
        return ((this.f72356 & HPKE.aead_EXPORT_ONLY) << 16) | (65535 & this.f72358);
    }

    /* JADX INFO: renamed from: ᩷ */
    private int m51368() {
        char[] cArr = this.f72349;
        int i = ((cArr[1] & 255) << 16) | ((cArr[0] & 255) << 24);
        char[] cArr2 = this.f72364;
        return i | ((cArr2[0] & 255) << 8) | (cArr2[1] & 255);
    }

    /* JADX INFO: renamed from: ۡ */
    private int m51358() {
        return ((this.f72359 & 65535) << 16) | (65535 & this.f72345);
    }

    /* JADX INFO: renamed from: ܺ */
    private int m51364() {
        return ((this.f72366 & 255) << 24) | ((this.f72334 & 255) << 16) | (this.f72339 & 65535);
    }

    /* JADX INFO: renamed from: ۜ */
    private int m51357() {
        return ((this.f72341 & 255) << 24) | ((this.f72353 & 255) << 16) | ((this.f72347 & 255) << 8);
    }

    /* JADX INFO: renamed from: ۖ */
    private int m51356() {
        return (this.f72360 & HPKE.aead_EXPORT_ONLY) << 16;
    }

    /* JADX INFO: renamed from: ۢ */
    private int m51359() {
        return ((this.f72338 & 65535) << 16) | (65535 & this.f72346);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m51362(char[] cArr, char[] cArr2) {
        if (m51354(cArr, cArr2)) {
            return true;
        }
        char[] cArr3 = f72328;
        boolean zM51354 = m51354(cArr, cArr3);
        char[] cArr4 = f72329;
        if (zM51354 && m51354(cArr2, cArr4)) {
            return true;
        }
        return m51354(cArr, cArr4) && m51354(cArr2, cArr3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m51354(char[] cArr, char[] cArr2) {
        return cArr[0] == cArr2[0] && cArr[1] == cArr2[1];
    }
}
