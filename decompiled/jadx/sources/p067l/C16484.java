package p067l;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 777R */
/* JADX INFO: loaded from: classes4.dex */
public final class C16484 {

    /* JADX INFO: renamed from: ֡ */
    public final String f48406;

    /* JADX INFO: renamed from: ֨ */
    public final C21021 f48407;

    /* JADX INFO: renamed from: ֫ */
    public C23538 f48408;

    /* JADX INFO: renamed from: ۖ */
    public final C21527 f48409;

    /* JADX INFO: renamed from: ۗ */
    public final C10371 f48410;

    /* JADX INFO: renamed from: ۘ */
    public final String f48411;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f48412;

    /* JADX INFO: renamed from: ۚ */
    public final C20350 f48413;

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC17043 f48414;

    /* JADX INFO: renamed from: ۠ */
    public boolean f48415;

    /* JADX INFO: renamed from: ۡ */
    public final String f48416;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f48417;

    /* JADX INFO: renamed from: ܶ */
    public C5276 f48420;

    /* JADX INFO: renamed from: ܺ */
    public long f48421;

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f48423;

    /* JADX INFO: renamed from: ᩴ */
    public C10962 f48425;

    /* JADX INFO: renamed from: ᩵ */
    public C5276 f48426;

    /* JADX INFO: renamed from: ᩶ */
    public final String f48427;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f48428;

    /* JADX INFO: renamed from: ᩸ */
    public final C20502 f48429;

    /* JADX INFO: renamed from: ᩻ */
    public final C9456 f48431;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f48424 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public ArrayList f48430 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public HashMap f48418 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public HashMap f48422 = new HashMap();

    /* JADX INFO: renamed from: ܳ */
    public final HashMap f48419 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C23538 m37407() {
        if (this.f48408 == null) {
            C10371 c10371 = this.f48410;
            AbstractC17043 abstractC17043 = this.f48414;
            c10371.getClass();
            this.f48408 = C23538.m52330(abstractC17043.m38684("cache"), this.f48428);
        }
        return this.f48408;
    }

    public C16484(C10371 c10371, String str, boolean z, AbstractC17043 abstractC17043, String str2, long j, long j2, ArrayList arrayList, ArrayList arrayList2, boolean z2, String str3, String str4, C21527 c21527, C9456 c9456, C20350 c20350, C21021 c21021) {
        this.f48410 = c10371;
        this.f48416 = str;
        this.f48412 = z;
        this.f48414 = abstractC17043;
        this.f48427 = str2;
        this.f48428 = arrayList;
        this.f48423 = arrayList2;
        this.f48417 = z2;
        this.f48406 = str3;
        this.f48411 = str4;
        this.f48409 = c21527;
        this.f48431 = c9456;
        this.f48413 = c20350;
        this.f48407 = c21021;
        this.f48429 = new C20502(abstractC17043.m38684("cache").m38684("smali"));
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 m37409() {
        this.f48410.getClass();
        return this.f48414.m38684("original.apk");
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m37406(String str) {
        this.f48410.getClass();
        return this.f48414.m38684("entries").m38684(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C14645 m37408(String str) {
        C14645 c14645;
        synchronized (this.f48419) {
            long jMo25101 = -1;
            try {
                try {
                    Reference reference = (Reference) this.f48419.get(str);
                    if (reference != null && (c14645 = (C14645) reference.get()) != null) {
                        return c14645;
                    }
                    AbstractC17043 abstractC17043M37406 = m37406(str);
                    jMo25101 = abstractC17043M37406.mo25101();
                    C14645 c14645M33467 = C14645.m33467(abstractC17043M37406.m38664());
                    this.f48419.put(str, new SoftReference(c14645M33467));
                    return c14645M33467;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
                throw C19553.m44408(this.f48427, this.f48412);
            } catch (OutOfMemoryError e) {
                if (jMo25101 < 0) {
                    try {
                        jMo25101 = m37406(str).mo25101();
                    } catch (Exception | OutOfMemoryError unused2) {
                    }
                }
                try {
                    Runtime runtime = Runtime.getRuntime();
                    C21306.m48193("MT MCP dex load out of memory: workspaceId=" + this.f48416 + ", dexEntryName=" + str + ", fileLength=" + jMo25101 + ", heapUsed=" + (runtime.totalMemory() - runtime.freeMemory()) + ", heapMax=" + runtime.maxMemory() + ", error=" + e.getMessage());
                    throw e;
                } catch (OutOfMemoryError unused3) {
                    throw e;
                }
            }
        }
    }
}
