package p067l;

import android.text.TextUtils;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONParseException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: VAGS */
/* JADX INFO: loaded from: classes.dex */
public final class C14486 {

    /* JADX INFO: renamed from: ֫ */
    public static final ArrayList f41360;

    /* JADX INFO: renamed from: ۧ */
    public static final ArrayList f41361;

    /* JADX INFO: renamed from: ܽ */
    public static final C7350 f41362;

    /* JADX INFO: renamed from: ܿ */
    public static final List f41363;

    /* JADX INFO: renamed from: ᩳ */
    public static final List f41364;

    /* JADX INFO: renamed from: ᩻ */
    public static native synchronized void m33135();

    static {
        boolean z;
        ApplicationC14266.m56479(IShizukuService.Stub.TRANSACTION_attachUserService);
        ArrayList arrayList = new ArrayList();
        f41360 = arrayList;
        f41364 = C21562.unmodifiableList(arrayList);
        f41362 = new C7350();
        ArrayList arrayList2 = new ArrayList();
        f41361 = arrayList2;
        f41363 = C21562.unmodifiableList(arrayList2);
        AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("config.init");
        JSONArray jSONArray = null;
        if (abstractC17043M38684.mo25087()) {
            try {
                C13430 c13430 = new C13430(new File(abstractC17043M38684.mo25505()));
                byte[] bArrMo20201 = c13430.mo20201("ftp_configs", (byte[]) null);
                if (bArrMo20201 != null && bArrMo20201.length != 0) {
                    ArrayList arrayList3 = new ArrayList();
                    byte bMo20199 = c13430.mo20199((byte) 0, "ftp_configs_version");
                    C14677 c14677 = new C14677(bArrMo20201);
                    int i = c14677.readInt();
                    int i2 = 0;
                    while (true) {
                        z = true;
                        if (i2 >= i) {
                            f41360.addAll(arrayList3);
                            abstractC17043M38684.mo25503();
                            break;
                        }
                        if (bMo20199 == 0) {
                            arrayList3.add(C9378.m21797(c14677));
                        } else if (bMo20199 == 1) {
                            try {
                                arrayList3.add(C9378.m21796(c14677));
                            } catch (Throwable unused) {
                            }
                        } else {
                            throw new RuntimeException("Unsupported config ver " + ((int) bMo20199));
                        }
                        i2++;
                    }
                }
                abstractC17043M38684.mo25503();
                z = false;
            } catch (Throwable th) {
                abstractC17043M38684.mo25503();
                throw th;
            }
        } else {
            z = false;
        }
        String string = ApplicationC21448.f67649.getString("ns_data", null);
        if (string != null) {
            try {
                jSONArray = new JSONArray(string);
            } catch (JSONParseException unused2) {
            }
        }
        int size = jSONArray == null ? 0 : jSONArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                AbstractC5769 abstractC5769M33114 = m33114(jSONArray.getJSONObject(i3));
                if (abstractC5769M33114 instanceof C4547) {
                    f41361.add((C4547) abstractC5769M33114);
                } else {
                    f41360.add(abstractC5769M33114);
                }
            } catch (RuntimeException unused3) {
            }
        }
        if (z) {
            m33135();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC5769 m33114(JSONObject jSONObject) {
        switch (jSONObject.getInt("nct")) {
            case 0:
                return new C4209(jSONObject);
            case 1:
                return new C8903(jSONObject);
            case 2:
                return new C16358(jSONObject);
            case 3:
                return new C7269(jSONObject);
            case 4:
                return new C24564(jSONObject);
            case 5:
                return new C14566(jSONObject);
            case 6:
                return new C4547(jSONObject);
            default:
                throw new RuntimeException("Type: " + jSONObject.getInt("nct"));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m33125(AbstractC5769 abstractC5769) {
        JSONObject jSONObjectMo8542 = abstractC5769.mo8542();
        Class<?> cls = abstractC5769.getClass();
        if (cls == C4209.class) {
            jSONObjectMo8542.put("nct", 0);
            return jSONObjectMo8542;
        }
        if (cls == C8903.class) {
            jSONObjectMo8542.put("nct", 1);
            return jSONObjectMo8542;
        }
        if (cls == C16358.class) {
            jSONObjectMo8542.put("nct", 2);
            return jSONObjectMo8542;
        }
        if (cls == C7269.class) {
            jSONObjectMo8542.put("nct", 3);
            return jSONObjectMo8542;
        }
        if (cls == C24564.class) {
            jSONObjectMo8542.put("nct", 4);
            return jSONObjectMo8542;
        }
        if (cls == C14566.class) {
            jSONObjectMo8542.put("nct", 5);
            return jSONObjectMo8542;
        }
        if (cls == C4547.class) {
            jSONObjectMo8542.put("nct", 6);
            return jSONObjectMo8542;
        }
        throw new RuntimeException(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: ᩳ */
    public static JSONArray m33133() {
        JSONArray jSONArray = new JSONArray();
        synchronized (C14486.class) {
            Iterator it = f41360.iterator();
            while (it.hasNext()) {
                jSONArray.add(m33125((AbstractC5769) it.next()));
            }
            Iterator it2 = f41361.iterator();
            while (it2.hasNext()) {
                jSONArray.add(m33125((C4547) it2.next()));
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33120(InterfaceC3326 interfaceC3326) {
        f41362.m4063(interfaceC3326);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33122(AbstractActivityC5549 abstractActivityC5549, InterfaceC3326 interfaceC3326) {
        f41362.m4066(abstractActivityC5549, interfaceC3326);
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m33130() {
        return f41364;
    }

    /* JADX INFO: renamed from: ܿ */
    public static List m33132() {
        return f41363;
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC5769 m33131(int i) {
        if (i == -1) {
            return null;
        }
        for (AbstractC5769 abstractC5769 : f41360) {
            if (abstractC5769.f14161 == i) {
                return abstractC5769;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC5769 m33115(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (AbstractC5769 abstractC5769 : f41360) {
            if (abstractC5769.mo8538().equals(str)) {
                return abstractC5769;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C4547 m33134(int i) {
        if (i == -1) {
            return null;
        }
        for (C4547 c4547 : f41361) {
            if (c4547.f14161 == i) {
                return c4547;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4547 m33126(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C4547 c4547 : f41361) {
            if (c4547.mo8538().equals(str)) {
                return c4547;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m33124() {
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() / 100) & 2147483647L);
        while (true) {
            synchronized (C14486.class) {
                Iterator it = f41360.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AbstractC5769) it.next()).f14161 == iCurrentTimeMillis) {
                        }
                    } else {
                        Iterator it2 = f41361.iterator();
                        do {
                            if (!it2.hasNext()) {
                                return iCurrentTimeMillis;
                            }
                        } while (((AbstractC5769) it2.next()).f14161 != iCurrentTimeMillis);
                    }
                }
                iCurrentTimeMillis++;
            }
            iCurrentTimeMillis++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33119(ArrayList arrayList) {
        synchronized (C14486.class) {
            f41360.clear();
            f41361.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC5769 abstractC5769 = (AbstractC5769) it.next();
                if (abstractC5769 instanceof C4547) {
                    f41361.add((C4547) abstractC5769);
                } else {
                    f41360.add(abstractC5769);
                }
            }
        }
        m33135();
        f41362.mo4062(f41364);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33123(AbstractC5769 abstractC5769) {
        synchronized (C14486.class) {
            if (abstractC5769 instanceof C4547) {
                f41361.add((C4547) abstractC5769);
            } else {
                f41360.add(abstractC5769);
            }
        }
        m33135();
        f41362.mo4062(f41364);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33116() {
        m33135();
        f41362.mo4062(f41364);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33118(int i, int i2) {
        synchronized (C14486.class) {
            C8123.m18819(i, i2, f41360);
        }
        m33129();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33128(int i, int i2) {
        synchronized (C14486.class) {
            C8123.m18819(i, i2, f41361);
        }
        m33129();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33117(int i) {
        synchronized (C14486.class) {
            f41360.remove(i);
        }
        m33129();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33127(int i) {
        synchronized (C14486.class) {
            f41361.remove(i);
        }
        m33129();
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m33129() {
        C4081.m8188(new RunnableC15156(), C14486.class, 500L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33121(InterfaceC3340 interfaceC3340) {
        synchronized (C14486.class) {
            int size = interfaceC3340.size();
            ArrayList<AbstractC5769> arrayList = f41360;
            if (size == arrayList.size()) {
                C21111 c21111 = new C21111(arrayList.size());
                for (AbstractC5769 abstractC5769 : arrayList) {
                    c21111.mo4686(abstractC5769.f14161, abstractC5769);
                }
                ArrayList arrayList2 = new ArrayList(f41360.size());
                int size2 = interfaceC3340.size();
                for (int i = 0; i < size2; i++) {
                    int i2 = interfaceC3340.getInt(i);
                    AbstractC5769 abstractC57610 = (AbstractC5769) c21111.remove(i2);
                    if (abstractC57610 == null) {
                        throw new IllegalArgumentException("Unknown config id " + i2);
                    }
                    arrayList2.add(abstractC57610);
                }
                if (!c21111.isEmpty()) {
                    throw new IllegalArgumentException("Missing config ids " + c21111.keySet());
                }
                ArrayList arrayList3 = f41360;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
            } else {
                throw new IllegalArgumentException("Unexpected config count " + interfaceC3340.size());
            }
        }
        m33129();
    }
}
