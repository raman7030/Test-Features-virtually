package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20625 {

    /* JADX INFO: renamed from: ܿ */
    public static final C20625 f63706;

    /* JADX INFO: renamed from: ᩳ */
    public static final /* synthetic */ int f63707 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final C22676 f63708;

    /* JADX INFO: renamed from: ۧ */
    public boolean f63709;

    /* JADX INFO: renamed from: ܽ */
    public boolean f63710;

    public /* synthetic */ C20625(C22676 c22676, int i) {
        this(c22676);
    }

    public C20625() {
        this.f63708 = new C4571(16);
    }

    public C20625(C22676 c22676) {
        this.f63708 = c22676;
        m46621();
    }

    /* JADX INFO: renamed from: ۡ */
    public static C20625 m46596() {
        return new C20625();
    }

    public final C20625 clone() {
        C22676 c22676;
        C20625 c20625 = new C20625();
        int i = 0;
        while (true) {
            c22676 = this.f63708;
            if (i >= c22676.m50763()) {
                break;
            }
            Map.Entry entryM50764 = c22676.m50764(i);
            c20625.m46611((InterfaceC19954) entryM50764.getKey(), entryM50764.getValue());
            i++;
        }
        for (Map.Entry entry : c22676.m50765()) {
            c20625.m46611((InterfaceC19954) entry.getKey(), entry.getValue());
        }
        c20625.f63709 = this.f63709;
        return c20625;
    }

    /* JADX INFO: renamed from: ۢ */
    public static C20625 m46597() {
        return f63706;
    }

    static {
        C20625 c20625 = new C20625(new C4571(0));
        c20625.m46621();
        f63706 = c20625;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m46619() {
        return this.f63708.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m46621() {
        if (this.f63710) {
            return;
        }
        int i = 0;
        while (true) {
            C22676 c22676 = this.f63708;
            if (i < c22676.m50763()) {
                Map.Entry entryM50764 = c22676.m50764(i);
                if (entryM50764.getValue() instanceof AbstractC23049) {
                    AbstractC23049 abstractC23049 = (AbstractC23049) entryM50764.getValue();
                    abstractC23049.getClass();
                    C13150 c13150M30098 = C13150.m30098();
                    c13150M30098.getClass();
                    c13150M30098.m30099(abstractC23049.getClass()).mo26208((Object) abstractC23049);
                    abstractC23049.m51431();
                }
                i++;
            } else {
                c22676.mo9645();
                this.f63710 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m46617() {
        return this.f63710;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20625) {
            return this.f63708.equals(((C20625) obj).f63708);
        }
        return false;
    }

    public final int hashCode() {
        return this.f63708.hashCode();
    }

    /* JADX INFO: renamed from: ۧ */
    public final Map m46615() {
        boolean z = this.f63709;
        C22676 c22676 = this.f63708;
        if (!z) {
            return c22676.m50766() ? c22676 : C21562.unmodifiableMap(c22676);
        }
        C4571 c4571M46587 = m46587(c22676, false, true);
        if (c22676.m50766()) {
            c4571M46587.mo9645();
        }
        return c4571M46587;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4571 m46587(C22676 c22676, boolean z, boolean z2) {
        int i = C22676.f71529;
        C4571 c4571 = new C4571(16);
        for (int i2 = 0; i2 < c22676.m50763(); i2++) {
            m46589(c4571, c22676.m50764(i2), z, z2);
        }
        Iterator it = c22676.m50765().iterator();
        while (it.hasNext()) {
            m46589(c4571, (Map.Entry) it.next(), z, z2);
        }
        return c4571;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46589(Map map, Map.Entry entry, boolean z, boolean z2) {
        InterfaceC19954 interfaceC19954 = (InterfaceC19954) entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof C10999)) {
            ((C4571) map).m50761(interfaceC19954, ((C10999) value).m25389());
        } else if (!z || !(value instanceof List)) {
            ((C4571) map).m50761(interfaceC19954, value);
        } else {
            ((C4571) map).m50761(interfaceC19954, new ArrayList((List) value));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final Iterator m46614() {
        boolean z = this.f63709;
        C22676 c22676 = this.f63708;
        if (z) {
            return new C11670(((C16639) c22676.entrySet()).iterator());
        }
        return ((C16639) c22676.entrySet()).iterator();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Iterator m46608() {
        boolean z = this.f63709;
        C22676 c22676 = this.f63708;
        if (z) {
            return new C11670(((C19994) c22676.m50762()).iterator());
        }
        return ((C19994) c22676.m50762()).iterator();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46613(C2479 c2479) {
        if (c2479.mo3530()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f63708.get(c2479) != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m46607(InterfaceC19954 interfaceC19954) {
        Object obj = this.f63708.get(interfaceC19954);
        return obj instanceof C10999 ? ((C10999) obj).m25389() : obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46611(InterfaceC19954 interfaceC19954, Object obj) {
        if (interfaceC19954.mo3530()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m46603(interfaceC19954, it.next());
            }
            obj = arrayList;
        } else {
            m46603(interfaceC19954, obj);
        }
        if (obj instanceof C10999) {
            this.f63709 = true;
        }
        this.f63708.m50761(interfaceC19954, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46609(C2479 c2479, Object obj) {
        List arrayList;
        if (!c2479.mo3530()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m46603(c2479, obj);
        Object objM46607 = m46607((InterfaceC19954) c2479);
        if (objM46607 == null) {
            arrayList = new ArrayList();
            this.f63708.m50761(c2479, arrayList);
        } else {
            arrayList = (List) objM46607;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m46603(InterfaceC19954 interfaceC19954, Object obj) {
        if (!m46605(interfaceC19954.mo3543(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC19954.getNumber()), interfaceC19954.mo3543().m21089(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m46605(EnumC9146 enumC9146, Object obj) {
        byte[] bArr = C15671.f44805;
        obj.getClass();
        switch (C4531.f10157[enumC9146.m21089().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC7962) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof InterfaceC5614);
            case 9:
                return (obj instanceof InterfaceC10467) || (obj instanceof C10999);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m46622() {
        int i = 0;
        while (true) {
            C22676 c22676 = this.f63708;
            if (i < c22676.m50763()) {
                if (!m46604(c22676.m50764(i))) {
                    return false;
                }
                i++;
            } else {
                Iterator it = c22676.m50765().iterator();
                while (it.hasNext()) {
                    if (!m46604((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m46604(Map.Entry entry) {
        boolean zIsInitialized;
        InterfaceC19954 interfaceC19954 = (InterfaceC19954) entry.getKey();
        if (interfaceC19954.mo3541() == EnumC3978.MESSAGE) {
            if (interfaceC19954.mo3530()) {
                for (Object obj : (List) entry.getValue()) {
                    if (obj instanceof InterfaceC17171) {
                        zIsInitialized = ((InterfaceC17171) obj).isInitialized();
                    } else {
                        if (!(obj instanceof C10999)) {
                            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                        }
                        zIsInitialized = true;
                    }
                    if (!zIsInitialized) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC17171) {
                    return ((InterfaceC17171) value).isInitialized();
                }
                if (value instanceof C10999) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46612(C20625 c20625) {
        C22676 c22676;
        int i = 0;
        while (true) {
            c22676 = c20625.f63708;
            if (i >= c22676.m50763()) {
                break;
            }
            m46606(c22676.m50764(i));
            i++;
        }
        Iterator it = c22676.m50765().iterator();
        while (it.hasNext()) {
            m46606((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m46601(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m46606(Map.Entry entry) {
        InterfaceC19954 interfaceC19954 = (InterfaceC19954) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C10999;
        boolean zMo3530 = interfaceC19954.mo3530();
        C22676 c22676 = this.f63708;
        if (zMo3530) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objM46607 = m46607(interfaceC19954);
            if (objM46607 == null) {
                objM46607 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM46607).add(m46601(it.next()));
            }
            c22676.m50761(interfaceC19954, objM46607);
            return;
        }
        if (interfaceC19954.mo3541() != EnumC3978.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            c22676.m50761(interfaceC19954, m46601(value));
            return;
        }
        Object objM46608 = m46607(interfaceC19954);
        if (objM46608 == null) {
            c22676.m50761(interfaceC19954, m46601(value));
            if (z) {
                this.f63709 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C10999) value).m25389();
        }
        c22676.m50761(interfaceC19954, interfaceC19954.mo3525(((InterfaceC10467) objM46608).toBuilder(), (InterfaceC10467) value).build());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46616(AbstractC16402 abstractC16402) {
        C22676 c22676;
        int i = 0;
        while (true) {
            c22676 = this.f63708;
            if (i >= c22676.m50763()) {
                break;
            }
            Map.Entry entryM50764 = c22676.m50764(i);
            m46592((InterfaceC19954) entryM50764.getKey(), entryM50764.getValue(), abstractC16402);
            i++;
        }
        for (Map.Entry entry : c22676.m50765()) {
            m46592((InterfaceC19954) entry.getKey(), entry.getValue(), abstractC16402);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46610(AbstractC16402 abstractC16402) {
        C22676 c22676;
        int i = 0;
        while (true) {
            c22676 = this.f63708;
            if (i >= c22676.m50763()) {
                break;
            }
            m46588(c22676.m50764(i), abstractC16402);
            i++;
        }
        Iterator it = c22676.m50765().iterator();
        while (it.hasNext()) {
            m46588((Map.Entry) it.next(), abstractC16402);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46588(Map.Entry entry, AbstractC16402 abstractC16402) {
        InterfaceC19954 interfaceC19954 = (InterfaceC19954) entry.getKey();
        if (interfaceC19954.mo3541() == EnumC3978.MESSAGE && !interfaceC19954.mo3530() && !interfaceC19954.mo3544()) {
            Object value = entry.getValue();
            if (value instanceof C10999) {
                abstractC16402.mo37250(((InterfaceC19954) entry.getKey()).getNumber(), ((C10999) value).m40239());
                return;
            } else {
                abstractC16402.mo37255(((InterfaceC19954) entry.getKey()).getNumber(), (InterfaceC10467) value);
                return;
            }
        }
        m46592(interfaceC19954, entry.getValue(), abstractC16402);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46590(AbstractC16402 abstractC16402, EnumC9146 enumC9146, int i, Object obj) {
        if (enumC9146 == EnumC9146.f24783) {
            abstractC16402.m37238(i, (InterfaceC10467) obj);
        } else {
            abstractC16402.mo37254(i, enumC9146.m21090());
            m46591(abstractC16402, enumC9146, obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46591(AbstractC16402 abstractC16402, EnumC9146 enumC9146, Object obj) {
        switch (C4531.f10156[enumC9146.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                abstractC16402.getClass();
                abstractC16402.mo37242(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                abstractC16402.getClass();
                abstractC16402.mo37233(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                abstractC16402.mo37252(((Long) obj).longValue());
                break;
            case 4:
                abstractC16402.mo37252(((Long) obj).longValue());
                break;
            case 5:
                abstractC16402.mo37247(((Integer) obj).intValue());
                break;
            case 6:
                abstractC16402.mo37242(((Long) obj).longValue());
                break;
            case 7:
                abstractC16402.mo37233(((Integer) obj).intValue());
                break;
            case 8:
                abstractC16402.mo37232(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                abstractC16402.getClass();
                ((InterfaceC10467) obj).writeTo(abstractC16402);
                break;
            case 10:
                abstractC16402.mo37246((InterfaceC10467) obj);
                break;
            case 11:
                if (obj instanceof AbstractC7962) {
                    abstractC16402.mo37245((AbstractC7962) obj);
                } else {
                    abstractC16402.mo37243((String) obj);
                }
                break;
            case 12:
                if (obj instanceof AbstractC7962) {
                    abstractC16402.mo37245((AbstractC7962) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    abstractC16402.getClass();
                    abstractC16402.mo37241(bArr.length, bArr);
                }
                break;
            case 13:
                abstractC16402.mo37253(((Integer) obj).intValue());
                break;
            case 14:
                abstractC16402.mo37233(((Integer) obj).intValue());
                break;
            case 15:
                abstractC16402.mo37242(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC16402.mo37253((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC16402.mo37252((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (obj instanceof InterfaceC5614) {
                    abstractC16402.mo37247(((InterfaceC5614) obj).getNumber());
                } else {
                    abstractC16402.mo37247(((Integer) obj).intValue());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46592(InterfaceC19954 interfaceC19954, Object obj, AbstractC16402 abstractC16402) {
        EnumC9146 enumC9146Mo3543 = interfaceC19954.mo3543();
        int number = interfaceC19954.getNumber();
        if (interfaceC19954.mo3530()) {
            List list = (List) obj;
            if (interfaceC19954.mo3544()) {
                if (list.isEmpty()) {
                    return;
                }
                abstractC16402.mo37254(number, 2);
                Iterator it = list.iterator();
                int iM46599 = 0;
                while (it.hasNext()) {
                    iM46599 += m46599(enumC9146Mo3543, it.next());
                }
                abstractC16402.mo37253(iM46599);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    m46591(abstractC16402, enumC9146Mo3543, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                m46590(abstractC16402, enumC9146Mo3543, number, it3.next());
            }
            return;
        }
        if (obj instanceof C10999) {
            m46590(abstractC16402, enumC9146Mo3543, number, ((C10999) obj).m25389());
        } else {
            m46590(abstractC16402, enumC9146Mo3543, number, obj);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m46620() {
        C22676 c22676;
        int i = 0;
        int iM46600 = 0;
        while (true) {
            c22676 = this.f63708;
            if (i >= c22676.m50763()) {
                break;
            }
            Map.Entry entryM50764 = c22676.m50764(i);
            iM46600 += m46600((InterfaceC19954) entryM50764.getKey(), entryM50764.getValue());
            i++;
        }
        for (Map.Entry entry : c22676.m50765()) {
            iM46600 += m46600((InterfaceC19954) entry.getKey(), entry.getValue());
        }
        return iM46600;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m46618() {
        C22676 c22676;
        int i = 0;
        int iM46598 = 0;
        while (true) {
            c22676 = this.f63708;
            if (i >= c22676.m50763()) {
                break;
            }
            iM46598 += m46598(c22676.m50764(i));
            i++;
        }
        Iterator it = c22676.m50765().iterator();
        while (it.hasNext()) {
            iM46598 += m46598((Map.Entry) it.next());
        }
        return iM46598;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m46598(Map.Entry entry) {
        int iM37231;
        int iM37229;
        InterfaceC19954 interfaceC19954 = (InterfaceC19954) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC19954.mo3541() == EnumC3978.MESSAGE && !interfaceC19954.mo3530() && !interfaceC19954.mo3544()) {
            if (value instanceof C10999) {
                int number = ((InterfaceC19954) entry.getKey()).getNumber();
                iM37231 = AbstractC16402.m37231(2, number) + (AbstractC16402.m37220(1) * 2);
                iM37229 = AbstractC16402.m37216(3, (C10999) value);
            } else {
                int number2 = ((InterfaceC19954) entry.getKey()).getNumber();
                iM37231 = AbstractC16402.m37231(2, number2) + (AbstractC16402.m37220(1) * 2);
                iM37229 = AbstractC16402.m37229(3, (InterfaceC10467) value);
            }
            return iM37229 + iM37231;
        }
        return m46600(interfaceC19954, value);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m46599(EnumC9146 enumC9146, Object obj) {
        int iM40237;
        AbstractC7962 abstractC7962;
        switch (C4531.f10156[enumC9146.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                int i = AbstractC16402.f48200;
                return 8;
            case 2:
                ((Float) obj).getClass();
                int i2 = AbstractC16402.f48200;
                return 4;
            case 3:
                return AbstractC16402.m37224(((Long) obj).longValue());
            case 4:
                return AbstractC16402.m37224(((Long) obj).longValue());
            case 5:
                return AbstractC16402.m37224(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                int i3 = AbstractC16402.f48200;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                int i4 = AbstractC16402.f48200;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                int i5 = AbstractC16402.f48200;
                return 1;
            case 9:
                int i6 = AbstractC16402.f48200;
                return ((InterfaceC10467) obj).getSerializedSize();
            case 10:
                if (obj instanceof C10999) {
                    int i7 = AbstractC16402.f48200;
                    iM40237 = ((C10999) obj).m40237();
                    return AbstractC16402.m37230(iM40237) + iM40237;
                }
                return AbstractC16402.m37218((InterfaceC10467) obj);
            case 11:
                if (obj instanceof AbstractC7962) {
                    abstractC7962 = (AbstractC7962) obj;
                    int i8 = AbstractC16402.f48200;
                    iM40237 = abstractC7962.size();
                    return AbstractC16402.m37230(iM40237) + iM40237;
                }
                return AbstractC16402.m37217((String) obj);
            case 12:
                if (obj instanceof AbstractC7962) {
                    abstractC7962 = (AbstractC7962) obj;
                    int i9 = AbstractC16402.f48200;
                    iM40237 = abstractC7962.size();
                } else {
                    int i10 = AbstractC16402.f48200;
                    iM40237 = ((byte[]) obj).length;
                }
                return AbstractC16402.m37230(iM40237) + iM40237;
            case 13:
                return AbstractC16402.m37230(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i11 = AbstractC16402.f48200;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i12 = AbstractC16402.f48200;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC16402.m37230((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return AbstractC16402.m37224((jLongValue >> 63) ^ (jLongValue << 1));
            case 18:
                return obj instanceof InterfaceC5614 ? AbstractC16402.m37224(((InterfaceC5614) obj).getNumber()) : AbstractC16402.m37224(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m46600(InterfaceC19954 interfaceC19954, Object obj) {
        EnumC9146 enumC9146Mo3543 = interfaceC19954.mo3543();
        int number = interfaceC19954.getNumber();
        if (!interfaceC19954.mo3530()) {
            int iM37220 = AbstractC16402.m37220(number);
            if (enumC9146Mo3543 == EnumC9146.f24783) {
                iM37220 *= 2;
            }
            return iM37220 + m46599(enumC9146Mo3543, obj);
        }
        List list = (List) obj;
        int iM46599 = 0;
        if (interfaceC19954.mo3544()) {
            if (list.isEmpty()) {
                return 0;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iM46599 += m46599(enumC9146Mo3543, it.next());
            }
            return AbstractC16402.m37230(iM46599) + AbstractC16402.m37220(number) + iM46599;
        }
        for (Object obj2 : list) {
            int iM37221 = AbstractC16402.m37220(number);
            if (enumC9146Mo3543 == EnumC9146.f24783) {
                iM37221 *= 2;
            }
            iM46599 += iM37221 + m46599(enumC9146Mo3543, obj2);
        }
        return iM46599;
    }
}
