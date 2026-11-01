package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۜۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8726 implements InterfaceC7976 {

    /* JADX INFO: renamed from: ܽ */
    public final String f23659;

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f23658 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public final ConcurrentMapC12768 f23657 = new ConcurrentMapC12768();

    public C8726(String str) {
        this.f23659 = str;
    }

    @Override // p067l.InterfaceC7976
    /* JADX INFO: renamed from: ۧ */
    public final void mo18467(AbstractC14681 abstractC14681) {
        synchronized (this) {
            AbstractC12000 abstractC12000Mo33610 = abstractC14681.mo33610();
            if (abstractC12000Mo33610 != null && abstractC12000Mo33610.mo27477()) {
                this.f23658.put(abstractC14681.getName(), abstractC12000Mo33610);
            } else {
                this.f23658.put(abstractC14681.getName(), ((C10738) abstractC14681.mo33609()).m24689(abstractC14681.mo33611(), abstractC14681.getName(), abstractC12000Mo33610 != null ? abstractC12000Mo33610.mo27465() : ""));
            }
        }
    }

    @Override // p067l.InterfaceC7976
    /* JADX INFO: renamed from: ֫ */
    public final void mo18466(AbstractC14681 abstractC14681) {
        synchronized (this) {
            this.f23658.remove(abstractC14681.getName());
            this.f23657.remove(abstractC14681.getName());
        }
    }

    @Override // p067l.InterfaceC7976
    /* JADX INFO: renamed from: ܽ */
    public final void mo18468(AbstractC14681 abstractC14681) {
        synchronized (this) {
            this.f23658.put(abstractC14681.getName(), abstractC14681.mo33610());
            this.f23657.remove(abstractC14681.getName());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n\tType: ");
        sb.append(this.f23659);
        ConcurrentMapC12768 concurrentMapC12768 = this.f23658;
        if (concurrentMapC12768.isEmpty()) {
            sb.append("\n\tNo services collected.");
        } else {
            sb.append("\n\tServices");
            for (Map.Entry entry : concurrentMapC12768.entrySet()) {
                sb.append("\n\t\tService: ");
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        ConcurrentMapC12768 concurrentMapC12769 = this.f23657;
        if (concurrentMapC12769.isEmpty()) {
            sb.append("\n\tNo event queued.");
        } else {
            sb.append("\n\tEvents");
            for (Map.Entry entry2 : concurrentMapC12769.entrySet()) {
                sb.append("\n\t\tEvent: ");
                sb.append((String) entry2.getKey());
                sb.append(": ");
                sb.append(entry2.getValue());
            }
        }
        return sb.toString();
    }
}
