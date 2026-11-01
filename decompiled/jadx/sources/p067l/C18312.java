package p067l;

import java.io.DataInputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7CR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18312 extends AbstractC13599 {

    /* JADX INFO: renamed from: ۜۧ */
    public final boolean f54714;

    /* JADX INFO: renamed from: ᩻ۧ */
    public ArrayList f54715;

    public C18312(C19003 c19003, boolean z) {
        super(c19003);
        this.f54715 = null;
        this.f54714 = z;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final int m41746() {
        ArrayList arrayList = this.f54715;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final ArrayList get(int i) {
        return (ArrayList) this.f54715.get(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41745(DataInputStream dataInputStream) {
        byte b = dataInputStream.readByte();
        this.f38257.m48090("ParameterAnnotationData[%d]:", Integer.valueOf(b));
        this.f54715 = new ArrayList(b);
        for (int i = 0; i < b; i++) {
            short s = dataInputStream.readShort();
            this.f38257.m48090(" Param#[%d]: numAnnotations= %d", Integer.valueOf(i), Integer.valueOf(s));
            if (s > 0) {
                ArrayList arrayList = new ArrayList(s);
                for (int i2 = 0; i2 < s; i2++) {
                    C8493 c8493 = new C8493(this.f38259, this.f54714);
                    c8493.mo19750(dataInputStream);
                    arrayList.add(c8493);
                }
                this.f54715.add(i, arrayList);
            } else {
                this.f54715.add(i, null);
            }
        }
    }
}
