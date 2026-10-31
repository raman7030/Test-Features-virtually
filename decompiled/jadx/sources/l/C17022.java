package l;

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
public final /* synthetic */ class C17022 implements InterfaceC9469, DirectoryStream.Filter, InterfaceC22168, BiPredicate, IntPredicate, LongPredicate, Predicate, DoubleFunction, Function, LongFunction, Consumer, BooleanSupplier {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C17022(int i) {
        this.a = i;
    }

    public /* synthetic */ C17022(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 13:
                ((InterfaceC0585) this.b).accept(obj);
                break;
            default:
                ((List) this.b).add(obj);
                break;
        }
    }

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C14344.$default$and(this, biPredicate);
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C8701.$default$and(this, intPredicate);
    }

    public /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return C3762.$default$and(this, longPredicate);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 13:
                break;
        }
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // l.InterfaceC22168
    public String name() {
        switch (this.a) {
        }
        return "posix:permissions";
    }

    public /* synthetic */ BiPredicate negate() {
        return C14344.$default$negate(this);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ IntPredicate m39986negate() {
        return C8701.$default$negate(this);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ LongPredicate m39987negate() {
        return C3762.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return C14344.$default$or(this, biPredicate);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C8701.$default$or(this, intPredicate);
    }

    public /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        return C3762.$default$or(this, longPredicate);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* JADX INFO: renamed from: accept, reason: collision with other method in class */
    public boolean mo39985accept(Object obj) {
        switch (this.a) {
            case 1:
                return ((InterfaceC9469) this.b).matches(((InterfaceC20758) obj).getFileName());
            default:
                return ((DirectoryStream.Filter) this.b).mo39985accept(AbstractC22791.p(obj));
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC17664) {
            return C18370.convert((InterfaceC17664) objApply);
        }
        if (objApply instanceof Stream) {
            return C1686.b((Stream) objApply);
        }
        if (objApply instanceof InterfaceC11315) {
            return C2142.convert((InterfaceC11315) objApply);
        }
        if (objApply instanceof IntStream) {
            return C7454.convert((IntStream) objApply);
        }
        if (objApply instanceof InterfaceC0458) {
            return C14569.b((InterfaceC0458) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C10609.b((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC18725) {
            return C18019.b((InterfaceC18725) objApply);
        }
        if (objApply instanceof LongStream) {
            return C12811.b((LongStream) objApply);
        }
        C16461.a(objApply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i) {
        return !((IntPredicate) this.b).test(i);
    }

    @Override // java.util.function.LongPredicate
    public boolean test(long j) {
        return !((LongPredicate) this.b).test(j);
    }

    @Override // java.util.function.BiPredicate
    public boolean test(Object obj, Object obj2) {
        return !((BiPredicate) this.b).test(obj, obj2);
    }

    public C17022() {
        this.a = 5;
        this.b = CoderResult.UNDERFLOW;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC0458) {
            return C14569.b((InterfaceC0458) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C10609.b((DoubleStream) objApply);
        }
        C16461.a(objApply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // l.InterfaceC9469
    public boolean matches(InterfaceC20758 interfaceC20758) {
        return ((Pattern) this.b).matcher(interfaceC20758.toString()).matches();
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC18725) {
            return C18019.b((InterfaceC18725) objApply);
        }
        if (objApply instanceof LongStream) {
            return C12811.b((LongStream) objApply);
        }
        C16461.a(objApply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // l.InterfaceC22168
    public Object value() {
        switch (this.a) {
            case 3:
                return Collections.unmodifiableSet(AbstractC22791.v((Set) ((FileAttribute) this.b).value()));
            default:
                return Collections.unmodifiableSet((Set) this.b);
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 16:
                C1291 c1291 = (C1291) this.b;
                return c1291.d.tryAdvance(c1291.e);
            case 17:
                C23848 c23848 = (C23848) this.b;
                return c23848.d.tryAdvance(c23848.e);
            case 18:
                C10443 c10443 = (C10443) this.b;
                return c10443.d.tryAdvance(c10443.e);
            default:
                C8847 c8847 = (C8847) this.b;
                return c8847.d.tryAdvance(c8847.e);
        }
    }

    public void a(EnumC22147 enumC22147) {
        ((EnumMap) ((Map) this.b)).put(enumC22147, 1);
    }
}
