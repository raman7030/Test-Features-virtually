package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88N4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16827 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f51646;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9773 f51647;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f51648;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f51655 = C3603.f11423;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17714 f51653 = new C17714();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8353 f51649 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51651 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f51650 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long[] f51654 = C3603.f11420;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f51652 = -9223372036854775807L;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return true;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    public C16827(InterfaceC9773 interfaceC9773) {
        this.f51647 = interfaceC9773;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        C22632.m50634(this.f51650 == 0);
        InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(0, 3);
        this.f51648 = interfaceC19383Mo3429;
        C8353 c8353 = this.f51649;
        if (c8353 != null) {
            interfaceC19383Mo3429.mo8456(c8353);
            interfaceC21830.mo3431();
            interfaceC21830.mo3430(new C17971(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f51650 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: RuntimeException -> 0x00d2, TryCatch #0 {RuntimeException -> 0x00d2, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b4, B:41:0x00ba, B:42:0x00cb, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008a A[Catch: RuntimeException -> 0x00d2, TryCatch #0 {RuntimeException -> 0x00d2, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b4, B:41:0x00ba, B:42:0x00cb, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba A[Catch: RuntimeException -> 0x00d2, LOOP:1: B:39:0x00b4->B:41:0x00ba, LOOP_END, TryCatch #0 {RuntimeException -> 0x00d2, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b4, B:41:0x00ba, B:42:0x00cb, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x007d A[EXC_TOP_SPLITTER, PHI: r15
      0x007d: PHI (r15v3 int) = (r15v4 int), (r15v5 int) binds: [B:32:0x007b, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        int i;
        long j;
        C21062 c21062M47908;
        int i2;
        int i3 = this.f51650;
        C22632.m50634((i3 == 0 || i3 == 5) ? false : true);
        if (this.f51650 == 1) {
            int iM32446 = interfaceC8424.getLength() != -1 ? C13426.m32446(interfaceC8424.getLength()) : 1024;
            if (iM32446 > this.f51655.length) {
                this.f51655 = new byte[iM32446];
            }
            this.f51646 = 0;
            this.f51650 = 2;
        }
        int i4 = this.f51650;
        ArrayList arrayList = this.f51651;
        if (i4 == 2) {
            byte[] bArr = this.f51655;
            if (bArr.length == this.f51646) {
                this.f51655 = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f51655;
            int i5 = this.f51646;
            int i6 = interfaceC8424.read(bArr2, i5, bArr2.length - i5);
            if (i6 != -1) {
                this.f51646 += i6;
            }
            long length = interfaceC8424.getLength();
            if (length != -1) {
                i = 0;
                if (this.f51646 == length) {
                    try {
                        j = this.f51652;
                        if (j != -9223372036854775807L) {
                            c21062M47908 = C21062.m47907(j);
                        } else {
                            c21062M47908 = C21062.m47908();
                        }
                        this.f51647.mo6618(this.f51655, 0, this.f51646, c21062M47908, new C2184(2, this));
                        Collections.sort(arrayList);
                        this.f51654 = new long[arrayList.size()];
                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                            this.f51654[i2] = ((C11184) arrayList.get(i2)).f33573;
                        }
                        this.f51655 = C3603.f11423;
                        this.f51650 = 4;
                    } catch (RuntimeException e) {
                        throw C9080.m23440("SubtitleParser failed.", e);
                    }
                }
            } else {
                i = 0;
            }
            if (i6 == -1) {
                j = this.f51652;
                if (j != -9223372036854775807L) {
                    c21062M47908 = C21062.m47907(j);
                } else {
                    c21062M47908 = C21062.m47908();
                }
                this.f51647.mo6618(this.f51655, 0, this.f51646, c21062M47908, new C2184(2, this));
                Collections.sort(arrayList);
                this.f51654 = new long[arrayList.size()];
                while (i2 < arrayList.size()) {
                    this.f51654[i2] = ((C11184) arrayList.get(i2)).f33573;
                }
                this.f51655 = C3603.f11423;
                this.f51650 = 4;
            }
        } else {
            i = 0;
        }
        if (this.f51650 == 3) {
            if (interfaceC8424.mo22064(interfaceC8424.getLength() != -1 ? C13426.m32446(interfaceC8424.getLength()) : 1024) == -1) {
                long j2 = this.f51652;
                for (int iM11036 = j2 == -9223372036854775807L ? 0 : C3603.m11036(this.f51654, j2, true); iM11036 < arrayList.size(); iM11036++) {
                    m39574((C11184) arrayList.get(iM11036));
                }
                this.f51650 = 4;
            }
        }
        if (this.f51650 == 4) {
            return -1;
        }
        return i;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        int i = this.f51650;
        C22632.m50634((i == 0 || i == 5) ? false : true);
        this.f51652 = j2;
        if (this.f51650 == 2) {
            this.f51650 = 1;
        }
        if (this.f51650 == 4) {
            this.f51650 = 3;
        }
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
        if (this.f51650 == 5) {
            return;
        }
        this.f51647.reset();
        this.f51650 = 5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39575(C16827 c16827, C12866 c12866) {
        C11184 c11184 = new C11184(c12866.f38639, C2989.m9124(c12866.f38637, c12866.f38636));
        c16827.f51651.add(c11184);
        long j = c16827.f51652;
        if (j == -9223372036854775807L || c12866.f38638 >= j) {
            c16827.m39574(c11184);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39574(C11184 c11184) {
        C22632.m50632(this.f51648);
        int length = c11184.f33572.length;
        byte[] bArr = c11184.f33572;
        C17714 c17714 = this.f51653;
        c17714.getClass();
        c17714.m41462(bArr.length, bArr);
        this.f51648.mo8453(length, c17714);
        this.f51648.mo8455(c11184.f33573, 1, length, 0, null);
    }
}
