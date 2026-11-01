package p067l;

import java.io.IOException;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩶ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6SD */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21720 implements InterfaceC10740, InterfaceC22339 {
    /* JADX INFO: renamed from: ֫ */
    public static int m49003(int i, int i2, String str) {
        return (C12826.hashCode(str) + i) * i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m49005(String str, int i, String str2, String str3, int i2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    @Override // p067l.InterfaceC10740
    /* JADX INFO: renamed from: ֫ */
    public String mo24739(String str) {
        try {
            InterfaceC6694[] interfaceC6694ArrM25709 = ((RunnableC11152) C18959.m43083().mo29601()).m25709(str);
            if (interfaceC6694ArrM25709.length > 0) {
                return interfaceC6694ArrM25709[0].mo3411();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        return new TreeSet();
    }
}
