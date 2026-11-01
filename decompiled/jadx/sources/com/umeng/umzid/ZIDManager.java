package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.C0803b;
import com.umeng.commonsdk.statistics.idtracking.C0807f;
import com.umeng.commonsdk.statistics.idtracking.C0808g;
import com.umeng.commonsdk.statistics.idtracking.C0809h;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ZIDManager {

    /* JADX INFO: renamed from: c */
    public static ZIDManager f3672c;

    /* JADX INFO: renamed from: a */
    public boolean f3673a = false;

    /* JADX INFO: renamed from: b */
    public boolean f3674b = false;

    /* JADX INFO: renamed from: com.umeng.umzid.ZIDManager$a */
    public class RunnableC0836a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3675a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ IZIDCompletionCallback f3676b;

        public RunnableC0836a(Context context, IZIDCompletionCallback iZIDCompletionCallback) {
            this.f3675a = context;
            this.f3676b = iZIDCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM3323a = ZIDManager.m3323a(ZIDManager.this, this.f3675a);
            if (TextUtils.isEmpty(strM3323a)) {
                IZIDCompletionCallback iZIDCompletionCallback = this.f3676b;
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1002", "获取zid失败");
                    return;
                }
                return;
            }
            IZIDCompletionCallback iZIDCompletionCallback2 = this.f3676b;
            if (iZIDCompletionCallback2 != null) {
                iZIDCompletionCallback2.onSuccess(strM3323a);
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.umzid.ZIDManager$c */
    public class RunnableC0838c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3680a;

        public RunnableC0838c(Context context) {
            this.f3680a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.m3323a(ZIDManager.this, this.f3680a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m3323a(ZIDManager zIDManager, Context context) {
        String strOptString = null;
        if (zIDManager.f3673a) {
            return null;
        }
        zIDManager.f3673a = true;
        JSONObject jSONObject = new JSONObject();
        try {
            String id = Spy.getID();
            jSONObject.put("zdata", id);
            String strM3332b = C0841c.m3332b(context);
            jSONObject.put(C0808g.f3432a, strM3332b);
            String strM3335c = C0841c.m3335c(context);
            jSONObject.put(C0809h.f3437d, strM3335c);
            zIDManager.m3324a(context, jSONObject);
            String strM3326a = C0839a.m3326a("https://aaid.umeng.com/api/postZdata", jSONObject.toString());
            if (!TextUtils.isEmpty(strM3326a)) {
                JSONObject jSONObject2 = new JSONObject(strM3326a);
                if (jSONObject2.optBoolean("suc")) {
                    C0841c.m3340f(context, id);
                    C0841c.m3331a(context, strM3332b);
                    C0841c.m3334b(context, strM3335c);
                    strOptString = jSONObject2.optString("aaid");
                    if (!TextUtils.isEmpty(strOptString)) {
                        C0841c.m3339e(context, strOptString);
                    }
                    String string = jSONObject2.getString("uabc");
                    if (!TextUtils.isEmpty(string)) {
                        C0841c.m3338d(context, string);
                    }
                    String string2 = jSONObject2.getString("resetToken");
                    if (!TextUtils.isEmpty(string2)) {
                        C0841c.m3336c(context, string2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        zIDManager.f3673a = false;
        return strOptString;
    }

    public static synchronized ZIDManager getInstance() {
        if (f3672c == null) {
            f3672c = new ZIDManager();
        }
        return f3672c;
    }

    public static String getSDKVersion() {
        return "1.4.1";
    }

    public synchronized String getZID(Context context) {
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        String strM3329a = C0841c.m3329a(applicationContext);
        if (!TextUtils.isEmpty(strM3329a)) {
            return strM3329a;
        }
        C0840b.m3328a(new RunnableC0838c(applicationContext));
        return "";
    }

    public synchronized void init(Context context, String str, IZIDCompletionCallback iZIDCompletionCallback) {
        SharedPreferences sharedPreferencesM3325a;
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
            if (applicationContext != null && str != null && !TextUtils.isEmpty(str) && (sharedPreferencesM3325a = C0839a.m3325a(applicationContext)) != null && (editorEdit = sharedPreferencesM3325a.edit()) != null) {
                editorEdit.putString("appkey", str).commit();
            }
            String strM3329a = C0841c.m3329a(applicationContext);
            if (strM3329a == null || TextUtils.isEmpty(strM3329a)) {
                C0840b.m3328a(new RunnableC0836a(applicationContext, iZIDCompletionCallback));
            } else {
                C0840b.m3328a(new RunnableC0837b(applicationContext));
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onSuccess(strM3329a);
                }
            }
            SharedPreferences sharedPreferencesM3325a2 = C0839a.m3325a(context);
            if (TextUtils.isEmpty(sharedPreferencesM3325a2 != null ? sharedPreferencesM3325a2.getString("uuid", "") : "")) {
                String string = "";
                SharedPreferences sharedPreferencesM3325a3 = C0839a.m3325a(context);
                try {
                    string = UUID.randomUUID().toString();
                } catch (Throwable unused) {
                }
                if (sharedPreferencesM3325a3 != null) {
                    sharedPreferencesM3325a3.edit().putString("uuid", string).commit();
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
    /* JADX INFO: renamed from: a */
    public final JSONObject m3324a(Context context, JSONObject jSONObject) throws JSONException {
        Object obj;
        Locale locale;
        Calendar calendar;
        int rawOffset;
        Object obj2;
        String string;
        Object obj3;
        Object string2;
        Object country;
        SharedPreferences sharedPreferencesM3325a;
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
        jSONObject.putOpt(C0803b.f3412a, obj);
        String externalStorageState = Environment.getExternalStorageState();
        jSONObject.putOpt("storage", Long.valueOf(("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) ? Environment.getExternalStorageDirectory().getFreeSpace() : 0L));
        jSONObject.putOpt(C0655am.f2364y, Build.VERSION.RELEASE);
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
        jSONObject.putOpt(C0655am.f2258M, Integer.valueOf(rawOffset));
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
        jSONObject.putOpt(C0807f.f3430a, obj2);
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
                            for (byte b : bArrDigest) {
                                stringBuffer.append(Integer.toHexString(b & 255));
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
        jSONObject.putOpt(C0655am.f2354o, context == null ? null : context.getPackageName());
        jSONObject.putOpt(C0655am.f2360u, AnalyticsConstants.SDK_TYPE);
        SharedPreferences sharedPreferencesM3325a2 = C0839a.m3325a(context);
        jSONObject.putOpt("uuid", sharedPreferencesM3325a2 != null ? sharedPreferencesM3325a2.getString("uuid", "") : "");
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
        jSONObject.putOpt(C0655am.f2260O, country);
        if (context != null && (sharedPreferencesM3325a = C0839a.m3325a(context)) != null) {
            string3 = sharedPreferencesM3325a.getString("appkey", null);
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

    /* JADX INFO: renamed from: com.umeng.umzid.ZIDManager$b */
    public class RunnableC0837b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3678a;

        public RunnableC0837b(Context context) {
            this.f3678a = context;
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
            String strM3335c;
            String string3;
            String strM3332b;
            String string4;
            String strM3326a;
            JSONObject jSONObject;
            String strOptString;
            String string5;
            String string6;
            SharedPreferences sharedPreferencesM3325a;
            SharedPreferences sharedPreferencesM3325a2;
            SharedPreferences sharedPreferencesM3325a3;
            SharedPreferences sharedPreferencesM3325a4;
            ZIDManager zIDManager = ZIDManager.this;
            Context context = this.f3678a;
            if (zIDManager.f3674b) {
                return;
            }
            zIDManager.f3674b = true;
            JSONObject jSONObject2 = new JSONObject();
            String string7 = "";
            if (context != null) {
                try {
                    SharedPreferences sharedPreferencesM3325a5 = C0839a.m3325a(context);
                    if (sharedPreferencesM3325a5 != null) {
                        string = sharedPreferencesM3325a5.getString("zdata", null);
                    } else {
                        string = "";
                    }
                    id = Spy.getID();
                    jSONObject2.put("zdata", id);
                    jSONObject2.put("old_zdata", string);
                    if (context != null || (sharedPreferencesM3325a4 = C0839a.m3325a(context)) == null) {
                        string2 = "";
                    } else {
                        string2 = sharedPreferencesM3325a4.getString(C0809h.f3437d, "");
                        if (C0841c.m3337c(string2)) {
                            string2 = C0841c.m3330a(string2);
                        }
                    }
                    strM3335c = C0841c.m3335c(context);
                    jSONObject2.put("old_oaid", string2);
                    jSONObject2.put(C0809h.f3437d, strM3335c);
                    if (context != null || (sharedPreferencesM3325a3 = C0839a.m3325a(context)) == null) {
                        string3 = "";
                    } else {
                        string3 = sharedPreferencesM3325a3.getString(C0808g.f3432a, "");
                        if (C0841c.m3337c(string3)) {
                            string3 = C0841c.m3330a(string3);
                        }
                    }
                    strM3332b = C0841c.m3332b(context);
                    jSONObject2.put(C0808g.f3432a, strM3332b);
                    jSONObject2.put("old_mac", string3);
                    zIDManager.m3324a(context, jSONObject2);
                    jSONObject2.put("aaid", C0841c.m3329a(context));
                    if (context != null || (sharedPreferencesM3325a2 = C0839a.m3325a(context)) == null) {
                        string4 = "";
                    } else {
                        string4 = sharedPreferencesM3325a2.getString("uabc", "");
                    }
                    jSONObject2.put("uabc", string4);
                    if (context != null && (sharedPreferencesM3325a = C0839a.m3325a(context)) != null) {
                        string7 = sharedPreferencesM3325a.getString("resetToken", "");
                    }
                    if (!TextUtils.isEmpty(string7)) {
                        jSONObject2.put("resetToken", string7);
                    }
                    strM3326a = C0839a.m3326a("https://aaid.umeng.com/api/updateZdata", jSONObject2.toString());
                    if (!TextUtils.isEmpty(strM3326a)) {
                        jSONObject = new JSONObject(strM3326a);
                        if (jSONObject.optBoolean("suc")) {
                            C0841c.m3340f(context, id);
                            C0841c.m3331a(context, strM3332b);
                            C0841c.m3334b(context, strM3335c);
                            strOptString = jSONObject.optString("aaid");
                            if (!TextUtils.isEmpty(strOptString)) {
                                C0841c.m3339e(context, strOptString);
                            }
                            string5 = jSONObject.getString("uabc");
                            if (!TextUtils.isEmpty(string5)) {
                                C0841c.m3338d(context, string5);
                            }
                            string6 = jSONObject.getString("resetToken");
                            if (!TextUtils.isEmpty(string6)) {
                                C0841c.m3336c(context, string6);
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
                strM3335c = C0841c.m3335c(context);
                jSONObject2.put("old_oaid", string2);
                jSONObject2.put(C0809h.f3437d, strM3335c);
                if (context != null) {
                    string3 = "";
                } else {
                    string3 = "";
                }
                strM3332b = C0841c.m3332b(context);
                jSONObject2.put(C0808g.f3432a, strM3332b);
                jSONObject2.put("old_mac", string3);
                zIDManager.m3324a(context, jSONObject2);
                jSONObject2.put("aaid", C0841c.m3329a(context));
                if (context != null) {
                    string4 = "";
                } else {
                    string4 = "";
                }
                jSONObject2.put("uabc", string4);
                if (context != null) {
                    string7 = sharedPreferencesM3325a.getString("resetToken", "");
                }
                if (!TextUtils.isEmpty(string7)) {
                    jSONObject2.put("resetToken", string7);
                }
                strM3326a = C0839a.m3326a("https://aaid.umeng.com/api/updateZdata", jSONObject2.toString());
                if (!TextUtils.isEmpty(strM3326a)) {
                    jSONObject = new JSONObject(strM3326a);
                    if (jSONObject.optBoolean("suc")) {
                        C0841c.m3340f(context, id);
                        C0841c.m3331a(context, strM3332b);
                        C0841c.m3334b(context, strM3335c);
                        strOptString = jSONObject.optString("aaid");
                        if (!TextUtils.isEmpty(strOptString)) {
                            C0841c.m3339e(context, strOptString);
                        }
                        string5 = jSONObject.getString("uabc");
                        if (!TextUtils.isEmpty(string5)) {
                            C0841c.m3338d(context, string5);
                        }
                        string6 = jSONObject.getString("resetToken");
                        if (!TextUtils.isEmpty(string6)) {
                            C0841c.m3336c(context, string6);
                        }
                    }
                }
            }
            zIDManager.f3674b = false;
        }
    }
}
