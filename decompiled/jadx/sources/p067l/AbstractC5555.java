package p067l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ۗܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9CR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5555 implements Closeable {

    /* JADX INFO: renamed from: ۙ */
    public C15612 f13421;

    /* JADX INFO: renamed from: ᩶ */
    public C18139 f13422;

    /* JADX INFO: renamed from: ᩸ */
    public C13978 f13423;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC4410 f13424;

    public AbstractC5555() {
        throw null;
    }

    public AbstractC5555(C13978 c13978, C15612 c15612, C18139 c18139) {
        this.f13424 = C13128.m30022(getClass());
        new ArrayList();
        new ReentrantReadWriteLock();
        this.f13423 = c13978;
        this.f13422 = c18139;
        this.f13421 = c15612;
        C13128.m30022(getClass());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12288(InterfaceC10626 interfaceC10626) throws Throwable {
        C15612 c15612 = this.f13421;
        c15612.getClass();
        C2460 c2460 = new C2460();
        InterfaceC20803 interfaceC20803M36338 = C15989.m36338(interfaceC10626);
        interfaceC20803M36338.mo5893(interfaceC10626, c2460);
        c15612.m10462(this.f13423, EnumC9087.SMB2_0_INFO_FILE, interfaceC20803M36338.mo5892(), c2460.m28123());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13421.mo10461(this.f13423);
    }

    public final int hashCode() {
        C18139 c18139 = this.f13422;
        int iHashCode = ((c18139 == null ? 0 : c18139.hashCode()) + 31) * 31;
        C15612 c15612 = this.f13421;
        return iHashCode + (c15612 != null ? c15612.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC5555 abstractC5555 = (AbstractC5555) obj;
        C15612 c15612 = abstractC5555.f13421;
        C18139 c18139 = abstractC5555.f13422;
        C18139 c181310 = this.f13422;
        if (c181310 == null) {
            if (c18139 != null) {
                return false;
            }
        } else if (!c181310.equals(c18139)) {
            return false;
        }
        C15612 c15613 = this.f13421;
        if (c15613 == null) {
            return c15612 == null;
        }
        return c15613.equals(c15612);
    }
}
