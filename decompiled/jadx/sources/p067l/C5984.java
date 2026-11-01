package p067l;

/* JADX INFO: renamed from: l.ۘ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O5QJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5984 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC2630 f14799;

    /* JADX INFO: renamed from: ۜ */
    public C20066 f14800;

    /* JADX INFO: renamed from: ۡ */
    public C10678 f14801;

    /* JADX INFO: renamed from: ۢ */
    public long f14802;

    /* JADX INFO: renamed from: ۧ */
    public C20066 f14803;

    /* JADX INFO: renamed from: ܳ */
    public String f14804;

    /* JADX INFO: renamed from: ܺ */
    public long f14805;

    /* JADX INFO: renamed from: ܽ */
    public int f14806 = -1;

    /* JADX INFO: renamed from: ܿ */
    public C14205 f14807 = new C14205();

    /* JADX INFO: renamed from: ᩳ */
    public C14875 f14808;

    /* JADX INFO: renamed from: ᩷ */
    public EnumC16041 f14809;

    /* JADX INFO: renamed from: ᩻ */
    public C20066 f14810;

    /* JADX INFO: renamed from: ֫ */
    public final void m13415(C10678 c10678) {
        this.f14801 = c10678;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13418(EnumC16041 enumC16041) {
        this.f14809 = enumC16041;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13411(int i) {
        this.f14806 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13422(String str) {
        this.f14804 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13417(C14875 c14875) {
        this.f14808 = c14875;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13420() {
        C14205 c14205 = this.f14807;
        c14205.getClass();
        C12194.m28160("Proxy-Authenticate");
        C12194.m28158("OkHttp-Preemptive", "Proxy-Authenticate");
        c14205.m32682("Proxy-Authenticate");
        c14205.m32681("Proxy-Authenticate", "OkHttp-Preemptive");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13413(String str) {
        this.f14807.m32679("Warning", str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13416(C12194 c12194) {
        this.f14807 = c12194.m28163();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13414(AbstractC2630 abstractC2630) {
        this.f14799 = abstractC2630;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13423(C20066 c20066) {
        if (c20066 != null) {
            m13409("networkResponse", c20066);
        }
        this.f14810 = c20066;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13419(C20066 c20066) {
        if (c20066 != null) {
            m13409("cacheResponse", c20066);
        }
        this.f14803 = c20066;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13409(String str, C20066 c20066) {
        if (c20066.f60968 != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (c20066.f60962 != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (c20066.f60967 != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (c20066.f60960 != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m13424(C20066 c20066) {
        if (c20066.f60968 == null) {
            this.f14800 = c20066;
            return;
        }
        throw new IllegalArgumentException("priorResponse.body != null");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13421(long j) {
        this.f14805 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13412(long j) {
        this.f14802 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20066 m13410() {
        if (this.f14801 == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f14809 == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f14806 < 0) {
            throw new IllegalStateException("code < 0: " + this.f14806);
        }
        if (this.f14804 == null) {
            throw new IllegalStateException("message == null");
        }
        return new C20066(this);
    }
}
