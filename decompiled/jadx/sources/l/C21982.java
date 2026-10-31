package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩹֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7JE */
/* JADX INFO: loaded from: classes.dex */
public final class C21982 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21916[] f70386;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f70387;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21982 m49462(String str) {
        if (str == null) {
            return null;
        }
        if (!str.contains(a.p) && !str.contains("<")) {
            return new C21982(str, null);
        }
        C19220 c19220M44340 = C19220.m44340("<string>" + str + "</string>", false);
        StringBuilder sb = new StringBuilder();
        LinkedList linkedList = new LinkedList();
        C11766.m28798(c19220M44340.m44345(), sb, linkedList);
        return new C21982(sb.toString(), linkedList.isEmpty() ? null : (C21916[]) linkedList.toArray(new C21916[0]));
    }

    public C21982(String str, C21916[] c21916Arr) {
        this.f70387 = str;
        this.f70386 = c21916Arr;
    }

    public C21982(InterfaceC3571 interfaceC3571) {
        this.f70387 = interfaceC3571.getValue();
        this.f70386 = interfaceC3571.mo10322();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m49465() {
        String str = this.f70387;
        C21916[] c21916Arr = this.f70386;
        if (c21916Arr == null || c21916Arr.length == 0) {
            return str.replace(a.p, "&amp;").replace(">", "&gt;").replace("<", "&lt;");
        }
        C22706 c22706 = new C22706();
        C10753 c10753 = new C10753(false);
        c10753.setOutput(c22706);
        try {
            C9650.m24590(new C21277(c10753), str, c21916Arr);
            return c22706.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m49464() {
        return this.f70387;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21916[] m49463() {
        return this.f70386;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21982) {
            C21982 c21982 = (C21982) obj;
            if (this.f70387.equals(c21982.f70387) && Arrays.equals(this.f70386, c21982.f70386)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f70386) + (this.f70387.hashCode() * 31);
    }
}
