package l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩻᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23898 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4827 f77258;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f77260;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7216 f77261;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f77262 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f77259 = true;

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo6591();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52649(C21761 c21761) {
        c21761.m49087(this);
        this.f77262.put(c21761.m49083().toLowerCase(), c21761);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52648(C8355 c8355, String str) {
        c8355.m49084(str);
        m52649(c8355);
    }

    /* JADX INFO: renamed from: ֫ */
    public C21761 mo14057(String str) {
        return (C21761) this.f77262.get(str.toLowerCase());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m52650() {
        C7216 c7216 = this.f77261;
        if (c7216 == null) {
            throw new RuntimeException("This " + getClass().getName() + " was not add()ed to a Synthesizer.");
        }
        c7216.m19311(this);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7216 m52653() {
        return this.f77261;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7216 m52651() {
        return this.f77261;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14059(C7216 c7216) {
        C7216 c7217 = this.f77261;
        if (c7217 != null && c7217 != c7216) {
            throw new RuntimeException("Unit synthesisEngine already set.");
        }
        this.f77261 = c7216;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14058() {
        for (C21761 c21761 : this.f77262.values()) {
            if (c21761 instanceof C15409) {
                ((C15409) c21761).m36461();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52647(C4827 c4827) {
        if (this.f77258 != null) {
            throw new RuntimeException("Unit is already in a circuit.");
        }
        this.f77258 = c4827;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4827 m52652() {
        return this.f77258;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52646(long j) {
        if (!this.f77259 || j <= this.f77260) {
            return;
        }
        this.f77260 = j;
        for (Object obj : this.f77262.values()) {
            if (obj instanceof InterfaceC18233) {
                ((InterfaceC18233) obj).mo18763(j);
            }
        }
        mo6591();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m52654() {
        return this.f77259;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14061(boolean z) {
        this.f77259 = z;
        if (z) {
            return;
        }
        mo14058();
    }
}
