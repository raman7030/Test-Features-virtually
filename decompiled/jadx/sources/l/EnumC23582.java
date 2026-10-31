package l;

/* JADX INFO: renamed from: l.᩻۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23582 implements InterfaceC13460 {
    COW_COPY(0),
    COW_XOR(1),
    COW_REPLACE(2);

    public static final int COW_COPY_VALUE = 0;
    public static final int COW_REPLACE_VALUE = 2;
    public static final int COW_XOR_VALUE = 1;
    public static final EnumC23582[] VALUES;
    public static final InterfaceC13292 internalValueMap;
    public final int value;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC23582.class.getName());
        internalValueMap = new InterfaceC13292() { // from class: l.ܳ۠᩻
            public EnumC23582 findValueByNumber(int i) {
                return EnumC23582.forNumber(i);
            }
        };
        VALUES = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static EnumC23582 valueOf(int i) {
        return forNumber(i);
    }

    public static EnumC23582 forNumber(int i) {
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

    public static InterfaceC13292 internalGetValueMap() {
        return internalValueMap;
    }

    public final C2235 getValueDescriptor() {
        return (C2235) getDescriptor().m23854().get(ordinal());
    }

    public final C9291 getDescriptorForType() {
        return getDescriptor();
    }

    public static final C9291 getDescriptor() {
        return (C9291) C6649.getDescriptor().m41597().get(0);
    }

    public static EnumC23582 valueOf(C2235 c2235) {
        if (c2235.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[c2235.m7418()];
    }

    EnumC23582(int i) {
        this.value = i;
    }
}
