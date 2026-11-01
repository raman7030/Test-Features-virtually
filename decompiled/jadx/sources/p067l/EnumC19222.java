package p067l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۤ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ᩳ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7EB */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC19222 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC19222 f57441;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final EnumC19222 f57442;

    /* JADX INFO: renamed from: ۗ */
    public static final /* synthetic */ EnumC19222[] f57443;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final EnumC19222 f57444;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC19222 f57445;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final EnumC19222 f57446;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC19222 f57447;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final EnumC19222 f57448;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final EnumC19222 f57449;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC19222 f57450;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC19222 f57451;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC19222 f57452;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC19222 f57453;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC19222 f57454;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC19222 f57455;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final EnumC19222 f57456;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final EnumC19222 f57457;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final int f57458 = 36;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final EnumC19222 f57459;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final int f57460 = 154;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final EnumC19222 f57461;

    /* JADX INFO: renamed from: ᩵֫ */
    public static final EnumC19222 f57462;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final EnumC19222 f57463;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC19222 f57464;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC19222 f57465;

    /* JADX INFO: renamed from: ۙ */
    public final int f57466;

    /* JADX INFO: renamed from: ᩶ */
    public final EnumC17880 f57467;

    /* JADX INFO: renamed from: ᩸ */
    public final String f57468;

    /* JADX INFO: renamed from: ᩹ */
    public final String f57469;

    public static EnumC19222 valueOf(String str) {
        return (EnumC19222) Enum.valueOf(EnumC19222.class, str);
    }

    public static EnumC19222[] values() {
        return (EnumC19222[]) f57443.clone();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static /* synthetic */ EnumC19222[] m43789() {
        return new EnumC19222[]{f57450, f57448, f57453, f57445, f57457, f57441, f57449, f57465, f57459, f57461, f57451, f57444, f57447, f57462, f57442, f57464, f57446, f57454, f57452, f57456, f57455, f57463};
    }

    static {
        EnumC17880 enumC17880 = EnumC17880.TYPEPARAM;
        f57450 = new EnumC19222("class_type_param", 0, 0, "CLASS_TYPE_PARAMETER", enumC17880, "class/interface type parameter");
        f57448 = new EnumC19222("meth_type_param", 1, 1, "METHOD_TYPE_PARAMETER", enumC17880, "method/constructor type parameter");
        f57453 = new EnumC19222("class_exts_impls", 2, 16, "CLASS_EXTENDS", EnumC17880.SUPERTYPE, "class extends/implements");
        EnumC17880 enumC17881 = EnumC17880.TYPEPARAM_BOUND;
        f57445 = new EnumC19222("class_type_param_bnds", 3, 17, "CLASS_TYPE_PARAMETER_BOUND", enumC17881, "class/interface type parameter bounds");
        f57457 = new EnumC19222("meth_type_param_bnds", 4, 18, "METHOD_TYPE_PARAMETER_BOUND", enumC17881, "method/constructor type parameter bounds");
        EnumC17880 enumC17882 = EnumC17880.EMPTY;
        f57441 = new EnumC19222("field", 5, 19, "FIELD", enumC17882, "field");
        f57449 = new EnumC19222("meth_ret_type", 6, 20, "METHOD_RETURN", enumC17882, "method return type");
        f57465 = new EnumC19222("meth_receiver", 7, 21, "METHOD_RECEIVER", enumC17882, "method receiver");
        f57459 = new EnumC19222("meth_formal_param", 8, 22, "METHOD_FORMAL_PARAMETER", EnumC17880.METHODPARAM, "method formal parameter type");
        f57461 = new EnumC19222("throws_type", 9, 23, "THROWS", EnumC17880.EXCEPTION, "exception type in throws");
        EnumC17880 enumC17883 = EnumC17880.LOCALVAR;
        f57451 = new EnumC19222("local_var", 10, 64, "LOCAL_VARIABLE", enumC17883, "local variable");
        f57444 = new EnumC19222("resource_var", 11, 65, "RESOURCE_VARIABLE", enumC17883, "resource variable");
        f57447 = new EnumC19222("exception_param", 12, 66, "EXCEPTION_PARAM", EnumC17880.CATCH, "exception parameter");
        EnumC17880 enumC17884 = EnumC17880.OFFSET;
        f57462 = new EnumC19222("type_test", 13, 67, "INSTANCEOF", enumC17884, "type test (instanceof)");
        f57442 = new EnumC19222("obj_creat", 14, 68, "NEW", enumC17884, "object creation (new)");
        f57464 = new EnumC19222("constr_ref_receiver", 15, 69, "CONSTRUCTOR_REFERENCE_RECEIVER", enumC17884, "constructor reference receiver");
        f57446 = new EnumC19222("meth_ref_receiver", 16, 70, "METHOD_REFERENCE_RECEIVER", enumC17884, "method reference receiver");
        EnumC17880 enumC17885 = EnumC17880.TYPEARG;
        f57454 = new EnumC19222("cast", 17, 71, "CAST", enumC17885, "cast");
        f57452 = new EnumC19222("constr_invoc_typearg", 18, 72, "CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT", enumC17885, "type argument in constructor call");
        f57456 = new EnumC19222("meth_invoc_typearg", 19, 73, "METHOD_INVOCATION_TYPE_ARGUMENT", enumC17885, "type argument in method call");
        f57455 = new EnumC19222("constr_ref_typearg", 20, 74, "CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT", enumC17885, "type argument in constructor reference");
        f57463 = new EnumC19222("meth_ref_typearg", 21, 75, "METHOD_REFERENCE_TYPE_ARGUMENT", enumC17885, "type argument in method reference");
        f57443 = m43789();
    }

    public EnumC19222(String str, int i, int i2, String str2, EnumC17880 enumC17880, String str3) {
        super(str, i);
        this.f57466 = i2;
        this.f57468 = str2;
        this.f57467 = enumC17880;
        this.f57469 = str3;
    }

    /* JADX INFO: renamed from: ۧ */
    public String m43791() {
        return this.f57468;
    }

    /* JADX INFO: renamed from: ܿ */
    public EnumC17880 m43792() {
        return this.f57467;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m43790() {
        return this.f57468;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.format("%s[%#x]", this.f57468, Integer.valueOf(this.f57466));
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC19222 m43787(int i) {
        for (EnumC19222 enumC19222 : values()) {
            if (enumC19222.f57466 == i) {
                return enumC19222;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC19222 m43788(String str) {
        for (EnumC19222 enumC19222 : values()) {
            if (enumC19222.f57468.equals(str)) {
                return enumC19222;
            }
        }
        return null;
    }
}
