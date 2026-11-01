package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UA */
/* JADX INFO: loaded from: classes4.dex */
public final class C15954 extends AbstractC5050 implements InterfaceC10825, InterfaceC4790 {

    /* JADX INFO: renamed from: ۧ */
    public final C11996 f46176;

    /* JADX INFO: renamed from: ܽ */
    public final LinkedHashMap f46177;

    public C15954() {
        super(2);
        C11996 c11996 = new C11996();
        this.f46176 = c11996;
        this.f46177 = new LinkedHashMap();
        c11996.writeInt(67263238);
    }

    @Override // p067l.AbstractC5050, p067l.InterfaceC10825
    /* JADX INFO: renamed from: ֫ */
    public final void mo3627(C5187 c5187) {
        String strM48106 = c5187.m48106();
        String strM22565 = C9682.m22565(c5187);
        String str = strM22565;
        if (strM22565 == null) {
            str = strM48106;
        }
        if (strM48106.equals(str)) {
            for (C14574 c14574 : c5187.m48107()) {
                String strM26179 = C11262.m26179(c14574);
                if (strM26179 == null || strM26179.equals(c14574.m14973())) {
                }
            }
            for (C11893 c11893 : c5187.m48109()) {
                String strM261710 = C11262.m26179(c11893);
                if (strM261710 == null || strM261710.equals(c11893.m14973())) {
                }
            }
            return;
        }
        C11996 c11996 = this.f46176;
        c11996.writeByte(1);
        c11996.writeInt(m36214(strM48106));
        c11996.writeInt(m36214(str));
        c5187.m48095((InterfaceC4790) this);
        c5187.m48104(this);
    }

    @Override // p067l.AbstractC5050, p067l.InterfaceC4790
    /* JADX INFO: renamed from: ֫ */
    public final void mo5457(C5187 c5187, C14574 c14574) {
        String strM26179 = C11262.m26179(c14574);
        String strM14973 = c14574.m14973();
        if (strM26179 == null) {
            strM26179 = c14574.m14973();
        }
        if (strM26179.equals(strM14973)) {
            return;
        }
        C11996 c11996 = this.f46176;
        c11996.writeByte(2);
        c11996.writeInt(m36214(c14574.m14972().mo7686()));
        c11996.writeInt(m36214(strM14973));
        c11996.writeInt(m36214(strM26179));
    }

    @Override // p067l.AbstractC5050, p067l.InterfaceC4790
    /* JADX INFO: renamed from: ֫ */
    public final void mo5456(C5187 c5187, C11893 c11893) {
        String strM26179 = C11262.m26179(c11893);
        String strM14973 = c11893.m14973();
        if (strM26179 == null) {
            strM26179 = strM14973;
        }
        if (strM26179.equals(strM14973)) {
            return;
        }
        C11996 c11996 = this.f46176;
        c11996.writeByte(3);
        c11996.writeInt(m36214(c11893.m14972().mo7686()));
        c11996.writeInt(m36214(strM14973));
        c11996.writeInt(m36214(strM26179));
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m36216() {
        C11996 c11996 = this.f46176;
        int i = 0;
        c11996.writeByte(0);
        int size = c11996.size();
        LinkedHashMap linkedHashMap = this.f46177;
        c11996.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int i2 = i + 1;
            if (i != ((Integer) entry.getValue()).intValue()) {
                throw new RuntimeException();
            }
            c11996.m27443((CharSequence) entry.getKey());
            i = i2;
        }
        c11996.writeInt(size);
        c11996.writeInt(67263238);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36215(OutputStream outputStream) throws IOException {
        this.f46176.m27441(outputStream);
    }

    /* JADX INFO: renamed from: ܽ */
    private int m36214(String str) {
        LinkedHashMap linkedHashMap = this.f46177;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }
}
