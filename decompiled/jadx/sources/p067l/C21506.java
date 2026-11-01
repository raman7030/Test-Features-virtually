package p067l;

/* JADX INFO: renamed from: l.᩶ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21506 extends AbstractC25014 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f67843b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f67844c;

    /* JADX INFO: renamed from: d */
    public Object f67845d;

    public /* synthetic */ C21506(InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21506(C8941 c8941, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f67845d = c8941;
        this.f67844c = true;
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        switch (this.f67843b) {
            case 0:
                this.f67844c = false;
                this.f67845d = null;
                this.f79851a.mo4231c(-1L);
                break;
            case 1:
                this.f79851a.mo4231c(-1L);
                break;
            default:
                this.f79851a.mo4231c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f67843b) {
            case 0:
                InterfaceC2925 interfaceC2925 = this.f79851a;
                if (obj == null) {
                    if (this.f67844c) {
                        return;
                    }
                    this.f67844c = true;
                    this.f67845d = null;
                    interfaceC2925.accept((Object) null);
                    return;
                }
                Object obj2 = this.f67845d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f67845d = obj;
                    interfaceC2925.accept(obj);
                    return;
                }
                return;
            case 1:
                InterfaceC19157 interfaceC19157 = (InterfaceC19157) ((C15544) this.f67845d).f44414t.apply(obj);
                if (interfaceC19157 != null) {
                    try {
                        boolean z = this.f67844c;
                        InterfaceC2925 interfaceC2926 = this.f79851a;
                        if (!z) {
                            ((InterfaceC19157) interfaceC19157.sequential()).forEach(interfaceC2926);
                        } else {
                            InterfaceC16847 interfaceC16847Spliterator = ((InterfaceC19157) interfaceC19157.sequential()).spliterator();
                            while (!interfaceC2926.mo4233f() && interfaceC16847Spliterator.tryAdvance(interfaceC2926)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC19157.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC19157 != null) {
                    interfaceC19157.close();
                    return;
                }
                return;
            default:
                if (this.f67844c) {
                    boolean zTest = ((C8941) this.f67845d).f24232t.test(obj);
                    this.f67844c = zTest;
                    if (zTest) {
                        this.f79851a.accept(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public boolean mo4233f() {
        switch (this.f67843b) {
            case 1:
                this.f67844c = true;
                return this.f79851a.mo4233f();
            case 2:
                return !this.f67844c || this.f79851a.mo4233f();
            default:
                return super.mo4233f();
        }
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    public void end() {
        switch (this.f67843b) {
            case 0:
                this.f67844c = false;
                this.f67845d = null;
                this.f79851a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21506(C15544 c15544, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f67845d = c15544;
    }
}
