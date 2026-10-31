package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۬ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1WV */
/* JADX INFO: loaded from: classes3.dex */
public final class C13036 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17249 f39037;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Integer f39038;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f39039 = new HashMap();

    public C13036(C17249 c17249) {
        this.f39037 = c17249;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] m31617(ArrayList arrayList, int i) throws C3138 {
        Object objM13387;
        Object objValueOf;
        Object[] objArr = new Object[i];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) it.next();
            EnumC0841 enumC0841Mo3975 = interfaceC22677.mo3975();
            int i2 = C3159.f9948[enumC0841Mo3975.ordinal()];
            byte b = 0;
            C17249 c17249 = this.f39037;
            HashMap map = this.f39039;
            switch (i2) {
                case 1:
                case 2:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = ((InterfaceC15347) ((InterfaceC10952) interfaceC22677).getReference()).getString();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((InterfaceC13504) interfaceC22677).mo4919());
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    int iMo1790 = ((InterfaceC1779) interfaceC22677).mo1790();
                    long jMo4920 = ((InterfaceC9541) interfaceC22677).mo4920();
                    objArr[iMo1790] = Integer.valueOf((int) (jMo4920 & 4294967295L));
                    objArr[iMo1790 + 1] = Integer.valueOf((int) ((jMo4920 >>> 32) & 4294967295L));
                    break;
                case 11:
                    InterfaceC18877 interfaceC18877 = (InterfaceC18877) ((InterfaceC10952) interfaceC22677).getReference();
                    if (!interfaceC18877.getType().equals("[S")) {
                        throw new UnsupportedOperationException("sget-object " + interfaceC18877.getType());
                    }
                    String string = interfaceC18877.toString();
                    if (map.containsKey(string)) {
                        objM13387 = map.get(string);
                    } else {
                        objM13387 = c17249.f52882.m13387(AbstractC23599.m52075(interfaceC18877.mo8192()), interfaceC18877.getName());
                        map.put(string, objM13387);
                    }
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = objM13387;
                    break;
                    break;
                case 12:
                    InterfaceC18877 interfaceC18878 = (InterfaceC18877) ((InterfaceC10952) interfaceC22677).getReference();
                    if (!interfaceC18878.getType().equals("I")) {
                        throw new UnsupportedOperationException("sget " + interfaceC18878.getType());
                    }
                    String string2 = interfaceC18878.toString();
                    if (map.containsKey(string2)) {
                        objValueOf = map.get(string2);
                    } else {
                        objValueOf = Integer.valueOf(c17249.f52882.m13388(AbstractC23599.m52075(interfaceC18878.mo8192()), interfaceC18878.getName()));
                        map.put(string2, objValueOf);
                    }
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = objValueOf;
                    break;
                    break;
                case 13:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Array.get(objArr[((InterfaceC23651) interfaceC22677).mo7930()], ((Number) objArr[((InterfaceC14478) interfaceC22677).mo7931()]).intValue());
                    break;
                case 14:
                case 15:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() + ((InterfaceC13504) interfaceC22677).mo4919());
                    break;
                case 16:
                case 17:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() - ((InterfaceC13504) interfaceC22677).mo4919());
                    break;
                case 18:
                case 19:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() * ((InterfaceC13504) interfaceC22677).mo4919());
                    break;
                case 20:
                case 21:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() / ((InterfaceC13504) interfaceC22677).mo4919());
                    break;
                case 22:
                case 23:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() % ((InterfaceC13504) interfaceC22677).mo4919());
                    break;
                case 24:
                case 25:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((InterfaceC13504) interfaceC22677).mo4919() & ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 26:
                case 27:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((InterfaceC13504) interfaceC22677).mo4919() | ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 28:
                case 29:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((InterfaceC13504) interfaceC22677).mo4919() ^ ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 30:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() << ((InterfaceC13504) interfaceC22677).mo4919());
                    break;
                case 31:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() >> ((InterfaceC13504) interfaceC22677).mo4919());
                    break;
                case 32:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() >>> ((InterfaceC13504) interfaceC22677).mo4919());
                    break;
                case 33:
                    int iMo1791 = ((InterfaceC1779) interfaceC22677).mo1790();
                    objArr[iMo1791] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() + ((Number) objArr[iMo1791]).intValue());
                    break;
                case 34:
                    int iMo1792 = ((InterfaceC1779) interfaceC22677).mo1790();
                    objArr[iMo1792] = Integer.valueOf(((Number) objArr[iMo1792]).intValue() - ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 35:
                    int iMo1793 = ((InterfaceC1779) interfaceC22677).mo1790();
                    objArr[iMo1793] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() * ((Number) objArr[iMo1793]).intValue());
                    break;
                case 36:
                    int iMo1794 = ((InterfaceC1779) interfaceC22677).mo1790();
                    objArr[iMo1794] = Integer.valueOf(((Number) objArr[iMo1794]).intValue() / ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 37:
                    int iMo1795 = ((InterfaceC1779) interfaceC22677).mo1790();
                    objArr[iMo1795] = Integer.valueOf(((Number) objArr[iMo1795]).intValue() % ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 38:
                    int iMo1796 = ((InterfaceC1779) interfaceC22677).mo1790();
                    objArr[iMo1796] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() & ((Number) objArr[iMo1796]).intValue());
                    break;
                case 39:
                    int iMo1797 = ((InterfaceC1779) interfaceC22677).mo1790();
                    objArr[iMo1797] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() | ((Number) objArr[iMo1797]).intValue());
                    break;
                case 40:
                    int iMo1798 = ((InterfaceC1779) interfaceC22677).mo1790();
                    objArr[iMo1798] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() ^ ((Number) objArr[iMo1798]).intValue());
                    break;
                case 41:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC14478) interfaceC22677).mo7931()]).intValue() + ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 42:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() - ((Number) objArr[((InterfaceC14478) interfaceC22677).mo7931()]).intValue());
                    break;
                case 43:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC14478) interfaceC22677).mo7931()]).intValue() * ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 44:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() / ((Number) objArr[((InterfaceC14478) interfaceC22677).mo7931()]).intValue());
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue() % ((Number) objArr[((InterfaceC14478) interfaceC22677).mo7931()]).intValue());
                    break;
                case 46:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC14478) interfaceC22677).mo7931()]).intValue() & ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 47:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC14478) interfaceC22677).mo7931()]).intValue() | ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 48:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = Integer.valueOf(((Number) objArr[((InterfaceC14478) interfaceC22677).mo7931()]).intValue() ^ ((Number) objArr[((InterfaceC23651) interfaceC22677).mo7930()]).intValue());
                    break;
                case 49:
                case 50:
                case 51:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = objArr[((InterfaceC23651) interfaceC22677).mo7930()];
                    break;
                case 52:
                case 53:
                    objArr[((InterfaceC1779) interfaceC22677).mo1790()] = this.f39038;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    int iMo9712 = interfaceC22677 instanceof InterfaceC16595 ? ((InterfaceC16595) interfaceC22677).mo9712() : ((InterfaceC9978) interfaceC22677).mo3614();
                    InterfaceC5471 interfaceC5471 = (InterfaceC5471) ((InterfaceC10952) interfaceC22677).getReference();
                    if (!interfaceC5471.mo3568().equals("I") || interfaceC5471.mo3565().size() != 1 || !(objArr[iMo9712] instanceof String)) {
                        throw new UnsupportedOperationException(enumC0841Mo3975.f3315 + " " + interfaceC5471);
                    }
                    C10130 c10130 = new C10130();
                    c10130.m25423((CharSequence) AbstractC23599.m52075(interfaceC5471.mo3566()));
                    c10130.m25423((CharSequence) interfaceC5471.getName());
                    c10130.writeByte(1);
                    c10130.writeByte(((CharSequence) interfaceC5471.mo3565().get(0)).equals("Ljava/lang/String;") ? 8 : 9);
                    c10130.m25423((CharSequence) objArr[iMo9712]);
                    this.f39038 = Integer.valueOf(c17249.f52882.m13375(c10130.m25444()));
                    break;
                    break;
                case 56:
                    int iMo1799 = ((InterfaceC1779) interfaceC22677).mo1790();
                    int iMo7930 = ((InterfaceC23651) interfaceC22677).mo7930();
                    String type = ((InterfaceC21699) ((InterfaceC10952) interfaceC22677).getReference()).getType();
                    int iIntValue = ((Number) objArr[iMo7930]).intValue();
                    type.getClass();
                    switch (type.hashCode()) {
                        case 2887:
                            if (!type.equals("[B")) {
                                b = -1;
                            }
                            break;
                        case 2888:
                            if (!type.equals("[C")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2894:
                            if (!type.equals("[I")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 2904:
                            if (!type.equals("[S")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            objArr[iMo1799] = new byte[iIntValue];
                            break;
                        case 1:
                            objArr[iMo1799] = new char[iIntValue];
                            break;
                        case 2:
                            objArr[iMo1799] = new int[iIntValue];
                            break;
                        case 3:
                            objArr[iMo1799] = new short[iIntValue];
                            break;
                        default:
                            throw new UnsupportedOperationException("new-array ".concat(type));
                    }
                    break;
                default:
                    throw new UnsupportedOperationException(enumC0841Mo3975.f3315);
            }
        }
        return objArr;
    }
}
