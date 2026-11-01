package p067l;

/* JADX INFO: renamed from: l.֨۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DY */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3290 {
    NOT_SUPPORTED("NotSupported", null, null, null),
    SOURCE_FILE("SourceFile", EnumC6799.f17649, EnumC16818.f49768, C10937.class),
    ENCLOSING_METHOD("EnclosingMethod", EnumC6799.f17651, EnumC16818.f49740, C19634.class),
    NEST_MEMBERS("NestMembers", EnumC6799.f17628, EnumC16818.f49605, C8274.class),
    NEST_HOST("NestHost", EnumC6799.f17629, EnumC16818.f49744, C12298.class),
    INNER_CLASSES("InnerClasses", EnumC6799.f17626, EnumC16818.f49591, C10917.class),
    SIGNATURE("Signature", EnumC6799.f17627, EnumC16818.f49655, C8925.class),
    CONSTANT_POOL("Constant pool", null, null, C12102.class),
    METHOD_DATA("Method_info", null, null, C19003.class),
    FIELD_DATA("Field_info", null, null, C8905.class),
    RECORD_DATA("record_component_info", null, null, C25018.class),
    LINE_NUMBERS("LineNumberTable", EnumC6799.f17616, EnumC16818.f49662, C3540.class),
    LOCAL_VARIABLES("LocalVariableTable", EnumC6799.f17642, EnumC16818.f49696, C22987.class),
    LOCAL_VARIABLE_TYPES("LocalVariableTypeTable", EnumC6799.f17644, EnumC16818.f49775, C23657.class),
    EXCEPTIONS("throws", null, EnumC16818.f49565, C18963.class),
    STACK_MAP("StackMap", EnumC6799.f17650, EnumC16818.f49630, C14959.class),
    STACK_MAP_TABLE("StackMapTable", EnumC6799.f17647, EnumC16818.f49577, C14959.class),
    BOOTSTRAP_METHOD("BootstrapMethods", EnumC6799.f17634, EnumC16818.f49600, C15198.class);


    /* JADX INFO: renamed from: ۗ */
    public final String f6426;

    /* JADX INFO: renamed from: ۙ */
    public final String f6427;

    /* JADX INFO: renamed from: ᩶ */
    public final Class f6428;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC6799 f6429;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC16818 f6430;

    EnumC3290(String str, EnumC6799 enumC6799, EnumC16818 enumC16818, Class cls) {
        this.f6427 = str;
        this.f6429 = enumC6799;
        this.f6430 = enumC16818;
        this.f6426 = str;
        this.f6428 = cls;
    }

    /* JADX INFO: renamed from: ᩻ */
    public String m5731() {
        return this.f6427;
    }

    /* JADX INFO: renamed from: ᩷ */
    public String m5730() {
        return this.f6426;
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean m5729() {
        return this.f6428 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC6799 m5727() {
        return this.f6429;
    }

    /* JADX INFO: renamed from: ۧ */
    public EnumC16818 m5728() {
        return this.f6430;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC3290 m5725(Class cls) {
        for (EnumC3290 enumC3290 : values()) {
            if (cls.equals(enumC3290.f6428)) {
                return enumC3290;
            }
        }
        return NOT_SUPPORTED;
    }
}
