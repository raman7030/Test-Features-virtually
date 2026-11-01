package p067l;

import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۫ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC14113 {
    CONSTANT_NULL((byte) 0, "null", "CONSTANT_NULL", 1),
    CONSTANT_UTF8((byte) 1, "Utf8", "CONSTANT_UTF8", 1),
    CONSTANT_INTEGER((byte) 3, ClassTransform.INTEGER, "Integer", "CONSTANT_INTEGER", 1),
    CONSTANT_FLOAT((byte) 4, ClassTransform.FLOAT, "Float", "CONSTANT_FLOAT", 1),
    CONSTANT_LONG((byte) 5, ClassTransform.LONG, "Long", "CONSTANT_LONG", 2),
    CONSTANT_DOUBLE((byte) 6, ClassTransform.DOUBLE, "Double", "CONSTANT_DOUBLE", 2),
    CONSTANT_CLASS((byte) 7, Name.LABEL, "Class", "CONSTANT_CLASS", 1),
    CONSTANT_STRING((byte) 8, "String", "CONSTANT_STRING", 1),
    CONSTANT_FIELD((byte) 9, "Field", "Fieldref", "CONSTANT_FIELD", 1),
    CONSTANT_METHOD((byte) 10, "Method", "Methodref", "CONSTANT_METHOD", 1),
    CONSTANT_INTERFACEMETHOD((byte) 11, "InterfaceMethod", "InterfaceMethodref", "CONSTANT_INTERFACEMETHOD", 1),
    CONSTANT_NAMEANDTYPE((byte) 12, "NameAndType", "CONSTANT_NAMEANDTYPE", 1),
    CONSTANT_METHODHANDLE((byte) 15, "MethodHandle", "CONSTANT_METHODHANDLE", 1),
    CONSTANT_METHODTYPE((byte) 16, "MethodType", "CONSTANT_METHODTYPE", 1),
    CONSTANT_DYNAMIC((byte) 17, "Dynamic", "CONSTANT_DYNAMIC", 1),
    CONSTANT_INVOKEDYNAMIC((byte) 18, "InvokeDynamic", "CONSTANT_INVOKEDYNAMIC", 1),
    CONSTANT_MODULE((byte) 19, "Module", "CONSTANT_MODULE", 1),
    CONSTANT_PACKAGE((byte) 20, "Package", "CONSTANT_PACKAGE", 1);


    /* JADX INFO: renamed from: ۗ */
    public final Byte f40057;

    /* JADX INFO: renamed from: ۙ */
    public final String f40058;

    /* JADX INFO: renamed from: ᩶ */
    public final String f40059;

    /* JADX INFO: renamed from: ᩸ */
    public final String f40060;

    /* JADX INFO: renamed from: ᩹ */
    public final int f40061;

    EnumC14113(byte b, String str, String str2, int i) {
        this.f40057 = Byte.valueOf(b);
        this.f40058 = str;
        this.f40059 = "";
        this.f40060 = str2;
        this.f40061 = i;
    }

    EnumC14113(byte b, String str, String str2, String str3, int i) {
        this.f40057 = Byte.valueOf(b);
        this.f40058 = str;
        this.f40059 = str2;
        this.f40060 = str3;
        this.f40061 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m32042() {
        String[] strArrSplit = name().split("_");
        return strArrSplit[0] + "_" + strArrSplit[1].substring(0, 1).toUpperCase() + strArrSplit[1].substring(1).toLowerCase();
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m32043(EnumC14113... enumC14113Arr) {
        for (EnumC14113 enumC14113 : enumC14113Arr) {
            if (this.f40057.equals(enumC14113.f40057)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public byte m32046() {
        return this.f40057.byteValue();
    }

    /* JADX INFO: renamed from: ᩻ */
    public String m32047() {
        return this.f40058;
    }

    /* JADX INFO: renamed from: ֫ */
    public int m32041(boolean z) {
        return (z ? m32045() : this.f40058).length();
    }

    /* JADX INFO: renamed from: ܿ */
    public String m32045() {
        return this.f40059.isEmpty() ? this.f40058 : this.f40059;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m32044() {
        return this.f40061;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C10965.m25286(new StringBuilder("<"), this.f40058, "> ");
    }
}
