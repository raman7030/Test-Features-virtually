package p067l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۬ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes3.dex */
public final class C14750 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C14080 f42048;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f42045 = new HashMap(64);

    /* JADX INFO: renamed from: ᩳ */
    public final C16525 f42049 = new C16525(EnumC8055.f21261);

    /* JADX INFO: renamed from: ֫ */
    public int f42044 = 1;

    /* JADX INFO: renamed from: ܳ */
    public ArrayDeque f42046 = new ArrayDeque();

    /* JADX INFO: renamed from: ܽ */
    public String f42047 = null;

    public C14750(C14080 c14080) {
        this.f42048 = c14080;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m33698(C14750 c14750, InterfaceC22798 interfaceC22798) {
        AbstractC12224 abstractC12224M18989;
        ArrayDeque arrayDeque = c14750.f42046;
        C14080 c14080 = c14750.f42048;
        C14750 c14751 = c14080.f39897;
        Object objMo5861 = interfaceC22798.mo5861(c14080.f39894);
        HashMap map = c14750.f42045;
        Integer numValueOf = (Integer) map.get(objMo5861);
        if (numValueOf == null) {
            int i = c14750.f42044;
            c14750.f42044 = i + 1;
            numValueOf = Integer.valueOf(i);
            map.put(objMo5861, numValueOf);
            boolean zIsEmpty = arrayDeque.isEmpty();
            arrayDeque.addLast(interfaceC22798);
            if (zIsEmpty) {
                while (!arrayDeque.isEmpty()) {
                    InterfaceC22798 interfaceC22799 = (InterfaceC22798) arrayDeque.peekFirst();
                    C16525 c16525 = c14750.f42049;
                    int iMo3348 = interfaceC22799.mo3348();
                    switch (iMo3348) {
                        case 1:
                            AbstractC12224 abstractC12224 = (AbstractC12224) interfaceC22799;
                            c16525.m37500(iMo3348);
                            int iMo5098 = abstractC12224.mo5098();
                            byte[] bArr = new byte[iMo5098];
                            abstractC12224.m28203(0, bArr);
                            c16525.m37503(iMo5098);
                            c16525.m37501(0, iMo5098, bArr);
                            if (c14750.f42047 == null && iMo5098 > 65535) {
                                c14750.f42047 = new String(bArr);
                            }
                            break;
                        case 2:
                        case 13:
                        case 14:
                        default:
                            throw new AssertionError(C20778.m46922(iMo3348, "Unexpected constant tag: "));
                        case 3:
                            c16525.m37500(iMo3348);
                            c16525.m37504(((Integer) ((C3351) interfaceC22799).f6551).intValue());
                            break;
                        case 4:
                            c16525.m37500(iMo3348);
                            float fFloatValue = ((Float) ((C3351) interfaceC22799).f6551).floatValue();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
                            try {
                                new DataOutputStream(byteArrayOutputStream).writeFloat(fFloatValue);
                                c16525.m37501(0, 4, byteArrayOutputStream.toByteArray());
                            } catch (IOException unused) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 5:
                            c14750.f42044++;
                            c16525.m37500(iMo3348);
                            long jLongValue = ((Long) ((C3351) interfaceC22799).f6551).longValue();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8);
                            try {
                                new DataOutputStream(byteArrayOutputStream2).writeLong(jLongValue);
                                c16525.m37501(0, 8, byteArrayOutputStream2.toByteArray());
                            } catch (IOException unused2) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 6:
                            c14750.f42044++;
                            c16525.m37500(iMo3348);
                            double dDoubleValue = ((Double) ((C3351) interfaceC22799).f6551).doubleValue();
                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(8);
                            try {
                                new DataOutputStream(byteArrayOutputStream3).writeDouble(dDoubleValue);
                                c16525.m37501(0, 8, byteArrayOutputStream3.toByteArray());
                            } catch (IOException unused3) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 7:
                            AbstractC6462 abstractC6462 = (AbstractC6462) interfaceC22799;
                            if (abstractC6462.m14777(EnumC11353.ARRAY)) {
                                C5363 c5363 = c14080.f39896;
                                c5363.f12646.f48564 = 0;
                                c5363.mo10687(abstractC6462);
                                C16525 c16526 = c5363.f12646;
                                C8200 c8200 = c5363.f12647.f39895;
                                abstractC12224M18989 = c8200.f21738.mo17847(0, c16526.f48564, c16526.f48563);
                            } else {
                                abstractC12224M18989 = c14080.f39895.m18989(C19839.m45084(abstractC6462.f16705.mo18002()));
                            }
                            c16525.m37500(iMo3348);
                            c16525.m37503(m33698(c14751, abstractC12224M18989));
                            if (abstractC6462.m14777(EnumC11353.CLASS)) {
                                c14080.m31952((C15828) abstractC6462.f16705);
                            }
                            break;
                        case 8:
                            AbstractC12224 abstractC12224M32717 = c14080.f39895.f21738.m32717((String) ((C3351) interfaceC22799).f6551);
                            c16525.m37500(iMo3348);
                            c16525.m37503(m33698(c14751, abstractC12224M32717));
                            break;
                        case 9:
                        case 10:
                        case 11:
                            AbstractC7783 abstractC7783 = (AbstractC7783) interfaceC22799;
                            c16525.m37500(iMo3348);
                            c16525.m37503(c14080.m31949(((C15828) abstractC7783.f20407).f20406));
                            c16525.m37503(c14080.m31954(abstractC7783));
                            break;
                        case 12:
                            C16761 c16761 = (C16761) interfaceC22799;
                            c16525.m37500(iMo3348);
                            c16525.m37503(m33698(c14751, c16761.f49397));
                            c16525.m37503(c14080.m31953(c16761.f49398));
                            break;
                        case 15:
                            C17169 c17169 = (C17169) interfaceC22799;
                            c16525.m37500(iMo3348);
                            c16525.m37500(c17169.m38869());
                            c16525.m37503(m33698(c14751, c17169.mo9143()));
                            break;
                        case 16:
                            c16525.m37500(iMo3348);
                            c16525.m37503(c14080.m31953(((C12497) interfaceC22799).mo5302()));
                            break;
                        case 17:
                            C10465 c10465 = (C10465) interfaceC22799;
                            c16525.m37500(iMo3348);
                            c16525.m37503(C14080.m31945(c14080, c10465));
                            c16525.m37503(c14080.m31954(c10465));
                            break;
                        case 18:
                            C11136 c11136 = (C11136) interfaceC22799;
                            c16525.m37500(iMo3348);
                            c16525.m37503(C14080.m31945(c14080, c11136));
                            c16525.m37503(c14080.m31954(c11136));
                            break;
                        case 19:
                            int iM33698 = m33698(c14751, ((C2417) interfaceC22799).f20408);
                            c16525.m37500(19);
                            c16525.m37503(iM33698);
                            break;
                        case 20:
                            AbstractC12224 abstractC12224M189810 = c14080.f39895.m18989(C19839.m45084(((C9794) interfaceC22799).f27059));
                            c16525.m37500(iMo3348);
                            c16525.m37503(m33698(c14751, abstractC12224M189810));
                            break;
                    }
                    arrayDeque.removeFirst();
                }
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33699() {
        this.f42045.clear();
        this.f42044 = 1;
        this.f42046.clear();
        this.f42047 = null;
        this.f42049.f48564 = 0;
    }
}
