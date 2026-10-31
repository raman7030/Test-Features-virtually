package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14295 extends AbstractC2821 implements InterfaceC8898, InterfaceC2548 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10130 f43084;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f43085;

    public C14295() {
        super(2);
        C10130 c10130 = new C10130();
        this.f43084 = c10130;
        this.f43085 = new LinkedHashMap();
        c10130.writeInt(67263238);
    }

    @Override // l.AbstractC2821, l.InterfaceC8898
    /* JADX INFO: renamed from: ֫ */
    public final void mo1225(C2966 c2966) {
        String strM45794 = c2966.m45794();
        String strM20585 = C7695.m20585(c2966);
        String str = strM20585;
        if (strM20585 == null) {
            str = strM45794;
        }
        if (strM45794.equals(str)) {
            for (C12843 c12843 : c2966.m45795()) {
                String strM24169 = C9358.m24169(c12843);
                if (strM24169 == null || strM24169.equals(c12843.m13109())) {
                }
            }
            for (C10022 c10022 : c2966.m45797()) {
                String strM241610 = C9358.m24169(c10022);
                if (strM241610 == null || strM241610.equals(c10022.m13109())) {
                }
            }
            return;
        }
        C10130 c10130 = this.f43084;
        c10130.writeByte(1);
        c10130.writeInt(m34081(strM45794));
        c10130.writeInt(m34081(str));
        c2966.m45783((InterfaceC2548) this);
        c2966.m45792(this);
    }

    @Override // l.AbstractC2821, l.InterfaceC2548
    /* JADX INFO: renamed from: ֫ */
    public final void mo3143(C2966 c2966, C12843 c12843) {
        String strM24169 = C9358.m24169(c12843);
        String strM13109 = c12843.m13109();
        if (strM24169 == null) {
            strM24169 = c12843.m13109();
        }
        if (strM24169.equals(strM13109)) {
            return;
        }
        C10130 c10130 = this.f43084;
        c10130.writeByte(2);
        c10130.writeInt(m34081(c12843.m13108().mo5456()));
        c10130.writeInt(m34081(strM13109));
        c10130.writeInt(m34081(strM24169));
    }

    @Override // l.AbstractC2821, l.InterfaceC2548
    /* JADX INFO: renamed from: ֫ */
    public final void mo3142(C2966 c2966, C10022 c10022) {
        String strM24169 = C9358.m24169(c10022);
        String strM13109 = c10022.m13109();
        if (strM24169 == null) {
            strM24169 = strM13109;
        }
        if (strM24169.equals(strM13109)) {
            return;
        }
        C10130 c10130 = this.f43084;
        c10130.writeByte(3);
        c10130.writeInt(m34081(c10022.m13108().mo5456()));
        c10130.writeInt(m34081(strM13109));
        c10130.writeInt(m34081(strM24169));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34083() {
        C10130 c10130 = this.f43084;
        int i = 0;
        c10130.writeByte(0);
        int size = c10130.size();
        LinkedHashMap linkedHashMap = this.f43085;
        c10130.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int i2 = i + 1;
            if (i != ((Integer) entry.getValue()).intValue()) {
                throw new RuntimeException();
            }
            c10130.m25423((CharSequence) entry.getKey());
            i = i2;
        }
        c10130.writeInt(size);
        c10130.writeInt(67263238);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34082(OutputStream outputStream) throws IOException {
        this.f43084.m25421(outputStream);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m34081(String str) {
        LinkedHashMap linkedHashMap = this.f43085;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }
}
