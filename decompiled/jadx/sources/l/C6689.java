package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۜۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6689 implements InterfaceC5900 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f20784;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f20783 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f20782 = new ConcurrentMapC10942();

    public C6689(String str) {
        this.f20784 = str;
    }

    @Override // l.InterfaceC5900
    /* JADX INFO: renamed from: ۧ */
    public final void mo16541(AbstractC12955 abstractC12955) {
        synchronized (this) {
            AbstractC10134 abstractC10134Mo31523 = abstractC12955.mo31523();
            if (abstractC10134Mo31523 != null && abstractC10134Mo31523.mo25457()) {
                this.f20783.put(abstractC12955.getName(), abstractC10134Mo31523);
            } else {
                this.f20783.put(abstractC12955.getName(), ((C8806) abstractC12955.mo31522()).m22719(abstractC12955.mo31524(), abstractC12955.getName(), abstractC10134Mo31523 != null ? abstractC10134Mo31523.mo25445() : ""));
            }
        }
    }

    @Override // l.InterfaceC5900
    /* JADX INFO: renamed from: ֫ */
    public final void mo16540(AbstractC12955 abstractC12955) {
        synchronized (this) {
            this.f20783.remove(abstractC12955.getName());
            this.f20782.remove(abstractC12955.getName());
        }
    }

    @Override // l.InterfaceC5900
    /* JADX INFO: renamed from: ܽ */
    public final void mo16542(AbstractC12955 abstractC12955) {
        synchronized (this) {
            this.f20783.put(abstractC12955.getName(), abstractC12955.mo31523());
            this.f20782.remove(abstractC12955.getName());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n\tType: ");
        sb.append(this.f20784);
        ConcurrentMapC10942 concurrentMapC10942 = this.f20783;
        if (concurrentMapC10942.isEmpty()) {
            sb.append("\n\tNo services collected.");
        } else {
            sb.append("\n\tServices");
            for (Map.Entry entry : concurrentMapC10942.entrySet()) {
                sb.append("\n\t\tService: ");
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        ConcurrentMapC10942 concurrentMapC10943 = this.f20782;
        if (concurrentMapC10943.isEmpty()) {
            sb.append("\n\tNo event queued.");
        } else {
            sb.append("\n\tEvents");
            for (Map.Entry entry2 : concurrentMapC10943.entrySet()) {
                sb.append("\n\t\tEvent: ");
                sb.append((String) entry2.getKey());
                sb.append(": ");
                sb.append(entry2.getValue());
            }
        }
        return sb.toString();
    }
}
