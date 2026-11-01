package p067l;

import bin.p000mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes2.dex */
public final class C8092 {
    /* JADX INFO: renamed from: ֫ */
    public static void m18774(C13717 c13717) {
        C5566.f13458 = c13717;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18777(boolean z) {
        C5566.f13456 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18776(C20778 c20778) {
        C5566.f13457 = c20778;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static void m18775(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, C13457 c13457, InterfaceC14797 interfaceC14797) {
        C5738 entry;
        AbstractC14973 abstractC14973M30605 = c13457.m30605();
        EnumC10104 enumC10104M30603 = c13457.m30603();
        String strM30606 = c13457.m30606();
        boolean zM30604 = c13457.m30604();
        try {
            boolean z = enumC10104M30603.f28038;
            boolean z2 = enumC10104M30603.f28039;
            boolean z3 = enumC10104M30603.f28037;
            if (!z && !z2 && !z3) {
                throw new RuntimeException();
            }
            if (!z2 && !z3) {
                C19561 c19561 = new C19561(abstractC17043);
                try {
                    if (!c19561.m44468() && (entry = c19561.getEntry("AndroidManifest.xml")) != null && C23527.m52313(C16820.m38130(c19561.m44448(entry))) >= 30) {
                        z2 = true;
                    }
                    c19561.close();
                } catch (Throwable th) {
                    try {
                        c19561.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            boolean z4 = z2;
            if (z) {
                if ((z4 || z3) && interfaceC14797 != null) {
                    interfaceC14797 = new C14127(interfaceC14797);
                }
                C5566.m12322(abstractC17043, abstractC17044, abstractC14973M30605, strM30606, z4, z3, interfaceC14797);
            } else {
                if (interfaceC14797 != null) {
                    C12116 c12116 = new C12116(interfaceC14797);
                    interfaceC14797.mo14982(z4, z3);
                    c12116.f40118 = false;
                    interfaceC14797 = c12116;
                }
                if (zM30604) {
                    C24618 c24618M38671 = abstractC17043.m38671("r");
                    try {
                        if (new C20359(c24618M38671).m45964()) {
                            throw new C3924(R.string.MT_Protector);
                        }
                        c24618M38671.close();
                        InputStream inputStreamMo29987 = abstractC17043.mo29987();
                        try {
                            OutputStream outputStreamMo25506 = abstractC17044.mo25506(false);
                            try {
                                C25012 c25012 = new C25012(abstractC17043.mo25101(), interfaceC14797);
                                byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                                while (true) {
                                    int i = inputStreamMo29987.read(bArr);
                                    if (i == -1) {
                                        if (outputStreamMo25506 != null) {
                                            outputStreamMo25506.close();
                                        }
                                        inputStreamMo29987.close();
                                        break;
                                    }
                                    outputStreamMo25506.write(bArr, 0, i);
                                    c25012.m54924(i);
                                    if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                                        outputStreamMo25506.close();
                                        inputStreamMo29987.close();
                                        abstractC14973M30605.mo15880();
                                        return;
                                    }
                                    if (inputStreamMo29987 != null) {
                                        try {
                                            inputStreamMo29987.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                if (outputStreamMo25506 != null) {
                                    try {
                                        outputStreamMo25506.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            if (inputStreamMo29987 != null) {
                                inputStreamMo29987.close();
                            }
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        try {
                            c24618M38671.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                    abstractC14973M30605.mo15880();
                    throw th;
                }
                C5566.m12321(abstractC17043, abstractC17044, interfaceC14797);
            }
            if (interfaceC14797 == null || !interfaceC14797.mo3924()) {
                if (z4 || z3) {
                    C11642.m26752(abstractC17044, abstractC14973M30605, z4, z3, interfaceC14797);
                }
                abstractC14973M30605.mo15880();
                return;
            }
            abstractC14973M30605.mo15880();
        } catch (Throwable th9) {
            abstractC14973M30605.mo15880();
            throw th9;
        }
    }
}
