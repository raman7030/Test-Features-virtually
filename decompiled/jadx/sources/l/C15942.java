package l;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15942 implements InterfaceC7961, InterfaceC16724, InterfaceC21423 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49230;

    public /* synthetic */ C15942(int i) {
        this.f49230 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37718(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Map m37719() {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("X-Content-Type-Options", "nosniff"), new AbstractMap.SimpleEntry("Cache-Control", "private, max-age=31536000")};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            C11003.requireNonNull(key);
            Object value = entry.getValue();
            C11003.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(C5368.m15337(key, "duplicate key: "));
            }
        }
        return C20195.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37720(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        switch (this.f49230) {
            case 0:
                int i = ActivityC17169.f52595;
                ((Throwable) obj).getClass();
                return null;
            case 6:
                return Integer.valueOf(((C13312) obj).f39853);
            case 8:
                int i2 = C22477.f72782;
                return null;
            default:
                InterfaceC11991 interfaceC11991 = (InterfaceC11991) obj;
                return C19322.m44518((int) interfaceC11991.getLineNumber(), (int) interfaceC11991.getColumnNumber(), interfaceC11991.mo29296(Locale.ENGLISH));
        }
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }
}
