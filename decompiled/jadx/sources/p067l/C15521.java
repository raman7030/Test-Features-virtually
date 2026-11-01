package p067l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3A0 */
/* JADX INFO: loaded from: classes4.dex */
public class C15521 extends AbstractC2781 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۬ */
    public final transient AbstractC8146 f44360;

    public C15521(AbstractC11500 abstractC11500, int i) {
        super(abstractC11500, i);
        int i2 = AbstractC8146.f21506;
        this.f44360 = C22034.f69338;
    }

    @Override // p067l.AbstractC2781, p067l.InterfaceC2704
    public final AbstractC8146 get(Object obj) {
        return (AbstractC8146) C17592.m40056((AbstractC8146) this.f4695.get(obj), this.f44360);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        AbstractC8146 abstractC8146 = this.f44360;
        objectOutputStream.writeObject(abstractC8146 instanceof AbstractC24891 ? ((AbstractC24891) abstractC8146).f79495 : null);
        C5940.m13317(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Serializable serializableM54645;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(C20778.m46922(i, "Invalid key count "));
        }
        C8817 c8817M26550 = AbstractC11500.m26550();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            C12826.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(C20778.m46922(i4, "Invalid value count "));
            }
            C14181 c14181 = comparator == null ? new C14181() : new C18856(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                C12826.requireNonNull(object2);
                c14181.mo8328(object2);
            }
            AbstractC8146 abstractC8146Mo32660 = c14181.mo32660();
            if (abstractC8146Mo32660.size() != i4) {
                throw new InvalidObjectException(C7470.m17246(object, "Duplicate key-value pairs exist for key "));
            }
            c8817M26550.mo20376(object, abstractC8146Mo32660);
            i2 += i4;
        }
        try {
            C20217.f62510.m9732(this, c8817M26550.mo20378());
            C20217.f62511.m9731(this, i2);
            C4599 c4599 = C24239.f76824;
            if (comparator == null) {
                int i6 = AbstractC8146.f21506;
                serializableM54645 = C22034.f69338;
            } else {
                serializableM54645 = AbstractC24891.m54645(comparator);
            }
            c4599.m9732(this, serializableM54645);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
