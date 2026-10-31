package l;

import java.io.IOException;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩶ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6SD */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20361 implements InterfaceC8808, InterfaceC21013 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46680(int i, int i2, String str) {
        return (C11003.hashCode(str) + i) * i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m46682(String str, int i, String str2, String str3, int i2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    @Override // l.InterfaceC8808
    /* JADX INFO: renamed from: ֫ */
    public String mo22769(String str) {
        try {
            InterfaceC4551[] interfaceC4551ArrM23709 = ((RunnableC9242) C17456.m40825().mo27539()).m23709(str);
            if (interfaceC4551ArrM23709.length > 0) {
                return interfaceC4551ArrM23709[0].mo1015();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        return new TreeSet();
    }
}
