package l;

import com.alipay.sdk.m.u0.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9Q4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8709 extends AbstractC3770 implements InterfaceC23338 {
    public int memoizedSize = -1;

    @Override // l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public /* bridge */ /* synthetic */ InterfaceC8522 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // l.InterfaceC8522
    public /* bridge */ /* synthetic */ InterfaceC9228 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // l.InterfaceC8522
    public /* bridge */ /* synthetic */ InterfaceC9228 toBuilder() {
        return toBuilder();
    }

    public InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    public List findInitializationErrors() {
        return C7816.m20896(this);
    }

    public String getInitializationErrorString() {
        return C7816.m20895(findInitializationErrors());
    }

    public boolean hasOneof(C14934 c14934) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public C0117 getOneofFieldDescriptor(C14934 c14934) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    public final String toString() {
        int i = C11490.f34303;
        return C10079.f30364.m25331(this);
    }

    @Override // l.InterfaceC8522
    public void writeTo(AbstractC14766 abstractC14766) {
        C7816.m20898(this, getAllFields(), abstractC14766);
    }

    @Override // l.AbstractC3770
    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    @Override // l.InterfaceC15576, l.InterfaceC8060
    public boolean isInitialized() {
        for (C0117 c0117 : getDescriptorForType().getFields()) {
            if (c0117.m1128() && !hasField(c0117)) {
                return false;
            }
        }
        for (Map.Entry entry : getAllFields().entrySet()) {
            C0117 c0118 = (C0117) entry.getKey();
            if (c0118.m1138() == EnumC18463.MESSAGE) {
                if (c0118.mo1129()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC23338) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((InterfaceC23338) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // l.AbstractC3770
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSize = i;
    }

    @Override // l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM20893 = C7816.m20893(this, getAllFields());
        this.memoizedSize = iM20893;
        return iM20893;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC23338)) {
            return false;
        }
        InterfaceC23338 interfaceC23338 = (InterfaceC23338) obj;
        return getDescriptorForType() == interfaceC23338.getDescriptorForType() && m22498(getAllFields(), interfaceC23338.getAllFields()) && getUnknownFields().equals(interfaceC23338.getUnknownFields());
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + (m22494(getDescriptorForType().hashCode() + 779, getAllFields()) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC5886 m22499(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return AbstractC5886.m16490(0, bArr.length, bArr);
        }
        return (AbstractC5886) obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22497(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return m22499(obj).equals(m22499(obj2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Map m22496(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        InterfaceC23338 interfaceC23338 = (InterfaceC23338) it.next();
        C17757 descriptorForType = interfaceC23338.getDescriptorForType();
        C0117 c0117M41591 = descriptorForType.m41591("key");
        C0117 c0117M41592 = descriptorForType.m41591(b.d);
        Object field = interfaceC23338.getField(c0117M41592);
        if (field instanceof C2235) {
            field = Integer.valueOf(((C2235) field).getNumber());
        }
        map.put(interfaceC23338.getField(c0117M41591), field);
        while (it.hasNext()) {
            InterfaceC23338 interfaceC23339 = (InterfaceC23338) it.next();
            Object field2 = interfaceC23339.getField(c0117M41592);
            if (field2 instanceof C2235) {
                field2 = Integer.valueOf(((C2235) field2).getNumber());
            }
            map.put(interfaceC23339.getField(c0117M41591), field2);
        }
        return map;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m22500(Object obj, Object obj2) {
        return C7669.m20485(m22496((List) obj), m22496((List) obj2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22498(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (C0117 c0117 : map.keySet()) {
            if (!map2.containsKey(c0117)) {
                return false;
            }
            Object obj = map.get(c0117);
            Object obj2 = map2.get(c0117);
            if (c0117.getType() == EnumC19169.f60397) {
                if (c0117.mo1129()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        if (!m22497(list.get(i), list2.get(i))) {
                            return false;
                        }
                    }
                } else if (!m22497(obj, obj2)) {
                    return false;
                }
            } else if (c0117.m1137()) {
                if (!m22500(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22495(Object obj) {
        return C7669.m20484(m22496((List) obj));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22494(int i, Map map) {
        int iM22495;
        int i2;
        int iHashCode;
        for (Map.Entry entry : map.entrySet()) {
            C0117 c0117 = (C0117) entry.getKey();
            Object value = entry.getValue();
            int number = c0117.getNumber() + (i * 37);
            if (c0117.m1137()) {
                iM22495 = (number * 53) + m22495(value);
            } else {
                if (c0117.getType() != EnumC19169.f60405) {
                    i2 = number * 53;
                    iHashCode = value.hashCode();
                } else if (!c0117.mo1129()) {
                    i2 = number * 53;
                    iHashCode = ((InterfaceC3415) value).getNumber();
                } else {
                    int i3 = number * 53;
                    Iterator it = ((List) value).iterator();
                    int number2 = 1;
                    while (it.hasNext()) {
                        number2 = (number2 * 31) + ((InterfaceC3415) it.next()).getNumber();
                    }
                    iM22495 = i3 + number2;
                }
                i = iHashCode + i2;
            }
            i = iM22495;
        }
        return i;
    }

    @Override // l.AbstractC3770
    public C17715 newUninitializedMessageException() {
        return AbstractC20704.m47318((InterfaceC23338) this);
    }
}
