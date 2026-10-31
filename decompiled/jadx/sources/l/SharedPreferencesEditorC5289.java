package l;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97B5 */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesEditorC5289 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f16525;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f16526 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ SharedPreferencesC1055 f16527;

    public SharedPreferencesEditorC5289(SharedPreferencesC1055 sharedPreferencesC1055) {
        this.f16527 = sharedPreferencesC1055;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            remove(str);
            return this;
        }
        this.f16526.put(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            remove(str);
            return this;
        }
        this.f16526.put(str, new HashSet(set));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        this.f16526.put(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        this.f16526.put(str, Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        this.f16526.put(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        this.f16526.put(str, Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f16526.put(str, SharedPreferencesC1055.f3888);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f16525 = true;
        this.f16526.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        SharedPreferencesC1055.m3626(this.f16527, this.f16525, new HashMap(this.f16526));
        return true;
    }
}
