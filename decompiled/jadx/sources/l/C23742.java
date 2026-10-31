package l;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩻ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23742 implements ObjLongConsumer, LongBinaryOperator, ToLongFunction, BiConsumer, IntFunction, LongFunction, Consumer, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ C23742(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 3:
                break;
        }
        return C17873.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 13:
                break;
            case 15:
                break;
            case 17:
                break;
        }
        return C17167.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 10:
                break;
            case 23:
                break;
        }
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 5:
                return Long.valueOf(j);
            case 12:
                return AbstractC9198.O(j);
            case 14:
                return AbstractC9198.X(j);
            default:
                return AbstractC9198.Y(j);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 1:
                return Math.min(j, j2);
            case 8:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 4:
                return new Long[i];
            case 11:
                return new Object[i];
            case 19:
                return new Object[i];
            case 20:
                return new Integer[i];
            case 21:
                return new Long[i];
            case 22:
                return new Double[i];
            case 25:
                return new Integer[i];
            case 26:
                return new Integer[i];
            case 27:
                return new Long[i];
            case 28:
                return new Long[i];
            default:
                return new Double[i];
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (this.a) {
            case 0:
                ((C11770) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                ((C11770) obj).a((C11770) obj2);
                break;
            default:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 13:
                return new C13079((InterfaceC8492) obj, (InterfaceC8492) obj2);
            case 14:
            case 16:
            default:
                return new C16813((InterfaceC5214) obj, (InterfaceC5214) obj2);
            case 15:
                return new C18183((InterfaceC6809) obj, (InterfaceC6809) obj2);
            case 17:
                return new C18889((InterfaceC6103) obj, (InterfaceC6103) obj2);
        }
    }
}
