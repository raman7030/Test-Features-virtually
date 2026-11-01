package p067l;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ۧۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12789 implements BinaryOperator, Function, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, IntFunction, Predicate, ToIntFunction, IntBinaryOperator, ObjIntConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35994a;

    public /* synthetic */ C12789(int i) {
        this.f35994a = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f35994a) {
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
        return C20697.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f35994a) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 7:
                break;
            case 9:
                break;
            case 25:
                break;
        }
        return C19355.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C18684.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        return ((StringBuilder) obj).toString();
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.f35994a) {
            case 5:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (this.f35994a) {
            case 23:
                return Math.min(i, i2);
            case 26:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f35994a) {
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m29336or(Predicate predicate) {
        switch (this.f35994a) {
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f35994a) {
            case 15:
                return ((C6790) obj).f17583a;
            case 16:
                return ((C19531) obj).f59473a;
            case 17:
                return ((C14166) obj).f40406a;
            default:
                return ((C18189) obj).isPresent();
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        StringBuilder sb = (StringBuilder) obj;
        Set set = C24205.f76714a;
        sb.append((CharSequence) obj2);
        return sb;
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.f35994a) {
            case 6:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                C24205.m53524a(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            case 7:
            default:
                double[] dArr2 = (double[]) obj;
                C24205.m53524a(dArr2, d);
                dArr2[2] = dArr2[2] + d;
                break;
            case 8:
                ((C14895) obj).accept(d);
                break;
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.f35994a) {
            case 24:
                ((C12214) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i);
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f35994a) {
            case 2:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 3:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 4:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                C24205.m53524a(dArr, dArr2[0]);
                C24205.m53524a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 7:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                C24205.m53524a(dArr3, dArr4[0]);
                C24205.m53524a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 9:
                ((C14895) obj).m34099a((C14895) obj2);
                break;
            case 25:
                ((C12214) obj).m28194a((C12214) obj2);
                break;
            default:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.f35994a) {
            case 12:
                return new Double[i];
            case 19:
                return new Object[i];
            case 20:
                return new Integer[i];
            default:
                return Integer.valueOf(i);
        }
    }
}
