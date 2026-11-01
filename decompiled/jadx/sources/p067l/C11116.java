package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: l.ۡ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J9W9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11116 implements InterfaceC9515 {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f30831 = false;

    /* JADX INFO: renamed from: ᩹ */
    public final HashMap f30833 = new HashMap();

    /* JADX INFO: renamed from: ᩸ */
    public final LinkedBlockingQueue f30832 = new LinkedBlockingQueue();

    @Override // p067l.InterfaceC9515
    /* JADX INFO: renamed from: ֫ */
    public final synchronized InterfaceC4410 mo20015(String str) {
        C11787 c11787;
        c11787 = (C11787) this.f30833.get(str);
        if (c11787 == null) {
            c11787 = new C11787(str, this.f30832, this.f30831);
            this.f30833.put(str, c11787);
        }
        return c11787;
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m25639() {
        return new ArrayList(this.f30833.values());
    }

    /* JADX INFO: renamed from: ۧ */
    public final LinkedBlockingQueue m25638() {
        return this.f30832;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m25640() {
        this.f30831 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25637() {
        this.f30833.clear();
        this.f30832.clear();
    }
}
