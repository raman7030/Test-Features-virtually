package p067l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C20926 extends HashMap {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C10196 f65717;

    public C20926(C10196 c10196) {
        this.f65717 = c10196;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String strRemove = remove((Object) str);
        this.f65717.f28266.put(str == null ? null : str.toLowerCase(Locale.US), str2);
        super.put(str, str2);
        return strRemove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final String remove(Object obj) {
        boolean z = obj instanceof String;
        C10196 c10196 = this.f65717;
        if (!z) {
            c10196.f28266.remove(obj);
            return (String) super.remove(obj);
        }
        String lowerCase = ((String) obj).toLowerCase(Locale.US);
        c10196.f28266.remove(lowerCase);
        Iterator it = c10196.f28274.iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (str != null && str.toLowerCase(Locale.US).equals(lowerCase)) {
                it.remove();
            }
        }
        Iterator it2 = entrySet().iterator();
        String str2 = null;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str3 = (String) entry.getKey();
            if (str3 != null && str3.toLowerCase(Locale.US).equals(lowerCase)) {
                if (str2 == null) {
                    str2 = (String) entry.getValue();
                }
                it2.remove();
            }
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        C10196 c10196 = this.f65717;
        c10196.f28266.clear();
        c10196.f28274.clear();
        super.clear();
    }
}
