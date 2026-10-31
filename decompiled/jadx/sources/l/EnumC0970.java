package l;

/* JADX INFO: renamed from: l.֨۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DY */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0970 {
    NOT_SUPPORTED("NotSupported", null, null, null),
    SOURCE_FILE("SourceFile", EnumC4662.f14819, EnumC15204.f46643, C9016.class),
    ENCLOSING_METHOD("EnclosingMethod", EnumC4662.f14821, EnumC15204.f46615, C18167.class),
    NEST_MEMBERS("NestMembers", EnumC4662.f14798, EnumC15204.f46480, C6214.class),
    NEST_HOST("NestHost", EnumC4662.f14799, EnumC15204.f46619, C10448.class),
    INNER_CLASSES("InnerClasses", EnumC4662.f14796, EnumC15204.f46466, C8995.class),
    SIGNATURE("Signature", EnumC4662.f14797, EnumC15204.f46530, C6899.class),
    CONSTANT_POOL("Constant pool", null, null, C10242.class),
    METHOD_DATA("Method_info", null, null, C17503.class),
    FIELD_DATA("Field_info", null, null, C6878.class),
    RECORD_DATA("record_component_info", null, null, C23832.class),
    LINE_NUMBERS("LineNumberTable", EnumC4662.f14786, EnumC15204.f46537, C1233.class),
    LOCAL_VARIABLES("LocalVariableTable", EnumC4662.f14812, EnumC15204.f46571, C21695.class),
    LOCAL_VARIABLE_TYPES("LocalVariableTypeTable", EnumC4662.f14814, EnumC15204.f46650, C22400.class),
    EXCEPTIONS("throws", null, EnumC15204.f46440, C17461.class),
    STACK_MAP("StackMap", EnumC4662.f14820, EnumC15204.f46505, C13248.class),
    STACK_MAP_TABLE("StackMapTable", EnumC4662.f14817, EnumC15204.f46452, C13248.class),
    BOOTSTRAP_METHOD("BootstrapMethods", EnumC4662.f14804, EnumC15204.f46475, C13500.class);


    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f3651;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f3652;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Class f3653;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC4662 f3654;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC15204 f3655;

    EnumC0970(String str, EnumC4662 enumC4662, EnumC15204 enumC15204, Class cls) {
        this.f3652 = str;
        this.f3654 = enumC4662;
        this.f3655 = enumC15204;
        this.f3651 = str;
        this.f3653 = cls;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String m3428() {
        return this.f3652;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String m3427() {
        return this.f3651;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m3426() {
        return this.f3653 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC4662 m3424() {
        return this.f3654;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC15204 m3425() {
        return this.f3655;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC0970 m3422(Class cls) {
        for (EnumC0970 enumC0970 : values()) {
            if (cls.equals(enumC0970.f3653)) {
                return enumC0970;
            }
        }
        return NOT_SUPPORTED;
    }
}
