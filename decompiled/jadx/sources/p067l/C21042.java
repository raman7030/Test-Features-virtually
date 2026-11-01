package p067l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩵ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C21042 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f66019 = false;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC23133 f66020;

    /* JADX INFO: renamed from: ܽ */
    public LinkedHashSet f66021;

    /* JADX INFO: renamed from: ܿ */
    public LinkedHashSet f66022;

    /* JADX INFO: renamed from: ᩳ */
    public LinkedHashSet f66023;

    public C21042(InterfaceC23133 interfaceC23133, C23623 c23623, EnumC17840 enumC17840, C4271 c4271, boolean z, InterfaceC17096 interfaceC17096, boolean z2) {
        this.f66020 = interfaceC23133;
        InterfaceC9223 interfaceC9223M8675 = c4271.m8675(c4271.f9486);
        try {
            interfaceC23133.mo24091(interfaceC17096);
            EnumC5698 enumC5698Mo24093 = interfaceC23133.mo24093();
            if (enumC5698Mo24093.compareTo(EnumC17840.m40513(enumC17840)) < 0) {
                String name = interfaceC23133.getClass().getName();
                String str = enumC17840.f53238;
                C12895 c12895 = C15675.f45417;
                c23623.m9354(new C12895("compiler", "proc.processor.incompatible.source.version", enumC5698Mo24093, name, str));
            }
            this.f66023 = new LinkedHashSet();
            this.f66021 = new LinkedHashSet();
            for (String str2 : interfaceC23133.mo24092()) {
                boolean zAdd = this.f66023.add(str2);
                this.f66021.add(C3606.m6725(z, str2, this.f66020, c23623, z2));
                if (z2 && !zAdd) {
                    String name2 = interfaceC23133.getClass().getName();
                    C12895 c12896 = C15675.f45417;
                    c23623.m9354(new C12895("compiler", "proc.duplicate.supported.annotation", str2, name2));
                }
            }
            if (z2 && this.f66021.contains(C5518.m12162("*")) && this.f66021.size() > 1) {
                String name3 = interfaceC23133.getClass().getName();
                C12895 c12897 = C15675.f45417;
                c23623.m9354(new C12895("compiler", "proc.redundant.types.with.wildcard", name3));
            }
            this.f66022 = new LinkedHashSet();
            for (String str3 : this.f66020.mo24090()) {
                if (m47458(str3, c23623)) {
                    boolean zAdd2 = this.f66022.add(str3);
                    if (z2 && !zAdd2) {
                        String name4 = interfaceC23133.getClass().getName();
                        C12895 c12898 = C15675.f45417;
                        c23623.m9354(new C12895("compiler", "proc.duplicate.option.name", str3, name4));
                    }
                }
            }
            c4271.m8675(interfaceC9223M8675);
        } catch (Throwable th) {
            try {
                throw new C12995(th);
            } catch (Throwable th2) {
                c4271.m8675(interfaceC9223M8675);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m47458(String str, C23623 c23623) {
        boolean z;
        Pattern pattern = C3606.f7406;
        String[] strArrSplit = str.split("\\.", -1);
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (!EnumC5698.m12682(strArrSplit[i])) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            String name = this.f66020.getClass().getName();
            C14040 c14040 = C8300.f21997;
            c23623.m9355(new C14040("compiler", "proc.processor.bad.option.name", str, name));
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m47460(String str) {
        Iterator it = this.f66021.iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47459(HashSet hashSet) {
        hashSet.removeAll(this.f66022);
    }
}
