package l;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܽۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8S5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16435 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7118 f50546;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50549;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f50550;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f50551;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f50552;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f50553;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f50555;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C9248 f50547 = new C9248(0);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17714 f50554 = new C17714(4096);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final SparseArray f50548 = new SparseArray();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1619 f50545 = new C1619();

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
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

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C16184 c16184 = (C16184) interfaceC8424;
        c16184.mo22068(false, 0, 14, bArr);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c16184.mo22067(bArr[13] & 7, false);
            c16184.mo22068(false, 0, 3, bArr);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f50555 = interfaceC21830;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        C9248 c9248 = this.f50547;
        int i = 0;
        boolean z = c9248.m23735() == -9223372036854775807L;
        if (!z) {
            long jM23730 = c9248.m23730();
            z = (jM23730 == -9223372036854775807L || jM23730 == 0 || jM23730 == j2) ? false : true;
        }
        if (z) {
            c9248.m23737(j2);
        }
        C7118 c7118 = this.f50546;
        if (c7118 != null) {
            c7118.m52772(j2);
        }
        while (true) {
            SparseArray sparseArray = this.f50548;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C10792) sparseArray.valueAt(i)).m26989();
            i++;
        }
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        InterfaceC15583 c3590;
        C22632.m50632(this.f50555);
        long length = interfaceC8424.getLength();
        C1619 c1619 = this.f50545;
        if (length != -1 && !c1619.m5500()) {
            return c1619.m5497(interfaceC8424, c23615);
        }
        if (!this.f50552) {
            this.f50552 = true;
            if (c1619.m5498() != -9223372036854775807L) {
                C7118 c7118 = new C7118(c1619.m5499(), c1619.m5498(), length);
                this.f50546 = c7118;
                this.f50555.mo3430(c7118.m52771());
            } else {
                this.f50555.mo3430(new C20794(c1619.m5498()));
            }
        }
        C7118 c7119 = this.f50546;
        if (c7119 != null && c7119.m52773()) {
            return this.f50546.m52770(interfaceC8424, c23615);
        }
        interfaceC8424.mo22066();
        long jMo22069 = length != -1 ? length - interfaceC8424.mo22069() : -1L;
        if (jMo22069 != -1 && jMo22069 < 4) {
            return -1;
        }
        C17714 c17714 = this.f50554;
        if (!interfaceC8424.mo22068(true, 0, 4, c17714.m41482())) {
            return -1;
        }
        c17714.m41484(0);
        int iM41493 = c17714.m41493();
        if (iM41493 == 441) {
            return -1;
        }
        if (iM41493 == 442) {
            interfaceC8424.mo22061(0, 10, c17714.m41482());
            c17714.m41484(9);
            interfaceC8424.mo22070((c17714.m41456() & 7) + 14);
            return 0;
        }
        if (iM41493 == 443) {
            interfaceC8424.mo22061(0, 2, c17714.m41482());
            c17714.m41484(0);
            interfaceC8424.mo22070(c17714.m41464() + 6);
            return 0;
        }
        if (((iM41493 & (-256)) >> 8) != 1) {
            interfaceC8424.mo22070(1);
            return 0;
        }
        int i = iM41493 & 255;
        SparseArray sparseArray = this.f50548;
        C10792 c10792 = (C10792) sparseArray.get(i);
        if (!this.f50549) {
            if (c10792 == null) {
                if (i == 189) {
                    c3590 = new C17701("video/mp2p");
                    this.f50551 = true;
                    this.f50550 = interfaceC8424.getPosition();
                } else if ((iM41493 & BERTags.FLAGS) == 192) {
                    c3590 = new C4296(null, 0, "video/mp2p");
                    this.f50551 = true;
                    this.f50550 = interfaceC8424.getPosition();
                } else if ((iM41493 & 240) == 224) {
                    c3590 = new C3590(null, "video/mp2p");
                    this.f50553 = true;
                    this.f50550 = interfaceC8424.getPosition();
                } else {
                    c3590 = null;
                }
                if (c3590 != null) {
                    c3590.mo1003(this.f50555, new C19259(i, 256));
                    c10792 = new C10792(c3590, this.f50547);
                    sparseArray.put(i, c10792);
                }
            }
            if (interfaceC8424.getPosition() > ((this.f50551 && this.f50553) ? this.f50550 + 8192 : 1048576L)) {
                this.f50549 = true;
                this.f50555.mo3431();
            }
        }
        interfaceC8424.mo22061(0, 2, c17714.m41482());
        c17714.m41484(0);
        int iM41464 = c17714.m41464() + 6;
        if (c10792 == null) {
            interfaceC8424.mo22070(iM41464);
            return 0;
        }
        c17714.m41481(iM41464);
        interfaceC8424.readFully(c17714.m41482(), 0, iM41464);
        c17714.m41484(6);
        c10792.m26990(c17714);
        c17714.m41486(c17714.m41472());
        return 0;
    }
}
