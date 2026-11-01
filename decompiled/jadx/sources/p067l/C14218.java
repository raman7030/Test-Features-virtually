package p067l;

/* JADX INFO: renamed from: l.۫ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8IT */
/* JADX INFO: loaded from: classes3.dex */
public final class C14218 {

    /* JADX INFO: renamed from: ֫ */
    public C10307 f40505;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C12207 f40506;

    public C14218(C12207 c12207) {
        this.f40506 = c12207;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32693(final C8454 c8454) {
        C3601 c3601 = new C3601();
        c3601.m6685(c8454.f22687);
        c3601.m6689(c8454.f22685);
        c3601.m6697("video/raw");
        this.f40505 = c3601.m6672();
        this.f40506.f34120.execute(new Runnable() { // from class: l.۬ܳۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f42465.f40506.f34118.mo27043(c8454);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32692(long j, long j2, boolean z) {
        C12207 c12207 = this.f40506;
        if (z && c12207.f34122 != null) {
            c12207.f34120.execute(new Runnable() { // from class: l.ۙܳۧ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17772.f40506.f34118.mo27045();
                }
            });
        }
        C10307 c10307M6672 = this.f40505;
        if (c10307M6672 == null) {
            c10307M6672 = new C3601().m6672();
        }
        c12207.f34124.mo26158(j2, j, c10307M6672, null);
        ((InterfaceC16015) c12207.f34119.remove()).mo22193(j);
    }
}
