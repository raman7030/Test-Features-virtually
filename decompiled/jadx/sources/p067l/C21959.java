package p067l;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: renamed from: l.᩷ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21959 implements Externalizable {
    public static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a */
    public byte f69012a;

    /* JADX INFO: renamed from: b */
    public Object f69013b;

    public C21959() {
    }

    public C21959(byte b, Object obj) {
        this.f69012a = b;
        this.f69013b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f69012a;
        Object obj = this.f69013b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                C5057 c5057 = (C5057) obj;
                objectOutput.writeLong(c5057.f11851a);
                objectOutput.writeInt(c5057.f11852b);
                return;
            case 2:
                C6398 c6398 = (C6398) obj;
                objectOutput.writeLong(c6398.f16564a);
                objectOutput.writeInt(c6398.f16565b);
                return;
            case 3:
                C20480 c20480 = (C20480) obj;
                objectOutput.writeInt(c20480.f63259a);
                objectOutput.writeByte(c20480.f63260b);
                objectOutput.writeByte(c20480.f63261c);
                return;
            case 4:
                ((C9257) obj).m21360l0(objectOutput);
                return;
            case 5:
                C24009 c24009 = (C24009) obj;
                C20480 c20481 = c24009.f76253a;
                objectOutput.writeInt(c20481.f63259a);
                objectOutput.writeByte(c20481.f63260b);
                objectOutput.writeByte(c20481.f63261c);
                c24009.f76254b.m21360l0(objectOutput);
                return;
            case 6:
                C3715 c3715 = (C3715) obj;
                C24009 c240010 = c3715.f7863a;
                C20480 c20482 = c240010.f76253a;
                objectOutput.writeInt(c20482.f63259a);
                objectOutput.writeByte(c20482.f63260b);
                objectOutput.writeByte(c20482.f63261c);
                c240010.f76254b.m21360l0(objectOutput);
                c3715.f7864b.m44398h0(objectOutput);
                c3715.f7865c.mo17865a0(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((C18879) obj).f56373b);
                return;
            case 8:
                ((C19550) obj).m44398h0(objectOutput);
                return;
            case 9:
                C24640 c24640 = (C24640) obj;
                c24640.f77996a.m21360l0(objectOutput);
                c24640.f77997b.m44398h0(objectOutput);
                return;
            case 10:
                C21151 c21151 = (C21151) obj;
                C24009 c240011 = c21151.f66457a;
                C20480 c20483 = c240011.f76253a;
                objectOutput.writeInt(c20483.f63259a);
                objectOutput.writeByte(c20483.f63260b);
                objectOutput.writeByte(c20483.f63261c);
                c240011.f76254b.m21360l0(objectOutput);
                c21151.f66458b.m44398h0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((C4127) obj).f9110a);
                return;
            case 12:
                C18208 c18208 = (C18208) obj;
                objectOutput.writeInt(c18208.f54353a);
                objectOutput.writeByte(c18208.f54354b);
                return;
            case 13:
                C19276 c19276 = (C19276) obj;
                objectOutput.writeByte(c19276.f57606a);
                objectOutput.writeByte(c19276.f57607b);
                return;
            case 14:
                C8547 c8547 = (C8547) obj;
                objectOutput.writeInt(c8547.f22960a);
                objectOutput.writeInt(c8547.f22961b);
                objectOutput.writeInt(c8547.f22962c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b = objectInput.readByte();
        this.f69012a = b;
        this.f69013b = m49484a(b, objectInput);
    }

    /* JADX INFO: renamed from: a */
    public static Object m49484a(byte b, ObjectInput objectInput) throws IOException {
        switch (b) {
            case 1:
                C5057 c5057 = C5057.ZERO;
                return C5057.m10792s(objectInput.readLong(), objectInput.readInt());
            case 2:
                C6398 c6398 = C6398.EPOCH;
                return C6398.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                C20480 c20480 = C20480.f63257d;
                return C20480.m46187h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return C9257.m21348g0(objectInput);
            case 5:
                C24009 c24009 = C24009.f76251c;
                C20480 c20481 = C20480.f63257d;
                return C24009.m53182Y(C20480.m46187h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C9257.m21348g0(objectInput));
            case 6:
                C24009 c240010 = C24009.f76251c;
                C20480 c20482 = C20480.f63257d;
                C24009 c24009M53182Y = C24009.m53182Y(C20480.m46187h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C9257.m21348g0(objectInput));
                C19550 c19550M44397g0 = C19550.m44397g0(objectInput);
                AbstractC7739 abstractC7739 = (AbstractC7739) m49484a(objectInput.readByte(), objectInput);
                C12826.requireNonNull(c24009M53182Y, "localDateTime");
                C12826.requireNonNull(c19550M44397g0, "offset");
                C12826.requireNonNull(abstractC7739, "zone");
                if (!(abstractC7739 instanceof C19550) || c19550M44397g0.equals(abstractC7739)) {
                    return new C3715(c24009M53182Y, abstractC7739, c19550M44397g0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = C18879.f56372d;
                return AbstractC7739.m17861X(objectInput.readUTF(), false);
            case 8:
                return C19550.m44397g0(objectInput);
            case 9:
                int i2 = C24640.f77995c;
                return new C24640(C9257.m21348g0(objectInput), C19550.m44397g0(objectInput));
            case 10:
                int i3 = C21151.f66456c;
                C20480 c20483 = C20480.f63257d;
                return new C21151(C24009.m53182Y(C20480.m46187h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C9257.m21348g0(objectInput)), C19550.m44397g0(objectInput));
            case 11:
                int i4 = C4127.f9109b;
                return C4127.m8359V(objectInput.readInt());
            case 12:
                int i5 = C18208.f54352c;
                int i6 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                EnumC19947.YEAR.m45273T(i6);
                EnumC19947.MONTH_OF_YEAR.m45273T(b2);
                return new C18208(i6, b2);
            case 13:
                int i7 = C19276.f57605c;
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                EnumC12571 enumC12571M28960Y = EnumC12571.m28960Y(b3);
                C12826.requireNonNull(enumC12571M28960Y, "month");
                EnumC19947.DAY_OF_MONTH.m45273T(b4);
                if (b4 <= enumC12571M28960Y.m28963X()) {
                    return new C19276(enumC12571M28960Y.getValue(), b4);
                }
                throw new C17796("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + enumC12571M28960Y.name());
            case 14:
                C8547 c8547 = C8547.f22959d;
                return C8547.m19933a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f69013b;
    }
}
