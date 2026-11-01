package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܽ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18189 {

    /* JADX INFO: renamed from: b */
    public static final C18189 f54308b = new C18189();

    /* JADX INFO: renamed from: a */
    public final Object f54309a;

    public C18189() {
        this.f54309a = null;
    }

    public static C18189 empty() {
        return f54308b;
    }

    public C18189(Object obj) {
        this.f54309a = C12826.requireNonNull(obj);
    }

    /* JADX INFO: renamed from: of */
    public static C18189 m41402of(Object obj) {
        return new C18189(obj);
    }

    public static C18189 ofNullable(Object obj) {
        return obj == null ? empty() : m41402of(obj);
    }

    public Object get() {
        Object obj = this.f54309a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.f54309a != null;
    }

    public boolean isEmpty() {
        return this.f54309a == null;
    }

    public void ifPresent(Consumer consumer) {
        Object obj = this.f54309a;
        if (obj != null) {
            consumer.accept(obj);
        }
    }

    public C18189 map(Function function) {
        C12826.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return ofNullable(function.apply(this.f54309a));
    }

    public C18189 flatMap(Function function) {
        C12826.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return (C18189) C12826.requireNonNull((C18189) function.apply(this.f54309a));
    }

    public Object orElse(Object obj) {
        Object obj2 = this.f54309a;
        return obj2 != null ? obj2 : obj;
    }

    public Object orElseGet(Supplier supplier) {
        Object obj = this.f54309a;
        return obj != null ? obj : supplier.get();
    }

    public Object orElseThrow() {
        Object obj = this.f54309a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public Object orElseThrow(Supplier supplier) throws Throwable {
        Object obj = this.f54309a;
        if (obj != null) {
            return obj;
        }
        throw ((Throwable) supplier.get());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18189) {
            return C12826.equals(this.f54309a, ((C18189) obj).f54309a);
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hashCode(this.f54309a);
    }

    public final String toString() {
        Object obj = this.f54309a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
