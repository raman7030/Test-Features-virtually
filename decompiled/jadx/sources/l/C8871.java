package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4ZK */
/* JADX INFO: loaded from: classes3.dex */
public final class C8871 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15925 f27008;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1109 f27009;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f27010 = new HashMap();

    public C8871(int i) {
        C1109 c1109 = new C1109(i);
        this.f27009 = c1109;
        this.f27008 = (C15925) c1109.f4044.get(0);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1109 m22919() {
        return this.f27009;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22911(String str) {
        HashMap map = this.f27010;
        C17337 c17337 = (C17337) map.get(str);
        if (c17337 != null) {
            if (c17337.m42098()) {
                throw new IllegalArgumentException("There is already a label with that name.");
            }
            ((C6754) this.f27008.m37705()).add(c17337);
        } else {
            C15925 c15925 = this.f27008;
            c15925.getClass();
            C17337 c17338 = new C17337();
            ((C6754) c15925.m37705()).add(c17338);
            map.put(str, c17338);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17337 m22916(String str) {
        HashMap map = this.f27010;
        C17337 c17337 = (C17337) map.get(str);
        if (c17337 != null) {
            return c17337;
        }
        C17337 c17338 = new C17337();
        map.put(str, c17338);
        return c17338;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22915(C23589 c23589, C17337 c17337, C17337 c17338, C17337 c17339) {
        this.f27009.m3810(c23589, c17337, c17338, c17339);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22914(C17337 c17337, C17337 c17338, C17337 c17339) {
        this.f27009.m3809(c17337, c17338, c17339);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22918(int i) {
        ((C6754) this.f27008.m37702()).add(new C22276(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22910(int i, C7382 c7382, C23589 c23589, C7382 c7383) {
        ((C6754) this.f27008.m37702()).add(new C13103(i, c7382, c23589, c7383));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22909(int i) {
        ((C6754) this.f27008.m37702()).add(new C15219(i));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22920(int i) {
        ((C6754) this.f27008.m37702()).add(new C4637(i));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22917() {
        ((C6754) this.f27008.m37702()).add(new C20160());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22908() {
        ((C6754) this.f27008.m37702()).add(new C21571());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22912(C7382 c7382) {
        ((C6754) this.f27008.m37702()).add(new C3226(c7382));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22913(AbstractC7479 abstractC7479) {
        C1109 c1109 = this.f27009;
        c1109.m3808(abstractC7479);
        this.f27008 = (C15925) C18566.m43105(c1109.f4044, 1);
    }
}
