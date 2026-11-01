package p067l;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V742 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14900 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֡ */
    public long f42487;

    /* JADX INFO: renamed from: ֨ */
    public boolean f42488;

    /* JADX INFO: renamed from: ֫ */
    public Uri f42489;

    /* JADX INFO: renamed from: ۖ */
    public boolean f42490;

    /* JADX INFO: renamed from: ۘ */
    public final boolean f42491;

    /* JADX INFO: renamed from: ۚ */
    public C5318 f42492;

    /* JADX INFO: renamed from: ۜ */
    public long f42493;

    /* JADX INFO: renamed from: ۠ */
    public final InterfaceC22753 f42494;

    /* JADX INFO: renamed from: ۡ */
    public C5318 f42495;

    /* JADX INFO: renamed from: ۢ */
    public long f42496;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f42497 = false;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC22753 f42498;

    /* JADX INFO: renamed from: ܺ */
    public C24288 f42499;

    /* JADX INFO: renamed from: ܽ */
    public long f42500;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC13560 f42501;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC22948 f42502;

    /* JADX INFO: renamed from: ᩴ */
    public final boolean f42503;

    /* JADX INFO: renamed from: ᩵ */
    public final boolean f42504;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC22753 f42505;

    /* JADX INFO: renamed from: ᩻ */
    public final C20937 f42506;

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        interfaceC2830.getClass();
        this.f42498.mo8132(interfaceC2830);
        this.f42494.mo8132(interfaceC2830);
    }

    public C14900(InterfaceC22948 interfaceC22948, InterfaceC22753 interfaceC22753, InterfaceC22753 interfaceC22754, C6854 c6854, InterfaceC13560 interfaceC13560, int i, boolean z) {
        this.f42502 = interfaceC22948;
        this.f42498 = interfaceC22754;
        this.f42501 = interfaceC13560;
        this.f42503 = (i & 2) != 0;
        this.f42491 = false;
        this.f42504 = z;
        if (interfaceC22753 != null) {
            this.f42494 = interfaceC22753;
            this.f42506 = c6854 != null ? new C20937(interfaceC22753, c6854) : null;
        } else {
            this.f42494 = C17582.f52550;
            this.f42506 = null;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC22948 m34110() {
        return this.f42502;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC13560 m34111() {
        return this.f42501;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) {
        try {
            String strMo14444 = this.f42501.mo14444(c5318);
            C6659 c6659M11510 = c5318.m11510();
            long j = c5318.f12521;
            long j2 = c5318.f12516;
            c6659M11510.m15165(strMo14444);
            C5318 c5318M15161 = c6659M11510.m15161();
            Uri uri = c5318M15161.f12514;
            this.f42492 = c5318M15161;
            boolean z = this.f42504;
            InterfaceC22948 interfaceC22948 = this.f42502;
            if (z) {
                String strM20954 = interfaceC22948.mo40351(strMo14444).m20954("exo_redir");
                Uri uri2 = strM20954 == null ? null : Uri.parse(strM20954);
                if (uri2 != null) {
                    uri = uri2;
                }
            }
            this.f42489 = uri;
            this.f42487 = j;
            boolean z2 = (this.f42503 && this.f42488) || (this.f42491 && j2 == -1);
            this.f42490 = z2;
            if (z2) {
                this.f42500 = -1L;
            } else {
                long jM34406 = C15033.m34406(interfaceC22948.mo40351(strMo14444));
                this.f42500 = jM34406;
                if (jM34406 != -1) {
                    long j3 = jM34406 - j;
                    this.f42500 = j3;
                    if (j3 < 0) {
                        throw new C23423(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.f42500;
                this.f42500 = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.f42500;
            if (j5 > 0 || j5 == -1) {
                m34108(c5318M15161, false);
            }
            return j2 != -1 ? j2 : this.f42500;
        } catch (Throwable th) {
            if (this.f42505 == this.f42498 || (th instanceof C10207)) {
                this.f42488 = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:9:0x001f, B:11:0x0027, B:12:0x002a, B:14:0x003b, B:16:0x004c, B:18:0x0050, B:23:0x0059, B:25:0x005f, B:27:0x0065, B:31:0x0072, B:33:0x0082, B:39:0x0090), top: B:48:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        InterfaceC22753 interfaceC22753 = this.f42498;
        if (i2 == 0) {
            return 0;
        }
        if (this.f42500 == 0) {
            return -1;
        }
        C5318 c5318 = this.f42492;
        c5318.getClass();
        C5318 c5319 = this.f42495;
        c5319.getClass();
        try {
            if (this.f42487 >= this.f42493) {
                m34108(c5318, true);
            }
            InterfaceC22753 interfaceC22754 = this.f42505;
            interfaceC22754.getClass();
            int i3 = interfaceC22754.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = i3;
                this.f42487 += j2;
                this.f42496 += j2;
                long j3 = this.f42500;
                if (j3 != -1) {
                    this.f42500 = j3 - j2;
                    return i3;
                }
            } else {
                InterfaceC22753 interfaceC22755 = this.f42505;
                if (!(interfaceC22755 == interfaceC22753)) {
                    long j4 = c5319.f12516;
                    if (j4 == -1 || this.f42496 < j4) {
                        String str = c5318.f12518;
                        String str2 = C5792.f14228;
                        this.f42500 = 0L;
                        if (interfaceC22755 == this.f42506) {
                            C25139 c25139 = new C25139();
                            C25139.m55191(c25139, this.f42487);
                            this.f42502.mo40354(str, c25139);
                            return i3;
                        }
                    } else {
                        j = this.f42500;
                        if (j <= 0) {
                            if (j == -1) {
                            }
                        }
                        m34109();
                        m34108(c5318, false);
                        return read(bArr, i, i2);
                    }
                } else {
                    j = this.f42500;
                    if (j <= 0) {
                        if (j == -1) {
                        }
                    }
                    m34109();
                    m34108(c5318, false);
                    return read(bArr, i, i2);
                }
            }
            return i3;
        } catch (Throwable th) {
            if (this.f42505 == interfaceC22753 || (th instanceof C10207)) {
                this.f42488 = true;
            }
            throw th;
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f42489;
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        this.f42492 = null;
        this.f42489 = null;
        this.f42487 = 0L;
        try {
            m34109();
        } catch (Throwable th) {
            if (this.f42505 == this.f42498 || (th instanceof C10207)) {
                this.f42488 = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    private void m34108(C5318 c5318, boolean z) throws InterruptedIOException {
        C24288 c24288Mo40363;
        InterfaceC22753 interfaceC22753;
        InterfaceC22753 interfaceC22754;
        long j;
        C5318 c5318M15161;
        InterfaceC22753 interfaceC22755;
        long j2;
        long jMo4020;
        C25139 c25139;
        Uri uriMo4021;
        Uri uri;
        boolean z2;
        String str = c5318.f12518;
        String str2 = C5792.f14228;
        boolean z3 = this.f42490;
        InterfaceC22948 interfaceC22948 = this.f42502;
        if (z3) {
            c24288Mo40363 = null;
        } else if (this.f42497) {
            try {
                c24288Mo40363 = interfaceC22948.mo40363(str, this.f42487, this.f42500);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            c24288Mo40363 = interfaceC22948.mo40361(str, this.f42487, this.f42500);
        }
        C20937 c20937 = this.f42506;
        InterfaceC22753 interfaceC22756 = this.f42498;
        InterfaceC22753 interfaceC22757 = this.f42494;
        if (c24288Mo40363 != null) {
            long jMin = c24288Mo40363.f76933;
            if (c24288Mo40363.f76938) {
                Uri uriFromFile = Uri.fromFile(c24288Mo40363.f76937);
                long j3 = c24288Mo40363.f76935;
                long j4 = this.f42487 - j3;
                long jMin2 = jMin - j4;
                interfaceC22753 = interfaceC22756;
                interfaceC22754 = interfaceC22757;
                long j5 = this.f42500;
                if (j5 != -1) {
                    jMin2 = Math.min(jMin2, j5);
                }
                C6659 c6659M11510 = c5318.m11510();
                c6659M11510.m15164(uriFromFile);
                c6659M11510.m15171(j3);
                c6659M11510.m15169(j4);
                c6659M11510.m15163(jMin2);
                c5318M15161 = c6659M11510.m15161();
                j = -1;
                interfaceC22757 = interfaceC22753;
            } else {
                interfaceC22753 = interfaceC22756;
                interfaceC22754 = interfaceC22757;
                j = -1;
                if (jMin == -1) {
                    jMin = this.f42500;
                } else {
                    long j6 = this.f42500;
                    if (j6 != -1) {
                        jMin = Math.min(jMin, j6);
                    }
                }
                C6659 c6659M11511 = c5318.m11510();
                c6659M11511.m15169(this.f42487);
                c6659M11511.m15163(jMin);
                c5318M15161 = c6659M11511.m15161();
                if (c20937 != null) {
                    interfaceC22757 = c20937;
                } else {
                    interfaceC22948.mo40355(c24288Mo40363);
                    c24288Mo40363 = null;
                    interfaceC22757 = interfaceC22754;
                }
            }
        } else {
            C6659 c6659M11512 = c5318.m11510();
            c6659M11512.m15169(this.f42487);
            c6659M11512.m15163(this.f42500);
            c5318M15161 = c6659M11512.m15161();
            j = -1;
            interfaceC22753 = interfaceC22756;
            interfaceC22754 = interfaceC22757;
        }
        if (!this.f42490) {
            interfaceC22755 = interfaceC22754;
            if (interfaceC22757 == interfaceC22755) {
                j2 = this.f42487 + 102400;
            }
            this.f42493 = j2;
            if (z) {
                if (this.f42505 == interfaceC22755) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C23877.m52960(z2);
                if (interfaceC22757 == interfaceC22755) {
                    return;
                }
                try {
                    m34109();
                } catch (Throwable th) {
                    if (!c24288Mo40363.f76938) {
                        interfaceC22948.mo40355(c24288Mo40363);
                        throw th;
                    }
                    throw th;
                }
            }
            if (c24288Mo40363 != null && !c24288Mo40363.f76938) {
                this.f42499 = c24288Mo40363;
            }
            this.f42505 = interfaceC22757;
            this.f42495 = c5318M15161;
            this.f42496 = 0L;
            jMo4020 = interfaceC22757.mo4020(c5318M15161);
            c25139 = new C25139();
            if (c5318M15161.f12516 == j && jMo4020 != j) {
                this.f42500 = jMo4020;
                C25139.m55191(c25139, this.f42487 + jMo4020);
            }
            if (!(this.f42505 == interfaceC22753)) {
                uriMo4021 = interfaceC22757.mo4021();
                this.f42489 = uriMo4021;
                if (this.f42504) {
                    if (c5318.f12514.equals(uriMo4021)) {
                        uri = null;
                    } else {
                        uri = this.f42489;
                    }
                    C25139.m55192(c25139, uri);
                }
            }
            if (this.f42505 == c20937) {
                interfaceC22948.mo40354(str, c25139);
            }
        }
        interfaceC22755 = interfaceC22754;
        j2 = C14849.FOREVER_NS;
        this.f42493 = j2;
        if (z) {
            if (this.f42505 == interfaceC22755) {
                z2 = true;
            } else {
                z2 = false;
            }
            C23877.m52960(z2);
            if (interfaceC22757 == interfaceC22755) {
                return;
            } else {
                m34109();
            }
        }
        if (c24288Mo40363 != null) {
            this.f42499 = c24288Mo40363;
        }
        this.f42505 = interfaceC22757;
        this.f42495 = c5318M15161;
        this.f42496 = 0L;
        jMo4020 = interfaceC22757.mo4020(c5318M15161);
        c25139 = new C25139();
        if (c5318M15161.f12516 == j) {
            this.f42500 = jMo4020;
            C25139.m55191(c25139, this.f42487 + jMo4020);
        }
        if (!(this.f42505 == interfaceC22753)) {
            uriMo4021 = interfaceC22757.mo4021();
            this.f42489 = uriMo4021;
            if (this.f42504) {
                if (c5318.f12514.equals(uriMo4021)) {
                    uri = this.f42489;
                } else {
                    uri = null;
                }
                C25139.m55192(c25139, uri);
            }
        }
        if (this.f42505 == c20937) {
            interfaceC22948.mo40354(str, c25139);
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        if (!(this.f42505 == this.f42498)) {
            return this.f42494.mo8131();
        }
        return Collections.EMPTY_MAP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۜ */
    private void m34109() {
        InterfaceC22948 interfaceC22948 = this.f42502;
        InterfaceC22753 interfaceC22753 = this.f42505;
        if (interfaceC22753 == null) {
            return;
        }
        try {
            interfaceC22753.close();
        } finally {
            this.f42495 = null;
            this.f42505 = null;
            C24288 c24288 = this.f42499;
            if (c24288 != null) {
                interfaceC22948.mo40355(c24288);
                this.f42499 = null;
            }
        }
    }
}
