package p067l;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.ۚᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes2.dex */
public class C7630 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public C23623 f19973;

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f19974;

    /* JADX INFO: renamed from: ᩹ */
    public ServiceLoader f19975;

    public C7630(ServiceLoader serviceLoader, C23623 c23623) {
        this.f19973 = c23623;
        this.f19975 = serviceLoader;
        this.f19974 = serviceLoader.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C23623 c23623 = this.f19973;
        try {
            return mo17593();
        } catch (UnsupportedClassVersionError e) {
            String localizedMessage = e.getLocalizedMessage();
            C14040 c14040 = C8300.f21997;
            c23623.m9355(new C14040("compiler", "proc.cant.load.class", localizedMessage));
            throw new C8479(e);
        } catch (ClassFormatError e2) {
            String localizedMessage2 = e2.getLocalizedMessage();
            C14040 c14041 = C8300.f21997;
            c23623.m9355(new C14040("compiler", "proc.cant.load.class", localizedMessage2));
            throw new C8479(e2);
        } catch (ServiceConfigurationError e3) {
            c23623.m9355(C8300.m19130(e3.getLocalizedMessage()));
            throw new C8479(e3);
        } catch (Throwable th) {
            c23623.m9355(C8300.m19130(th.getLocalizedMessage()));
            throw new C8479(th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo17593() {
        return this.f19974.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C23623 c23623 = this.f19973;
        try {
            return mo17594();
        } catch (ServiceConfigurationError e) {
            c23623.m9355(C8300.m19130(e.getLocalizedMessage()));
            throw new C8479(e);
        } catch (Throwable th) {
            c23623.m9355(C8300.m19130(th.getLocalizedMessage()));
            throw new C8479(th);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC23133 mo17594() {
        return (InterfaceC23133) this.f19974.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
