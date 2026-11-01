package p067l;

/* JADX INFO: renamed from: l.᩻۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24781 implements InterfaceC15160 {
    COW_COPY(0),
    COW_XOR(1),
    COW_REPLACE(2);

    public static final int COW_COPY_VALUE = 0;
    public static final int COW_REPLACE_VALUE = 2;
    public static final int COW_XOR_VALUE = 1;
    public static final EnumC24781[] VALUES;
    public static final InterfaceC15001 internalValueMap;
    public final int value;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC24781.class.getName());
        internalValueMap = new InterfaceC15001() { // from class: l.ܳ۠᩻
            public EnumC24781 findValueByNumber(int i) {
                return EnumC24781.forNumber(i);
            }
        };
        VALUES = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static EnumC24781 valueOf(int i) {
        return forNumber(i);
    }

    public static EnumC24781 forNumber(int i) {
        if (i == 0) {
            return COW_COPY;
        }
        if (i == 1) {
            return COW_XOR;
        }
        if (i != 2) {
            return null;
        }
        return COW_REPLACE;
    }

    public static InterfaceC15001 internalGetValueMap() {
        return internalValueMap;
    }

    public final C4492 getValueDescriptor() {
        return (C4492) getDescriptor().m25863().get(ordinal());
    }

    public final C11198 getDescriptorForType() {
        return getDescriptor();
    }

    public static final C11198 getDescriptor() {
        return (C11198) C8688.getDescriptor().m43842().get(0);
    }

    public static EnumC24781 valueOf(C4492 c4492) {
        if (c4492.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[c4492.m9500()];
    }

    EnumC24781(int i) {
        this.value = i;
    }
}
