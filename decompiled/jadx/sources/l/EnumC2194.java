package l;

import com.alipay.sdk.m.y.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedList;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܰ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۖ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89J */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2194 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC2194 f7200;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC2194[] f7201;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int f7202 = 3000;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC2194 f7203;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int f7204 = 1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC2194 f7205;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC2194 f7206;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC2194 f7207;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC2194 f7208;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC14312 f7209;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC14312 f7210;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f7211;

    public static EnumC2194 valueOf(String str) {
        return (EnumC2194) Enum.valueOf(EnumC2194.class, str);
    }

    public static EnumC2194[] values() {
        return (EnumC2194[]) f7201.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC2194[] m7246() {
        return new EnumC2194[]{f7207, f7203, f7206, f7205, f7200, f7208};
    }

    static {
        EnumC14312 enumC14312 = EnumC14312.WINREG_V1_0;
        EnumC14312 enumC14313 = EnumC14312.NDR_32BIT_V2;
        f7207 = new EnumC2194("WINREG", 0, "winreg", enumC14312, enumC14313);
        EnumC14312 enumC14314 = EnumC14312.SRVSVC_V3_0;
        f7203 = new EnumC2194("SRVSVC", 1, "srvsvc", enumC14314, enumC14313);
        f7206 = new EnumC2194("LSASVC", 2, "lsarpc", EnumC14312.LSASVC_V0_0, enumC14313);
        f7205 = new EnumC2194("SAMSVC", 3, "samr", EnumC14312.SAMSVC_V1_0, enumC14313);
        f7200 = new EnumC2194("BROWSER_SRVSVC", 4, "browser", enumC14314, enumC14313);
        f7208 = new EnumC2194("SVCCTL", 5, "svcctl", EnumC14312.SVCCTL_V2_0, enumC14313);
        f7201 = m7246();
    }

    public EnumC2194(String str, int i, String str2, EnumC14312 enumC14312, EnumC14312 enumC14313) {
        super(str, i);
        this.f7211 = str2;
        this.f7210 = enumC14312;
        this.f7209 = enumC14313;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC9250 m7248(C15346 c15346) throws IOException {
        C2690 c2690M36376 = c15346.m36376("IPC$");
        if (!(c2690M36376 instanceof C18212)) {
            throw new C2380(C16014.m37867(this.f7211, " not a named pipe."));
        }
        C8544 c8544 = new C8544(m7245(c15346, (C18212) c2690M36376));
        c8544.m23748(this.f7210, this.f7209);
        return c8544;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5016 m7245(C15346 c15346, C18212 c18212) throws C18422, C7154, InterruptedIOException {
        LinkedList linkedList = new LinkedList();
        for (int i = -1; i < 1; i++) {
            try {
                return m7247(c15346, c18212);
            } catch (C18422 e) {
                linkedList.offer(e);
                if (C15598.f48040[e.m42844().ordinal()] == 1) {
                    try {
                        Thread.sleep(c.a);
                    } catch (InterruptedException e2) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException();
                        interruptedIOException.addSuppressed(e2);
                        throw interruptedIOException;
                    }
                } else {
                    throw ((C18422) linkedList.poll());
                }
            }
        }
        if (!linkedList.isEmpty()) {
            throw ((C18422) linkedList.poll());
        }
        throw new C7154("Unknown error when opening pipe: " + c18212.m8420().m39097());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C5016 m7247(C15346 c15346, C18212 c18212) {
        return new C5016(c15346, c18212, this.f7211);
    }
}
