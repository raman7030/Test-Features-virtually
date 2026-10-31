package l;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.ۚᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes2.dex */
public class C5536 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22364 f17131;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f17132;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ServiceLoader f17133;

    public C5536(ServiceLoader serviceLoader, C22364 c22364) {
        this.f17131 = c22364;
        this.f17133 = serviceLoader;
        this.f17132 = serviceLoader.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C22364 c22364 = this.f17131;
        try {
            return mo15678();
        } catch (UnsupportedClassVersionError e) {
            String localizedMessage = e.getLocalizedMessage();
            C12281 c12281 = C6241.f19132;
            c22364.m7276(new C12281("compiler", "proc.cant.load.class", localizedMessage));
            throw new C6430(e);
        } catch (ClassFormatError e2) {
            String localizedMessage2 = e2.getLocalizedMessage();
            C12281 c12282 = C6241.f19132;
            c22364.m7276(new C12281("compiler", "proc.cant.load.class", localizedMessage2));
            throw new C6430(e2);
        } catch (ServiceConfigurationError e3) {
            c22364.m7276(C6241.m17192(e3.getLocalizedMessage()));
            throw new C6430(e3);
        } catch (Throwable th) {
            c22364.m7276(C6241.m17192(th.getLocalizedMessage()));
            throw new C6430(th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo15678() {
        return this.f17132.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C22364 c22364 = this.f17131;
        try {
            return mo15679();
        } catch (ServiceConfigurationError e) {
            c22364.m7276(C6241.m17192(e.getLocalizedMessage()));
            throw new C6430(e);
        } catch (Throwable th) {
            c22364.m7276(C6241.m17192(th.getLocalizedMessage()));
            throw new C6430(th);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21848 mo15679() {
        return (InterfaceC21848) this.f17132.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
