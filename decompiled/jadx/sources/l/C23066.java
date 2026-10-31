package l;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C23066 implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f74196;

    public C23066(Bundle bundle) {
        this.f74196 = new HashMap();
        for (String str : bundle.keySet()) {
            this.f74196.put(str, bundle.getString(str));
        }
    }

    public C23066(HashMap map) {
        this.f74196 = new HashMap(map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseData{time=");
        HashMap map = this.f74196;
        sb.append((String) map.get("time"));
        sb.append(", name=");
        sb.append((String) map.get("interface_name"));
        sb.append('}');
        return sb.toString();
    }
}
