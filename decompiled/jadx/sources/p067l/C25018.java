package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes2.dex */
public final class C25018 extends AbstractC13599 {

    /* JADX INFO: renamed from: ᩻ۧ */
    public ArrayList f79867;

    /* JADX INFO: renamed from: ۧ */
    public final void m54926(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f38257.m48090(C20778.m46922(unsignedShort, "components="), new Object[0]);
        this.f79867 = new ArrayList(unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            ArrayList arrayList = this.f79867;
            C16300 c16300 = new C16300((C22161) this.f38259);
            c16300.f38254 = "RecordData";
            c16300.m37093(dataInputStream);
            arrayList.add(c16300);
        }
    }

    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        int size = this.f79867.size();
        if (size > 0) {
            boolean zM5729 = this.f32297.m5729();
            m26679(EnumC16818.f49610.m38127() + " {");
            for (int i = 0; i < size; i++) {
                C16300 c16300 = (C16300) this.f79867.get(i);
                c16300.f32298 = m26670() + this.f32298;
                c16300.m26678(1);
                if (!zM5729 || !mo26663()) {
                    c16300.mo6308(i, size);
                } else {
                    c16300.mo6308(i, size);
                }
            }
            m26679(C0249l.f1198d);
        }
    }
}
