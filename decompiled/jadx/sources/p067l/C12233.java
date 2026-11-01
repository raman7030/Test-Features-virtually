package p067l;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12233 implements InterfaceC20085, BiConsumer, BiFunction, Consumer, InterfaceC22373 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34176a;

    /* JADX INFO: renamed from: b */
    public final Object f34177b;

    /* JADX INFO: renamed from: c */
    public final Object f34178c;

    public /* synthetic */ C12233(int i, Object obj, Object obj2) {
        this.f34176a = i;
        this.f34177b = obj;
        this.f34178c = obj2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f34176a) {
            case 1:
                break;
        }
        return C19355.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C18684.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f34176a) {
            case 4:
                break;
            case 5:
                break;
            case 7:
                break;
        }
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f34178c).apply(((BiFunction) this.f34177b).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f34176a) {
            case 1:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.f34177b;
                BiFunction biFunction = (BiFunction) this.f34178c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            default:
                BiConsumer biConsumer = (BiConsumer) this.f34177b;
                BiConsumer biConsumer2 = (BiConsumer) this.f34178c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    @Override // p067l.InterfaceC20085
    public String name() {
        return (String) this.f34177b;
    }

    @Override // p067l.InterfaceC20085
    public Class type() {
        return (Class) this.f34178c;
    }

    public String toString() {
        switch (this.f34176a) {
            case 0:
                return (String) this.f34177b;
            default:
                return super.toString();
        }
    }

    public C12233(EnumC10521 enumC10521, EnumC21702 enumC21702, Supplier supplier) {
        this.f34176a = 6;
        this.f34177b = enumC21702;
        this.f34178c = supplier;
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: j */
    public int mo23312j() {
        return EnumC9335.f25426u | EnumC9335.f25423r;
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: b */
    public Object mo10392b(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        AbstractC4938 abstractC4938 = (AbstractC4938) ((Supplier) this.f34178c).get();
        abstractC14463.mo25629f0(interfaceC16847, abstractC4938);
        return Boolean.valueOf(abstractC4938.f11242b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: e */
    public Object mo10393e(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847) {
        return (Boolean) new C4247(this, (AbstractC14463) abstractC11111, interfaceC16847).invoke();
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f34176a) {
            case 4:
                Consumer consumer = (Consumer) this.f34177b;
                Consumer consumer2 = (Consumer) this.f34178c;
                consumer.accept(obj);
                consumer2.accept(obj);
                break;
            case 5:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f34177b;
                ConcurrentMapC12768 concurrentMapC12768 = (ConcurrentMapC12768) this.f34178c;
                if (obj != null) {
                    concurrentMapC12768.putIfAbsent(obj, Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 6:
            default:
                C13615 c13615 = (C13615) this.f34177b;
                Consumer consumer3 = (Consumer) this.f34178c;
                if (c13615.f38306b.putIfAbsent(obj != null ? obj : C13615.f38304d, Boolean.TRUE) == null) {
                    consumer3.accept(obj);
                }
                break;
            case 7:
                ((BiConsumer) this.f34177b).accept(this.f34178c, obj);
                break;
        }
    }
}
