package p067l;

import bin.p000mt.json.JSON;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3791 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7768 {

    /* JADX INFO: renamed from: ֫ */
    public final C11792 f20381;

    /* JADX INFO: renamed from: ۧ */
    public final C12107 f20382;

    /* JADX INFO: renamed from: ܳ */
    public final LinkedHashMap f20383 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܽ */
    public final C10443 f20384;

    /* JADX INFO: renamed from: ܿ */
    public final C10371 f20385;

    /* JADX INFO: renamed from: ᩳ */
    public final C9109 f20386;

    public C7768(C10371 c10371, C11792 c11792, C9109 c9109, C10443 c10443, C12107 c12107) {
        this.f20385 = c10371;
        this.f20381 = c11792;
        this.f20386 = c9109;
        this.f20384 = c10443;
        this.f20382 = c12107;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C16484 m17927(String str) {
        C11792 c11792 = this.f20381;
        c11792.getClass();
        m17920(System.currentTimeMillis());
        LinkedHashMap linkedHashMap = this.f20383;
        C16484 c16484 = (C16484) linkedHashMap.get(str);
        C10371 c10371 = this.f20385;
        if (c16484 != null) {
            m17923(c16484);
            long jCurrentTimeMillis = System.currentTimeMillis();
            c16484.f48421 = jCurrentTimeMillis;
            try {
                AbstractC17043 abstractC17043 = c16484.f48414;
                c10371.getClass();
                C10371.m24011(abstractC17043, jCurrentTimeMillis);
            } catch (IOException unused) {
            }
            return c16484;
        }
        try {
            C2994 c2994M24022 = c10371.m24022(str);
            if (c2994M24022.f5313) {
                throw C5276.m11409(JSON.array(), "TEMPORARY_WORKSPACE_REOPEN_UNSUPPORTED", "Temporary workspaces cannot be reopened. Open the APK path again instead.", "fatal");
            }
            C16484 c16484M21054 = this.f20386.m21054(c10371.m24027(c2994M24022.f5323));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            c16484M21054.f48421 = jCurrentTimeMillis2;
            try {
                AbstractC17043 abstractC17044 = c16484M21054.f48414;
                c10371.getClass();
                C10371.m24011(abstractC17044, jCurrentTimeMillis2);
            } catch (IOException unused2) {
            }
            linkedHashMap.put(c16484M21054.f48416, c16484M21054);
            c11792.getClass();
            m17920(System.currentTimeMillis());
            m17921(false);
            m17921(true);
            int i = C10798.f29931;
            return c16484M21054;
        } catch (Throwable th) {
            int i2 = C10798.f29931;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17926(C16484 c16484) {
        this.f20383.put(c16484.f48416, c16484);
        this.f20381.getClass();
        m17920(System.currentTimeMillis());
        m17921(false);
        m17921(true);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C16484 m17932(String str) {
        this.f20381.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        m17920(jCurrentTimeMillis);
        C16484 c16484 = (C16484) this.f20383.get(str);
        if (c16484 == null) {
            return m17927(str);
        }
        m17923(c16484);
        c16484.f48421 = jCurrentTimeMillis;
        try {
            C10371 c10371 = this.f20385;
            AbstractC17043 abstractC17043 = c16484.f48414;
            c10371.getClass();
            C10371.m24011(abstractC17043, jCurrentTimeMillis);
        } catch (IOException unused) {
        }
        return c16484;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16484 m17925(String str) {
        C16484 c16484 = (C16484) this.f20383.get(str);
        if (c16484 == null || c16484.f48415) {
            return null;
        }
        return c16484;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m17931(String str) {
        C16484 c16484 = (C16484) this.f20383.get(str);
        if (c16484 != null) {
            this.f20384.m24158(c16484);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17930(String str) {
        C16484 c16484M17924 = m17924(str);
        if (c16484M17924 == null) {
            return;
        }
        c16484M17924.f48415 = true;
        this.f20384.m24157(c16484M17924);
    }

    /* JADX INFO: renamed from: ᩻ */
    private C16484 m17924(String str) {
        this.f20382.m27999(str);
        return (C16484) this.f20383.remove(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m17923(C16484 c16484) throws C5276 {
        boolean z = c16484.f48415;
        String str = c16484.f48416;
        if (z) {
            throw c16484.f48420;
        }
        try {
            this.f20385.m24027(str);
            if (c16484.f48415) {
                throw c16484.f48420;
            }
        } catch (C5276 e) {
            c16484.f48415 = true;
            c16484.f48420 = e;
            this.f20382.m27999(str);
            C10443 c10443 = this.f20384;
            c10443.m24157(c16484);
            if (!c10443.m24155(str) && this.f20383.get(str) == c16484) {
                m17924(str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17921(boolean z) {
        LinkedHashMap linkedHashMap = this.f20383;
        Iterator it = linkedHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C16484) it.next()).f48412 == z) {
                i++;
            }
        }
        HashSet hashSet = new HashSet();
        while (i > 2) {
            String str = null;
            long j = Long.MAX_VALUE;
            C16484 c16484 = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((C16484) entry.getValue()).f48412 == z && !hashSet.contains(entry.getKey())) {
                    if (!this.f20384.m24155((String) entry.getKey()) && ((C16484) entry.getValue()).f48421 < j) {
                        j = ((C16484) entry.getValue()).f48421;
                        str = (String) entry.getKey();
                        c16484 = (C16484) entry.getValue();
                    }
                }
            }
            if (str == null) {
                return;
            }
            if (z && !m17922(c16484)) {
                hashSet.add(str);
            } else {
                m17924(str);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17920(long j) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f20383.entrySet()) {
            C16484 c16484 = (C16484) entry.getValue();
            if (c16484.f48412 && j - c16484.f48421 > 600000) {
                if (!this.f20384.m24155((String) entry.getKey()) && m17922(c16484)) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m17924((String) it.next());
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m17922(C16484 c16484) {
        try {
            C10371 c10371 = this.f20385;
            AbstractC17043 abstractC17043 = c16484.f48414;
            c10371.getClass();
            C10371.m24018(abstractC17043);
            c16484.f48415 = true;
            this.f20384.m24157(c16484);
            C17548.m39937();
            return true;
        } catch (IOException e) {
            C21306.m48192("MT MCP temporary workspace eviction delete failed, workspaceId=" + c16484.f48416, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m17929(String str) {
        try {
            C11469 c11469 = new C11469(this.f20385, new C22800(1, this));
            C19553.m44409();
            int iM48115 = C21292.m48115();
            this.f20381.getClass();
            Iterator it = c11469.m26467(str, iM48115, System.currentTimeMillis()).iterator();
            while (it.hasNext()) {
                m17924((String) it.next());
            }
        } catch (Exception e) {
            C21306.m48192("MT MCP session cleanup failed", e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17928(C16484 c16484) {
        boolean z = c16484.f48415;
        String str = c16484.f48416;
        if (z && this.f20383.get(str) == c16484 && !this.f20384.m24155(str)) {
            m17924(str);
        }
    }
}
