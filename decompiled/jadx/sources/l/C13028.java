package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۬ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes3.dex */
public final class C13028 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12323 f39002;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f38999 = new HashMap(64);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14896 f39003 = new C14896(EnumC5983.f18409);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f38998 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f39000 = new ArrayDeque();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f39001 = null;

    public C13028(C12323 c12323) {
        this.f39002 = c12323;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31613(C13028 c13028, InterfaceC21496 interfaceC21496) {
        AbstractC10370 abstractC10370M17058;
        ArrayDeque arrayDeque = c13028.f39000;
        C12323 c12323 = c13028.f39002;
        C13028 c13029 = c12323.f36883;
        Object objMo3574 = interfaceC21496.mo3574(c12323.f36880);
        HashMap map = c13028.f38999;
        Integer numValueOf = (Integer) map.get(objMo3574);
        if (numValueOf == null) {
            int i = c13028.f38998;
            c13028.f38998 = i + 1;
            numValueOf = Integer.valueOf(i);
            map.put(objMo3574, numValueOf);
            boolean zIsEmpty = arrayDeque.isEmpty();
            arrayDeque.addLast(interfaceC21496);
            if (zIsEmpty) {
                while (!arrayDeque.isEmpty()) {
                    InterfaceC21496 interfaceC21497 = (InterfaceC21496) arrayDeque.peekFirst();
                    C14896 c14896 = c13028.f39003;
                    int iMo953 = interfaceC21497.mo953();
                    switch (iMo953) {
                        case 1:
                            AbstractC10370 abstractC10370 = (AbstractC10370) interfaceC21497;
                            c14896.m35348(iMo953);
                            int iMo2759 = abstractC10370.mo2759();
                            byte[] bArr = new byte[iMo2759];
                            abstractC10370.m26174(0, bArr);
                            c14896.m35351(iMo2759);
                            c14896.m35349(0, iMo2759, bArr);
                            if (c13028.f39001 == null && iMo2759 > 65535) {
                                c13028.f39001 = new String(bArr);
                            }
                            break;
                        case 2:
                        case 13:
                        case 14:
                        default:
                            throw new AssertionError(C19370.m44628(iMo953, "Unexpected constant tag: "));
                        case 3:
                            c14896.m35348(iMo953);
                            c14896.m35352(((Integer) ((C1034) interfaceC21497).f3779).intValue());
                            break;
                        case 4:
                            c14896.m35348(iMo953);
                            float fFloatValue = ((Float) ((C1034) interfaceC21497).f3779).floatValue();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
                            try {
                                new DataOutputStream(byteArrayOutputStream).writeFloat(fFloatValue);
                                c14896.m35349(0, 4, byteArrayOutputStream.toByteArray());
                            } catch (IOException unused) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 5:
                            c13028.f38998++;
                            c14896.m35348(iMo953);
                            long jLongValue = ((Long) ((C1034) interfaceC21497).f3779).longValue();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8);
                            try {
                                new DataOutputStream(byteArrayOutputStream2).writeLong(jLongValue);
                                c14896.m35349(0, 8, byteArrayOutputStream2.toByteArray());
                            } catch (IOException unused2) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 6:
                            c13028.f38998++;
                            c14896.m35348(iMo953);
                            double dDoubleValue = ((Double) ((C1034) interfaceC21497).f3779).doubleValue();
                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(8);
                            try {
                                new DataOutputStream(byteArrayOutputStream3).writeDouble(dDoubleValue);
                                c14896.m35349(0, 8, byteArrayOutputStream3.toByteArray());
                            } catch (IOException unused3) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 7:
                            AbstractC4308 abstractC4308 = (AbstractC4308) interfaceC21497;
                            if (abstractC4308.m12913(EnumC9454.ARRAY)) {
                                C3151 c3151 = c12323.f36882;
                                c3151.f9843.f45449 = 0;
                                c3151.mo8627(abstractC4308);
                                C14896 c14897 = c3151.f9843;
                                C6136 c6136 = c3151.f9844.f36881;
                                abstractC10370M17058 = c6136.f18880.mo15926(0, c14897.f45449, c14897.f45448);
                            } else {
                                abstractC10370M17058 = c12323.f36881.m17058(C18382.m42812(abstractC4308.f13890.mo16083()));
                            }
                            c14896.m35348(iMo953);
                            c14896.m35351(m31613(c13029, abstractC10370M17058));
                            if (abstractC4308.m12913(EnumC9454.CLASS)) {
                                c12323.m29892((C14163) abstractC4308.f13890);
                            }
                            break;
                        case 8:
                            AbstractC10370 abstractC10370M30652 = c12323.f36881.f18880.m30652((String) ((C1034) interfaceC21497).f3779);
                            c14896.m35348(iMo953);
                            c14896.m35351(m31613(c13029, abstractC10370M30652));
                            break;
                        case 9:
                        case 10:
                        case 11:
                            AbstractC5698 abstractC5698 = (AbstractC5698) interfaceC21497;
                            c14896.m35348(iMo953);
                            c14896.m35351(c12323.m29889(((C14163) abstractC5698.f17561).f17560));
                            c14896.m35351(c12323.m29894(abstractC5698));
                            break;
                        case 12:
                            C15144 c15144 = (C15144) interfaceC21497;
                            c14896.m35348(iMo953);
                            c14896.m35351(m31613(c13029, c15144.f46278));
                            c14896.m35351(c12323.m29893(c15144.f46279));
                            break;
                        case 15:
                            C15574 c15574 = (C15574) interfaceC21497;
                            c14896.m35348(iMo953);
                            c14896.m35348(c15574.m36708());
                            c14896.m35351(m31613(c13029, c15574.mo7048()));
                            break;
                        case 16:
                            c14896.m35348(iMo953);
                            c14896.m35351(c12323.m29893(((C10658) interfaceC21497).mo2973()));
                            break;
                        case 17:
                            C8520 c8520 = (C8520) interfaceC21497;
                            c14896.m35348(iMo953);
                            c14896.m35351(C12323.m29885(c12323, c8520));
                            c14896.m35351(c12323.m29894(c8520));
                            break;
                        case 18:
                            C9226 c9226 = (C9226) interfaceC21497;
                            c14896.m35348(iMo953);
                            c14896.m35351(C12323.m29885(c12323, c9226));
                            c14896.m35351(c12323.m29894(c9226));
                            break;
                        case 19:
                            int iM31613 = m31613(c13029, ((C0052) interfaceC21497).f17562);
                            c14896.m35348(19);
                            c14896.m35351(iM31613);
                            break;
                        case 20:
                            AbstractC10370 abstractC10370M17059 = c12323.f36881.m17058(C18382.m42812(((C7814) interfaceC21497).f24143));
                            c14896.m35348(iMo953);
                            c14896.m35351(m31613(c13029, abstractC10370M17059));
                            break;
                    }
                    arrayDeque.removeFirst();
                }
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31614() {
        this.f38999.clear();
        this.f38998 = 1;
        this.f39000.clear();
        this.f39001 = null;
        this.f39003.f45449 = 0;
    }
}
