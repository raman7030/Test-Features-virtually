package l;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EY */
/* JADX INFO: loaded from: classes5.dex */
public class C17135 extends AbstractC10494 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Set f52490;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC6552 f52496;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f52495 = 5;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f52494 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f52492 = {16, 0, 0, 0};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public short f52493 = 16;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public short f52489 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52491 = 0;

    /* JADX INFO: renamed from: ֫ */
    public void mo3260(C2319 c2319) throws IOException {
        if (this.f52496 != null) {
            if (this.f52490 == null) {
                throw new IllegalStateException("Invalid PFC flag(s): " + this.f52490);
            }
            c2319.m7577(this.f52495);
            c2319.m7577(this.f52494);
            c2319.m7577((byte) this.f52496.getValue());
            c2319.m7577((byte) C15262.m36277(this.f52490));
            c2319.m7580(this.f52492);
            c2319.m7582(this.f52493);
            c2319.m7582(0);
            c2319.m7581(this.f52491);
            return;
        }
        throw new IllegalStateException("Invalid PDU type: " + this.f52496);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC6552 m40165() {
        return this.f52496;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Set m40166() {
        return this.f52490;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m40163() {
        return this.f52493;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m40159() {
        return this.f52489;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40161(EnumC6552 enumC6552) {
        this.f52496 = enumC6552;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40160(EnumSet enumSet) {
        this.f52490 = enumSet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40162(short s) {
        this.f52493 = s;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40164(int i) {
        this.f52491 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14701(C15723 c15723) throws IOException {
        this.f52495 = c15723.m37105();
        byte bM37105 = c15723.m37105();
        this.f52494 = bM37105;
        if (5 != this.f52495 || bM37105 != 0) {
            throw new IOException(String.format("Version mismatch: %d.%d != 5.0", Byte.valueOf(this.f52495), Byte.valueOf(this.f52494)));
        }
        EnumC6552 enumC6552 = (EnumC6552) C15262.m36279(c15723.m37105(), EnumC6552.class, null);
        if (enumC6552 != null) {
            this.f52496 = enumC6552;
            this.f52490 = C15262.m36278(c15723.m37105(), EnumC20664.class);
            byte[] bArr = new byte[4];
            c15723.m37109(bArr);
            if (bArr[0] != 16) {
                throw new IOException(String.format("Integer and Character representation mismatch: %d", Byte.valueOf(bArr[0])));
            }
            if (bArr[1] == 0) {
                this.f52492 = bArr;
                this.f52493 = c15723.m37113();
                this.f52489 = c15723.m37113();
                this.f52491 = c15723.m37111();
                return;
            }
            throw new IOException(String.format("Floating-Point representation mismatch: %d", Byte.valueOf(bArr[1])));
        }
        throw new IOException(String.format("PDU type invalid: %d", enumC6552));
    }
}
