package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩶ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BES */
/* JADX INFO: loaded from: classes4.dex */
public final class C20316 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8321 f65610;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C3382 f65611;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23759 f65612;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1887 f65613;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19527 f65614;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20938 f65615;

    public C20316(C23759 c23759, C19527 c19527) {
        if (c23759 == null) {
            throw new NullPointerException("unprocessedInsns == null");
        }
        this.f65612 = c23759;
        this.f65614 = c19527;
        this.f65610 = null;
        this.f65615 = null;
        this.f65613 = null;
        this.f65611 = null;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m46596() {
        if (this.f65611 != null) {
            return;
        }
        C3382 c3382M52415 = this.f65612.m52415();
        this.f65611 = c3382M52415;
        this.f65615 = C20938.m47760(c3382M52415);
        C3382 c3382 = this.f65611;
        C1887 c1887 = C1887.f6397;
        int size = c3382.size();
        C7615 c7615 = new C7615(size);
        for (int i = 0; i < size; i++) {
            AbstractC4793 abstractC4793M40993get = c3382.m40993get(i);
            if (abstractC4793M40993get instanceof C11060) {
                c7615.m20409(abstractC4793M40993get.m13990(), ((C11060) abstractC4793M40993get).m27446());
            } else if (abstractC4793M40993get instanceof C16703) {
                c7615.m20410(abstractC4793M40993get.m13990(), ((C16703) abstractC4793M40993get).m39269());
            }
        }
        this.f65613 = c7615.m20408();
        this.f65610 = this.f65614.m44930();
        this.f65612 = null;
        this.f65614 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46598(InterfaceC22432 interfaceC22432) {
        this.f65612.m52419(interfaceC22432);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46605() {
        return this.f65612.m52423();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m46599() {
        return this.f65612.m52421();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m46606() {
        return this.f65614.m44932();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet m46597() {
        return this.f65614.m44931();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashSet m46602() {
        return this.f65612.m52420();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3382 m46604() {
        m46596();
        return this.f65611;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8321 m46600() {
        m46596();
        return this.f65610;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20938 m46601() {
        m46596();
        return this.f65615;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1887 m46603() {
        m46596();
        return this.f65613;
    }
}
