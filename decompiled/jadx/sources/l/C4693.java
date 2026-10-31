package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C30H */
/* JADX INFO: loaded from: classes2.dex */
public final class C4693 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f14913 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f14914 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3282 m13768() {
        return new C3282(this.f14913, this.f14914);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13769(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str2 == null) {
            throw new NullPointerException("value == null");
        }
        this.f14913.add(C11749.m28757(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
        this.f14914.add(C11749.m28757(str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
    }
}
