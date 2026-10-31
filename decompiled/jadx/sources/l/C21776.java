package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89V */
/* JADX INFO: loaded from: classes.dex */
public final class C21776 implements InterfaceC2188 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f69759;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC18663 f69760;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12066 f69761;

    public C21776(C12066 c12066, InterfaceC18663 interfaceC18663, String str) {
        this.f69761 = c12066;
        this.f69760 = interfaceC18663;
        this.f69759 = str;
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo7207(String str, long j, long j2) {
        return mo7212(j, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12066 m49105() {
        return this.f69761;
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ֫ */
    public final List mo7209(String str) {
        ArrayList arrayList = new ArrayList();
        C12914 c12914 = this.f69760.get(this.f69759 + str);
        try {
            InterfaceC5257 interfaceC5257M31361 = c12914.m31361();
            while (interfaceC5257M31361.hasNext()) {
                try {
                    arrayList.add(new C3452((InterfaceC10196) interfaceC5257M31361.next()));
                } catch (Throwable th) {
                    try {
                        interfaceC5257M31361.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            interfaceC5257M31361.close();
            if (str.length() == 1) {
                C5378.removeIf(arrayList, new C17389(1));
            }
            arrayList.trimToSize();
            c12914.close();
            return arrayList;
        } catch (Throwable th3) {
            try {
                c12914.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ܽ */
    public final void mo7214(long j, String str) throws C3037 {
        this.f69760.get(m49104(str)).m31366(j, j, j);
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ֫ */
    public final void mo7211(String str, boolean z) throws C3037 {
        this.f69760.get(m49104(str)).delete();
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ֫ */
    public final void mo7210(String str, String str2) throws C3037 {
        String strM49104 = m49104(str);
        InterfaceC18663 interfaceC18663 = this.f69760;
        interfaceC18663.get(strM49104).m31369(interfaceC18663.get(m49104(str2)));
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ܽ */
    public final void mo7215(String str) throws C3037 {
        this.f69760.get(m49104(str)).m31372();
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1377 mo7213(String str) {
        return new C8370(new C10674(this.f69760.get(m49104(str))));
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ۧ */
    public final InputStream mo7212(long j, String str) throws IOException {
        C10093 c10093 = new C10093(this.f69760.get(m49104(str)));
        if (j > 0 && c10093.skip(j) != j) {
            C0349.m1793(c10093);
            throw new IOException("SmbFileInputStream skip failed");
        }
        return new C15424(c10093);
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo7208(long j, String str) {
        return new C5859(this.f69760.get(m49104(str)));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m49104(String str) {
        boolean zStartsWith = str.startsWith("/");
        String str2 = this.f69759;
        return zStartsWith ? C16014.m37867(str2, str) : C22870.m50967(str2, "/", str);
    }
}
