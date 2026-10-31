package l;

import android.util.Pair;
import com.umeng.analytics.pro.bo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import java.util.Collections;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۘ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C3590 implements InterfaceC15583 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final double[] f11386 = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0913 f11387;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f11388;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f11389;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f11390;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f11391 = new boolean[4];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f11392;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f11393;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2179 f11394;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f11395;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f11396;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f11397;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f11398;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f11399;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5707 f11400;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C17714 f11401;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f11402;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f11403;

    public C3590(C0913 c0913, String str) {
        this.f11387 = c0913;
        this.f11388 = str;
        C2179 c2179 = new C2179();
        c2179.f7172 = new byte[128];
        this.f11394 = c2179;
        if (c0913 != null) {
            this.f11400 = new C5707(178);
            this.f11401 = new C17714();
        } else {
            this.f11400 = null;
            this.f11401 = null;
        }
        this.f11403 = -9223372036854775807L;
        this.f11396 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1000() {
        C16509.m38887(this.f11391);
        this.f11394.m7194();
        C5707 c5707 = this.f11400;
        if (c5707 != null) {
            c5707.m16117();
        }
        this.f11390 = 0L;
        this.f11389 = false;
        this.f11403 = -9223372036854775807L;
        this.f11396 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f11397 = c19259.m44444();
        this.f11395 = interfaceC21830.mo3429(c19259.m44445(), 2);
        C0913 c0913 = this.f11387;
        if (c0913 != null) {
            c0913.m3268(interfaceC21830, c19259);
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f11403 = j;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0131  */
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
    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1002(C17714 c17714) {
        C2179 c2179;
        C5707 c5707;
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j;
        C22632.m50632(this.f11395);
        int iM41485 = c17714.m41485();
        int iM41483 = c17714.m41483();
        byte[] bArrM41482 = c17714.m41482();
        this.f11390 += (long) c17714.m41457();
        this.f11395.mo8453(c17714.m41457(), c17714);
        while (true) {
            int iM38879 = C16509.m38879(iM41485, iM41483, bArrM41482, this.f11391);
            c2179 = this.f11394;
            c5707 = this.f11400;
            if (iM38879 == iM41483) {
                break;
            }
            int i5 = iM38879 + 3;
            int i6 = c17714.m41482()[i5] & 255;
            int i7 = iM38879 - iM41485;
            if (this.f11398) {
                i6 = i6;
                i5 = i5;
            } else {
                if (i7 > 0) {
                    c2179.m7195(iM41485, iM38879, bArrM41482);
                }
                if (c2179.m7196(i6, i7 < 0 ? -i7 : 0)) {
                    String str = this.f11397;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(c2179.f7172, c2179.f7174);
                    int i8 = bArrCopyOf[4] & 255;
                    byte b = bArrCopyOf[5];
                    int i9 = (i8 << 4) | ((b & 255) >> 4);
                    int i10 = (bArrCopyOf[6] & 255) | ((b & 15) << 8);
                    int i11 = (bArrCopyOf[7] & 240) >> 4;
                    if (i11 == 2) {
                        f = i10 * 4;
                        i3 = i9 * 3;
                    } else if (i11 != 3) {
                        if (i11 != 4) {
                            f2 = 1.0f;
                        } else {
                            f = i10 * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i3 = i9 * 100;
                        }
                        C1297 c1297 = new C1297();
                        c1297.m4469(str);
                        c1297.m4462(this.f11388);
                        c1297.m4465("video/mpeg2");
                        c1297.m4453(i9);
                        c1297.m4457(i10);
                        c1297.m4460(f2);
                        c1297.m4446(Collections.singletonList(bArrCopyOf));
                        C8353 c8353M4440 = c1297.m4440();
                        i4 = (bArrCopyOf[7] & 15) - 1;
                        if (i4 >= 0 || i4 >= 8) {
                            i6 = i6;
                            i5 = i5;
                            j = 0;
                        } else {
                            double d = f11386[i4];
                            byte b2 = bArrCopyOf[c2179.f7175 + 9];
                            int i12 = (b2 & UTF8.S_P4B) >> 5;
                            int i13 = b2 & bo.j;
                            if (i12 != i13) {
                                d *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                            }
                            j = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(c8353M4440, Long.valueOf(j));
                        this.f11395.mo8456((C8353) pairCreate.first);
                        this.f11399 = ((Long) pairCreate.second).longValue();
                        this.f11398 = true;
                    } else {
                        f = i10 * 16;
                        i3 = i9 * 9;
                    }
                    f2 = f / i3;
                    C1297 c1298 = new C1297();
                    c1298.m4469(str);
                    c1298.m4462(this.f11388);
                    c1298.m4465("video/mpeg2");
                    c1298.m4453(i9);
                    c1298.m4457(i10);
                    c1298.m4460(f2);
                    c1298.m4446(Collections.singletonList(bArrCopyOf));
                    C8353 c8353M4441 = c1298.m4440();
                    i4 = (bArrCopyOf[7] & 15) - 1;
                    if (i4 >= 0) {
                        i6 = i6;
                        i5 = i5;
                        j = 0;
                    } else {
                        i6 = i6;
                        i5 = i5;
                        j = 0;
                    }
                    Pair pairCreate2 = Pair.create(c8353M4441, Long.valueOf(j));
                    this.f11395.mo8456((C8353) pairCreate2.first);
                    this.f11399 = ((Long) pairCreate2.second).longValue();
                    this.f11398 = true;
                } else {
                    i6 = i6;
                    i5 = i5;
                }
            }
            if (c5707 != null) {
                if (i7 > 0) {
                    c5707.m16114(iM41485, iM38879, bArrM41482);
                    i2 = 0;
                } else {
                    i2 = -i7;
                }
                if (c5707.m16116(i2)) {
                    int iM38880 = C16509.m38880(c5707.f17588, c5707.f17586);
                    String str2 = C3603.f11424;
                    byte[] bArr = c5707.f17586;
                    C17714 c17715 = this.f11401;
                    c17715.m41462(iM38880, bArr);
                    this.f11387.m3267(this.f11396, c17715);
                }
                i = i6;
                if (i == 178 && c17714.m41482()[iM38879 + 2] == 1) {
                    c5707.m16118(i);
                }
            } else {
                i = i6;
            }
            if (i == 0 || i == 179) {
                int i14 = iM41483 - iM38879;
                if (this.f11402 && this.f11398) {
                    long j2 = this.f11396;
                    if (j2 != -9223372036854775807L) {
                        this.f11395.mo8455(j2, this.f11393 ? 1 : 0, ((int) (this.f11390 - this.f11392)) - i14, i14, null);
                    }
                }
                if (!this.f11389 || this.f11402) {
                    this.f11392 = this.f11390 - ((long) i14);
                    long j3 = this.f11403;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.f11396;
                        j3 = j4 != -9223372036854775807L ? j4 + this.f11399 : -9223372036854775807L;
                    }
                    this.f11396 = j3;
                    this.f11393 = false;
                    this.f11403 = -9223372036854775807L;
                    this.f11389 = true;
                }
                this.f11402 = i == 0;
            } else if (i == 184) {
                this.f11393 = true;
            }
            iM41485 = i5;
        }
        if (!this.f11398) {
            c2179.m7195(iM41485, iM41483, bArrM41482);
        }
        if (c5707 != null) {
            c5707.m16114(iM41485, iM41483, bArrM41482);
        }
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
    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1004(boolean z) {
        C22632.m50632(this.f11395);
        if (z) {
            boolean z2 = this.f11393;
            this.f11395.mo8455(this.f11396, z2 ? 1 : 0, (int) (this.f11390 - this.f11392), 0, null);
        }
    }
}
