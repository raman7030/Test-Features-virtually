package p067l;

/* JADX INFO: renamed from: l.֡ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: FAH1 */
/* JADX INFO: loaded from: classes2.dex */
public class C2515 extends AbstractC14547 implements Cloneable {

    /* JADX INFO: renamed from: ֫֫ */
    public static final C5057 f4092 = C5057.ofMillis(-1);

    /* JADX INFO: renamed from: ۧ֫ */
    public static final C5057 f4094 = C5057.ofMillis(1800000);

    /* JADX INFO: renamed from: ܽ֫ */
    @Deprecated
    public static final C5057 f4097 = C5057.ofMillis(1800000);

    /* JADX INFO: renamed from: ܿ֫ */
    @Deprecated
    public static final C5057 f4098 = C5057.ofMillis(-1);

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final C5057 f4099 = C5057.ofMillis(-1);

    /* JADX INFO: renamed from: ۟ */
    public static final C5057 f4093 = C5057.ofMillis(10000);

    /* JADX INFO: renamed from: ܳ֫ */
    public static final C5057 f4096 = C5057.ofMillis(-1);

    /* JADX INFO: renamed from: ܰ */
    public static final String f4095 = C12575.class.getName();

    /* JADX INFO: renamed from: ۫ */
    public C5057 f4105 = f4092;

    /* JADX INFO: renamed from: ۤ */
    public C5057 f4103 = f4097;

    /* JADX INFO: renamed from: ᩶ */
    public C5057 f4107 = f4093;

    /* JADX INFO: renamed from: ۛ */
    public C5057 f4102 = f4098;

    /* JADX INFO: renamed from: ᩹ */
    public String f4109 = f4095;

    /* JADX INFO: renamed from: ۨ */
    public boolean f4104 = false;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f4110 = false;

    /* JADX INFO: renamed from: ᩸ */
    public C5057 f4108 = f4096;

    /* JADX INFO: renamed from: ۙ */
    public boolean f4101 = true;

    /* JADX INFO: renamed from: ۗ */
    public int f4100 = 8;

    /* JADX INFO: renamed from: ۬ */
    public int f4106 = 8;

    public final Object clone() {
        try {
            return (C2515) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m3673() {
        return this.f4100;
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m3670() {
        return this.f4106;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3667(int i) {
        this.f4100 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m3679(int i) {
        this.f4106 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m3678() {
        return this.f4109;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C5057 m3681() {
        return this.f4107;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m3676() {
        return this.f4101;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C5057 m3672() {
        return this.f4105;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final C5057 m3682() {
        return this.f4103;
    }

    /* JADX INFO: renamed from: ֡ */
    public final C5057 m3665() {
        return this.f4102;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m3677() {
        return this.f4104;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m3684() {
        return this.f4110;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5057 m3666() {
        return this.f4108;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final void m3683() {
        this.f4101 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3669(C5057 c5057) {
        this.f4103 = C14586.m33378(c5057, f4097);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m3675(C5057 c5057) {
        this.f4102 = C14586.m33378(c5057, f4098);
    }

    /* JADX INFO: renamed from: ۗ */
    public final void m3671() {
        this.f4104 = true;
    }

    /* JADX INFO: renamed from: ۤ */
    public final void m3674() {
        this.f4110 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m3680(C5057 c5057) {
        this.f4108 = C14586.m33378(c5057, f4096);
    }

    @Override // p067l.AbstractC14547
    /* JADX INFO: renamed from: ֫ */
    public final void mo3668(StringBuilder sb) {
        sb.append("lifo=");
        sb.append(true);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", maxWaitDuration=");
        sb.append(this.f4105);
        sb.append(", minEvictableIdleTime=");
        sb.append(this.f4103);
        sb.append(", softMinEvictableIdleTime=");
        sb.append(this.f4102);
        sb.append(", numTestsPerEvictionRun=");
        sb.append(3);
        sb.append(", evictionPolicyClassName=");
        sb.append(this.f4109);
        sb.append(", testOnCreate=");
        sb.append(false);
        sb.append(", testOnBorrow=");
        sb.append(this.f4104);
        sb.append(", testOnReturn=");
        sb.append(false);
        sb.append(", testWhileIdle=");
        sb.append(this.f4110);
        sb.append(", timeBetweenEvictionRuns=");
        sb.append(this.f4108);
        sb.append(", blockWhenExhausted=");
        sb.append(true);
        sb.append(", jmxEnabled=");
        sb.append(this.f4101);
        sb.append(", jmxNamePrefix=");
        sb.append("pool");
        sb.append(", jmxNameBase=");
        sb.append((String) null);
        sb.append(", minIdlePerKey=");
        sb.append(0);
        sb.append(", maxIdlePerKey=");
        sb.append(this.f4100);
        sb.append(", maxTotalPerKey=");
        sb.append(this.f4106);
        sb.append(", maxTotal=");
        sb.append(-1);
    }
}
