package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8NJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6837 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f21167 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Map f21168;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Map m18521() {
        if (this.f21168 == null) {
            this.f21168 = C20195.unmodifiableMap(new HashMap(this.f21167));
        }
        return this.f21168;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m18522(Map map) {
        this.f21168 = null;
        this.f21167.clear();
        this.f21167.putAll(map);
    }
}
