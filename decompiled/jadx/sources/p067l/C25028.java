package p067l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩻ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6YT */
/* JADX INFO: loaded from: classes.dex */
public final class C25028 {

    /* JADX INFO: renamed from: ۧ */
    public static final Set f79910;

    /* JADX INFO: renamed from: ܽ */
    public static final Set f79911;

    /* JADX INFO: renamed from: ᩳ */
    public static final Set f79912;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14100 f79913;

    static {
        String[] strArr = {"console.asyncRender", "console.jsExecution", "console.catchGlobalErr", "console.overrideConsole", "console.displayIfErr", "console.displayExtraInfo", "console.displayUnenumerable", "console.displayGetterVal", "console.lazyEvaluation", "elements.overrideEventTarget", "resources.observeElement", "sources.showLineNum"};
        HashSet hashSet = new HashSet(12);
        for (int i = 0; i < 12; i++) {
            String str = strArr[i];
            C12826.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f79910 = C21562.unmodifiableSet(hashSet);
        String[] strArr2 = {"System preference", "Light", "Dark", "Material Oceanic", "Material Darker", "Material Lighter", "Material Palenight", "Material Deep Ocean", "Monokai Pro", "Dracula", "Arc Dark", "Atom One Dark", "Atom One Light", "Solarized Dark", "Solarized Light", "Github", "Night Owl", "Light Owl", "AMOLED"};
        HashSet hashSet2 = new HashSet(19);
        for (int i2 = 0; i2 < 19; i2++) {
            String str2 = strArr2[i2];
            C12826.requireNonNull(str2);
            if (!hashSet2.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        f79912 = C21562.unmodifiableSet(hashSet2);
        Object[] objArr = {"infinite", "250", "125", "100", "50", "10"};
        HashSet hashSet3 = new HashSet(6);
        for (int i3 = 0; i3 < 6; i3++) {
            Object obj = objArr[i3];
            C12826.requireNonNull(obj);
            if (!hashSet3.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        f79911 = C21562.unmodifiableSet(hashSet3);
    }

    public C25028(InterfaceC14100 interfaceC14100) {
        this.f79913 = interfaceC14100;
    }

    /* JADX INFO: renamed from: ֫ */
    public final JSONObject m54962() {
        JSONObject jSONObjectM54959;
        synchronized (this.f79913) {
            jSONObjectM54959 = m54959();
        }
        return jSONObjectM54959;
    }

    /* JADX INFO: renamed from: ۧ */
    private JSONObject m54959() {
        JSONObject jSONObject = new JSONObject();
        String string = this.f79913.getString("hpic", "{}");
        if (string.length() <= 4096) {
            try {
                JSONObject jSONObject2 = new JSONObject(string);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (m54958(obj, next)) {
                        jSONObject.put(next, obj);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54963(String str) {
        boolean zM54960;
        if (str == null || str.length() > 512) {
            return false;
        }
        synchronized (this.f79913) {
            zM54960 = m54960(str);
        }
        return zM54960;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m54960(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 1 && "reset".equals(jSONArray.get(0))) {
                return m54961(null);
            }
            if (jSONArray.length() == 4 && "set".equals(jSONArray.get(0)) && (jSONArray.get(1) instanceof String) && (jSONArray.get(2) instanceof String)) {
                String str2 = jSONArray.getString(1) + "." + jSONArray.getString(2);
                Object obj = jSONArray.get(3);
                if (!m54958(obj, str2)) {
                    return false;
                }
                JSONObject jSONObjectM54959 = m54959();
                if (obj.equals(jSONObjectM54959.opt(str2))) {
                    return true;
                }
                jSONObjectM54959.put(str2, obj);
                return m54961(jSONObjectM54959.toString());
            }
            return false;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m54961(String str) {
        InterfaceC14100 interfaceC14100 = this.f79913;
        String string = interfaceC14100.getString("hpic", null);
        if (interfaceC14100.edit().putString("hpic", str).commit()) {
            return true;
        }
        interfaceC14100.edit().putString("hpic", string).commit();
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54958(Object obj, String str) {
        if (f79910.contains(str)) {
            return obj instanceof Boolean;
        }
        if (str.equals("dev-tools.theme")) {
            return (obj instanceof String) && f79912.contains(obj);
        }
        if (str.equals("console.maxLogNum")) {
            return (obj instanceof String) && f79911.contains(obj);
        }
        if (!(obj instanceof Number)) {
            return false;
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
            if (str.equals("dev-tools.transparency")) {
                return dDoubleValue >= 0.2d && dDoubleValue <= 1.0d;
            }
            if (str.equals("dev-tools.displaySize") && dDoubleValue >= 40.0d && dDoubleValue <= 100.0d) {
                return true;
            }
        }
        return false;
    }
}
