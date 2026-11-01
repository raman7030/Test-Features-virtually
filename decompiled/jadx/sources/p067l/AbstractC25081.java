package p067l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩻᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25081 {

    /* JADX INFO: renamed from: ֫ */
    public C6956 f80009;

    /* JADX INFO: renamed from: ܽ */
    public long f80011;

    /* JADX INFO: renamed from: ܿ */
    public C9226 f80012;

    /* JADX INFO: renamed from: ᩳ */
    public final LinkedHashMap f80013 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ */
    public boolean f80010 = true;

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo8717();

    /* JADX INFO: renamed from: ֫ */
    public final void m55058(C23050 c23050) {
        c23050.m51436(this);
        this.f80013.put(c23050.m51432().toLowerCase(), c23050);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55057(C10309 c10309, String str) {
        c10309.m51433(str);
        m55058(c10309);
    }

    /* JADX INFO: renamed from: ֫ */
    public C23050 mo15937(String str) {
        return (C23050) this.f80013.get(str.toLowerCase());
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m55059() {
        C9226 c9226 = this.f80012;
        if (c9226 == null) {
            throw new RuntimeException("This " + getClass().getName() + " was not add()ed to a Synthesizer.");
        }
        c9226.m21259(this);
    }

    /* JADX INFO: renamed from: ܿ */
    public final C9226 m55062() {
        return this.f80012;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C9226 m55060() {
        return this.f80012;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15939(C9226 c9226) {
        C9226 c9227 = this.f80012;
        if (c9227 != null && c9227 != c9226) {
            throw new RuntimeException("Unit synthesisEngine already set.");
        }
        this.f80012 = c9226;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15938() {
        for (C23050 c23050 : this.f80013.values()) {
            if (c23050 instanceof C17013) {
                ((C17013) c23050).m38619();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55056(C6956 c6956) {
        if (this.f80009 != null) {
            throw new RuntimeException("Unit is already in a circuit.");
        }
        this.f80009 = c6956;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C6956 m55061() {
        return this.f80009;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55055(long j) {
        if (!this.f80010 || j <= this.f80011) {
            return;
        }
        this.f80011 = j;
        for (Object obj : this.f80013.values()) {
            if (obj instanceof InterfaceC19697) {
                ((InterfaceC19697) obj).mo20717(j);
            }
        }
        mo8717();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m55063() {
        return this.f80010;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15941(boolean z) {
        this.f80010 = z;
        if (z) {
            return;
        }
        mo15938();
    }
}
