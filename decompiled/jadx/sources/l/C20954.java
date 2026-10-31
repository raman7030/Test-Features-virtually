package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20954 implements BinaryOperator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67723;

    public /* synthetic */ C20954(int i) {
        this.f67723 = i;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f67723) {
            case 0:
                C18837 c18837 = (C18837) obj;
                c18837.addAll((C18837) obj2);
                return c18837;
            default:
                C19119 c19119 = (C19119) obj;
                c19119.m44066(c19119.size(), (C19119) obj2);
                return c19119;
        }
    }
}
