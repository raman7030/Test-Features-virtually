package p067l;

import android.app.Application;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 618F */
/* JADX INFO: loaded from: classes4.dex */
public final class C21129 {

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList f66400;

    /* JADX INFO: renamed from: ۧ */
    public static C7350 f66401 = new C7350();

    /* JADX INFO: renamed from: ܽ */
    public static int f66402;

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
    /* JADX INFO: renamed from: ۧ */
    public static synchronized List m47756(String str) {
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
        C6376 c6376;
        String str2;
        String strM16224;
        ArrayList arrayList2 = new ArrayList();
        Application applicationM16232 = C7050.m16232();
        StorageManager storageManager = (StorageManager) applicationM16232.getSystemService("storage");
        C12826.requireNonNull(storageManager);
        C6376 c6377 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
                Method method5 = StorageVolume.class.getMethod("getPath", null);
                Iterator<StorageVolume> it2 = storageVolumes.iterator();
                while (it2.hasNext()) {
                    StorageVolume storageVolumeM21130 = C9179.m21130(it2.next());
                    if (storageVolumeM21130.isRemovable() && ("mounted".equals(storageVolumeM21130.getState()) || "mounted_ro".equals(storageVolumeM21130.getState()))) {
                        String str3 = (String) method5.invoke(storageVolumeM21130, null);
                        C12826.requireNonNull(str3);
                        arrayList2.add(new C6376(new File(str3), storageVolumeM21130.getUuid(), storageVolumeM21130.getDescription(applicationM16232)));
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
                    C12826.requireNonNull(list);
                    for (Object obj : list) {
                        if (((Integer) method.invoke(obj, null)).intValue() != 0 && ((iIntValue = ((Integer) method9.invoke(obj, null)).intValue()) == 2 || iIntValue == 3)) {
                            File file = (File) method7.invoke(obj, null);
                            String str4 = (String) method8.invoke(obj, null);
                            String str5 = (String) method10.invoke(obj, null);
                            if (file != null) {
                                arrayList2.add(new C6376(file, str5, str4));
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
                        C12826.requireNonNull(objInvoke);
                        length = Array.getLength(objInvoke);
                        for (i = 0; i < length; i++) {
                            Object obj2 = Array.get(objInvoke, i);
                            String str6 = (String) method2.invoke(obj2, null);
                            C12826.requireNonNull(str6);
                            Object objInvoke2 = method3.invoke(obj2, null);
                            C12826.requireNonNull(objInvoke2);
                            zBooleanValue = ((Boolean) objInvoke2).booleanValue();
                            String str7 = (String) method4.invoke(obj2, null);
                            if (!zBooleanValue && ("mounted".equals(str7) || "mounted_ro".equals(str7))) {
                                arrayList2.add(new C6376(new File(str6), (String) method12.invoke(obj2, null)));
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
                            c6376 = (C6376) it.next();
                            if (C18524.m42130(c6376.f16500.getPath())) {
                                it.remove();
                            } else if (str == null && str.equalsIgnoreCase(c6376.f16500.getAbsolutePath())) {
                                it.remove();
                            } else {
                                str2 = c6376.f16499;
                                if (str2 != null || str2.length() > 12) {
                                    strM16224 = C7050.m16224(R.string.MT_Protector);
                                    if (z2) {
                                        c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                    } else if (c6377 == null) {
                                        c6376.f16499 = strM16224;
                                        c6377 = c6376;
                                    } else {
                                        c6377.f16499 = strM16224 + ' ' + c6377.f16500.getName();
                                        c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = f66400;
                    if (arrayList != null || arrayList.size() != arrayList2.size() || !f66400.containsAll(arrayList2)) {
                        C7350 c7350 = f66401;
                        f66400 = arrayList2;
                        c7350.mo4062(arrayList2);
                        f66402++;
                    }
                } else {
                    if (z) {
                        it = arrayList2.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            c6376 = (C6376) it.next();
                            if (C18524.m42130(c6376.f16500.getPath())) {
                                it.remove();
                            } else {
                                if (str == null) {
                                }
                                str2 = c6376.f16499;
                                if (str2 != null) {
                                }
                                strM16224 = C7050.m16224(R.string.MT_Protector);
                                if (z2) {
                                    c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                } else if (c6377 == null) {
                                    c6376.f16499 = strM16224;
                                    c6377 = c6376;
                                } else {
                                    c6377.f16499 = strM16224 + ' ' + c6377.f16500.getName();
                                    c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                    z2 = true;
                                }
                            }
                        }
                    }
                    arrayList = f66400;
                    if (arrayList != null) {
                        C7350 c7351 = f66401;
                        f66400 = arrayList2;
                        c7351.mo4062(arrayList2);
                        f66402++;
                    } else {
                        C7350 c7352 = f66401;
                        f66400 = arrayList2;
                        c7352.mo4062(arrayList2);
                        f66402++;
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
                C12826.requireNonNull(objInvoke);
                length = Array.getLength(objInvoke);
                while (i < length) {
                    Object obj3 = Array.get(objInvoke, i);
                    String str8 = (String) method2.invoke(obj3, null);
                    C12826.requireNonNull(str8);
                    Object objInvoke3 = method3.invoke(obj3, null);
                    C12826.requireNonNull(objInvoke3);
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
                        c6376 = (C6376) it.next();
                        if (C18524.m42130(c6376.f16500.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c6376.f16499;
                            if (str2 != null) {
                            }
                            strM16224 = C7050.m16224(R.string.MT_Protector);
                            if (z2) {
                                c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                            } else if (c6377 == null) {
                                c6376.f16499 = strM16224;
                                c6377 = c6376;
                            } else {
                                c6377.f16499 = strM16224 + ' ' + c6377.f16500.getName();
                                c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f66400;
                if (arrayList != null) {
                    C7350 c7353 = f66401;
                    f66400 = arrayList2;
                    c7353.mo4062(arrayList2);
                    f66402++;
                } else {
                    C7350 c7354 = f66401;
                    f66400 = arrayList2;
                    c7354.mo4062(arrayList2);
                    f66402++;
                }
            } else {
                if (z) {
                    it = arrayList2.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        c6376 = (C6376) it.next();
                        if (C18524.m42130(c6376.f16500.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c6376.f16499;
                            if (str2 != null) {
                            }
                            strM16224 = C7050.m16224(R.string.MT_Protector);
                            if (z2) {
                                c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                            } else if (c6377 == null) {
                                c6376.f16499 = strM16224;
                                c6377 = c6376;
                            } else {
                                c6377.f16499 = strM16224 + ' ' + c6377.f16500.getName();
                                c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f66400;
                if (arrayList != null) {
                    C7350 c7355 = f66401;
                    f66400 = arrayList2;
                    c7355.mo4062(arrayList2);
                    f66402++;
                } else {
                    C7350 c7356 = f66401;
                    f66400 = arrayList2;
                    c7356.mo4062(arrayList2);
                    f66402++;
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
                C12826.requireNonNull(list2);
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
                    C12826.requireNonNull(objInvoke);
                    length = Array.getLength(objInvoke);
                    while (i < length) {
                        Object obj4 = Array.get(objInvoke, i);
                        String str10 = (String) method2.invoke(obj4, null);
                        C12826.requireNonNull(str10);
                        Object objInvoke4 = method3.invoke(obj4, null);
                        C12826.requireNonNull(objInvoke4);
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
                            c6376 = (C6376) it.next();
                            if (C18524.m42130(c6376.f16500.getPath())) {
                                it.remove();
                            } else {
                                if (str == null) {
                                }
                                str2 = c6376.f16499;
                                if (str2 != null) {
                                }
                                strM16224 = C7050.m16224(R.string.MT_Protector);
                                if (z2) {
                                    c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                } else if (c6377 == null) {
                                    c6376.f16499 = strM16224;
                                    c6377 = c6376;
                                } else {
                                    c6377.f16499 = strM16224 + ' ' + c6377.f16500.getName();
                                    c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                    z2 = true;
                                }
                            }
                        }
                    }
                    arrayList = f66400;
                    if (arrayList != null) {
                        C7350 c7357 = f66401;
                        f66400 = arrayList2;
                        c7357.mo4062(arrayList2);
                        f66402++;
                    } else {
                        C7350 c7358 = f66401;
                        f66400 = arrayList2;
                        c7358.mo4062(arrayList2);
                        f66402++;
                    }
                } else {
                    if (z) {
                        it = arrayList2.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            c6376 = (C6376) it.next();
                            if (C18524.m42130(c6376.f16500.getPath())) {
                                it.remove();
                            } else {
                                if (str == null) {
                                }
                                str2 = c6376.f16499;
                                if (str2 != null) {
                                }
                                strM16224 = C7050.m16224(R.string.MT_Protector);
                                if (z2) {
                                    c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                } else if (c6377 == null) {
                                    c6376.f16499 = strM16224;
                                    c6377 = c6376;
                                } else {
                                    c6377.f16499 = strM16224 + ' ' + c6377.f16500.getName();
                                    c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                    z2 = true;
                                }
                            }
                        }
                    }
                    arrayList = f66400;
                    if (arrayList != null) {
                        C7350 c7359 = f66401;
                        f66400 = arrayList2;
                        c7359.mo4062(arrayList2);
                        f66402++;
                    } else {
                        C7350 c73510 = f66401;
                        f66400 = arrayList2;
                        c73510.mo4062(arrayList2);
                        f66402++;
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
                C12826.requireNonNull(objInvoke);
                length = Array.getLength(objInvoke);
                while (i < length) {
                    Object obj5 = Array.get(objInvoke, i);
                    String str12 = (String) method2.invoke(obj5, null);
                    C12826.requireNonNull(str12);
                    Object objInvoke5 = method3.invoke(obj5, null);
                    C12826.requireNonNull(objInvoke5);
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
                        c6376 = (C6376) it.next();
                        if (C18524.m42130(c6376.f16500.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c6376.f16499;
                            if (str2 != null) {
                            }
                            strM16224 = C7050.m16224(R.string.MT_Protector);
                            if (z2) {
                                c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                            } else if (c6377 == null) {
                                c6376.f16499 = strM16224;
                                c6377 = c6376;
                            } else {
                                c6377.f16499 = strM16224 + ' ' + c6377.f16500.getName();
                                c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f66400;
                if (arrayList != null) {
                    C7350 c73511 = f66401;
                    f66400 = arrayList2;
                    c73511.mo4062(arrayList2);
                    f66402++;
                } else {
                    C7350 c73512 = f66401;
                    f66400 = arrayList2;
                    c73512.mo4062(arrayList2);
                    f66402++;
                }
            } else {
                if (z) {
                    it = arrayList2.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        c6376 = (C6376) it.next();
                        if (C18524.m42130(c6376.f16500.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c6376.f16499;
                            if (str2 != null) {
                            }
                            strM16224 = C7050.m16224(R.string.MT_Protector);
                            if (z2) {
                                c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                            } else if (c6377 == null) {
                                c6376.f16499 = strM16224;
                                c6377 = c6376;
                            } else {
                                c6377.f16499 = strM16224 + ' ' + c6377.f16500.getName();
                                c6376.f16499 = strM16224 + ' ' + c6376.f16500.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f66400;
                if (arrayList != null) {
                    C7350 c73513 = f66401;
                    f66400 = arrayList2;
                    c73513.mo4062(arrayList2);
                    f66402++;
                } else {
                    C7350 c73514 = f66401;
                    f66400 = arrayList2;
                    c73514.mo4062(arrayList2);
                    f66402++;
                }
            }
        }
        throw th;
        return f66400;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47754(Main main, C7714 c7714) {
        f66401.m4066(main, c7714);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m47752() {
        return f66402;
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m47755() {
        ArrayList arrayList = f66400;
        return arrayList != null ? arrayList : m47756(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6376 m47753(String str) {
        if (str.startsWith("/data") || str.startsWith("/system") || str.startsWith("/proc")) {
            return null;
        }
        ArrayList<C6376> arrayList = (ArrayList) m47755();
        if (arrayList.isEmpty()) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C6376 c6376 : arrayList) {
            if (lowerCase.startsWith(c6376.f16498)) {
                return c6376;
            }
        }
        return null;
    }
}
