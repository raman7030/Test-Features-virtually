package l;

import java.io.DataInputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7CR */
/* JADX INFO: loaded from: classes5.dex */
public final class C16776 extends AbstractC11817 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final boolean f51532;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f51533;

    public C16776(C17503 c17503, boolean z) {
        super(c17503);
        this.f51533 = null;
        this.f51532 = z;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m39510() {
        ArrayList arrayList = this.f51533;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final ArrayList get(int i) {
        return (ArrayList) this.f51533.get(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39509(DataInputStream dataInputStream) {
        byte b = dataInputStream.readByte();
        this.f35255.m45778("ParameterAnnotationData[%d]:", Integer.valueOf(b));
        this.f51533 = new ArrayList(b);
        for (int i = 0; i < b; i++) {
            short s = dataInputStream.readShort();
            this.f35255.m45778(" Param#[%d]: numAnnotations= %d", Integer.valueOf(i), Integer.valueOf(s));
            if (s > 0) {
                ArrayList arrayList = new ArrayList(s);
                for (int i2 = 0; i2 < s; i2++) {
                    C6445 c6445 = new C6445(this.f35257, this.f51532);
                    c6445.mo17803(dataInputStream);
                    arrayList.add(c6445);
                }
                this.f51533.add(i, arrayList);
            } else {
                this.f51533.add(i, null);
            }
        }
    }
}
