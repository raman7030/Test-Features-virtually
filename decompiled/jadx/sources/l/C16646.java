package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܽ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16646 {
    public static final C16646 b = new C16646();
    public final Object a;

    public C16646() {
        this.a = null;
    }

    public static C16646 empty() {
        return b;
    }

    public C16646(Object obj) {
        this.a = C11003.requireNonNull(obj);
    }

    public static C16646 of(Object obj) {
        return new C16646(obj);
    }

    public static C16646 ofNullable(Object obj) {
        return obj == null ? empty() : of(obj);
    }

    public Object get() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public boolean isEmpty() {
        return this.a == null;
    }

    public void ifPresent(Consumer consumer) {
        Object obj = this.a;
        if (obj != null) {
            consumer.accept(obj);
        }
    }

    public C16646 map(Function function) {
        C11003.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return ofNullable(function.apply(this.a));
    }

    public C16646 flatMap(Function function) {
        C11003.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return (C16646) C11003.requireNonNull((C16646) function.apply(this.a));
    }

    public Object orElse(Object obj) {
        Object obj2 = this.a;
        return obj2 != null ? obj2 : obj;
    }

    public Object orElseGet(Supplier supplier) {
        Object obj = this.a;
        return obj != null ? obj : supplier.get();
    }

    public Object orElseThrow() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public Object orElseThrow(Supplier supplier) throws Throwable {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw ((Throwable) supplier.get());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16646) {
            return C11003.equals(this.a, ((C16646) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
