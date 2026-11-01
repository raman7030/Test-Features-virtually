package p067l;

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
public final /* synthetic */ class C10500 implements Predicate, InterfaceC5195, Function, UnaryOperator, IntFunction, BinaryOperator, BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29075a;

    public /* synthetic */ C10500(int i) {
        this.f29075a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f29075a) {
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
                ((C21543) obj).add((CharSequence) obj2);
                break;
        }
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f29075a) {
            case 15:
                break;
            case 17:
                break;
            case 20:
                break;
        }
        return C19355.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f29075a) {
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
        return C18684.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo56417andThen(Function function) {
        switch (this.f29075a) {
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
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        switch (this.f29075a) {
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
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m24243or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    public String toString() {
        switch (this.f29075a) {
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

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        EnumC19947 enumC19947 = EnumC19947.DAY_OF_MONTH;
        return interfaceC17263.mo7152c(interfaceC17263.mo6953n(enumC19947).f76159d, enumC19947);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f29075a) {
            case 14:
                Map map = (Map) obj;
                Set set = C24205.f76714a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Object key = entry.getKey();
                    Object objRequireNonNull = C12826.requireNonNull(entry.getValue());
                    Object objPutIfAbsent = C15525.putIfAbsent(map, key, objRequireNonNull);
                    if (objPutIfAbsent != null) {
                        throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, objPutIfAbsent, objRequireNonNull));
                    }
                }
                return map;
            case 16:
                Collection collection = (Collection) obj;
                Set set2 = C24205.f76714a;
                collection.addAll((Collection) obj2);
                return collection;
            case 18:
                List list = (List) obj;
                Set set3 = C24205.f76714a;
                list.addAll((List) obj2);
                return list;
            case 21:
                Set set4 = (Set) obj;
                Set set5 = (Set) obj2;
                Set set6 = C24205.f76714a;
                if (set4.size() < set5.size()) {
                    set5.addAll(set4);
                    return set5;
                }
                set4.addAll(set5);
                return set4;
            case 23:
                List list2 = (List) obj;
                Set set7 = C24205.f76714a;
                list2.addAll((List) obj2);
                return list2;
            case 26:
                C21543 c21543 = (C21543) obj;
                C21543 c21544 = (C21543) obj2;
                c21543.getClass();
                C12826.requireNonNull(c21544);
                if (c21544.f67949d == null) {
                    return c21543;
                }
                c21544.m48726a();
                return c21543.add(c21544.f67949d[0]);
            default:
                Set set8 = (Set) obj;
                Set set9 = (Set) obj2;
                Set set10 = C24205.f76714a;
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
        switch (this.f29075a) {
            case 11:
            case 12:
                return obj;
            case 19:
                Set set = C24205.f76714a;
                return AbstractC24029.m53212B(((List) obj).toArray());
            case 22:
                Set set2 = C24205.f76714a;
                return AbstractC24029.m53214D(((Set) obj).toArray());
            case 24:
                Set set3 = C24205.f76714a;
                return obj;
            default:
                return ((C21543) obj).toString();
        }
    }

    /* JADX INFO: renamed from: h */
    public Object m24242h(InterfaceC4524 interfaceC4524) {
        switch (this.f29075a) {
            case 1:
                return C21151.m47767V(interfaceC4524);
            case 2:
                AbstractC7739 abstractC7739 = (AbstractC7739) interfaceC4524.mo6950T(AbstractC7877.f20679a);
                if (abstractC7739 == null || (abstractC7739 instanceof C19550)) {
                    return null;
                }
                return abstractC7739;
            case 3:
            default:
                EnumC19947 enumC19947 = EnumC19947.NANO_OF_DAY;
                if (interfaceC4524.mo6951e(enumC19947)) {
                    return C9257.m21347a0(interfaceC4524.mo6949G(enumC19947));
                }
                return null;
            case 4:
                return (AbstractC7739) interfaceC4524.mo6950T(AbstractC7877.f20679a);
            case 5:
                return (InterfaceC4997) interfaceC4524.mo6950T(AbstractC7877.f20680b);
            case 6:
                return (InterfaceC5865) interfaceC4524.mo6950T(AbstractC7877.f20681c);
            case 7:
                EnumC19947 enumC19948 = EnumC19947.OFFSET_SECONDS;
                if (interfaceC4524.mo6951e(enumC19948)) {
                    return C19550.m44395e0(interfaceC4524.mo6952l(enumC19948));
                }
                return null;
            case 8:
                AbstractC7739 abstractC77310 = (AbstractC7739) interfaceC4524.mo6950T(AbstractC7877.f20679a);
                return abstractC77310 != null ? abstractC77310 : (AbstractC7739) interfaceC4524.mo6950T(AbstractC7877.f20682d);
            case 9:
                EnumC19947 enumC19949 = EnumC19947.EPOCH_DAY;
                if (interfaceC4524.mo6951e(enumC19949)) {
                    return C20480.m46188i0(interfaceC4524.mo6949G(enumC19949));
                }
                return null;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
