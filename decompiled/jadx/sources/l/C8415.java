package l;

import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۠᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 4QY */
/* JADX INFO: loaded from: classes4.dex */
public final class C8415 extends AbstractC5593 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final DataInputStream f25781;

    public C8415(InputStream inputStream) throws C22609 {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f25781 = dataInputStream;
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new C22609();
        }
        this.f17306 = dataInputStream.readInt();
        this.f17307 = -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m22026() {
        return this.f17306 == 0;
    }

    @Override // l.AbstractC5593
    /* JADX INFO: renamed from: ֫ */
    public final void mo4772() {
        if ((this.f17307 & (-16777216)) == 0) {
            this.f17306 = (this.f17306 << 8) | this.f25781.readUnsignedByte();
            this.f17307 <<= 8;
        }
    }
}
