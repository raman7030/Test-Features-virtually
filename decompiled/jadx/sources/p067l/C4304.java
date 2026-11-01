package p067l;

/* JADX INFO: renamed from: l.֫᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: W142 */
/* JADX INFO: loaded from: classes2.dex */
public class C4304 implements InterfaceC18588 {

    /* JADX INFO: renamed from: ۙ */
    public final C6455 f9572;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f9573;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC23810 f9574;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f9575;

    /* JADX INFO: renamed from: ֫ */
    public static C4304 m8746(InterfaceC7717 interfaceC7717) {
        if (interfaceC7717 == null) {
            return null;
        }
        if (interfaceC7717 instanceof InterfaceC3693) {
            return new C4304((InterfaceC3693) interfaceC7717);
        }
        if (interfaceC7717 instanceof InterfaceC23810) {
            return new C4304((InterfaceC23810) interfaceC7717);
        }
        return new C4304(interfaceC7717);
    }

    public C4304(InterfaceC7717 interfaceC7717) {
        this.f9574 = new C24400(interfaceC7717);
        this.f9575 = false;
        this.f9572 = null;
    }

    public C4304(InterfaceC3693 interfaceC3693) {
        this.f9574 = new C15682(interfaceC3693);
        this.f9575 = false;
        this.f9572 = null;
    }

    public C4304(InterfaceC23810 interfaceC23810) {
        this.f9574 = interfaceC23810;
        this.f9575 = true;
        C6455 c6455Mo7910 = interfaceC23810.mo7910();
        if (c6455Mo7910 == null) {
            c6455Mo7910 = new C6455();
            c6455Mo7910.m14742();
            this.f9573 = true;
        }
        this.f9572 = c6455Mo7910;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public boolean mo3924() {
        return this.f9574.mo3924();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8747(long j, long j2, long j3) {
        if (this.f9575) {
            C6455 c6455 = this.f9572;
            if (j > 0) {
                c6455.m14741(j);
            }
            this.f9574.mo7909(j, j2, j3, c6455.m14740());
            return;
        }
        this.f9574.mo7909(j, j2, j3, 0L);
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public void mo8749() {
        this.f9574.mo4048();
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo8748() {
        if (this.f9573) {
            this.f9572.m14743();
        }
    }
}
