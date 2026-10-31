package l;

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
public final class C1955 extends AbstractC23827 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1955(InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1955(AbstractC12725 abstractC12725, InterfaceC0585 interfaceC0585, int i) {
        super(interfaceC0585);
        this.b = i;
        this.c = abstractC12725;
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public void c(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.c(-1L);
                break;
            case 1:
            default:
                super.c(j);
                break;
            case 2:
                this.a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((Set) this.c).contains(obj)) {
                    ((Set) this.c).add(obj);
                    this.a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((C9053) this.c).t).accept(obj);
                this.a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((C9053) this.c).t).test(obj)) {
                    this.a.accept(obj);
                }
                break;
            case 3:
                this.a.accept(((C13863) this.c).t.apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((C7641) this.c).t).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((C21732) this.c).t).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((C21753) this.c).t).applyAsDouble(obj));
                break;
        }
    }
}
