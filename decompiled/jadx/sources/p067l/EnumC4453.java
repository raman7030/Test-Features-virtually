package p067l;

import com.alipay.sdk.p010m.p058y.C0240c;
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
public final class EnumC4453 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC4453 f9985;

    /* JADX INFO: renamed from: ۙ */
    public static final /* synthetic */ EnumC4453[] f9986;

    /* JADX INFO: renamed from: ۛ */
    public static final int f9987 = 3000;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC4453 f9988;

    /* JADX INFO: renamed from: ۨ */
    public static final int f9989 = 1;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC4453 f9990;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC4453 f9991;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC4453 f9992;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC4453 f9993;

    /* JADX INFO: renamed from: ᩶ */
    public final EnumC15970 f9994;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC15970 f9995;

    /* JADX INFO: renamed from: ᩹ */
    public final String f9996;

    public static EnumC4453 valueOf(String str) {
        return (EnumC4453) Enum.valueOf(EnumC4453.class, str);
    }

    public static EnumC4453[] values() {
        return (EnumC4453[]) f9986.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC4453[] m9325() {
        return new EnumC4453[]{f9992, f9988, f9991, f9990, f9985, f9993};
    }

    static {
        EnumC15970 enumC15970 = EnumC15970.WINREG_V1_0;
        EnumC15970 enumC15971 = EnumC15970.NDR_32BIT_V2;
        f9992 = new EnumC4453("WINREG", 0, "winreg", enumC15970, enumC15971);
        EnumC15970 enumC15972 = EnumC15970.SRVSVC_V3_0;
        f9988 = new EnumC4453("SRVSVC", 1, "srvsvc", enumC15972, enumC15971);
        f9991 = new EnumC4453("LSASVC", 2, "lsarpc", EnumC15970.LSASVC_V0_0, enumC15971);
        f9990 = new EnumC4453("SAMSVC", 3, "samr", EnumC15970.SAMSVC_V1_0, enumC15971);
        f9985 = new EnumC4453("BROWSER_SRVSVC", 4, "browser", enumC15972, enumC15971);
        f9993 = new EnumC4453("SVCCTL", 5, "svcctl", EnumC15970.SVCCTL_V2_0, enumC15971);
        f9986 = m9325();
    }

    public EnumC4453(String str, int i, String str2, EnumC15970 enumC15970, EnumC15970 enumC15971) {
        super(str, i);
        this.f9996 = str2;
        this.f9995 = enumC15970;
        this.f9994 = enumC15971;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC11159 m9327(C16953 c16953) throws IOException {
        C4925 c4925M38534 = c16953.m38534("IPC$");
        if (!(c4925M38534 instanceof C19677)) {
            throw new C4630(C17588.m40053(this.f9996, " not a named pipe."));
        }
        C10488 c10488 = new C10488(m9324(c16953, (C19677) c4925M38534));
        c10488.m25749(this.f9995, this.f9994);
        return c10488;
    }

    /* JADX INFO: renamed from: ֫ */
    private C7135 m9324(C16953 c16953, C19677 c19677) throws C19876, C9167, InterruptedIOException {
        LinkedList linkedList = new LinkedList();
        for (int i = -1; i < 1; i++) {
            try {
                return m9326(c16953, c19677);
            } catch (C19876 e) {
                linkedList.offer(e);
                if (C17192.f51172[e.m45117().ordinal()] == 1) {
                    try {
                        Thread.sleep(C0240c.f1145a);
                    } catch (InterruptedException e2) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException();
                        interruptedIOException.addSuppressed(e2);
                        throw interruptedIOException;
                    }
                } else {
                    throw ((C19876) linkedList.poll());
                }
            }
        }
        if (!linkedList.isEmpty()) {
            throw ((C19876) linkedList.poll());
        }
        throw new C9167("Unknown error when opening pipe: " + c19677.m10466().m41324());
    }

    /* JADX INFO: renamed from: ۧ */
    private C7135 m9326(C16953 c16953, C19677 c19677) {
        return new C7135(c16953, c19677, this.f9996);
    }
}
