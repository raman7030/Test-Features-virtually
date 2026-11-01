package p067l;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ᩴۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1QX */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19965 implements InterfaceC9934, InterfaceC9208 {
    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m45307(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11996 m45308(int i) {
        C11996 c11996 = new C11996();
        c11996.writeInt(i);
        return c11996;
    }

    @Override // p067l.InterfaceC9208
    /* JADX INFO: renamed from: ֫ */
    public String mo21226(EnumC22620 enumC22620, String str, String str2) {
        return EnumC13232.m30290(enumC22620, str, str2);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45310(int i, int i2, CharSequence charSequence) {
        if (i != 0 && charSequence.charAt(i - 1) != '\n') {
            throw new RuntimeException();
        }
        if (i2 != charSequence.length() && charSequence.charAt(i2) != '\n') {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m45312(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m45311(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i2 - 1);
            if (cCharAt != ' ' && cCharAt != '\t') {
                break;
            }
            i2--;
        }
        return i2;
    }
}
