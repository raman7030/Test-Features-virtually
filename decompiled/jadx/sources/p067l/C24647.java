package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24647 extends AbstractC18612 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f78004 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final long f78005;

    static {
        try {
            f78005 = C22558.m50568(AbstractC13919.class.getDeclaredField("᩸"));
        } catch (Throwable unused) {
            throw new IllegalStateException("Unable to lookup extension field offset");
        }
    }

    @Override // p067l.AbstractC18612
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo42353(InterfaceC10467 interfaceC10467) {
        return interfaceC10467 instanceof AbstractC13919;
    }

    @Override // p067l.AbstractC18612
    /* JADX INFO: renamed from: ֫ */
    public final C20625 mo42349(Object obj) {
        return (C20625) C22558.m50565(f78005, obj);
    }

    @Override // p067l.AbstractC18612
    /* JADX INFO: renamed from: ۧ */
    public final C20625 mo42354(Object obj) {
        C20625 c20625Mo42349 = mo42349(obj);
        if (!c20625Mo42349.m46617()) {
            return c20625Mo42349;
        }
        C20625 c20625Clone = c20625Mo42349.clone();
        C22558.m50555(f78005, obj, c20625Clone);
        return c20625Clone;
    }

    @Override // p067l.AbstractC18612
    /* JADX INFO: renamed from: ܽ */
    public final void mo42355(Object obj) {
        mo42349(obj).m46621();
    }

    @Override // p067l.AbstractC18612
    /* JADX INFO: renamed from: ֫ */
    public final Object mo42347(Object obj, InterfaceC12618 interfaceC12618, Object obj2, C19283 c19283, C20625 c20625, Object obj3, AbstractC18533 abstractC18533) {
        Object objValueOf;
        Object objM46607;
        ArrayList arrayList;
        ArrayList arrayList2;
        C9186 c9186 = (C9186) obj2;
        C2479 c2479 = c9186.f24852;
        InterfaceC24548 interfaceC24548 = c9186.f24851;
        int number = c2479.getNumber();
        if (c2479.mo3530() && c2479.mo3544()) {
            switch (C15929.f46066[c2479.mo3543().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8890(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8925(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8923(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8919(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8917(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8904(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8899(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8915(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8908(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8895(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8906(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8929(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC12618.mo8911(arrayList);
                    arrayList2 = arrayList;
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                case 14:
                    ArrayList arrayList3 = new ArrayList();
                    interfaceC12618.mo8921(arrayList3);
                    arrayList2 = new ArrayList();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Integer) it.next()).intValue();
                        C4492 c4492M25860 = c2479.m3528().m25860(iIntValue);
                        if (c4492M25860 != null) {
                            arrayList2.add(c4492M25860);
                        } else {
                            obj3 = C10606.m24396(obj, number, iIntValue, obj3, abstractC18533);
                        }
                    }
                    c20625.m46611((InterfaceC19954) c2479, (Object) arrayList2);
                    return obj3;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c2479.mo3543());
            }
        }
        if (c2479.mo3543() == EnumC9146.f24775) {
            int iMo8928 = interfaceC12618.mo8928();
            objValueOf = c2479.m3528().m25860(iMo8928);
            if (objValueOf == null) {
                return C10606.m24396(obj, number, iMo8928, obj3, abstractC18533);
            }
        } else {
            switch (C15929.f46066[c2479.mo3543().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(interfaceC12618.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(interfaceC12618.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(interfaceC12618.mo8902());
                    break;
                case 4:
                    objValueOf = Long.valueOf(interfaceC12618.mo8907());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(interfaceC12618.mo8928());
                    break;
                case 6:
                    objValueOf = Long.valueOf(interfaceC12618.mo8892());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(interfaceC12618.mo8905());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(interfaceC12618.mo8913());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(interfaceC12618.mo8922());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(interfaceC12618.mo8889());
                    break;
                case 11:
                    objValueOf = Long.valueOf(interfaceC12618.mo8918());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(interfaceC12618.mo8930());
                    break;
                case 13:
                    objValueOf = Long.valueOf(interfaceC12618.mo8916());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = interfaceC12618.mo8903();
                    break;
                case 16:
                    objValueOf = interfaceC12618.mo8898();
                    break;
                case 17:
                    objValueOf = interfaceC12618.mo8893(interfaceC24548.getClass(), c19283);
                    break;
                case 18:
                    objValueOf = interfaceC12618.mo8909(interfaceC24548.getClass(), c19283);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        }
        if (c2479.mo3530()) {
            c20625.m46609(c2479, objValueOf);
            return obj3;
        }
        int i = C15929.f46066[c2479.mo3543().ordinal()];
        if ((i == 17 || i == 18) && (objM46607 = c20625.m46607((InterfaceC19954) c2479)) != null) {
            objValueOf = ((InterfaceC10467) objM46607).toBuilder().mergeFrom((InterfaceC10467) objValueOf).buildPartial();
        }
        c20625.m46611((InterfaceC19954) c2479, objValueOf);
        return obj3;
    }

    @Override // p067l.AbstractC18612
    /* JADX INFO: renamed from: ֫ */
    public final int mo42346(Map.Entry entry) {
        return ((C2479) entry.getKey()).getNumber();
    }

    @Override // p067l.AbstractC18612
    /* JADX INFO: renamed from: ֫ */
    public final void mo42351(InterfaceC8672 interfaceC8672, Map.Entry entry) {
        C2479 c2479 = (C2479) entry.getKey();
        if (c2479.mo3530()) {
            int i = 0;
            switch (C15929.f46066[c2479.mo3543().ordinal()]) {
                case 1:
                    C10606.m24412(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 2:
                    C10606.m24414(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 3:
                    C10606.m24405(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 4:
                    C10606.m24404(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 5:
                    C10606.m24424(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 6:
                    C10606.m24419(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 7:
                    C10606.m24421(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 8:
                    C10606.m24400(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 9:
                    C10606.m24403(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 10:
                    C10606.m24422(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 11:
                    C10606.m24407(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 12:
                    C10606.m24406(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 13:
                    C10606.m24415(c2479.getNumber(), (List) entry.getValue(), interfaceC8672, c2479.mo3544());
                    break;
                case 14:
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C4492) it.next()).getNumber()));
                    }
                    C10606.m24424(c2479.getNumber(), arrayList, interfaceC8672, c2479.mo3544());
                    break;
                case 15:
                    int number = c2479.getNumber();
                    List list2 = (List) entry.getValue();
                    int i2 = C10606.f29361;
                    if (list2 != null && !list2.isEmpty()) {
                        ((C25120) interfaceC8672).m55142(number, list2);
                        break;
                    }
                    break;
                case 16:
                    int number2 = c2479.getNumber();
                    List list3 = (List) entry.getValue();
                    int i3 = C10606.f29361;
                    if (list3 != null && !list3.isEmpty()) {
                        ((C25120) interfaceC8672).m55157(number2, list3);
                        break;
                    }
                    break;
                case 17:
                    int number3 = c2479.getNumber();
                    List list4 = (List) entry.getValue();
                    int i4 = C10606.f29361;
                    if (list4 != null && !list4.isEmpty()) {
                        C25120 c25120 = (C25120) interfaceC8672;
                        c25120.getClass();
                        while (i < list4.size()) {
                            c25120.m55139(number3, list4.get(i));
                            i++;
                        }
                        break;
                    }
                    break;
                case 18:
                    int number4 = c2479.getNumber();
                    List list5 = (List) entry.getValue();
                    int i5 = C10606.f29361;
                    if (list5 != null && !list5.isEmpty()) {
                        C25120 c25121 = (C25120) interfaceC8672;
                        c25121.getClass();
                        while (i < list5.size()) {
                            c25121.m55155(number4, list5.get(i));
                            i++;
                        }
                        break;
                    }
                    break;
            }
        }
        switch (C15929.f46066[c2479.mo3543().ordinal()]) {
            case 1:
                ((C25120) interfaceC8672).m55136(c2479.getNumber(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                C25120 c25122 = (C25120) interfaceC8672;
                c25122.m55134(((Float) entry.getValue()).floatValue(), c2479.getNumber());
                break;
            case 3:
                ((C25120) interfaceC8672).m55154(c2479.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((C25120) interfaceC8672).m55167(c2479.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((C25120) interfaceC8672).m55162(c2479.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((C25120) interfaceC8672).m55138(c2479.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((C25120) interfaceC8672).m55153(c2479.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((C25120) interfaceC8672).m55145(c2479.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((C25120) interfaceC8672).m55159(c2479.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((C25120) interfaceC8672).m55169(c2479.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((C25120) interfaceC8672).m55163(c2479.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((C25120) interfaceC8672).m55166(c2479.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((C25120) interfaceC8672).m55170(c2479.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((C25120) interfaceC8672).m55162(c2479.getNumber(), ((C4492) entry.getValue()).getNumber());
                break;
            case 15:
                ((C25120) interfaceC8672).m55144(c2479.getNumber(), (AbstractC7962) entry.getValue());
                break;
            case 16:
                ((C25120) interfaceC8672).m55141(c2479.getNumber(), (String) entry.getValue());
                break;
            case 17:
                ((C25120) interfaceC8672).m55139(c2479.getNumber(), entry.getValue());
                break;
            case 18:
                ((C25120) interfaceC8672).m55155(c2479.getNumber(), entry.getValue());
                break;
        }
    }

    @Override // p067l.AbstractC18612
    /* JADX INFO: renamed from: ֫ */
    public final Object mo42348(C19283 c19283, InterfaceC10467 interfaceC10467, int i) {
        return ((C3860) c19283).m7614(((InterfaceC24548) interfaceC10467).getDescriptorForType(), i);
    }

    @Override // p067l.AbstractC18612
    /* JADX INFO: renamed from: ֫ */
    public final void mo42352(InterfaceC12618 interfaceC12618, Object obj, C19283 c19283, C20625 c20625) {
        C9186 c9186 = (C9186) obj;
        C19283 c19284 = C19283.f57615;
        c20625.m46611((InterfaceC19954) c9186.f24852, (Object) new C10999(c9186.f24851, c19283, interfaceC12618.mo8903()));
    }

    @Override // p067l.AbstractC18612
    /* JADX INFO: renamed from: ֫ */
    public final void mo42350(AbstractC7962 abstractC7962, Object obj, C19283 c19283, C20625 c20625) {
        C9186 c9186 = (C9186) obj;
        InterfaceC24548 interfaceC24548 = c9186.f24851;
        interfaceC24548.newBuilderForType().buildPartial();
        C19283 c19284 = C19283.f57615;
        c20625.m46611((InterfaceC19954) c9186.f24852, (Object) new C10999(interfaceC24548, c19283, abstractC7962));
    }
}
