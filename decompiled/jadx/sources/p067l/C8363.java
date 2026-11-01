package p067l;

import java.nio.ByteOrder;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۛ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08IU */
/* JADX INFO: loaded from: classes2.dex */
public final class C8363 {

    /* JADX INFO: renamed from: ֫ */
    public final int f22398;

    /* JADX INFO: renamed from: ۜ */
    public final int f22399;

    /* JADX INFO: renamed from: ۡ */
    public final C12387 f22400;

    /* JADX INFO: renamed from: ۢ */
    public final int f22401;

    /* JADX INFO: renamed from: ۧ */
    public final int f22402;

    /* JADX INFO: renamed from: ܳ */
    public final C25079 f22403;

    /* JADX INFO: renamed from: ܺ */
    public final long f22404;

    /* JADX INFO: renamed from: ܽ */
    public final int f22405;

    /* JADX INFO: renamed from: ܿ */
    public final int f22406;

    /* JADX INFO: renamed from: ᩳ */
    public final int f22407;

    /* JADX INFO: renamed from: ᩷ */
    public final int f22408;

    /* JADX INFO: renamed from: ᩻ */
    public final int f22409;

    /* JADX INFO: renamed from: ֫ */
    public static int m19373(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m19374(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public C8363(byte[] bArr, int i) {
        C17861 c17861 = new C17861(bArr, bArr.length);
        c17861.m40569(i * 8);
        this.f22409 = c17861.m40558(16);
        this.f22407 = c17861.m40558(16);
        this.f22399 = c17861.m40558(24);
        this.f22406 = c17861.m40558(24);
        int iM40558 = c17861.m40558(20);
        this.f22408 = iM40558;
        this.f22401 = m19374(iM40558);
        this.f22405 = c17861.m40558(3) + 1;
        int iM40559 = c17861.m40558(5) + 1;
        this.f22398 = iM40559;
        this.f22402 = m19373(iM40559);
        this.f22404 = c17861.m40564(36);
        this.f22400 = null;
        this.f22403 = null;
    }

    public C8363(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C12387 c12387, C25079 c25079) {
        this.f22409 = i;
        this.f22407 = i2;
        this.f22399 = i3;
        this.f22406 = i4;
        this.f22408 = i5;
        this.f22401 = m19374(i5);
        this.f22405 = i6;
        this.f22398 = i7;
        this.f22402 = m19373(i7);
        this.f22404 = j;
        this.f22400 = c12387;
        this.f22403 = c25079;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m19375() {
        long j = this.f22404;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f22408);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10307 m19378(byte[] bArr, C25079 c25079) {
        bArr[4] = GCMSIVBlockCipher.MASK;
        int i = this.f22406;
        if (i <= 0) {
            i = -1;
        }
        C25079 c250710 = this.f22403;
        if (c250710 != null) {
            c25079 = c250710.m55051(c25079);
        }
        C3601 c3601 = new C3601();
        c3601.m6697("audio/flac");
        c3601.m6683(i);
        c3601.m6704(this.f22405);
        c3601.m6688(this.f22408);
        String str = C5792.f14228;
        c3601.m6707(C5792.m12979(this.f22398, ByteOrder.LITTLE_ENDIAN));
        c3601.m6678(Collections.singletonList(bArr));
        c3601.m6681(c25079);
        return c3601.m6672();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8363 m19377(C12387 c12387) {
        return new C8363(this.f22409, this.f22407, this.f22399, this.f22406, this.f22408, this.f22405, this.f22398, this.f22404, c12387, this.f22403);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C8363 m19379(List list) {
        C25079 c25079M51004 = C22801.m51004(list);
        C25079 c25079 = this.f22403;
        if (c25079 != null) {
            c25079M51004 = c25079.m55051(c25079M51004);
        }
        C25079 c250710 = c25079M51004;
        return new C8363(this.f22409, this.f22407, this.f22399, this.f22406, this.f22408, this.f22405, this.f22398, this.f22404, this.f22400, c250710);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8363 m19376(List list) {
        C25079 c25079 = new C25079(list);
        C25079 c250710 = this.f22403;
        if (c250710 != null) {
            c25079 = c250710.m55051(c25079);
        }
        C25079 c250711 = c25079;
        return new C8363(this.f22409, this.f22407, this.f22399, this.f22406, this.f22408, this.f22405, this.f22398, this.f22404, this.f22400, c250711);
    }
}
