package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1KY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7507 implements InterfaceC2812 {

    /* JADX INFO: renamed from: ֫ */
    public int f19713;

    /* JADX INFO: renamed from: ۜ */
    public int f19714;

    /* JADX INFO: renamed from: ۧ */
    public int f19715;

    /* JADX INFO: renamed from: ܳ */
    public int f19716;

    /* JADX INFO: renamed from: ܽ */
    public int f19717;

    /* JADX INFO: renamed from: ܿ */
    public List f19718;

    /* JADX INFO: renamed from: ᩳ */
    public int f19719;

    /* JADX INFO: renamed from: ᩷ */
    public int f19720;

    /* JADX INFO: renamed from: ᩻ */
    public int f19721;

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ֫ */
    public final int mo17389(boolean z) {
        return z ? mo17398() : mo17396();
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ܽ */
    public final int mo17394(boolean z) {
        return z ? mo17388() : mo17400();
    }

    public C7507(InterfaceC2812 interfaceC2812, List list) {
        this(interfaceC2812.mo4445(), interfaceC2812.mo4443(), interfaceC2812.mo4448(), interfaceC2812.mo4452(), interfaceC2812.mo17398(), interfaceC2812.mo17388(), interfaceC2812.mo17396(), interfaceC2812.mo17400(), list);
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ۧ */
    public final void mo17392(int i, boolean z) {
        if (z) {
            mo17397(i);
        } else {
            mo17393(i);
        }
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ۧ */
    public final int mo4446(boolean z) {
        return z ? mo4445() : mo4448();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public C7507(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list) {
        this.f19716 = i;
        this.f19713 = i2;
        this.f19721 = i3;
        this.f19715 = i4;
        this.f19714 = i5;
        this.f19717 = i6;
        this.f19720 = i7;
        this.f19719 = i8;
        int i9 = i6 - i5;
        int i10 = i8 - i7;
        if (list != null) {
            int size = list.size();
            if (size == 0) {
                list = null;
            } else if (size == 1) {
                InterfaceC20248 interfaceC20248 = (InterfaceC20248) list.get(0);
                if (interfaceC20248.mo17398() == 0 && interfaceC20248.mo17396() == 0 && interfaceC20248.mo17388() == i9 && interfaceC20248.mo17400() == i10) {
                    list = null;
                }
            }
        }
        this.f19718 = list;
        if (this.f19716 == this.f19713 && this.f19721 == this.f19715) {
            System.err.println("LineFragmentImpl should not be empty: " + toString());
        }
        if (this.f19716 > this.f19713 || this.f19721 > this.f19715 || this.f19714 > this.f19717 || this.f19720 > this.f19719) {
            System.err.println("LineFragmentImpl is invalid: " + toString());
        }
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ᩳ */
    public final int mo4450(boolean z) {
        return z ? mo4443() : mo4452();
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17399(int i, boolean z) {
        if (z) {
            mo17395(i);
        } else {
            mo17391(i);
        }
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ֫ */
    public final void mo4441(int i, boolean z) {
        if (z) {
            mo4444(i);
        } else {
            mo4453(i);
        }
    }

    public C7507(C14677 c14677) {
        this.f19716 = c14677.readInt();
        this.f19713 = c14677.readInt();
        this.f19721 = c14677.readInt();
        this.f19715 = c14677.readInt();
        this.f19714 = c14677.readInt();
        this.f19717 = c14677.readInt();
        this.f19720 = c14677.readInt();
        this.f19719 = c14677.readInt();
        if (c14677.m33585()) {
            int i = c14677.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C20919(c14677));
            }
            this.f19718 = arrayList;
        }
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ۧ */
    public final int mo4445() {
        return this.f19716;
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ۜ */
    public final int mo4443() {
        return this.f19713;
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ܽ */
    public final int mo4448() {
        return this.f19721;
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4452() {
        return this.f19715;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ᩳ */
    public final int mo17398() {
        return this.f19714;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ֫ */
    public final int mo17388() {
        return this.f19717;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ܿ */
    public final int mo17396() {
        return this.f19720;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ᩻ */
    public final int mo17400() {
        return this.f19719;
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ܽ */
    public final void mo4449(int i, boolean z) {
        if (z) {
            this.f19716 = i;
        } else {
            this.f19721 = i;
        }
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4451(int i) {
        this.f19716 = i;
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ۜ */
    public final void mo4444(int i) {
        this.f19713 = i;
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ֫ */
    public final void mo4440(int i) {
        this.f19721 = i;
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ᩻ */
    public final void mo4453(int i) {
        this.f19715 = i;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ܿ */
    public final void mo17397(int i) {
        this.f19714 = i;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ܽ */
    public final void mo17395(int i) {
        this.f19717 = i;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ܳ */
    public final void mo17393(int i) {
        this.f19720 = i;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ۧ */
    public final void mo17391(int i) {
        this.f19719 = i;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ֫ */
    public final void mo17390(C11996 c11996) {
        c11996.writeInt(this.f19716);
        c11996.writeInt(this.f19713);
        c11996.writeInt(this.f19721);
        c11996.writeInt(this.f19715);
        c11996.writeInt(this.f19714);
        c11996.writeInt(this.f19717);
        c11996.writeInt(this.f19720);
        c11996.writeInt(this.f19719);
        if (this.f19718 == null) {
            c11996.writeByte(0);
            return;
        }
        c11996.m27445(true);
        c11996.writeInt(this.f19718.size());
        Iterator it = this.f19718.iterator();
        while (it.hasNext()) {
            ((InterfaceC20248) it.next()).mo17390(c11996);
        }
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ܳ */
    public final List mo4447() {
        return this.f19718;
    }

    @Override // p067l.InterfaceC2812
    /* JADX INFO: renamed from: ֫ */
    public final void mo4442(List list) {
        this.f19718 = list;
    }

    public final String toString() {
        return "LineFragmentImpl: Lines [" + this.f19716 + ", " + this.f19713 + ") - [" + this.f19721 + ", " + this.f19715 + "); Offsets [" + this.f19714 + ", " + this.f19717 + ") - [" + this.f19720 + ", " + this.f19719 + "); Inner " + this.f19718;
    }
}
