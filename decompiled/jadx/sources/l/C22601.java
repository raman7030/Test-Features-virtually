package l;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes.dex */
public final class C22601 implements DataInput {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f73050;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final DataInputStream f73051;

    public C22601(DataInputStream dataInputStream, InterfaceC17066 interfaceC17066) {
        this.f73051 = dataInputStream;
        this.f73050 = interfaceC17066;
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
        InterfaceC17066 interfaceC17066 = this.f73050;
        C12723.m31011(interfaceC17066);
        int i3 = i2 + i;
        while (i < i3) {
            int iMin = Math.min(65536, i3 - i);
            this.f73051.readFully(bArr, i, iMin);
            i += iMin;
            C12723.m31011(interfaceC17066);
        }
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) throws IOException {
        InterfaceC17066 interfaceC17066;
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        while (true) {
            interfaceC17066 = this.f73050;
            if (i2 >= i) {
                break;
            }
            C12723.m31011(interfaceC17066);
            int iSkipBytes = this.f73051.skipBytes(Math.min(65536, i - i2));
            if (iSkipBytes == 0) {
                break;
            }
            i2 += iSkipBytes;
        }
        C12723.m31011(interfaceC17066);
        return i2;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws C23821 {
        C12723.m31011(this.f73050);
        return this.f73051.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws C23821 {
        C12723.m31011(this.f73050);
        return this.f73051.readByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws C23821 {
        C12723.m31011(this.f73050);
        return this.f73051.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final short readShort() throws C23821 {
        C12723.m31011(this.f73050);
        return this.f73051.readShort();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws C23821 {
        C12723.m31011(this.f73050);
        return this.f73051.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final char readChar() throws C23821 {
        C12723.m31011(this.f73050);
        return this.f73051.readChar();
    }

    @Override // java.io.DataInput
    public final int readInt() {
        C12723.m31011(this.f73050);
        return this.f73051.readInt();
    }

    @Override // java.io.DataInput
    public final long readLong() throws C23821 {
        C12723.m31011(this.f73050);
        return this.f73051.readLong();
    }

    @Override // java.io.DataInput
    public final float readFloat() throws C23821 {
        C12723.m31011(this.f73050);
        return this.f73051.readFloat();
    }

    @Override // java.io.DataInput
    public final double readDouble() throws C23821 {
        C12723.m31011(this.f73050);
        return this.f73051.readDouble();
    }

    @Override // java.io.DataInput
    public final String readLine() throws IOException {
        InterfaceC17066 interfaceC17066 = this.f73050;
        C12723.m31011(interfaceC17066);
        String line = this.f73051.readLine();
        C12723.m31011(interfaceC17066);
        return line;
    }

    @Override // java.io.DataInput
    public final String readUTF() throws IOException {
        InterfaceC17066 interfaceC17066 = this.f73050;
        C12723.m31011(interfaceC17066);
        String utf = this.f73051.readUTF();
        C12723.m31011(interfaceC17066);
        return utf;
    }
}
