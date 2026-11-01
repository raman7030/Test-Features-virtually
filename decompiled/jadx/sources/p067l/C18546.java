package p067l;

import java.nio.charset.CoderResult;
import java.nio.file.DirectoryStream;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܿ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18546 implements InterfaceC11368, DirectoryStream.Filter, InterfaceC23437, BiPredicate, IntPredicate, LongPredicate, Predicate, DoubleFunction, Function, LongFunction, Consumer, BooleanSupplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55374a;

    /* JADX INFO: renamed from: b */
    public Object f55375b;

    public /* synthetic */ C18546(int i) {
        this.f55374a = i;
    }

    public /* synthetic */ C18546(int i, Object obj) {
        this.f55374a = i;
        this.f55375b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f55374a) {
            case 13:
                ((InterfaceC2925) this.f55375b).accept(obj);
                break;
            default:
                ((List) this.f55375b).add(obj);
                break;
        }
    }

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C16001.$default$and(this, biPredicate);
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C10638.$default$and(this, intPredicate);
    }

    public /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return C5944.$default$and(this, longPredicate);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f55374a) {
            case 13:
                break;
        }
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // p067l.InterfaceC23437
    public String name() {
        switch (this.f55374a) {
        }
        return "posix:permissions";
    }

    public /* synthetic */ BiPredicate negate() {
        return C16001.$default$negate(this);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ IntPredicate m56508negate() {
        return C10638.$default$negate(this);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ LongPredicate m56509negate() {
        return C5944.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ BiPredicate m42229or(BiPredicate biPredicate) {
        return C16001.$default$or(this, biPredicate);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ IntPredicate m42230or(IntPredicate intPredicate) {
        return C10638.$default$or(this, intPredicate);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ LongPredicate m42231or(LongPredicate longPredicate) {
        return C5944.$default$or(this, longPredicate);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m42232or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* JADX INFO: renamed from: accept, reason: collision with other method in class */
    public boolean mo56507accept(Object obj) {
        switch (this.f55374a) {
            case 1:
                return ((InterfaceC11368) this.f55375b).matches(((InterfaceC22097) obj).getFileName());
            default:
                return ((DirectoryStream.Filter) this.f55375b).mo56507accept(AbstractC24029.m53247p(obj));
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f55375b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.f55375b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC19157) {
            return C19828.convert((InterfaceC19157) objApply);
        }
        if (objApply instanceof Stream) {
            return C3971.m7917b((Stream) objApply);
        }
        if (objApply instanceof InterfaceC13123) {
            return C4405.convert((InterfaceC13123) objApply);
        }
        if (objApply instanceof IntStream) {
            return C9453.convert((IntStream) objApply);
        }
        if (objApply instanceof InterfaceC2804) {
            return C16215.m36972b((InterfaceC2804) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C12452.m28669b((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC20165) {
            return C19494.m44322b((InterfaceC20165) objApply);
        }
        if (objApply instanceof LongStream) {
            return C14544.m33214b((LongStream) objApply);
        }
        C18013.m40990a(objApply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i) {
        return !((IntPredicate) this.f55375b).test(i);
    }

    @Override // java.util.function.LongPredicate
    public boolean test(long j) {
        return !((LongPredicate) this.f55375b).test(j);
    }

    @Override // java.util.function.BiPredicate
    public boolean test(Object obj, Object obj2) {
        return !((BiPredicate) this.f55375b).test(obj, obj2);
    }

    public C18546() {
        this.f55374a = 5;
        this.f55375b = CoderResult.UNDERFLOW;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.f55375b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC2804) {
            return C16215.m36972b((InterfaceC2804) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C12452.m28669b((DoubleStream) objApply);
        }
        C18013.m40990a(objApply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // p067l.InterfaceC11368
    public boolean matches(InterfaceC22097 interfaceC22097) {
        return ((Pattern) this.f55375b).matcher(interfaceC22097.toString()).matches();
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.f55375b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC20165) {
            return C19494.m44322b((InterfaceC20165) objApply);
        }
        if (objApply instanceof LongStream) {
            return C14544.m33214b((LongStream) objApply);
        }
        C18013.m40990a(objApply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // p067l.InterfaceC23437
    public Object value() {
        switch (this.f55374a) {
            case 3:
                return Collections.unmodifiableSet(AbstractC24029.m53253v((Set) ((FileAttribute) this.f55375b).value()));
            default:
                return Collections.unmodifiableSet((Set) this.f55375b);
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f55374a) {
            case 16:
                C3596 c3596 = (C3596) this.f55375b;
                return c3596.f71315d.tryAdvance(c3596.f71316e);
            case 17:
                C25034 c25034 = (C25034) this.f55375b;
                return c25034.f71315d.tryAdvance(c25034.f71316e);
            case 18:
                C12294 c12294 = (C12294) this.f55375b;
                return c12294.f71315d.tryAdvance(c12294.f71316e);
            default:
                C10777 c10777 = (C10777) this.f55375b;
                return c10777.f71315d.tryAdvance(c10777.f71316e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42228a(EnumC23417 enumC23417) {
        ((EnumMap) ((Map) this.f55375b)).put(enumC23417, 1);
    }
}
