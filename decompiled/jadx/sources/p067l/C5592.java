package p067l;

import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5592 extends AbstractC11588 {

    /* JADX INFO: renamed from: ۗ֫ */
    public final C10286 f13540;

    /* JADX INFO: renamed from: ۙ֫ */
    public final Map f13541;

    /* JADX INFO: renamed from: ۛ֫ */
    public final Set f13542;

    /* JADX INFO: renamed from: ۤ֫ */
    public final Set f13543;

    /* JADX INFO: renamed from: ۫֫ */
    public final Map f13544;

    /* JADX INFO: renamed from: ۬֫ */
    public final Map f13545;

    public C5592(C21016 c21016) {
        this.f13540 = c21016.f65974;
        this.f13543 = C21562.unmodifiableSet(c21016.f65977);
        this.f13541 = C21562.unmodifiableMap(c21016.f65972);
        this.f13545 = C21562.unmodifiableMap(c21016.f65978);
        this.f13542 = C21562.unmodifiableSet(c21016.f65971);
        this.f13544 = C21562.unmodifiableMap(c21016.f65970);
    }

    /* JADX INFO: renamed from: ֨ */
    public final String m12383() {
        return (String) this.f13540.f22917;
    }

    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        C7480.stream(this.f13543).forEach(new Consumer() { // from class: l.ܳᩳ֨
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                String str;
                C2909 c2909 = (C2909) obj;
                String strM26657 = this.f47967.m26657(9, "requires");
                StringBuilder sb2 = sb;
                sb2.append(strM26657);
                sb2.append(c2909);
                if (c2909.m15894() == null) {
                    str = "";
                } else {
                    str = " // @" + c2909.m15894();
                }
                sb2.append(String.format(";%s%n", str));
            }
        });
        Map map = this.f13541;
        C7480.stream(map.entrySet()).filter(new C2430(6)).map(new C20345(0, this)).forEach(new C3488(1, sb));
        C7480.stream(map.entrySet()).filter(new C4781(3)).map(new C25038(0, this)).forEach(new C3488(1, sb));
        Map map2 = this.f13545;
        C7480.stream(map2.entrySet()).filter(new C12773()).map(new Function() { // from class: l.ۜᩳ֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f24243.m26657(9, "opens").concat(String.format("%s;%n", ((C16990) ((Map.Entry) obj).getKey()).toString()));
            }
        }).forEach(new C3488(1, sb));
        C7480.stream(map2.entrySet()).filter(new C10957(0)).map(new Function() { // from class: l.ܺᩳ֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C5592 c5592 = this.f52746;
                Map.Entry entry = (Map.Entry) obj;
                return c5592.m26657(9, "opens").concat(String.format("%s to%n%s;%n", ((C16990) entry.getKey()).toString(), C7480.stream((Set) entry.getValue()).map(new C19478(c5592, 1)).collect(C24205.joining(",\n"))));
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        }).forEach(new C3488(1, sb));
        C7480.stream(this.f13542).map(new C4922(0, this)).forEach(new C3488(1, sb));
        C7480.stream(this.f13544.entrySet()).filter(new C19866(2)).map(new C6263(0, this)).forEach(new C3488(1, sb));
        if (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
