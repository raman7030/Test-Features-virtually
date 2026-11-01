package p067l;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97B5 */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesEditorC7395 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: ֫ */
    public boolean f19362;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f19363 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ SharedPreferencesC3371 f19364;

    public SharedPreferencesEditorC7395(SharedPreferencesC3371 sharedPreferencesC3371) {
        this.f19364 = sharedPreferencesC3371;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            remove(str);
            return this;
        }
        this.f19363.put(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            remove(str);
            return this;
        }
        this.f19363.put(str, new HashSet(set));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        this.f19363.put(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        this.f19363.put(str, Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        this.f19363.put(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        this.f19363.put(str, Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f19363.put(str, SharedPreferencesC3371.f6659);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f19362 = true;
        this.f19363.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        SharedPreferencesC3371.m5897(this.f19364, this.f19362, new HashMap(this.f19363));
        return true;
    }
}
