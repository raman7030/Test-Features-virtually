package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.f;
import com.umeng.commonsdk.statistics.idtracking.g;
import com.umeng.commonsdk.statistics.idtracking.h;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ZIDManager {
    public static ZIDManager c;
    public boolean a = false;
    public boolean b = false;

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ IZIDCompletionCallback b;

        public a(Context context, IZIDCompletionCallback iZIDCompletionCallback) {
            this.a = context;
            this.b = iZIDCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strA = ZIDManager.a(ZIDManager.this, this.a);
            if (TextUtils.isEmpty(strA)) {
                IZIDCompletionCallback iZIDCompletionCallback = this.b;
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1002", "获取zid失败");
                    return;
                }
                return;
            }
            IZIDCompletionCallback iZIDCompletionCallback2 = this.b;
            if (iZIDCompletionCallback2 != null) {
                iZIDCompletionCallback2.onSuccess(strA);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.a(ZIDManager.this, this.a);
        }
    }

    public static /* synthetic */ String a(ZIDManager zIDManager, Context context) {
        String strOptString = null;
        if (zIDManager.a) {
            return null;
        }
        zIDManager.a = true;
        JSONObject jSONObject = new JSONObject();
        try {
            String id = Spy.getID();
            jSONObject.put("zdata", id);
            String strB = com.umeng.umzid.c.b(context);
            jSONObject.put(g.a, strB);
            String strC = com.umeng.umzid.c.c(context);
            jSONObject.put(h.d, strC);
            zIDManager.a(context, jSONObject);
            String strA = com.umeng.umzid.a.a("https://aaid.umeng.com/api/postZdata", jSONObject.toString());
            if (!TextUtils.isEmpty(strA)) {
                JSONObject jSONObject2 = new JSONObject(strA);
                if (jSONObject2.optBoolean("suc")) {
                    com.umeng.umzid.c.f(context, id);
                    com.umeng.umzid.c.a(context, strB);
                    com.umeng.umzid.c.b(context, strC);
                    strOptString = jSONObject2.optString("aaid");
                    if (!TextUtils.isEmpty(strOptString)) {
                        com.umeng.umzid.c.e(context, strOptString);
                    }
                    String string = jSONObject2.getString("uabc");
                    if (!TextUtils.isEmpty(string)) {
                        com.umeng.umzid.c.d(context, string);
                    }
                    String string2 = jSONObject2.getString("resetToken");
                    if (!TextUtils.isEmpty(string2)) {
                        com.umeng.umzid.c.c(context, string2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        zIDManager.a = false;
        return strOptString;
    }

    public static synchronized ZIDManager getInstance() {
        if (c == null) {
            c = new ZIDManager();
        }
        return c;
    }

    public static String getSDKVersion() {
        return "1.4.1";
    }

    public synchronized String getZID(Context context) {
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        String strA = com.umeng.umzid.c.a(applicationContext);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        com.umeng.umzid.b.a(new c(applicationContext));
        return "";
    }

    public synchronized void init(Context context, String str, IZIDCompletionCallback iZIDCompletionCallback) {
        SharedPreferences sharedPreferencesA;
        SharedPreferences.Editor editorEdit;
        try {
            if (context == null) {
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1001", "传入参数Context为null");
                }
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1003", "传入参数appkey为空");
                }
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null && str != null && !TextUtils.isEmpty(str) && (sharedPreferencesA = com.umeng.umzid.a.a(applicationContext)) != null && (editorEdit = sharedPreferencesA.edit()) != null) {
                editorEdit.putString("appkey", str).commit();
            }
            String strA = com.umeng.umzid.c.a(applicationContext);
            if (strA == null || TextUtils.isEmpty(strA)) {
                com.umeng.umzid.b.a(new a(applicationContext, iZIDCompletionCallback));
            } else {
                com.umeng.umzid.b.a(new b(applicationContext));
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onSuccess(strA);
                }
            }
            SharedPreferences sharedPreferencesA2 = com.umeng.umzid.a.a(context);
            if (TextUtils.isEmpty(sharedPreferencesA2 != null ? sharedPreferencesA2.getString("uuid", "") : "")) {
                String string = "";
                SharedPreferences sharedPreferencesA3 = com.umeng.umzid.a.a(context);
                try {
                    string = UUID.randomUUID().toString();
                } catch (Throwable unused) {
                }
                if (sharedPreferencesA3 != null) {
                    sharedPreferencesA3.edit().putString("uuid", string).commit();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #6 {all -> 0x0099, blocks: (B:28:0x0082, B:29:0x0086, B:31:0x008c), top: B:116:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    public final JSONObject a(Context context, JSONObject jSONObject) throws JSONException {
        Object obj;
        Locale locale;
        Calendar calendar;
        int rawOffset;
        Object obj2;
        String string;
        Object obj3;
        Object string2;
        Object country;
        SharedPreferences sharedPreferencesA;
        jSONObject.putOpt("zdata_ver", Spy.getVersion());
        Object obj4 = "";
        try {
            String str = DeviceConfig.UNKNOW;
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getAndroidId", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(DeviceConfig.class, context);
                if (objInvoke == null || !(objInvoke instanceof String)) {
                    obj = "";
                } else {
                    obj = (String) objInvoke;
                }
            } else {
                obj = "";
            }
        } catch (Throwable unused) {
        }
        jSONObject.putOpt(com.umeng.commonsdk.statistics.idtracking.b.a, obj);
        String externalStorageState = Environment.getExternalStorageState();
        jSONObject.putOpt("storage", Long.valueOf(("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) ? Environment.getExternalStorageDirectory().getFreeSpace() : 0L));
        jSONObject.putOpt(am.y, Build.VERSION.RELEASE);
        Object string3 = null;
        if (context == null) {
            rawOffset = 8;
        } else {
            try {
                Configuration configuration = new Configuration();
                configuration.setToDefaults();
                Settings.System.getConfiguration(context.getContentResolver(), configuration);
                locale = configuration.locale;
            } catch (Throwable unused2) {
                locale = null;
            }
            if (locale == null) {
                try {
                    locale = Locale.getDefault();
                    calendar = Calendar.getInstance(locale);
                    if (calendar != null) {
                        rawOffset = calendar.getTimeZone().getRawOffset() / 3600000;
                    } else {
                        rawOffset = 8;
                    }
                } catch (Throwable unused3) {
                }
            } else {
                calendar = Calendar.getInstance(locale);
                if (calendar != null) {
                    rawOffset = calendar.getTimeZone().getRawOffset() / 3600000;
                } else {
                    rawOffset = 8;
                }
            }
        }
        jSONObject.putOpt(am.M, Integer.valueOf(rawOffset));
        jSONObject.putOpt("model", Build.MODEL);
        try {
            String str2 = DeviceConfig.UNKNOW;
            Method declaredMethod2 = DeviceConfig.class.getDeclaredMethod("getImeiNew", Context.class);
            if (declaredMethod2 != null) {
                declaredMethod2.setAccessible(true);
                Object objInvoke2 = declaredMethod2.invoke(DeviceConfig.class, context);
                if (objInvoke2 == null || !(objInvoke2 instanceof String)) {
                    obj2 = "";
                } else {
                    obj2 = (String) objInvoke2;
                }
            } else {
                obj2 = "";
            }
        } catch (Throwable unused4) {
        }
        jSONObject.putOpt(f.a, obj2);
        try {
            Method declaredMethod3 = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod3.setAccessible(true);
            string = declaredMethod3.invoke(null, "net.hostname").toString();
            if (string != null) {
                try {
                    if (!string.equalsIgnoreCase("")) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                            messageDigest.update(string.getBytes());
                            byte[] bArrDigest = messageDigest.digest();
                            StringBuffer stringBuffer = new StringBuffer();
                            for (byte b2 : bArrDigest) {
                                stringBuffer.append(Integer.toHexString(b2 & 255));
                            }
                            string = stringBuffer.toString();
                        } catch (Throwable unused5) {
                            string = "";
                        }
                    }
                } catch (Exception unused6) {
                }
            }
        } catch (Exception unused7) {
            string = null;
        }
        jSONObject.putOpt("hostname", string);
        jSONObject.putOpt("sdk_version", "1.4.1");
        jSONObject.putOpt(am.o, context == null ? null : context.getPackageName());
        jSONObject.putOpt(am.u, AnalyticsConstants.SDK_TYPE);
        SharedPreferences sharedPreferencesA2 = com.umeng.umzid.a.a(context);
        jSONObject.putOpt("uuid", sharedPreferencesA2 != null ? sharedPreferencesA2.getString("uuid", "") : "");
        jSONObject.putOpt("source_id", "umeng");
        try {
            obj3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused8) {
            obj3 = null;
        }
        jSONObject.putOpt("app_version", obj3);
        try {
            string2 = context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception unused9) {
            string2 = null;
        }
        jSONObject.putOpt("app_name", string2);
        try {
            country = context.getResources().getConfiguration().locale.getCountry();
        } catch (Exception unused10) {
            country = null;
        }
        jSONObject.putOpt(am.O, country);
        if (context != null && (sharedPreferencesA = com.umeng.umzid.a.a(context)) != null) {
            string3 = sharedPreferencesA.getString("appkey", null);
        }
        jSONObject.putOpt("appkey", string3);
        try {
            String str3 = DeviceConfig.UNKNOW;
            Method declaredMethod4 = DeviceConfig.class.getDeclaredMethod("getIdfa", Context.class);
            if (declaredMethod4 != null) {
                declaredMethod4.setAccessible(true);
                Object objInvoke3 = declaredMethod4.invoke(DeviceConfig.class, context);
                if (objInvoke3 != null && (objInvoke3 instanceof String)) {
                    obj4 = (String) objInvoke3;
                }
            }
        } catch (Throwable unused11) {
        }
        jSONObject.putOpt("gaid", obj4);
        return jSONObject;
    }

    public class b implements Runnable {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:19:0x004b  */
        /* JADX WARN: Code duplicated, block: B:28:0x0071  */
        /* JADX WARN: Code duplicated, block: B:35:0x0097  */
        /* JADX WARN: Code duplicated, block: B:44:0x00af A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #0 {all -> 0x00ff, blocks: (B:7:0x0019, B:9:0x001f, B:11:0x0026, B:14:0x0036, B:16:0x003c, B:18:0x0046, B:20:0x004c, B:23:0x005c, B:25:0x0062, B:27:0x006c, B:29:0x0072, B:32:0x008c, B:34:0x0092, B:36:0x0098, B:39:0x009f, B:41:0x00a5, B:42:0x00a9, B:44:0x00af, B:46:0x00b4, B:48:0x00c2, B:50:0x00cf, B:52:0x00e2, B:53:0x00e5, B:55:0x00ef, B:56:0x00f2, B:58:0x00fc), top: B:62:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00c2 A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:7:0x0019, B:9:0x001f, B:11:0x0026, B:14:0x0036, B:16:0x003c, B:18:0x0046, B:20:0x004c, B:23:0x005c, B:25:0x0062, B:27:0x006c, B:29:0x0072, B:32:0x008c, B:34:0x0092, B:36:0x0098, B:39:0x009f, B:41:0x00a5, B:42:0x00a9, B:44:0x00af, B:46:0x00b4, B:48:0x00c2, B:50:0x00cf, B:52:0x00e2, B:53:0x00e5, B:55:0x00ef, B:56:0x00f2, B:58:0x00fc), top: B:62:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00cf A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:7:0x0019, B:9:0x001f, B:11:0x0026, B:14:0x0036, B:16:0x003c, B:18:0x0046, B:20:0x004c, B:23:0x005c, B:25:0x0062, B:27:0x006c, B:29:0x0072, B:32:0x008c, B:34:0x0092, B:36:0x0098, B:39:0x009f, B:41:0x00a5, B:42:0x00a9, B:44:0x00af, B:46:0x00b4, B:48:0x00c2, B:50:0x00cf, B:52:0x00e2, B:53:0x00e5, B:55:0x00ef, B:56:0x00f2, B:58:0x00fc), top: B:62:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x00e2 A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:7:0x0019, B:9:0x001f, B:11:0x0026, B:14:0x0036, B:16:0x003c, B:18:0x0046, B:20:0x004c, B:23:0x005c, B:25:0x0062, B:27:0x006c, B:29:0x0072, B:32:0x008c, B:34:0x0092, B:36:0x0098, B:39:0x009f, B:41:0x00a5, B:42:0x00a9, B:44:0x00af, B:46:0x00b4, B:48:0x00c2, B:50:0x00cf, B:52:0x00e2, B:53:0x00e5, B:55:0x00ef, B:56:0x00f2, B:58:0x00fc), top: B:62:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x00ef A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:7:0x0019, B:9:0x001f, B:11:0x0026, B:14:0x0036, B:16:0x003c, B:18:0x0046, B:20:0x004c, B:23:0x005c, B:25:0x0062, B:27:0x006c, B:29:0x0072, B:32:0x008c, B:34:0x0092, B:36:0x0098, B:39:0x009f, B:41:0x00a5, B:42:0x00a9, B:44:0x00af, B:46:0x00b4, B:48:0x00c2, B:50:0x00cf, B:52:0x00e2, B:53:0x00e5, B:55:0x00ef, B:56:0x00f2, B:58:0x00fc), top: B:62:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x00fc A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #0 {all -> 0x00ff, blocks: (B:7:0x0019, B:9:0x001f, B:11:0x0026, B:14:0x0036, B:16:0x003c, B:18:0x0046, B:20:0x004c, B:23:0x005c, B:25:0x0062, B:27:0x006c, B:29:0x0072, B:32:0x008c, B:34:0x0092, B:36:0x0098, B:39:0x009f, B:41:0x00a5, B:42:0x00a9, B:44:0x00af, B:46:0x00b4, B:48:0x00c2, B:50:0x00cf, B:52:0x00e2, B:53:0x00e5, B:55:0x00ef, B:56:0x00f2, B:58:0x00fc), top: B:62:0x0019 }] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            String string;
            String id;
            String string2;
            String strC;
            String string3;
            String strB;
            String string4;
            String strA;
            JSONObject jSONObject;
            String strOptString;
            String string5;
            String string6;
            SharedPreferences sharedPreferencesA;
            SharedPreferences sharedPreferencesA2;
            SharedPreferences sharedPreferencesA3;
            SharedPreferences sharedPreferencesA4;
            ZIDManager zIDManager = ZIDManager.this;
            Context context = this.a;
            if (zIDManager.b) {
                return;
            }
            zIDManager.b = true;
            JSONObject jSONObject2 = new JSONObject();
            String string7 = "";
            if (context != null) {
                try {
                    SharedPreferences sharedPreferencesA5 = com.umeng.umzid.a.a(context);
                    if (sharedPreferencesA5 != null) {
                        string = sharedPreferencesA5.getString("zdata", null);
                    } else {
                        string = "";
                    }
                    id = Spy.getID();
                    jSONObject2.put("zdata", id);
                    jSONObject2.put("old_zdata", string);
                    if (context != null || (sharedPreferencesA4 = com.umeng.umzid.a.a(context)) == null) {
                        string2 = "";
                    } else {
                        string2 = sharedPreferencesA4.getString(h.d, "");
                        if (com.umeng.umzid.c.c(string2)) {
                            string2 = com.umeng.umzid.c.a(string2);
                        }
                    }
                    strC = com.umeng.umzid.c.c(context);
                    jSONObject2.put("old_oaid", string2);
                    jSONObject2.put(h.d, strC);
                    if (context != null || (sharedPreferencesA3 = com.umeng.umzid.a.a(context)) == null) {
                        string3 = "";
                    } else {
                        string3 = sharedPreferencesA3.getString(g.a, "");
                        if (com.umeng.umzid.c.c(string3)) {
                            string3 = com.umeng.umzid.c.a(string3);
                        }
                    }
                    strB = com.umeng.umzid.c.b(context);
                    jSONObject2.put(g.a, strB);
                    jSONObject2.put("old_mac", string3);
                    zIDManager.a(context, jSONObject2);
                    jSONObject2.put("aaid", com.umeng.umzid.c.a(context));
                    if (context != null || (sharedPreferencesA2 = com.umeng.umzid.a.a(context)) == null) {
                        string4 = "";
                    } else {
                        string4 = sharedPreferencesA2.getString("uabc", "");
                    }
                    jSONObject2.put("uabc", string4);
                    if (context != null && (sharedPreferencesA = com.umeng.umzid.a.a(context)) != null) {
                        string7 = sharedPreferencesA.getString("resetToken", "");
                    }
                    if (!TextUtils.isEmpty(string7)) {
                        jSONObject2.put("resetToken", string7);
                    }
                    strA = com.umeng.umzid.a.a("https://aaid.umeng.com/api/updateZdata", jSONObject2.toString());
                    if (!TextUtils.isEmpty(strA)) {
                        jSONObject = new JSONObject(strA);
                        if (jSONObject.optBoolean("suc")) {
                            com.umeng.umzid.c.f(context, id);
                            com.umeng.umzid.c.a(context, strB);
                            com.umeng.umzid.c.b(context, strC);
                            strOptString = jSONObject.optString("aaid");
                            if (!TextUtils.isEmpty(strOptString)) {
                                com.umeng.umzid.c.e(context, strOptString);
                            }
                            string5 = jSONObject.getString("uabc");
                            if (!TextUtils.isEmpty(string5)) {
                                com.umeng.umzid.c.d(context, string5);
                            }
                            string6 = jSONObject.getString("resetToken");
                            if (!TextUtils.isEmpty(string6)) {
                                com.umeng.umzid.c.c(context, string6);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else {
                string = "";
                id = Spy.getID();
                jSONObject2.put("zdata", id);
                jSONObject2.put("old_zdata", string);
                if (context != null) {
                    string2 = "";
                } else {
                    string2 = "";
                }
                strC = com.umeng.umzid.c.c(context);
                jSONObject2.put("old_oaid", string2);
                jSONObject2.put(h.d, strC);
                if (context != null) {
                    string3 = "";
                } else {
                    string3 = "";
                }
                strB = com.umeng.umzid.c.b(context);
                jSONObject2.put(g.a, strB);
                jSONObject2.put("old_mac", string3);
                zIDManager.a(context, jSONObject2);
                jSONObject2.put("aaid", com.umeng.umzid.c.a(context));
                if (context != null) {
                    string4 = "";
                } else {
                    string4 = "";
                }
                jSONObject2.put("uabc", string4);
                if (context != null) {
                    string7 = sharedPreferencesA.getString("resetToken", "");
                }
                if (!TextUtils.isEmpty(string7)) {
                    jSONObject2.put("resetToken", string7);
                }
                strA = com.umeng.umzid.a.a("https://aaid.umeng.com/api/updateZdata", jSONObject2.toString());
                if (!TextUtils.isEmpty(strA)) {
                    jSONObject = new JSONObject(strA);
                    if (jSONObject.optBoolean("suc")) {
                        com.umeng.umzid.c.f(context, id);
                        com.umeng.umzid.c.a(context, strB);
                        com.umeng.umzid.c.b(context, strC);
                        strOptString = jSONObject.optString("aaid");
                        if (!TextUtils.isEmpty(strOptString)) {
                            com.umeng.umzid.c.e(context, strOptString);
                        }
                        string5 = jSONObject.getString("uabc");
                        if (!TextUtils.isEmpty(string5)) {
                            com.umeng.umzid.c.d(context, string5);
                        }
                        string6 = jSONObject.getString("resetToken");
                        if (!TextUtils.isEmpty(string6)) {
                            com.umeng.umzid.c.c(context, string6);
                        }
                    }
                }
            }
            zIDManager.b = false;
        }
    }
}
