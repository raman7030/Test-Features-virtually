package l;

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
public final /* synthetic */ class C10964 implements BinaryOperator, Function, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, IntFunction, Predicate, ToIntFunction, IntBinaryOperator, ObjIntConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ C10964(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
        return C19285.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
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
        return C17873.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
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
        switch (this.a) {
            case 5:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
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
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.a) {
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 15:
                return ((C4652) obj).a;
            case 16:
                return ((C18058) obj).a;
            case 17:
                return ((C12413) obj).a;
            default:
                return ((C16646) obj).isPresent();
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        StringBuilder sb = (StringBuilder) obj;
        Set set = C22976.a;
        sb.append((CharSequence) obj2);
        return sb;
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.a) {
            case 6:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                C22976.a(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            case 7:
            default:
                double[] dArr2 = (double[]) obj;
                C22976.a(dArr2, d);
                dArr2[2] = dArr2[2] + d;
                break;
            case 8:
                ((C13180) obj).accept(d);
                break;
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.a) {
            case 24:
                ((C10359) obj).accept(i);
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
        switch (this.a) {
            case 2:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 3:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 4:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                C22976.a(dArr, dArr2[0]);
                C22976.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 7:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                C22976.a(dArr3, dArr4[0]);
                C22976.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 9:
                ((C13180) obj).a((C13180) obj2);
                break;
            case 25:
                ((C10359) obj).a((C10359) obj2);
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
        switch (this.a) {
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
