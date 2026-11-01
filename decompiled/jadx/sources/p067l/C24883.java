package p067l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9GT */
/* JADX INFO: loaded from: classes.dex */
public final class C24883 extends AbstractC7468 implements Iterable {

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC7468 f79473;

    /* JADX INFO: renamed from: ۙ */
    public boolean f79474;

    /* JADX INFO: renamed from: ᩶ */
    public C15322 f79475;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f79476;

    public C24883(AbstractC13503 abstractC13503, byte[] bArr, C15322 c15322) {
        super(abstractC13503);
        this.f79474 = true;
        this.f79476 = bArr;
        this.f79475 = c15322;
        this.f79473 = null;
    }

    @Override // p067l.AbstractC7468
    public final Object getValue() {
        return m54638();
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m54637() {
        return this.f19547.m30660();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((C4096) m54636(AbstractC13503.f37964)).iterator();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7468 m54638() {
        AbstractC7468 abstractC7468 = this.f79473;
        if (abstractC7468 != null) {
            return abstractC7468;
        }
        try {
            C10821 c10821 = new C10821(this.f79475, this.f79476);
            try {
                AbstractC7468 object = c10821.readObject();
                c10821.close();
                return object;
            } catch (Throwable th) {
                try {
                    c10821.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C4786(e, "Could not parse the inputstream", new Object[0]);
        } catch (C4786 e2) {
            throw new C4786(e2, "Unable to parse the explicit Tagged Object with %s, it might be implicit", this.f19547);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7468 m54636(AbstractC13503 abstractC13503) {
        AbstractC7468 abstractC7468 = this.f79473;
        if (abstractC7468 != null && abstractC7468.m17239().equals(abstractC13503)) {
            return abstractC7468;
        }
        if (abstractC7468 == null && this.f79476 != null) {
            return abstractC13503.mo6110(this.f79475).mo4315(abstractC13503, this.f79476);
        }
        throw new C4786("Unable to parse the implicit Tagged Object with %s, it is explicit", abstractC13503);
    }

    @Override // p067l.AbstractC7468
    public final String toString() {
        StringBuilder sb = new StringBuilder("ASN1TaggedObject[");
        sb.append(this.f19547);
        AbstractC7468 abstractC7468 = this.f79473;
        if (abstractC7468 != null) {
            sb.append(",");
            sb.append(abstractC7468);
        } else {
            sb.append(",<unknown>");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C24883(AbstractC13503 abstractC13503, AbstractC7468 abstractC7468, boolean z) {
        AbstractC13503 abstractC13503M30658;
        if (!z) {
            abstractC13503M30658 = abstractC13503.m30658(abstractC7468.m17239().m30657());
        } else {
            abstractC13503M30658 = abstractC13503.m30658(EnumC2773.CONSTRUCTED);
        }
        super(abstractC13503M30658);
        this.f79473 = abstractC7468;
        this.f79474 = z;
        this.f79476 = null;
    }
}
