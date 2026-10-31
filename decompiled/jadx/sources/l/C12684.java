package l;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.۫᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12684 implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Object obj;
        switch (this.a) {
            case 0:
                Object obj2 = AbstractC13389.a;
                ArrayList arrayList = new ArrayList();
                for (AbstractC13389 abstractC13389 : ServiceLoader.load(AbstractC13389.class, ClassLoader.getSystemClassLoader())) {
                    String scheme = abstractC13389.getScheme();
                    if (!scheme.equalsIgnoreCase("file")) {
                        int size = arrayList.size();
                        int i = 0;
                        do {
                            if (i >= size) {
                                arrayList.add(abstractC13389);
                            }
                            obj = arrayList.get(i);
                            i++;
                            break;
                        } while (!((AbstractC13389) obj).getScheme().equalsIgnoreCase(scheme));
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
