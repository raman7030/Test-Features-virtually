package p067l;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C24290 implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f76941;

    public C24290(Bundle bundle) {
        this.f76941 = new HashMap();
        for (String str : bundle.keySet()) {
            this.f76941.put(str, bundle.getString(str));
        }
    }

    public C24290(HashMap map) {
        this.f76941 = new HashMap(map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseData{time=");
        HashMap map = this.f76941;
        sb.append((String) map.get("time"));
        sb.append(", name=");
        sb.append((String) map.get("interface_name"));
        sb.append('}');
        return sb.toString();
    }
}
