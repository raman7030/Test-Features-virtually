package p067l;

import android.util.Pair;
import android.util.SparseArray;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.analytics.pro.C0684bo;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: l.۬ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14557 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ܳ֫ */
    public static final C10307 f41518;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final byte[] f41519 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: ֡ */
    public boolean f41520;

    /* JADX INFO: renamed from: ֨ */
    public boolean f41521;

    /* JADX INFO: renamed from: ֫ */
    public C19203 f41522;

    /* JADX INFO: renamed from: ۖ */
    public long f41524;

    /* JADX INFO: renamed from: ۙ */
    public int f41527;

    /* JADX INFO: renamed from: ۚ */
    public boolean f41528;

    /* JADX INFO: renamed from: ۛ */
    public int f41529;

    /* JADX INFO: renamed from: ۜ */
    public final List f41530;

    /* JADX INFO: renamed from: ۟ */
    public final byte[] f41531;

    /* JADX INFO: renamed from: ۢ */
    public C5170 f41534;

    /* JADX INFO: renamed from: ۨ */
    public int f41538;

    /* JADX INFO: renamed from: ۫ */
    public boolean f41539;

    /* JADX INFO: renamed from: ܰ */
    public final C19203 f41541;

    /* JADX INFO: renamed from: ܽ */
    public int f41545;

    /* JADX INFO: renamed from: ܽ֫ */
    public final InterfaceC8974 f41546;

    /* JADX INFO: renamed from: ܿ */
    public int f41547;

    /* JADX INFO: renamed from: ᩳ */
    public long f41549;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C11157 f41550;

    /* JADX INFO: renamed from: ᩵ */
    public final int f41552;

    /* JADX INFO: renamed from: ᩶ */
    public int f41553;

    /* JADX INFO: renamed from: ᩺ */
    public int f41557;

    /* JADX INFO: renamed from: ۘ */
    public final C5857 f41526 = new C5857(1);

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f41536 = new C19203(16);

    /* JADX INFO: renamed from: ᩸ */
    public final C19203 f41555 = new C19203(C18058.f53916);

    /* JADX INFO: renamed from: ܶ */
    public final C19203 f41543 = new C19203(6);

    /* JADX INFO: renamed from: ᩹ */
    public final C19203 f41556 = new C19203();

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayDeque f41554 = new ArrayDeque();

    /* JADX INFO: renamed from: ۗ */
    public final ArrayDeque f41525 = new ArrayDeque();

    /* JADX INFO: renamed from: ܿ֫ */
    public final SparseArray f41548 = new SparseArray();

    /* JADX INFO: renamed from: ۠ */
    public AbstractC16192 f41532 = AbstractC16192.m36872of();

    /* JADX INFO: renamed from: ۡ */
    public long f41533 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۬ */
    public long f41540 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ֫ */
    public long f41537 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩴ */
    public InterfaceC23116 f41551 = InterfaceC23116.f72651;

    /* JADX INFO: renamed from: ܺ */
    public InterfaceC20790[] f41544 = new InterfaceC20790[0];

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC20790[] f41542 = new InterfaceC20790[0];

    /* JADX INFO: renamed from: ۤ */
    public final C24764 f41535 = new C24764(new C11121(this));

    /* JADX INFO: renamed from: ᩻ */
    public final C11717 f41558 = new C11717();

    /* JADX INFO: renamed from: ֫֫ */
    public long f41523 = -1;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    static {
        C3601 c3601 = new C3601();
        c3601.m6697("application/x-emsg");
        f41518 = c3601.m6672();
    }

    public C14557(InterfaceC8974 interfaceC8974, int i, C11157 c11157, List list) {
        this.f41546 = interfaceC8974;
        this.f41552 = i;
        this.f41550 = c11157;
        this.f41530 = C21562.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f41531 = bArr;
        this.f41541 = new C19203(bArr);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        InterfaceC6037 interfaceC6037M42361 = C18619.m42361((C17750) interfaceC10375);
        this.f41532 = interfaceC6037M42361 != null ? AbstractC16192.m36873of((Object) interfaceC6037M42361) : AbstractC16192.m36872of();
        return interfaceC6037M42361 == null;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return this.f41532;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        int i;
        int i2 = this.f41552;
        if ((i2 & 32) == 0) {
            interfaceC23116 = new C10986(interfaceC23116, this.f41546);
        }
        this.f41551 = interfaceC23116;
        m33285();
        InterfaceC20790[] interfaceC20790Arr = new InterfaceC20790[2];
        this.f41544 = interfaceC20790Arr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            interfaceC20790Arr[0] = this.f41551.mo5732(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        InterfaceC20790[] interfaceC20790Arr2 = (InterfaceC20790[]) C5792.m13009(i, this.f41544);
        this.f41544 = interfaceC20790Arr2;
        for (InterfaceC20790 interfaceC20790 : interfaceC20790Arr2) {
            interfaceC20790.mo10503(f41518);
        }
        List list = this.f41530;
        this.f41542 = new InterfaceC20790[list.size()];
        while (i4 < this.f41542.length) {
            InterfaceC20790 interfaceC20790Mo5732 = this.f41551.mo5732(i3, 3);
            interfaceC20790Mo5732.mo10503((C10307) list.get(i4));
            this.f41542[i4] = interfaceC20790Mo5732;
            i4++;
            i3++;
        }
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        SparseArray sparseArray = this.f41548;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C5170) sparseArray.valueAt(i)).m11050();
        }
        this.f41525.clear();
        this.f41527 = 0;
        this.f41535.m54433();
        this.f41540 = j2;
        this.f41554.clear();
        m33285();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x021d  */
    /* JADX WARN: Code duplicated, block: B:121:0x022e  */
    /* JADX WARN: Code duplicated, block: B:488:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x02af A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c8  */
    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        C24764 c24764;
        C19203 c19203;
        ArrayDeque arrayDeque;
        int i;
        C11157 c11157;
        C5170 c5170;
        char c;
        int i2;
        C5170 c5171;
        ArrayDeque arrayDeque2;
        C5170 c5172;
        int i3;
        int i4;
        int iMo10498;
        int i5;
        int iM43739;
        long jM12993;
        long jM25732;
        long jM12994;
        long jM43725;
        String str;
        String str2;
        while (true) {
            int i6 = this.f41553;
            ArrayDeque arrayDeque3 = this.f41554;
            c24764 = this.f41535;
            c19203 = this.f41541;
            C11717 c11717 = this.f41558;
            SparseArray sparseArray = this.f41548;
            if (i6 != 0) {
                arrayDeque = this.f41525;
                i = this.f41552;
                c11157 = this.f41550;
                if (i6 != 1) {
                    long j = C14849.FOREVER_NS;
                    if (i6 != 2) {
                        c5170 = this.f41534;
                        if (c5170 != null) {
                            c = 2;
                            i2 = 0;
                            break;
                        }
                        int size = sparseArray.size();
                        C5170 c5173 = null;
                        for (int i7 = 0; i7 < size; i7++) {
                            C5170 c5174 = (C5170) sparseArray.valueAt(i7);
                            if ((c5174.f12158 || c5174.f12157 != c5174.f12152.f69037) && (!c5174.f12158 || c5174.f12159 != c5174.f12153.f23002)) {
                                long jM11045 = c5174.m11045();
                                if (jM11045 < j) {
                                    c5173 = c5174;
                                    j = jM11045;
                                }
                            }
                        }
                        if (c5173 != null) {
                            int iM11045 = (int) (c5173.m11045() - interfaceC10375.getPosition());
                            if (iM11045 < 0) {
                                C21334.m48351("Ignoring negative offset to sample data.");
                                iM11045 = 0;
                            }
                            interfaceC10375.mo24040(iM11045);
                            this.f41534 = c5173;
                            c5170 = c5173;
                            i2 = 0;
                            c = 2;
                            break;
                        }
                        int position = (int) (this.f41524 - interfaceC10375.getPosition());
                        if (position < 0) {
                            throw C10998.m25387("Offset to end of mdat was negative.", (Throwable) null);
                        }
                        interfaceC10375.mo24040(position);
                        m33285();
                    } else {
                        int size2 = sparseArray.size();
                        C5170 c5175 = null;
                        for (int i8 = 0; i8 < size2; i8++) {
                            C8561 c8561 = ((C5170) sparseArray.valueAt(i8)).f12153;
                            if (c8561.f23004) {
                                long j2 = c8561.f22990;
                                if (j2 < j) {
                                    c5175 = (C5170) sparseArray.valueAt(i8);
                                    j = j2;
                                }
                            }
                        }
                        if (c5175 == null) {
                            this.f41553 = 3;
                        } else {
                            int position2 = (int) (j - interfaceC10375.getPosition());
                            if (position2 < 0) {
                                throw C10998.m25387("Offset to encryption data was negative.", (Throwable) null);
                            }
                            interfaceC10375.mo24040(position2);
                            C8561 c8562 = c5175.f12153;
                            C19203 c19204 = c8562.f22993;
                            interfaceC10375.readFully(c19204.m43728(), 0, c19204.m43729());
                            c19204.m43730(0);
                            c8562.f23004 = false;
                        }
                    }
                } else {
                    int i9 = (int) (this.f41549 - ((long) this.f41545));
                    C19203 c19205 = this.f41522;
                    if (c19205 != null) {
                        interfaceC10375.readFully(c19205.m43728(), 8, i9);
                        int i10 = this.f41547;
                        C9815 c9815 = new C9815(i10, c19205);
                        if (!arrayDeque3.isEmpty()) {
                            ((C3109) arrayDeque3.peek()).f5658.add(c9815);
                        } else if (i10 == 1936286840) {
                            Pair pairM33280 = m33280(interfaceC10375.getPosition(), c19205);
                            c11717.m26917((C22446) pairM33280.second);
                            if (!this.f41520) {
                                this.f41537 = ((Long) pairM33280.first).longValue();
                                this.f41551.mo5733((InterfaceC11402) pairM33280.second);
                                this.f41520 = true;
                            } else if ((i & 256) != 0 && !this.f41528 && c11717.m26918() > 1) {
                                this.f41523 = interfaceC10375.getPosition();
                            }
                        } else if (i10 == 1701671783 && this.f41544.length != 0) {
                            c19205.m43730(8);
                            int iM51818 = C23275.m51818(c19205.m43739());
                            if (iM51818 == 0) {
                                String strM43734 = c19205.m43734();
                                strM43734.getClass();
                                String strM43735 = c19205.m43734();
                                strM43735.getClass();
                                long jM43726 = c19205.m43725();
                                long jM43727 = c19205.m43725();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                jM12993 = C5792.m12993(jM43727, 1000000L, jM43726, roundingMode);
                                long j3 = this.f41537;
                                jM25732 = j3 != -9223372036854775807L ? j3 + jM12993 : -9223372036854775807L;
                                jM12994 = C5792.m12993(c19205.m43725(), 1000L, jM43726, roundingMode);
                                jM43725 = c19205.m43725();
                                str = strM43734;
                                str2 = strM43735;
                            } else if (iM51818 != 1) {
                                C10050.m23419(iM51818, "Skipping unsupported emsg version: ");
                            } else {
                                long jM43728 = c19205.m43725();
                                long jM43712 = c19205.m43712();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long jM12995 = C5792.m12993(jM43712, 1000000L, jM43728, roundingMode2);
                                long jM12996 = C5792.m12993(c19205.m43725(), 1000L, jM43728, roundingMode2);
                                long jM43729 = c19205.m43725();
                                String strM43736 = c19205.m43734();
                                strM43736.getClass();
                                String strM43737 = c19205.m43734();
                                strM43737.getClass();
                                jM12994 = jM12996;
                                jM12993 = -9223372036854775807L;
                                jM43725 = jM43729;
                                str2 = strM43737;
                                jM25732 = jM12995;
                                str = strM43736;
                            }
                            byte[] bArr = new byte[c19205.m43703()];
                            c19205.m43707(0, c19205.m43703(), bArr);
                            C19203 c19206 = new C19203(this.f41526.m13143(new C21440(str, str2, jM12994, jM43725, bArr)));
                            int iM43703 = c19206.m43703();
                            for (InterfaceC20790 interfaceC20790 : this.f41544) {
                                c19206.m43730(0);
                                interfaceC20790.mo10500(iM43703, c19206);
                            }
                            if (jM25732 == -9223372036854775807L) {
                                arrayDeque.addLast(new C6511(jM12993, iM43703, true));
                                this.f41527 += iM43703;
                            } else if (!arrayDeque.isEmpty()) {
                                arrayDeque.addLast(new C6511(jM25732, iM43703, false));
                                this.f41527 += iM43703;
                            } else if (c11157 == null || c11157.m25739()) {
                                if (c11157 != null) {
                                    jM25732 = c11157.m25732(jM25732);
                                }
                                for (InterfaceC20790 interfaceC20791 : this.f41544) {
                                    interfaceC20791.mo10502(jM25732, 1, iM43703, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new C6511(jM25732, iM43703, false));
                                this.f41527 += iM43703;
                            }
                        }
                    } else {
                        interfaceC10375.mo24040(i9);
                    }
                    m33282(interfaceC10375.getPosition());
                }
            } else {
                int i11 = this.f41545;
                C19203 c19207 = this.f41536;
                if (i11 == 0) {
                    if (!interfaceC10375.mo24033(true, 0, 8, c19207.m43728())) {
                        long j4 = this.f41523;
                        if (j4 == -1) {
                            c24764.m54436();
                            return -1;
                        }
                        c24812.f79276 = j4;
                        this.f41523 = -1L;
                        this.f41551.mo5733(c11717.m26916());
                        this.f41528 = true;
                        return 1;
                    }
                    this.f41545 = 8;
                    c19207.m43730(0);
                    this.f41549 = c19207.m43725();
                    this.f41547 = c19207.m43739();
                }
                long j5 = this.f41549;
                if (j5 == 1) {
                    interfaceC10375.readFully(c19207.m43728(), 8, 8);
                    this.f41545 += 8;
                    this.f41549 = c19207.m43712();
                } else if (j5 == 0) {
                    long length = interfaceC10375.getLength();
                    if (length == -1 && !arrayDeque3.isEmpty()) {
                        length = ((C3109) arrayDeque3.peek()).f5657;
                    }
                    if (length != -1) {
                        this.f41549 = (length - interfaceC10375.getPosition()) + ((long) this.f41545);
                    }
                }
                long j6 = this.f41549;
                long j7 = this.f41545;
                if (j6 < j7) {
                    throw C10998.m25388("Atom size less than header length (unsupported).");
                }
                if (this.f41523 != -1) {
                    if (this.f41547 == 1936286840) {
                        c19203.m43727((int) j6);
                        System.arraycopy(c19207.m43728(), 0, c19203.m43728(), 0, 8);
                        interfaceC10375.readFully(c19203.m43728(), 8, (int) (this.f41549 - ((long) this.f41545)));
                        c11717.m26917((C22446) m33280(interfaceC10375.mo24039(), c19203).second);
                    } else {
                        interfaceC10375.mo24032((int) (j6 - j7), true);
                    }
                    m33285();
                } else {
                    long position3 = interfaceC10375.getPosition() - ((long) this.f41545);
                    int i12 = this.f41547;
                    if ((i12 == 1836019558 || i12 == 1835295092) && !this.f41520) {
                        this.f41551.mo5733(new C22131(this.f41533, position3));
                        this.f41520 = true;
                    }
                    if (this.f41547 == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            C8561 c8563 = ((C5170) sparseArray.valueAt(i13)).f12153;
                            c8563.getClass();
                            c8563.f22990 = position3;
                            c8563.f22996 = position3;
                        }
                    }
                    int i14 = this.f41547;
                    if (i14 == 1835295092) {
                        this.f41534 = null;
                        this.f41524 = position3 + this.f41549;
                        this.f41553 = 2;
                    } else if (i14 == 1836019574 || i14 == 1953653099 || i14 == 1835297121 || i14 == 1835626086 || i14 == 1937007212 || i14 == 1836019558 || i14 == 1953653094 || i14 == 1836475768 || i14 == 1701082227 || i14 == 1835365473) {
                        long position4 = interfaceC10375.getPosition();
                        long j8 = this.f41549;
                        long j9 = (position4 + j8) - 8;
                        if (j8 != this.f41545 && this.f41547 == 1835365473) {
                            c19203.m43727(8);
                            interfaceC10375.mo24031(0, 8, c19203.m43728());
                            C23275.m51825(c19203);
                            interfaceC10375.mo24040(c19203.m43731());
                            interfaceC10375.mo24036();
                        }
                        arrayDeque3.push(new C3109(this.f41547, j9));
                        if (this.f41549 == this.f41545) {
                            m33282(j9);
                        } else {
                            m33285();
                        }
                    } else if (i14 == 1751411826 || i14 == 1835296868 || i14 == 1836476516 || i14 == 1936286840 || i14 == 1937011556 || i14 == 1937011827 || i14 == 1668576371 || i14 == 1937011555 || i14 == 1937011578 || i14 == 1937013298 || i14 == 1937007471 || i14 == 1668232756 || i14 == 1937011571 || i14 == 1952867444 || i14 == 1952868452 || i14 == 1953196132 || i14 == 1953654136 || i14 == 1953658222 || i14 == 1886614376 || i14 == 1935763834 || i14 == 1935763823 || i14 == 1936027235 || i14 == 1970628964 || i14 == 1935828848 || i14 == 1936158820 || i14 == 1701606260 || i14 == 1835362404 || i14 == 1701671783 || i14 == 1969517665 || i14 == 1801812339 || i14 == 1768715124) {
                        if (this.f41545 != 8) {
                            throw C10998.m25388("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.f41549 > 2147483647L) {
                            throw C10998.m25388("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        C19203 c19208 = new C19203((int) this.f41549);
                        System.arraycopy(c19207.m43728(), 0, c19208.m43728(), 0, 8);
                        this.f41522 = c19208;
                        this.f41553 = 1;
                    } else {
                        if (this.f41549 > 2147483647L) {
                            throw C10998.m25388("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f41522 = null;
                        this.f41553 = 1;
                    }
                }
            }
        }
        InterfaceC20790 interfaceC20792 = c5170.f12156;
        if (this.f41553 == 3) {
            this.f41557 = c5170.m11049();
            C10307 c10307 = c5170.f12152.f69033.f46112;
            this.f41521 = !(!C12826.equals(c10307.f28528, "video/avc") ? !C12826.equals(c10307.f28528, "video/hevc") || (i & 128) == 0 : (i & 64) == 0);
            if (c5170.f12157 < c5170.f12160) {
                interfaceC10375.mo24040(this.f41557);
                C8561 c8564 = c5170.f12153;
                C24654 c24654M11048 = c5170.m11048();
                if (c24654M11048 != null) {
                    C19203 c19209 = c8564.f22993;
                    int i15 = c24654M11048.f78020;
                    if (i15 != 0) {
                        c19209.m43724(i15);
                    }
                    int i16 = c5170.f12157;
                    if (c8564.f22999 && c8564.f22995[i16]) {
                        c19209.m43724(c19209.m43710() * 6);
                    }
                }
                if (!c5170.m11046()) {
                    this.f41534 = null;
                }
                this.f41553 = 3;
                return i2;
            }
            if (c5170.f12152.f69033.f46105 == 1) {
                this.f41557 -= 8;
                interfaceC10375.mo24040(8);
            }
            if ("audio/ac4".equals(c5170.f12152.f69033.f46112.f28528)) {
                this.f41529 = c5170.m11042(this.f41557, 7);
                C15344.m34922(this.f41557, c19203);
                interfaceC20792.mo10500(7, c19203);
                this.f41529 += 7;
            } else {
                this.f41529 = c5170.m11042(this.f41557, 0);
            }
            this.f41557 += this.f41529;
            this.f41553 = 4;
            this.f41538 = 0;
        }
        C15936 c15936 = c5170.f12152.f69033;
        long jM11047 = c5170.m11047();
        if (c11157 != null) {
            jM11047 = c11157.m25732(jM11047);
        }
        int i17 = c15936.f46113;
        C10307 c10308 = c15936.f46112;
        if (i17 == 0) {
            c5171 = c5170;
            arrayDeque2 = arrayDeque;
            while (true) {
                int i18 = this.f41529;
                int i19 = this.f41557;
                if (i18 >= i19) {
                    break;
                }
                this.f41529 += interfaceC20792.mo10498((InterfaceC11649) interfaceC10375, i19 - i18, false);
            }
        } else {
            C19203 c192010 = this.f41543;
            byte[] bArrM43728 = c192010.m43728();
            bArrM43728[0] = 0;
            bArrM43728[1] = 0;
            bArrM43728[c] = 0;
            int i20 = 4 - i17;
            while (true) {
                arrayDeque2 = arrayDeque;
                if (this.f41529 >= this.f41557) {
                    c5171 = c5170;
                    break;
                }
                int i21 = this.f41538;
                if (i21 == 0) {
                    if (this.f41542.length > 0 || !this.f41521) {
                        int iM41107 = C18058.m41107(c10308);
                        c5172 = c5170;
                        i5 = i17 + iM41107 <= this.f41557 - this.f41529 ? iM41107 : 0;
                        interfaceC10375.readFully(bArrM43728, i20, i17 + i5);
                        c192010.m43730(0);
                        iM43739 = c192010.m43739();
                        if (iM43739 >= 0) {
                            throw C10998.m25387("Invalid NAL length", (Throwable) null);
                        }
                        this.f41538 = iM43739 - i5;
                        C19203 c192011 = this.f41555;
                        c192011.m43730(0);
                        interfaceC20792.mo10500(4, c192011);
                        this.f41529 += 4;
                        this.f41557 += i20;
                        if (this.f41542.length > 0 || i5 <= 0) {
                            i3 = i17;
                            i4 = i20;
                        } else {
                            byte b = bArrM43728[4];
                            String str3 = c10308.f28528;
                            i3 = i17;
                            String str4 = c10308.f28533;
                            if (C12826.equals(str3, "video/avc") || C11669.m26818(str4, "video/avc") != null) {
                                i4 = i20;
                                if ((b & C0684bo.f2505j) != 6) {
                                }
                                this.f41539 = z;
                                interfaceC20792.mo10500(i5, c192010);
                                this.f41529 += i5;
                                if (i5 <= 0 && !this.f41521 && C18058.m41114(bArrM43728, i5, c10308)) {
                                    this.f41521 = true;
                                }
                            } else {
                                i4 = i20;
                            }
                            boolean z = (C12826.equals(c10308.f28528, "video/hevc") || C11669.m26818(str4, "video/hevc") != null) && ((b & 126) >> 1) == 39;
                            this.f41539 = z;
                            interfaceC20792.mo10500(i5, c192010);
                            this.f41529 += i5;
                            if (i5 <= 0) {
                            }
                        }
                        this.f41539 = z;
                        interfaceC20792.mo10500(i5, c192010);
                        this.f41529 += i5;
                        if (i5 <= 0) {
                        }
                    } else {
                        c5172 = c5170;
                    }
                    interfaceC10375.readFully(bArrM43728, i20, i17 + i5);
                    c192010.m43730(0);
                    iM43739 = c192010.m43739();
                    if (iM43739 >= 0) {
                        throw C10998.m25387("Invalid NAL length", (Throwable) null);
                    }
                    this.f41538 = iM43739 - i5;
                    C19203 c192012 = this.f41555;
                    c192012.m43730(0);
                    interfaceC20792.mo10500(4, c192012);
                    this.f41529 += 4;
                    this.f41557 += i20;
                    if (this.f41542.length > 0) {
                        i3 = i17;
                        i4 = i20;
                    } else {
                        i3 = i17;
                        i4 = i20;
                    }
                    this.f41539 = z;
                    interfaceC20792.mo10500(i5, c192010);
                    this.f41529 += i5;
                    if (i5 <= 0) {
                    }
                } else {
                    c5172 = c5170;
                    i3 = i17;
                    i4 = i20;
                    if (this.f41539) {
                        C19203 c192013 = this.f41556;
                        c192013.m43727(i21);
                        interfaceC10375.readFully(c192013.m43728(), 0, this.f41538);
                        interfaceC20792.mo10500(this.f41538, c192013);
                        iMo10498 = this.f41538;
                        int iM41106 = C18058.m41106(c192013.m43729(), c192013.m43728());
                        c192013.m43730(0);
                        c192013.m43732(iM41106);
                        if (c10308.f28531 != -1) {
                            int iM54437 = c24764.m54437();
                            int i22 = c10308.f28531;
                            if (iM54437 != i22) {
                                c24764.m54434(i22);
                            }
                        } else if (c24764.m54437() != 0) {
                            c24764.m54434(0);
                        }
                        c24764.m54435(jM11047, c192013);
                        if ((c5172.m11041() & 4) != 0) {
                            c24764.m54436();
                        }
                    } else {
                        iMo10498 = interfaceC20792.mo10498((InterfaceC11649) interfaceC10375, i21, false);
                    }
                    this.f41529 += iMo10498;
                    this.f41538 -= iMo10498;
                }
                i20 = i4;
                arrayDeque = arrayDeque2;
                c5170 = c5172;
                i17 = i3;
            }
        }
        int iM11041 = c5171.m11041();
        if (!this.f41521) {
            iM11041 |= 67108864;
        }
        int i23 = iM11041;
        C24654 c24654M11049 = c5171.m11048();
        interfaceC20792.mo10502(jM11047, i23, this.f41557, 0, c24654M11049 != null ? c24654M11049.f78016 : null);
        while (!arrayDeque2.isEmpty()) {
            C6511 c6511 = (C6511) arrayDeque2.removeFirst();
            this.f41527 -= c6511.f16836;
            long jM25733 = c6511.f16835;
            if (c6511.f16834) {
                jM25733 += jM11047;
            }
            C11157 c11158 = c11157;
            if (c11157 != null) {
                jM25733 = c11158.m25732(jM25733);
            }
            for (InterfaceC20790 interfaceC20793 : this.f41544) {
                interfaceC20793.mo10502(jM25733, 1, c6511.f16836, this.f41527, null);
            }
            c11157 = c11158;
        }
        if (!c5171.m11046()) {
            this.f41534 = null;
        }
        this.f41553 = 3;
        return 0;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m33285() {
        this.f41553 = 0;
        this.f41545 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x041c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0431 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x0433  */
    /* JADX WARN: Code duplicated, block: B:176:0x0440  */
    /* JADX WARN: Code duplicated, block: B:179:0x044e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0450  */
    /* JADX WARN: Code duplicated, block: B:181:0x0459  */
    /* JADX WARN: Code duplicated, block: B:183:0x045f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0461  */
    /* JADX WARN: Code duplicated, block: B:185:0x0466  */
    /* JADX WARN: Code duplicated, block: B:188:0x046d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0471  */
    /* JADX WARN: Code duplicated, block: B:191:0x047a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0498  */
    /* JADX WARN: Code duplicated, block: B:195:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:350:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x04d7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    private void m33282(long j) throws C10998 {
        C25079 c25079M51824;
        long j2;
        C21264 c21264;
        C21264 c21265;
        ArrayList arrayList;
        C14557 c14557;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i2;
        SparseArray sparseArray;
        C14557 c14558;
        int i3;
        byte[] bArr;
        int i4;
        int i5;
        C5170 c5170;
        C5170 c5171;
        C21264 c21266;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z;
        int i6;
        long j3;
        long j4;
        int i7;
        C21264 c21267;
        int iM43739;
        boolean z2;
        int iM437310;
        int iM437311;
        int iM437312;
        long jM12993;
        C5170 c5172;
        boolean z3;
        char c;
        C14557 c14559 = this;
        while (true) {
            ArrayDeque arrayDeque = c14559.f41554;
            if (arrayDeque.isEmpty() || ((C3109) arrayDeque.peek()).f5657 != j) {
                break;
            }
            C3109 c3109 = (C3109) arrayDeque.pop();
            int i8 = c3109.f48556;
            ArrayList arrayList4 = c3109.f5656;
            ArrayList arrayList5 = c3109.f5658;
            int i9 = c14559.f41552;
            int i10 = 12;
            SparseArray sparseArray2 = c14559.f41548;
            if (i8 == 1836019574) {
                C21037 c21037M33281 = m33281(arrayList5);
                C3109 c3109M5303 = c3109.m5303(1836475768);
                c3109M5303.getClass();
                SparseArray sparseArray3 = new SparseArray();
                ArrayList arrayList6 = c3109M5303.f5658;
                int size = arrayList6.size();
                int i11 = 0;
                long jM43725 = -9223372036854775807L;
                while (i11 < size) {
                    C9815 c9815 = (C9815) arrayList6.get(i11);
                    int i12 = c9815.f48556;
                    C19203 c19203 = c9815.f27154;
                    if (i12 == 1953654136) {
                        c19203.m43730(i10);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(c19203.m43739()), new C21264(c19203.m43739() - 1, c19203.m43739(), c19203.m43739(), c19203.m43739()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (C21264) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i12 == 1835362404) {
                            c19203.m43730(8);
                            jM43725 = C23275.m51818(c19203.m43739()) == 0 ? c19203.m43725() : c19203.m43712();
                        }
                    }
                    i11++;
                    i10 = 12;
                    arrayList6 = arrayList;
                }
                char c2 = 0;
                C3109 c3109M5304 = c3109.m5303(1835365473);
                C25079 c25079M51823 = c3109M5304 != null ? C23275.m51823(c3109M5304) : null;
                C9704 c9704 = new C9704();
                C9815 c9815M5304 = c3109.m5304(1969517665);
                if (c9815M5304 != null) {
                    c25079M51824 = C23275.m51824(c9815M5304);
                    c9704.m22651(c25079M51824);
                } else {
                    c25079M51824 = null;
                }
                C25079 c25079 = c25079M51824;
                C9815 c9815M5305 = c3109.m5304(1836476516);
                c9815M5305.getClass();
                C25079 c250710 = new C25079(C23275.m51828(c9815M5305.f27154));
                ArrayList arrayListM51820 = C23275.m51820(c3109, c9704, jM43725, c21037M33281, (i9 & 16) != 0, false, new C21288(c14559));
                int size2 = arrayListM51820.size();
                if (sparseArray2.size() == 0) {
                    String strM18146 = C7852.m18146(arrayListM51820);
                    int i13 = 0;
                    while (i13 < size2) {
                        C21973 c21973 = (C21973) arrayListM51820.get(i13);
                        C15936 c15936 = c21973.f69033;
                        InterfaceC23116 interfaceC23116 = c14559.f41551;
                        int i14 = c15936.f46103;
                        ArrayList arrayList7 = arrayListM51820;
                        int i15 = c15936.f46108;
                        int i16 = size2;
                        C10307 c10307 = c15936.f46112;
                        long j5 = c15936.f46102;
                        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(i13, i14);
                        interfaceC20790Mo5732.mo10501(j5);
                        int i17 = i13;
                        C3601 c3601M23918 = c10307.m23918();
                        c3601M23918.m6694(strM18146);
                        String str = strM18146;
                        if (i14 == 1) {
                            int i18 = c9704.f26765;
                            j2 = j5;
                            if (i18 != -1 && c9704.f26766 != -1) {
                                c3601M23918.m6709(i18);
                                c3601M23918.m6690(c9704.f26766);
                            }
                        } else {
                            j2 = j5;
                        }
                        C25079 c250711 = c10307.f28526;
                        C25079[] c25079Arr = new C25079[2];
                        c25079Arr[c2] = c25079;
                        c25079Arr[1] = c250710;
                        C11876.m27186(i14, c25079M51823, c3601M23918, c250711, c25079Arr);
                        if (sparseArray3.size() == 1) {
                            c21264 = (C21264) sparseArray3.valueAt(0);
                        } else {
                            c21264 = (C21264) sparseArray3.get(i15);
                            c21264.getClass();
                        }
                        sparseArray2.put(i15, new C5170(interfaceC20790Mo5732, c21973, c21264, c3601M23918.m6672()));
                        c14559.f41533 = Math.max(c14559.f41533, j2);
                        i13 = i17 + 1;
                        c2 = 0;
                        arrayListM51820 = arrayList7;
                        size2 = i16;
                        strM18146 = str;
                    }
                    c14559.f41551.mo5734();
                } else {
                    ArrayList arrayList8 = arrayListM51820;
                    C23877.m52960(sparseArray2.size() == size2);
                    int i19 = 0;
                    while (i19 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        C21973 c21974 = (C21973) arrayList9.get(i19);
                        C15936 c15937 = c21974.f69033;
                        C5170 c5173 = (C5170) sparseArray2.get(c15937.f46108);
                        int i20 = c15937.f46108;
                        if (sparseArray3.size() == 1) {
                            c21265 = (C21264) sparseArray3.valueAt(0);
                        } else {
                            c21265 = (C21264) sparseArray3.get(i20);
                            c21265.getClass();
                        }
                        c5173.m11044(c21974, c21265);
                        i19++;
                        arrayList8 = arrayList9;
                    }
                }
            } else {
                if (i8 == 1836019558) {
                    int size3 = arrayList4.size();
                    int i21 = 0;
                    while (i21 < size3) {
                        C3109 c31010 = (C3109) arrayList4.get(i21);
                        if (c31010.f48556 == 1953653094) {
                            C9815 c9815M5306 = c31010.m5304(1952868452);
                            ArrayList arrayList10 = c31010.f5658;
                            c9815M5306.getClass();
                            C19203 c19204 = c9815M5306.f27154;
                            c19204.m43730(8);
                            int iM437313 = c19204.m43739();
                            int i22 = C23275.f73137;
                            C5170 c5174 = (C5170) sparseArray2.get(c19204.m43739());
                            if (c5174 == null) {
                                c5174 = null;
                                size3 = size3;
                            } else {
                                C8561 c8561 = c5174.f12153;
                                if ((iM437313 & 1) != 0) {
                                    long jM43712 = c19204.m43712();
                                    c8561.f22996 = jM43712;
                                    c8561.f22990 = jM43712;
                                }
                                C21264 c21268 = c5174.f12161;
                                c8561.f23001 = new C21264((iM437313 & 2) != 0 ? c19204.m43739() - 1 : c21268.f66813, (iM437313 & 8) != 0 ? c19204.m43739() : c21268.f66811, (iM437313 & 16) != 0 ? c19204.m43739() : c21268.f66814, (iM437313 & 32) != 0 ? c19204.m43739() : c21268.f66812);
                            }
                            if (c5174 != null) {
                                C8561 c8562 = c5174.f12153;
                                long j6 = c8562.f23000;
                                boolean z4 = c8562.f22997;
                                c5174.m11050();
                                c5174.f12158 = true;
                                C9815 c9815M5307 = c31010.m5304(1952867444);
                                if (c9815M5307 == null || (i9 & 2) != 0) {
                                    c8562.f23000 = j6;
                                    c8562.f22997 = z4;
                                } else {
                                    C19203 c19205 = c9815M5307.f27154;
                                    c19205.m43730(8);
                                    c8562.f23000 = C23275.m51818(c19205.m43739()) == 1 ? c19205.m43712() : c19205.m43725();
                                    c8562.f22997 = true;
                                }
                                int size4 = arrayList10.size();
                                int i23 = 0;
                                int i24 = 0;
                                int i25 = 0;
                                while (true) {
                                    i3 = 1953658222;
                                    if (i23 >= size4) {
                                        break;
                                    }
                                    C9815 c9816 = (C9815) arrayList10.get(i23);
                                    ArrayList arrayList11 = arrayList4;
                                    if (c9816.f48556 == 1953658222) {
                                        C19203 c19206 = c9816.f27154;
                                        c19206.m43730(12);
                                        int iM43738 = c19206.m43738();
                                        if (iM43738 > 0) {
                                            i25 += iM43738;
                                            i24++;
                                        }
                                    }
                                    i23++;
                                    arrayList4 = arrayList11;
                                }
                                arrayList2 = arrayList4;
                                c5174.f12159 = 0;
                                c5174.f12154 = 0;
                                c5174.f12157 = 0;
                                c8562.f23002 = i24;
                                c8562.f23005 = i25;
                                if (c8562.f22989.length < i24) {
                                    c8562.f23003 = new long[i24];
                                    c8562.f22989 = new int[i24];
                                }
                                if (c8562.f22991.length < i25) {
                                    int i26 = (i25 * C0254q.f1218h) / 100;
                                    c8562.f22991 = new int[i26];
                                    c8562.f22998 = new long[i26];
                                    c8562.f22994 = new boolean[i26];
                                    c8562.f22995 = new boolean[i26];
                                }
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (true) {
                                    long j7 = 0;
                                    if (i27 >= size4) {
                                        i = i21;
                                        C3109 c31011 = c31010;
                                        arrayList3 = arrayList5;
                                        i2 = i9;
                                        ArrayList arrayList12 = arrayList10;
                                        sparseArray = sparseArray2;
                                        C15936 c15938 = c5174.f12152.f69033;
                                        C21264 c21269 = c8562.f23001;
                                        c21269.getClass();
                                        C24654 c24654M36169 = c15938.m36169(c21269.f66813);
                                        C9815 c9815M5308 = c31011.m5304(1935763834);
                                        if (c9815M5308 != null) {
                                            c24654M36169.getClass();
                                            C19203 c19207 = c9815M5308.f27154;
                                            int i30 = c24654M36169.f78020;
                                            c19207.m43730(8);
                                            int iM437314 = c19207.m43739();
                                            int i31 = C23275.f73137;
                                            if ((iM437314 & 1) == 1) {
                                                c19207.m43724(8);
                                            }
                                            int iM43702 = c19207.m43702();
                                            int iM437315 = c19207.m43738();
                                            if (iM437315 > c8562.f23005) {
                                                StringBuilder sbM34408 = C15033.m34408(iM437315, "Saiz sample count ", " is greater than fragment sample count");
                                                sbM34408.append(c8562.f23005);
                                                throw C10998.m25387(sbM34408.toString(), (Throwable) null);
                                            }
                                            if (iM43702 == 0) {
                                                boolean[] zArr2 = c8562.f22995;
                                                i4 = 0;
                                                for (int i32 = 0; i32 < iM437315; i32++) {
                                                    int iM43703 = c19207.m43702();
                                                    i4 += iM43703;
                                                    zArr2[i32] = iM43703 > i30;
                                                }
                                            } else {
                                                i4 = iM43702 * iM437315;
                                                Arrays.fill(c8562.f22995, 0, iM437315, iM43702 > i30);
                                            }
                                            Arrays.fill(c8562.f22995, iM437315, c8562.f23005, false);
                                            if (i4 > 0) {
                                                c8562.f22993.m43727(i4);
                                                c8562.f22999 = true;
                                                c8562.f23004 = true;
                                            }
                                        }
                                        C9815 c9815M5309 = c31011.m5304(1935763823);
                                        if (c9815M5309 != null) {
                                            C19203 c19208 = c9815M5309.f27154;
                                            c19208.m43730(8);
                                            int iM437316 = c19208.m43739();
                                            int i33 = C23275.f73137;
                                            if ((iM437316 & 1) == 1) {
                                                c19208.m43724(8);
                                            }
                                            int iM437317 = c19208.m43738();
                                            if (iM437317 != 1) {
                                                throw C10998.m25387("Unexpected saio entry count: " + iM437317, (Throwable) null);
                                            }
                                            c8562.f22990 += C23275.m51818(iM437316) == 0 ? c19208.m43725() : c19208.m43712();
                                        }
                                        C9815 c9815M53010 = c31011.m5304(1936027235);
                                        if (c9815M53010 != null) {
                                            m33284(c9815M53010.f27154, 0, c8562);
                                        }
                                        String str2 = c24654M36169 != null ? c24654M36169.f78019 : null;
                                        int i34 = 0;
                                        C19203 c19209 = null;
                                        C19203 c192010 = null;
                                        while (i34 < arrayList12.size()) {
                                            ArrayList arrayList13 = arrayList12;
                                            C9815 c9817 = (C9815) arrayList13.get(i34);
                                            C19203 c192011 = c9817.f27154;
                                            int i35 = c9817.f48556;
                                            if (i35 == 1935828848) {
                                                c192011.m43730(12);
                                                if (c192011.m43739() == 1936025959) {
                                                    c19209 = c192011;
                                                }
                                            } else if (i35 == 1936158820) {
                                                c192011.m43730(12);
                                                if (c192011.m43739() == 1936025959) {
                                                    c192010 = c192011;
                                                }
                                            }
                                            i34++;
                                            arrayList12 = arrayList13;
                                        }
                                        ArrayList arrayList14 = arrayList12;
                                        if (c19209 != null && c192010 != null) {
                                            c19209.m43730(8);
                                            int iM51818 = C23275.m51818(c19209.m43739());
                                            c19209.m43724(4);
                                            if (iM51818 == 1) {
                                                c19209.m43724(4);
                                            }
                                            if (c19209.m43739() != 1) {
                                                throw C10998.m25388("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            c192010.m43730(8);
                                            int iM51819 = C23275.m51818(c192010.m43739());
                                            c192010.m43724(4);
                                            if (iM51819 == 1) {
                                                if (c192010.m43725() == 0) {
                                                    throw C10998.m25388("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iM51819 >= 2) {
                                                c192010.m43724(4);
                                            }
                                            if (c192010.m43725() != 1) {
                                                throw C10998.m25388("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            c192010.m43724(1);
                                            int iM43704 = c192010.m43702();
                                            int i36 = (iM43704 & 240) >> 4;
                                            int i37 = iM43704 & 15;
                                            boolean z5 = c192010.m43702() == 1;
                                            if (z5) {
                                                int iM43705 = c192010.m43702();
                                                byte[] bArr2 = new byte[16];
                                                c192010.m43707(0, 16, bArr2);
                                                if (iM43705 == 0) {
                                                    int iM43706 = c192010.m43702();
                                                    byte[] bArr3 = new byte[iM43706];
                                                    c192010.m43707(0, iM43706, bArr3);
                                                    bArr = bArr3;
                                                } else {
                                                    bArr = null;
                                                }
                                                c8562.f22999 = true;
                                                c8562.f22992 = new C24654(z5, str2, iM43705, bArr2, i36, i37, bArr);
                                            }
                                        }
                                        int size5 = arrayList14.size();
                                        for (int i38 = 0; i38 < size5; i38++) {
                                            C9815 c9818 = (C9815) arrayList14.get(i38);
                                            if (c9818.f48556 == 1970628964) {
                                                C19203 c192012 = c9818.f27154;
                                                c192012.m43730(8);
                                                byte[] bArr4 = this.f41531;
                                                c192012.m43707(0, 16, bArr4);
                                                if (Arrays.equals(bArr4, f41519)) {
                                                    m33284(c192012, 16, c8562);
                                                }
                                            }
                                        }
                                        c14558 = this;
                                        break;
                                    }
                                    C9815 c9819 = (C9815) arrayList10.get(i27);
                                    if (c9819.f48556 == i3) {
                                        int i39 = i28 + 1;
                                        C19203 c192013 = c9819.f27154;
                                        c192013.m43730(8);
                                        int iM437318 = c192013.m43739();
                                        int i40 = C23275.f73137;
                                        C15936 c15939 = c5174.f12152.f69033;
                                        C21264 c212610 = c8562.f23001;
                                        String str3 = C5792.f14228;
                                        c8562.f22989[i28] = c192013.m43738();
                                        long[] jArr2 = c8562.f23003;
                                        long j8 = c8562.f22996;
                                        jArr2[i28] = j8;
                                        if ((iM437318 & 1) != 0) {
                                            jArr2[i28] = j8 + ((long) c192013.m43739());
                                        }
                                        boolean z6 = (iM437318 & 4) != 0;
                                        int iM437319 = c212610.f66812;
                                        if (z6) {
                                            iM437319 = c192013.m43739();
                                        }
                                        boolean z7 = (iM437318 & 256) != 0;
                                        boolean z8 = (iM437318 & 512) != 0;
                                        boolean z9 = (iM437318 & 1024) != 0;
                                        boolean z10 = (iM437318 & 2048) != 0;
                                        int i41 = iM437319;
                                        long[] jArr3 = c15939.f46107;
                                        long[] jArr4 = c15939.f46110;
                                        if (jArr3 != null) {
                                            c5171 = c5174;
                                            if (jArr3.length == 1 && jArr4 != null) {
                                                long j9 = jArr3[0];
                                                if (j9 == 0) {
                                                    i28 = i28;
                                                    c21266 = c212610;
                                                } else {
                                                    i28 = i28;
                                                    long j10 = c15939.f46104;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    long jM12994 = C5792.m12993(j9, 1000000L, j10, roundingMode);
                                                    c21266 = c212610;
                                                    c = jM12994 + C5792.m12993(jArr4[0], 1000000L, c15939.f46109, roundingMode) >= c15939.f46102 ? (char) 0 : (char) 0;
                                                }
                                                j7 = jArr4[c];
                                            }
                                            iArr = c8562.f22991;
                                            jArr = c8562.f22998;
                                            zArr = c8562.f22994;
                                            if (c15939.f46103 == 2 || (i9 & 1) == 0) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            i6 = c8562.f22989[i28] + i29;
                                            j3 = c15939.f46109;
                                            j4 = c8562.f23000;
                                            i5 = i9;
                                            i7 = i29;
                                            while (i7 < i6) {
                                                if (z7) {
                                                    c21267 = c21266;
                                                    iM43739 = c192013.m43739();
                                                } else {
                                                    c21267 = c21266;
                                                    iM43739 = c21267.f66811;
                                                }
                                                z2 = z;
                                                if (iM43739 >= 0) {
                                                    throw C10998.m25387("Unexpected negative value: " + iM43739, (Throwable) null);
                                                }
                                                if (z8) {
                                                    iM437310 = c192013.m43739();
                                                } else {
                                                    iM437310 = c21267.f66814;
                                                }
                                                if (iM437310 >= 0) {
                                                    throw C10998.m25387("Unexpected negative value: " + iM437310, (Throwable) null);
                                                }
                                                if (z9) {
                                                    iM437311 = c192013.m43739();
                                                } else if (i7 == 0 || !z6) {
                                                    iM437311 = c21267.f66812;
                                                } else {
                                                    iM437311 = i41;
                                                }
                                                if (z10) {
                                                    iM437312 = c192013.m43739();
                                                } else {
                                                    iM437312 = 0;
                                                }
                                                C21264 c212611 = c21267;
                                                jM12993 = C5792.m12993((((long) iM437312) + j4) - j7, 1000000L, j3, RoundingMode.DOWN);
                                                jArr[i7] = jM12993;
                                                long j11 = j3;
                                                if (c8562.f22997) {
                                                    c5172 = c5171;
                                                } else {
                                                    c5172 = c5171;
                                                    jArr[i7] = jM12993 + c5172.f12152.f69032;
                                                }
                                                iArr[i7] = iM437310;
                                                if (((iM437311 >> 16) & 1) == 0 || (z2 && i7 != 0)) {
                                                    z3 = false;
                                                } else {
                                                    z3 = true;
                                                }
                                                zArr[i7] = z3;
                                                j4 += (long) iM43739;
                                                i7++;
                                                c192013 = c192013;
                                                z7 = z7;
                                                z9 = z9;
                                                i6 = i6;
                                                z = z2;
                                                z8 = z8;
                                                z6 = z6;
                                                c21266 = c212611;
                                                c5171 = c5172;
                                                j3 = j11;
                                            }
                                            c5170 = c5171;
                                            c8562.f23000 = j4;
                                            i28 = i39;
                                            i29 = i6;
                                        } else {
                                            c5171 = c5174;
                                        }
                                        c21266 = c212610;
                                        iArr = c8562.f22991;
                                        jArr = c8562.f22998;
                                        zArr = c8562.f22994;
                                        if (c15939.f46103 == 2) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        i6 = c8562.f22989[i28] + i29;
                                        j3 = c15939.f46109;
                                        j4 = c8562.f23000;
                                        i5 = i9;
                                        i7 = i29;
                                        while (i7 < i6) {
                                            if (z7) {
                                                c21267 = c21266;
                                                iM43739 = c192013.m43739();
                                            } else {
                                                c21267 = c21266;
                                                iM43739 = c21267.f66811;
                                            }
                                            z2 = z;
                                            if (iM43739 >= 0) {
                                                throw C10998.m25387("Unexpected negative value: " + iM43739, (Throwable) null);
                                            }
                                            if (z8) {
                                                iM437310 = c192013.m43739();
                                            } else {
                                                iM437310 = c21267.f66814;
                                            }
                                            if (iM437310 >= 0) {
                                                throw C10998.m25387("Unexpected negative value: " + iM437310, (Throwable) null);
                                            }
                                            if (z9) {
                                                iM437311 = c192013.m43739();
                                            } else if (i7 == 0) {
                                                iM437311 = c21267.f66812;
                                            } else {
                                                iM437311 = c21267.f66812;
                                            }
                                            if (z10) {
                                                iM437312 = c192013.m43739();
                                            } else {
                                                iM437312 = 0;
                                            }
                                            C21264 c212612 = c21267;
                                            jM12993 = C5792.m12993((((long) iM437312) + j4) - j7, 1000000L, j3, RoundingMode.DOWN);
                                            jArr[i7] = jM12993;
                                            long j12 = j3;
                                            if (c8562.f22997) {
                                                c5172 = c5171;
                                                jArr[i7] = jM12993 + c5172.f12152.f69032;
                                            } else {
                                                c5172 = c5171;
                                            }
                                            iArr[i7] = iM437310;
                                            if (((iM437311 >> 16) & 1) == 0) {
                                                z3 = false;
                                            } else {
                                                z3 = false;
                                            }
                                            zArr[i7] = z3;
                                            j4 += (long) iM43739;
                                            i7++;
                                            c192013 = c192013;
                                            z7 = z7;
                                            z9 = z9;
                                            i6 = i6;
                                            z = z2;
                                            z8 = z8;
                                            z6 = z6;
                                            c21266 = c212612;
                                            c5171 = c5172;
                                            j3 = j12;
                                        }
                                        c5170 = c5171;
                                        c8562.f23000 = j4;
                                        i28 = i39;
                                        i29 = i6;
                                    } else {
                                        i27 = i27;
                                        arrayList5 = arrayList5;
                                        i5 = i9;
                                        c5170 = c5174;
                                    }
                                    i27++;
                                    i3 = 1953658222;
                                    c5174 = c5170;
                                    size4 = size4;
                                    i21 = i21;
                                    sparseArray2 = sparseArray2;
                                    c31010 = c31010;
                                    arrayList5 = arrayList5;
                                    arrayList10 = arrayList10;
                                    i9 = i5;
                                }
                            }
                            i21 = i + 1;
                            c14559 = c14558;
                            size3 = size3;
                            arrayList4 = arrayList2;
                            sparseArray2 = sparseArray;
                            arrayList5 = arrayList3;
                            i9 = i2;
                        } else {
                            size3 = size3;
                        }
                        i = i21;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i2 = i9;
                        sparseArray = sparseArray2;
                        c14558 = c14559;
                        i21 = i + 1;
                        c14559 = c14558;
                        size3 = size3;
                        arrayList4 = arrayList2;
                        sparseArray2 = sparseArray;
                        arrayList5 = arrayList3;
                        i9 = i2;
                    }
                    c14557 = c14559;
                    SparseArray sparseArray4 = sparseArray2;
                    C21037 c21037M33282 = m33281(arrayList5);
                    if (c21037M33282 != null) {
                        int size6 = sparseArray4.size();
                        for (int i42 = 0; i42 < size6; i42++) {
                            ((C5170) sparseArray4.valueAt(i42)).m11043(c21037M33282);
                        }
                    }
                    if (c14557.f41540 != -9223372036854775807L) {
                        int size7 = sparseArray4.size();
                        for (int i43 = 0; i43 < size7; i43++) {
                            C5170 c5175 = (C5170) sparseArray4.valueAt(i43);
                            long j13 = c14557.f41540;
                            int i44 = c5175.f12157;
                            while (true) {
                                C8561 c8563 = c5175.f12153;
                                if (i44 >= c8563.f23005 || c8563.f22998[i44] > j13) {
                                    break;
                                }
                                if (c8563.f22994[i44]) {
                                    c5175.f12160 = i44;
                                }
                                i44++;
                            }
                        }
                        c14557.f41540 = -9223372036854775807L;
                    }
                } else {
                    c14557 = c14559;
                    if (!arrayDeque.isEmpty()) {
                        ((C3109) arrayDeque.peek()).f5656.add(c3109);
                    }
                }
                c14559 = c14557;
            }
        }
        m33285();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33284(C19203 c19203, int i, C8561 c8561) throws C10998 {
        c19203.m43730(i + 8);
        int iM43739 = c19203.m43739();
        int i2 = C23275.f73137;
        if ((iM43739 & 1) != 0) {
            throw C10998.m25388("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM43739 & 2) != 0;
        int iM43738 = c19203.m43738();
        if (iM43738 == 0) {
            Arrays.fill(c8561.f22995, 0, c8561.f23005, false);
            return;
        }
        int i3 = c8561.f23005;
        C19203 c19204 = c8561.f22993;
        if (iM43738 != i3) {
            StringBuilder sbM34408 = C15033.m34408(iM43738, "Senc sample count ", " is different from fragment sample count");
            sbM34408.append(c8561.f23005);
            throw C10998.m25387(sbM34408.toString(), (Throwable) null);
        }
        Arrays.fill(c8561.f22995, 0, iM43738, z);
        c19204.m43727(c19203.m43703());
        c8561.f22999 = true;
        c8561.f23004 = true;
        c19203.m43707(0, c19204.m43729(), c19204.m43728());
        c19204.m43730(0);
        c8561.f23004 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Pair m33280(long j, C19203 c19203) throws C10998 {
        long jM43712;
        long jM43713;
        c19203.m43730(8);
        int iM51818 = C23275.m51818(c19203.m43739());
        c19203.m43724(4);
        long jM43725 = c19203.m43725();
        if (iM51818 == 0) {
            jM43712 = c19203.m43725();
            jM43713 = c19203.m43725();
        } else {
            jM43712 = c19203.m43712();
            jM43713 = c19203.m43712();
        }
        long j2 = jM43713 + j;
        String str = C5792.f14228;
        long jM12993 = C5792.m12993(jM43712, 1000000L, jM43725, RoundingMode.DOWN);
        c19203.m43724(2);
        int iM43710 = c19203.m43710();
        int[] iArr = new int[iM43710];
        long[] jArr = new long[iM43710];
        long[] jArr2 = new long[iM43710];
        long[] jArr3 = new long[iM43710];
        long j3 = j2;
        long jM12994 = jM12993;
        int i = 0;
        while (i < iM43710) {
            int iM43739 = c19203.m43739();
            if ((iM43739 & Integer.MIN_VALUE) != 0) {
                throw C10998.m25387("Unhandled indirect reference", (Throwable) null);
            }
            long jM43726 = c19203.m43725();
            iArr[i] = iM43739 & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = jM12994;
            long j4 = jM43712 + jM43726;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int[] iArr2 = iArr;
            jM12994 = C5792.m12993(j4, 1000000L, jM43725, RoundingMode.DOWN);
            jArr4[i] = jM12994 - jArr5[i];
            c19203.m43724(4);
            j3 += (long) iArr2[i];
            i++;
            jArr3 = jArr5;
            iArr = iArr2;
            iM43710 = iM43710;
            jArr = jArr;
            jArr2 = jArr4;
            jM43712 = j4;
        }
        return Pair.create(Long.valueOf(jM12993), new C22446(iArr, jArr, jArr2, jArr3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21037 m33281(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C9815 c9815 = (C9815) list.get(i);
            if (c9815.f48556 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrM43728 = c9815.f27154.m43728();
                C3867 c3867M28989 = C12585.m28989(bArrM43728);
                UUID uuid = c3867M28989 == null ? null : c3867M28989.f8364;
                if (uuid == null) {
                    C21334.m48351("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C20366(uuid, null, "video/mp4", bArrM43728));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C21037(arrayList);
    }
}
