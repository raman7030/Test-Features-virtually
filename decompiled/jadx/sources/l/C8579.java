package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1KC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8579 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f26202;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12965 f26203;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C12965 f26204;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12965 f26205;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C12965 f26206;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f26208;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f26201 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f26207 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26200 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22287(C10130 c10130) {
        c10130.writeByte(this.f26208);
        ArrayList<C12965> arrayList = this.f26201;
        c10130.mo13231(arrayList.size());
        for (C12965 c12965 : arrayList) {
            c10130.writeInt(c12965.f14318);
            c10130.writeInt(c12965.f14317);
        }
        ArrayList<C12965> arrayList2 = this.f26207;
        c10130.mo13231(arrayList2.size());
        for (C12965 c12966 : arrayList2) {
            c10130.writeInt(c12966.f14318);
            c10130.writeInt(c12966.f14317);
        }
        if (this.f26204 != null) {
            c10130.m25425(true);
            c10130.writeInt(this.f26204.f14318);
            c10130.writeInt(this.f26204.f14317);
            c10130.writeInt(this.f26206.f14318);
            c10130.writeInt(this.f26206.f14317);
        } else {
            c10130.writeByte(0);
        }
        if (this.f26205 != null) {
            c10130.m25425(true);
            c10130.writeInt(this.f26205.f14318);
            c10130.writeInt(this.f26205.f14317);
            c10130.writeInt(this.f26203.f14318);
            c10130.writeInt(this.f26203.f14317);
        } else {
            c10130.writeByte(0);
        }
        c10130.mo13231(this.f26200 + 1);
        c10130.writeInt(this.f26202);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22288(C12951 c12951) {
        this.f26208 = c12951.readByte();
        int iM31494 = c12951.m31494();
        ArrayList arrayList = this.f26201;
        arrayList.clear();
        for (int i = 0; i < iM31494; i++) {
            arrayList.add(new C12965(c12951.readInt(), c12951.readInt(), false));
        }
        int iM31495 = c12951.m31494();
        ArrayList arrayList2 = this.f26207;
        arrayList2.clear();
        for (int i2 = 0; i2 < iM31495; i2++) {
            arrayList2.add(new C12965(c12951.readInt(), c12951.readInt(), true));
        }
        if (c12951.m31498()) {
            this.f26204 = new C12965(c12951.readInt(), c12951.readInt(), false);
            this.f26206 = new C12965(c12951.readInt(), c12951.readInt(), true);
        } else {
            this.f26206 = null;
            this.f26204 = null;
        }
        if (c12951.m31498()) {
            this.f26205 = new C12965(c12951.readInt(), c12951.readInt(), false);
            this.f26203 = new C12965(c12951.readInt(), c12951.readInt(), true);
        } else {
            this.f26203 = null;
            this.f26205 = null;
        }
        this.f26200 = c12951.m31494() - 1;
        this.f26202 = c12951.readInt();
    }
}
