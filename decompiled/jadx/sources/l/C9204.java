package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: l.ۡ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J9W9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9204 implements InterfaceC7520 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f27885 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f27887 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f27886 = new LinkedBlockingQueue();

    @Override // l.InterfaceC7520
    /* JADX INFO: renamed from: ֫ */
    public final synchronized InterfaceC2148 mo18065(String str) {
        C9910 c9910;
        c9910 = (C9910) this.f27887.get(str);
        if (c9910 == null) {
            c9910 = new C9910(str, this.f27886, this.f27885);
            this.f27887.put(str, c9910);
        }
        return c9910;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m23640() {
        return new ArrayList(this.f27887.values());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue m23639() {
        return this.f27886;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m23641() {
        this.f27885 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23638() {
        this.f27887.clear();
        this.f27886.clear();
    }
}
