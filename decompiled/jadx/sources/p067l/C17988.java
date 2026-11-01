package p067l;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܽۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8S5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17988 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ۜ */
    public C9133 f53725;

    /* JADX INFO: renamed from: ۧ */
    public boolean f53728;

    /* JADX INFO: renamed from: ܳ */
    public long f53729;

    /* JADX INFO: renamed from: ܽ */
    public boolean f53730;

    /* JADX INFO: renamed from: ܿ */
    public boolean f53731;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f53732;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC23116 f53734;

    /* JADX INFO: renamed from: ۡ */
    public final C11157 f53726 = new C11157(0);

    /* JADX INFO: renamed from: ᩷ */
    public final C19203 f53733 = new C19203(4096);

    /* JADX INFO: renamed from: ۢ */
    public final SparseArray f53727 = new SparseArray();

    /* JADX INFO: renamed from: ֫ */
    public final C3907 f53724 = new C3907();

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

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C17750 c17750 = (C17750) interfaceC10375;
        c17750.mo24038(false, 0, 14, bArr);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c17750.mo24037(bArr[13] & 7, false);
            c17750.mo24038(false, 0, 3, bArr);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f53734 = interfaceC23116;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        C11157 c11157 = this.f53726;
        int i = 0;
        boolean z = c11157.m25736() == -9223372036854775807L;
        if (!z) {
            long jM25731 = c11157.m25731();
            z = (jM25731 == -9223372036854775807L || jM25731 == 0 || jM25731 == j2) ? false : true;
        }
        if (z) {
            c11157.m25738(j2);
        }
        C9133 c9133 = this.f53725;
        if (c9133 != null) {
            c9133.m55178(j2);
        }
        while (true) {
            SparseArray sparseArray = this.f53727;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C12625) sparseArray.valueAt(i)).m29034();
            i++;
        }
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) {
        InterfaceC17178 c5780;
        C23877.m52958(this.f53734);
        long length = interfaceC10375.getLength();
        C3907 c3907 = this.f53724;
        if (length != -1 && !c3907.m7730()) {
            return c3907.m7727(interfaceC10375, c24812);
        }
        if (!this.f53731) {
            this.f53731 = true;
            if (c3907.m7728() != -9223372036854775807L) {
                C9133 c9133 = new C9133(c3907.m7729(), c3907.m7728(), length);
                this.f53725 = c9133;
                this.f53734.mo5733(c9133.m55177());
            } else {
                this.f53734.mo5733(new C22131(c3907.m7728()));
            }
        }
        C9133 c9134 = this.f53725;
        if (c9134 != null && c9134.m55179()) {
            return this.f53725.m55176(interfaceC10375, c24812);
        }
        interfaceC10375.mo24036();
        long jMo24039 = length != -1 ? length - interfaceC10375.mo24039() : -1L;
        if (jMo24039 != -1 && jMo24039 < 4) {
            return -1;
        }
        C19203 c19203 = this.f53733;
        if (!interfaceC10375.mo24038(true, 0, 4, c19203.m43728())) {
            return -1;
        }
        c19203.m43730(0);
        int iM43739 = c19203.m43739();
        if (iM43739 == 441) {
            return -1;
        }
        if (iM43739 == 442) {
            interfaceC10375.mo24031(0, 10, c19203.m43728());
            c19203.m43730(9);
            interfaceC10375.mo24040((c19203.m43702() & 7) + 14);
            return 0;
        }
        if (iM43739 == 443) {
            interfaceC10375.mo24031(0, 2, c19203.m43728());
            c19203.m43730(0);
            interfaceC10375.mo24040(c19203.m43710() + 6);
            return 0;
        }
        if (((iM43739 & (-256)) >> 8) != 1) {
            interfaceC10375.mo24040(1);
            return 0;
        }
        int i = iM43739 & 255;
        SparseArray sparseArray = this.f53727;
        C12625 c12625 = (C12625) sparseArray.get(i);
        if (!this.f53728) {
            if (c12625 == null) {
                if (i == 189) {
                    c5780 = new C19191("video/mp2p");
                    this.f53730 = true;
                    this.f53729 = interfaceC10375.getPosition();
                } else if ((iM43739 & BERTags.FLAGS) == 192) {
                    c5780 = new C6451(null, 0, "video/mp2p");
                    this.f53730 = true;
                    this.f53729 = interfaceC10375.getPosition();
                } else if ((iM43739 & 240) == 224) {
                    c5780 = new C5780(null, "video/mp2p");
                    this.f53732 = true;
                    this.f53729 = interfaceC10375.getPosition();
                } else {
                    c5780 = null;
                }
                if (c5780 != null) {
                    c5780.mo3398(this.f53734, new C20672(i, 256));
                    c12625 = new C12625(c5780, this.f53726);
                    sparseArray.put(i, c12625);
                }
            }
            if (interfaceC10375.getPosition() > ((this.f53730 && this.f53732) ? this.f53729 + 8192 : 1048576L)) {
                this.f53728 = true;
                this.f53734.mo5734();
            }
        }
        interfaceC10375.mo24031(0, 2, c19203.m43728());
        c19203.m43730(0);
        int iM43710 = c19203.m43710() + 6;
        if (c12625 == null) {
            interfaceC10375.mo24040(iM43710);
            return 0;
        }
        c19203.m43727(iM43710);
        interfaceC10375.readFully(c19203.m43728(), 0, iM43710);
        c19203.m43730(6);
        c12625.m29035(c19203);
        c19203.m43732(c19203.m43718());
        return 0;
    }
}
