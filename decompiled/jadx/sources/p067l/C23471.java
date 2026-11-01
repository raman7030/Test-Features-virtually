package p067l;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88L3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23471 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֨ */
    public static final byte[] f74762;

    /* JADX INFO: renamed from: ۠ */
    public static final byte[] f74763;

    /* JADX INFO: renamed from: ܶ */
    public static final int[] f74764 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ᩸ */
    public static final int[] f74765 = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ֡ */
    public final C21105 f74766;

    /* JADX INFO: renamed from: ֫ */
    public int f74767;

    /* JADX INFO: renamed from: ۖ */
    public InterfaceC20790 f74768;

    /* JADX INFO: renamed from: ۘ */
    public final byte[] f74769;

    /* JADX INFO: renamed from: ۚ */
    public long f74770;

    /* JADX INFO: renamed from: ۜ */
    public final int f74771;

    /* JADX INFO: renamed from: ۡ */
    public boolean f74772;

    /* JADX INFO: renamed from: ۢ */
    public boolean f74773;

    /* JADX INFO: renamed from: ۧ */
    public int f74774;

    /* JADX INFO: renamed from: ܳ */
    public long f74775;

    /* JADX INFO: renamed from: ܺ */
    public int f74776;

    /* JADX INFO: renamed from: ܽ */
    public long f74777;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC23116 f74778;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC20790 f74779;

    /* JADX INFO: renamed from: ᩴ */
    public InterfaceC11402 f74780;

    /* JADX INFO: renamed from: ᩵ */
    public long f74781;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f74782;

    /* JADX INFO: renamed from: ᩻ */
    public int f74783;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    static {
        String str = C5792.f14228;
        Charset charset = StandardCharsets.UTF_8;
        f74762 = "#!AMR\n".getBytes(charset);
        f74763 = "#!AMR-WB\n".getBytes(charset);
    }

    public C23471(int i) {
        this.f74771 = (i & 2) != 0 ? i | 1 : i;
        this.f74769 = new byte[1];
        this.f74783 = -1;
        C21105 c21105 = new C21105();
        this.f74766 = c21105;
        this.f74779 = c21105;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        return m52211(interfaceC10375);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f74778 = interfaceC23116;
        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(0, 1);
        this.f74768 = interfaceC20790Mo5732;
        this.f74779 = interfaceC20790Mo5732;
        interfaceC23116.mo5734();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f74777 = 0L;
        this.f74774 = 0;
        this.f74767 = 0;
        this.f74781 = j2;
        InterfaceC11402 interfaceC11402 = this.f74780;
        if (interfaceC11402 instanceof C19448) {
            long jM44231 = ((C19448) interfaceC11402).m44231(j);
            this.f74770 = jM44231;
            if (Math.abs(this.f74781 - jM44231) < 20000) {
                return;
            }
            this.f74773 = true;
            this.f74779 = this.f74766;
            return;
        }
        if (j != 0 && (interfaceC11402 instanceof C11046)) {
            this.f74770 = ((C11046) interfaceC11402).m25453(j);
        } else {
            this.f74770 = 0L;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m52211(InterfaceC10375 interfaceC10375) {
        interfaceC10375.mo24036();
        byte[] bArr = f74762;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC10375.mo24031(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f74772 = false;
            interfaceC10375.mo24040(bArr.length);
            return true;
        }
        interfaceC10375.mo24036();
        byte[] bArr3 = f74763;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC10375.mo24031(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f74772 = true;
        interfaceC10375.mo24040(bArr3.length);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m52210(InterfaceC10375 interfaceC10375) throws C10998 {
        boolean z;
        interfaceC10375.mo24036();
        byte[] bArr = this.f74769;
        interfaceC10375.mo24031(0, 1, bArr);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C10998.m25387("Invalid padding bits for frame header " + ((int) b), (Throwable) null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f74772) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f74765[i] : f74764[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f74772 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C10998.m25387(sb.toString(), (Throwable) null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        int i;
        int i2;
        int iMo10498;
        int i3;
        C23877.m52958(this.f74768);
        String str = C5792.f14228;
        if (interfaceC10375.getPosition() == 0 && !m52211(interfaceC10375)) {
            throw C10998.m25387("Could not find AMR header.", (Throwable) null);
        }
        if (!this.f74782) {
            this.f74782 = true;
            boolean z = this.f74772;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z ? 16000 : 8000;
            int i5 = z ? f74765[8] : f74764[7];
            InterfaceC20790 interfaceC20790 = this.f74768;
            C3601 c3601 = new C3601();
            c3601.m6694(str2);
            c3601.m6697(str3);
            c3601.m6683(i5);
            c3601.m6704(1);
            c3601.m6688(i4);
            interfaceC20790.mo10503(c3601.m6672());
        }
        if (this.f74767 == 0) {
            try {
                int iM52210 = m52210(interfaceC10375);
                this.f74774 = iM52210;
                this.f74767 = iM52210;
                if (this.f74783 == -1) {
                    this.f74775 = interfaceC10375.getPosition();
                    this.f74783 = this.f74774;
                }
                if (this.f74783 == this.f74774) {
                    this.f74776++;
                }
                InterfaceC11402 interfaceC11402 = this.f74780;
                if (interfaceC11402 instanceof C19448) {
                    C19448 c19448 = (C19448) interfaceC11402;
                    long j = this.f74770 + this.f74777 + 20000;
                    long position = interfaceC10375.getPosition() + ((long) this.f74774);
                    if (!c19448.m44232(j)) {
                        c19448.m44230(j, position);
                    }
                    if (this.f74773 && Math.abs(this.f74781 - j) < 20000) {
                        this.f74773 = false;
                        this.f74779 = this.f74768;
                    }
                }
                iMo10498 = this.f74779.mo10498((InterfaceC11649) interfaceC10375, this.f74767, true);
                if (iMo10498 == -1) {
                    i = -1;
                } else {
                    i3 = this.f74767 - iMo10498;
                    this.f74767 = i3;
                    if (i3 <= 0) {
                        this.f74779.mo10502(this.f74770 + this.f74777, 1, this.f74774, 0, null);
                        this.f74777 += 20000;
                    }
                    i = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iMo10498 = this.f74779.mo10498((InterfaceC11649) interfaceC10375, this.f74767, true);
            if (iMo10498 == -1) {
                i = -1;
            } else {
                i3 = this.f74767 - iMo10498;
                this.f74767 = i3;
                if (i3 <= 0) {
                    this.f74779.mo10502(this.f74770 + this.f74777, 1, this.f74774, 0, null);
                    this.f74777 += 20000;
                }
                i = 0;
            }
        }
        long length = interfaceC10375.getLength();
        if (this.f74780 == null) {
            int i6 = this.f74771;
            if ((i6 & 4) != 0) {
                this.f74780 = new C19448(-9223372036854775807L, new long[]{this.f74775}, new long[]{0});
            } else if ((i6 & 1) == 0 || ((i2 = this.f74783) != -1 && i2 != this.f74774)) {
                this.f74780 = new C22131(-9223372036854775807L);
            } else if (this.f74776 >= 20 || i == -1) {
                C11046 c11046 = new C11046((int) ((((long) i2) * 8000000) / 20000), i2, length, this.f74775, (i6 & 2) != 0);
                this.f74780 = c11046;
                this.f74768.mo10501(c11046.mo8953());
            }
            InterfaceC11402 interfaceC11403 = this.f74780;
            if (interfaceC11403 != null) {
                this.f74778.mo5733(interfaceC11403);
            }
        }
        if (i == -1) {
            InterfaceC11402 interfaceC11404 = this.f74780;
            if (interfaceC11404 instanceof C19448) {
                long j2 = this.f74770 + this.f74777;
                ((C19448) interfaceC11404).m44233(j2);
                this.f74778.mo5733(this.f74780);
                this.f74768.mo10501(j2);
            }
        }
        return i;
    }
}
