package p067l;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17520 implements InterfaceC9934, InterfaceC18263, InterfaceC22729 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f52377;

    public /* synthetic */ C17520(int i) {
        this.f52377 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m39893(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ Map m39894() {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("X-Content-Type-Options", "nosniff"), new AbstractMap.SimpleEntry("Cache-Control", "private, max-age=31536000")};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            C12826.requireNonNull(key);
            Object value = entry.getValue();
            C12826.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(C7470.m17246(key, "duplicate key: "));
            }
        }
        return C21562.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39895(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        switch (this.f52377) {
            case 0:
                int i = ActivityC18686.f55776;
                ((Throwable) obj).getClass();
                return null;
            case 6:
                return Integer.valueOf(((C15020) obj).f42920);
            case 8:
                int i2 = C23731.f75509;
                return null;
            default:
                InterfaceC13765 interfaceC13765 = (InterfaceC13765) obj;
                return C20732.m46812((int) interfaceC13765.getLineNumber(), (int) interfaceC13765.getColumnNumber(), interfaceC13765.mo31351(Locale.ENGLISH));
        }
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }
}
