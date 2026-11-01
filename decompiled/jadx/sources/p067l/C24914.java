package p067l;

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
public final class C24914 implements Externalizable {
    public static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a */
    public byte f79574a;

    /* JADX INFO: renamed from: b */
    public Object f79575b;

    public C24914() {
    }

    public C24914(byte b, Object obj) {
        this.f79574a = b;
        this.f79575b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f79574a;
        Object obj = this.f79575b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                C8821 c8821 = (C8821) obj;
                m54778c(c8821.f23947a, objectOutput);
                m54779d(c8821.f23949c, objectOutput);
                m54779d(c8821.f23950d, objectOutput);
                return;
            }
            if (b == 3) {
                ((C10833) obj).m24952b(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((C17537) obj).f52424g.getID());
                return;
            }
        }
        C17537 c17537 = (C17537) obj;
        objectOutput.writeInt(c17537.f52418a.length);
        for (long j : c17537.f52418a) {
            m54778c(j, objectOutput);
        }
        for (C19550 c19550 : c17537.f52419b) {
            m54779d(c19550, objectOutput);
        }
        objectOutput.writeInt(c17537.f52420c.length);
        for (long j2 : c17537.f52420c) {
            m54778c(j2, objectOutput);
        }
        for (C19550 c19551 : c17537.f52422e) {
            m54779d(c19551, objectOutput);
        }
        objectOutput.writeByte(c17537.f52423f.length);
        for (C10833 c10833 : c17537.f52423f) {
            c10833.m24952b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object c17537;
        byte b = objectInput.readByte();
        this.f79574a = b;
        if (b == 1) {
            long[] jArr = C17537.f52414i;
            int i = objectInput.readInt();
            long[] jArr2 = i == 0 ? jArr : new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr2[i2] = m54776a(objectInput);
            }
            int i3 = i + 1;
            C19550[] c19550Arr = new C19550[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                c19550Arr[i4] = m54777b(objectInput);
            }
            int i5 = objectInput.readInt();
            if (i5 != 0) {
                jArr = new long[i5];
            }
            long[] jArr3 = jArr;
            for (int i6 = 0; i6 < i5; i6++) {
                jArr3[i6] = m54776a(objectInput);
            }
            int i7 = i5 + 1;
            C19550[] c19550Arr2 = new C19550[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                c19550Arr2[i8] = m54777b(objectInput);
            }
            int i9 = objectInput.readByte();
            C10833[] c10833Arr = i9 == 0 ? C17537.f52415j : new C10833[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                c10833Arr[i10] = C10833.m24951a(objectInput);
            }
            c17537 = new C17537(jArr2, c19550Arr, jArr3, c19550Arr2, c10833Arr);
        } else if (b == 2) {
            int i11 = C8821.f23946e;
            long jM54776a = m54776a(objectInput);
            C19550 c19550M54777b = m54777b(objectInput);
            C19550 c19550M54777b2 = m54777b(objectInput);
            if (c19550M54777b.equals(c19550M54777b2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            c17537 = new C8821(jM54776a, c19550M54777b, c19550M54777b2);
        } else if (b == 3) {
            c17537 = C10833.m24951a(objectInput);
        } else {
            if (b != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            c17537 = new C17537(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f79575b = c17537;
    }

    private Object readResolve() {
        return this.f79575b;
    }

    /* JADX INFO: renamed from: b */
    public static C19550 m54777b(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? C19550.m44395e0(dataInput.readInt()) : C19550.m44395e0(b * 900);
    }

    /* JADX INFO: renamed from: c */
    public static void m54778c(long j, DataOutput dataOutput) throws IOException {
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

    /* JADX INFO: renamed from: a */
    public static long m54776a(DataInput dataInput) {
        int i = dataInput.readByte() & 255;
        if (i == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    /* JADX INFO: renamed from: d */
    public static void m54779d(C19550 c19550, DataOutput dataOutput) throws IOException {
        int i = c19550.f59520b;
        int i2 = i % EnumC5674.f13824 == 0 ? i / EnumC5674.f13824 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }
}
