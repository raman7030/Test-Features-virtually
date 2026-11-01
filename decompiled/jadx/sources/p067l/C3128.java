package p067l;

import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֨֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes3.dex */
public final class C3128 extends C11176 {

    /* JADX INFO: renamed from: ۜۧ */
    public int f5697;

    @Override // p067l.C11176
    /* JADX INFO: renamed from: ᩹ */
    public final String mo5335() {
        StringBuilder sb = new StringBuilder();
        int[] iArr = C21905.f68914;
        EnumC9462 enumC9462 = this.f31025;
        switch (iArr[enumC9462.ordinal()]) {
            case 1:
                sb.append(m5333("", new Supplier() { // from class: l.ۘ֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        final C3128 c3128 = this.f14277;
                        return C19937.m45252(c3128.f38266.m27987(c3128.f5697, new Function() { // from class: l.ۚ֫֨
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
                                return "#" + c3128.f5697;
                            }
                        }), "\"");
                    }
                }));
                break;
            case 2:
            case 3:
            case 5:
                sb.append(m5333(enumC9462.m21973(), new Supplier() { // from class: l.ᩴ֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C3128 c3128 = this.f60431;
                        return c3128.f38266.m27975(c3128.f5697).mo5910();
                    }
                }));
                break;
            case 4:
            case 7:
            case 8:
            case 9:
                sb.append(m5333("", new C20325(this, 1)));
                break;
            case 6:
                sb.append(m5333(enumC9462.m21973(), new Supplier() { // from class: l.᩵֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C3128 c3128 = this.f63574;
                        return ((Integer) ((C23501) c3128.f38266.m27975(c3128.f5697)).f12857).intValue() == 0 ? "false" : "true";
                    }
                }));
                break;
            case 10:
                sb.append(m5333(enumC9462.m21973(), new Supplier() { // from class: l.֡֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C3128 c3128 = this.f3800;
                        return c3128.f38266.getName(c3128.f5697);
                    }
                }));
                break;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    private String m5333(String str, Supplier supplier) {
        int i = this.f5697;
        String strConcat = str.isEmpty() ? "" : str.concat(" ");
        if (!this.f32275) {
            StringBuilder sbM17248 = C7470.m17248(strConcat);
            sbM17248.append((String) supplier.get());
            return sbM17248.toString();
        }
        if (this.f32292) {
            StringBuilder sbM17249 = C7470.m17248(strConcat);
            sbM17249.append(String.format("#%d", Integer.valueOf(i)));
            return sbM17249.toString();
        }
        StringBuilder sbM172410 = C7470.m17248(strConcat);
        sbM172410.append(String.format("#%d /* %s */", Integer.valueOf(i), supplier.get()));
        return sbM172410.toString();
    }

    @Override // p067l.C11176, p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        EnumC8234 enumC8234M30951 = m30951();
        if (enumC8234M30951 == EnumC8234.HAS_DEFAULT_VALUE) {
            m26660(C10965.m25286(new StringBuilder(), m30955(), "%s }"), mo5335());
        } else if (enumC8234M30951 == EnumC8234.RIGHT_OPERAND) {
            m26660(" %s }", mo5335());
        } else {
            m26668(mo5335());
        }
    }
}
