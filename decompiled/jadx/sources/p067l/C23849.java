package p067l;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes.dex */
public final class C23849 implements DataInput {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18588 f75777;

    /* JADX INFO: renamed from: ᩹ */
    public final DataInputStream f75778;

    public C23849(DataInputStream dataInputStream, InterfaceC18588 interfaceC18588) {
        this.f75778 = dataInputStream;
        this.f75777 = interfaceC18588;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || ((long) i) + ((long) i2) > bArr.length) {
            throw new IndexOutOfBoundsException("Invalid checkpoint input range");
        }
        InterfaceC18588 interfaceC18588 = this.f75777;
        C14461.m33091(interfaceC18588);
        int i3 = i2 + i;
        while (i < i3) {
            int iMin = Math.min(65536, i3 - i);
            this.f75778.readFully(bArr, i, iMin);
            i += iMin;
            C14461.m33091(interfaceC18588);
        }
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) throws IOException {
        InterfaceC18588 interfaceC18588;
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        while (true) {
            interfaceC18588 = this.f75777;
            if (i2 >= i) {
                break;
            }
            C14461.m33091(interfaceC18588);
            int iSkipBytes = this.f75778.skipBytes(Math.min(65536, i - i2));
            if (iSkipBytes == 0) {
                break;
            }
            i2 += iSkipBytes;
        }
        C14461.m33091(interfaceC18588);
        return i2;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws C25008 {
        C14461.m33091(this.f75777);
        return this.f75778.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws C25008 {
        C14461.m33091(this.f75777);
        return this.f75778.readByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws C25008 {
        C14461.m33091(this.f75777);
        return this.f75778.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final short readShort() throws C25008 {
        C14461.m33091(this.f75777);
        return this.f75778.readShort();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws C25008 {
        C14461.m33091(this.f75777);
        return this.f75778.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final char readChar() throws C25008 {
        C14461.m33091(this.f75777);
        return this.f75778.readChar();
    }

    @Override // java.io.DataInput
    public final int readInt() {
        C14461.m33091(this.f75777);
        return this.f75778.readInt();
    }

    @Override // java.io.DataInput
    public final long readLong() throws C25008 {
        C14461.m33091(this.f75777);
        return this.f75778.readLong();
    }

    @Override // java.io.DataInput
    public final float readFloat() throws C25008 {
        C14461.m33091(this.f75777);
        return this.f75778.readFloat();
    }

    @Override // java.io.DataInput
    public final double readDouble() throws C25008 {
        C14461.m33091(this.f75777);
        return this.f75778.readDouble();
    }

    @Override // java.io.DataInput
    public final String readLine() throws IOException {
        InterfaceC18588 interfaceC18588 = this.f75777;
        C14461.m33091(interfaceC18588);
        String line = this.f75778.readLine();
        C14461.m33091(interfaceC18588);
        return line;
    }

    @Override // java.io.DataInput
    public final String readUTF() throws IOException {
        InterfaceC18588 interfaceC18588 = this.f75777;
        C14461.m33091(interfaceC18588);
        String utf = this.f75778.readUTF();
        C14461.m33091(interfaceC18588);
        return utf;
    }
}
