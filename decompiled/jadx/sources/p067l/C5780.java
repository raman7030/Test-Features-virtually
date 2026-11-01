package p067l;

import android.util.Pair;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import java.util.Collections;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۘ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5780 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ۚ */
    public static final double[] f14190 = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: ֡ */
    public final C3236 f14191;

    /* JADX INFO: renamed from: ֫ */
    public final String f14192;

    /* JADX INFO: renamed from: ۖ */
    public boolean f14193;

    /* JADX INFO: renamed from: ۘ */
    public long f14194;

    /* JADX INFO: renamed from: ۜ */
    public final boolean[] f14195 = new boolean[4];

    /* JADX INFO: renamed from: ۡ */
    public long f14196;

    /* JADX INFO: renamed from: ۢ */
    public boolean f14197;

    /* JADX INFO: renamed from: ۧ */
    public final C4439 f14198;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC20790 f14199;

    /* JADX INFO: renamed from: ܺ */
    public long f14200;

    /* JADX INFO: renamed from: ܽ */
    public String f14201;

    /* JADX INFO: renamed from: ܿ */
    public boolean f14202;

    /* JADX INFO: renamed from: ᩳ */
    public long f14203;

    /* JADX INFO: renamed from: ᩴ */
    public final C7792 f14204;

    /* JADX INFO: renamed from: ᩵ */
    public final C19203 f14205;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f14206;

    /* JADX INFO: renamed from: ᩻ */
    public long f14207;

    public C5780(C3236 c3236, String str) {
        this.f14191 = c3236;
        this.f14192 = str;
        C4439 c4439 = new C4439();
        c4439.f9957 = new byte[128];
        this.f14198 = c4439;
        if (c3236 != null) {
            this.f14204 = new C7792(178);
            this.f14205 = new C19203();
        } else {
            this.f14204 = null;
            this.f14205 = null;
        }
        this.f14207 = -9223372036854775807L;
        this.f14200 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        C18058.m41113(this.f14195);
        this.f14198.m9273();
        C7792 c7792 = this.f14204;
        if (c7792 != null) {
            c7792.m18036();
        }
        this.f14194 = 0L;
        this.f14193 = false;
        this.f14207 = -9223372036854775807L;
        this.f14200 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f14201 = c20672.m46738();
        this.f14199 = interfaceC23116.mo5732(c20672.m46739(), 2);
        C3236 c3236 = this.f14191;
        if (c3236 != null) {
            c3236.m5587(interfaceC23116, c20672);
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f14207 = j;
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
    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) {
        C4439 c4439;
        C7792 c7792;
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j;
        C23877.m52958(this.f14199);
        int iM43731 = c19203.m43731();
        int iM43729 = c19203.m43729();
        byte[] bArrM43728 = c19203.m43728();
        this.f14194 += (long) c19203.m43703();
        this.f14199.mo10500(c19203.m43703(), c19203);
        while (true) {
            int iM41105 = C18058.m41105(iM43731, iM43729, bArrM43728, this.f14195);
            c4439 = this.f14198;
            c7792 = this.f14204;
            if (iM41105 == iM43729) {
                break;
            }
            int i5 = iM41105 + 3;
            int i6 = c19203.m43728()[i5] & 255;
            int i7 = iM41105 - iM43731;
            if (this.f14202) {
                i6 = i6;
                i5 = i5;
            } else {
                if (i7 > 0) {
                    c4439.m9274(iM43731, iM41105, bArrM43728);
                }
                if (c4439.m9275(i6, i7 < 0 ? -i7 : 0)) {
                    String str = this.f14201;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(c4439.f9957, c4439.f9959);
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
                        C3601 c3601 = new C3601();
                        c3601.m6701(str);
                        c3601.m6694(this.f14192);
                        c3601.m6697("video/mpeg2");
                        c3601.m6685(i9);
                        c3601.m6689(i10);
                        c3601.m6692(f2);
                        c3601.m6678(Collections.singletonList(bArrCopyOf));
                        C10307 c10307M6672 = c3601.m6672();
                        i4 = (bArrCopyOf[7] & 15) - 1;
                        if (i4 >= 0 || i4 >= 8) {
                            i6 = i6;
                            i5 = i5;
                            j = 0;
                        } else {
                            double d = f14190[i4];
                            byte b2 = bArrCopyOf[c4439.f9960 + 9];
                            int i12 = (b2 & UTF8.S_P4B) >> 5;
                            int i13 = b2 & C0684bo.f2505j;
                            if (i12 != i13) {
                                d *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                            }
                            j = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(c10307M6672, Long.valueOf(j));
                        this.f14199.mo10503((C10307) pairCreate.first);
                        this.f14203 = ((Long) pairCreate.second).longValue();
                        this.f14202 = true;
                    } else {
                        f = i10 * 16;
                        i3 = i9 * 9;
                    }
                    f2 = f / i3;
                    C3601 c3602 = new C3601();
                    c3602.m6701(str);
                    c3602.m6694(this.f14192);
                    c3602.m6697("video/mpeg2");
                    c3602.m6685(i9);
                    c3602.m6689(i10);
                    c3602.m6692(f2);
                    c3602.m6678(Collections.singletonList(bArrCopyOf));
                    C10307 c10307M6673 = c3602.m6672();
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
                    Pair pairCreate2 = Pair.create(c10307M6673, Long.valueOf(j));
                    this.f14199.mo10503((C10307) pairCreate2.first);
                    this.f14203 = ((Long) pairCreate2.second).longValue();
                    this.f14202 = true;
                } else {
                    i6 = i6;
                    i5 = i5;
                }
            }
            if (c7792 != null) {
                if (i7 > 0) {
                    c7792.m18033(iM43731, iM41105, bArrM43728);
                    i2 = 0;
                } else {
                    i2 = -i7;
                }
                if (c7792.m18035(i2)) {
                    int iM41106 = C18058.m41106(c7792.f20434, c7792.f20432);
                    String str2 = C5792.f14228;
                    byte[] bArr = c7792.f20432;
                    C19203 c19204 = this.f14205;
                    c19204.m43708(iM41106, bArr);
                    this.f14191.m5586(this.f14200, c19204);
                }
                i = i6;
                if (i == 178 && c19203.m43728()[iM41105 + 2] == 1) {
                    c7792.m18037(i);
                }
            } else {
                i = i6;
            }
            if (i == 0 || i == 179) {
                int i14 = iM43729 - iM41105;
                if (this.f14206 && this.f14202) {
                    long j2 = this.f14200;
                    if (j2 != -9223372036854775807L) {
                        this.f14199.mo10502(j2, this.f14197 ? 1 : 0, ((int) (this.f14194 - this.f14196)) - i14, i14, null);
                    }
                }
                if (!this.f14193 || this.f14206) {
                    this.f14196 = this.f14194 - ((long) i14);
                    long j3 = this.f14207;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.f14200;
                        j3 = j4 != -9223372036854775807L ? j4 + this.f14203 : -9223372036854775807L;
                    }
                    this.f14200 = j3;
                    this.f14197 = false;
                    this.f14207 = -9223372036854775807L;
                    this.f14193 = true;
                }
                this.f14206 = i == 0;
            } else if (i == 184) {
                this.f14197 = true;
            }
            iM43731 = i5;
        }
        if (!this.f14202) {
            c4439.m9274(iM43731, iM43729, bArrM43728);
        }
        if (c7792 != null) {
            c7792.m18033(iM43731, iM43729, bArrM43728);
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
    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
        C23877.m52958(this.f14199);
        if (z) {
            boolean z2 = this.f14197;
            this.f14199.mo10502(this.f14200, z2 ? 1 : 0, (int) (this.f14194 - this.f14196), 0, null);
        }
    }
}
