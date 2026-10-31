package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: KAYQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18994 extends AbstractC19700 implements Serializable {
    private final Object writeReplace() {
        return C4177.f13624;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // l.AbstractC19700
    /* JADX INFO: renamed from: ֫ */
    public final int mo23493() {
        return AbstractC19700.f63641.mo23493();
    }

    @Override // l.AbstractC19700
    /* JADX INFO: renamed from: ۧ */
    public final int mo23494() {
        return AbstractC19700.f63641.mo23494();
    }
}
