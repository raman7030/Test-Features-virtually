package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9Q4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10645 extends AbstractC5951 implements InterfaceC24548 {
    public int memoizedSize = -1;

    @Override // p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public /* bridge */ /* synthetic */ InterfaceC10467 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // p067l.InterfaceC10467
    public /* bridge */ /* synthetic */ InterfaceC11138 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // p067l.InterfaceC10467
    public /* bridge */ /* synthetic */ InterfaceC11138 toBuilder() {
        return toBuilder();
    }

    public InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    public List findInitializationErrors() {
        return C9796.m22861(this);
    }

    public String getInitializationErrorString() {
        return C9796.m22860(findInitializationErrors());
    }

    public boolean hasOneof(C16561 c16561) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public C2479 getOneofFieldDescriptor(C16561 c16561) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    public final String toString() {
        int i = C13288.f37300;
        return C11947.f33325.m27350(this);
    }

    @Override // p067l.InterfaceC10467
    public void writeTo(AbstractC16402 abstractC16402) {
        C9796.m22863(this, getAllFields(), abstractC16402);
    }

    @Override // p067l.AbstractC5951
    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    public boolean isInitialized() {
        for (C2479 c2479 : getDescriptorForType().getFields()) {
            if (c2479.m3529() && !hasField(c2479)) {
                return false;
            }
        }
        for (Map.Entry entry : getAllFields().entrySet()) {
            C2479 c24710 = (C2479) entry.getKey();
            if (c24710.m3539() == EnumC19915.MESSAGE) {
                if (c24710.mo3530()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC24548) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((InterfaceC24548) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p067l.AbstractC5951
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSize = i;
    }

    @Override // p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM22858 = C9796.m22858(this, getAllFields());
        this.memoizedSize = iM22858;
        return iM22858;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC24548)) {
            return false;
        }
        InterfaceC24548 interfaceC24548 = (InterfaceC24548) obj;
        return getDescriptorForType() == interfaceC24548.getDescriptorForType() && m24467(getAllFields(), interfaceC24548.getAllFields()) && getUnknownFields().equals(interfaceC24548.getUnknownFields());
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + (m24463(getDescriptorForType().hashCode() + 779, getAllFields()) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC7962 m24468(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return AbstractC7962.m18416(0, bArr.length, bArr);
        }
        return (AbstractC7962) obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24466(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return m24468(obj).equals(m24468(obj2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Map m24465(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        InterfaceC24548 interfaceC24548 = (InterfaceC24548) it.next();
        C19244 descriptorForType = interfaceC24548.getDescriptorForType();
        C2479 c2479M43836 = descriptorForType.m43836("key");
        C2479 c2479M43837 = descriptorForType.m43836(C0226b.f1011d);
        Object field = interfaceC24548.getField(c2479M43837);
        if (field instanceof C4492) {
            field = Integer.valueOf(((C4492) field).getNumber());
        }
        map.put(interfaceC24548.getField(c2479M43836), field);
        while (it.hasNext()) {
            InterfaceC24548 interfaceC24549 = (InterfaceC24548) it.next();
            Object field2 = interfaceC24549.getField(c2479M43837);
            if (field2 instanceof C4492) {
                field2 = Integer.valueOf(((C4492) field2).getNumber());
            }
            map.put(interfaceC24549.getField(c2479M43836), field2);
        }
        return map;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m24469(Object obj, Object obj2) {
        return C9657.m22465(m24465((List) obj), m24465((List) obj2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24467(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (C2479 c2479 : map.keySet()) {
            if (!map2.containsKey(c2479)) {
                return false;
            }
            Object obj = map.get(c2479);
            Object obj2 = map2.get(c2479);
            if (c2479.getType() == EnumC20586.f63628) {
                if (c2479.mo3530()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        if (!m24466(list.get(i), list2.get(i))) {
                            return false;
                        }
                    }
                } else if (!m24466(obj, obj2)) {
                    return false;
                }
            } else if (c2479.m3538()) {
                if (!m24469(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m24464(Object obj) {
        return C9657.m22464(m24465((List) obj));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m24463(int i, Map map) {
        int iM24464;
        int i2;
        int iHashCode;
        for (Map.Entry entry : map.entrySet()) {
            C2479 c2479 = (C2479) entry.getKey();
            Object value = entry.getValue();
            int number = c2479.getNumber() + (i * 37);
            if (c2479.m3538()) {
                iM24464 = (number * 53) + m24464(value);
            } else {
                if (c2479.getType() != EnumC20586.f63636) {
                    i2 = number * 53;
                    iHashCode = value.hashCode();
                } else if (!c2479.mo3530()) {
                    i2 = number * 53;
                    iHashCode = ((InterfaceC5614) value).getNumber();
                } else {
                    int i3 = number * 53;
                    Iterator it = ((List) value).iterator();
                    int number2 = 1;
                    while (it.hasNext()) {
                        number2 = (number2 * 31) + ((InterfaceC5614) it.next()).getNumber();
                    }
                    iM24464 = i3 + number2;
                }
                i = iHashCode + i2;
            }
            i = iM24464;
        }
        return i;
    }

    @Override // p067l.AbstractC5951
    public C19204 newUninitializedMessageException() {
        return AbstractC22045.m49645((InterfaceC24548) this);
    }
}
