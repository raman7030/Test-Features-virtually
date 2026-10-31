package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩻ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6YT */
/* JADX INFO: loaded from: classes.dex */
public final class C23842 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Set f77160;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Set f77161;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Set f77162;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f77163;

    static {
        String[] strArr = {"console.asyncRender", "console.jsExecution", "console.catchGlobalErr", "console.overrideConsole", "console.displayIfErr", "console.displayExtraInfo", "console.displayUnenumerable", "console.displayGetterVal", "console.lazyEvaluation", "elements.overrideEventTarget", "resources.observeElement", "sources.showLineNum"};
        HashSet hashSet = new HashSet(12);
        for (int i = 0; i < 12; i++) {
            String str = strArr[i];
            C11003.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f77160 = C20195.unmodifiableSet(hashSet);
        String[] strArr2 = {"System preference", "Light", "Dark", "Material Oceanic", "Material Darker", "Material Lighter", "Material Palenight", "Material Deep Ocean", "Monokai Pro", "Dracula", "Arc Dark", "Atom One Dark", "Atom One Light", "Solarized Dark", "Solarized Light", "Github", "Night Owl", "Light Owl", "AMOLED"};
        HashSet hashSet2 = new HashSet(19);
        for (int i2 = 0; i2 < 19; i2++) {
            String str2 = strArr2[i2];
            C11003.requireNonNull(str2);
            if (!hashSet2.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        f77162 = C20195.unmodifiableSet(hashSet2);
        Object[] objArr = {"infinite", "250", "125", "100", "50", "10"};
        HashSet hashSet3 = new HashSet(6);
        for (int i3 = 0; i3 < 6; i3++) {
            Object obj = objArr[i3];
            C11003.requireNonNull(obj);
            if (!hashSet3.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f77161 = C20195.unmodifiableSet(hashSet3);
    }

    public C23842(InterfaceC12344 interfaceC12344) {
        this.f77163 = interfaceC12344;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m52553() {
        JSONObject jSONObjectM52550;
        synchronized (this.f77163) {
            jSONObjectM52550 = m52550();
        }
        return jSONObjectM52550;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private JSONObject m52550() {
        JSONObject jSONObject = new JSONObject();
        String string = this.f77163.getString("hpic", "{}");
        if (string.length() <= 4096) {
            try {
                JSONObject jSONObject2 = new JSONObject(string);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (m52549(obj, next)) {
                        jSONObject.put(next, obj);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52554(String str) {
        boolean zM52551;
        if (str == null || str.length() > 512) {
            return false;
        }
        synchronized (this.f77163) {
            zM52551 = m52551(str);
        }
        return zM52551;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m52551(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 1 && "reset".equals(jSONArray.get(0))) {
                return m52552(null);
            }
            if (jSONArray.length() == 4 && "set".equals(jSONArray.get(0)) && (jSONArray.get(1) instanceof String) && (jSONArray.get(2) instanceof String)) {
                String str2 = jSONArray.getString(1) + "." + jSONArray.getString(2);
                Object obj = jSONArray.get(3);
                if (!m52549(obj, str2)) {
                    return false;
                }
                JSONObject jSONObjectM52550 = m52550();
                if (obj.equals(jSONObjectM52550.opt(str2))) {
                    return true;
                }
                jSONObjectM52550.put(str2, obj);
                return m52552(jSONObjectM52550.toString());
            }
            return false;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m52552(String str) {
        InterfaceC12344 interfaceC12344 = this.f77163;
        String string = interfaceC12344.getString("hpic", null);
        if (interfaceC12344.edit().putString("hpic", str).commit()) {
            return true;
        }
        interfaceC12344.edit().putString("hpic", string).commit();
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52549(Object obj, String str) {
        if (f77160.contains(str)) {
            return obj instanceof Boolean;
        }
        if (str.equals("dev-tools.theme")) {
            return (obj instanceof String) && f77162.contains(obj);
        }
        if (str.equals("console.maxLogNum")) {
            return (obj instanceof String) && f77161.contains(obj);
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
