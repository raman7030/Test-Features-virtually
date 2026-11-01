package p067l;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.۫᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14424 implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41228a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Object obj;
        switch (this.f41228a) {
            case 0:
                Object obj2 = AbstractC15094.f43081a;
                ArrayList arrayList = new ArrayList();
                for (AbstractC15094 abstractC15094 : ServiceLoader.load(AbstractC15094.class, ClassLoader.getSystemClassLoader())) {
                    String scheme = abstractC15094.getScheme();
                    if (!scheme.equalsIgnoreCase("file")) {
                        int size = arrayList.size();
                        int i = 0;
                        do {
                            if (i >= size) {
                                arrayList.add(abstractC15094);
                            }
                            obj = arrayList.get(i);
                            i++;
                            break;
                        } while (!((AbstractC15094) obj).getScheme().equalsIgnoreCase(scheme));
                    }
                }
                return arrayList;
            case 1:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            case 2:
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
            default:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    }
}
