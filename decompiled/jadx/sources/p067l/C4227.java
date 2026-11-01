package p067l;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.֫ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4227 extends AbstractC25014 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f9301b;

    /* JADX INFO: renamed from: c */
    public Object f9302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4227(InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f9301b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4227(AbstractC14463 abstractC14463, InterfaceC2925 interfaceC2925, int i) {
        super(interfaceC2925);
        this.f9301b = i;
        this.f9302c = abstractC14463;
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    public void end() {
        switch (this.f9301b) {
            case 0:
                this.f9302c = null;
                this.f79851a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public void mo4231c(long j) {
        switch (this.f9301b) {
            case 0:
                this.f9302c = new HashSet();
                this.f79851a.mo4231c(-1L);
                break;
            case 1:
            default:
                super.mo4231c(j);
                break;
            case 2:
                this.f79851a.mo4231c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f9301b) {
            case 0:
                if (!((Set) this.f9302c).contains(obj)) {
                    ((Set) this.f9302c).add(obj);
                    this.f79851a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((C10973) this.f9302c).f30392t).accept(obj);
                this.f79851a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((C10973) this.f9302c).f30392t).test(obj)) {
                    this.f79851a.accept(obj);
                }
                break;
            case 3:
                this.f79851a.accept(((C15544) this.f9302c).f44414t.apply(obj));
                break;
            case 4:
                this.f79851a.accept(((ToIntFunction) ((C9631) this.f9302c).f26512t).applyAsInt(obj));
                break;
            case 5:
                this.f79851a.accept(((ToLongFunction) ((C23023) this.f9302c).f72404t).applyAsLong(obj));
                break;
            default:
                this.f79851a.accept(((ToDoubleFunction) ((C23043) this.f9302c).f72427t).applyAsDouble(obj));
                break;
        }
    }
}
