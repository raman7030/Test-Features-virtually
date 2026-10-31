package l;

import android.app.Application;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 618F */
/* JADX INFO: loaded from: classes4.dex */
public final class C19739 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList f63769;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C5242 f63770 = new C5242();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f63771;

    /* JADX WARN: Code duplicated, block: B:100:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0181 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2 A[Catch: Exception -> 0x0101, all -> 0x0254, TryCatch #3 {Exception -> 0x0101, blocks: (B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6), top: B:90:0x0081, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0104 A[DONT_INVERT, PHI: r2
      0x0104: PHI (r2v4 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v3 boolean) binds: [B:21:0x007f, B:36:0x0101, B:35:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x013c A[Catch: Exception -> 0x0186, all -> 0x0254, TryCatch #2 {Exception -> 0x0186, blocks: (B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e), top: B:88:0x0106, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x015e A[Catch: Exception -> 0x0186, all -> 0x0254, TryCatch #2 {Exception -> 0x0186, blocks: (B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e), top: B:88:0x0106, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0189 A[DONT_INVERT, PHI: r2
      0x0189: PHI (r2v6 boolean) = (r2v4 boolean), (r2v4 boolean), (r2v5 boolean) binds: [B:37:0x0104, B:49:0x0186, B:48:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x018b A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0196 A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ae A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2 A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0231 A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0243 A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01be A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ca A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized List m45452(String str) {
        boolean z;
        Method method;
        int iIntValue;
        Method method2;
        Method method3;
        Method method4;
        Object objInvoke;
        int length;
        int i;
        boolean zBooleanValue;
        ArrayList arrayList;
        Iterator it;
        boolean z2;
        C4216 c4216;
        String str2;
        String strM14327;
        ArrayList arrayList2 = new ArrayList();
        Application applicationM14335 = C4925.m14335();
        StorageManager storageManager = (StorageManager) applicationM14335.getSystemService("storage");
        C11003.requireNonNull(storageManager);
        C4216 c4217 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
                Method method5 = StorageVolume.class.getMethod("getPath", null);
                Iterator<StorageVolume> it2 = storageVolumes.iterator();
                while (it2.hasNext()) {
                    StorageVolume storageVolumeM19187 = C7166.m19187(it2.next());
                    if (storageVolumeM19187.isRemovable() && ("mounted".equals(storageVolumeM19187.getState()) || "mounted_ro".equals(storageVolumeM19187.getState()))) {
                        String str3 = (String) method5.invoke(storageVolumeM19187, null);
                        C11003.requireNonNull(str3);
                        arrayList2.add(new C4216(new File(str3), storageVolumeM19187.getUuid(), storageVolumeM19187.getDescription(applicationM14335)));
                    }
                }
                z = true;
            } catch (Exception unused) {
                arrayList2.clear();
                z = false;
            }
            if (!z) {
                try {
                    Method method6 = storageManager.getClass().getMethod("getVolumes", null);
                    Class<?> cls = Class.forName("android.os.storage.VolumeInfo");
                    method = cls.getMethod("getType", null);
                    Method method7 = cls.getMethod("getPath", null);
                    Method method8 = cls.getMethod("getDescription", null);
                    Method method9 = cls.getMethod("getState", null);
                    Method method10 = cls.getMethod("getFsUuid", null);
                    List list = (List) method6.invoke(storageManager, null);
                    C11003.requireNonNull(list);
                    for (Object obj : list) {
                        if (((Integer) method.invoke(obj, null)).intValue() != 0 && ((iIntValue = ((Integer) method9.invoke(obj, null)).intValue()) == 2 || iIntValue == 3)) {
                            File file = (File) method7.invoke(obj, null);
                            String str4 = (String) method8.invoke(obj, null);
                            String str5 = (String) method10.invoke(obj, null);
                            if (file != null) {
                                arrayList2.add(new C4216(file, str5, str4));
                            } else {
                                continue;
                            }
                        }
                    }
                    z = true;
                } catch (Exception unused2) {
                    arrayList2.clear();
                }
                if (!z) {
                    try {
                        Method method11 = storageManager.getClass().getMethod("getVolumeList", null);
                        Class<?> cls2 = Class.forName("android.os.storage.StorageVolume");
                        method2 = cls2.getMethod("getPath", null);
                        method3 = cls2.getMethod("isRemovable", null);
                        method4 = cls2.getMethod("getState", null);
                        Method method12 = cls2.getMethod("getUuid", null);
                        objInvoke = method11.invoke(storageManager, null);
                        C11003.requireNonNull(objInvoke);
                        length = Array.getLength(objInvoke);
                        for (i = 0; i < length; i++) {
                            Object obj2 = Array.get(objInvoke, i);
                            String str6 = (String) method2.invoke(obj2, null);
                            C11003.requireNonNull(str6);
                            Object objInvoke2 = method3.invoke(obj2, null);
                            C11003.requireNonNull(objInvoke2);
                            zBooleanValue = ((Boolean) objInvoke2).booleanValue();
                            String str7 = (String) method4.invoke(obj2, null);
                            if (!zBooleanValue && ("mounted".equals(str7) || "mounted_ro".equals(str7))) {
                                arrayList2.add(new C4216(new File(str6), (String) method12.invoke(obj2, null)));
                            }
                        }
                        z = true;
                    } catch (Exception unused3) {
                        arrayList2.clear();
                    }
                    if (z) {
                        it = arrayList2.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            c4216 = (C4216) it.next();
                            if (C16999.m39887(c4216.f13687.getPath())) {
                                it.remove();
                            } else if (str == null && str.equalsIgnoreCase(c4216.f13687.getAbsolutePath())) {
                                it.remove();
                            } else {
                                str2 = c4216.f13686;
                                if (str2 != null || str2.length() > 12) {
                                    strM14327 = C4925.m14327(R.string.MT_Protector);
                                    if (z2) {
                                        c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                    } else if (c4217 == null) {
                                        c4216.f13686 = strM14327;
                                        c4217 = c4216;
                                    } else {
                                        c4217.f13686 = strM14327 + ' ' + c4217.f13687.getName();
                                        c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = f63769;
                    if (arrayList != null || arrayList.size() != arrayList2.size() || !f63769.containsAll(arrayList2)) {
                        C5242 c5242 = f63770;
                        f63769 = arrayList2;
                        c5242.mo1664(arrayList2);
                        f63771++;
                    }
                } else {
                    if (z) {
                        it = arrayList2.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            c4216 = (C4216) it.next();
                            if (C16999.m39887(c4216.f13687.getPath())) {
                                it.remove();
                            } else {
                                if (str == null) {
                                }
                                str2 = c4216.f13686;
                                if (str2 != null) {
                                }
                                strM14327 = C4925.m14327(R.string.MT_Protector);
                                if (z2) {
                                    c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                } else if (c4217 == null) {
                                    c4216.f13686 = strM14327;
                                    c4217 = c4216;
                                } else {
                                    c4217.f13686 = strM14327 + ' ' + c4217.f13687.getName();
                                    c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                    z2 = true;
                                }
                            }
                        }
                    }
                    arrayList = f63769;
                    if (arrayList != null) {
                        C5242 c5243 = f63770;
                        f63769 = arrayList2;
                        c5243.mo1664(arrayList2);
                        f63771++;
                    } else {
                        C5242 c5244 = f63770;
                        f63769 = arrayList2;
                        c5244.mo1664(arrayList2);
                        f63771++;
                    }
                }
            } else if (!z) {
                Method method13 = storageManager.getClass().getMethod("getVolumeList", null);
                Class<?> cls3 = Class.forName("android.os.storage.StorageVolume");
                method2 = cls3.getMethod("getPath", null);
                method3 = cls3.getMethod("isRemovable", null);
                method4 = cls3.getMethod("getState", null);
                Method method14 = cls3.getMethod("getUuid", null);
                objInvoke = method13.invoke(storageManager, null);
                C11003.requireNonNull(objInvoke);
                length = Array.getLength(objInvoke);
                while (i < length) {
                    Object obj3 = Array.get(objInvoke, i);
                    String str8 = (String) method2.invoke(obj3, null);
                    C11003.requireNonNull(str8);
                    Object objInvoke3 = method3.invoke(obj3, null);
                    C11003.requireNonNull(objInvoke3);
                    zBooleanValue = ((Boolean) objInvoke3).booleanValue();
                    String str9 = (String) method4.invoke(obj3, null);
                    if (!zBooleanValue) {
                    }
                }
                z = true;
                if (z) {
                    it = arrayList2.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        c4216 = (C4216) it.next();
                        if (C16999.m39887(c4216.f13687.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c4216.f13686;
                            if (str2 != null) {
                            }
                            strM14327 = C4925.m14327(R.string.MT_Protector);
                            if (z2) {
                                c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                            } else if (c4217 == null) {
                                c4216.f13686 = strM14327;
                                c4217 = c4216;
                            } else {
                                c4217.f13686 = strM14327 + ' ' + c4217.f13687.getName();
                                c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f63769;
                if (arrayList != null) {
                    C5242 c5245 = f63770;
                    f63769 = arrayList2;
                    c5245.mo1664(arrayList2);
                    f63771++;
                } else {
                    C5242 c5246 = f63770;
                    f63769 = arrayList2;
                    c5246.mo1664(arrayList2);
                    f63771++;
                }
            } else {
                if (z) {
                    it = arrayList2.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        c4216 = (C4216) it.next();
                        if (C16999.m39887(c4216.f13687.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c4216.f13686;
                            if (str2 != null) {
                            }
                            strM14327 = C4925.m14327(R.string.MT_Protector);
                            if (z2) {
                                c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                            } else if (c4217 == null) {
                                c4216.f13686 = strM14327;
                                c4217 = c4216;
                            } else {
                                c4217.f13686 = strM14327 + ' ' + c4217.f13687.getName();
                                c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f63769;
                if (arrayList != null) {
                    C5242 c5247 = f63770;
                    f63769 = arrayList2;
                    c5247.mo1664(arrayList2);
                    f63771++;
                } else {
                    C5242 c5248 = f63770;
                    f63769 = arrayList2;
                    c5248.mo1664(arrayList2);
                    f63771++;
                }
            }
        } else {
            z = false;
            if (!z) {
                Method method15 = storageManager.getClass().getMethod("getVolumes", null);
                Class<?> cls4 = Class.forName("android.os.storage.VolumeInfo");
                method = cls4.getMethod("getType", null);
                Method method16 = cls4.getMethod("getPath", null);
                Method method17 = cls4.getMethod("getDescription", null);
                Method method18 = cls4.getMethod("getState", null);
                Method method19 = cls4.getMethod("getFsUuid", null);
                List list2 = (List) method15.invoke(storageManager, null);
                C11003.requireNonNull(list2);
                while (r4.hasNext()) {
                    if (((Integer) method.invoke(obj, null)).intValue() != 0) {
                    }
                }
                z = true;
                if (!z) {
                    Method method110 = storageManager.getClass().getMethod("getVolumeList", null);
                    Class<?> cls5 = Class.forName("android.os.storage.StorageVolume");
                    method2 = cls5.getMethod("getPath", null);
                    method3 = cls5.getMethod("isRemovable", null);
                    method4 = cls5.getMethod("getState", null);
                    Method method111 = cls5.getMethod("getUuid", null);
                    objInvoke = method110.invoke(storageManager, null);
                    C11003.requireNonNull(objInvoke);
                    length = Array.getLength(objInvoke);
                    while (i < length) {
                        Object obj4 = Array.get(objInvoke, i);
                        String str10 = (String) method2.invoke(obj4, null);
                        C11003.requireNonNull(str10);
                        Object objInvoke4 = method3.invoke(obj4, null);
                        C11003.requireNonNull(objInvoke4);
                        zBooleanValue = ((Boolean) objInvoke4).booleanValue();
                        String str11 = (String) method4.invoke(obj4, null);
                        if (!zBooleanValue) {
                        }
                    }
                    z = true;
                    if (z) {
                        it = arrayList2.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            c4216 = (C4216) it.next();
                            if (C16999.m39887(c4216.f13687.getPath())) {
                                it.remove();
                            } else {
                                if (str == null) {
                                }
                                str2 = c4216.f13686;
                                if (str2 != null) {
                                }
                                strM14327 = C4925.m14327(R.string.MT_Protector);
                                if (z2) {
                                    c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                } else if (c4217 == null) {
                                    c4216.f13686 = strM14327;
                                    c4217 = c4216;
                                } else {
                                    c4217.f13686 = strM14327 + ' ' + c4217.f13687.getName();
                                    c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                    z2 = true;
                                }
                            }
                        }
                    }
                    arrayList = f63769;
                    if (arrayList != null) {
                        C5242 c5249 = f63770;
                        f63769 = arrayList2;
                        c5249.mo1664(arrayList2);
                        f63771++;
                    } else {
                        C5242 c52410 = f63770;
                        f63769 = arrayList2;
                        c52410.mo1664(arrayList2);
                        f63771++;
                    }
                } else {
                    if (z) {
                        it = arrayList2.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            c4216 = (C4216) it.next();
                            if (C16999.m39887(c4216.f13687.getPath())) {
                                it.remove();
                            } else {
                                if (str == null) {
                                }
                                str2 = c4216.f13686;
                                if (str2 != null) {
                                }
                                strM14327 = C4925.m14327(R.string.MT_Protector);
                                if (z2) {
                                    c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                } else if (c4217 == null) {
                                    c4216.f13686 = strM14327;
                                    c4217 = c4216;
                                } else {
                                    c4217.f13686 = strM14327 + ' ' + c4217.f13687.getName();
                                    c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                    z2 = true;
                                }
                            }
                        }
                    }
                    arrayList = f63769;
                    if (arrayList != null) {
                        C5242 c52411 = f63770;
                        f63769 = arrayList2;
                        c52411.mo1664(arrayList2);
                        f63771++;
                    } else {
                        C5242 c52412 = f63770;
                        f63769 = arrayList2;
                        c52412.mo1664(arrayList2);
                        f63771++;
                    }
                }
            } else if (!z) {
                Method method112 = storageManager.getClass().getMethod("getVolumeList", null);
                Class<?> cls6 = Class.forName("android.os.storage.StorageVolume");
                method2 = cls6.getMethod("getPath", null);
                method3 = cls6.getMethod("isRemovable", null);
                method4 = cls6.getMethod("getState", null);
                Method method113 = cls6.getMethod("getUuid", null);
                objInvoke = method112.invoke(storageManager, null);
                C11003.requireNonNull(objInvoke);
                length = Array.getLength(objInvoke);
                while (i < length) {
                    Object obj5 = Array.get(objInvoke, i);
                    String str12 = (String) method2.invoke(obj5, null);
                    C11003.requireNonNull(str12);
                    Object objInvoke5 = method3.invoke(obj5, null);
                    C11003.requireNonNull(objInvoke5);
                    zBooleanValue = ((Boolean) objInvoke5).booleanValue();
                    String str13 = (String) method4.invoke(obj5, null);
                    if (!zBooleanValue) {
                    }
                }
                z = true;
                if (z) {
                    it = arrayList2.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        c4216 = (C4216) it.next();
                        if (C16999.m39887(c4216.f13687.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c4216.f13686;
                            if (str2 != null) {
                            }
                            strM14327 = C4925.m14327(R.string.MT_Protector);
                            if (z2) {
                                c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                            } else if (c4217 == null) {
                                c4216.f13686 = strM14327;
                                c4217 = c4216;
                            } else {
                                c4217.f13686 = strM14327 + ' ' + c4217.f13687.getName();
                                c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f63769;
                if (arrayList != null) {
                    C5242 c52413 = f63770;
                    f63769 = arrayList2;
                    c52413.mo1664(arrayList2);
                    f63771++;
                } else {
                    C5242 c52414 = f63770;
                    f63769 = arrayList2;
                    c52414.mo1664(arrayList2);
                    f63771++;
                }
            } else {
                if (z) {
                    it = arrayList2.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        c4216 = (C4216) it.next();
                        if (C16999.m39887(c4216.f13687.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c4216.f13686;
                            if (str2 != null) {
                            }
                            strM14327 = C4925.m14327(R.string.MT_Protector);
                            if (z2) {
                                c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                            } else if (c4217 == null) {
                                c4216.f13686 = strM14327;
                                c4217 = c4216;
                            } else {
                                c4217.f13686 = strM14327 + ' ' + c4217.f13687.getName();
                                c4216.f13686 = strM14327 + ' ' + c4216.f13687.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f63769;
                if (arrayList != null) {
                    C5242 c52415 = f63770;
                    f63769 = arrayList2;
                    c52415.mo1664(arrayList2);
                    f63771++;
                } else {
                    C5242 c52416 = f63770;
                    f63769 = arrayList2;
                    c52416.mo1664(arrayList2);
                    f63771++;
                }
            }
        }
        throw th;
        return f63769;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45450(Main main, C5624 c5624) {
        f63770.m1668(main, c5624);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45448() {
        return f63771;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m45451() {
        ArrayList arrayList = f63769;
        return arrayList != null ? arrayList : m45452(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4216 m45449(String str) {
        if (str.startsWith("/data") || str.startsWith("/system") || str.startsWith("/proc")) {
            return null;
        }
        ArrayList<C4216> arrayList = (ArrayList) m45451();
        if (arrayList.isEmpty()) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C4216 c4216 : arrayList) {
            if (lowerCase.startsWith(c4216.f13685)) {
                return c4216;
            }
        }
        return null;
    }
}
