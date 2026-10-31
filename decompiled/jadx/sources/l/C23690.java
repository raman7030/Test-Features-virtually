package l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9GT */
/* JADX INFO: loaded from: classes.dex */
public final class C23690 extends AbstractC5366 implements Iterable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC5366 f76723;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f76724;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13630 f76725;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f76726;

    public C23690(AbstractC11716 abstractC11716, byte[] bArr, C13630 c13630) {
        super(abstractC11716);
        this.f76724 = true;
        this.f76726 = bArr;
        this.f76725 = c13630;
        this.f76723 = null;
    }

    @Override // l.AbstractC5366
    public final Object getValue() {
        return m52235();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m52234() {
        return this.f16709.m28612();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((C1818) m52233(AbstractC11716.f34964)).iterator();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC5366 m52235() {
        AbstractC5366 abstractC5366 = this.f76723;
        if (abstractC5366 != null) {
            return abstractC5366;
        }
        try {
            C8894 c8894 = new C8894(this.f76725, this.f76726);
            try {
                AbstractC5366 object = c8894.readObject();
                c8894.close();
                return object;
            } catch (Throwable th) {
                try {
                    c8894.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C2544(e, "Could not parse the inputstream", new Object[0]);
        } catch (C2544 e2) {
            throw new C2544(e2, "Unable to parse the explicit Tagged Object with %s, it might be implicit", this.f16709);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5366 m52233(AbstractC11716 abstractC11716) {
        AbstractC5366 abstractC5366 = this.f76723;
        if (abstractC5366 != null && abstractC5366.m15330().equals(abstractC11716)) {
            return abstractC5366;
        }
        if (abstractC5366 == null && this.f76726 != null) {
            return abstractC11716.mo3869(this.f76725).mo1923(abstractC11716, this.f76726);
        }
        throw new C2544("Unable to parse the implicit Tagged Object with %s, it is explicit", abstractC11716);
    }

    @Override // l.AbstractC5366
    public final String toString() {
        StringBuilder sb = new StringBuilder("ASN1TaggedObject[");
        sb.append(this.f16709);
        AbstractC5366 abstractC5366 = this.f76723;
        if (abstractC5366 != null) {
            sb.append(",");
            sb.append(abstractC5366);
        } else {
            sb.append(",<unknown>");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23690(AbstractC11716 abstractC11716, AbstractC5366 abstractC5366, boolean z) {
        AbstractC11716 abstractC11716M28610;
        if (!z) {
            abstractC11716M28610 = abstractC11716.m28610(abstractC5366.m15330().m28609());
        } else {
            abstractC11716M28610 = abstractC11716.m28610(EnumC0426.CONSTRUCTED);
        }
        super(abstractC11716M28610);
        this.f76723 = abstractC5366;
        this.f76724 = z;
        this.f76726 = null;
    }
}
