package p067l;

import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.ۙ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79J1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6485 {

    /* JADX INFO: renamed from: ۠ */
    public static final boolean f16746;

    /* JADX INFO: renamed from: ܶ */
    public static final TimeUnit f16747;

    /* JADX INFO: renamed from: ᩸ */
    public static final TimeUnit f16748;

    /* JADX INFO: renamed from: ᩹ */
    public static final C0932 f16749;

    /* JADX INFO: renamed from: ֡ */
    public boolean f16750;

    /* JADX INFO: renamed from: ֨ */
    public long f16751;

    /* JADX INFO: renamed from: ֫ */
    public boolean f16752;

    /* JADX INFO: renamed from: ۖ */
    public C22065 f16753;

    /* JADX INFO: renamed from: ۘ */
    public int f16754;

    /* JADX INFO: renamed from: ۚ */
    public int f16755;

    /* JADX INFO: renamed from: ۜ */
    public int f16756;

    /* JADX INFO: renamed from: ۡ */
    public boolean f16757;

    /* JADX INFO: renamed from: ۢ */
    public C4473 f16758;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f16759;

    /* JADX INFO: renamed from: ܳ */
    public C21828 f16760;

    /* JADX INFO: renamed from: ܺ */
    public int f16761;

    /* JADX INFO: renamed from: ܽ */
    public UUID f16762;

    /* JADX INFO: renamed from: ܿ */
    public boolean f16763;

    /* JADX INFO: renamed from: ᩳ */
    public EnumSet f16764;

    /* JADX INFO: renamed from: ᩴ */
    public long f16765;

    /* JADX INFO: renamed from: ᩵ */
    public C0932 f16766;

    /* JADX INFO: renamed from: ᩷ */
    public long f16767;

    /* JADX INFO: renamed from: ᩻ */
    public SecureRandom f16768;

    public /* synthetic */ C6485(int i) {
        this();
    }

    static {
        boolean z;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f16747 = timeUnit;
        f16748 = timeUnit;
        f16749 = new C0932();
        try {
            Class.forName("android.os.Build");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f16746 = z;
    }

    /* JADX INFO: renamed from: ۠ */
    public static C21238 m14872() {
        C21238 c21238 = new C21238();
        c21238.m47981(UUID.randomUUID());
        c21238.m47984(new C4473());
        c21238.m47985(new C22065());
        c21238.m47992();
        c21238.m47994(true);
        c21238.m47993();
        c21238.m47991(false);
        c21238.m47989();
        c21238.m47983(f16749);
        c21238.m47982(f16747);
        c21238.m47988(EnumC23366.SMB_3_1_1, EnumC23366.SMB_3_0_2, EnumC23366.SMB_3_0, EnumC23366.SMB_2_1, EnumC23366.SMB_2_0_2);
        ArrayList arrayList = new ArrayList();
        if (!f16746) {
            try {
                arrayList.add((InterfaceC23580) Class.forName("com.hierynomus.smbj.auth.SpnegoAuthenticator$Factory").getDeclaredConstructor(null).newInstance(null));
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new C12776(e);
            }
        }
        arrayList.add(new C11850());
        c21238.m47980(arrayList);
        c21238.m47990(f16748);
        c21238.m47986(new C22579());
        c21238.m47987(false);
        c21238.m47996();
        return c21238;
    }

    public C6485() {
        this.f16764 = EnumSet.noneOf(EnumC23366.class);
        this.f16768 = new SecureRandom();
        this.f16759 = new ArrayList();
    }

    public C6485(C6485 c6485) {
        this();
        this.f16764.addAll(c6485.f16764);
        this.f16759.addAll(c6485.f16759);
        this.f16753 = c6485.f16753;
        this.f16768 = c6485.f16768;
        this.f16762 = c6485.f16762;
        this.f16757 = c6485.f16757;
        this.f16758 = c6485.f16758;
        this.f16756 = c6485.f16756;
        this.f16767 = c6485.f16767;
        this.f16755 = c6485.f16755;
        this.f16751 = c6485.f16751;
        this.f16754 = c6485.f16754;
        this.f16765 = c6485.f16765;
        this.f16766 = c6485.f16766;
        this.f16761 = c6485.f16761;
        this.f16750 = c6485.f16750;
        this.f16752 = c6485.f16752;
        this.f16763 = c6485.f16763;
        this.f16760 = c6485.f16760;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Random m14898() {
        return this.f16768;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C4473 m14902() {
        return this.f16758;
    }

    /* JADX INFO: renamed from: ۡ */
    public final EnumSet m14891() {
        return EnumSet.copyOf((Collection) this.f16764);
    }

    /* JADX INFO: renamed from: ۧ */
    public final UUID m14893() {
        return this.f16762;
    }

    /* JADX INFO: renamed from: ۢ */
    public final ArrayList m14892() {
        return new ArrayList(this.f16759);
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m14889() {
        return this.f16757;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m14884() {
        return this.f16763;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m14885() {
        return this.f16750;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m14897() {
        return this.f16756;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m14894() {
        return this.f16767;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m14899() {
        return this.f16755;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final long m14900() {
        return this.f16751;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m14895() {
        return this.f16754;
    }

    /* JADX INFO: renamed from: ۖ */
    public final long m14887() {
        return this.f16765;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C0932 m14888() {
        return this.f16766;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m14890() {
        return this.f16761;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final SocketFactory m14901() {
        return this.f16753;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C21828 m14896() {
        return this.f16760;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumSet m14886() {
        if (!EnumC23366.m52017(this.f16764)) {
            return EnumSet.noneOf(EnumC7943.class);
        }
        EnumSet enumSetOf = EnumSet.of(EnumC7943.SMB2_GLOBAL_CAP_LARGE_MTU);
        if (this.f16752) {
            enumSetOf.add(EnumC7943.SMB2_GLOBAL_CAP_ENCRYPTION);
        }
        return enumSetOf;
    }
}
