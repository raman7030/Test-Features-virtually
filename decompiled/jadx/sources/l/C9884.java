package l;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9884 implements PrivilegedAction {
    public final /* synthetic */ int a = 0;
    public Object b;

    public /* synthetic */ C9884() {
    }

    public C9884(List list) {
        this.b = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                String property = System.getProperty((String) this.b);
                if (property == null) {
                    return null;
                }
                return property;
            default:
                String property2 = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
                if (property2 != null) {
                    try {
                        C3967 c3967 = (C3967) C3967.class.cast(Class.forName(property2, true, C3967.class.getClassLoader()).newInstance());
                        C3967.b(c3967);
                        ((ArrayList) ((List) this.b)).add(c3967);
                        return null;
                    } catch (Exception e) {
                        throw new Error(e);
                    }
                }
                C3967.b(new C3967());
                return null;
        }
    }
}
