package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C1560 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f5510 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f5511 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f5512 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16376 f5513;

    public C1560(C16376 c16376) {
        this.f5513 = c16376;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5335() {
        while (!this.f5511.isEmpty() && ((C11480) this.f5511.get(0)).f34287.isEmpty()) {
            this.f5511.remove(0);
        }
        while (!this.f5511.isEmpty() && ((C11480) C18566.m43105(this.f5511, 1)).f34287.isEmpty()) {
            C18473.m42953(this.f5511, 1);
        }
        if (this.f5511.size() == 1 && ((C11480) this.f5511.get(0)).f34287.equals("nop")) {
            this.f5511.clear();
            return;
        }
        if (this.f5511.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f5510;
        arrayList.add(new C7246(this.f5513, arrayList.size(), this.f5511));
        this.f5511 = new ArrayList();
    }
}
