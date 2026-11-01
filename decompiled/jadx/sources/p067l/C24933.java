package p067l;

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
public final /* synthetic */ class C24933 implements ObjLongConsumer, LongBinaryOperator, ToLongFunction, BiConsumer, IntFunction, LongFunction, Consumer, BinaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79623a;

    public /* synthetic */ C24933(int i) {
        this.f79623a = i;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    /* JADX INFO: renamed from: accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0 */
    private final void m54796x10ce6cf0(Object obj) {
    }

    /* JADX INFO: renamed from: accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1 */
    private final void m54797x10ce6cf1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f79623a) {
            case 3:
                break;
        }
        return C19355.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f79623a) {
            case 13:
                break;
            case 15:
                break;
            case 17:
                break;
        }
        return C18684.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f79623a) {
            case 10:
                break;
            case 23:
                break;
        }
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.f79623a) {
            case 5:
                return Long.valueOf(j);
            case 12:
                return AbstractC11111.m25598O(j);
            case 14:
                return AbstractC11111.m25605X(j);
            default:
                return AbstractC11111.m25606Y(j);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.f79623a) {
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
        switch (this.f79623a) {
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
        switch (this.f79623a) {
            case 0:
                ((C13555) obj).accept(j);
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
        switch (this.f79623a) {
            case 3:
                ((C13555) obj).m30857a((C13555) obj2);
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
        switch (this.f79623a) {
            case 13:
                return new C14799((InterfaceC10440) obj, (InterfaceC10440) obj2);
            case 14:
            case 16:
            default:
                return new C18348((InterfaceC7324) obj, (InterfaceC7324) obj2);
            case 15:
                return new C19650((InterfaceC8840) obj, (InterfaceC8840) obj2);
            case 17:
                return new C20321((InterfaceC8169) obj, (InterfaceC8169) obj2);
        }
    }
}
