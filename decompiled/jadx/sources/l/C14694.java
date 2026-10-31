package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes4.dex */
public final class C14694 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11126 f44887;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f44888 = new HashMap();

    public C14694(byte[] bArr) {
        C16769 c16769 = new C16769(bArr);
        this.f44887 = c16769.m39451();
        ArrayList<C11126> arrayList = new ArrayList();
        while (true) {
            C11126 c11126M39451 = c16769.m39451();
            if (c11126M39451 == null) {
                break;
            } else {
                arrayList.add(c11126M39451);
            }
        }
        for (C11126 c11126 : arrayList) {
            this.f44888.put(c11126.m27608(), c11126);
        }
    }
}
