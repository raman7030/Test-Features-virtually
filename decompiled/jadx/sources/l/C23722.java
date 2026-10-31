package l;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩻۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23722 implements Externalizable {
    public static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Object b;

    public C23722() {
    }

    public C23722(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                C6789 c6789 = (C6789) obj;
                c(c6789.a, objectOutput);
                d(c6789.c, objectOutput);
                d(c6789.d, objectOutput);
                return;
            }
            if (b == 3) {
                ((C8906) obj).b(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((C15960) obj).g.getID());
                return;
            }
        }
        C15960 c15960 = (C15960) obj;
        objectOutput.writeInt(c15960.a.length);
        for (long j : c15960.a) {
            c(j, objectOutput);
        }
        for (C18078 c18078 : c15960.b) {
            d(c18078, objectOutput);
        }
        objectOutput.writeInt(c15960.c.length);
        for (long j2 : c15960.c) {
            c(j2, objectOutput);
        }
        for (C18078 c18079 : c15960.e) {
            d(c18079, objectOutput);
        }
        objectOutput.writeByte(c15960.f.length);
        for (C8906 c8906 : c15960.f) {
            c8906.b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object c15960;
        byte b = objectInput.readByte();
        this.a = b;
        if (b == 1) {
            long[] jArr = C15960.i;
            int i = objectInput.readInt();
            long[] jArr2 = i == 0 ? jArr : new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr2[i2] = a(objectInput);
            }
            int i3 = i + 1;
            C18078[] c18078Arr = new C18078[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                c18078Arr[i4] = b(objectInput);
            }
            int i5 = objectInput.readInt();
            if (i5 != 0) {
                jArr = new long[i5];
            }
            long[] jArr3 = jArr;
            for (int i6 = 0; i6 < i5; i6++) {
                jArr3[i6] = a(objectInput);
            }
            int i7 = i5 + 1;
            C18078[] c18078Arr2 = new C18078[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                c18078Arr2[i8] = b(objectInput);
            }
            int i9 = objectInput.readByte();
            C8906[] c8906Arr = i9 == 0 ? C15960.j : new C8906[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                c8906Arr[i10] = C8906.a(objectInput);
            }
            c15960 = new C15960(jArr2, c18078Arr, jArr3, c18078Arr2, c8906Arr);
        } else if (b == 2) {
            int i11 = C6789.e;
            long jA = a(objectInput);
            C18078 c18078B = b(objectInput);
            C18078 c18078B2 = b(objectInput);
            if (c18078B.equals(c18078B2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            c15960 = new C6789(jA, c18078B, c18078B2);
        } else if (b == 3) {
            c15960 = C8906.a(objectInput);
        } else {
            if (b != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            c15960 = new C15960(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.b = c15960;
    }

    private Object readResolve() {
        return this.b;
    }

    public static C18078 b(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? C18078.e0(dataInput.readInt()) : C18078.e0(b * 900);
    }

    public static void c(long j, DataOutput dataOutput) throws IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    public static long a(DataInput dataInput) {
        int i = dataInput.readByte() & 255;
        if (i == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    public static void d(C18078 c18078, DataOutput dataOutput) throws IOException {
        int i = c18078.b;
        int i2 = i % EnumC3478.f11019 == 0 ? i / EnumC3478.f11019 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }
}
