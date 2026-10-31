package l;

/* JADX INFO: renamed from: l.᩶ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20136 extends AbstractC23827 {
    public final /* synthetic */ int b = 0;
    public boolean c;
    public Object d;

    public /* synthetic */ C20136(InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20136(C6915 c6915, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.d = c6915;
        this.c = true;
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final void c(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.c(-1L);
                break;
            case 1:
                this.a.c(-1L);
                break;
            default:
                this.a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                InterfaceC0585 interfaceC0585 = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    interfaceC0585.accept((Object) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    interfaceC0585.accept(obj);
                    return;
                }
                return;
            case 1:
                InterfaceC17664 interfaceC17664 = (InterfaceC17664) ((C13863) this.d).t.apply(obj);
                if (interfaceC17664 != null) {
                    try {
                        boolean z = this.c;
                        InterfaceC0585 interfaceC0586 = this.a;
                        if (!z) {
                            ((InterfaceC17664) interfaceC17664.sequential()).forEach(interfaceC0586);
                        } else {
                            InterfaceC15234 interfaceC15234Spliterator = ((InterfaceC17664) interfaceC17664.sequential()).spliterator();
                            while (!interfaceC0586.f() && interfaceC15234Spliterator.tryAdvance(interfaceC0586)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC17664.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC17664 != null) {
                    interfaceC17664.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((C6915) this.d).t.test(obj);
                    this.c = zTest;
                    if (zTest) {
                        this.a.accept(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public boolean f() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.f();
            case 2:
                return !this.c || this.a.f();
            default:
                return super.f();
        }
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20136(C13863 c13863, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.d = c13863;
    }
}
