package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۘᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6285 extends AbstractC10645 implements Serializable {
    public static boolean alwaysUseFieldBuilders = false;
    public static final long serialVersionUID = 1;
    public C11158 unknownFields;

    public abstract C11650 internalGetFieldAccessorTable();

    public AbstractC6285() {
        this.unknownFields = C11158.m25741();
    }

    public AbstractC6285(AbstractC21296 abstractC21296) {
        this.unknownFields = abstractC21296.getUnknownFields();
    }

    @Override // p067l.InterfaceC10467
    public InterfaceC13820 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m14291() {
        m14282(true);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m14282(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    @Override // p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return internalGetFieldAccessorTable().f32496;
    }

    @Deprecated
    public void mergeFromAndMakeImmutableInternal(AbstractC9303 abstractC9303, C19283 c19283) throws C4293 {
        C13150 c13150M30098 = C13150.m30098();
        c13150M30098.getClass();
        InterfaceC11277 interfaceC11277M30099 = c13150M30098.m30099(getClass());
        try {
            interfaceC11277M30099.mo26211(this, C4333.m8882(abstractC9303), c19283);
            interfaceC11277M30099.mo26208((Object) this);
        } catch (C4293 e) {
            e.m8713(this);
            throw e;
        } catch (IOException e2) {
            C4293 c4293 = new C4293(e2.getMessage(), e2);
            c4293.m8713(this);
            throw c4293;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX INFO: renamed from: ֫ */
    public Map m14258(boolean z) {
        TreeMap treeMap = new TreeMap();
        List fields = internalGetFieldAccessorTable().f32496.getFields();
        int iM37542 = 0;
        while (iM37542 < fields.size()) {
            C2479 oneofFieldDescriptor = (C2479) fields.get(iM37542);
            C16561 c16561M3540 = oneofFieldDescriptor.m3540();
            if (c16561M3540 != null) {
                iM37542 += c16561M3540.m37542() - 1;
                if (hasOneof(c16561M3540)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(c16561M3540);
                    if (!z && oneofFieldDescriptor.m3539() == EnumC19915.STRING) {
                        treeMap.put(oneofFieldDescriptor, getFieldRaw(oneofFieldDescriptor));
                    } else {
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                }
            } else if (oneofFieldDescriptor.mo3530()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                if (!z) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                } else {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            }
            iM37542++;
        }
        return treeMap;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public boolean isInitialized() {
        for (C2479 c2479 : getDescriptorForType().getFields()) {
            if (c2479.m3529() && !hasField(c2479)) {
                return false;
            }
            if (c2479.m3539() == EnumC19915.MESSAGE) {
                if (c2479.mo3530()) {
                    Iterator it = ((List) getField(c2479)).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC24548) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(c2479) && !((InterfaceC24548) getField(c2479)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC5773
    public Map getAllFields() {
        return C21562.unmodifiableMap(m14258(false));
    }

    public Map getAllFieldsRaw() {
        return C21562.unmodifiableMap(m14258(true));
    }

    @Override // p067l.AbstractC10645
    public boolean hasOneof(C16561 c16561) {
        return C11650.m26786(internalGetFieldAccessorTable(), c16561).mo34722(this);
    }

    @Override // p067l.AbstractC10645
    public C2479 getOneofFieldDescriptor(C16561 c16561) {
        return C11650.m26786(internalGetFieldAccessorTable(), c16561).mo34719(this);
    }

    @Override // p067l.InterfaceC5773
    public boolean hasField(C2479 c2479) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18216(this);
    }

    @Override // p067l.InterfaceC5773
    public Object getField(C2479 c2479) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18207(this);
    }

    public Object getFieldRaw(C2479 c2479) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18217(this);
    }

    public int getRepeatedFieldCount(C2479 c2479) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18220(this);
    }

    public Object getRepeatedField(C2479 c2479, int i) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18206(i, this);
    }

    @Override // p067l.InterfaceC5773
    public C11158 getUnknownFields() {
        return this.unknownFields;
    }

    public void setUnknownFields(C11158 c11158) {
        this.unknownFields = c11158;
    }

    public boolean parseUnknownField(AbstractC9303 abstractC9303, C15850 c15850, C19283 c19283, int i) {
        abstractC9303.getClass();
        return c15850.m35975(i, abstractC9303);
    }

    public boolean parseUnknownFieldProto3(AbstractC9303 abstractC9303, C15850 c15850, C19283 c19283, int i) {
        return parseUnknownField(abstractC9303, c15850, c19283, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC24548 m14279(InterfaceC13820 interfaceC13820, InputStream inputStream) throws IOException {
        try {
            return (InterfaceC24548) interfaceC13820.parseFrom(inputStream);
        } catch (C4293 e) {
            throw e.m8712();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC24548 m14280(InterfaceC13820 interfaceC13820, InputStream inputStream, C19283 c19283) throws IOException {
        try {
            return (InterfaceC24548) interfaceC13820.parseFrom(inputStream, c19283);
        } catch (C4293 e) {
            throw e.m8712();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24548 m14267(InterfaceC13820 interfaceC13820, AbstractC9303 abstractC9303) throws IOException {
        try {
            return (InterfaceC24548) interfaceC13820.parseFrom(abstractC9303);
        } catch (C4293 e) {
            throw e.m8712();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24548 m14268(InterfaceC13820 interfaceC13820, AbstractC9303 abstractC9303, C19283 c19283) throws IOException {
        try {
            return (InterfaceC24548) interfaceC13820.parseFrom(abstractC9303, c19283);
        } catch (C4293 e) {
            throw e.m8712();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24548 m14265(InterfaceC13820 interfaceC13820, InputStream inputStream) throws IOException {
        try {
            return (InterfaceC24548) interfaceC13820.parseDelimitedFrom(inputStream);
        } catch (C4293 e) {
            throw e.m8712();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24548 m14266(InterfaceC13820 interfaceC13820, InputStream inputStream, C19283 c19283) throws IOException {
        try {
            return (InterfaceC24548) interfaceC13820.parseDelimitedFrom(inputStream, c19283);
        } catch (C4293 e) {
            throw e.m8712();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m14274() {
        return C22558.m50581() && C22558.m50578();
    }

    /* JADX INFO: renamed from: ܿ */
    public static InterfaceC8296 m14287() {
        return C23719.m52744();
    }

    /* JADX INFO: renamed from: ܳ */
    public static InterfaceC13661 m14283() {
        return C7646.m17621();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static InterfaceC12320 m14288() {
        return C9895.m23171();
    }

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC6955 m14285() {
        return C21257.m48018();
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC21708 m14278() {
        return C7292.m16844();
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24389 m14263(InterfaceC24389 interfaceC24389) {
        return m14264(interfaceC24389, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24389 m14264(InterfaceC24389 interfaceC24389, int i) {
        int size = interfaceC24389.size();
        if (i <= size) {
            i = size * 2;
        }
        if (i <= 0) {
            i = 10;
        }
        return interfaceC24389.mo10520(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24389 m14262(Class cls) {
        return C23878.m52962();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public void writeTo(AbstractC16402 abstractC16402) {
        C9796.m22863(this, getAllFieldsRaw(), abstractC16402);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM22858 = C9796.m22858(this, getAllFieldsRaw());
        this.memoizedSize = iM22858;
        return iM22858;
    }

    public Object newInstance(C4944 c4944) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17683 m14261(InterfaceC24548 interfaceC24548, int i, Class cls, InterfaceC24548 interfaceC24549) {
        return new C17683(new C16600(interfaceC24548, i), cls, interfaceC24549, EnumC11869.IMMUTABLE);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17683 m14260(Class cls, InterfaceC24548 interfaceC24548) {
        return new C17683(null, cls, interfaceC24548, EnumC11869.IMMUTABLE);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Method m14276(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m14275(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new IllegalStateException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public AbstractC3761 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Deprecated
    public C15691 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public Object writeReplace() {
        return new C17012(this);
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC7845 m14277(AbstractC13210 abstractC13210) {
        if (abstractC13210.mo18130()) {
            throw new IllegalArgumentException("Expected non-lite extension.");
        }
        return (AbstractC7845) abstractC13210;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m14290(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        return ((AbstractC7962) obj).size() == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m14254(int i, Object obj) {
        if (obj instanceof String) {
            return AbstractC16402.m37217((String) obj) + AbstractC16402.m37220(i);
        }
        return AbstractC16402.m37223(i, (AbstractC7962) obj);
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m14284(Object obj) {
        if (!(obj instanceof String)) {
            int i = AbstractC16402.f48200;
            int size = ((AbstractC7962) obj).size();
            return AbstractC16402.m37230(size) + size;
        }
        return AbstractC16402.m37217((String) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14269(AbstractC16402 abstractC16402, int i, Object obj) {
        if (obj instanceof String) {
            abstractC16402.mo37236(i, (String) obj);
        } else {
            abstractC16402.mo37237(i, (AbstractC7962) obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14270(AbstractC16402 abstractC16402, Object obj) {
        if (obj instanceof String) {
            abstractC16402.mo37243((String) obj);
        } else {
            abstractC16402.mo37245((AbstractC7962) obj);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m14281(AbstractC16402 abstractC16402, C15691 c15691, C21728 c21728, int i) {
        Map mapM35737 = c15691.m35737();
        abstractC16402.getClass();
        m14271(abstractC16402, mapM35737, c21728, i);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m14286(AbstractC16402 abstractC16402, C15691 c15691, C21728 c21728, int i) {
        Map mapM35737 = c15691.m35737();
        abstractC16402.getClass();
        m14271(abstractC16402, mapM35737, c21728, i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m14289(AbstractC16402 abstractC16402, C15691 c15691, C21728 c21728, int i) {
        Map mapM35737 = c15691.m35737();
        abstractC16402.getClass();
        m14271(abstractC16402, mapM35737, c21728, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14273(AbstractC16402 abstractC16402, C15691 c15691, C21728 c21728, int i) {
        Map mapM35737 = c15691.m35737();
        abstractC16402.getClass();
        m14271(abstractC16402, mapM35737, c21728, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14272(AbstractC16402 abstractC16402, Map map, C21728 c21728, int i, boolean z) {
        if (map.containsKey(Boolean.valueOf(z))) {
            c21728.getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14271(AbstractC16402 abstractC16402, Map map, C21728 c21728, int i) {
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            c21728.getClass();
            throw null;
        }
    }
}
