package l;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: FATD */
/* JADX INFO: loaded from: classes4.dex */
public final class C21558 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C10678 f69271 = C10678.m26789(new File(C16293.f50110.m36526("axmls").mo23554()), 26101061, 1, 2097152);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m48712(String str) {
        try {
            C1505 c1505M26800 = f69271.m26800(str);
            if (c1505M26800 != null) {
                return C23852.m52567(c1505M26800.m5185(0)).mo12306();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48711(String str, byte[] bArr) {
        C13680 c13680M26796 = null;
        try {
            c13680M26796 = f69271.m26796(str);
            if (c13680M26796 == null) {
                return;
            }
            InterfaceC10405 interfaceC10405M52568 = C23852.m52568(c13680M26796.m32917(0));
            interfaceC10405M52568.write(bArr);
            interfaceC10405M52568.close();
            c13680M26796.m32919();
        } catch (IOException unused) {
            if (c13680M26796 != null) {
                try {
                    c13680M26796.m32918();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
