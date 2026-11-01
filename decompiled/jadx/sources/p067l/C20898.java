package p067l;

import android.graphics.Bitmap;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩵ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08T5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20898 extends AbstractC7054 {

    /* JADX INFO: renamed from: ֡֫ */
    public long f65614;

    /* JADX INFO: renamed from: ֨֫ */
    public C20227 f65615;

    /* JADX INFO: renamed from: ۖ֫ */
    public InterfaceC17543 f65616;

    /* JADX INFO: renamed from: ۘ֫ */
    public C23128 f65617;

    /* JADX INFO: renamed from: ۙ֫ */
    public C20227 f65618;

    /* JADX INFO: renamed from: ۚ֫ */
    public long f65619;

    /* JADX INFO: renamed from: ۜ֫ */
    public C8827 f65620;

    /* JADX INFO: renamed from: ۠֫ */
    public Bitmap f65621;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f65622;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f65623;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f65624;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f65625;

    /* JADX INFO: renamed from: ܺ֫ */
    public final C23128 f65626;

    /* JADX INFO: renamed from: ᩴ֫ */
    public C10307 f65627;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f65628;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean f65629;

    /* JADX INFO: renamed from: ᩷֫ */
    public final C24920 f65630;

    /* JADX INFO: renamed from: ᩸֫ */
    public C6145 f65631;

    /* JADX INFO: renamed from: ᩹֫ */
    public final ArrayDeque f65632;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f65633;

    @Override // p067l.InterfaceC4114, p067l.InterfaceC19537
    public final String getName() {
        return "ImageRenderer";
    }

    public C20898(C24920 c24920) {
        super(4);
        this.f65630 = c24920;
        this.f65616 = InterfaceC17543.f52434;
        this.f65626 = new C23128(0, 0);
        this.f65631 = C6145.f15421;
        this.f65632 = new ArrayDeque();
        this.f65614 = -9223372036854775807L;
        this.f65619 = -9223372036854775807L;
        this.f65623 = 0;
        this.f65622 = 1;
    }

    @Override // p067l.InterfaceC19537
    /* JADX INFO: renamed from: ֫ */
    public final int mo18494(C10307 c10307) {
        return this.f65630.m54784(c10307);
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8286(long j, long j2) throws C19735 {
        if (this.f65625) {
            return;
        }
        if (this.f65627 == null) {
            C5221 c5221M16267 = m16267();
            C23128 c23128 = this.f65626;
            c23128.mo7();
            int iM16252 = m16252(c5221M16267, c23128, 2);
            if (iM16252 != -5) {
                if (iM16252 == -4) {
                    C23877.m52960(c23128.m14573());
                    this.f65628 = true;
                    this.f65625 = true;
                    return;
                }
                return;
            }
            C10307 c10307 = c5221M16267.f12253;
            C23877.m52958(c10307);
            this.f65627 = c10307;
            this.f65624 = true;
        }
        if (this.f65620 == null) {
            m47202();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (m47204(j)) {
            }
            while (m47205(j)) {
            }
            Trace.endSection();
        } catch (C11510 e) {
            throw m16253(e, (C10307) null, 4003);
        }
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8299() {
        int i = this.f65622;
        if (i != 3) {
            return i == 0 && this.f65629;
        }
        return true;
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8296() {
        return this.f65625;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15345(boolean z, boolean z2) {
        this.f65622 = z2 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo16256(C10307[] c10307Arr, long j, long j2, C17474 c17474) {
        if (this.f65631.f15423 != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.f65632;
            if (arrayDeque.isEmpty()) {
                long j3 = this.f65614;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.f65619;
                    if (j4 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new C6145(this.f65614, j2));
            return;
        }
        this.f65631 = new C6145(-9223372036854775807L, j2);
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۤ */
    public final void mo15352() {
        this.f65627 = null;
        this.f65631 = C6145.f15421;
        this.f65632.clear();
        m47203();
        this.f65616.mo24954();
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ᩺ */
    public final void mo15361() {
        m47203();
        this.f65622 = Math.min(this.f65622, 1);
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۛ */
    public final void mo15349() {
        m47203();
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC7864
    /* JADX INFO: renamed from: ֫ */
    public final void mo15338(int i, Object obj) {
        if (i != 15) {
            return;
        }
        InterfaceC17543 interfaceC17543 = obj instanceof InterfaceC17543 ? (InterfaceC17543) obj : null;
        if (interfaceC17543 == null) {
            interfaceC17543 = InterfaceC17543.f52434;
        }
        this.f65616 = interfaceC17543;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x015e  */
    /* JADX INFO: renamed from: ܽ */
    private boolean m47204(long j) throws C19735 {
        boolean z;
        Bitmap bitmapM45712;
        long jM45710;
        boolean z2;
        int i;
        boolean z3;
        int iM45713;
        int i2;
        C10307 c10307;
        C20227 c20227;
        Bitmap bitmapCreateBitmap;
        if ((this.f65621 == null || this.f65618 != null) && (this.f65622 != 0 || getState() == 2)) {
            Bitmap bitmap = this.f65621;
            ArrayDeque arrayDeque = this.f65632;
            if (bitmap == null) {
                C23877.m52958(this.f65620);
                AbstractC4804 abstractC4804 = (AbstractC4804) this.f65620.mo7101();
                if (abstractC4804 != null) {
                    if (abstractC4804.m14573()) {
                        if (this.f65623 == 3) {
                            m47203();
                            C23877.m52958(this.f65627);
                            m47202();
                            return false;
                        }
                        abstractC4804.mo8();
                        if (arrayDeque.isEmpty()) {
                            this.f65625 = true;
                            return false;
                        }
                    } else {
                        Bitmap bitmap2 = abstractC4804.f10895;
                        if (bitmap2 == null) {
                            throw new IllegalStateException("Non-EOS buffer came back from the decoder without bitmap.");
                        }
                        this.f65621 = bitmap2;
                        abstractC4804.mo8();
                        if (this.f65629 && this.f65621 != null && this.f65618 != null) {
                            C23877.m52958(this.f65627);
                            C10307 c10308 = this.f65627;
                            int i3 = c10308.f28552;
                            int i4 = c10308.f28521;
                            z = ((i3 != 1 && i4 == 1) || i3 == -1 || i4 == -1) ? false : true;
                            if (!this.f65618.m45714()) {
                                c20227 = this.f65618;
                                if (z) {
                                    int iM45714 = c20227.m45713();
                                    C23877.m52958(this.f65621);
                                    int width = this.f65621.getWidth();
                                    C10307 c10309 = this.f65627;
                                    C23877.m52958(c10309);
                                    int i5 = width / c10309.f28552;
                                    int height = this.f65621.getHeight();
                                    C10307 c103010 = this.f65627;
                                    C23877.m52958(c103010);
                                    int i6 = height / c103010.f28521;
                                    int i7 = this.f65627.f28552;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f65621, (iM45714 % i7) * i5, (iM45714 / i7) * i6, i5, i6);
                                } else {
                                    bitmapCreateBitmap = this.f65621;
                                    C23877.m52958(bitmapCreateBitmap);
                                }
                                c20227.m45711(bitmapCreateBitmap);
                            }
                            bitmapM45712 = this.f65618.m45712();
                            C23877.m52958(bitmapM45712);
                            jM45710 = this.f65618.m45710();
                            long j2 = jM45710 - j;
                            if (getState() == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.f65622;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        throw new IllegalStateException();
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j2 < 30000) {
                                this.f65616.mo24955(jM45710 - this.f65631.f15423, bitmapM45712);
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                C20227 c20228 = this.f65618;
                                C23877.m52958(c20228);
                                long jM45711 = c20228.m45710();
                                this.f65619 = jM45711;
                                while (!arrayDeque.isEmpty() && jM45711 >= ((C6145) arrayDeque.peek()).f15422) {
                                    this.f65631 = (C6145) arrayDeque.removeFirst();
                                }
                                this.f65622 = 3;
                                if (z) {
                                    C20227 c20229 = this.f65618;
                                    C23877.m52958(c20229);
                                    iM45713 = c20229.m45713();
                                    C10307 c103011 = this.f65627;
                                    C23877.m52958(c103011);
                                    i2 = c103011.f28521;
                                    c10307 = this.f65627;
                                    C23877.m52958(c10307);
                                    if (iM45713 == (i2 * c10307.f28552) - 1) {
                                        this.f65621 = null;
                                    }
                                } else {
                                    this.f65621 = null;
                                }
                                this.f65618 = this.f65615;
                                this.f65615 = null;
                                return true;
                            }
                        }
                    }
                }
            } else if (this.f65629) {
                C23877.m52958(this.f65627);
                C10307 c103012 = this.f65627;
                int i8 = c103012.f28552;
                int i9 = c103012.f28521;
                if (i8 != 1) {
                }
                if (!this.f65618.m45714()) {
                    c20227 = this.f65618;
                    if (z) {
                        int iM45715 = c20227.m45713();
                        C23877.m52958(this.f65621);
                        int width2 = this.f65621.getWidth();
                        C10307 c103013 = this.f65627;
                        C23877.m52958(c103013);
                        int i10 = width2 / c103013.f28552;
                        int height2 = this.f65621.getHeight();
                        C10307 c103014 = this.f65627;
                        C23877.m52958(c103014);
                        int i11 = height2 / c103014.f28521;
                        int i12 = this.f65627.f28552;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f65621, (iM45715 % i12) * i10, (iM45715 / i12) * i11, i10, i11);
                    } else {
                        bitmapCreateBitmap = this.f65621;
                        C23877.m52958(bitmapCreateBitmap);
                    }
                    c20227.m45711(bitmapCreateBitmap);
                }
                bitmapM45712 = this.f65618.m45712();
                C23877.m52958(bitmapM45712);
                jM45710 = this.f65618.m45710();
                long j3 = jM45710 - j;
                if (getState() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.f65622;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            throw new IllegalStateException();
                        }
                        z2 = false;
                    }
                }
                if (z2) {
                    this.f65616.mo24955(jM45710 - this.f65631.f15423, bitmapM45712);
                    z3 = true;
                } else {
                    this.f65616.mo24955(jM45710 - this.f65631.f15423, bitmapM45712);
                    z3 = true;
                }
                if (z3) {
                    C20227 c202210 = this.f65618;
                    C23877.m52958(c202210);
                    long jM45712 = c202210.m45710();
                    this.f65619 = jM45712;
                    while (!arrayDeque.isEmpty()) {
                        this.f65631 = (C6145) arrayDeque.removeFirst();
                    }
                    this.f65622 = 3;
                    if (z) {
                        C20227 c202211 = this.f65618;
                        C23877.m52958(c202211);
                        iM45713 = c202211.m45713();
                        C10307 c103015 = this.f65627;
                        C23877.m52958(c103015);
                        i2 = c103015.f28521;
                        c10307 = this.f65627;
                        C23877.m52958(c10307);
                        if (iM45713 == (i2 * c10307.f28552) - 1) {
                            this.f65621 = null;
                        }
                    } else {
                        this.f65621 = null;
                    }
                    this.f65618 = this.f65615;
                    this.f65615 = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0125  */
    /* JADX WARN: Code duplicated, block: B:83:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x014c  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX INFO: renamed from: ᩳ */
    private boolean m47205(long j) {
        int iM16252;
        ByteBuffer byteBuffer;
        C23128 c23128;
        boolean z;
        C23128 c23129;
        C20227 c20227;
        long jM45710;
        boolean z2;
        C20227 c20228;
        boolean z3;
        C10307 c10307;
        boolean z4;
        boolean z5;
        C23128 c231210;
        if (!this.f65629 || this.f65618 == null) {
            C5221 c5221M16267 = m16267();
            C8827 c8827 = this.f65620;
            if (c8827 != null && this.f65623 != 3 && !this.f65628) {
                if (this.f65617 == null) {
                    C23128 c231211 = (C23128) c8827.mo7103();
                    this.f65617 = c231211;
                    if (c231211 != null) {
                        if (this.f65623 == 2) {
                            C23877.m52958(this.f65617);
                            this.f65617.m14569(4);
                            C8827 c8828 = this.f65620;
                            C23877.m52958(c8828);
                            c8828.m50073(this.f65617);
                            this.f65617 = null;
                            this.f65623 = 3;
                            return false;
                        }
                        iM16252 = m16252(c5221M16267, this.f65617, 0);
                        if (iM16252 != -5) {
                            C10307 c10308 = c5221M16267.f12253;
                            C23877.m52958(c10308);
                            this.f65627 = c10308;
                            this.f65624 = true;
                            this.f65623 = 2;
                            return true;
                        }
                        if (iM16252 != -4) {
                            this.f65617.m51580();
                            byteBuffer = this.f65617.f72704;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                c23128 = this.f65617;
                                C23877.m52958(c23128);
                                if (c23128.m14573()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                C23128 c231212 = this.f65617;
                                C23877.m52958(c231212);
                                c231212.f72703 = this.f65627;
                                C8827 c8829 = this.f65620;
                                C23877.m52958(c8829);
                                C23128 c231213 = this.f65617;
                                C23877.m52958(c231213);
                                c8829.m50073(c231213);
                                this.f65633 = 0;
                            }
                            c23129 = this.f65617;
                            C23877.m52958(c23129);
                            if (c23129.m14573()) {
                                this.f65629 = true;
                            } else {
                                int i = this.f65633;
                                c20227 = new C20227(i, c23129.f72706);
                                this.f65615 = c20227;
                                this.f65633 = i + 1;
                                if (!this.f65629) {
                                    jM45710 = c20227.m45710();
                                    if (jM45710 - 30000 <= j || j > 30000 + jM45710) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    c20228 = this.f65618;
                                    if (c20228 != null || c20228.m45710() > j || j >= jM45710) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    C20227 c20229 = this.f65615;
                                    C23877.m52958(c20229);
                                    c10307 = this.f65627;
                                    C23877.m52958(c10307);
                                    if (c10307.f28552 != -1 || this.f65627.f28521 == -1) {
                                        z4 = true;
                                    } else {
                                        int iM45713 = c20229.m45713();
                                        C10307 c10309 = this.f65627;
                                        C23877.m52958(c10309);
                                        if (iM45713 == (c10309.f28521 * this.f65627.f28552) - 1) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.f65629 = z5;
                                    if (z3 || z2) {
                                        this.f65618 = this.f65615;
                                        this.f65615 = null;
                                    }
                                } else {
                                    this.f65618 = this.f65615;
                                    this.f65615 = null;
                                }
                            }
                            c231210 = this.f65617;
                            C23877.m52958(c231210);
                            if (c231210.m14573()) {
                                this.f65628 = true;
                                this.f65617 = null;
                                return false;
                            }
                            long j2 = this.f65614;
                            C23128 c231214 = this.f65617;
                            C23877.m52958(c231214);
                            this.f65614 = Math.max(j2, c231214.f72706);
                            if (z) {
                                this.f65617 = null;
                            } else {
                                C23128 c231215 = this.f65617;
                                C23877.m52958(c231215);
                                c231215.mo7();
                            }
                            return !this.f65629;
                        }
                        if (iM16252 != -3) {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    if (this.f65623 == 2) {
                        C23877.m52958(this.f65617);
                        this.f65617.m14569(4);
                        C8827 c88210 = this.f65620;
                        C23877.m52958(c88210);
                        c88210.m50073(this.f65617);
                        this.f65617 = null;
                        this.f65623 = 3;
                        return false;
                    }
                    iM16252 = m16252(c5221M16267, this.f65617, 0);
                    if (iM16252 != -5) {
                        C10307 c103010 = c5221M16267.f12253;
                        C23877.m52958(c103010);
                        this.f65627 = c103010;
                        this.f65624 = true;
                        this.f65623 = 2;
                        return true;
                    }
                    if (iM16252 != -4) {
                        this.f65617.m51580();
                        byteBuffer = this.f65617.f72704;
                        if (byteBuffer != null) {
                            c23128 = this.f65617;
                            C23877.m52958(c23128);
                            if (c23128.m14573()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            c23128 = this.f65617;
                            C23877.m52958(c23128);
                            if (c23128.m14573()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            C23128 c231216 = this.f65617;
                            C23877.m52958(c231216);
                            c231216.f72703 = this.f65627;
                            C8827 c88211 = this.f65620;
                            C23877.m52958(c88211);
                            C23128 c231217 = this.f65617;
                            C23877.m52958(c231217);
                            c88211.m50073(c231217);
                            this.f65633 = 0;
                        }
                        c23129 = this.f65617;
                        C23877.m52958(c23129);
                        if (c23129.m14573()) {
                            this.f65629 = true;
                        } else {
                            int i2 = this.f65633;
                            c20227 = new C20227(i2, c23129.f72706);
                            this.f65615 = c20227;
                            this.f65633 = i2 + 1;
                            if (!this.f65629) {
                                jM45710 = c20227.m45710();
                                if (jM45710 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                c20228 = this.f65618;
                                if (c20228 != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                C20227 c202210 = this.f65615;
                                C23877.m52958(c202210);
                                c10307 = this.f65627;
                                C23877.m52958(c10307);
                                if (c10307.f28552 != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.f65629 = z5;
                                if (z3) {
                                    this.f65618 = this.f65615;
                                    this.f65615 = null;
                                } else {
                                    this.f65618 = this.f65615;
                                    this.f65615 = null;
                                }
                            } else {
                                this.f65618 = this.f65615;
                                this.f65615 = null;
                            }
                        }
                        c231210 = this.f65617;
                        C23877.m52958(c231210);
                        if (c231210.m14573()) {
                            this.f65628 = true;
                            this.f65617 = null;
                            return false;
                        }
                        long j3 = this.f65614;
                        C23128 c231218 = this.f65617;
                        C23877.m52958(c231218);
                        this.f65614 = Math.max(j3, c231218.f72706);
                        if (z) {
                            this.f65617 = null;
                        } else {
                            C23128 c231219 = this.f65617;
                            C23877.m52958(c231219);
                            c231219.mo7();
                        }
                        return !this.f65629;
                    }
                    if (iM16252 != -3) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫֫ */
    private void m47202() throws C19735 {
        if (this.f65624) {
            C10307 c10307 = this.f65627;
            c10307.getClass();
            C24920 c24920 = this.f65630;
            int iM54784 = c24920.m54784(c10307);
            if (iM54784 == C12832.m29410(4, 0, 0, 0) || iM54784 == C12832.m29410(3, 0, 0, 0)) {
                C8827 c8827 = this.f65620;
                if (c8827 != null) {
                    c8827.mo12();
                }
                this.f65620 = c24920.m54785();
                this.f65624 = false;
                return;
            }
            throw m16253(new C11510("Provided decoder factory can't create decoder for format."), this.f65627, 4005);
        }
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15339(long j, boolean z) {
        this.f65622 = Math.min(this.f65622, 1);
        this.f65625 = false;
        this.f65628 = false;
        this.f65621 = null;
        this.f65618 = null;
        this.f65615 = null;
        this.f65629 = false;
        this.f65617 = null;
        C8827 c8827 = this.f65620;
        if (c8827 != null) {
            c8827.flush();
        }
        this.f65632.clear();
    }

    /* JADX INFO: renamed from: ۧ֫ */
    private void m47203() {
        this.f65617 = null;
        this.f65623 = 0;
        this.f65614 = -9223372036854775807L;
        C8827 c8827 = this.f65620;
        if (c8827 != null) {
            c8827.mo12();
            this.f65620 = null;
        }
    }
}
