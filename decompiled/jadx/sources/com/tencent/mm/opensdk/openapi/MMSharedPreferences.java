package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.alipay.sdk.m.u0.b;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.c;
import com.umeng.analytics.pro.aq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l.C8954;

/* JADX INFO: loaded from: classes.dex */
public class MMSharedPreferences implements SharedPreferences {
    public static final String TAG = "MicroMsg.SDK.SharedPreferences";
    public final ContentResolver cr;
    public final String[] columns = {aq.d, "key", "type", b.d};
    public final HashMap values = new HashMap();
    public REditor editor = null;

    public class REditor implements SharedPreferences.Editor {
        public ContentResolver cr;
        public Map values = new HashMap();
        public Set remove = new HashSet();
        public boolean clear = false;

        public REditor(ContentResolver contentResolver) {
            this.cr = contentResolver;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0096 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x003e A[SYNTHETIC] */
        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            String str;
            ContentValues contentValues = new ContentValues();
            if (this.clear) {
                this.cr.delete(c.b.CONTENT_URI, null, null);
                this.clear = false;
            }
            Iterator it = this.remove.iterator();
            while (it.hasNext()) {
                this.cr.delete(c.b.CONTENT_URI, "key = ?", new String[]{(String) it.next()});
            }
            Iterator it2 = this.values.entrySet().iterator();
            while (true) {
                int i = 1;
                if (!it2.hasNext()) {
                    return true;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                Object value = entry.getValue();
                if (value == null) {
                    str = "unresolve failed, null value";
                } else {
                    if (!(value instanceof Integer)) {
                        if (value instanceof Long) {
                            i = 2;
                        } else if (value instanceof String) {
                            i = 3;
                        } else if (value instanceof Boolean) {
                            i = 4;
                        } else if (value instanceof Float) {
                            i = 5;
                        } else if (value instanceof Double) {
                            i = 6;
                        } else {
                            str = "unresolve failed, unknown type=" + value.getClass().toString();
                        }
                    }
                    if (i == 0) {
                        contentValues.put("type", Integer.valueOf(i));
                        contentValues.put(b.d, value.toString());
                        this.cr.update(c.b.CONTENT_URI, contentValues, "key = ?", new String[]{(String) entry.getKey()});
                    }
                }
                Log.e("MicroMsg.SDK.PluginProvider.Resolver", str);
                i = 0;
                if (i == 0) {
                    contentValues.put("type", Integer.valueOf(i));
                    contentValues.put(b.d, value.toString());
                    this.cr.update(c.b.CONTENT_URI, contentValues, "key = ?", new String[]{(String) entry.getKey()});
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.values.put(str, Boolean.valueOf(z));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            this.values.put(str, Float.valueOf(f));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.values.put(str, Integer.valueOf(i));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.values.put(str, Long.valueOf(j));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }
    }

    public MMSharedPreferences(Context context) {
        this.cr = context.getContentResolver();
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return getValue(str) != null;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Boolean)) ? z : ((Boolean) value).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Float)) ? f : ((Float) value).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Integer)) ? i : ((Integer) value).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Long)) ? j : ((Long) value).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object value = getValue(str);
        return (value == null || !(value instanceof String)) ? str2 : (String) value;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        return null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        try {
            Cursor cursorQuery = this.cr.query(c.b.CONTENT_URI, this.columns, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("key");
            int columnIndex2 = cursorQuery.getColumnIndex("type");
            int columnIndex3 = cursorQuery.getColumnIndex(b.d);
            while (cursorQuery.moveToNext()) {
                this.values.put(cursorQuery.getString(columnIndex), c.a.a(cursorQuery.getInt(columnIndex2), cursorQuery.getString(columnIndex3)));
            }
            cursorQuery.close();
            return this.values;
        } catch (Exception e) {
            C8954.m23075(e, new StringBuilder("getAll exception:"), TAG);
            return this.values;
        }
    }

    private Object getValue(String str) {
        try {
            Cursor cursorQuery = this.cr.query(c.b.CONTENT_URI, this.columns, "key = ?", new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            Object objA = cursorQuery.moveToFirst() ? c.a.a(cursorQuery.getInt(cursorQuery.getColumnIndex("type")), cursorQuery.getString(cursorQuery.getColumnIndex(b.d))) : null;
            cursorQuery.close();
            return objA;
        } catch (Exception e) {
            C8954.m23075(e, new StringBuilder("getValue exception:"), TAG);
            return null;
        }
    }
}
