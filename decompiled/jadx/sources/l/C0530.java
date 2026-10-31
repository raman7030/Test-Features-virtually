package l;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.֡ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9DZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0530 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Set f2187;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC22094 f2188;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public UUID f2189;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f2190 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f2191;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f2192;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f2193;

    public C0530(String str, int i) {
        this.f2193 = str;
        this.f2192 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2250(UUID uuid, EnumC22094 enumC22094, int i, Set set) {
        if (this.f2190) {
            throw new IllegalStateException(C4860.m14172("Server object '", this.f2193, "' already initialized"));
        }
        this.f2190 = true;
        this.f2189 = uuid;
        this.f2188 = enumC22094;
        this.f2191 = i;
        this.f2187 = set;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m2254() {
        return this.f2193;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m2252() {
        return this.f2192;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2251(C0530 c0530) {
        return c0530.f2189.equals(this.f2189) && c0530.f2188.equals(this.f2188) && (c0530.f2191 == this.f2191) && c0530.f2187.equals(this.f2187);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final UUID m2255() {
        return this.f2189;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m2253() {
        return this.f2191;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m2249() {
        return this.f2187;
    }
}
