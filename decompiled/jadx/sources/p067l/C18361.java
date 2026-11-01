package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88N4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18361 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public int f54826;

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC11657 f54827;

    /* JADX INFO: renamed from: ۢ */
    public InterfaceC20790 f54828;

    /* JADX INFO: renamed from: ᩻ */
    public byte[] f54835 = C5792.f14227;

    /* JADX INFO: renamed from: ᩳ */
    public final C19203 f54833 = new C19203();

    /* JADX INFO: renamed from: ۧ */
    public final C10307 f54829 = null;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f54831 = new ArrayList();

    /* JADX INFO: renamed from: ܳ */
    public int f54830 = 0;

    /* JADX INFO: renamed from: ᩷ */
    public long[] f54834 = C5792.f14224;

    /* JADX INFO: renamed from: ܿ */
    public long f54832 = -9223372036854775807L;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        return true;
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

    public C18361(InterfaceC11657 interfaceC11657) {
        this.f54827 = interfaceC11657;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        C23877.m52960(this.f54830 == 0);
        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(0, 3);
        this.f54828 = interfaceC20790Mo5732;
        C10307 c10307 = this.f54829;
        if (c10307 != null) {
            interfaceC20790Mo5732.mo10503(c10307);
            interfaceC23116.mo5734();
            interfaceC23116.mo5733(new C19448(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f54830 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: RuntimeException -> 0x00d2, TryCatch #0 {RuntimeException -> 0x00d2, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b4, B:41:0x00ba, B:42:0x00cb, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008a A[Catch: RuntimeException -> 0x00d2, TryCatch #0 {RuntimeException -> 0x00d2, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b4, B:41:0x00ba, B:42:0x00cb, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba A[Catch: RuntimeException -> 0x00d2, LOOP:1: B:39:0x00b4->B:41:0x00ba, LOOP_END, TryCatch #0 {RuntimeException -> 0x00d2, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b4, B:41:0x00ba, B:42:0x00cb, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x007d A[EXC_TOP_SPLITTER, PHI: r15
      0x007d: PHI (r15v3 int) = (r15v4 int), (r15v5 int) binds: [B:32:0x007b, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        int i;
        long j;
        C22386 c22386M50238;
        int i2;
        int i3 = this.f54830;
        C23877.m52960((i3 == 0 || i3 == 5) ? false : true);
        if (this.f54830 == 1) {
            int iM34548 = interfaceC10375.getLength() != -1 ? C15129.m34548(interfaceC10375.getLength()) : 1024;
            if (iM34548 > this.f54835.length) {
                this.f54835 = new byte[iM34548];
            }
            this.f54826 = 0;
            this.f54830 = 2;
        }
        int i4 = this.f54830;
        ArrayList arrayList = this.f54831;
        if (i4 == 2) {
            byte[] bArr = this.f54835;
            if (bArr.length == this.f54826) {
                this.f54835 = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f54835;
            int i5 = this.f54826;
            int i6 = interfaceC10375.read(bArr2, i5, bArr2.length - i5);
            if (i6 != -1) {
                this.f54826 += i6;
            }
            long length = interfaceC10375.getLength();
            if (length != -1) {
                i = 0;
                if (this.f54826 == length) {
                    try {
                        j = this.f54832;
                        if (j != -9223372036854775807L) {
                            c22386M50238 = C22386.m50237(j);
                        } else {
                            c22386M50238 = C22386.m50238();
                        }
                        this.f54827.mo8744(this.f54835, 0, this.f54826, c22386M50238, new C4444(2, this));
                        Collections.sort(arrayList);
                        this.f54834 = new long[arrayList.size()];
                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                            this.f54834[i2] = ((C12998) arrayList.get(i2)).f36573;
                        }
                        this.f54835 = C5792.f14227;
                        this.f54830 = 4;
                    } catch (RuntimeException e) {
                        throw C10998.m25387("SubtitleParser failed.", e);
                    }
                }
            } else {
                i = 0;
            }
            if (i6 == -1) {
                j = this.f54832;
                if (j != -9223372036854775807L) {
                    c22386M50238 = C22386.m50237(j);
                } else {
                    c22386M50238 = C22386.m50238();
                }
                this.f54827.mo8744(this.f54835, 0, this.f54826, c22386M50238, new C4444(2, this));
                Collections.sort(arrayList);
                this.f54834 = new long[arrayList.size()];
                while (i2 < arrayList.size()) {
                    this.f54834[i2] = ((C12998) arrayList.get(i2)).f36573;
                }
                this.f54835 = C5792.f14227;
                this.f54830 = 4;
            }
        } else {
            i = 0;
        }
        if (this.f54830 == 3) {
            if (interfaceC10375.mo24034(interfaceC10375.getLength() != -1 ? C15129.m34548(interfaceC10375.getLength()) : 1024) == -1) {
                long j2 = this.f54832;
                for (int iM13012 = j2 == -9223372036854775807L ? 0 : C5792.m13012(this.f54834, j2, true); iM13012 < arrayList.size(); iM13012++) {
                    m41810((C12998) arrayList.get(iM13012));
                }
                this.f54830 = 4;
            }
        }
        if (this.f54830 == 4) {
            return -1;
        }
        return i;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        int i = this.f54830;
        C23877.m52960((i == 0 || i == 5) ? false : true);
        this.f54832 = j2;
        if (this.f54830 == 2) {
            this.f54830 = 1;
        }
        if (this.f54830 == 4) {
            this.f54830 = 3;
        }
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
        if (this.f54830 == 5) {
            return;
        }
        this.f54827.reset();
        this.f54830 = 5;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41811(C18361 c18361, C14596 c14596) {
        C12998 c12998 = new C12998(c14596.f41683, C5209.m11175(c14596.f41681, c14596.f41680));
        c18361.f54831.add(c12998);
        long j = c18361.f54832;
        if (j == -9223372036854775807L || c14596.f41682 >= j) {
            c18361.m41810(c12998);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41810(C12998 c12998) {
        C23877.m52958(this.f54828);
        int length = c12998.f36572.length;
        byte[] bArr = c12998.f36572;
        C19203 c19203 = this.f54833;
        c19203.getClass();
        c19203.m43708(bArr.length, bArr);
        this.f54828.mo10500(length, c19203);
        this.f54828.mo10502(c12998.f36573, 1, length, 0, null);
    }
}
