package p067l;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: renamed from: l.۟᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9750 implements Externalizable {
    public static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a */
    public byte f26922a;

    /* JADX INFO: renamed from: b */
    public Object f26923b;

    public C9750() {
    }

    public C9750(byte b, Object obj) {
        this.f26922a = b;
        this.f26923b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f26922a;
        Object obj = this.f26923b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC7068) obj).mo10584k());
                return;
            case 2:
                C18407 c18407 = (C18407) obj;
                objectOutput.writeObject(c18407.f54963a);
                objectOutput.writeObject(c18407.f54964b);
                return;
            case 3:
                C11032 c11032 = (C11032) obj;
                objectOutput.writeObject(c11032.f30564a);
                objectOutput.writeObject(c11032.f30565b);
                objectOutput.writeObject(c11032.f30566c);
                return;
            case 4:
                C7008 c7008 = (C7008) obj;
                c7008.getClass();
                objectOutput.writeInt(AbstractC7877.m18193a(c7008, EnumC19947.YEAR));
                objectOutput.writeByte(AbstractC7877.m18193a(c7008, EnumC19947.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC7877.m18193a(c7008, EnumC19947.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((C5667) obj).f13788a);
                return;
            case 6:
                C7679 c7679 = (C7679) obj;
                objectOutput.writeObject(c7679.f20140a);
                objectOutput.writeInt(AbstractC7877.m18193a(c7679, EnumC19947.YEAR));
                objectOutput.writeByte(AbstractC7877.m18193a(c7679, EnumC19947.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC7877.m18193a(c7679, EnumC19947.DAY_OF_MONTH));
                return;
            case 7:
                C8409 c8409 = (C8409) obj;
                c8409.getClass();
                objectOutput.writeInt(AbstractC7877.m18193a(c8409, EnumC19947.YEAR));
                objectOutput.writeByte(AbstractC7877.m18193a(c8409, EnumC19947.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC7877.m18193a(c8409, EnumC19947.DAY_OF_MONTH));
                return;
            case 8:
                C9020 c9020 = (C9020) obj;
                c9020.getClass();
                objectOutput.writeInt(AbstractC7877.m18193a(c9020, EnumC19947.YEAR));
                objectOutput.writeByte(AbstractC7877.m18193a(c9020, EnumC19947.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC7877.m18193a(c9020, EnumC19947.DAY_OF_MONTH));
                return;
            case 9:
                C19078 c19078 = (C19078) obj;
                objectOutput.writeUTF(c19078.f56927a.mo10584k());
                objectOutput.writeInt(c19078.f56928b);
                objectOutput.writeInt(c19078.f56929c);
                objectOutput.writeInt(c19078.f56930d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objM40318t;
        byte b = objectInput.readByte();
        this.f26922a = b;
        switch (b) {
            case 1:
                ConcurrentMapC12768 concurrentMapC12768 = AbstractC7068.f18414a;
                objM40318t = AbstractC17736.m40318t(objectInput.readUTF());
                break;
            case 2:
                objM40318t = ((InterfaceC15114) objectInput.readObject()).mo16119I((C9257) objectInput.readObject());
                break;
            case 3:
                objM40318t = ((InterfaceC15784) objectInput.readObject()).mo35849D((C19550) objectInput.readObject()).mo7144A((AbstractC7739) objectInput.readObject());
                break;
            case 4:
                C20480 c20480 = C7008.f18257d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                C23772.f75602c.getClass();
                objM40318t = new C7008(C20480.m46187h0(i, b2, b3));
                break;
            case 5:
                C5667 c5667 = C5667.f13786d;
                objM40318t = C5667.m12625o(objectInput.readByte());
                break;
            case 6:
                C21091 c21091 = (C21091) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                c21091.getClass();
                objM40318t = new C7679(c21091, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                C5727.f14028c.getClass();
                objM40318t = new C8409(C20480.m46187h0(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                C19749.f60075c.getClass();
                objM40318t = new C9020(C20480.m46187h0(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = C19078.f56926e;
                objM40318t = new C19078(AbstractC17736.m40318t(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f26923b = objM40318t;
    }

    private Object readResolve() {
        return this.f26923b;
    }
}
