package l;

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
public final class C10379 implements InterfaceC18641, BiConsumer, BiFunction, Consumer, InterfaceC21048 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C10379(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 1:
                break;
        }
        return C17873.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 4:
                break;
            case 5:
                break;
            case 7:
                break;
        }
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.c).apply(((BiFunction) this.b).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
                BiFunction biFunction = (BiFunction) this.c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            default:
                BiConsumer biConsumer = (BiConsumer) this.b;
                BiConsumer biConsumer2 = (BiConsumer) this.c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    @Override // l.InterfaceC18641
    public String name() {
        return (String) this.b;
    }

    @Override // l.InterfaceC18641
    public Class type() {
        return (Class) this.c;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public C10379(EnumC8578 enumC8578, EnumC20342 enumC20342, Supplier supplier) {
        this.a = 6;
        this.b = enumC20342;
        this.c = supplier;
    }

    @Override // l.InterfaceC21048
    public int j() {
        return EnumC7330.u | EnumC7330.r;
    }

    @Override // l.InterfaceC21048
    public Object b(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        AbstractC2703 abstractC2703 = (AbstractC2703) ((Supplier) this.c).get();
        abstractC12725.f0(interfaceC15234, abstractC2703);
        return Boolean.valueOf(abstractC2703.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC21048
    public Object e(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        return (Boolean) new C1976(this, (AbstractC12725) abstractC9198, interfaceC15234).invoke();
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                Consumer consumer = (Consumer) this.b;
                Consumer consumer2 = (Consumer) this.c;
                consumer.accept(obj);
                consumer2.accept(obj);
                break;
            case 5:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                ConcurrentMapC10942 concurrentMapC10942 = (ConcurrentMapC10942) this.c;
                if (obj != null) {
                    concurrentMapC10942.putIfAbsent(obj, Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 6:
            default:
                C11833 c11833 = (C11833) this.b;
                Consumer consumer3 = (Consumer) this.c;
                if (c11833.b.putIfAbsent(obj != null ? obj : C11833.d, Boolean.TRUE) == null) {
                    consumer3.accept(obj);
                }
                break;
            case 7:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
        }
    }
}
