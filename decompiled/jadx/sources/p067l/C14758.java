package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۬ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1WV */
/* JADX INFO: loaded from: classes3.dex */
public final class C14758 {

    /* JADX INFO: renamed from: ֫ */
    public C18762 f42083;

    /* JADX INFO: renamed from: ۧ */
    public Integer f42084;

    /* JADX INFO: renamed from: ܽ */
    public HashMap f42085 = new HashMap();

    public C14758(C18762 c18762) {
        this.f42083 = c18762;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX INFO: renamed from: ֫ */
    public final Object[] m33702(ArrayList arrayList, int i) throws C5351 {
        Object objM15275;
        Object objValueOf;
        Object[] objArr = new Object[i];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC23920 interfaceC23920 = (InterfaceC23920) it.next();
            EnumC3167 enumC3167Mo6217 = interfaceC23920.mo6217();
            int i2 = C5371.f12751[enumC3167Mo6217.ordinal()];
            byte b = 0;
            C18762 c18762 = this.f42083;
            HashMap map = this.f42085;
            switch (i2) {
                case 1:
                case 2:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = ((InterfaceC16954) ((InterfaceC12777) interfaceC23920).getReference()).getString();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((InterfaceC15202) interfaceC23920).mo7161());
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    int iMo4189 = ((InterfaceC4059) interfaceC23920).mo4189();
                    long jMo7162 = ((InterfaceC11436) interfaceC23920).mo7162();
                    objArr[iMo4189] = Integer.valueOf((int) (jMo7162 & 4294967295L));
                    objArr[iMo4189 + 1] = Integer.valueOf((int) ((jMo7162 >>> 32) & 4294967295L));
                    break;
                case 11:
                    InterfaceC20309 interfaceC20309 = (InterfaceC20309) ((InterfaceC12777) interfaceC23920).getReference();
                    if (!interfaceC20309.getType().equals("[S")) {
                        throw new UnsupportedOperationException("sget-object " + interfaceC20309.getType());
                    }
                    String string = interfaceC20309.toString();
                    if (map.containsKey(string)) {
                        objM15275 = map.get(string);
                    } else {
                        objM15275 = c18762.f56064.m15275(AbstractC24797.m54478(interfaceC20309.mo10231()), interfaceC20309.getName());
                        map.put(string, objM15275);
                    }
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = objM15275;
                    break;
                    break;
                case 12:
                    InterfaceC20309 interfaceC203010 = (InterfaceC20309) ((InterfaceC12777) interfaceC23920).getReference();
                    if (!interfaceC203010.getType().equals("I")) {
                        throw new UnsupportedOperationException("sget " + interfaceC203010.getType());
                    }
                    String string2 = interfaceC203010.toString();
                    if (map.containsKey(string2)) {
                        objValueOf = map.get(string2);
                    } else {
                        objValueOf = Integer.valueOf(c18762.f56064.m15276(AbstractC24797.m54478(interfaceC203010.mo10231()), interfaceC203010.getName()));
                        map.put(string2, objValueOf);
                    }
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = objValueOf;
                    break;
                    break;
                case 13:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Array.get(objArr[((InterfaceC24846) interfaceC23920).mo9978()], ((Number) objArr[((InterfaceC16128) interfaceC23920).mo9979()]).intValue());
                    break;
                case 14:
                case 15:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() + ((InterfaceC15202) interfaceC23920).mo7161());
                    break;
                case 16:
                case 17:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() - ((InterfaceC15202) interfaceC23920).mo7161());
                    break;
                case 18:
                case 19:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() * ((InterfaceC15202) interfaceC23920).mo7161());
                    break;
                case 20:
                case 21:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() / ((InterfaceC15202) interfaceC23920).mo7161());
                    break;
                case 22:
                case 23:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() % ((InterfaceC15202) interfaceC23920).mo7161());
                    break;
                case 24:
                case 25:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((InterfaceC15202) interfaceC23920).mo7161() & ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 26:
                case 27:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((InterfaceC15202) interfaceC23920).mo7161() | ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 28:
                case 29:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((InterfaceC15202) interfaceC23920).mo7161() ^ ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 30:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() << ((InterfaceC15202) interfaceC23920).mo7161());
                    break;
                case 31:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() >> ((InterfaceC15202) interfaceC23920).mo7161());
                    break;
                case 32:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() >>> ((InterfaceC15202) interfaceC23920).mo7161());
                    break;
                case 33:
                    int iMo41810 = ((InterfaceC4059) interfaceC23920).mo4189();
                    objArr[iMo41810] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() + ((Number) objArr[iMo41810]).intValue());
                    break;
                case 34:
                    int iMo41811 = ((InterfaceC4059) interfaceC23920).mo4189();
                    objArr[iMo41811] = Integer.valueOf(((Number) objArr[iMo41811]).intValue() - ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 35:
                    int iMo41812 = ((InterfaceC4059) interfaceC23920).mo4189();
                    objArr[iMo41812] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() * ((Number) objArr[iMo41812]).intValue());
                    break;
                case 36:
                    int iMo41813 = ((InterfaceC4059) interfaceC23920).mo4189();
                    objArr[iMo41813] = Integer.valueOf(((Number) objArr[iMo41813]).intValue() / ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 37:
                    int iMo41814 = ((InterfaceC4059) interfaceC23920).mo4189();
                    objArr[iMo41814] = Integer.valueOf(((Number) objArr[iMo41814]).intValue() % ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 38:
                    int iMo41815 = ((InterfaceC4059) interfaceC23920).mo4189();
                    objArr[iMo41815] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() & ((Number) objArr[iMo41815]).intValue());
                    break;
                case 39:
                    int iMo41816 = ((InterfaceC4059) interfaceC23920).mo4189();
                    objArr[iMo41816] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() | ((Number) objArr[iMo41816]).intValue());
                    break;
                case 40:
                    int iMo41817 = ((InterfaceC4059) interfaceC23920).mo4189();
                    objArr[iMo41817] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() ^ ((Number) objArr[iMo41817]).intValue());
                    break;
                case 41:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC16128) interfaceC23920).mo9979()]).intValue() + ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 42:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() - ((Number) objArr[((InterfaceC16128) interfaceC23920).mo9979()]).intValue());
                    break;
                case 43:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC16128) interfaceC23920).mo9979()]).intValue() * ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 44:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() / ((Number) objArr[((InterfaceC16128) interfaceC23920).mo9979()]).intValue());
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue() % ((Number) objArr[((InterfaceC16128) interfaceC23920).mo9979()]).intValue());
                    break;
                case 46:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC16128) interfaceC23920).mo9979()]).intValue() & ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 47:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC16128) interfaceC23920).mo9979()]).intValue() | ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 48:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = Integer.valueOf(((Number) objArr[((InterfaceC16128) interfaceC23920).mo9979()]).intValue() ^ ((Number) objArr[((InterfaceC24846) interfaceC23920).mo9978()]).intValue());
                    break;
                case 49:
                case 50:
                case 51:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = objArr[((InterfaceC24846) interfaceC23920).mo9978()];
                    break;
                case 52:
                case 53:
                    objArr[((InterfaceC4059) interfaceC23920).mo4189()] = this.f42084;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    int iMo11756 = interfaceC23920 instanceof InterfaceC18140 ? ((InterfaceC18140) interfaceC23920).mo11756() : ((InterfaceC11851) interfaceC23920).mo5885();
                    InterfaceC7568 interfaceC7568 = (InterfaceC7568) ((InterfaceC12777) interfaceC23920).getReference();
                    if (!interfaceC7568.mo5855().equals("I") || interfaceC7568.mo5852().size() != 1 || !(objArr[iMo11756] instanceof String)) {
                        throw new UnsupportedOperationException(enumC3167Mo6217.f6089 + " " + interfaceC7568);
                    }
                    C11996 c11996 = new C11996();
                    c11996.m27443((CharSequence) AbstractC24797.m54478(interfaceC7568.mo5853()));
                    c11996.m27443((CharSequence) interfaceC7568.getName());
                    c11996.writeByte(1);
                    c11996.writeByte(((CharSequence) interfaceC7568.mo5852().get(0)).equals("Ljava/lang/String;") ? 8 : 9);
                    c11996.m27443((CharSequence) objArr[iMo11756]);
                    this.f42084 = Integer.valueOf(c18762.f56064.m15263(c11996.m27464()));
                    break;
                    break;
                case 56:
                    int iMo41818 = ((InterfaceC4059) interfaceC23920).mo4189();
                    int iMo9978 = ((InterfaceC24846) interfaceC23920).mo9978();
                    String type = ((InterfaceC22991) ((InterfaceC12777) interfaceC23920).getReference()).getType();
                    int iIntValue = ((Number) objArr[iMo9978]).intValue();
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
                            objArr[iMo41818] = new byte[iIntValue];
                            break;
                        case 1:
                            objArr[iMo41818] = new char[iIntValue];
                            break;
                        case 2:
                            objArr[iMo41818] = new int[iIntValue];
                            break;
                        case 3:
                            objArr[iMo41818] = new short[iIntValue];
                            break;
                        default:
                            throw new UnsupportedOperationException("new-array ".concat(type));
                    }
                    break;
                default:
                    throw new UnsupportedOperationException(enumC3167Mo6217.f6089);
            }
        }
        return objArr;
    }
}
