package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1KC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10522 {

    /* JADX INFO: renamed from: ۧ */
    public int f29119;

    /* JADX INFO: renamed from: ܳ */
    public C14690 f29120;

    /* JADX INFO: renamed from: ܽ */
    public C14690 f29121;

    /* JADX INFO: renamed from: ܿ */
    public C14690 f29122;

    /* JADX INFO: renamed from: ᩳ */
    public C14690 f29123;

    /* JADX INFO: renamed from: ᩻ */
    public int f29125;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f29118 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f29124 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public int f29117 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final void m24256(C11996 c11996) {
        c11996.writeByte(this.f29125);
        ArrayList<C14690> arrayList = this.f29118;
        c11996.mo15113(arrayList.size());
        for (C14690 c14690 : arrayList) {
            c11996.writeInt(c14690.f17145);
            c11996.writeInt(c14690.f17144);
        }
        ArrayList<C14690> arrayList2 = this.f29124;
        c11996.mo15113(arrayList2.size());
        for (C14690 c14691 : arrayList2) {
            c11996.writeInt(c14691.f17145);
            c11996.writeInt(c14691.f17144);
        }
        if (this.f29121 != null) {
            c11996.m27445(true);
            c11996.writeInt(this.f29121.f17145);
            c11996.writeInt(this.f29121.f17144);
            c11996.writeInt(this.f29123.f17145);
            c11996.writeInt(this.f29123.f17144);
        } else {
            c11996.writeByte(0);
        }
        if (this.f29122 != null) {
            c11996.m27445(true);
            c11996.writeInt(this.f29122.f17145);
            c11996.writeInt(this.f29122.f17144);
            c11996.writeInt(this.f29120.f17145);
            c11996.writeInt(this.f29120.f17144);
        } else {
            c11996.writeByte(0);
        }
        c11996.mo15113(this.f29117 + 1);
        c11996.writeInt(this.f29119);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24257(C14677 c14677) {
        this.f29125 = c14677.readByte();
        int iM33581 = c14677.m33581();
        ArrayList arrayList = this.f29118;
        arrayList.clear();
        for (int i = 0; i < iM33581; i++) {
            arrayList.add(new C14690(c14677.readInt(), c14677.readInt(), false));
        }
        int iM33582 = c14677.m33581();
        ArrayList arrayList2 = this.f29124;
        arrayList2.clear();
        for (int i2 = 0; i2 < iM33582; i2++) {
            arrayList2.add(new C14690(c14677.readInt(), c14677.readInt(), true));
        }
        if (c14677.m33585()) {
            this.f29121 = new C14690(c14677.readInt(), c14677.readInt(), false);
            this.f29123 = new C14690(c14677.readInt(), c14677.readInt(), true);
        } else {
            this.f29123 = null;
            this.f29121 = null;
        }
        if (c14677.m33585()) {
            this.f29122 = new C14690(c14677.readInt(), c14677.readInt(), false);
            this.f29120 = new C14690(c14677.readInt(), c14677.readInt(), true);
        } else {
            this.f29120 = null;
            this.f29122 = null;
        }
        this.f29117 = c14677.m33581() - 1;
        this.f29119 = c14677.readInt();
    }
}
