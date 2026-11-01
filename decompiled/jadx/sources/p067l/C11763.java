package p067l;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11763 implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32882a = 0;

    /* JADX INFO: renamed from: b */
    public Object f32883b;

    public /* synthetic */ C11763() {
    }

    public C11763(List list) {
        this.f32883b = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.f32882a) {
            case 0:
                String property = System.getProperty((String) this.f32883b);
                if (property == null) {
                    return null;
                }
                return property;
            default:
                String property2 = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
                if (property2 != null) {
                    try {
                        C6139 c6139 = (C6139) C6139.class.cast(Class.forName(property2, true, C6139.class.getClassLoader()).newInstance());
                        C6139.m13928b(c6139);
                        ((ArrayList) ((List) this.f32883b)).add(c6139);
                        return null;
                    } catch (Exception e) {
                        throw new Error(e);
                    }
                }
                C6139.m13928b(new C6139());
                return null;
        }
    }
}
