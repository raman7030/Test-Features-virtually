package p067l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15311 {

    /* JADX INFO: renamed from: a */
    public Set f43698a;

    /* JADX INFO: renamed from: b */
    public Map f43699b;

    /* JADX INFO: renamed from: c */
    public boolean f43700c;

    /* JADX INFO: renamed from: b */
    public final boolean m34847b(String str) {
        return this.f43700c || ((HashSet) this.f43698a).contains(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m34846a(Object obj, String str) {
        ((HashMap) this.f43699b).put(str, obj);
    }
}
