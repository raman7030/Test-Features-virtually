package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: KAYQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20421 extends AbstractC21092 implements Serializable {
    private final Object writeReplace() {
        return C6339.f16437;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // p067l.AbstractC21092
    /* JADX INFO: renamed from: ֫ */
    public final int mo25444() {
        return AbstractC21092.f66272.mo25444();
    }

    @Override // p067l.AbstractC21092
    /* JADX INFO: renamed from: ۧ */
    public final int mo25445() {
        return AbstractC21092.f66272.mo25445();
    }
}
