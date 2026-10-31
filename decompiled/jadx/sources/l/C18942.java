package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.ᩴᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes5.dex */
public final class C18942 extends C5536 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC21848 f59742;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f59743;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Iterator f59744;

    public C18942(ServiceLoader serviceLoader, C22364 c22364, String str) {
        super(serviceLoader, c22364);
        this.f59743 = new HashMap();
        this.f59744 = null;
        this.f59742 = null;
        this.f59744 = Arrays.asList(str.split(",")).iterator();
    }

    @Override // l.C5536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15678() {
        Iterator it = this.f17132;
        if (this.f59742 != null) {
            return true;
        }
        Iterator it2 = this.f59744;
        if (!it2.hasNext()) {
            this.f59743 = null;
            return false;
        }
        String str = (String) it2.next();
        InterfaceC21848 interfaceC21848 = (InterfaceC21848) this.f59743.get(str);
        if (interfaceC21848 != null) {
            this.f59743.remove(str);
            this.f59742 = interfaceC21848;
            return true;
        }
        while (it.hasNext()) {
            InterfaceC21848 interfaceC21849 = (InterfaceC21848) it.next();
            String name = interfaceC21849.getClass().getName();
            if (name.equals(str)) {
                this.f59742 = interfaceC21849;
                return true;
            }
            this.f59743.put(name, interfaceC21849);
        }
        C22364 c22364 = this.f17131;
        C12281 c12281 = C6241.f19132;
        c22364.m7276(new C12281("compiler", "proc.processor.not.found", str));
        return false;
    }

    @Override // l.C5536
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21848 mo15679() {
        if (hasNext()) {
            InterfaceC21848 interfaceC21848 = this.f59742;
            this.f59742 = null;
            return interfaceC21848;
        }
        throw new NoSuchElementException();
    }
}
