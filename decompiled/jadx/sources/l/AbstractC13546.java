package l;

import java.text.MessageFormat;

/* JADX INFO: renamed from: l.ܰۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13546 implements InterfaceC2964 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15244 f40432;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f40433;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f40434;

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo14626(String str, Object... objArr);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m32594(String str, Object... objArr) {
        if (str == null) {
            return "";
        }
        try {
            return MessageFormat.format(str, objArr);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    @Override // l.InterfaceC2964
    /* JADX INFO: renamed from: ֫ */
    public void mo9065(long j, String str, Object... objArr) {
        throw new C12841();
    }

    public AbstractC13546(String str, C21596 c21596) {
        this.f40433 = str;
        this.f40432 = c21596;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14625(InterfaceC23712 interfaceC23712) {
        interfaceC23712.getClass();
        this.f40434 = C8763.get(interfaceC23712.getName(), new String[0]).getFileName().toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo32596(String str, Object... objArr) {
        throw new C12841();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo32597(Throwable th) {
        mo9065(2147483647L, th.getMessage(), new Object[0]);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m32598() {
        return this.f40434;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m32595() {
        return this.f40433;
    }
}
