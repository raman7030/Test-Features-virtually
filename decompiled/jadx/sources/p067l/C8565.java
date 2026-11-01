package p067l;

import java.util.concurrent.Executor;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۜۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes2.dex */
public final class C8565 {

    /* JADX INFO: renamed from: ֡ */
    public final int f23011;

    /* JADX INFO: renamed from: ֨ */
    public final long f23012;

    /* JADX INFO: renamed from: ֫ */
    public C13221 f23013;

    /* JADX INFO: renamed from: ۖ */
    public C22135 f23014;

    /* JADX INFO: renamed from: ۘ */
    public Executor f23015;

    /* JADX INFO: renamed from: ۚ */
    public final Object f23016;

    /* JADX INFO: renamed from: ۜ */
    public final C21977 f23017;

    /* JADX INFO: renamed from: ۡ */
    public final C24320 f23018;

    /* JADX INFO: renamed from: ۢ */
    public C16748 f23019;

    /* JADX INFO: renamed from: ۧ */
    public C12391 f23020;

    /* JADX INFO: renamed from: ܳ */
    public C5370 f23021;

    /* JADX INFO: renamed from: ܺ */
    public volatile boolean f23022;

    /* JADX INFO: renamed from: ܽ */
    public final C2667 f23023;

    /* JADX INFO: renamed from: ܿ */
    public final int f23024;

    /* JADX INFO: renamed from: ᩳ */
    public volatile C15940 f23025;

    /* JADX INFO: renamed from: ᩴ */
    public C9729 f23026;

    /* JADX INFO: renamed from: ᩵ */
    public final int f23027;

    /* JADX INFO: renamed from: ᩷ */
    public C19294 f23028;

    /* JADX INFO: renamed from: ᩻ */
    public final long f23029;

    public C8565(C21977 c21977, C18623 c18623, C9729 c9729, C2667 c2667) {
        this.f23017 = c21977;
        C24320 c24320 = c18623.f55611;
        this.f23018 = c24320;
        this.f23016 = c18623.f55600;
        this.f23012 = c18623.f55601;
        int i = c18623.f55607;
        this.f23011 = i;
        int i2 = c18623.f55603;
        this.f23027 = i2;
        int i3 = c18623.f55609;
        this.f23024 = i3;
        this.f23029 = c18623.f55606;
        this.f23023 = c2667;
        this.f23026 = c9729;
        this.f23028 = c18623.f55602;
        this.f23013 = c18623.f55599;
        this.f23020 = c18623.f55605;
        if (c9729.length() != i) {
            throw new IllegalArgumentException("Stable syntax text length changed during request");
        }
        C17952 c17952M40863 = c18623.f55604 == null ? c18623.f55608 : c18623.f55608.m40863(c18623.f55604);
        C24658 c24658 = new C24658(this);
        C12391 c12391 = c18623.f55605;
        c24320.getClass();
        C5370 c5370 = new C5370(c24320, c9729, c24658, i2, i3, c17952M40863, c12391);
        this.f23021 = c5370;
        c5370.m11701(this.f23028);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19981() {
        this.f23014 = null;
        this.f23015 = null;
        this.f23019 = null;
        this.f23021.m11704();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19982(C22135 c22135, Executor executor, C16748 c16748) {
        this.f23014 = c22135;
        this.f23015 = executor;
        this.f23019 = c16748;
        this.f23021.m11702(c22135, executor, c16748);
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC6711 m19980(int i, long j, C24460 c24460) {
        try {
            EnumC6711 enumC6711M11699 = this.f23021.m11699(i, j, c24460);
            if (this.f23021.m11710()) {
                m19977();
                return EnumC6711.YIELDED;
            }
            if (enumC6711M11699 == EnumC6711.COMPLETED) {
                m19971();
                this.f23026 = null;
            }
            return enumC6711M11699;
        } catch (Error | RuntimeException e) {
            if (this.f23021.m11705() == EnumC6711.ABORTED) {
                this.f23017.m49539(this);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m19977() {
        this.f23021.m11715();
        C17952 c17952M11708 = this.f23021.m11708();
        C12391 c12391M11700 = this.f23021.m11700();
        int i = this.f23011;
        C24320 c24320 = this.f23018;
        C13221 c13221M30237 = C13221.m30232(c24320, i).m30237(c12391M11700);
        this.f23013 = c13221M30237;
        this.f23020 = c13221M30237.m30235(c24320, this.f23027);
        this.f23021.getClass();
        this.f23021.m11704();
        C9729 c9729 = this.f23026;
        C24658 c24658 = new C24658(this);
        C12391 c12391 = this.f23020;
        c24320.getClass();
        C12826.requireNonNull(c9729, TextBundle.TEXT_ENTRY);
        C5370 c5370 = new C5370(c24320, c9729, c24658, this.f23027, this.f23024, c17952M11708, c12391);
        this.f23021 = c5370;
        this.f23028 = null;
        C22135 c22135 = this.f23014;
        if (c22135 != null) {
            c5370.m11702(c22135, this.f23015, this.f23019);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m19971() {
        try {
            if (m19974()) {
                this.f23017.m49539(this);
                return;
            }
            C11209 c11209M11717 = this.f23021.m11717();
            if (c11209M11717.m25889() != this.f23024 - this.f23027) {
                throw new IllegalStateException("Window style length differs from requested range");
            }
            C19452 c19452M11707 = this.f23021.m11707();
            if (c19452M11707.m44259() != this.f23024 - this.f23027 || c19452M11707.m44264(0) != this.f23018.f77059) {
                throw new IllegalStateException("Window context differs from requested range");
            }
            C12391 c12391M11711 = this.f23021.m11711();
            if (c12391M11711.m28548() == this.f23018) {
                int iM28529 = c12391M11711.m28529();
                int i = this.f23011;
                if (iM28529 == i) {
                    C13221 c13221M30236 = this.f23013;
                    if (c13221M30236 == null) {
                        c13221M30236 = C13221.m30232(this.f23018, i);
                    }
                    if (this.f23020 != null && this.f23021.m11713() >= 0) {
                        c13221M30236 = c13221M30236.m30236(this.f23020);
                    }
                    C13221 c13221M30237 = c13221M30236.m30237(c12391M11711);
                    if (c13221M30237.m30238() != this.f23018 || c13221M30237.m30239() != this.f23011) {
                        throw new IllegalStateException("Window checkpoint cache identity differs from request");
                    }
                    C17952 c17952M11706 = this.f23021.m11706();
                    if (c17952M11706.m40865() != this.f23018 || c17952M11706.m40866() != this.f23011) {
                        throw new IllegalStateException("Window restart identity differs from request");
                    }
                    if (m19974()) {
                        this.f23017.m49539(this);
                        return;
                    }
                    C24320 c24320 = this.f23018;
                    long j = this.f23012;
                    int i2 = this.f23011;
                    int i3 = this.f23027;
                    int i4 = this.f23024;
                    this.f23021.getClass();
                    this.f23025 = new C15940(c24320, j, i2, i3, i4, c11209M11717, c19452M11707, c17952M11706, c13221M30237, this.f23028);
                    return;
                }
            }
            throw new IllegalStateException("Window checkpoint identity differs from request");
        } catch (Error | RuntimeException e) {
            this.f23017.m49539(this);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public boolean m19974() {
        if (this.f23022) {
            return true;
        }
        if (C13397.m30552(this.f23023.f4473)) {
            this.f23022 = true;
        }
        return this.f23022;
    }
}
