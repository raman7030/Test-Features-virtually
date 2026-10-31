package l;

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
public final class C4332 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final boolean f13932;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final TimeUnit f13933;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final TimeUnit f13934;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C1814 f13935;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f13936;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f13937;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f13938;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20725 f13939;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f13940;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f13941;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f13942;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f13943;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C2215 f13944;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f13945;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20475 f13946;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f13947;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public UUID f13948;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f13949;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumSet f13950;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f13951;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C1814 f13952;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f13953;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public SecureRandom f13954;

    public /* synthetic */ C4332(int i) {
        this();
    }

    static {
        boolean z;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f13933 = timeUnit;
        f13934 = timeUnit;
        f13935 = new C1814();
        try {
            Class.forName("android.os.Build");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f13932 = z;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static C19855 m13008() {
        C19855 c19855 = new C19855();
        c19855.m45670(UUID.randomUUID());
        c19855.m45673(new C2215());
        c19855.m45674(new C20725());
        c19855.m45681();
        c19855.m45683(true);
        c19855.m45682();
        c19855.m45680(false);
        c19855.m45678();
        c19855.m45672(f13935);
        c19855.m45671(f13933);
        c19855.m45677(EnumC22094.SMB_3_1_1, EnumC22094.SMB_3_0_2, EnumC22094.SMB_3_0, EnumC22094.SMB_2_1, EnumC22094.SMB_2_0_2);
        ArrayList arrayList = new ArrayList();
        if (!f13932) {
            try {
                arrayList.add((InterfaceC22319) Class.forName("com.hierynomus.smbj.auth.SpnegoAuthenticator$Factory").getDeclaredConstructor(null).newInstance(null));
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new C10951(e);
            }
        }
        arrayList.add(new C9977());
        c19855.m45669(arrayList);
        c19855.m45679(f13934);
        c19855.m45675(new C21266());
        c19855.m45676(false);
        c19855.m45685();
        return c19855;
    }

    public C4332() {
        this.f13950 = EnumSet.noneOf(EnumC22094.class);
        this.f13954 = new SecureRandom();
        this.f13945 = new ArrayList();
    }

    public C4332(C4332 c4332) {
        this();
        this.f13950.addAll(c4332.f13950);
        this.f13945.addAll(c4332.f13945);
        this.f13939 = c4332.f13939;
        this.f13954 = c4332.f13954;
        this.f13948 = c4332.f13948;
        this.f13943 = c4332.f13943;
        this.f13944 = c4332.f13944;
        this.f13942 = c4332.f13942;
        this.f13953 = c4332.f13953;
        this.f13941 = c4332.f13941;
        this.f13937 = c4332.f13937;
        this.f13940 = c4332.f13940;
        this.f13951 = c4332.f13951;
        this.f13952 = c4332.f13952;
        this.f13947 = c4332.f13947;
        this.f13936 = c4332.f13936;
        this.f13938 = c4332.f13938;
        this.f13949 = c4332.f13949;
        this.f13946 = c4332.f13946;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Random m13034() {
        return this.f13954;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C2215 m13038() {
        return this.f13944;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final EnumSet m13027() {
        return EnumSet.copyOf((Collection) this.f13950);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final UUID m13029() {
        return this.f13948;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList m13028() {
        return new ArrayList(this.f13945);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m13025() {
        return this.f13943;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m13020() {
        return this.f13949;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m13021() {
        return this.f13936;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m13033() {
        return this.f13942;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m13030() {
        return this.f13953;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m13035() {
        return this.f13941;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m13036() {
        return this.f13937;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m13031() {
        return this.f13940;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m13023() {
        return this.f13951;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C1814 m13024() {
        return this.f13952;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m13026() {
        return this.f13947;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SocketFactory m13037() {
        return this.f13939;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20475 m13032() {
        return this.f13946;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet m13022() {
        if (!EnumC22094.m49679(this.f13950)) {
            return EnumSet.noneOf(EnumC5866.class);
        }
        EnumSet enumSetOf = EnumSet.of(EnumC5866.SMB2_GLOBAL_CAP_LARGE_MTU);
        if (this.f13938) {
            enumSetOf.add(EnumC5866.SMB2_GLOBAL_CAP_ENCRYPTION);
        }
        return enumSetOf;
    }
}
