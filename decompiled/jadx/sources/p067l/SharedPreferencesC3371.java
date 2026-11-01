package p067l;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97B5 */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesC3371 implements SharedPreferences {

    /* JADX INFO: renamed from: ᩳ */
    public static final Object f6659 = new Object();

    /* JADX INFO: renamed from: ۧ */
    public final Object f6661 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f6662 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashSet f6660 = new LinkedHashSet();

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        Map mapUnmodifiableMap;
        synchronized (this.f6661) {
            HashMap map = new HashMap(this.f6662.size());
            for (Map.Entry entry : this.f6662.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Set) {
                    value = new HashSet((Set) value);
                }
                map.put(str, value);
            }
            mapUnmodifiableMap = C21562.unmodifiableMap(map);
        }
        return mapUnmodifiableMap;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        synchronized (this.f6661) {
            Object obj = this.f6662.get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        synchronized (this.f6661) {
            Object obj = this.f6662.get(str);
            if (!(obj instanceof Set)) {
                return set;
            }
            return new HashSet((Set) obj);
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        synchronized (this.f6661) {
            Object obj = this.f6662.get(str);
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
            }
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        synchronized (this.f6661) {
            Object obj = this.f6662.get(str);
            if (obj instanceof Long) {
                j = ((Long) obj).longValue();
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        synchronized (this.f6661) {
            Object obj = this.f6662.get(str);
            if (obj instanceof Float) {
                f = ((Float) obj).floatValue();
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        synchronized (this.f6661) {
            Object obj = this.f6662.get(str);
            if (obj instanceof Boolean) {
                z = ((Boolean) obj).booleanValue();
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        boolean zContainsKey;
        synchronized (this.f6661) {
            zContainsKey = this.f6662.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC7395(this);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f6661) {
            this.f6660.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f6661) {
            this.f6660.remove(onSharedPreferenceChangeListener);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5897(SharedPreferencesC3371 sharedPreferencesC3371, boolean z, HashMap map) {
        ArrayList<String> arrayList = new ArrayList();
        synchronized (sharedPreferencesC3371.f6661) {
            if (z) {
                if (!sharedPreferencesC3371.f6662.isEmpty()) {
                    arrayList.addAll(sharedPreferencesC3371.f6662.keySet());
                    sharedPreferencesC3371.f6662.clear();
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != f6659) {
                    if (value instanceof Set) {
                        value = new HashSet((Set) value);
                    }
                    if (!C12826.equals(sharedPreferencesC3371.f6662.put(str, value), value)) {
                        arrayList.add(str);
                    }
                } else if (sharedPreferencesC3371.f6662.containsKey(str)) {
                    sharedPreferencesC3371.f6662.remove(str);
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty() && !sharedPreferencesC3371.f6660.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(sharedPreferencesC3371.f6660);
                for (String str2 : arrayList) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((SharedPreferences.OnSharedPreferenceChangeListener) it.next()).onSharedPreferenceChanged(sharedPreferencesC3371, str2);
                    }
                }
            }
        }
    }
}
