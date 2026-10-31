package l;

import android.graphics.Bitmap;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩵ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08T5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19497 extends AbstractC4930 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public long f62997;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public C18791 f62998;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC15967 f62999;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C21843 f63000;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public C18791 f63001;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public long f63002;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C6796 f63003;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public Bitmap f63004;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f63005;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f63006;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f63007;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f63008;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C21843 f63009;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C8353 f63010;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f63011;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f63012;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C23729 f63013;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C3974 f63014;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f63015;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f63016;

    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "ImageRenderer";
    }

    public C19497(C23729 c23729) {
        super(4);
        this.f63013 = c23729;
        this.f62999 = InterfaceC15967.f49276;
        this.f63009 = new C21843(0, 0);
        this.f63014 = C3974.f12610;
        this.f63015 = new ArrayDeque();
        this.f62997 = -9223372036854775807L;
        this.f63002 = -9223372036854775807L;
        this.f63006 = 0;
        this.f63005 = 1;
    }

    @Override // l.InterfaceC18065
    /* JADX INFO: renamed from: ֫ */
    public final int mo16568(C8353 c8353) {
        return this.f63013.m52377(c8353);
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6088(long j, long j2) throws C18273 {
        if (this.f63008) {
            return;
        }
        if (this.f63010 == null) {
            C3002 c3002M14370 = m14370();
            C21843 c21843 = this.f63009;
            c21843.mo7();
            int iM14355 = m14355(c3002M14370, c21843, 2);
            if (iM14355 != -5) {
                if (iM14355 == -4) {
                    C22632.m50634(c21843.m12697());
                    this.f63011 = true;
                    this.f63008 = true;
                    return;
                }
                return;
            }
            C8353 c8353 = c3002M14370.f9455;
            C22632.m50632(c8353);
            this.f63010 = c8353;
            this.f63007 = true;
        }
        if (this.f63003 == null) {
            m44904();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (m44906(j)) {
            }
            while (m44907(j)) {
            }
            Trace.endSection();
        } catch (C9619 e) {
            throw m14356(e, (C8353) null, 4003);
        }
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6101() {
        int i = this.f63005;
        if (i != 3) {
            return i == 0 && this.f63012;
        }
        return true;
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6098() {
        return this.f63008;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13457(boolean z, boolean z2) {
        this.f63005 = z2 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
        if (this.f63014.f12612 != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.f63015;
            if (arrayDeque.isEmpty()) {
                long j3 = this.f62997;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.f63002;
                    if (j4 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new C3974(this.f62997, j2));
            return;
        }
        this.f63014 = new C3974(-9223372036854775807L, j2);
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۤ */
    public final void mo13464() {
        this.f63010 = null;
        this.f63014 = C3974.f12610;
        this.f63015.clear();
        m44905();
        this.f62999.mo22980();
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ᩺ */
    public final void mo13473() {
        m44905();
        this.f63005 = Math.min(this.f63005, 1);
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۛ */
    public final void mo13461() {
        m44905();
    }

    @Override // l.AbstractC4930, l.InterfaceC5783
    /* JADX INFO: renamed from: ֫ */
    public final void mo13450(int i, Object obj) {
        if (i != 15) {
            return;
        }
        InterfaceC15967 interfaceC15967 = obj instanceof InterfaceC15967 ? (InterfaceC15967) obj : null;
        if (interfaceC15967 == null) {
            interfaceC15967 = InterfaceC15967.f49276;
        }
        this.f62999 = interfaceC15967;
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
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m44906(long j) throws C18273 {
        boolean z;
        Bitmap bitmapM43443;
        long jM43441;
        boolean z2;
        int i;
        boolean z3;
        int iM43444;
        int i2;
        C8353 c8353;
        C18791 c18791;
        Bitmap bitmapCreateBitmap;
        if ((this.f63004 == null || this.f63001 != null) && (this.f63005 != 0 || getState() == 2)) {
            Bitmap bitmap = this.f63004;
            ArrayDeque arrayDeque = this.f63015;
            if (bitmap == null) {
                C22632.m50632(this.f63003);
                AbstractC2563 abstractC2563 = (AbstractC2563) this.f63003.mo4863();
                if (abstractC2563 != null) {
                    if (abstractC2563.m12697()) {
                        if (this.f63006 == 3) {
                            m44905();
                            C22632.m50632(this.f63010);
                            m44904();
                            return false;
                        }
                        abstractC2563.mo8();
                        if (arrayDeque.isEmpty()) {
                            this.f63008 = true;
                            return false;
                        }
                    } else {
                        Bitmap bitmap2 = abstractC2563.f8105;
                        if (bitmap2 == null) {
                            throw new IllegalStateException("Non-EOS buffer came back from the decoder without bitmap.");
                        }
                        this.f63004 = bitmap2;
                        abstractC2563.mo8();
                        if (this.f63012 && this.f63004 != null && this.f63001 != null) {
                            C22632.m50632(this.f63010);
                            C8353 c8354 = this.f63010;
                            int i3 = c8354.f25638;
                            int i4 = c8354.f25607;
                            z = ((i3 != 1 && i4 == 1) || i3 == -1 || i4 == -1) ? false : true;
                            if (!this.f63001.m43445()) {
                                c18791 = this.f63001;
                                if (z) {
                                    int iM43445 = c18791.m43444();
                                    C22632.m50632(this.f63004);
                                    int width = this.f63004.getWidth();
                                    C8353 c8355 = this.f63010;
                                    C22632.m50632(c8355);
                                    int i5 = width / c8355.f25638;
                                    int height = this.f63004.getHeight();
                                    C8353 c8356 = this.f63010;
                                    C22632.m50632(c8356);
                                    int i6 = height / c8356.f25607;
                                    int i7 = this.f63010.f25638;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f63004, (iM43445 % i7) * i5, (iM43445 / i7) * i6, i5, i6);
                                } else {
                                    bitmapCreateBitmap = this.f63004;
                                    C22632.m50632(bitmapCreateBitmap);
                                }
                                c18791.m43442(bitmapCreateBitmap);
                            }
                            bitmapM43443 = this.f63001.m43443();
                            C22632.m50632(bitmapM43443);
                            jM43441 = this.f63001.m43441();
                            long j2 = jM43441 - j;
                            if (getState() == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.f63005;
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
                                this.f62999.mo22981(jM43441 - this.f63014.f12612, bitmapM43443);
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                C18791 c18792 = this.f63001;
                                C22632.m50632(c18792);
                                long jM43442 = c18792.m43441();
                                this.f63002 = jM43442;
                                while (!arrayDeque.isEmpty() && jM43442 >= ((C3974) arrayDeque.peek()).f12611) {
                                    this.f63014 = (C3974) arrayDeque.removeFirst();
                                }
                                this.f63005 = 3;
                                if (z) {
                                    C18791 c18793 = this.f63001;
                                    C22632.m50632(c18793);
                                    iM43444 = c18793.m43444();
                                    C8353 c8357 = this.f63010;
                                    C22632.m50632(c8357);
                                    i2 = c8357.f25607;
                                    c8353 = this.f63010;
                                    C22632.m50632(c8353);
                                    if (iM43444 == (i2 * c8353.f25638) - 1) {
                                        this.f63004 = null;
                                    }
                                } else {
                                    this.f63004 = null;
                                }
                                this.f63001 = this.f62998;
                                this.f62998 = null;
                                return true;
                            }
                        }
                    }
                }
            } else if (this.f63012) {
                C22632.m50632(this.f63010);
                C8353 c8358 = this.f63010;
                int i8 = c8358.f25638;
                int i9 = c8358.f25607;
                if (i8 != 1) {
                }
                if (!this.f63001.m43445()) {
                    c18791 = this.f63001;
                    if (z) {
                        int iM43446 = c18791.m43444();
                        C22632.m50632(this.f63004);
                        int width2 = this.f63004.getWidth();
                        C8353 c8359 = this.f63010;
                        C22632.m50632(c8359);
                        int i10 = width2 / c8359.f25638;
                        int height2 = this.f63004.getHeight();
                        C8353 c83510 = this.f63010;
                        C22632.m50632(c83510);
                        int i11 = height2 / c83510.f25607;
                        int i12 = this.f63010.f25638;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f63004, (iM43446 % i12) * i10, (iM43446 / i12) * i11, i10, i11);
                    } else {
                        bitmapCreateBitmap = this.f63004;
                        C22632.m50632(bitmapCreateBitmap);
                    }
                    c18791.m43442(bitmapCreateBitmap);
                }
                bitmapM43443 = this.f63001.m43443();
                C22632.m50632(bitmapM43443);
                jM43441 = this.f63001.m43441();
                long j3 = jM43441 - j;
                if (getState() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.f63005;
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
                    this.f62999.mo22981(jM43441 - this.f63014.f12612, bitmapM43443);
                    z3 = true;
                } else {
                    this.f62999.mo22981(jM43441 - this.f63014.f12612, bitmapM43443);
                    z3 = true;
                }
                if (z3) {
                    C18791 c18794 = this.f63001;
                    C22632.m50632(c18794);
                    long jM43443 = c18794.m43441();
                    this.f63002 = jM43443;
                    while (!arrayDeque.isEmpty()) {
                        this.f63014 = (C3974) arrayDeque.removeFirst();
                    }
                    this.f63005 = 3;
                    if (z) {
                        C18791 c18795 = this.f63001;
                        C22632.m50632(c18795);
                        iM43444 = c18795.m43444();
                        C8353 c83511 = this.f63010;
                        C22632.m50632(c83511);
                        i2 = c83511.f25607;
                        c8353 = this.f63010;
                        C22632.m50632(c8353);
                        if (iM43444 == (i2 * c8353.f25638) - 1) {
                            this.f63004 = null;
                        }
                    } else {
                        this.f63004 = null;
                    }
                    this.f63001 = this.f62998;
                    this.f62998 = null;
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
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m44907(long j) {
        int iM14355;
        ByteBuffer byteBuffer;
        C21843 c21843;
        boolean z;
        C21843 c21844;
        C18791 c18791;
        long jM43441;
        boolean z2;
        C18791 c18792;
        boolean z3;
        C8353 c8353;
        boolean z4;
        boolean z5;
        C21843 c21845;
        if (!this.f63012 || this.f63001 == null) {
            C3002 c3002M14370 = m14370();
            C6796 c6796 = this.f63003;
            if (c6796 != null && this.f63006 != 3 && !this.f63011) {
                if (this.f63000 == null) {
                    C21843 c21846 = (C21843) c6796.mo4865();
                    this.f63000 = c21846;
                    if (c21846 != null) {
                        if (this.f63006 == 2) {
                            C22632.m50632(this.f63000);
                            this.f63000.m12693(4);
                            C6796 c6797 = this.f63003;
                            C22632.m50632(c6797);
                            c6797.m47743(this.f63000);
                            this.f63000 = null;
                            this.f63006 = 3;
                            return false;
                        }
                        iM14355 = m14355(c3002M14370, this.f63000, 0);
                        if (iM14355 != -5) {
                            C8353 c8354 = c3002M14370.f9455;
                            C22632.m50632(c8354);
                            this.f63010 = c8354;
                            this.f63007 = true;
                            this.f63006 = 2;
                            return true;
                        }
                        if (iM14355 != -4) {
                            this.f63000.m49229();
                            byteBuffer = this.f63000.f69995;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                c21843 = this.f63000;
                                C22632.m50632(c21843);
                                if (c21843.m12697()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                C21843 c21847 = this.f63000;
                                C22632.m50632(c21847);
                                c21847.f69994 = this.f63010;
                                C6796 c6798 = this.f63003;
                                C22632.m50632(c6798);
                                C21843 c21848 = this.f63000;
                                C22632.m50632(c21848);
                                c6798.m47743(c21848);
                                this.f63016 = 0;
                            }
                            c21844 = this.f63000;
                            C22632.m50632(c21844);
                            if (c21844.m12697()) {
                                this.f63012 = true;
                            } else {
                                int i = this.f63016;
                                c18791 = new C18791(i, c21844.f69997);
                                this.f62998 = c18791;
                                this.f63016 = i + 1;
                                if (!this.f63012) {
                                    jM43441 = c18791.m43441();
                                    if (jM43441 - 30000 <= j || j > 30000 + jM43441) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    c18792 = this.f63001;
                                    if (c18792 != null || c18792.m43441() > j || j >= jM43441) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    C18791 c18793 = this.f62998;
                                    C22632.m50632(c18793);
                                    c8353 = this.f63010;
                                    C22632.m50632(c8353);
                                    if (c8353.f25638 != -1 || this.f63010.f25607 == -1) {
                                        z4 = true;
                                    } else {
                                        int iM43444 = c18793.m43444();
                                        C8353 c8355 = this.f63010;
                                        C22632.m50632(c8355);
                                        if (iM43444 == (c8355.f25607 * this.f63010.f25638) - 1) {
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
                                    this.f63012 = z5;
                                    if (z3 || z2) {
                                        this.f63001 = this.f62998;
                                        this.f62998 = null;
                                    }
                                } else {
                                    this.f63001 = this.f62998;
                                    this.f62998 = null;
                                }
                            }
                            c21845 = this.f63000;
                            C22632.m50632(c21845);
                            if (c21845.m12697()) {
                                this.f63011 = true;
                                this.f63000 = null;
                                return false;
                            }
                            long j2 = this.f62997;
                            C21843 c21849 = this.f63000;
                            C22632.m50632(c21849);
                            this.f62997 = Math.max(j2, c21849.f69997);
                            if (z) {
                                this.f63000 = null;
                            } else {
                                C21843 c218410 = this.f63000;
                                C22632.m50632(c218410);
                                c218410.mo7();
                            }
                            return !this.f63012;
                        }
                        if (iM14355 != -3) {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    if (this.f63006 == 2) {
                        C22632.m50632(this.f63000);
                        this.f63000.m12693(4);
                        C6796 c6799 = this.f63003;
                        C22632.m50632(c6799);
                        c6799.m47743(this.f63000);
                        this.f63000 = null;
                        this.f63006 = 3;
                        return false;
                    }
                    iM14355 = m14355(c3002M14370, this.f63000, 0);
                    if (iM14355 != -5) {
                        C8353 c8356 = c3002M14370.f9455;
                        C22632.m50632(c8356);
                        this.f63010 = c8356;
                        this.f63007 = true;
                        this.f63006 = 2;
                        return true;
                    }
                    if (iM14355 != -4) {
                        this.f63000.m49229();
                        byteBuffer = this.f63000.f69995;
                        if (byteBuffer != null) {
                            c21843 = this.f63000;
                            C22632.m50632(c21843);
                            if (c21843.m12697()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            c21843 = this.f63000;
                            C22632.m50632(c21843);
                            if (c21843.m12697()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            C21843 c218411 = this.f63000;
                            C22632.m50632(c218411);
                            c218411.f69994 = this.f63010;
                            C6796 c67910 = this.f63003;
                            C22632.m50632(c67910);
                            C21843 c218412 = this.f63000;
                            C22632.m50632(c218412);
                            c67910.m47743(c218412);
                            this.f63016 = 0;
                        }
                        c21844 = this.f63000;
                        C22632.m50632(c21844);
                        if (c21844.m12697()) {
                            this.f63012 = true;
                        } else {
                            int i2 = this.f63016;
                            c18791 = new C18791(i2, c21844.f69997);
                            this.f62998 = c18791;
                            this.f63016 = i2 + 1;
                            if (!this.f63012) {
                                jM43441 = c18791.m43441();
                                if (jM43441 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                c18792 = this.f63001;
                                if (c18792 != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                C18791 c18794 = this.f62998;
                                C22632.m50632(c18794);
                                c8353 = this.f63010;
                                C22632.m50632(c8353);
                                if (c8353.f25638 != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.f63012 = z5;
                                if (z3) {
                                    this.f63001 = this.f62998;
                                    this.f62998 = null;
                                } else {
                                    this.f63001 = this.f62998;
                                    this.f62998 = null;
                                }
                            } else {
                                this.f63001 = this.f62998;
                                this.f62998 = null;
                            }
                        }
                        c21845 = this.f63000;
                        C22632.m50632(c21845);
                        if (c21845.m12697()) {
                            this.f63011 = true;
                            this.f63000 = null;
                            return false;
                        }
                        long j3 = this.f62997;
                        C21843 c218413 = this.f63000;
                        C22632.m50632(c218413);
                        this.f62997 = Math.max(j3, c218413.f69997);
                        if (z) {
                            this.f63000 = null;
                        } else {
                            C21843 c218414 = this.f63000;
                            C22632.m50632(c218414);
                            c218414.mo7();
                        }
                        return !this.f63012;
                    }
                    if (iM14355 != -3) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private void m44904() throws C18273 {
        if (this.f63007) {
            C8353 c8353 = this.f63010;
            c8353.getClass();
            C23729 c23729 = this.f63013;
            int iM52377 = c23729.m52377(c8353);
            if (iM52377 == C11010.m27348(4, 0, 0, 0) || iM52377 == C11010.m27348(3, 0, 0, 0)) {
                C6796 c6796 = this.f63003;
                if (c6796 != null) {
                    c6796.mo12();
                }
                this.f63003 = c23729.m52378();
                this.f63007 = false;
                return;
            }
            throw m14356(new C9619("Provided decoder factory can't create decoder for format."), this.f63010, 4005);
        }
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13451(long j, boolean z) {
        this.f63005 = Math.min(this.f63005, 1);
        this.f63008 = false;
        this.f63011 = false;
        this.f63004 = null;
        this.f63001 = null;
        this.f62998 = null;
        this.f63012 = false;
        this.f63000 = null;
        C6796 c6796 = this.f63003;
        if (c6796 != null) {
            c6796.flush();
        }
        this.f63015.clear();
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private void m44905() {
        this.f63000 = null;
        this.f63006 = 0;
        this.f62997 = -9223372036854775807L;
        C6796 c6796 = this.f63003;
        if (c6796 != null) {
            c6796.mo12();
            this.f63003 = null;
        }
    }
}
