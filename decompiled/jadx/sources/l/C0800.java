package l;

import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֨֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes3.dex */
public final class C0800 extends C9268 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f2926;

    @Override // l.C9268
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo3022() {
        StringBuilder sb = new StringBuilder();
        int[] iArr = C20557.f66233;
        EnumC7464 enumC7464 = this.f28077;
        switch (iArr[enumC7464.ordinal()]) {
            case 1:
                sb.append(m3020("", new Supplier() { // from class: l.ۘ֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        final C0800 c0800 = this.f11472;
                        return C18486.m42976(c0800.f35264.m25965(c0800.f2926, new Function() { // from class: l.ۚ֫֨
                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public /* synthetic */ Function mo22274andThen(Function function) {
                                return C20696.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public /* synthetic */ Function compose(Function function) {
                                return C20696.$default$compose(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return "#" + c0800.f2926;
                            }
                        }), "\"");
                    }
                }));
                break;
            case 2:
            case 3:
            case 5:
                sb.append(m3020(enumC7464.m19998(), new Supplier() { // from class: l.ᩴ֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C0800 c0800 = this.f57213;
                        return c0800.f35264.m25953(c0800.f2926).mo3639();
                    }
                }));
                break;
            case 4:
            case 7:
            case 8:
            case 9:
                sb.append(m3020("", new C18894(this, 1)));
                break;
            case 6:
                sb.append(m3020(enumC7464.m19998(), new Supplier() { // from class: l.᩵֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C0800 c0800 = this.f60343;
                        return ((Integer) ((C22236) c0800.f35264.m25953(c0800.f2926)).f10053).intValue() == 0 ? "false" : "true";
                    }
                }));
                break;
            case 10:
                sb.append(m3020(enumC7464.m19998(), new Supplier() { // from class: l.֡֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C0800 c0800 = this.f1026;
                        return c0800.f35264.getName(c0800.f2926);
                    }
                }));
                break;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m3020(String str, Supplier supplier) {
        int i = this.f2926;
        String strConcat = str.isEmpty() ? "" : str.concat(" ");
        if (!this.f29326) {
            StringBuilder sbM15339 = C5368.m15339(strConcat);
            sbM15339.append((String) supplier.get());
            return sbM15339.toString();
        }
        if (this.f29343) {
            StringBuilder sbM153310 = C5368.m15339(strConcat);
            sbM153310.append(String.format("#%d", Integer.valueOf(i)));
            return sbM153310.toString();
        }
        StringBuilder sbM153311 = C5368.m15339(strConcat);
        sbM153311.append(String.format("#%d /* %s */", Integer.valueOf(i), supplier.get()));
        return sbM153311.toString();
    }

    @Override // l.C9268, l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo3021() {
        EnumC6172 enumC6172M28902 = m28902();
        if (enumC6172M28902 == EnumC6172.HAS_DEFAULT_VALUE) {
            m24646(C9045.m23341(new StringBuilder(), m28906(), "%s }"), mo3022());
        } else if (enumC6172M28902 == EnumC6172.RIGHT_OPERAND) {
            m24646(" %s }", mo3022());
        } else {
            m24654(mo3022());
        }
    }
}
