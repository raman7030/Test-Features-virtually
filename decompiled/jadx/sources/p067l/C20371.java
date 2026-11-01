package p067l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.ᩴᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes5.dex */
public final class C20371 extends C7630 {

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC23133 f62973;

    /* JADX INFO: renamed from: ۙ */
    public HashMap f62974;

    /* JADX INFO: renamed from: ۬ */
    public Iterator f62975;

    public C20371(ServiceLoader serviceLoader, C23623 c23623, String str) {
        super(serviceLoader, c23623);
        this.f62974 = new HashMap();
        this.f62975 = null;
        this.f62973 = null;
        this.f62975 = Arrays.asList(str.split(",")).iterator();
    }

    @Override // p067l.C7630
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo17593() {
        Iterator it = this.f19974;
        if (this.f62973 != null) {
            return true;
        }
        Iterator it2 = this.f62975;
        if (!it2.hasNext()) {
            this.f62974 = null;
            return false;
        }
        String str = (String) it2.next();
        InterfaceC23133 interfaceC23133 = (InterfaceC23133) this.f62974.get(str);
        if (interfaceC23133 != null) {
            this.f62974.remove(str);
            this.f62973 = interfaceC23133;
            return true;
        }
        while (it.hasNext()) {
            InterfaceC23133 interfaceC23134 = (InterfaceC23133) it.next();
            String name = interfaceC23134.getClass().getName();
            if (name.equals(str)) {
                this.f62973 = interfaceC23134;
                return true;
            }
            this.f62974.put(name, interfaceC23134);
        }
        C23623 c23623 = this.f19973;
        C14040 c14040 = C8300.f21997;
        c23623.m9355(new C14040("compiler", "proc.processor.not.found", str));
        return false;
    }

    @Override // p067l.C7630
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC23133 mo17594() {
        if (hasNext()) {
            InterfaceC23133 interfaceC23133 = this.f62973;
            this.f62973 = null;
            return interfaceC23133;
        }
        throw new NoSuchElementException();
    }
}
