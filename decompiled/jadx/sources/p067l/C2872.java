package p067l;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.֡ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9DZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2872 {

    /* JADX INFO: renamed from: ֫ */
    public Set f4960;

    /* JADX INFO: renamed from: ۧ */
    public EnumC23366 f4961;

    /* JADX INFO: renamed from: ܳ */
    public UUID f4962;

    /* JADX INFO: renamed from: ܽ */
    public boolean f4963 = false;

    /* JADX INFO: renamed from: ܿ */
    public int f4964;

    /* JADX INFO: renamed from: ᩳ */
    public int f4965;

    /* JADX INFO: renamed from: ᩻ */
    public String f4966;

    public C2872(String str, int i) {
        this.f4966 = str;
        this.f4965 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4617(UUID uuid, EnumC23366 enumC23366, int i, Set set) {
        if (this.f4963) {
            throw new IllegalStateException(C6988.m16053("Server object '", this.f4966, "' already initialized"));
        }
        this.f4963 = true;
        this.f4962 = uuid;
        this.f4961 = enumC23366;
        this.f4964 = i;
        this.f4960 = set;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m4621() {
        return this.f4966;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m4619() {
        return this.f4965;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m4618(C2872 c2872) {
        return c2872.f4962.equals(this.f4962) && c2872.f4961.equals(this.f4961) && (c2872.f4964 == this.f4964) && c2872.f4960.equals(this.f4960);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final UUID m4622() {
        return this.f4962;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m4620() {
        return this.f4964;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Set m4616() {
        return this.f4960;
    }
}
