package l;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.timepicker.TimeModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
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
public final class C21707 implements Cloneable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public byte f69630;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f69635;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f69646;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f69652;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f69656;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final C0225 f69627 = new C0225(2);

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f69625 = Pattern.compile("(\\d+)x(\\d+)");

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f69626 = Pattern.compile("(\\d+)dpi");

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final int[][] f69621 = {new int[]{19, 1}, new int[]{12, 4}, new int[]{16, 3}, new int[]{20, 4}, new int[]{24, 4}, new int[]{28, 1}, new int[]{48, 1}, new int[]{49, 1}, new int[]{29, 1}, new int[]{30, 2}, new int[]{32, 4}};

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f69620 = {'e', 'n'};

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f69622 = {'U', 'S'};

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final char[] f69624 = {173, 5};

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final char[] f69623 = {'t', 'l'};

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public EnumC10418 f69660 = EnumC10418.AOSP;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f69632 = new byte[3];

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public short f69651 = 0;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public short f69653 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public char[] f69644 = new char[2];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char[] f69659 = new char[2];

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public byte f69661 = 0;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public byte f69629 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69634 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte f69636 = 0;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public byte f69648 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f69642 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f69645 = 0;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f69633 = 0;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f69641 = 0;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public short f69655 = 0;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public byte f69650 = 0;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public byte f69639 = 0;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f69628 = 0;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f69654 = 0;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f69640 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public char[] f69638 = new char[4];

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public char[] f69643 = new char[8];

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public byte f69631 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f69658 = 0;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public short f69657 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f69647 = new char[8];

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public byte[] f69649 = null;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public String f69637 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48994(int i, int i2) {
        if ((i & i2) == 0) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char[] m49006(byte b, byte b2, char c) {
        if (((b >> 7) & 1) != 1) {
            return new char[]{(char) b, (char) b2};
        }
        return new char[]{(char) ((b2 & bo.j) + c), (char) (((b2 & bo.k) >> 5) + ((b & 3) << 3) + c), (char) (((b & 124) >> 2) + c)};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21707 m49000(C5896 c5896, EnumC10418 enumC10418) throws IOException {
        C21707 c21707 = new C21707();
        C11003.requireNonNull(enumC10418);
        c21707.f69660 = enumC10418;
        c21707.m49003(c5896);
        return c21707;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21707 m48999(String str, EnumC10418 enumC10418) throws Exception {
        C21707 c21707 = new C21707();
        C11003.requireNonNull(enumC10418);
        c21707.f69660 = enumC10418;
        c21707.m49001(str);
        return c21707;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC10418 m49021() {
        return this.f69660;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private byte[] m49018() {
        int length;
        byte[] bArr = this.f69656;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = this.f69649;
        byte[] bArr3 = this.f69632;
        if (bArr2 != null) {
            length = this.f69660.f31318 + bArr2.length;
        } else {
            if (this.f69635 != 0 || this.f69646 != 0 || this.f69652 != 0 || this.f69630 != 0 || !m49017(this.f69647)) {
                length = this.f69660.f31318;
                break;
            }
            int length2 = bArr3.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    if (this.f69631 != 0 || this.f69658 != 0 || this.f69657 != 0) {
                        length = 52;
                        break;
                    }
                    if (!m49017(this.f69638) || !m49017(this.f69643)) {
                        length = 48;
                        break;
                    }
                    if (this.f69654 != 0 || this.f69640 != 0) {
                        length = 36;
                        break;
                    }
                    if (this.f69650 != 0 || this.f69639 != 0 || this.f69628 != 0) {
                        length = 32;
                        break;
                    }
                    length = 28;
                    break;
                }
                if (bArr3[i] != 0) {
                    length = this.f69660.f31318;
                    break;
                }
                i++;
            }
        }
        int i2 = length - 4;
        C10130 c10130 = new C10130(i2);
        c10130.mo13229(this.f69651);
        c10130.mo13229(this.f69653);
        byte[] bArr4 = new byte[2];
        m49004(bArr4, this.f69644, 'a');
        c10130.write(bArr4, 0, 2);
        m49004(bArr4, this.f69659, '0');
        c10130.write(bArr4, 0, 2);
        c10130.writeByte(this.f69661);
        c10130.writeByte(this.f69629);
        c10130.mo13231(this.f69634);
        c10130.writeByte(this.f69636);
        c10130.writeByte(this.f69648);
        c10130.writeByte(this.f69642);
        c10130.writeByte(this.f69645);
        c10130.mo13231(this.f69633);
        c10130.mo13231(this.f69641);
        c10130.mo13229(this.f69655);
        c10130.mo13229((short) 0);
        if (length >= 32) {
            c10130.writeByte(this.f69650);
            c10130.writeByte(this.f69639);
            c10130.mo13231(this.f69628);
        }
        if (length >= 36) {
            c10130.mo13231(this.f69654);
            c10130.mo13231(this.f69640);
        }
        if (length >= 48) {
            byte[] bArr5 = new byte[12];
            for (int i3 = 0; i3 < 4; i3++) {
                bArr5[i3] = (byte) this.f69638[i3];
            }
            for (int i4 = 0; i4 < 8; i4++) {
                bArr5[i4 + 4] = (byte) this.f69643[i4];
            }
            c10130.write(bArr5, 0, 12);
        }
        if (length >= 52) {
            c10130.writeByte(this.f69631);
            c10130.writeByte(this.f69658);
            c10130.mo13229(this.f69657);
        }
        EnumC10418 enumC10418 = this.f69660;
        if (enumC10418 == EnumC10418.MOTOROLA_76 && length >= enumC10418.f31318) {
            c10130.writeInt(this.f69635);
            c10130.writeInt(this.f69646);
            c10130.writeInt(this.f69652);
        }
        if (length >= this.f69660.f31318) {
            c10130.writeByte(this.f69630);
            for (char c : this.f69647) {
                c10130.writeByte((byte) c);
            }
            c10130.write(bArr3);
        }
        if (length > this.f69660.f31318) {
            c10130.write(this.f69649);
        }
        byte[] bArrM25444 = c10130.m25444();
        this.f69656 = bArrM25444;
        if (bArrM25444.length == i2) {
            return bArrM25444;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m49020(C21707 c21707) {
        int iCompare;
        byte[] bArrM49018 = m49018();
        byte[] bArrM49019 = c21707.m49018();
        int iM48995 = m48995(4, 4, bArrM49018, bArrM49019);
        if (iM48995 != 0) {
            return iM48995;
        }
        int iM48996 = m48995(8, 4, bArrM49018, bArrM49019);
        if (iM48996 != 0) {
            return iM48996;
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
                    iCompare = Integer.compare(m48996(i3, bArrM49018), m48996(i3, bArrM49019));
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
                    iCompare2 = Integer.compare(this.f69647[i4], c21707.f69647[i4]);
                }
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                for (int[] iArr : f69621) {
                    int iM48997 = m48995(iArr[0], iArr[1], bArrM49018, bArrM49019);
                    if (iM48997 != 0) {
                        return iM48997;
                    }
                }
                int iCompare3 = Integer.compare(this.f69660.ordinal(), c21707.f69660.ordinal());
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                if (this.f69660 == EnumC10418.MOTOROLA_76) {
                    for (int i5 = 52; i5 < 64; i5 += 4) {
                        int iM48998 = m48995(i5, 4, bArrM49018, bArrM49019);
                        if (iM48998 != 0) {
                            return iM48998;
                        }
                    }
                }
                return 0;
            }
            int iCompare4 = Integer.compare(this.f69630 != 0 ? 0 : m48996(i, bArrM49018), c21707.f69630 == 0 ? m48996(i, bArrM49019) : 0);
            if (iCompare4 != 0) {
                return iCompare4;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48996(int i, byte[] bArr) {
        int i2 = i - 4;
        if (i2 < bArr.length) {
            return bArr[i2] & 255;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48995(int i, int i2, byte[] bArr, byte[] bArr2) {
        int iCompare;
        do {
            i2--;
            if (i2 < 0) {
                return 0;
            }
            int i3 = i + i2;
            iCompare = Integer.compare(m48996(i3, bArr), m48996(i3, bArr2));
        } while (iCompare == 0);
        return iCompare;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m49027() {
        return m49018().length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49022(InterfaceC4485 interfaceC4485) {
        byte[] bArrM49018 = m49018();
        interfaceC4485.writeInt(bArrM49018.length + 4);
        interfaceC4485.write(bArrM49018);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49003(C5896 c5896) throws IOException {
        int i;
        int iM16535 = c5896.m16535();
        if (iM16535 < 8) {
            throw new IOException(C18307.m42645(iM16535, "Config size = ", " is too small"));
        }
        if (iM16535 > 255) {
            iM16535 = Math.min(this.f69660.f31318, c5896.m16525());
        }
        byte[] bArr = new byte[iM16535 - 4];
        try {
            c5896.m16526(bArr);
            C12951 c12951 = new C12951(bArr);
            this.f69651 = c12951.readShort();
            this.f69653 = c12951.readShort();
            if (iM16535 >= 12) {
                this.f69644 = m49006(c12951.readByte(), c12951.readByte(), 'a');
                this.f69659 = m49006(c12951.readByte(), c12951.readByte(), '0');
            } else {
                this.f69644 = new char[2];
                this.f69659 = new char[2];
            }
            if (iM16535 >= 14) {
                this.f69661 = c12951.readByte();
                this.f69629 = c12951.readByte();
            }
            if (iM16535 >= 16) {
                this.f69634 = c12951.m31494();
            }
            if (iM16535 >= 28) {
                this.f69636 = c12951.readByte();
                this.f69648 = c12951.readByte();
                this.f69642 = c12951.readByte();
                this.f69645 = c12951.readByte();
                this.f69633 = c12951.m31494();
                this.f69641 = c12951.m31494();
                this.f69655 = c12951.readShort();
                c12951.skipBytes(2);
            }
            if (iM16535 >= 32) {
                this.f69650 = c12951.readByte();
                this.f69639 = c12951.readByte();
                this.f69628 = c12951.m31494();
            }
            if (iM16535 >= 36) {
                this.f69654 = c12951.m31494();
                this.f69640 = c12951.m31494();
            }
            if (iM16535 >= 48) {
                char[] cArr = new char[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    cArr[i2] = (char) c12951.readByte();
                }
                this.f69638 = cArr;
                char[] cArr2 = new char[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    cArr2[i3] = (char) c12951.readByte();
                }
                this.f69643 = cArr2;
            }
            if (iM16535 >= 52) {
                this.f69631 = c12951.readByte();
                this.f69658 = c12951.readByte();
                this.f69657 = c12951.readShort();
            }
            if (this.f69660 == EnumC10418.MOTOROLA_76 && iM16535 > 52) {
                if (iM16535 < 76) {
                    throw new IOException("Truncated Motorola config");
                }
                this.f69635 = c12951.readInt();
                this.f69646 = c12951.readInt();
                this.f69652 = c12951.readInt();
            }
            int i4 = this.f69660.f31318 - 12;
            if (iM16535 > i4) {
                this.f69630 = c12951.readByte();
                int i5 = 0;
                while (true) {
                    i = iM16535 - i4;
                    if (i5 >= Math.min(8, i - 1)) {
                        break;
                    }
                    this.f69647[i5] = (char) (c12951.readByte() & 255);
                    i5++;
                }
                for (int i6 = 0; i6 < Math.min(3, i - 9); i6++) {
                    this.f69632[i6] = c12951.readByte();
                }
            }
            int i7 = iM16535 - this.f69660.f31318;
            if (i7 > 0) {
                byte[] bArr2 = new byte[i7];
                c12951.m31489(i7, bArr2);
                for (int i8 = 0; i8 < i7; i8++) {
                    if (bArr2[i8] != 0) {
                        this.f69649 = bArr2;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49001(String str) throws Exception {
        int iM48994;
        int iM48995;
        int iM48996;
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
        Matcher matcher = f69626.matcher("");
        Matcher matcher2 = f69625.matcher("");
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
                            b = cb.k;
                        } else {
                            b = -1;
                        }
                        break;
                    case -900164407:
                        if (str3.equals("mediumui")) {
                            b = cb.f77931l;
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
                            b = bo.j;
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
                        this.f69639 = (byte) (this.f69639 | 12);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 1:
                        this.f69639 = (byte) (this.f69639 | 5);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 2:
                        this.f69634 = 640;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 3:
                        this.f69634 = 65534;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 4:
                        this.f69639 = (byte) (this.f69639 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 5:
                        this.f69629 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 6:
                        this.f69658 = (byte) (this.f69658 | 8);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 7:
                        this.f69639 = (byte) (this.f69639 | 15);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 8:
                        this.f69642 = (byte) (this.f69642 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 9:
                        this.f69645 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 10:
                        this.f69636 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 11:
                        this.f69650 = (byte) (this.f69650 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 12:
                        this.f69636 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 13:
                        this.f69639 = (byte) (this.f69639 | 7);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 14:
                        this.f69639 = (byte) (this.f69639 | cb.k);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 15:
                        this.f69661 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 16:
                        this.f69629 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 17:
                        this.f69658 = (byte) (this.f69658 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 18:
                        this.f69650 = (byte) (this.f69650 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 19:
                        this.f69634 = 480;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 20:
                        this.f69645 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 21:
                        this.f69639 = (byte) (this.f69639 | cb.f77931l);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 22:
                        this.f69639 = (byte) (this.f69639 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 23:
                        this.f69639 = (byte) (this.f69639 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 24:
                        this.f69648 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 25:
                        this.f69634 = 240;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 26:
                        this.f69661 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 27:
                        this.f69634 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 28:
                        this.f69650 = (byte) (this.f69650 | UTF8.S_CS3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 29:
                        this.f69634 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 30:
                        this.f69661 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 31:
                        this.f69645 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 32:
                        this.f69636 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 33:
                        this.f69650 = (byte) (this.f69650 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 34:
                        this.f69650 = (byte) (this.f69650 | 64);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 35:
                        this.f69650 = (byte) (this.f69650 | GCMSIVBlockCipher.MASK);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 36:
                        this.f69658 = (byte) (this.f69658 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 37:
                        this.f69639 = (byte) (this.f69639 | UTF8.S_CS3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 38:
                        this.f69634 = 65535;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 39:
                        this.f69648 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 40:
                        this.f69631 = (byte) (this.f69631 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 41:
                        this.f69650 = (byte) (this.f69650 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 42:
                        this.f69634 = 213;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 43:
                        this.f69639 = (byte) (this.f69639 | 6);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 44:
                        this.f69648 = (byte) 4;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        this.f69634 = 320;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 46:
                        this.f69642 = (byte) (this.f69642 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 47:
                        this.f69639 = (byte) (this.f69639 | 11);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 48:
                        this.f69642 = (byte) (this.f69642 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 49:
                        this.f69642 = (byte) (this.f69642 | 8);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 50:
                        this.f69648 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 51:
                        this.f69642 = (byte) (this.f69642 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 52:
                        this.f69639 = (byte) (this.f69639 | 16);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 53:
                        this.f69631 = (byte) (this.f69631 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        this.f69658 = (byte) (this.f69658 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        this.f69650 = (byte) (this.f69650 | 16);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 56:
                        this.f69629 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    default:
                        if (str3.startsWith("mcc")) {
                            this.f69651 = Short.parseShort(str3.substring(3));
                        } else if (str3.startsWith("mnc")) {
                            short s = Short.parseShort(str3.substring(3));
                            this.f69653 = s;
                            if (s == 0) {
                                this.f69653 = (short) -1;
                            }
                        } else if (str3.matches("[a-z]{2,3}")) {
                            this.f69644 = str3.toCharArray();
                        } else if (str3.matches("r[A-Z0-9]{2}")) {
                            this.f69659 = str3.substring(1).toCharArray();
                        } else if (str3.startsWith("b+")) {
                            String[] strArrSplit2 = str3.substring(2).split("\\+");
                            C18683 c18683 = new C18683(4);
                            int i5 = 0;
                            while (i5 < strArrSplit2.length) {
                                String str4 = strArrSplit2[i5];
                                boolean z8 = z4;
                                char[] charArray = str4.toCharArray();
                                StringBuilder sb3 = sb2;
                                if (c18683.add(0)) {
                                    z3 = z5;
                                    if (charArray.length == 2 || charArray.length == 3) {
                                        this.f69644 = charArray;
                                    }
                                    i5++;
                                    z4 = z8;
                                    sb2 = sb3;
                                    z5 = z3;
                                } else {
                                    z3 = z5;
                                }
                                if (c18683.add(1) && charArray.length == 4) {
                                    this.f69638 = charArray;
                                } else {
                                    if (c18683.add(2)) {
                                        if (charArray.length != 2) {
                                            i = 3;
                                            if (charArray.length == 3) {
                                            }
                                        }
                                        this.f69659 = charArray;
                                    } else {
                                        i = 3;
                                    }
                                    if (c18683.add(i) && charArray.length >= 5 && charArray.length <= 8) {
                                        this.f69643 = Arrays.copyOf(charArray, 8);
                                    } else {
                                        if (!c18683.add(4) || (i2 = i5 + 2) >= strArrSplit2.length || !str4.equals(am.aH) || !strArrSplit2[i5 + 1].equals("nu") || strArrSplit2[i2].isEmpty()) {
                                            throw new Exception(str3);
                                        }
                                        if (z7) {
                                            throw new Exception("Duplicate numbering system: ".concat(str3));
                                        }
                                        char[] charArray2 = strArrSplit2[i2].toCharArray();
                                        if (!m49012(charArray2)) {
                                            throw new Exception("Invalid numbering system: ".concat(str3));
                                        }
                                        this.f69647 = Arrays.copyOf(charArray2, 8);
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
                                    if (!str3.startsWith(am.aG) || !str3.endsWith("dp")) {
                                        if (!str3.startsWith(am.aE)) {
                                            if (!matcher.reset(str3).matches()) {
                                                if (!matcher2.reset(str3).matches()) {
                                                    EnumC10418 enumC10418 = this.f69660;
                                                    EnumC10418 enumC10419 = EnumC10418.MOTOROLA_76;
                                                    if (enumC10418 != enumC10419 || !str3.startsWith("spn")) {
                                                        if (this.f69660 != enumC10419 || !str3.startsWith("gid1")) {
                                                            if (this.f69660 != enumC10419 || !str3.startsWith("mot")) {
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
                                                                int iM49016 = iIndexOf == 7 ? 60 : m49016(str3.substring(7, iIndexOf));
                                                                byte[] bArrM27954 = AbstractC11311.m27952().mo7066().mo7062().m27954(str3.substring(iIndexOf + 1));
                                                                if (iM49016 < 4 || bArrM27954.length == 0 || ((long) iM49016) + ((long) bArrM27954.length) > 255) {
                                                                    throw new Exception("Invalid unknown config range: ".concat(str3));
                                                                }
                                                                bArr = bArrM27954;
                                                                i4 = iM49016;
                                                                z4 = z2;
                                                                z5 = z;
                                                                z6 = true;
                                                                break;
                                                            } else {
                                                                switch (str3) {
                                                                    case "motcli":
                                                                        this.f69652 = 4;
                                                                        break;
                                                                    case "motmobile":
                                                                        this.f69652 = 3;
                                                                        break;
                                                                    case "motphone":
                                                                        this.f69652 = 1;
                                                                        break;
                                                                    case "motdesk":
                                                                        this.f69652 = 2;
                                                                        break;
                                                                    default:
                                                                        if (!str3.startsWith("motuimode")) {
                                                                            throw new Exception("Unknown config part: ".concat(str3));
                                                                        }
                                                                        this.f69652 = m49016(str3.substring(9));
                                                                        break;
                                                                        break;
                                                                }
                                                            }
                                                        } else {
                                                            this.f69646 = m49016(str3.substring(4));
                                                        }
                                                    } else {
                                                        this.f69635 = m49016(str3.substring(3));
                                                    }
                                                } else {
                                                    String strGroup = matcher2.group(1);
                                                    C11003.requireNonNull(strGroup);
                                                    this.f69633 = m49011(strGroup);
                                                    String strGroup2 = matcher2.group(2);
                                                    C11003.requireNonNull(strGroup2);
                                                    this.f69641 = m49011(strGroup2);
                                                }
                                            } else {
                                                String strGroup3 = matcher.group(1);
                                                C11003.requireNonNull(strGroup3);
                                                this.f69634 = Integer.parseInt(strGroup3);
                                            }
                                        } else {
                                            short s2 = Short.parseShort(str3.substring(1));
                                            if (this.f69655 < s2) {
                                                this.f69655 = s2;
                                            }
                                            z4 = z2;
                                            z5 = true;
                                            break;
                                        }
                                    } else {
                                        this.f69640 = m49011(C15472.m36561(2, 1, str3));
                                    }
                                } else {
                                    this.f69654 = m49011(C15472.m36561(2, 1, str3));
                                }
                            } else {
                                this.f69628 = m49011(C15472.m36561(2, 2, str3));
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
            byte[] bArrM49018 = m49018();
            int iMax = Math.max(this.f69660.f31318, bArr.length + i4);
            byte[] bArr2 = new byte[iMax];
            System.arraycopy(bArrM49018, 0, bArr2, 4, bArrM49018.length);
            for (int i6 = 0; i6 < bArr.length; i6++) {
                int i7 = i4 + i6;
                if (!z9 || i7 < 24 || i7 >= 26) {
                    int i8 = bArr2[i7] & 255;
                    if (i7 == 18) {
                        iM48994 = m48994(i8, 3);
                        iM48995 = m48994(i8, 12);
                    } else if (i7 == 28) {
                        iM48994 = m48994(i8, 15) | m48994(i8, 48);
                        iM48995 = m48994(i8, 192);
                    } else if (i7 == 29) {
                        iM48994 = m48994(i8, 15);
                        iM48995 = m48994(i8, 48);
                    } else if (i7 == 48) {
                        iM48996 = m48994(i8, 3);
                    } else if (i7 == 49) {
                        iM48994 = m48994(i8, 3);
                        iM48995 = m48994(i8, 12);
                    } else if (i8 == 0) {
                        iM48996 = 0;
                    } else {
                        iM48996 = 255;
                    }
                    iM48996 = iM48995 | iM48994;
                } else {
                    iM48996 = 255;
                }
                if (((bArr2[i7] ^ bArr[i6]) & iM48996) != 0) {
                    throw new Exception("Unknown bytes conflict with explicit qualifiers");
                }
            }
            System.arraycopy(bArr, 0, bArr2, i4, bArr.length);
            C15972.m37746(0, iMax, bArr2);
            m49003(new C3074(bArr2).m9403(0));
            this.f69656 = null;
            byte[] bArrM49019 = m49018();
            m49001(sb4.toString());
            this.f69656 = null;
            if (!Arrays.equals(bArrM49019, m49018())) {
                throw new Exception("Unknown bytes conflict with explicit qualifiers");
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m49016(String str) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m49017(char[] cArr) {
        for (char c : cArr) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49012(char[] cArr) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m49011(String str) {
        int i = Integer.parseInt(str);
        if (i < 0 || i > 65535) {
            throw new NumberFormatException(C4860.m14172("Value out of range. Value:\"", str, "\""));
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:257:0x03d9  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m49025() {
        if (this.f69637 == null) {
            C0225 c0225 = f69627;
            StringBuilder sb = (StringBuilder) c0225.m1479();
            if (sb == null) {
                sb = new StringBuilder();
            } else {
                sb.setLength(0);
            }
            if (this.f69651 != 0) {
                sb.append("-mcc");
                C9523.m24401(sb, this.f69651);
                short s = this.f69653;
                if (s == -1) {
                    sb.append("-mnc00");
                } else if (s != 0) {
                    sb.append("-mnc");
                    short s2 = this.f69653;
                    if (s2 <= 0 || s2 >= 10) {
                        C9523.m24401(sb, s2);
                    } else if (s2 < 0 || s2 >= 100) {
                        sb.append(String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(s2)));
                    } else {
                        sb.append((s2 / 10) % 10);
                        sb.append(s2 % 10);
                    }
                }
            } else if (this.f69653 != 0) {
                sb.append("-mnc");
                sb.append((int) this.f69653);
            }
            String strM48997 = m48997(this.f69644);
            String strM48998 = m48997(this.f69659);
            String strM48999 = m48997(this.f69638);
            String strM489910 = m48997(this.f69643);
            String strM489911 = (this.f69644[0] == 0 || !m49012(this.f69647)) ? "" : m48997(this.f69647);
            if (!strM48997.isEmpty() || !strM48998.isEmpty()) {
                if (strM48999.length() == 4 || strM489910.length() >= 5 || strM48998.length() == 3 || !strM489911.isEmpty()) {
                    sb.append("-b+");
                    if (!strM48997.isEmpty()) {
                        sb.append(strM48997);
                    }
                    if (strM48999.length() == 4) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM48999);
                    }
                    if (strM48998.length() == 2 || strM48998.length() == 3) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM48998);
                    }
                    if (strM489910.length() >= 5) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM489910.toUpperCase());
                    }
                    if (!strM489911.isEmpty()) {
                        sb.append("+u+nu+");
                        sb.append(strM489911);
                    }
                } else {
                    sb.append("-");
                    sb.append(strM48997);
                    if (!strM48998.isEmpty()) {
                        sb.append("-r");
                        sb.append(strM48998);
                    }
                }
            }
            int i = this.f69650 & 192;
            if (i == 64) {
                sb.append("-ldltr");
            } else if (i == 128) {
                sb.append("-ldrtl");
            }
            if (this.f69628 != 0) {
                sb.append("-sw");
                sb.append(this.f69628);
                sb.append("dp");
            }
            if (this.f69654 != 0) {
                sb.append("-w");
                sb.append(this.f69654);
                sb.append("dp");
            }
            if (this.f69640 != 0) {
                sb.append("-h");
                sb.append(this.f69640);
                sb.append("dp");
            }
            int i2 = this.f69650 & 15;
            if (i2 == 1) {
                sb.append("-small");
            } else if (i2 == 2) {
                sb.append("-normal");
            } else if (i2 == 3) {
                sb.append("-large");
            } else if (i2 == 4) {
                sb.append("-xlarge");
            }
            int i3 = this.f69650 & UTF8.S_P3A;
            if (i3 == 16) {
                sb.append("-notlong");
            } else if (i3 == 32) {
                sb.append("-long");
            }
            int i4 = this.f69631 & 3;
            if (i4 == 1) {
                sb.append("-notround");
            } else if (i4 == 2) {
                sb.append("-round");
            }
            int i5 = this.f69658 & 12;
            short s3 = 8;
            if (i5 == 4) {
                sb.append("-lowdr");
            } else if (i5 == 8) {
                sb.append("-highdr");
            }
            int i6 = this.f69658 & 3;
            if (i6 == 1) {
                sb.append("-nowidecg");
            } else if (i6 == 2) {
                sb.append("-widecg");
            }
            byte b = this.f69661;
            if (b == 1) {
                sb.append("-port");
            } else if (b == 2) {
                sb.append("-land");
            } else if (b == 3) {
                sb.append("-square");
            }
            switch (this.f69639 & 15) {
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
            int i7 = this.f69639 & UTF8.S_P3A;
            if (i7 == 16) {
                sb.append("-notnight");
            } else if (i7 == 32) {
                sb.append("-night");
            }
            int i8 = this.f69634;
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
                                                    sb.append(this.f69634);
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
            byte b2 = this.f69629;
            if (b2 == 1) {
                sb.append("-notouch");
            } else if (b2 == 2) {
                sb.append("-stylus");
            } else if (b2 == 3) {
                sb.append("-finger");
            }
            int i9 = this.f69642 & 3;
            if (i9 == 1) {
                sb.append("-keysexposed");
            } else if (i9 == 2) {
                sb.append("-keyshidden");
            } else if (i9 == 3) {
                sb.append("-keyssoft");
            }
            byte b3 = this.f69636;
            if (b3 == 1) {
                sb.append("-nokeys");
            } else if (b3 == 2) {
                sb.append("-qwerty");
            } else if (b3 == 3) {
                sb.append("-12key");
            }
            int i10 = this.f69642 & 12;
            if (i10 == 4) {
                sb.append("-navexposed");
            } else if (i10 == 8) {
                sb.append("-navhidden");
            }
            byte b4 = this.f69648;
            if (b4 == 1) {
                sb.append("-nonav");
            } else if (b4 == 2) {
                sb.append("-dpad");
            } else if (b4 == 3) {
                sb.append("-trackball");
            } else if (b4 == 4) {
                sb.append("-wheel");
            }
            byte b5 = this.f69645;
            if (b5 == 1) {
                sb.append("-neuter");
            } else if (b5 == 2) {
                sb.append("-feminine");
            } else if (b5 == 3) {
                sb.append("-masculine");
            }
            if (this.f69633 != 0 && this.f69641 != 0) {
                sb.append('-');
                sb.append(this.f69633);
                sb.append('x');
                sb.append(this.f69641);
            }
            short s4 = this.f69655;
            if (s4 > 0) {
                byte b6 = this.f69639;
                if ((b6 & 15) != 7) {
                    byte b7 = this.f69658;
                    if ((b7 & 3) != 0 || (b7 & 12) != 0) {
                        s3 = 26;
                    } else if ((this.f69631 & 3) != 0) {
                        s3 = 23;
                    } else {
                        int i11 = this.f69634;
                        if (i11 == 65534) {
                            s3 = 21;
                        } else if (this.f69628 != 0 || this.f69654 != 0 || this.f69640 != 0) {
                            s3 = 13;
                        } else if ((b6 & 63) == 0) {
                            s3 = ((this.f69650 & 63) == 0 && i11 == 0) ? (short) 0 : (short) 4;
                        }
                    }
                } else {
                    s3 = 26;
                }
                if (s4 >= s3) {
                    sb.append("-v");
                    sb.append((int) this.f69655);
                }
            }
            if (this.f69660 == EnumC10418.MOTOROLA_76) {
                if (this.f69635 != 0) {
                    sb.append("-spn");
                    sb.append(((long) this.f69635) & 4294967295L);
                }
                if (this.f69646 != 0) {
                    sb.append("-gid1");
                    sb.append(((long) this.f69646) & 4294967295L);
                }
                int i12 = this.f69652;
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
                        sb.append(((long) this.f69652) & 4294967295L);
                    }
                }
            }
            int i13 = this.f69660.f31318;
            if (m49017(this.f69647) || (this.f69644[0] != 0 && m49012(this.f69647))) {
                for (byte b8 : this.f69632) {
                    if (b8 != 0) {
                        i13 = this.f69660.f31318 - 3;
                    }
                }
            } else {
                i13 = this.f69660.f31318 - 11;
            }
            if (i13 < this.f69660.f31318 || this.f69649 != null) {
                byte[] bArrM49018 = m49018();
                sb.append("-unknown");
                sb.append(i13);
                sb.append('+');
                sb.append(AbstractC11311.m27952().mo7066().mo7062().m27953(Arrays.copyOfRange(bArrM49018, i13 - 4, bArrM49018.length)));
            }
            String string = sb.toString();
            c0225.m1477(sb);
            this.f69637 = string;
        }
        return this.f69637;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49004(byte[] bArr, char[] cArr, char c) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m49024(C21707 c21707) {
        int i = this.f69651 != c21707.f69651 ? 1 : 0;
        if (this.f69653 != c21707.f69653) {
            i |= 2;
        }
        if (!Arrays.equals(this.f69644, c21707.f69644) || !Arrays.equals(this.f69659, c21707.f69659)) {
            i |= 4;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                if (!Arrays.equals(this.f69643, c21707.f69643) || !Arrays.equals(this.f69647, c21707.f69647)) {
                    break;
                }
                break;
            }
            if ((this.f69630 != 0 ? (char) 0 : this.f69638[i2]) == (c21707.f69630 != 0 ? (char) 0 : c21707.f69638[i2])) {
                i2++;
            }
            i |= 4;
            break;
        }
        if (this.f69661 != c21707.f69661) {
            i |= 128;
        }
        if (this.f69634 != c21707.f69634) {
            i |= 256;
        }
        if (this.f69629 != c21707.f69629) {
            i |= 8;
        }
        if (((this.f69642 ^ c21707.f69642) & 15) != 0) {
            i |= 32;
        }
        if (this.f69636 != c21707.f69636) {
            i |= 16;
        }
        if (this.f69648 != c21707.f69648) {
            i |= 64;
        }
        if (this.f69633 != c21707.f69633 || this.f69641 != c21707.f69641 || this.f69654 != c21707.f69654 || this.f69640 != c21707.f69640) {
            i |= 512;
        }
        if (this.f69655 != c21707.f69655) {
            i |= 1024;
        }
        byte b = this.f69650;
        byte b2 = c21707.f69650;
        if (((b ^ b2) & 192) != 0) {
            i |= 16384;
        }
        if (((b ^ b2) & 63) != 0) {
            i |= 2048;
        }
        if (((this.f69631 ^ c21707.f69631) & 3) != 0) {
            i |= 32768;
        }
        if (((this.f69658 ^ c21707.f69658) & 15) != 0) {
            i |= 65536;
        }
        if (this.f69639 != c21707.f69639) {
            i |= 4096;
        }
        if (this.f69628 != c21707.f69628) {
            i |= 8192;
        }
        if (this.f69645 != c21707.f69645) {
            i |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
        EnumC10418 enumC10418 = this.f69660;
        if (enumC10418 == EnumC10418.MOTOROLA_76 && c21707.f69660 == enumC10418) {
            if (this.f69635 != c21707.f69635) {
                i |= 262144;
            }
            if (this.f69646 != c21707.f69646) {
                i |= 524288;
            }
            if (this.f69652 != c21707.f69652) {
                return 1048576 | i;
            }
        }
        return i;
    }

    public final String toString() {
        if (m49025().isEmpty()) {
            return "[DEFAULT]";
        }
        String strM49025 = m49025();
        return strM49025.charAt(0) == '-' ? strM49025.substring(1) : strM49025;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C21707.class != obj.getClass()) {
            return false;
        }
        C21707 c21707 = (C21707) obj;
        return this.f69660 == c21707.f69660 && this.f69630 == c21707.f69630 && m49025().equals(c21707.m49025());
    }

    public final int hashCode() {
        return m49025().hashCode() + (((this.f69660.hashCode() * 31) + this.f69630) * 31);
    }

    public final Object clone() {
        try {
            return (C21707) super.clone();
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
    
        if ((r10.f69628 != 0) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0149, code lost:
    
        if ((r10.m49009() != 0) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0187, code lost:
    
        if ((r10.f69650 != 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01e0, code lost:
    
        if ((r10.f69631 != 0) != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x020a, code lost:
    
        if ((r10.f69658 != 0) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x025c, code lost:
    
        if ((r10.f69639 != 0) != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x029f, code lost:
    
        if ((r10.m49015() != 0) != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0311, code lost:
    
        if ((r10.m49008() != 0) != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x038b, code lost:
    
        if ((r10.m49010() != 0) != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f9, code lost:
    
        if ((r10.f69650 != 0) != false) goto L79;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m49023(C21707 c21707, C21707 c21708) {
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
        if (m49014() != 0 || c21707.m49014() != 0) {
            short s3 = this.f69651;
            if (s3 != c21707.f69651 && c21708.f69651 != 0) {
                if (s3 != 0) {
                    return true;
                }
                return false;
            }
            short s4 = this.f69653;
            if (s4 != c21707.f69653 && c21708.f69653 != 0) {
                if (s4 != 0) {
                    return true;
                }
                return false;
            }
        }
        if (c21708.m49019() == 0 || (m49019() == 0 && c21707.m49019() == 0)) {
            zEquals = false;
        } else if (!m49013(this.f69644, c21707.f69644)) {
            if (m49005(c21708.f69644, f69620)) {
                char[] cArr = c21708.f69659;
                char[] cArr2 = f69622;
                if (m49005(cArr, cArr2)) {
                    if (this.f69644[0] != 0) {
                        char[] cArr3 = this.f69659;
                        if (cArr3[0] == 0 || m49005(cArr3, cArr2)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else {
                        char[] cArr4 = c21707.f69659;
                        if (cArr4[0] == 0 || m49005(cArr4, cArr2)) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    }
                } else if (C8013.m21331(c21708.f69659)) {
                    if (this.f69644[0] != 0) {
                        zEquals = C8013.m21331(this.f69659);
                    } else {
                        zEquals = !C8013.m21331(c21707.f69659);
                    }
                } else if (this.f69644[0] != 0) {
                    zEquals = true;
                } else {
                    zEquals = false;
                }
            } else if (this.f69644[0] != 0) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else {
            int iM21327 = C8013.m21327(this.f69659, c21707.f69659, c21708.f69644, m48997(c21708.f69638), c21708.f69659);
            if (iM21327 == 0) {
                zEquals = Arrays.equals(this.f69643, c21708.f69643);
                if (zEquals == Arrays.equals(c21707.f69643, c21708.f69643)) {
                    if (!m49005(this.f69644, c21708.f69644) || m49005(c21707.f69644, c21708.f69644)) {
                        zEquals = false;
                    } else {
                        zEquals = true;
                    }
                }
            } else if (iM21327 > 0) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        }
        if (!zEquals) {
            byte b = this.f69650;
            if (!(b != 0)) {
            }
            byte b2 = c21707.f69650;
            if (((b ^ b2) & 192) != 0) {
                if ((c21708.f69650 & 192) != 0) {
                    if ((b & 192) <= (b2 & 192)) {
                        return false;
                    }
                }
            }
            int i6 = this.f69628;
            if (!(i6 != 0)) {
            }
            int i7 = c21707.f69628;
            if (i6 != i7) {
                if (i6 <= i7) {
                    return false;
                }
            }
            if (!(m49009() != 0)) {
            }
            int i8 = c21708.f69654;
            if (i8 != 0) {
                i2 = i8 - this.f69654;
                i = i8 - c21707.f69654;
            } else {
                i = 0;
                i2 = 0;
            }
            int i9 = c21708.f69640;
            if (i9 != 0) {
                i2 += i9 - this.f69640;
                i += i9 - c21707.f69640;
            }
            if (i2 != i) {
                if (i2 >= i) {
                    return false;
                }
            }
            byte b3 = this.f69650;
            int i10 = 2;
            if (!(b3 != 0)) {
            }
            byte b4 = c21707.f69650;
            int i11 = b3 ^ b4;
            if ((i11 & 15) != 0) {
                int i12 = c21708.f69650 & 15;
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
                if ((c21708.f69650 & UTF8.S_P3A) != 0) {
                    if ((b3 & UTF8.S_P3A) == 0) {
                        return false;
                    }
                }
            }
            byte b5 = this.f69631;
            if (!(b5 != 0)) {
            }
            if (((c21707.f69631 ^ b5) & 3) != 0) {
                if ((c21708.f69631 & 3) != 0) {
                    if ((b5 & 3) == 0) {
                        return false;
                    }
                }
            }
            byte b6 = this.f69658;
            if (!(b6 != 0)) {
            }
            int i15 = c21707.f69658 ^ b6;
            if ((i15 & 3) != 0) {
                if ((c21708.f69658 & 3) != 0) {
                    if ((b6 & 3) == 0) {
                        return false;
                    }
                }
            }
            if ((i15 & 12) != 0) {
                if ((c21708.f69658 & 12) != 0) {
                    if ((b6 & 12) == 0) {
                        return false;
                    }
                }
            }
            byte b7 = this.f69661;
            if (b7 != c21707.f69661) {
                if (c21708.f69661 != 0) {
                    if (b7 == 0) {
                        return false;
                    }
                }
            }
            byte b8 = this.f69639;
            if (!(b8 != 0)) {
            }
            int i16 = c21707.f69639 ^ b8;
            if ((i16 & 15) != 0) {
                if ((c21708.f69639 & 15) != 0) {
                    if ((b8 & 15) == 0) {
                        return false;
                    }
                }
            }
            if ((i16 & 48) != 0) {
                if ((c21708.f69639 & UTF8.S_P3A) != 0) {
                    if ((b8 & UTF8.S_P3A) == 0) {
                        return false;
                    }
                }
            }
            if (!(m49015() != 0)) {
            }
            int i17 = this.f69634;
            int i18 = c21707.f69634;
            if (i17 == i18) {
                byte b9 = this.f69629;
                if (b9 != c21707.f69629) {
                    if (c21708.f69629 != 0) {
                        if (b9 == 0) {
                            return false;
                        }
                    }
                }
                if (!(m49008() != 0)) {
                }
                byte b10 = this.f69642;
                int i19 = b10 & 3;
                byte b11 = c21707.f69642;
                int i20 = b11 & 3;
                if (i19 != i20) {
                    int i21 = c21708.f69642 & 3;
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
                    if ((c21708.f69642 & 12) != 0) {
                        if (i22 != 0) {
                            if (i23 != 0) {
                            }
                        }
                        return false;
                    }
                }
                byte b12 = this.f69636;
                if (b12 != c21707.f69636) {
                    if (c21708.f69636 != 0) {
                        if (b12 == 0) {
                            return false;
                        }
                    }
                }
                byte b13 = this.f69648;
                if (b13 != c21707.f69648) {
                    if (c21708.f69648 != 0) {
                        if (b13 == 0) {
                            return false;
                        }
                    }
                }
                if (!(m49010() != 0)) {
                }
                int i24 = c21708.f69633;
                if (i24 != 0) {
                    i5 = i24 - this.f69633;
                    i4 = i24 - c21707.f69633;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i25 = c21708.f69641;
                if (i25 != 0) {
                    i5 += i25 - this.f69641;
                    i4 += i25 - c21707.f69641;
                }
                if (i5 != i4) {
                    if (i5 >= i4) {
                        return false;
                    }
                }
                if (m49007() != 0) {
                    s = this.f69655;
                    s2 = c21707.f69655;
                    if (s != s2) {
                        if (c21708.f69655 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z || s <= s2) {
                        }
                    }
                } else {
                    if (c21707.m49007() != 0) {
                        s = this.f69655;
                        s2 = c21707.f69655;
                        if (s != s2) {
                            if (c21708.f69655 != 0) {
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
                    int i27 = c21708.f69634;
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
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m49026(l.C21707 r10) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21707.m49026(l.᩸ܽܽ):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21707 m48998(Resources resources) {
        C21707 c21707 = new C21707();
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
        c21707.f69651 = (short) i6;
        c21707.f69653 = (short) i7;
        c21707.f69661 = (byte) i8;
        c21707.f69629 = (byte) i9;
        c21707.f69634 = (short) i10;
        c21707.f69636 = (byte) i11;
        c21707.f69642 = (byte) i5;
        c21707.f69648 = (byte) i12;
        c21707.f69633 = (short) i4;
        c21707.f69641 = (short) i3;
        c21707.f69628 = (short) i13;
        c21707.f69654 = (short) i14;
        c21707.f69640 = (short) i15;
        c21707.f69650 = (byte) i17;
        c21707.f69639 = (byte) i18;
        c21707.f69658 = (byte) i16;
        c21707.f69655 = (short) i;
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
            m49002(language, c21707.f69644);
            m49002(locale.getCountry(), c21707.f69659);
            m49002(locale.getScript(), c21707.f69638);
            m49002(locale.getVariant(), c21707.f69643);
        }
        c21707.f69631 = (byte) ((i17 & 768) >> 8);
        return c21707;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48997(char[] cArr) {
        int i = 0;
        while (i < cArr.length) {
            if (cArr[i] == 0) {
                return i == 0 ? "" : new String(cArr, 0, i);
            }
            i++;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49002(String str, char[] cArr) {
        int iMin = Math.min(str.length(), cArr.length);
        Arrays.fill(cArr, (char) 0);
        for (int i = 0; i < iMin; i++) {
            cArr[i] = str.charAt(i);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m49014() {
        return ((this.f69651 & HPKE.aead_EXPORT_ONLY) << 16) | (65535 & this.f69653);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m49019() {
        char[] cArr = this.f69644;
        int i = ((cArr[1] & 255) << 16) | ((cArr[0] & 255) << 24);
        char[] cArr2 = this.f69659;
        return i | ((cArr2[0] & 255) << 8) | (cArr2[1] & 255);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private int m49009() {
        return ((this.f69654 & 65535) << 16) | (65535 & this.f69640);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private int m49015() {
        return ((this.f69661 & 255) << 24) | ((this.f69629 & 255) << 16) | (this.f69634 & 65535);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int m49008() {
        return ((this.f69636 & 255) << 24) | ((this.f69648 & 255) << 16) | ((this.f69642 & 255) << 8);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m49007() {
        return (this.f69655 & HPKE.aead_EXPORT_ONLY) << 16;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private int m49010() {
        return ((this.f69633 & 65535) << 16) | (65535 & this.f69641);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49013(char[] cArr, char[] cArr2) {
        if (m49005(cArr, cArr2)) {
            return true;
        }
        char[] cArr3 = f69623;
        boolean zM49005 = m49005(cArr, cArr3);
        char[] cArr4 = f69624;
        if (zM49005 && m49005(cArr2, cArr4)) {
            return true;
        }
        return m49005(cArr, cArr4) && m49005(cArr2, cArr3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49005(char[] cArr, char[] cArr2) {
        return cArr[0] == cArr2[0] && cArr[1] == cArr2[1];
    }
}
