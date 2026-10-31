package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.nio.file.ClosedFileSystemException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩶ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20002 {

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f64744 = new C4314();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22364 f64746;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f64747;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f64749;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int[] f64750;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f64751;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0245[] f64752;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f64753;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f64754;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C6319 f64756;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f64758;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2002 f64759;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC5973 f64762;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f64763;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f64764;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2363 f64765;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23168 f64766;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C20085 f64767;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f64768;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f64769;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C20661 f64770;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f64771;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5931 f64772;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f64773;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public byte[] f64774;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f64775;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f64776;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13395 f64777;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C2609 f64779;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f64781;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f64783;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2609 f64784;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6136 f64785;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f64786;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C2363 f64788;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2609 f64745 = C2609.m8239();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C2609 f64780 = C2609.m8239();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f64755 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f64760 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C0052 f64782 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14896 f64787 = new C14896(65520);

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public HashSet f64761 = new HashSet();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f64748 = false;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public byte[] f64778 = new byte[0];

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f64757 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20002 m46105(C2903 c2903) {
        C20002 c20002 = (C20002) c2903.m8838(f64744);
        return c20002 == null ? new C20002(c2903) : c20002;
    }

    public C20002(C2903 c2903) {
        EnumC6596 enumC6596 = EnumC6596.CLASS;
        EnumSet enumSetOf = EnumSet.of(enumC6596);
        EnumC6596 enumC6597 = EnumC6596.MEMBER;
        EnumSet enumSetOf2 = EnumSet.of(enumC6597);
        EnumSet enumSetOf3 = EnumSet.of(enumC6596, enumC6597);
        this.f64775 = new HashMap();
        this.f64754 = false;
        this.f64784 = C2609.m8239();
        this.f64779 = C2609.m8239();
        this.f64751 = false;
        c2903.m8841(f64744, this);
        this.f64777 = C13395.m32391(c2903);
        C6136 c6136M17057 = C6136.m17057(c2903);
        this.f64785 = c6136M17057;
        C20661 c20661M47250 = C20661.m47250(c2903);
        this.f64770 = c20661M47250;
        this.f64756 = C6319.m17456(c2903);
        InterfaceC11223 interfaceC11223 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        this.f64749 = interfaceC11223;
        if (interfaceC11223 == null) {
            throw new AssertionError("FileManager initialization error");
        }
        this.f64772 = C5931.m16615(c2903);
        this.f64759 = C2002.m6532(c2903);
        this.f64746 = C22364.m50099(c2903);
        C11781 c11781M28823 = C11781.m28823(c2903);
        c11781M28823.m28832(EnumC0121.f1141);
        EnumC16280 enumC16280M38301 = EnumC16280.m38301(c2903);
        this.f64766 = C23168.m51341(c2903);
        this.f64747 = EnumC10637.f32009.m26686(enumC16280M38301);
        this.f64763 = EnumC10637.f32007.m26686(enumC16280M38301);
        this.f64773 = EnumC10637.f31988.m26686(enumC16280M38301);
        this.f64786 = c11781M28823.m28832(EnumC0121.f1190);
        this.f64762 = EnumC5973.m16741(c2903);
        this.f64783 = AbstractC14016.m33607(c20661M47250.f66475);
        this.f64753 = C4824.m14050(c2903).m14055(EnumC20347.CLASSFILE);
        AbstractC10370 abstractC10370 = c6136M17057.f18826;
        EnumC16970 enumC16970 = EnumC16970.V45_3;
        C6387 c6387 = new C6387(this, abstractC10370, enumC16970, enumSetOf2);
        C12032 c12032 = new C12032(this, c6136M17057.f18792, enumC16970, enumSetOf2);
        C23320 c23320 = new C23320(this, c6136M17057.f18800, enumC16970, enumSetOf3);
        C14147 c14147 = new C14147(this, c6136M17057.f18780, enumC16970, enumSetOf3);
        C7798 c7798 = new C7798(this, c6136M17057.f18784, enumC16970, enumSetOf);
        C1657 c1657 = new C1657(this, c6136M17057.f18893, enumC16970, enumSetOf3);
        C10830 c10830 = new C10830(this, c6136M17057.f18862, enumC16970, enumSetOf);
        C16473 c16473 = new C16473(this, c6136M17057.f18882, enumC16970, enumSetOf3);
        AbstractC10370 abstractC10371 = c6136M17057.f18877;
        EnumC16970 enumC16971 = EnumC16970.V49;
        C21205 c21205 = new C21205(this, abstractC10371, enumC16971, enumSetOf);
        C9916 c9916 = new C9916(this, c6136M17057.f18827, enumC16971, enumSetOf3);
        C9210 c9210 = new C9210(this, c6136M17057.f18865, enumC16971, enumSetOf3);
        C16264 c16264 = new C16264(this, c6136M17057.f18874, enumC16971, enumSetOf3);
        C2860 c2860 = new C2860(this, c6136M17057.f18870, enumC16971, enumSetOf3);
        C4271 c4271 = new C4271(this, c6136M17057.f18905, enumC16971, enumSetOf3);
        C19088 c19088 = new C19088(this, c6136M17057.f18816, enumC16971, enumSetOf3);
        C19794 c19794 = new C19794(this, c6136M17057.f18837, enumC16971, enumSetOf3);
        C0742 c0742 = new C0742(this, c6136M17057.f18904, enumC16971, enumSetOf2);
        C5682 c5682 = new C5682(this, c6136M17057.f18881, enumC16971, enumSetOf3);
        C8504 c8504 = new C8504(this, c6136M17057.f18858, enumC16971, enumSetOf3);
        AbstractC10370 abstractC10372 = c6136M17057.f18890;
        EnumC16970 enumC16972 = EnumC16970.V52;
        C15558 c15558 = new C15558(this, abstractC10372, enumC16972, enumSetOf3);
        C21910 c21910 = new C21910(this, c6136M17057.f18854, enumC16972, enumSetOf3);
        C22615 c22615 = new C22615(this, c6136M17057.f18847, enumC16972, enumSetOf2);
        AbstractC10370 abstractC10373 = c6136M17057.f18844;
        EnumC16970 enumC16973 = EnumC16970.V53;
        AbstractC20708[] abstractC20708Arr = {c6387, c12032, c23320, c14147, c7798, c1657, c10830, c16473, c21205, c9916, c9210, c16264, c2860, c4271, c19088, c19794, c0742, c5682, c8504, c15558, c21910, c22615, new C4976(this, abstractC10373, enumC16973, enumSetOf), new C3565(this, c6136M17057.f18834, enumC16973, enumSetOf), new C13442(this, c6136M17057.f18866, EnumC16970.V58, enumSetOf), new C12737(this, c6136M17057.f18819, EnumC16970.V59, enumSetOf)};
        for (int i = 0; i < 26; i++) {
            AbstractC20708 abstractC20708 = abstractC20708Arr[i];
            this.f64775.put(abstractC20708.f66693, abstractC20708);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46107(C14163 c14163, AbstractC5698 abstractC5698) {
        if ((abstractC5698.f17563 & 2147487744L) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF || abstractC5698.f17562.m26176(this.f64785.f18806)) {
            c14163.f42762.mo26382(abstractC5698);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21325 m46116(String str, Object... objArr) {
        return new C21325(this.f64760.m16071(), this.f64755, this.f64772.m16622(str, objArr), this.f64772, this.f64759);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m46124() {
        char cM35354 = this.f64787.m35354(this.f64769);
        this.f64769 += 2;
        return cM35354;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46112() {
        int i = this.f64769;
        this.f64769 = i + 1;
        return this.f64787.f45448[i] & 255;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m46128() {
        int iM35353 = this.f64787.m35353(this.f64769);
        this.f64769 += 4;
        return iM35353;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m46135() {
        AbstractC4308 abstractC4308Mo16091;
        byte[] bArr;
        int i;
        byte[] bArr2 = this.f64774;
        int i2 = this.f64776;
        byte b = bArr2[i2];
        char c = (char) b;
        C20661 c20661 = this.f64770;
        if (c == '(') {
            this.f64776 = i2 + 1;
            C2609 c2609M46113 = m46113(')');
            AbstractC4308 abstractC4308M46135 = m46135();
            C2609 c2609M8239 = C2609.m8239();
            while (true) {
                int i3 = this.f64776;
                if (i3 >= this.f64764 || this.f64774[i3] != 94) {
                    break;
                }
                this.f64776 = i3 + 1;
                c2609M8239 = c2609M8239.m8246(m46135());
            }
            for (C2609 c2609 = c2609M8239; c2609.m8249(); c2609 = c2609.f8241) {
                if (((AbstractC4308) c2609.f8240).m12913(EnumC9454.TYPEVAR)) {
                    ((AbstractC4308) c2609.f8240).f13890.f17563 |= 140737488355328L;
                }
            }
            return new C10658(c2609M46113, abstractC4308M46135, c2609M8239.m8250(), c20661.f66481);
        }
        if (c == '-') {
            this.f64776 = i2 + 1;
            return new C19831(m46135(), EnumC15678.SUPER, c20661.f66480);
        }
        if (c == '<') {
            this.f64783 = this.f64783.mo26380(this.f64760);
            C10077 c10077 = new C10077(m46135(), m46134());
            this.f64783 = this.f64783.mo26377();
            return c10077;
        }
        if (c == 'F') {
            this.f64776 = i2 + 1;
            return c20661.f66483;
        }
        C6136 c6136 = this.f64785;
        if (c != 'L') {
            if (c == 'V') {
                this.f64776 = i2 + 1;
                return c20661.f66501;
            }
            if (c == '*') {
                this.f64776 = i2 + 1;
                return new C19831(c20661.f66526, EnumC15678.UNBOUND, c20661.f66480);
            }
            if (c == '+') {
                this.f64776 = i2 + 1;
                return new C19831(m46135(), EnumC15678.EXTENDS, c20661.f66480);
            }
            if (c == 'I') {
                this.f64776 = i2 + 1;
                return c20661.f66452;
            }
            if (c == 'J') {
                this.f64776 = i2 + 1;
                return c20661.f66470;
            }
            if (c == 'S') {
                this.f64776 = i2 + 1;
                return c20661.f66513;
            }
            if (c == 'T') {
                int i4 = i2 + 1;
                this.f64776 = i4;
                while (true) {
                    bArr = this.f64774;
                    i = this.f64776;
                    if (bArr[i] == 59) {
                        break;
                    }
                    this.f64776 = i + 1;
                }
                this.f64776 = i + 1;
                return this.f64748 ? AbstractC4308.f13885 : m46115(c6136.f18880.mo15926(i4, i - i4, bArr));
            }
            if (c == 'Z') {
                this.f64776 = i2 + 1;
                return c20661.f66469;
            }
            if (c == '[') {
                this.f64776 = i2 + 1;
                return new C5138(m46135(), c20661.f66505);
            }
            switch (c) {
                case 'B':
                    this.f64776 = i2 + 1;
                    return c20661.f66502;
                case 'C':
                    this.f64776 = i2 + 1;
                    return c20661.f66454;
                case 'D':
                    this.f64776 = i2 + 1;
                    return c20661.f66499;
                default:
                    throw m46116("bad.signature", C12780.m31089(i2, 10, bArr2));
            }
        }
        if (b != 76) {
            throw m46116("bad.class.signature", C12780.m31089(i2, 10, bArr2));
        }
        this.f64776 = i2 + 1;
        AbstractC4308 c19955 = AbstractC4308.f13885;
        int i5 = this.f64757;
        while (true) {
            byte[] bArr3 = this.f64774;
            int i6 = this.f64776;
            this.f64776 = i6 + 1;
            byte b2 = bArr3[i6];
            if (b2 == 46) {
                if (c19955 != AbstractC4308.f13885) {
                    c19955 = new C19955(c20661.m47260(this.f64782, c6136.f18880.mo15926(i5, this.f64757 - i5, this.f64778)), c19955, C2609.m8239());
                }
                byte[] bArr4 = this.f64778;
                int i7 = this.f64757;
                this.f64757 = i7 + 1;
                bArr4[i7] = 36;
            } else if (b2 == 47) {
                byte[] bArr5 = this.f64778;
                int i8 = this.f64757;
                this.f64757 = i8 + 1;
                bArr5[i8] = 46;
            } else {
                if (b2 == 59) {
                    C14163 c14163M47260 = c20661.m47260(this.f64782, c6136.f18880.mo15926(i5, this.f64757 - i5, this.f64778));
                    try {
                        abstractC4308Mo16091 = c19955 == AbstractC4308.f13885 ? c14163M47260.mo16091(this.f64756) : new C19955(c14163M47260, c19955, C2609.m8239());
                        this.f64757 = i5;
                        break;
                    } catch (Throwable th) {
                        this.f64757 = i5;
                        throw th;
                    }
                }
                if (b2 != 60) {
                    byte[] bArr6 = this.f64778;
                    int i9 = this.f64757;
                    this.f64757 = i9 + 1;
                    bArr6[i9] = b2;
                } else {
                    abstractC4308Mo16091 = new C1448(this, c19955, m46113('>'), c20661.m47260(this.f64782, c6136.f18880.mo15926(i5, this.f64757 - i5, this.f64778)));
                    byte[] bArr7 = this.f64774;
                    int i10 = this.f64776;
                    int i11 = i10 + 1;
                    this.f64776 = i11;
                    byte b3 = bArr7[i10];
                    if (b3 == 46) {
                        byte[] bArr8 = this.f64778;
                        int i12 = this.f64757;
                        this.f64757 = i12 + 1;
                        bArr8[i12] = 36;
                    } else {
                        if (b3 != 59) {
                            throw new AssertionError((int) this.f64774[this.f64776 - 1]);
                        }
                        if (i11 >= this.f64764 || bArr7[i11] != 46) {
                            this.f64757 = i5;
                            break;
                        }
                        int i13 = this.f64757;
                        this.f64776 = (i13 - i5) + 3 + i11;
                        byte[] bArr9 = this.f64778;
                        this.f64757 = i13 + 1;
                        bArr9[i13] = 36;
                    }
                    c19955 = abstractC4308Mo16091;
                }
            }
        }
        int i14 = this.f64776;
        if (i14 >= this.f64764 || this.f64774[i14] != 46) {
            return abstractC4308Mo16091;
        }
        throw m46116("deprecated inner class signature syntax (please recompile from source)", new Object[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m46113(char c) {
        C2609 c2609Of = C2609.of((Object) null);
        C2609 c2609Mo8251 = c2609Of;
        while (true) {
            byte[] bArr = this.f64774;
            int i = this.f64776;
            if (bArr[i] != c) {
                c2609Mo8251 = c2609Mo8251.mo8251(C2609.of((Object) m46135()));
            } else {
                this.f64776 = i + 1;
                return c2609Of.f8241;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2609 m46134() {
        int i;
        C2609 c2609M8239 = C2609.m8239();
        byte[] bArr = this.f64774;
        int i2 = this.f64776;
        if (bArr[i2] == 60) {
            int i3 = i2 + 1;
            this.f64776 = i3;
            this.f64748 = true;
            while (this.f64774[this.f64776] != 62) {
                c2609M8239 = c2609M8239.m8246(m46122());
            }
            this.f64748 = false;
            this.f64776 = i3;
            while (true) {
                byte[] bArr2 = this.f64774;
                i = this.f64776;
                if (bArr2[i] == 62) {
                    break;
                }
                m46122();
            }
            this.f64776 = i + 1;
        }
        return c2609M8239.m8250();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8541 m46122() {
        byte[] bArr;
        int i;
        C8541 c8541;
        boolean z;
        int i2 = this.f64776;
        while (true) {
            bArr = this.f64774;
            i = this.f64776;
            if (bArr[i] == 58) {
                break;
            }
            this.f64776 = i + 1;
        }
        AbstractC10370 abstractC10370Mo15926 = this.f64785.f18880.mo15926(i2, i - i2, bArr);
        if (this.f64748) {
            c8541 = new C8541(this.f64760, this.f64770.f66522, abstractC10370Mo15926);
            this.f64783.mo26382(c8541.f13890);
        } else {
            c8541 = (C8541) m46115(abstractC10370Mo15926);
        }
        C2609 c2609M8239 = C2609.m8239();
        byte[] bArr2 = this.f64774;
        int i3 = this.f64776;
        if (bArr2[i3] == 58) {
            z = true;
            int i4 = i3 + 1;
            if (bArr2[i4] == 58) {
                this.f64776 = i4;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        while (true) {
            byte[] bArr3 = this.f64774;
            int i5 = this.f64776;
            if (bArr3[i5] != 58) {
                break;
            }
            this.f64776 = i5 + 1;
            c2609M8239 = c2609M8239.m8246(m46135());
        }
        if (!this.f64748) {
            this.f64756.m17501(c8541, c2609M8239.m8250(), z);
        }
        return c8541;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m46115(AbstractC10370 abstractC10370) {
        AbstractC5698 abstractC5698Mo20478 = this.f64783.mo20478(abstractC10370, (Predicate) null);
        if (abstractC5698Mo20478 != null) {
            return abstractC5698Mo20478.f17560;
        }
        if (this.f64754) {
            C8541 c8541 = new C8541(this.f64760, this.f64770.f66522, abstractC10370);
            this.f64784 = this.f64784.m8246(c8541);
            return c8541;
        }
        throw m46116("undecl.type.var", abstractC10370);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m46133(AbstractC5698 abstractC5698) {
        char cCharAt;
        abstractC5698.f17561.mo16064().mo26384(abstractC5698);
        C14163 c14163 = (C14163) abstractC5698;
        C14163 c14163M46280 = this.f64767.m46280(m46124());
        char cM46124 = m46124();
        final C20085 c20085 = this.f64767;
        C11003.requireNonNull(c20085);
        C15144 c15144 = (C15144) m46103(cM46124, new IntFunction() { // from class: l.ۜ᩻۠
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return c20085.m46286(i);
            }
        }, (Object) null);
        AbstractC7667 abstractC7667 = c14163M46280.f42762;
        int i = 1;
        if (abstractC7667 == null || c14163M46280.f17559 != EnumC1296.f4582) {
            throw m46116("bad.enclosing.class", c14163, c14163M46280);
        }
        c14163.mo16101();
        C3581 c3581M46104 = m46104(c15144, abstractC7667, c14163.f17563);
        if (c15144 != null && c3581M46104 == null) {
            C14163 c14163M16071 = this.f64760.m16071();
            InterfaceC18278 interfaceC18278 = this.f64755;
            C11576 c11576 = C11886.f35440;
            throw new C22030(c14163M16071, interfaceC18278, this.f64772.m16617(new C11576("compiler", "bad.enclosing.method", c14163)), this.f64772, this.f64759);
        }
        AbstractC10370 abstractC10370 = c14163.f42771;
        AbstractC10370 abstractC10371 = c14163M46280.f42771;
        if (!abstractC10370.m26176(abstractC10371)) {
            throw m46116("bad.enclosing.method", abstractC10370);
        }
        String strSubstring = abstractC10370.toString().substring(abstractC10371.toString().length());
        if (strSubstring.length() < 1 || strSubstring.charAt(0) != '$') {
            throw m46116("bad.enclosing.method", abstractC10370);
        }
        while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
            i++;
        }
        String strSubstring2 = strSubstring.substring(i);
        C6136 c6136 = this.f64785;
        AbstractC10370 abstractC10370M30652 = c6136.f18880.m30652(strSubstring2);
        c14163.f17562 = abstractC10370M30652;
        c14163.f17561 = c3581M46104 != null ? c3581M46104 : c14163M46280;
        if (abstractC10370M30652.isEmpty()) {
            c14163.f42767 = c6136.f18867;
        } else {
            c14163.f42767 = AbstractC19810.m45553(c14163.f17562, c14163.f17561);
        }
        if (c3581M46104 != null) {
            ((C19955) abstractC5698.f17560).mo4959(c3581M46104.f17560);
        } else if ((c14163.f17563 & 8) == 0) {
            ((C19955) abstractC5698.f17560).mo4959(c14163M46280.f17560);
        } else {
            ((C19955) abstractC5698.f17560).mo4959(AbstractC4308.f13885);
        }
        m46118(c14163, c14163.f17560);
        if (!this.f64784.isEmpty()) {
            C18837 c18837 = new C18837();
            Iterator it = this.f64784.iterator();
            while (it.hasNext()) {
                c18837.m43511(m46115(((AbstractC4308) it.next()).f13890.f17562));
            }
            this.f64779 = c18837.m43517();
            return;
        }
        this.f64779 = C2609.m8239();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3581 m46104(C15144 c15144, AbstractC7667 abstractC7667, long j) {
        if (c15144 == null) {
            return null;
        }
        AbstractC10370 abstractC10370 = c15144.f46278;
        AbstractC4308 abstractC4308 = c15144.f46279;
        C10658 c10658Mo12945 = abstractC4308.mo12945();
        for (AbstractC5698 abstractC5698 : abstractC7667.m20476(abstractC10370)) {
            if (abstractC5698.f17559 == EnumC1296.f4571) {
                C10658 c10658Mo12946 = abstractC5698.f17560.mo12945();
                C2609 c2609 = c10658Mo12946.f32059;
                C6319 c6319 = this.f64756;
                C2609 c2609M8246 = c6319.m17520(c2609).m8246(c6319.m17519(c10658Mo12946.f32060));
                C2609 c2609M8247 = c10658Mo12945.f32059.m8246(c10658Mo12945.f32060);
                while (true) {
                    if (!c2609M8246.isEmpty() && !c2609M8247.isEmpty()) {
                        if (((AbstractC4308) c2609M8246.f8240).f13890 != ((AbstractC4308) c2609M8247.f8240).f13890) {
                            break;
                        }
                        c2609M8246 = c2609M8246.f8241;
                        c2609M8247 = c2609M8247.f8241;
                    } else {
                        if (!c2609M8246.isEmpty() || !c2609M8247.isEmpty()) {
                            break;
                        }
                        return (C3581) abstractC5698;
                    }
                }
            }
        }
        if (abstractC10370 == this.f64785.f18879 && (512 & j) == 0 && !abstractC4308.mo12933().isEmpty()) {
            return m46104(new C15144(abstractC10370, new C10658(abstractC4308.mo12933().f8241, abstractC4308.mo12923(), abstractC4308.mo12930(), this.f64770.f66481)), abstractC7667, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46119(AbstractC5698 abstractC5698, EnumC6596 enumC6596) {
        char cM46124 = m46124();
        for (int i = 0; i < cM46124; i++) {
            AbstractC10370 abstractC10370M46287 = this.f64767.m46287(m46124());
            int iM46128 = m46128();
            AbstractC20708 abstractC20708 = (AbstractC20708) this.f64775.get(abstractC10370M46287);
            if (abstractC20708 != null && abstractC20708.mo10868(enumC6596)) {
                abstractC20708.mo2858(iM46128, abstractC5698);
            } else {
                this.f64769 += iM46128;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46125(AbstractC5698 abstractC5698) {
        char cM46124 = m46124();
        C18837 c18837 = new C18837();
        for (int i = 0; i < cM46124; i++) {
            c18837.m43511(m46130());
        }
        C2609<C2363> c2609M43517 = c18837.m43517();
        if (c2609M43517.isEmpty()) {
            return;
        }
        C18837 c18838 = new C18837();
        for (C2363 c2363 : c2609M43517) {
            AbstractC4308 abstractC4308 = c2363.f26338;
            AbstractC10370 abstractC10370Mo16083 = abstractC4308.f13890.mo16083();
            C20661 c20661 = this.f64770;
            if (abstractC10370Mo16083 == c20661.f66468.f13890.mo16083()) {
                abstractC5698.f17563 |= 274877906944L;
            } else {
                AbstractC10370 abstractC10370Mo16084 = abstractC4308.f13890.mo16083();
                AbstractC10370 abstractC10370Mo16085 = c20661.f66484.f13890.mo16083();
                C6136 c6136 = this.f64785;
                if (abstractC10370Mo16084 == abstractC10370Mo16085) {
                    EnumC5973 enumC5973 = EnumC5973.f18321;
                    EnumC5973 enumC5974 = this.f64762;
                    if (enumC5974 != enumC5973) {
                        for (C23069 c23069 : c2363.f7553) {
                            if (c23069.f74207 == c6136.f18860) {
                                Object obj = c23069.f74208;
                                if (obj instanceof C17796) {
                                    C17796 c17796 = (C17796) obj;
                                    if (c17796.f26338 == c20661.f66452 && ((Integer) c17796.f54417).intValue() > enumC5974.f18324) {
                                        abstractC5698.f17563 |= 35184372088832L;
                                    }
                                }
                            }
                        }
                    }
                } else if (abstractC4308.f13890.mo16083() == c20661.f66493.f13890.mo16083()) {
                    abstractC5698.f17563 |= 72057594037927936L;
                    m46106(c2363, abstractC5698, c6136.f18892, 288230376151711744L);
                } else if (abstractC4308.f13890.mo16083() == c20661.f66466.f13890.mo16083()) {
                    C12171.m29642(abstractC5698.f17559 == EnumC1296.f4582);
                    abstractC5698.f17563 |= 9007199254740992L;
                } else {
                    AbstractC19810 abstractC19810 = abstractC4308.f13890;
                    if (abstractC19810 == c20661.f66451.f13890) {
                        this.f64788 = c2363;
                    } else if (abstractC19810 == c20661.f66530.f13890) {
                        this.f64765 = c2363;
                    } else if (abstractC19810 == c20661.f66448.f13890) {
                        abstractC5698.f17563 |= 18014398509613056L;
                        m46106(c2363, abstractC5698, c6136.f18832, 36028797018963968L);
                    } else if (abstractC19810 == c20661.f66491.f13890) {
                        abstractC5698.f17563 |= 72057594037927936L;
                        m46106(c2363, abstractC5698, c6136.f18892, 288230376151711744L);
                    } else if (abstractC19810 == c20661.f66450.f13890 && abstractC5698.f17559 == EnumC1296.f4582) {
                        abstractC5698.f17563 |= 9007199254740992L;
                    }
                    c18838.m43511(c2363);
                }
            }
        }
        this.f64777.m32405(new RunnableC17885(this, abstractC5698, c18838.m43517()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46106(C2363 c2363, AbstractC5698 abstractC5698, AbstractC10370 abstractC10370, long j) {
        for (C23069 c23069 : c2363.f7553) {
            if (c23069.f74207 == abstractC10370) {
                Object obj = c23069.f74208;
                if (obj instanceof C17796) {
                    C17796 c17796 = (C17796) obj;
                    if (c17796.f26338 == this.f64770.f66469 && ((Integer) c17796.f54417).intValue() != 0) {
                        abstractC5698.f17563 |= j;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m46131(AbstractC5698 abstractC5698) {
        int i = this.f64769;
        this.f64769 = i + 1;
        int i2 = this.f64787.f45448[i] & 255;
        C0245[] c0245Arr = this.f64752;
        if (c0245Arr == null) {
            this.f64752 = new C0245[i2];
        } else if (c0245Arr.length != i2) {
            throw m46116("bad.runtime.invisible.param.annotations", abstractC5698);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0245[] c0245Arr2 = this.f64752;
            if (c0245Arr2[i3] == null) {
                c0245Arr2[i3] = new C0245();
            }
            C0245 c0245 = c0245Arr2[i3];
            char cM46124 = m46124();
            C18837 c18837 = new C18837();
            for (int i4 = 0; i4 < cM46124; i4++) {
                c18837.m43511(m46130());
            }
            C2609 c2609M43517 = c18837.m43517();
            C2609 c2609 = c0245.f1530;
            if (c2609 == null) {
                c0245.f1530 = c2609M43517;
            } else {
                c0245.f1530 = c2609.m8248(c2609M43517);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46129(AbstractC5698 abstractC5698) {
        C9953 c9953M25095;
        C9953 c9953M25093;
        char cM46124 = m46124();
        if (cM46124 != 0) {
            C18837 c18837 = new C18837();
            for (int i = 0; i < cM46124; i++) {
                int iM46112 = m46112();
                if (!EnumC9372.m24190(iM46112)) {
                    throw m46116("bad.type.annotation.value", String.format("0x%02X", Integer.valueOf(iM46112)));
                }
                EnumC9372 enumC9372M24189 = EnumC9372.m24189(iM46112);
                switch (C10621.f31901[enumC9372M24189.ordinal()]) {
                    case 1:
                        char cM46125 = m46124();
                        c9953M25095 = C9953.m25095(m46127(), null, -1);
                        c9953M25095.f30056 = cM46125;
                        break;
                    case 2:
                        char cM46126 = m46124();
                        c9953M25095 = C9953.m25097(m46127(), null, -1);
                        c9953M25095.f30056 = cM46126;
                        break;
                    case 3:
                        char cM46127 = m46124();
                        c9953M25095 = C9953.m25079(m46127(), null, -1);
                        c9953M25095.f30056 = cM46127;
                        break;
                    case 4:
                        char cM46128 = m46124();
                        c9953M25095 = C9953.m25099(m46127(), null, -1);
                        c9953M25095.f30056 = cM46128;
                        break;
                    case 5:
                        int iM46124 = m46124();
                        int[] iArr = new int[iM46124];
                        int[] iArr2 = new int[iM46124];
                        int[] iArr3 = new int[iM46124];
                        for (int i2 = 0; i2 < iM46124; i2++) {
                            iArr[i2] = m46124();
                            iArr2[i2] = m46124();
                            iArr3[i2] = m46124();
                        }
                        c9953M25093 = C9953.m25093(m46127(), null, -1);
                        c9953M25093.f30047 = iArr;
                        c9953M25093.f30057 = iArr2;
                        c9953M25093.f30051 = iArr3;
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 6:
                        int iM46125 = m46124();
                        int[] iArr4 = new int[iM46125];
                        int[] iArr5 = new int[iM46125];
                        int[] iArr6 = new int[iM46125];
                        for (int i3 = 0; i3 < iM46125; i3++) {
                            iArr4[i3] = m46124();
                            iArr5[i3] = m46124();
                            iArr6[i3] = m46124();
                        }
                        c9953M25093 = C9953.m25084(m46127(), null, -1);
                        c9953M25093.f30047 = iArr4;
                        c9953M25093.f30057 = iArr5;
                        c9953M25093.f30051 = iArr6;
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 7:
                        char cM46129 = m46124();
                        c9953M25095 = C9953.m25086(m46127(), null, -1);
                        c9953M25095.m25102(cM46129);
                        break;
                    case 8:
                        c9953M25093 = C9953.m25089(m46127(), null, -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 9:
                        c9953M25093 = C9953.m25085(m46127(), null, m46112(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 10:
                        c9953M25093 = C9953.m25083(m46127(), null, m46112(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 11:
                        c9953M25093 = C9953.m25088(m46127(), null, m46112(), m46112(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 12:
                        c9953M25093 = C9953.m25081(m46127(), null, m46112(), m46112(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 13:
                        c9953M25093 = C9953.m25080(m46127(), null, m46124(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 14:
                        c9953M25093 = C9953.m25100(m46127(), null, m46124(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 15:
                        c9953M25093 = C9953.m25094(m46127(), null, m46112(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 16:
                        char cM461210 = m46124();
                        c9953M25095 = C9953.m25098(m46127(), null, m46112(), -1);
                        c9953M25095.f30056 = cM461210;
                        break;
                    case 17:
                        char cM461211 = m46124();
                        c9953M25095 = C9953.m25087(m46127(), null, m46112(), -1);
                        c9953M25095.f30056 = cM461211;
                        break;
                    case 18:
                        char cM461212 = m46124();
                        c9953M25095 = C9953.m25096(m46127(), null, m46112(), -1);
                        c9953M25095.f30056 = cM461212;
                        break;
                    case 19:
                        char cM461213 = m46124();
                        c9953M25095 = C9953.m25092(m46127(), null, m46112(), -1);
                        c9953M25095.f30056 = cM461213;
                        break;
                    case 20:
                        char cM461214 = m46124();
                        c9953M25095 = C9953.m25090(m46127(), null, m46112(), -1);
                        c9953M25095.f30056 = cM461214;
                        break;
                    case 21:
                        c9953M25093 = C9953.m25082(m46127(), null, -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 22:
                        c9953M25093 = C9953.m25091(m46127(), null, -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), c9953M25093));
                        break;
                    case 23:
                        throw new AssertionError("jvm.ClassReader: UNKNOWN target type should never occur!");
                    default:
                        throw new AssertionError("jvm.ClassReader: Unknown target type for position: " + enumC9372M24189);
                }
                c9953M25093 = c9953M25095;
                c18837.m43511(new C21413(m46130(), c9953M25093));
            }
            this.f64777.m32405(new C15061(this, abstractC5698, c18837.m43517()));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46117(AbstractC5698 abstractC5698) {
        C3581 c3581 = (C3581) abstractC5698;
        AbstractC8624 abstractC8624M46132 = m46132();
        c3581.f11370 = abstractC8624M46132;
        this.f64777.m32405(new RunnableC17179(this, c3581, abstractC8624M46132));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m46114(int i) {
        if (this.f64782.f911 == this.f64760) {
            return new C5185(this, i);
        }
        return this.f64767.m46288(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2363 m46130() {
        AbstractC4308 abstractC4308M46114;
        if (this.f64782.f911 != this.f64760) {
            abstractC4308M46114 = m46114((int) m46124());
        } else {
            abstractC4308M46114 = new C5185(this, m46124());
        }
        char cM46124 = m46124();
        C18837 c18837 = new C18837();
        for (int i = 0; i < cM46124; i++) {
            c18837.m43511(new C23069(this.f64767.m46287(m46124()), m46132()));
        }
        return new C2363(abstractC4308M46114, c18837.m43517());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2609 m46127() {
        C12774 c12774;
        int iM46112 = m46112();
        C18837 c18837 = new C18837();
        for (int i = 0; i < iM46112 * 2; i++) {
            c18837.m43511(Integer.valueOf(m46112()));
        }
        C2609 c2609M43517 = c18837.m43517();
        C2609 c2609 = C9953.f30042;
        C18837 c18838 = new C18837();
        Iterator it = c2609M43517.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C12171.m29642(it.hasNext());
            Integer num2 = (Integer) it.next();
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C12774 c12775 = C12774.f38378;
            C12171.m29642(iIntValue2 == 0 || iIntValue == EnumC12069.TYPE_ARGUMENT.f36094);
            if (iIntValue == 0) {
                c12774 = C12774.f38378;
            } else if (iIntValue == 1) {
                c12774 = C12774.f38380;
            } else if (iIntValue == 2) {
                c12774 = C12774.f38379;
            } else {
                if (iIntValue != 3) {
                    C12171.m29640("Invalid TypePathEntryKind tag: " + iIntValue);
                    throw null;
                }
                c12774 = new C12774(EnumC12069.TYPE_ARGUMENT, iIntValue2);
            }
            c18838.m43511(c12774);
        }
        return c18838.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m46103(int i, IntFunction intFunction, Object obj) {
        return i == 0 ? obj : intFunction.apply(i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC8624 m46132() {
        int i = this.f64769;
        this.f64769 = i + 1;
        char c = (char) this.f64787.f45448[i];
        if (c != '@') {
            C20661 c20661 = this.f64770;
            if (c == 'F') {
                return new C17796(this.f64767.m46281(m46124()), c20661.f66483);
            }
            if (c == 'S') {
                return new C17796(this.f64767.m46281(m46124()), c20661.f66513);
            }
            if (c == 'c') {
                AbstractC4308 abstractC4308M46114 = m46114((int) m46124());
                C9419 c9419 = new C9419(null);
                c9419.f28573 = abstractC4308M46114;
                return c9419;
            }
            if (c == 'e') {
                AbstractC4308 abstractC4308M46115 = m46114((int) m46124());
                AbstractC10370 abstractC10370M46287 = this.f64767.m46287(m46124());
                C3774 c3774 = new C3774(null);
                c3774.f11907 = abstractC4308M46115;
                c3774.f11908 = abstractC10370M46287;
                return c3774;
            }
            if (c == 's') {
                return new C17796(this.f64767.m46287(m46124()).toString(), c20661.f66533);
            }
            if (c == 'I') {
                return new C17796(this.f64767.m46281(m46124()), c20661.f66452);
            }
            if (c == 'J') {
                return new C17796(this.f64767.m46281(m46124()), c20661.f66470);
            }
            if (c == 'Z') {
                return new C17796(this.f64767.m46281(m46124()), c20661.f66469);
            }
            if (c != '[') {
                switch (c) {
                    case 'B':
                        return new C17796(this.f64767.m46281(m46124()), c20661.f66502);
                    case 'C':
                        return new C17796(this.f64767.m46281(m46124()), c20661.f66454);
                    case 'D':
                        return new C17796(this.f64767.m46281(m46124()), c20661.f66499);
                    default:
                        throw new AssertionError("unknown annotation tag '" + c + "'");
                }
            }
            char cM46124 = m46124();
            C18837 c18837 = new C18837();
            for (int i2 = 0; i2 < cM46124; i2++) {
                c18837.m43511(m46132());
            }
            C2609 c2609M43517 = c18837.m43517();
            C23529 c23529 = new C23529(null);
            c23529.f75550 = c2609M43517;
            return c23529;
        }
        return m46130();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46120(AbstractC10370 abstractC10370, AbstractC4308 abstractC4308) {
        if ((!abstractC4308.m12913(EnumC9454.METHOD) && !abstractC4308.m12913(EnumC9454.FORALL)) || (abstractC10370 == this.f64785.f18879 && !abstractC4308.mo12923().m12913(EnumC9454.VOID))) {
            throw m46116("method.descriptor.invalid", abstractC10370);
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m46123() {
        this.f64769 += 6;
        char cM46124 = m46124();
        for (int i = 0; i < cM46124; i++) {
            this.f64769 += 2;
            this.f64769 += m46128();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46118(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308) {
        if (abstractC4308.mo4958() != null) {
            if (!abstractC4308.mo4958().m12913(EnumC9454.NONE)) {
                m46118(abstractC5698.f17561, abstractC4308.mo4958());
            }
        } else if (abstractC5698.f17559 == EnumC1296.f4571 && !abstractC5698.mo15572()) {
            AbstractC5698 abstractC5699 = abstractC5698.f17561;
            m46118(abstractC5699, abstractC5699.f17560);
        }
        for (C2609 c2609Mo12938 = abstractC4308.mo12938(); c2609Mo12938.m8249(); c2609Mo12938 = c2609Mo12938.f8241) {
            this.f64783.mo26382(((AbstractC4308) c2609Mo12938.f8240).f13890);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46126(C14163 c14163) {
        char cM46124 = m46124();
        for (int i = 0; i < cM46124; i++) {
            m46124();
            char cM46125 = m46124();
            char cM46126 = m46124();
            final C20085 c20085 = this.f64767;
            C11003.requireNonNull(c20085);
            C14163 c14164 = (C14163) m46103(cM46125, new IntFunction() { // from class: l.᩻᩻۠
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return c20085.m46280(i2);
                }
            }, (Object) null);
            C20085 c20086 = this.f64767;
            C11003.requireNonNull(c20086);
            C14853 c14853 = new C14853(c20086);
            C6136 c6136 = this.f64785;
            AbstractC10370 abstractC10370 = c6136.f18867;
            AbstractC10370 abstractC10371 = c6136.f18867;
            AbstractC10370 abstractC10372 = (AbstractC10370) m46103(cM46126, c14853, abstractC10370);
            if (abstractC10372 == null) {
                abstractC10372 = abstractC10371;
            }
            long jM46124 = m46124();
            if ((X931RNG.BLOCK64_RESEED_MAX & jM46124) != 0) {
                jM46124 = (jM46124 & (-32769)) | 2251799813685248L;
            }
            long j = (-33) & jM46124;
            if (c14164 != null) {
                if (abstractC10372 == abstractC10371) {
                    abstractC10372 = c6136.f18821;
                }
                C14163 c14163M47261 = this.f64770.m47261(this.f64782, abstractC10372, c14164);
                if ((jM46124 & 8) == 0) {
                    ((C19955) c14163M47261.f17560).mo4959(c14164.f17560);
                    AbstractC4308 abstractC4308 = c14163M47261.f17565;
                    if (abstractC4308 != null) {
                        ((C19955) abstractC4308).mo4959(this.f64756.m17519(c14164.f17560));
                    }
                }
                if (c14163 == c14164) {
                    c14163M47261.f17563 = j;
                    m46107(c14163, c14163M47261);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m46111(C14163 c14163) {
        C6319 c6319;
        C3581 c3581;
        int iM4791;
        AbstractC4308 abstractC4308;
        AbstractC10370 abstractC10370M30652;
        AbstractC10370 abstractC10370;
        long j;
        C0245 c0245;
        C2609 c2609;
        int i;
        int i2;
        boolean z;
        char c = 0;
        if (m46128() != -889275714) {
            throw m46116("illegal.start.of.class.file", new Object[0]);
        }
        this.f64771 = m46124();
        this.f64758 = m46124();
        int i3 = EnumC16970.m39797().f52075;
        int i4 = EnumC16970.m39797().f52076;
        int i5 = this.f64771;
        boolean z2 = i5 == 65535;
        int i6 = this.f64758;
        int i7 = 2;
        C22364 c22364 = this.f64746;
        if (i6 > i3 || (i6 * 1000) + i5 < (EnumC16970.m39798().f52075 * 1000) + EnumC16970.m39798().f52076) {
            int i8 = this.f64758;
            if (i8 != i3 + 1 || z2) {
                throw m46116("wrong.version", Integer.toString(i8), Integer.toString(this.f64771), Integer.toString(i3), Integer.toString(i4));
            }
            InterfaceC18278 interfaceC18278 = this.f64755;
            C11076 c11076 = C14001.f42334;
            c22364.m7275(new C11076("compiler", "big.major.version", interfaceC18278, Integer.valueOf(i8), Integer.valueOf(i3)));
        }
        if (z2) {
            C23168 c23168 = this.f64766;
            if (c23168.m51347()) {
                c23168.m51350(c14163.f42766, this.f64758);
            } else {
                c22364.m7276(c23168.m51343(this.f64755, this.f64758));
            }
        }
        C14896 c14896 = this.f64787;
        C6136 c6136 = this.f64785;
        C20661 c20661 = this.f64770;
        C20085 c20085 = new C20085(this, c14896, c6136, c20661);
        this.f64767 = c20085;
        int iM46278 = c20085.m46278(c14896, this.f64769);
        this.f64769 = iM46278;
        if (this.f64778.length < iM46278) {
            this.f64778 = new byte[Integer.highestOneBit(iM46278) << 1];
        }
        C19955 c19955 = (C19955) c14163.f17560;
        c14163.f42762 = AbstractC14016.m33607(c14163);
        this.f64783 = this.f64783.mo26380(this.f64760);
        if (c19955.mo4958().m12913(EnumC9454.CLASS)) {
            m46118(c14163.f17561, c19955.mo4958());
        }
        long jM46124 = m46124();
        if ((X931RNG.BLOCK64_RESEED_MAX & jM46124) != 0) {
            jM46124 = (jM46124 & (-32769)) | 2251799813685248L;
        }
        long j2 = (-33) & jM46124;
        long j3 = jM46124 & 2251799813685248L;
        if (j3 == 0) {
            EnumC1296 enumC1296 = c14163.f17561.f17559;
            if (enumC1296 == EnumC1296.f4579 || enumC1296 == EnumC1296.f4581) {
                c14163.f17563 = j2;
            }
            this.f64782 = c14163.m16089().f24147;
            C14163 c14163M46280 = this.f64767.m46280(m46124());
            if (c14163 != c14163M46280) {
                throw m46116("class.file.wrong.class", c14163M46280.f42771);
            }
        } else {
            int i9 = this.f64758;
            if (i9 < EnumC16970.V53.f52075) {
                throw m46116("anachronistic.module.info", Integer.toString(i9), Integer.toString(this.f64771));
            }
            c14163.f17563 = j2;
            AbstractC5698 abstractC5698 = c14163.f17561;
            if (abstractC5698.f17559 != EnumC1296.f4568) {
                throw m46116("module.info.definition.expected", new Object[0]);
            }
            this.f64782 = (C0052) abstractC5698;
            m46124();
        }
        int i10 = this.f64769;
        m46124();
        this.f64769 = (m46124() * 2) + this.f64769;
        char cM46124 = m46124();
        for (int i11 = 0; i11 < cM46124; i11++) {
            m46123();
        }
        char cM46125 = m46124();
        for (int i12 = 0; i12 < cM46125; i12++) {
            m46123();
        }
        m46119(c14163, EnumC6596.CLASS);
        C2609 c26010 = c14163.f42765;
        if (c26010 != null && !c26010.isEmpty()) {
            c14163.f17563 |= SkeinEngine.UbiTweak.T1_FIRST;
        }
        this.f64769 = i10;
        char cM46126 = m46124();
        if (j3 != 0 && cM46126 > 0) {
            throw m46116("module.info.invalid.super.class", new Object[0]);
        }
        if (c19955.f64618 == null) {
            c19955.f64618 = (AbstractC4308) m46103(cM46126, new IntFunction() { // from class: l.ܿ᩻۠
                @Override // java.util.function.IntFunction
                public final Object apply(int i13) {
                    C20002 c20002 = this.f54076;
                    return c20002.f64767.m46280(i13).mo16091(c20002.f64756);
                }
            }, AbstractC4308.f13885);
        }
        char cM46127 = m46124();
        C2609 c2609M8239 = C2609.m8239();
        int i13 = 0;
        while (true) {
            c6319 = this.f64756;
            if (i13 >= cM46127) {
                break;
            }
            c2609M8239 = c2609M8239.m8246(this.f64767.m46280(m46124()).mo16091(c6319));
            i13++;
        }
        if (c19955.f64620 == null) {
            c19955.f64620 = c2609M8239.m8250();
        }
        C12171.m29642(cM46124 == m46124());
        for (int i14 = 0; i14 < cM46124; i14++) {
            AbstractC5698 c12048 = new C12048(m46124(), this.f64767.m46287(m46124()), this.f64767.m46288(m46124()), this.f64760);
            m46119(c12048, EnumC6596.MEMBER);
            m46107(c14163, c12048);
        }
        C12171.m29642(cM46125 == m46124());
        int i15 = 0;
        while (i15 < cM46125) {
            long jM46125 = m46124();
            if ((64 & jM46125) != 0) {
                jM46125 = (jM46125 & (-65)) | 2147483648L;
            }
            if ((128 & jM46125) != 0) {
                jM46125 = (jM46125 & (-129)) | 17179869184L;
            }
            AbstractC10370 abstractC10370M46287 = this.f64767.m46287(m46124());
            AbstractC4308 abstractC4308M46288 = this.f64767.m46288(m46124());
            if (this.f64760.m16070() && (jM46125 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 && !abstractC10370M46287.equals(c6136.f18842)) {
                int i16 = this.f64758;
                EnumC16970 enumC16970 = EnumC16970.V52;
                int i17 = enumC16970.f52075;
                if (i16 <= i17 && (i16 != i17 || this.f64771 < enumC16970.f52076)) {
                    String str = (8 & jM46125) == 0 ? "invalid.default.interface" : "invalid.static.interface";
                    Object string = Integer.toString(i16);
                    Object string2 = Integer.toString(this.f64771);
                    Object[] objArr = new Object[i7];
                    objArr[c] = string;
                    objArr[1] = string2;
                    throw m46116(str, objArr);
                }
                if ((10 & jM46125) == 0) {
                    this.f64760.f17563 |= 8796093022208L;
                    jM46125 |= 8796093023232L;
                }
            }
            m46120(abstractC10370M46287, abstractC4308M46288);
            if (abstractC10370M46287 == c6136.f18879 && this.f64760.m16087()) {
                AbstractC14016 abstractC14016Mo16064 = this.f64760.f17561.mo16064();
                AbstractC5698 abstractC5699 = this.f64760;
                EnumC1317 enumC1317 = EnumC1317.NON_RECURSIVE;
                abstractC14016Mo16064.getClass();
                boolean zHasNext = abstractC14016Mo16064.mo20477(abstractC5699.f17562, new C7646(abstractC5699), enumC1317).iterator().hasNext();
                if (!this.f64760.f17562.isEmpty() && zHasNext) {
                    C2609<AbstractC4308> c2609Mo12933 = abstractC4308M46288.mo12933();
                    if (!c2609Mo12933.isEmpty()) {
                        if ((jM46125 & 17179869184L) != 0) {
                            AbstractC4308 abstractC4309 = (AbstractC4308) c2609Mo12933.last();
                            C18837 c18837 = new C18837();
                            for (AbstractC4308 abstractC4308M14698 : c2609Mo12933) {
                                if (abstractC4308M14698 == abstractC4309) {
                                    abstractC4308M14698 = ((C5138) abstractC4308M14698).m14698();
                                }
                                c18837.m43511(abstractC4308M14698);
                            }
                            c2609Mo12933 = c18837.m43517();
                        }
                        c2609Mo12933 = c2609Mo12933.f8241;
                    }
                    abstractC4308M46288 = new C10658(c2609Mo12933, abstractC4308M46288.mo12923(), abstractC4308M46288.mo12930(), c20661.f66481);
                }
            }
            C3581 c3582 = new C3581(jM46125, abstractC10370M46287, abstractC4308M46288, this.f64760);
            if (c6319.m17503(c3582)) {
                c3582.f17563 |= 70368744177664L;
            }
            if (this.f64786) {
                int iM4781 = C1365.m4781(c3582.f17560.mo12933()) + 4;
                int[] iArr = this.f64750;
                if (iArr == null || iArr.length < iM4781) {
                    this.f64750 = new int[iM4781];
                    z = false;
                } else {
                    z = false;
                    Arrays.fill(iArr, 0);
                }
                this.f64768 = z;
            }
            AbstractC5698 abstractC56910 = this.f64760;
            this.f64760 = c3582;
            try {
                m46119(c3582, EnumC6596.MEMBER);
                this.f64760 = abstractC56910;
                m46120(abstractC10370M46287, c3582.f17560);
                if (this.f64768) {
                    iM4791 = 0;
                } else {
                    iM4791 = (c3582.f17563 & 8) == 0 ? 1 : 0;
                    if (c3582.f17562 == c6136.f18879 && this.f64760.m16087() && !this.f64760.f17562.isEmpty()) {
                        iM4791++;
                    }
                    if (c3582.f17560 != abstractC4308M46288) {
                        iM4791 += C1365.m4781(abstractC4308M46288.mo12933()) - C1365.m4781(c3582.f17560.mo12933());
                    }
                }
                HashSet hashSet = new HashSet();
                C18837 c18838 = new C18837();
                int i18 = 0;
                for (AbstractC4308 abstractC43010 : c3582.f17560.mo12933()) {
                    C20661 c20662 = c20661;
                    int[] iArr2 = this.f64781;
                    long j4 = 8589934592L;
                    char c2 = cM46125;
                    if (iArr2 != null && iM4791 < iArr2.length && (i2 = iArr2[iM4791]) != 0) {
                        j4 = ((long) i2) | 8589934592L;
                    }
                    int[] iArr3 = this.f64750;
                    if (iArr3 == null || iM4791 >= iArr3.length || (i = iArr3[iM4791]) == 0) {
                        String strM37867 = "arg";
                        while (true) {
                            StringBuilder sbM15339 = C5368.m15339(strM37867);
                            sbM15339.append(hashSet.size());
                            abstractC10370M30652 = c6136.f18880.m30652(sbM15339.toString());
                            if (!hashSet.contains(abstractC10370M30652)) {
                                break;
                            } else {
                                strM37867 = C16014.m37867(strM37867, "$");
                            }
                        }
                        abstractC10370 = abstractC10370M30652;
                        j = j4;
                    } else {
                        C20085 c20086 = this.f64767;
                        C11003.requireNonNull(c20086);
                        abstractC10370 = (AbstractC10370) m46103(i, new C14853(c20086), c6136.f18867);
                        j = j4 | 4503599627370496L;
                    }
                    hashSet.add(abstractC10370);
                    C14869 c14869 = new C14869(j, abstractC10370, abstractC43010, c3582);
                    c18838.m43511(c14869);
                    C0245[] c0245Arr = this.f64752;
                    if (c0245Arr != null && (c0245 = c0245Arr[i18]) != null && (c2609 = c0245.f1530) != null && !c2609.isEmpty()) {
                        this.f64777.m32405(new RunnableC17885(this, c14869, c0245.f1530));
                    }
                    iM4791 += this.f64768 ? 1 : C1365.m4791(abstractC43010);
                    i18++;
                    c20661 = c20662;
                    cM46125 = c2;
                    abstractC4308M46288 = abstractC4308M46288;
                }
                C20661 c20663 = c20661;
                char c3 = cM46125;
                AbstractC4308 abstractC43011 = abstractC4308M46288;
                C0245[] c0245Arr2 = this.f64752;
                if (c0245Arr2 != null && c0245Arr2.length != i18) {
                    throw m46116("bad.runtime.invisible.param.annotations", c3582);
                }
                C12171.m29644(c3582.f11367);
                c3582.f11367 = c18838.m43517();
                this.f64752 = null;
                this.f64750 = null;
                this.f64781 = null;
                if ((jM46125 & 17179869184L) != 0 && ((abstractC4308 = (AbstractC4308) abstractC43011.mo12933().last()) == null || !abstractC4308.m12913(EnumC9454.ARRAY))) {
                    c3582.f17563 &= -17179869185L;
                    throw m46116("malformed.vararg.method", c3582);
                }
                m46107(c14163, c3582);
                i15++;
                c = 0;
                i7 = 2;
                c20661 = c20663;
                cM46125 = c3;
            } catch (Throwable th) {
                this.f64760 = abstractC56910;
                throw th;
            }
        }
        if (c14163.m33810()) {
            for (C21221 c21221 : c14163.m33811()) {
                AbstractC10370 abstractC10371 = c21221.f17562;
                C2609 c2609M82310 = C2609.m8239();
                c14163.mo16101();
                AbstractC14016 abstractC14016 = c14163.f42762;
                C17904 c17904 = new C17904(1);
                abstractC14016.getClass();
                Iterator it = abstractC14016.mo20477(abstractC10371, c17904, EnumC1317.RECURSIVE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c3581 = null;
                        break;
                    }
                    AbstractC5698 abstractC56911 = (AbstractC5698) it.next();
                    if (c6319.m17549(abstractC56911.f17560.mo12933(), c2609M82310)) {
                        c3581 = (C3581) abstractC56911;
                        break;
                    }
                }
                c21221.f68391 = c3581;
            }
        }
        this.f64783 = this.f64783.mo26377();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46121(C14163 c14163) {
        C6319 c6319 = this.f64756;
        this.f64760 = c14163;
        this.f64755 = c14163.f42766;
        this.f64761.clear();
        this.f64751 = true;
        this.f64788 = null;
        this.f64765 = null;
        try {
            try {
                this.f64769 = 0;
                C14896 c14896 = this.f64787;
                c14896.f45449 = 0;
                c14896.m35350(c14163.f42766.mo20795());
                m46111(c14163);
                if (!this.f64784.isEmpty() && !this.f64779.isEmpty()) {
                    C2609 c2609 = this.f64784;
                    C2609 c26010 = this.f64779;
                    this.f64784 = C2609.m8239();
                    this.f64779 = C2609.m8239();
                    this.f64745 = C2609.m8239();
                    this.f64780 = C2609.m8239();
                    this.f64751 = false;
                    C19955 c19955 = (C19955) this.f64760.f17560;
                    c19955.f64618 = c6319.m17488(c19955.f64618, c2609, c26010);
                    c19955.f64620 = c6319.m17481(c19955.f64620, c2609, c26010);
                    C2609 c2609M17521 = c6319.m17521(c19955.f64616, c2609, c26010);
                    c19955.f64616 = c2609M17521;
                    while (c2609M17521.m8249()) {
                        Object obj = c2609M17521.f8240;
                        ((AbstractC4308) obj).f13890.f17560 = (AbstractC4308) obj;
                        c2609M17521 = c2609M17521.f8241;
                    }
                } else if (this.f64784.isEmpty() != this.f64779.isEmpty()) {
                    throw m46116("undecl.type.var", ((AbstractC4308) this.f64784.f8240).f13890.f17562);
                }
                if ((c14163.f17563 & 8192) != 0) {
                    c14163.m33805(new C21863(c14163, new C15767(this, c14163, this.f64788, this.f64765)));
                } else {
                    c14163.m33805(C21863.m49251());
                }
                if (c14163 == this.f64782.f911) {
                    if (this.f64745.m8249() || this.f64780.m8249()) {
                        C12171.m29642(this.f64782.f17564.mo7078());
                        C0052 c0052 = this.f64782;
                        c0052.f923 = new C22118(this, c0052, this.f64745, this.f64780);
                    } else {
                        this.f64782.f917 = C2609.m8239();
                        this.f64782.f925 = C2609.m8239();
                    }
                }
                this.f64745 = C2609.m8239();
                this.f64780 = C2609.m8239();
                this.f64784 = C2609.m8239();
                this.f64779 = C2609.m8239();
                this.f64751 = false;
            } catch (IOException e) {
                e = e;
                throw m46116("unable.to.access.file", e.toString());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw m46116("bad.class.file", c14163.f42771);
            } catch (ClosedFileSystemException e2) {
                e = e2;
                throw m46116("unable.to.access.file", e.toString());
            }
        } catch (Throwable th) {
            this.f64745 = C2609.m8239();
            this.f64780 = C2609.m8239();
            this.f64784 = C2609.m8239();
            this.f64779 = C2609.m8239();
            this.f64751 = false;
            throw th;
        }
    }
}
