package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19210 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C19210 f60475;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f60476 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21368 f60477;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f60478;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f60479;

    public /* synthetic */ C19210(C21368 c21368, int i) {
        this(c21368);
    }

    public C19210() {
        this.f60477 = new C2318(16);
    }

    public C19210(C21368 c21368) {
        this.f60477 = c21368;
        m44326();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C19210 m44301() {
        return new C19210();
    }

    public final C19210 clone() {
        C21368 c21368;
        C19210 c19210 = new C19210();
        int i = 0;
        while (true) {
            c21368 = this.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            Map.Entry entryM48428 = c21368.m48428(i);
            c19210.m44316((InterfaceC18504) entryM48428.getKey(), entryM48428.getValue());
            i++;
        }
        for (Map.Entry entry : c21368.m48429()) {
            c19210.m44316((InterfaceC18504) entry.getKey(), entry.getValue());
        }
        c19210.f60478 = this.f60478;
        return c19210;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C19210 m44302() {
        return f60475;
    }

    static {
        C19210 c19210 = new C19210(new C2318(0));
        c19210.m44326();
        f60475 = c19210;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m44324() {
        return this.f60477.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44326() {
        if (this.f60479) {
            return;
        }
        int i = 0;
        while (true) {
            C21368 c21368 = this.f60477;
            if (i < c21368.m48427()) {
                Map.Entry entryM48428 = c21368.m48428(i);
                if (entryM48428.getValue() instanceof AbstractC21760) {
                    AbstractC21760 abstractC21760 = (AbstractC21760) entryM48428.getValue();
                    abstractC21760.getClass();
                    C11345 c11345M28053 = C11345.m28053();
                    c11345M28053.getClass();
                    c11345M28053.m28054(abstractC21760.getClass()).mo24198((Object) abstractC21760);
                    abstractC21760.m49082();
                }
                i++;
            } else {
                c21368.mo7575();
                this.f60479 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m44322() {
        return this.f60479;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19210) {
            return this.f60477.equals(((C19210) obj).f60477);
        }
        return false;
    }

    public final int hashCode() {
        return this.f60477.hashCode();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map m44320() {
        boolean z = this.f60478;
        C21368 c21368 = this.f60477;
        if (!z) {
            return c21368.m48430() ? c21368 : C20195.unmodifiableMap(c21368);
        }
        C2318 c2318M44292 = m44292(c21368, false, true);
        if (c21368.m48430()) {
            c2318M44292.mo7575();
        }
        return c2318M44292;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2318 m44292(C21368 c21368, boolean z, boolean z2) {
        int i = C21368.f68833;
        C2318 c2318 = new C2318(16);
        for (int i2 = 0; i2 < c21368.m48427(); i2++) {
            m44294(c2318, c21368.m48428(i2), z, z2);
        }
        Iterator it = c21368.m48429().iterator();
        while (it.hasNext()) {
            m44294(c2318, (Map.Entry) it.next(), z, z2);
        }
        return c2318;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44294(Map map, Map.Entry entry, boolean z, boolean z2) {
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof C9081)) {
            ((C2318) map).m48425(interfaceC18504, ((C9081) value).m23442());
        } else if (!z || !(value instanceof List)) {
            ((C2318) map).m48425(interfaceC18504, value);
        } else {
            ((C2318) map).m48425(interfaceC18504, new ArrayList((List) value));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Iterator m44319() {
        boolean z = this.f60478;
        C21368 c21368 = this.f60477;
        if (z) {
            return new C9787(((C15016) c21368.entrySet()).iterator());
        }
        return ((C15016) c21368.entrySet()).iterator();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterator m44313() {
        boolean z = this.f60478;
        C21368 c21368 = this.f60477;
        if (z) {
            return new C9787(((C18546) c21368.m48426()).iterator());
        }
        return ((C18546) c21368.m48426()).iterator();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44318(C0117 c0117) {
        if (c0117.mo1129()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f60477.get(c0117) != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m44312(InterfaceC18504 interfaceC18504) {
        Object obj = this.f60477.get(interfaceC18504);
        return obj instanceof C9081 ? ((C9081) obj).m23442() : obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44316(InterfaceC18504 interfaceC18504, Object obj) {
        if (interfaceC18504.mo1129()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m44308(interfaceC18504, it.next());
            }
            obj = arrayList;
        } else {
            m44308(interfaceC18504, obj);
        }
        if (obj instanceof C9081) {
            this.f60478 = true;
        }
        this.f60477.m48425(interfaceC18504, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44314(C0117 c0117, Object obj) {
        List arrayList;
        if (!c0117.mo1129()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m44308(c0117, obj);
        Object objM44312 = m44312((InterfaceC18504) c0117);
        if (objM44312 == null) {
            arrayList = new ArrayList();
            this.f60477.m48425(c0117, arrayList);
        } else {
            arrayList = (List) objM44312;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m44308(InterfaceC18504 interfaceC18504, Object obj) {
        if (!m44310(interfaceC18504.mo1142(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC18504.getNumber()), interfaceC18504.mo1142().m19146(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m44310(EnumC7132 enumC7132, Object obj) {
        byte[] bArr = C13997.f41722;
        obj.getClass();
        switch (C2276.f7370[enumC7132.m19146().ordinal()]) {
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
                return (obj instanceof AbstractC5886) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof InterfaceC3415);
            case 9:
                return (obj instanceof InterfaceC8522) || (obj instanceof C9081);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m44327() {
        int i = 0;
        while (true) {
            C21368 c21368 = this.f60477;
            if (i < c21368.m48427()) {
                if (!m44309(c21368.m48428(i))) {
                    return false;
                }
                i++;
            } else {
                Iterator it = c21368.m48429().iterator();
                while (it.hasNext()) {
                    if (!m44309((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m44309(Map.Entry entry) {
        boolean zIsInitialized;
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        if (interfaceC18504.mo1140() == EnumC1694.MESSAGE) {
            if (interfaceC18504.mo1129()) {
                for (Object obj : (List) entry.getValue()) {
                    if (obj instanceof InterfaceC15576) {
                        zIsInitialized = ((InterfaceC15576) obj).isInitialized();
                    } else {
                        if (!(obj instanceof C9081)) {
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
                if (value instanceof InterfaceC15576) {
                    return ((InterfaceC15576) value).isInitialized();
                }
                if (value instanceof C9081) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44317(C19210 c19210) {
        C21368 c21368;
        int i = 0;
        while (true) {
            c21368 = c19210.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            m44311(c21368.m48428(i));
            i++;
        }
        Iterator it = c21368.m48429().iterator();
        while (it.hasNext()) {
            m44311((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m44306(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m44311(Map.Entry entry) {
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C9081;
        boolean zMo1129 = interfaceC18504.mo1129();
        C21368 c21368 = this.f60477;
        if (zMo1129) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objM44312 = m44312(interfaceC18504);
            if (objM44312 == null) {
                objM44312 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM44312).add(m44306(it.next()));
            }
            c21368.m48425(interfaceC18504, objM44312);
            return;
        }
        if (interfaceC18504.mo1140() != EnumC1694.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            c21368.m48425(interfaceC18504, m44306(value));
            return;
        }
        Object objM44313 = m44312(interfaceC18504);
        if (objM44313 == null) {
            c21368.m48425(interfaceC18504, m44306(value));
            if (z) {
                this.f60478 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C9081) value).m23442();
        }
        c21368.m48425(interfaceC18504, interfaceC18504.mo1124(((InterfaceC8522) objM44313).toBuilder(), (InterfaceC8522) value).build());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44321(AbstractC14766 abstractC14766) {
        C21368 c21368;
        int i = 0;
        while (true) {
            c21368 = this.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            Map.Entry entryM48428 = c21368.m48428(i);
            m44297((InterfaceC18504) entryM48428.getKey(), entryM48428.getValue(), abstractC14766);
            i++;
        }
        for (Map.Entry entry : c21368.m48429()) {
            m44297((InterfaceC18504) entry.getKey(), entry.getValue(), abstractC14766);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44315(AbstractC14766 abstractC14766) {
        C21368 c21368;
        int i = 0;
        while (true) {
            c21368 = this.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            m44293(c21368.m48428(i), abstractC14766);
            i++;
        }
        Iterator it = c21368.m48429().iterator();
        while (it.hasNext()) {
            m44293((Map.Entry) it.next(), abstractC14766);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44293(Map.Entry entry, AbstractC14766 abstractC14766) {
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        if (interfaceC18504.mo1140() == EnumC1694.MESSAGE && !interfaceC18504.mo1129() && !interfaceC18504.mo1143()) {
            Object value = entry.getValue();
            if (value instanceof C9081) {
                abstractC14766.mo35103(((InterfaceC18504) entry.getKey()).getNumber(), ((C9081) value).m38047());
                return;
            } else {
                abstractC14766.mo35108(((InterfaceC18504) entry.getKey()).getNumber(), (InterfaceC8522) value);
                return;
            }
        }
        m44297(interfaceC18504, entry.getValue(), abstractC14766);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44295(AbstractC14766 abstractC14766, EnumC7132 enumC7132, int i, Object obj) {
        if (enumC7132 == EnumC7132.f21904) {
            abstractC14766.m35091(i, (InterfaceC8522) obj);
        } else {
            abstractC14766.mo35107(i, enumC7132.m19147());
            m44296(abstractC14766, enumC7132, obj);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44296(AbstractC14766 abstractC14766, EnumC7132 enumC7132, Object obj) {
        switch (C2276.f7369[enumC7132.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                abstractC14766.getClass();
                abstractC14766.mo35095(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                abstractC14766.getClass();
                abstractC14766.mo35086(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                abstractC14766.mo35105(((Long) obj).longValue());
                break;
            case 4:
                abstractC14766.mo35105(((Long) obj).longValue());
                break;
            case 5:
                abstractC14766.mo35100(((Integer) obj).intValue());
                break;
            case 6:
                abstractC14766.mo35095(((Long) obj).longValue());
                break;
            case 7:
                abstractC14766.mo35086(((Integer) obj).intValue());
                break;
            case 8:
                abstractC14766.mo35085(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                abstractC14766.getClass();
                ((InterfaceC8522) obj).writeTo(abstractC14766);
                break;
            case 10:
                abstractC14766.mo35099((InterfaceC8522) obj);
                break;
            case 11:
                if (obj instanceof AbstractC5886) {
                    abstractC14766.mo35098((AbstractC5886) obj);
                } else {
                    abstractC14766.mo35096((String) obj);
                }
                break;
            case 12:
                if (obj instanceof AbstractC5886) {
                    abstractC14766.mo35098((AbstractC5886) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    abstractC14766.getClass();
                    abstractC14766.mo35094(bArr.length, bArr);
                }
                break;
            case 13:
                abstractC14766.mo35106(((Integer) obj).intValue());
                break;
            case 14:
                abstractC14766.mo35086(((Integer) obj).intValue());
                break;
            case 15:
                abstractC14766.mo35095(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC14766.mo35106((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC14766.mo35105((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (obj instanceof InterfaceC3415) {
                    abstractC14766.mo35100(((InterfaceC3415) obj).getNumber());
                } else {
                    abstractC14766.mo35100(((Integer) obj).intValue());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44297(InterfaceC18504 interfaceC18504, Object obj, AbstractC14766 abstractC14766) {
        EnumC7132 enumC7132Mo1142 = interfaceC18504.mo1142();
        int number = interfaceC18504.getNumber();
        if (interfaceC18504.mo1129()) {
            List list = (List) obj;
            if (interfaceC18504.mo1143()) {
                if (list.isEmpty()) {
                    return;
                }
                abstractC14766.mo35107(number, 2);
                Iterator it = list.iterator();
                int iM44304 = 0;
                while (it.hasNext()) {
                    iM44304 += m44304(enumC7132Mo1142, it.next());
                }
                abstractC14766.mo35106(iM44304);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    m44296(abstractC14766, enumC7132Mo1142, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                m44295(abstractC14766, enumC7132Mo1142, number, it3.next());
            }
            return;
        }
        if (obj instanceof C9081) {
            m44295(abstractC14766, enumC7132Mo1142, number, ((C9081) obj).m23442());
        } else {
            m44295(abstractC14766, enumC7132Mo1142, number, obj);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m44325() {
        C21368 c21368;
        int i = 0;
        int iM44305 = 0;
        while (true) {
            c21368 = this.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            Map.Entry entryM48428 = c21368.m48428(i);
            iM44305 += m44305((InterfaceC18504) entryM48428.getKey(), entryM48428.getValue());
            i++;
        }
        for (Map.Entry entry : c21368.m48429()) {
            iM44305 += m44305((InterfaceC18504) entry.getKey(), entry.getValue());
        }
        return iM44305;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m44323() {
        C21368 c21368;
        int i = 0;
        int iM44303 = 0;
        while (true) {
            c21368 = this.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            iM44303 += m44303(c21368.m48428(i));
            i++;
        }
        Iterator it = c21368.m48429().iterator();
        while (it.hasNext()) {
            iM44303 += m44303((Map.Entry) it.next());
        }
        return iM44303;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44303(Map.Entry entry) {
        int iM35084;
        int iM35082;
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC18504.mo1140() == EnumC1694.MESSAGE && !interfaceC18504.mo1129() && !interfaceC18504.mo1143()) {
            if (value instanceof C9081) {
                int number = ((InterfaceC18504) entry.getKey()).getNumber();
                iM35084 = AbstractC14766.m35084(2, number) + (AbstractC14766.m35073(1) * 2);
                iM35082 = AbstractC14766.m35069(3, (C9081) value);
            } else {
                int number2 = ((InterfaceC18504) entry.getKey()).getNumber();
                iM35084 = AbstractC14766.m35084(2, number2) + (AbstractC14766.m35073(1) * 2);
                iM35082 = AbstractC14766.m35082(3, (InterfaceC8522) value);
            }
            return iM35082 + iM35084;
        }
        return m44305(interfaceC18504, value);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44304(EnumC7132 enumC7132, Object obj) {
        int iM38045;
        AbstractC5886 abstractC5886;
        switch (C2276.f7369[enumC7132.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                int i = AbstractC14766.f45086;
                return 8;
            case 2:
                ((Float) obj).getClass();
                int i2 = AbstractC14766.f45086;
                return 4;
            case 3:
                return AbstractC14766.m35077(((Long) obj).longValue());
            case 4:
                return AbstractC14766.m35077(((Long) obj).longValue());
            case 5:
                return AbstractC14766.m35077(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                int i3 = AbstractC14766.f45086;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                int i4 = AbstractC14766.f45086;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                int i5 = AbstractC14766.f45086;
                return 1;
            case 9:
                int i6 = AbstractC14766.f45086;
                return ((InterfaceC8522) obj).getSerializedSize();
            case 10:
                if (obj instanceof C9081) {
                    int i7 = AbstractC14766.f45086;
                    iM38045 = ((C9081) obj).m38045();
                    return AbstractC14766.m35083(iM38045) + iM38045;
                }
                return AbstractC14766.m35071((InterfaceC8522) obj);
            case 11:
                if (obj instanceof AbstractC5886) {
                    abstractC5886 = (AbstractC5886) obj;
                    int i8 = AbstractC14766.f45086;
                    iM38045 = abstractC5886.size();
                    return AbstractC14766.m35083(iM38045) + iM38045;
                }
                return AbstractC14766.m35070((String) obj);
            case 12:
                if (obj instanceof AbstractC5886) {
                    abstractC5886 = (AbstractC5886) obj;
                    int i9 = AbstractC14766.f45086;
                    iM38045 = abstractC5886.size();
                } else {
                    int i10 = AbstractC14766.f45086;
                    iM38045 = ((byte[]) obj).length;
                }
                return AbstractC14766.m35083(iM38045) + iM38045;
            case 13:
                return AbstractC14766.m35083(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i11 = AbstractC14766.f45086;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i12 = AbstractC14766.f45086;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC14766.m35083((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return AbstractC14766.m35077((jLongValue >> 63) ^ (jLongValue << 1));
            case 18:
                return obj instanceof InterfaceC3415 ? AbstractC14766.m35077(((InterfaceC3415) obj).getNumber()) : AbstractC14766.m35077(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44305(InterfaceC18504 interfaceC18504, Object obj) {
        EnumC7132 enumC7132Mo1142 = interfaceC18504.mo1142();
        int number = interfaceC18504.getNumber();
        if (!interfaceC18504.mo1129()) {
            int iM35073 = AbstractC14766.m35073(number);
            if (enumC7132Mo1142 == EnumC7132.f21904) {
                iM35073 *= 2;
            }
            return iM35073 + m44304(enumC7132Mo1142, obj);
        }
        List list = (List) obj;
        int iM44304 = 0;
        if (interfaceC18504.mo1143()) {
            if (list.isEmpty()) {
                return 0;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iM44304 += m44304(enumC7132Mo1142, it.next());
            }
            return AbstractC14766.m35083(iM44304) + AbstractC14766.m35073(number) + iM44304;
        }
        for (Object obj2 : list) {
            int iM35074 = AbstractC14766.m35073(number);
            if (enumC7132Mo1142 == EnumC7132.f21904) {
                iM35074 *= 2;
            }
            iM44304 += iM35074 + m44304(enumC7132Mo1142, obj2);
        }
        return iM44304;
    }
}
