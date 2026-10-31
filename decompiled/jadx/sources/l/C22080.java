package l;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes.dex */
public final class C22080 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f71733;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC15023 f71735;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f71736;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f71732 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f71734 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f71731 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f71730 = -1;

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
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return C3030.m9278(interfaceC8424);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f71733 = interfaceC21830;
        this.f71736 = interfaceC21830.mo3429(0, 1);
        interfaceC21830.mo3431();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f71732 = j == 0 ? 0 : 4;
        InterfaceC15023 interfaceC15023 = this.f71735;
        if (interfaceC15023 != null) {
            interfaceC15023.mo21274(j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        int iM11003;
        C22632.m50632(this.f71736);
        String str = C3603.f11424;
        int i = this.f71732;
        if (i == 0) {
            C22632.m50634(interfaceC8424.getPosition() == 0);
            int i2 = this.f71731;
            if (i2 != -1) {
                interfaceC8424.mo22070(i2);
                this.f71732 = 4;
                return 0;
            }
            if (!C3030.m9278(interfaceC8424)) {
                throw C9080.m23440("Unsupported or unrecognized wav file type.", (Throwable) null);
            }
            interfaceC8424.mo22070((int) (interfaceC8424.mo22069() - interfaceC8424.getPosition()));
            this.f71732 = 1;
            return 0;
        }
        long jM41471 = -1;
        if (i == 1) {
            C17714 c17714 = new C17714(8);
            C4441 c4441M13192 = C4441.m13192(interfaceC8424, c17714);
            if (c4441M13192.f14191 != 1685272116) {
                interfaceC8424.mo22066();
            } else {
                interfaceC8424.mo22060(8);
                c17714.m41484(0);
                interfaceC8424.mo22061(0, 8, c17714.m41482());
                jM41471 = c17714.m41471();
                interfaceC8424.mo22070(((int) c4441M13192.f14192) + 8);
            }
            this.f71734 = jM41471;
            this.f71732 = 2;
            return 0;
        }
        if (i == 2) {
            C19964 c19964M9279 = C3030.m9279(interfaceC8424);
            int i3 = c19964M9279.f64655;
            if (i3 == 17) {
                this.f71735 = new C7969(this.f71733, this.f71736, c19964M9279);
            } else if (i3 == 6) {
                this.f71735 = new C21375(this.f71733, this.f71736, c19964M9279, "audio/g711-alaw", -1);
            } else if (i3 == 7) {
                this.f71735 = new C21375(this.f71733, this.f71736, c19964M9279, "audio/g711-mlaw", -1);
            } else {
                int i4 = c19964M9279.f64650;
                if (i3 == 1) {
                    iM11003 = C3603.m11003(i4, ByteOrder.LITTLE_ENDIAN);
                } else {
                    if (i3 != 3) {
                        if (i3 == 65534) {
                            iM11003 = C3603.m11003(i4, ByteOrder.LITTLE_ENDIAN);
                        }
                    } else if (i4 == 32) {
                        iM11003 = 4;
                    }
                    iM11003 = 0;
                }
                if (iM11003 == 0) {
                    throw C9080.m23441("Unsupported WAV format type: " + i3);
                }
                this.f71735 = new C21375(this.f71733, this.f71736, c19964M9279, "audio/raw", iM11003);
            }
            this.f71732 = 3;
            return 0;
        }
        if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException();
            }
            C22632.m50634(this.f71730 != -1);
            long position = this.f71730 - interfaceC8424.getPosition();
            InterfaceC15023 interfaceC15023 = this.f71735;
            interfaceC15023.getClass();
            return interfaceC15023.mo21275(interfaceC8424, position) ? -1 : 0;
        }
        Pair pairM9280 = C3030.m9280(interfaceC8424);
        this.f71731 = ((Long) pairM9280.first).intValue();
        long jLongValue = ((Long) pairM9280.second).longValue();
        long j = this.f71734;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.f71730 = ((long) this.f71731) + jLongValue;
        long length = interfaceC8424.getLength();
        if (length != -1 && this.f71730 > length) {
            C19956.m46037("Data exceeds input length: " + this.f71730 + ", " + length);
            this.f71730 = length;
        }
        InterfaceC15023 interfaceC15024 = this.f71735;
        interfaceC15024.getClass();
        interfaceC15024.mo21273(this.f71731, this.f71730);
        this.f71732 = 4;
        return 0;
    }
}
