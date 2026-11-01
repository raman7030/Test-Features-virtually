package p067l;

import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۠᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 4QY */
/* JADX INFO: loaded from: classes4.dex */
public final class C10366 extends AbstractC7684 {

    /* JADX INFO: renamed from: ܽ */
    public final DataInputStream f28695;

    public C10366(InputStream inputStream) throws C23856 {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f28695 = dataInputStream;
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new C23856();
        }
        this.f20150 = dataInputStream.readInt();
        this.f20151 = -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m23996() {
        return this.f20150 == 0;
    }

    @Override // p067l.AbstractC7684
    /* JADX INFO: renamed from: ֫ */
    public final void mo7010() {
        if ((this.f20151 & (-16777216)) == 0) {
            this.f20150 = (this.f20150 << 8) | this.f28695.readUnsignedByte();
            this.f20151 <<= 8;
        }
    }
}
