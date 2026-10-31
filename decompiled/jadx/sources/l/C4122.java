package l;

/* JADX INFO: renamed from: l.ۘᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4122 extends AbstractC21056 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18939 f13077;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4122(C18939 c18939, AbstractC2821 abstractC2821, int i, int i2) {
        super(c18939);
        this.f13077 = c18939;
        int i3 = i + i2;
        if (i3 > abstractC2821.mo8716()) {
            throw new IllegalArgumentException(C19370.m44628(i3, "tried to queue past end of data, "));
        }
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "tried to queue before start of data, "));
        }
        this.f67922 = abstractC2821;
        new C9061(3);
        this.f29547 = i;
        this.f29550 = i2;
    }

    @Override // l.InterfaceC7838
    public final void run() {
        synchronized (this.f13077.f59735) {
            if (this.f13077.f59735.size() > 0) {
                ((C9767) this.f13077.f59735.getLast()).getClass();
            }
            this.f13077.f59735.add(this);
        }
    }
}
