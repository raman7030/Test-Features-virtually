package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23442 extends AbstractC17092 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75256 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final long f75257;

    static {
        try {
            f75257 = C21244.m48237(AbstractC12154.class.getDeclaredField("᩸"));
        } catch (Throwable unused) {
            throw new IllegalStateException("Unable to lookup extension field offset");
        }
    }

    @Override // l.AbstractC17092
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo40108(InterfaceC8522 interfaceC8522) {
        return interfaceC8522 instanceof AbstractC12154;
    }

    @Override // l.AbstractC17092
    /* JADX INFO: renamed from: ֫ */
    public final C19210 mo40104(Object obj) {
        return (C19210) C21244.m48234(f75257, obj);
    }

    @Override // l.AbstractC17092
    /* JADX INFO: renamed from: ۧ */
    public final C19210 mo40109(Object obj) {
        C19210 c19210Mo40104 = mo40104(obj);
        if (!c19210Mo40104.m44322()) {
            return c19210Mo40104;
        }
        C19210 c19210Clone = c19210Mo40104.clone();
        C21244.m48224(f75257, obj, c19210Clone);
        return c19210Clone;
    }

    @Override // l.AbstractC17092
    /* JADX INFO: renamed from: ܽ */
    public final void mo40110(Object obj) {
        mo40104(obj).m44326();
    }

    @Override // l.AbstractC17092
    /* JADX INFO: renamed from: ֫ */
    public final Object mo40102(Object obj, InterfaceC10785 interfaceC10785, Object obj2, C17798 c17798, C19210 c19210, Object obj3, AbstractC17009 abstractC17009) {
        Object objValueOf;
        Object objM44312;
        ArrayList arrayList;
        ArrayList arrayList2;
        C7174 c7174 = (C7174) obj2;
        C0117 c0117 = c7174.f21972;
        InterfaceC23338 interfaceC23338 = c7174.f21971;
        int number = c0117.getNumber();
        if (c0117.mo1129() && c0117.mo1143()) {
            switch (C14269.f42973[c0117.mo1142().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6764(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6799(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6797(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6793(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6791(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6778(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6773(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6789(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6782(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6769(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6780(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6803(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC10785.mo6785(arrayList);
                    arrayList2 = arrayList;
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                case 14:
                    ArrayList arrayList3 = new ArrayList();
                    interfaceC10785.mo6795(arrayList3);
                    arrayList2 = new ArrayList();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Integer) it.next()).intValue();
                        C2235 c2235M23851 = c0117.m1127().m23851(iIntValue);
                        if (c2235M23851 != null) {
                            arrayList2.add(c2235M23851);
                        } else {
                            obj3 = C8668.m22427(obj, number, iIntValue, obj3, abstractC17009);
                        }
                    }
                    c19210.m44316((InterfaceC18504) c0117, (Object) arrayList2);
                    return obj3;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c0117.mo1142());
            }
        }
        if (c0117.mo1142() == EnumC7132.f21896) {
            int iMo6802 = interfaceC10785.mo6802();
            objValueOf = c0117.m1127().m23851(iMo6802);
            if (objValueOf == null) {
                return C8668.m22427(obj, number, iMo6802, obj3, abstractC17009);
            }
        } else {
            switch (C14269.f42973[c0117.mo1142().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(interfaceC10785.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(interfaceC10785.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(interfaceC10785.mo6776());
                    break;
                case 4:
                    objValueOf = Long.valueOf(interfaceC10785.mo6781());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(interfaceC10785.mo6802());
                    break;
                case 6:
                    objValueOf = Long.valueOf(interfaceC10785.mo6766());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(interfaceC10785.mo6779());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(interfaceC10785.mo6787());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(interfaceC10785.mo6796());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(interfaceC10785.mo6763());
                    break;
                case 11:
                    objValueOf = Long.valueOf(interfaceC10785.mo6792());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(interfaceC10785.mo6804());
                    break;
                case 13:
                    objValueOf = Long.valueOf(interfaceC10785.mo6790());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = interfaceC10785.mo6777();
                    break;
                case 16:
                    objValueOf = interfaceC10785.mo6772();
                    break;
                case 17:
                    objValueOf = interfaceC10785.mo6767(interfaceC23338.getClass(), c17798);
                    break;
                case 18:
                    objValueOf = interfaceC10785.mo6783(interfaceC23338.getClass(), c17798);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        }
        if (c0117.mo1129()) {
            c19210.m44314(c0117, objValueOf);
            return obj3;
        }
        int i = C14269.f42973[c0117.mo1142().ordinal()];
        if ((i == 17 || i == 18) && (objM44312 = c19210.m44312((InterfaceC18504) c0117)) != null) {
            objValueOf = ((InterfaceC8522) objM44312).toBuilder().mergeFrom((InterfaceC8522) objValueOf).buildPartial();
        }
        c19210.m44316((InterfaceC18504) c0117, objValueOf);
        return obj3;
    }

    @Override // l.AbstractC17092
    /* JADX INFO: renamed from: ֫ */
    public final int mo40101(Map.Entry entry) {
        return ((C0117) entry.getKey()).getNumber();
    }

    @Override // l.AbstractC17092
    /* JADX INFO: renamed from: ֫ */
    public final void mo40106(InterfaceC6633 interfaceC6633, Map.Entry entry) {
        C0117 c0117 = (C0117) entry.getKey();
        if (c0117.mo1129()) {
            int i = 0;
            switch (C14269.f42973[c0117.mo1142().ordinal()]) {
                case 1:
                    C8668.m22443(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 2:
                    C8668.m22445(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 3:
                    C8668.m22436(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 4:
                    C8668.m22435(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 5:
                    C8668.m22455(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 6:
                    C8668.m22450(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 7:
                    C8668.m22452(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 8:
                    C8668.m22431(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 9:
                    C8668.m22434(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 10:
                    C8668.m22453(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 11:
                    C8668.m22438(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 12:
                    C8668.m22437(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 13:
                    C8668.m22446(c0117.getNumber(), (List) entry.getValue(), interfaceC6633, c0117.mo1143());
                    break;
                case 14:
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C2235) it.next()).getNumber()));
                    }
                    C8668.m22455(c0117.getNumber(), arrayList, interfaceC6633, c0117.mo1143());
                    break;
                case 15:
                    int number = c0117.getNumber();
                    List list2 = (List) entry.getValue();
                    int i2 = C8668.f26436;
                    if (list2 != null && !list2.isEmpty()) {
                        ((C23939) interfaceC6633).m52736(number, list2);
                        break;
                    }
                    break;
                case 16:
                    int number2 = c0117.getNumber();
                    List list3 = (List) entry.getValue();
                    int i3 = C8668.f26436;
                    if (list3 != null && !list3.isEmpty()) {
                        ((C23939) interfaceC6633).m52751(number2, list3);
                        break;
                    }
                    break;
                case 17:
                    int number3 = c0117.getNumber();
                    List list4 = (List) entry.getValue();
                    int i4 = C8668.f26436;
                    if (list4 != null && !list4.isEmpty()) {
                        C23939 c23939 = (C23939) interfaceC6633;
                        c23939.getClass();
                        while (i < list4.size()) {
                            c23939.m52733(number3, list4.get(i));
                            i++;
                        }
                        break;
                    }
                    break;
                case 18:
                    int number4 = c0117.getNumber();
                    List list5 = (List) entry.getValue();
                    int i5 = C8668.f26436;
                    if (list5 != null && !list5.isEmpty()) {
                        C23939 c239310 = (C23939) interfaceC6633;
                        c239310.getClass();
                        while (i < list5.size()) {
                            c239310.m52749(number4, list5.get(i));
                            i++;
                        }
                        break;
                    }
                    break;
            }
        }
        switch (C14269.f42973[c0117.mo1142().ordinal()]) {
            case 1:
                ((C23939) interfaceC6633).m52730(c0117.getNumber(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                C23939 c239311 = (C23939) interfaceC6633;
                c239311.m52728(((Float) entry.getValue()).floatValue(), c0117.getNumber());
                break;
            case 3:
                ((C23939) interfaceC6633).m52748(c0117.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((C23939) interfaceC6633).m52761(c0117.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((C23939) interfaceC6633).m52756(c0117.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((C23939) interfaceC6633).m52732(c0117.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((C23939) interfaceC6633).m52747(c0117.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((C23939) interfaceC6633).m52739(c0117.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((C23939) interfaceC6633).m52753(c0117.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((C23939) interfaceC6633).m52763(c0117.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((C23939) interfaceC6633).m52757(c0117.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((C23939) interfaceC6633).m52760(c0117.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((C23939) interfaceC6633).m52764(c0117.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((C23939) interfaceC6633).m52756(c0117.getNumber(), ((C2235) entry.getValue()).getNumber());
                break;
            case 15:
                ((C23939) interfaceC6633).m52738(c0117.getNumber(), (AbstractC5886) entry.getValue());
                break;
            case 16:
                ((C23939) interfaceC6633).m52735(c0117.getNumber(), (String) entry.getValue());
                break;
            case 17:
                ((C23939) interfaceC6633).m52733(c0117.getNumber(), entry.getValue());
                break;
            case 18:
                ((C23939) interfaceC6633).m52749(c0117.getNumber(), entry.getValue());
                break;
        }
    }

    @Override // l.AbstractC17092
    /* JADX INFO: renamed from: ֫ */
    public final Object mo40103(C17798 c17798, InterfaceC8522 interfaceC8522, int i) {
        return ((C1570) c17798).m5385(((InterfaceC23338) interfaceC8522).getDescriptorForType(), i);
    }

    @Override // l.AbstractC17092
    /* JADX INFO: renamed from: ֫ */
    public final void mo40107(InterfaceC10785 interfaceC10785, Object obj, C17798 c17798, C19210 c19210) {
        C7174 c7174 = (C7174) obj;
        C17798 c17799 = C17798.f54419;
        c19210.m44316((InterfaceC18504) c7174.f21972, (Object) new C9081(c7174.f21971, c17798, interfaceC10785.mo6777()));
    }

    @Override // l.AbstractC17092
    /* JADX INFO: renamed from: ֫ */
    public final void mo40105(AbstractC5886 abstractC5886, Object obj, C17798 c17798, C19210 c19210) {
        C7174 c7174 = (C7174) obj;
        InterfaceC23338 interfaceC23338 = c7174.f21971;
        interfaceC23338.newBuilderForType().buildPartial();
        C17798 c17799 = C17798.f54419;
        c19210.m44316((InterfaceC18504) c7174.f21972, (Object) new C9081(interfaceC23338, c17798, abstractC5886));
    }
}
