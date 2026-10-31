package l;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 777R */
/* JADX INFO: loaded from: classes4.dex */
public final class C14852 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f45290;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C19626 f45291;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22274 f45292;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20158 f45293;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C8420 f45294;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f45295;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f45296;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18920 f45297;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f45298;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f45299;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f45300;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f45301;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C3059 f45304;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f45305;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45307;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C9042 f45309;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C3059 f45310;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f45311;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f45312;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19079 f45313;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7457 f45315;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f45308 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f45314 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f45302 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f45306 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f45303 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22274 m35251() {
        if (this.f45292 == null) {
            C8420 c8420 = this.f45294;
            AbstractC15440 abstractC15440 = this.f45298;
            c8420.getClass();
            this.f45292 = C22274.m50002(abstractC15440.m36526("cache"), this.f45312);
        }
        return this.f45292;
    }

    public C14852(C8420 c8420, String str, boolean z, AbstractC15440 abstractC15440, String str2, long j, long j2, ArrayList arrayList, ArrayList arrayList2, boolean z2, String str3, String str4, C20158 c20158, C7457 c7457, C18920 c18920, C19626 c19626) {
        this.f45294 = c8420;
        this.f45300 = str;
        this.f45296 = z;
        this.f45298 = abstractC15440;
        this.f45311 = str2;
        this.f45312 = arrayList;
        this.f45307 = arrayList2;
        this.f45301 = z2;
        this.f45290 = str3;
        this.f45295 = str4;
        this.f45293 = c20158;
        this.f45315 = c7457;
        this.f45297 = c18920;
        this.f45291 = c19626;
        this.f45313 = new C19079(abstractC15440.m36526("cache").m36526("smali"));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m35253() {
        this.f45294.getClass();
        return this.f45298.m36526("original.apk");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m35250(String str) {
        this.f45294.getClass();
        return this.f45298.m36526("entries").m36526(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12918 m35252(String str) {
        C12918 c12918;
        synchronized (this.f45303) {
            long jMo23127 = -1;
            try {
                try {
                    Reference reference = (Reference) this.f45303.get(str);
                    if (reference != null && (c12918 = (C12918) reference.get()) != null) {
                        return c12918;
                    }
                    AbstractC15440 abstractC15440M35250 = m35250(str);
                    jMo23127 = abstractC15440M35250.mo23127();
                    C12918 c12918M31381 = C12918.m31381(abstractC15440M35250.m36506());
                    this.f45303.put(str, new SoftReference(c12918M31381));
                    return c12918M31381;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
                throw C18081.m42149(this.f45311, this.f45296);
            } catch (OutOfMemoryError e) {
                if (jMo23127 < 0) {
                    try {
                        jMo23127 = m35250(str).mo23127();
                    } catch (Exception | OutOfMemoryError unused2) {
                    }
                }
                try {
                    Runtime runtime = Runtime.getRuntime();
                    C19926.m45880("MT MCP dex load out of memory: workspaceId=" + this.f45300 + ", dexEntryName=" + str + ", fileLength=" + jMo23127 + ", heapUsed=" + (runtime.totalMemory() - runtime.freeMemory()) + ", heapMax=" + runtime.maxMemory() + ", error=" + e.getMessage());
                    throw e;
                } catch (OutOfMemoryError unused3) {
                    throw e;
                }
            }
        }
    }
}
