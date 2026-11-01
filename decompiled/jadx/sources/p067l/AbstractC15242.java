package p067l;

import java.text.MessageFormat;

/* JADX INFO: renamed from: l.ܰۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15242 implements InterfaceC5185 {

    /* JADX INFO: renamed from: ۧ */
    public AbstractC16856 f43502;

    /* JADX INFO: renamed from: ܽ */
    public final String f43503;

    /* JADX INFO: renamed from: ᩳ */
    public String f43504;

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo16534(String str, Object... objArr);

    /* JADX INFO: renamed from: ܽ */
    public static String m34697(String str, Object... objArr) {
        if (str == null) {
            return "";
        }
        try {
            return MessageFormat.format(str, objArr);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    @Override // p067l.InterfaceC5185
    /* JADX INFO: renamed from: ֫ */
    public void mo11117(long j, String str, Object... objArr) {
        throw new C14572();
    }

    public AbstractC15242(String str, C22893 c22893) {
        this.f43503 = str;
        this.f43502 = c22893;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo16533(InterfaceC24904 interfaceC24904) {
        interfaceC24904.getClass();
        this.f43504 = C10697.get(interfaceC24904.getName(), new String[0]).getFileName().toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo34699(String str, Object... objArr) {
        throw new C14572();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo34700(Throwable th) {
        mo11117(2147483647L, th.getMessage(), new Object[0]);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m34701() {
        return this.f43504;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m34698() {
        return this.f43503;
    }
}
