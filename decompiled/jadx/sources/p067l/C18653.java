package p067l;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EY */
/* JADX INFO: loaded from: classes5.dex */
public class C18653 extends AbstractC12342 {

    /* JADX INFO: renamed from: ۜ */
    public Set f55673;

    /* JADX INFO: renamed from: ᩻ */
    public EnumC8595 f55679;

    /* JADX INFO: renamed from: ᩳ */
    public byte f55678 = 5;

    /* JADX INFO: renamed from: ܿ */
    public byte f55677 = 0;

    /* JADX INFO: renamed from: ܳ */
    public byte[] f55675 = {16, 0, 0, 0};

    /* JADX INFO: renamed from: ܽ */
    public short f55676 = 16;

    /* JADX INFO: renamed from: ֫ */
    public short f55672 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f55674 = 0;

    /* JADX INFO: renamed from: ֫ */
    public void mo5579(C4572 c4572) throws IOException {
        if (this.f55679 != null) {
            if (this.f55673 == null) {
                throw new IllegalStateException("Invalid PFC flag(s): " + this.f55673);
            }
            c4572.m9647(this.f55678);
            c4572.m9647(this.f55677);
            c4572.m9647((byte) this.f55679.getValue());
            c4572.m9647((byte) C16873.m38438(this.f55673));
            c4572.m9650(this.f55675);
            c4572.m9652(this.f55676);
            c4572.m9652(0);
            c4572.m9651(this.f55674);
            return;
        }
        throw new IllegalStateException("Invalid PDU type: " + this.f55679);
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC8595 m42410() {
        return this.f55679;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Set m42411() {
        return this.f55673;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m42408() {
        return this.f55676;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m42404() {
        return this.f55672;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42406(EnumC8595 enumC8595) {
        this.f55679 = enumC8595;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42405(EnumSet enumSet) {
        this.f55673 = enumSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42407(short s) {
        this.f55676 = s;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42409(int i) {
        this.f55674 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo16609(C17311 c17311) throws IOException {
        this.f55678 = c17311.m39274();
        byte bM39274 = c17311.m39274();
        this.f55677 = bM39274;
        if (5 != this.f55678 || bM39274 != 0) {
            throw new IOException(String.format("Version mismatch: %d.%d != 5.0", Byte.valueOf(this.f55678), Byte.valueOf(this.f55677)));
        }
        EnumC8595 enumC8595 = (EnumC8595) C16873.m38440(c17311.m39274(), EnumC8595.class, null);
        if (enumC8595 != null) {
            this.f55679 = enumC8595;
            this.f55673 = C16873.m38439(c17311.m39274(), EnumC22007.class);
            byte[] bArr = new byte[4];
            c17311.m39278(bArr);
            if (bArr[0] != 16) {
                throw new IOException(String.format("Integer and Character representation mismatch: %d", Byte.valueOf(bArr[0])));
            }
            if (bArr[1] == 0) {
                this.f55675 = bArr;
                this.f55676 = c17311.m39282();
                this.f55672 = c17311.m39282();
                this.f55674 = c17311.m39280();
                return;
            }
            throw new IOException(String.format("Floating-Point representation mismatch: %d", Byte.valueOf(bArr[1])));
        }
        throw new IOException(String.format("PDU type invalid: %d", enumC8595));
    }
}
