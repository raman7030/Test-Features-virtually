package l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3A0 */
/* JADX INFO: loaded from: classes4.dex */
public class C13839 extends AbstractC0434 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient AbstractC6079 f41281;

    public C13839(AbstractC9608 abstractC9608, int i) {
        super(abstractC9608, i);
        int i2 = AbstractC6079.f18650;
        this.f41281 = C20692.f66656;
    }

    @Override // l.AbstractC0434, l.InterfaceC0353
    public final AbstractC6079 get(Object obj) {
        return (AbstractC6079) C16018.m37870((AbstractC6079) this.f1919.get(obj), this.f41281);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        AbstractC6079 abstractC6079 = this.f41281;
        objectOutputStream.writeObject(abstractC6079 instanceof AbstractC23698 ? ((AbstractC23698) abstractC6079).f76745 : null);
        C3758.m11381(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Serializable serializableM52241;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(C19370.m44628(i, "Invalid key count "));
        }
        C6785 c6785M24537 = AbstractC9608.m24537();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            C11003.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(C19370.m44628(i4, "Invalid value count "));
            }
            C12429 c12429 = comparator == null ? new C12429() : new C17348(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                C11003.requireNonNull(object2);
                c12429.mo6130(object2);
            }
            AbstractC6079 abstractC6079Mo30595 = c12429.mo30595();
            if (abstractC6079Mo30595.size() != i4) {
                throw new InvalidObjectException(C5368.m15337(object, "Duplicate key-value pairs exist for key "));
            }
            c6785M24537.mo18428(object, abstractC6079Mo30595);
            i2 += i4;
        }
        try {
            C18780.f59288.m7661(this, c6785M24537.mo18430());
            C18780.f59289.m7660(this, i2);
            C2347 c2347 = C23012.f74085;
            if (comparator == null) {
                int i6 = AbstractC6079.f18650;
                serializableM52241 = C20692.f66656;
            } else {
                serializableM52241 = AbstractC23698.m52241(comparator);
            }
            c2347.m7661(this, serializableM52241);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
