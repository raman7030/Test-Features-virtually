package l;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۡ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8556 implements Predicate, InterfaceC2974, Function, UnaryOperator, IntFunction, BinaryOperator, BiConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ C8556(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 15:
                ((Collection) obj).add(obj2);
                break;
            case 17:
                ((List) obj).add(obj2);
                break;
            case 20:
                ((Set) obj).add(obj2);
                break;
            default:
                ((C20175) obj).add((CharSequence) obj2);
                break;
        }
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 15:
                break;
            case 17:
                break;
            case 20:
                break;
        }
        return C17873.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 14:
                break;
            case 16:
                break;
            case 18:
                break;
            case 21:
                break;
            case 23:
                break;
            case 26:
                break;
        }
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo22274andThen(Function function) {
        switch (this.a) {
            case 11:
                break;
            case 12:
                break;
            case 19:
                break;
            case 22:
                break;
            case 24:
                break;
        }
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 11:
                break;
            case 12:
                break;
            case 19:
                break;
            case 22:
                break;
            case 24:
                break;
        }
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((String) obj).isEmpty();
    }

    @Override // l.InterfaceC2974
    public InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        EnumC18496 enumC18496 = EnumC18496.DAY_OF_MONTH;
        return interfaceC15672.c(interfaceC15672.n(enumC18496).d, enumC18496);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                Map map = (Map) obj;
                Set set = C22976.a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Object key = entry.getKey();
                    Object objRequireNonNull = C11003.requireNonNull(entry.getValue());
                    Object objPutIfAbsent = C13843.putIfAbsent(map, key, objRequireNonNull);
                    if (objPutIfAbsent != null) {
                        throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, objPutIfAbsent, objRequireNonNull));
                    }
                }
                return map;
            case 16:
                Collection collection = (Collection) obj;
                Set set2 = C22976.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 18:
                List list = (List) obj;
                Set set3 = C22976.a;
                list.addAll((List) obj2);
                return list;
            case 21:
                Set set4 = (Set) obj;
                Set set5 = (Set) obj2;
                Set set6 = C22976.a;
                if (set4.size() < set5.size()) {
                    set5.addAll(set4);
                    return set5;
                }
                set4.addAll(set5);
                return set4;
            case 23:
                List list2 = (List) obj;
                Set set7 = C22976.a;
                list2.addAll((List) obj2);
                return list2;
            case 26:
                C20175 c20175 = (C20175) obj;
                C20175 c20176 = (C20175) obj2;
                c20175.getClass();
                C11003.requireNonNull(c20176);
                if (c20176.d == null) {
                    return c20175;
                }
                c20176.a();
                return c20175.add(c20176.d[0]);
            default:
                Set set8 = (Set) obj;
                Set set9 = (Set) obj2;
                Set set10 = C22976.a;
                if (set8.size() < set9.size()) {
                    set9.addAll(set8);
                    return set9;
                }
                set8.addAll(set9);
                return set8;
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 11:
            case 12:
                return obj;
            case 19:
                Set set = C22976.a;
                return AbstractC22791.B(((List) obj).toArray());
            case 22:
                Set set2 = C22976.a;
                return AbstractC22791.D(((Set) obj).toArray());
            case 24:
                Set set3 = C22976.a;
                return obj;
            default:
                return ((C20175) obj).toString();
        }
    }

    public Object h(InterfaceC2268 interfaceC2268) {
        switch (this.a) {
            case 1:
                return C19762.V(interfaceC2268);
            case 2:
                AbstractC5650 abstractC5650 = (AbstractC5650) interfaceC2268.T(AbstractC5796.a);
                if (abstractC5650 == null || (abstractC5650 instanceof C18078)) {
                    return null;
                }
                return abstractC5650;
            case 3:
            default:
                EnumC18496 enumC18496 = EnumC18496.NANO_OF_DAY;
                if (interfaceC2268.e(enumC18496)) {
                    return C7248.a0(interfaceC2268.G(enumC18496));
                }
                return null;
            case 4:
                return (AbstractC5650) interfaceC2268.T(AbstractC5796.a);
            case 5:
                return (InterfaceC2765) interfaceC2268.T(AbstractC5796.b);
            case 6:
                return (InterfaceC3679) interfaceC2268.T(AbstractC5796.c);
            case 7:
                EnumC18496 enumC18497 = EnumC18496.OFFSET_SECONDS;
                if (interfaceC2268.e(enumC18497)) {
                    return C18078.e0(interfaceC2268.l(enumC18497));
                }
                return null;
            case 8:
                AbstractC5650 abstractC5651 = (AbstractC5650) interfaceC2268.T(AbstractC5796.a);
                return abstractC5651 != null ? abstractC5651 : (AbstractC5650) interfaceC2268.T(AbstractC5796.d);
            case 9:
                EnumC18496 enumC18498 = EnumC18496.EPOCH_DAY;
                if (interfaceC2268.e(enumC18498)) {
                    return C19056.i0(interfaceC2268.G(enumC18498));
                }
                return null;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
