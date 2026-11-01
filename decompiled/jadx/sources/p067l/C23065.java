package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89V */
/* JADX INFO: loaded from: classes.dex */
public final class C23065 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ᩶ */
    public final String f72467;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC20106 f72468;

    /* JADX INFO: renamed from: ᩹ */
    public final C13836 f72469;

    public C23065(C13836 c13836, InterfaceC20106 interfaceC20106, String str) {
        this.f72469 = c13836;
        this.f72468 = interfaceC20106;
        this.f72467 = str;
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9286(String str, long j, long j2) {
        return mo9291(j, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13836 m51455() {
        return this.f72469;
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ֫ */
    public final List mo9288(String str) {
        ArrayList arrayList = new ArrayList();
        C14642 c14642 = this.f72468.get(this.f72467 + str);
        try {
            InterfaceC7365 interfaceC7365M33447 = c14642.m33447();
            while (interfaceC7365M33447.hasNext()) {
                try {
                    arrayList.add(new C5650((InterfaceC12059) interfaceC7365M33447.next()));
                } catch (Throwable th) {
                    try {
                        interfaceC7365M33447.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            interfaceC7365M33447.close();
            if (str.length() == 1) {
                C7480.removeIf(arrayList, new C18895(1));
            }
            arrayList.trimToSize();
            c14642.close();
            return arrayList;
        } catch (Throwable th3) {
            try {
                c14642.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ܽ */
    public final void mo9293(long j, String str) throws C5255 {
        this.f72468.get(m51454(str)).m33452(j, j, j);
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ֫ */
    public final void mo9290(String str, boolean z) throws C5255 {
        this.f72468.get(m51454(str)).delete();
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ֫ */
    public final void mo9289(String str, String str2) throws C5255 {
        String strM51454 = m51454(str);
        InterfaceC20106 interfaceC20106 = this.f72468;
        interfaceC20106.get(strM51454).m33455(interfaceC20106.get(m51454(str2)));
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ܽ */
    public final void mo9294(String str) throws C5255 {
        this.f72468.get(m51454(str)).m33458();
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3678 mo9292(String str) {
        return new C10324(new C12513(this.f72468.get(m51454(str))));
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ۧ */
    public final InputStream mo9291(long j, String str) throws IOException {
        C11961 c11961 = new C11961(this.f72468.get(m51454(str)));
        if (j > 0 && c11961.skip(j) != j) {
            C2700.m4192(c11961);
            throw new IOException("SmbFileInputStream skip failed");
        }
        return new C17028(c11961);
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo9287(long j, String str) {
        return new C7937(this.f72468.get(m51454(str)));
    }

    /* JADX INFO: renamed from: ᩳ */
    private String m51454(String str) {
        boolean zStartsWith = str.startsWith("/");
        String str2 = this.f72467;
        return zStartsWith ? C17588.m40053(str2, str) : C24104.m53357(str2, "/", str);
    }
}
