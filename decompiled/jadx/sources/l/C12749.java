package l;

import android.text.TextUtils;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: VAGS */
/* JADX INFO: loaded from: classes.dex */
public final class C12749 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ArrayList f38320;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f38321;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C5242 f38322;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final List f38323;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final List f38324;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static native synchronized void m31051();

    static {
        boolean z;
        ApplicationC12518.m30701(IShizukuService.Stub.TRANSACTION_attachUserService);
        ArrayList arrayList = new ArrayList();
        f38320 = arrayList;
        f38324 = C20195.unmodifiableList(arrayList);
        f38322 = new C5242();
        ArrayList arrayList2 = new ArrayList();
        f38321 = arrayList2;
        f38323 = C20195.unmodifiableList(arrayList2);
        AbstractC15440 abstractC15440M36526 = C16293.f50117.m36526("config.init");
        JSONArray jSONArray = null;
        if (abstractC15440M36526.mo23113()) {
            try {
                C11639 c11639 = new C11639(new File(abstractC15440M36526.mo23554()));
                byte[] bArrMo18253 = c11639.mo18253("ftp_configs", (byte[]) null);
                if (bArrMo18253 != null && bArrMo18253.length != 0) {
                    ArrayList arrayList3 = new ArrayList();
                    byte bMo18251 = c11639.mo18251((byte) 0, "ftp_configs_version");
                    C12951 c12951 = new C12951(bArrMo18253);
                    int i = c12951.readInt();
                    int i2 = 0;
                    while (true) {
                        z = true;
                        if (i2 >= i) {
                            f38320.addAll(arrayList3);
                            abstractC15440M36526.mo23552();
                            break;
                        }
                        if (bMo18251 == 0) {
                            arrayList3.add(C7375.m19824(c12951));
                        } else if (bMo18251 == 1) {
                            try {
                                arrayList3.add(C7375.m19823(c12951));
                            } catch (Throwable unused) {
                            }
                        } else {
                            throw new RuntimeException("Unsupported config ver " + ((int) bMo18251));
                        }
                        i2++;
                    }
                }
                abstractC15440M36526.mo23552();
                z = false;
            } catch (Throwable th) {
                abstractC15440M36526.mo23552();
                throw th;
            }
        } else {
            z = false;
        }
        String string = ApplicationC20075.f65008.getString("ns_data", null);
        if (string != null) {
            try {
                jSONArray = new JSONArray(string);
            } catch (JSONParseException unused2) {
            }
        }
        int size = jSONArray == null ? 0 : jSONArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                AbstractC3577 abstractC3577M31030 = m31030(jSONArray.getJSONObject(i3));
                if (abstractC3577M31030 instanceof C2292) {
                    f38321.add((C2292) abstractC3577M31030);
                } else {
                    f38320.add(abstractC3577M31030);
                }
            } catch (RuntimeException unused3) {
            }
        }
        if (z) {
            m31051();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3577 m31030(JSONObject jSONObject) {
        switch (jSONObject.getInt("nct")) {
            case 0:
                return new C1936(jSONObject);
            case 1:
                return new C6875(jSONObject);
            case 2:
                return new C14719(jSONObject);
            case 3:
                return new C5156(jSONObject);
            case 4:
                return new C23354(jSONObject);
            case 5:
                return new C12834(jSONObject);
            case 6:
                return new C2292(jSONObject);
            default:
                throw new RuntimeException("Type: " + jSONObject.getInt("nct"));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m31041(AbstractC3577 abstractC3577) {
        JSONObject jSONObjectMo6369 = abstractC3577.mo6369();
        Class<?> cls = abstractC3577.getClass();
        if (cls == C1936.class) {
            jSONObjectMo6369.put("nct", 0);
            return jSONObjectMo6369;
        }
        if (cls == C6875.class) {
            jSONObjectMo6369.put("nct", 1);
            return jSONObjectMo6369;
        }
        if (cls == C14719.class) {
            jSONObjectMo6369.put("nct", 2);
            return jSONObjectMo6369;
        }
        if (cls == C5156.class) {
            jSONObjectMo6369.put("nct", 3);
            return jSONObjectMo6369;
        }
        if (cls == C23354.class) {
            jSONObjectMo6369.put("nct", 4);
            return jSONObjectMo6369;
        }
        if (cls == C12834.class) {
            jSONObjectMo6369.put("nct", 5);
            return jSONObjectMo6369;
        }
        if (cls == C2292.class) {
            jSONObjectMo6369.put("nct", 6);
            return jSONObjectMo6369;
        }
        throw new RuntimeException(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONArray m31049() {
        JSONArray jSONArray = new JSONArray();
        synchronized (C12749.class) {
            Iterator it = f38320.iterator();
            while (it.hasNext()) {
                jSONArray.add(m31041((AbstractC3577) it.next()));
            }
            Iterator it2 = f38321.iterator();
            while (it2.hasNext()) {
                jSONArray.add(m31041((C2292) it2.next()));
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31036(InterfaceC1008 interfaceC1008) {
        f38322.m1665(interfaceC1008);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31038(AbstractActivityC3346 abstractActivityC3346, InterfaceC1008 interfaceC1008) {
        f38322.m1668(abstractActivityC3346, interfaceC1008);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m31046() {
        return f38324;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static List m31048() {
        return f38323;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC3577 m31047(int i) {
        if (i == -1) {
            return null;
        }
        for (AbstractC3577 abstractC3577 : f38320) {
            if (abstractC3577.f11356 == i) {
                return abstractC3577;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3577 m31031(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (AbstractC3577 abstractC3577 : f38320) {
            if (abstractC3577.mo6365().equals(str)) {
                return abstractC3577;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C2292 m31050(int i) {
        if (i == -1) {
            return null;
        }
        for (C2292 c2292 : f38321) {
            if (c2292.f11356 == i) {
                return c2292;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2292 m31042(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C2292 c2292 : f38321) {
            if (c2292.mo6365().equals(str)) {
                return c2292;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m31040() {
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() / 100) & 2147483647L);
        while (true) {
            synchronized (C12749.class) {
                Iterator it = f38320.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AbstractC3577) it.next()).f11356 == iCurrentTimeMillis) {
                        }
                    } else {
                        Iterator it2 = f38321.iterator();
                        do {
                            if (!it2.hasNext()) {
                                return iCurrentTimeMillis;
                            }
                        } while (((AbstractC3577) it2.next()).f11356 != iCurrentTimeMillis);
                    }
                }
                iCurrentTimeMillis++;
            }
            iCurrentTimeMillis++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31035(ArrayList arrayList) {
        synchronized (C12749.class) {
            f38320.clear();
            f38321.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC3577 abstractC3577 = (AbstractC3577) it.next();
                if (abstractC3577 instanceof C2292) {
                    f38321.add((C2292) abstractC3577);
                } else {
                    f38320.add(abstractC3577);
                }
            }
        }
        m31051();
        f38322.mo1664(f38324);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31039(AbstractC3577 abstractC3577) {
        synchronized (C12749.class) {
            if (abstractC3577 instanceof C2292) {
                f38321.add((C2292) abstractC3577);
            } else {
                f38320.add(abstractC3577);
            }
        }
        m31051();
        f38322.mo1664(f38324);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31032() {
        m31051();
        f38322.mo1664(f38324);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31034(int i, int i2) {
        synchronized (C12749.class) {
            C6055.m16890(i, i2, f38320);
        }
        m31045();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31044(int i, int i2) {
        synchronized (C12749.class) {
            C6055.m16890(i, i2, f38321);
        }
        m31045();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31033(int i) {
        synchronized (C12749.class) {
            f38320.remove(i);
        }
        m31045();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31043(int i) {
        synchronized (C12749.class) {
            f38321.remove(i);
        }
        m31045();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m31045() {
        C1802.m5991(new RunnableC13454(), C12749.class, 500L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31037(InterfaceC1022 interfaceC1022) {
        synchronized (C12749.class) {
            int size = interfaceC1022.size();
            ArrayList<AbstractC3577> arrayList = f38320;
            if (size == arrayList.size()) {
                C19720 c19720 = new C19720(arrayList.size());
                for (AbstractC3577 abstractC3577 : arrayList) {
                    c19720.mo2318(abstractC3577.f11356, abstractC3577);
                }
                ArrayList arrayList2 = new ArrayList(f38320.size());
                int size2 = interfaceC1022.size();
                for (int i = 0; i < size2; i++) {
                    int i2 = interfaceC1022.getInt(i);
                    AbstractC3577 abstractC3578 = (AbstractC3577) c19720.remove(i2);
                    if (abstractC3578 == null) {
                        throw new IllegalArgumentException("Unknown config id " + i2);
                    }
                    arrayList2.add(abstractC3578);
                }
                if (!c19720.isEmpty()) {
                    throw new IllegalArgumentException("Missing config ids " + c19720.keySet());
                }
                ArrayList arrayList3 = f38320;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
            } else {
                throw new IllegalArgumentException("Unexpected config count " + interfaceC1022.size());
            }
        }
        m31045();
    }
}
