package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩹֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7JE */
/* JADX INFO: loaded from: classes.dex */
public final class C23260 {

    /* JADX INFO: renamed from: ֫ */
    public C23198[] f73097;

    /* JADX INFO: renamed from: ۧ */
    public String f73098;

    /* JADX INFO: renamed from: ֫ */
    public static C23260 m51799(String str) {
        if (str == null) {
            return null;
        }
        if (!str.contains(C0233a.f1084p) && !str.contains("<")) {
            return new C23260(str, null);
        }
        C20635 c20635M46634 = C20635.m46634("<string>" + str + "</string>", false);
        StringBuilder sb = new StringBuilder();
        LinkedList linkedList = new LinkedList();
        C13551.m30845(c20635M46634.m46639(), sb, linkedList);
        return new C23260(sb.toString(), linkedList.isEmpty() ? null : (C23198[]) linkedList.toArray(new C23198[0]));
    }

    public C23260(String str, C23198[] c23198Arr) {
        this.f73098 = str;
        this.f73097 = c23198Arr;
    }

    public C23260(InterfaceC5763 interfaceC5763) {
        this.f73098 = interfaceC5763.getValue();
        this.f73097 = interfaceC5763.mo12360();
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m51802() {
        String str = this.f73098;
        C23198[] c23198Arr = this.f73097;
        if (c23198Arr == null || c23198Arr.length == 0) {
            return str.replace(C0233a.f1084p, "&amp;").replace(">", "&gt;").replace("<", "&lt;");
        }
        C23948 c23948 = new C23948();
        C12588 c12588 = new C12588(false);
        c12588.setOutput(c23948);
        try {
            C11540.m26604(new C22590(c12588), str, c23198Arr);
            return c23948.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m51801() {
        return this.f73098;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23198[] m51800() {
        return this.f73097;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23260) {
            C23260 c23260 = (C23260) obj;
            if (this.f73098.equals(c23260.f73098) && Arrays.equals(this.f73097, c23260.f73097)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f73097) + (this.f73098.hashCode() * 31);
    }
}
