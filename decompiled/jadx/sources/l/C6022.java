package l;

import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes2.dex */
public final class C6022 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16846(C11940 c11940) {
        C3364.f10650 = c11940;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16849(boolean z) {
        C3364.f10648 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16848(C19370 c19370) {
        C3364.f10649 = c19370;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16847(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, C11667 c11667, InterfaceC13077 interfaceC13077) {
        C3545 entry;
        AbstractC13262 abstractC13262M28557 = c11667.m28557();
        EnumC8139 enumC8139M28555 = c11667.m28555();
        String strM28558 = c11667.m28558();
        boolean zM28556 = c11667.m28556();
        try {
            boolean z = enumC8139M28555.f25125;
            boolean z2 = enumC8139M28555.f25126;
            boolean z3 = enumC8139M28555.f25124;
            if (!z && !z2 && !z3) {
                throw new RuntimeException();
            }
            if (!z2 && !z3) {
                C18090 c18090 = new C18090(abstractC15440);
                try {
                    if (!c18090.m42209() && (entry = c18090.getEntry("AndroidManifest.xml")) != null && C22263.m49985(C15206.m35970(c18090.m42189(entry))) >= 30) {
                        z2 = true;
                    }
                    c18090.close();
                } catch (Throwable th) {
                    try {
                        c18090.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            boolean z4 = z2;
            if (z) {
                if ((z4 || z3) && interfaceC13077 != null) {
                    interfaceC13077 = new C12372(interfaceC13077);
                }
                C3364.m10285(abstractC15440, abstractC15441, abstractC13262M28557, strM28558, z4, z3, interfaceC13077);
            } else {
                if (interfaceC13077 != null) {
                    C10256 c10256 = new C10256(interfaceC13077);
                    interfaceC13077.mo13118(z4, z3);
                    c10256.f37102 = false;
                    interfaceC13077 = c10256;
                }
                if (zM28556) {
                    C23411 c23411M36513 = abstractC15440.m36513("r");
                    try {
                        if (new C18929(c23411M36513).m43698()) {
                            throw new C1637(R.string.MT_Protector);
                        }
                        c23411M36513.close();
                        InputStream inputStreamMo27926 = abstractC15440.mo27926();
                        try {
                            OutputStream outputStreamMo23555 = abstractC15441.mo23555(false);
                            try {
                                C23825 c23825 = new C23825(abstractC15440.mo23127(), interfaceC13077);
                                byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                                while (true) {
                                    int i = inputStreamMo27926.read(bArr);
                                    if (i == -1) {
                                        if (outputStreamMo23555 != null) {
                                            outputStreamMo23555.close();
                                        }
                                        inputStreamMo27926.close();
                                        break;
                                    }
                                    outputStreamMo23555.write(bArr, 0, i);
                                    c23825.m52515(i);
                                    if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                                        outputStreamMo23555.close();
                                        inputStreamMo27926.close();
                                        abstractC13262M28557.mo14000();
                                        return;
                                    }
                                    if (inputStreamMo27926 != null) {
                                        try {
                                            inputStreamMo27926.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                if (outputStreamMo23555 != null) {
                                    try {
                                        outputStreamMo23555.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            if (inputStreamMo27926 != null) {
                                inputStreamMo27926.close();
                            }
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        try {
                            c23411M36513.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                    abstractC13262M28557.mo14000();
                    throw th;
                }
                C3364.m10284(abstractC15440, abstractC15441, interfaceC13077);
            }
            if (interfaceC13077 == null || !interfaceC13077.mo1526()) {
                if (z4 || z3) {
                    C9757.m24738(abstractC15441, abstractC13262M28557, z4, z3, interfaceC13077);
                }
                abstractC13262M28557.mo14000();
                return;
            }
            abstractC13262M28557.mo14000();
        } catch (Throwable th9) {
            abstractC13262M28557.mo14000();
            throw th9;
        }
    }
}
