package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79J1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19855 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4332 f64133;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22591 f64134;

    public C19855() {
        C4332 c4332 = new C4332(0);
        this.f64133 = c4332;
        this.f64134 = new C22591(c4332.f13954);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45673(C2215 c2215) {
        this.f64133.f13944 = c2215;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45674(C20725 c20725) {
        this.f64133.f13939 = c20725;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45677(EnumC22094... enumC22094Arr) {
        List<EnumC22094> listAsList = Arrays.asList(enumC22094Arr);
        if (listAsList == null) {
            throw new IllegalArgumentException("Dialects may not be null");
        }
        C4332 c4332 = this.f64133;
        c4332.f13950.clear();
        for (EnumC22094 enumC22094 : listAsList) {
            if (enumC22094 == null) {
                throw new IllegalArgumentException("Dialect may not be null");
            }
            c4332.f13950.add(enumC22094);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45670(UUID uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Client GUID may not be null");
        }
        this.f64133.f13948 = uuid;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45669(ArrayList arrayList) {
        C4332 c4332 = this.f64133;
        c4332.f13945.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC22319 interfaceC22319 = (InterfaceC22319) it.next();
            if (interfaceC22319 == null) {
                throw new IllegalArgumentException("Authenticator may not be null");
            }
            c4332.f13945.add(interfaceC22319);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m45681() {
        this.f64133.getClass();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45683(boolean z) {
        this.f64133.f13943 = z;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m45684() {
        this.f64133.f13949 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45678() {
        C4332 c4332 = this.f64133;
        c4332.f13942 = 1048576;
        c4332.f13941 = 1048576;
        c4332.f13940 = 1048576;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45679(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(60L);
        C4332 c4332 = this.f64133;
        c4332.f13953 = millis;
        c4332.f13937 = timeUnit.toMillis(60L);
        c4332.f13951 = timeUnit.toMillis(60L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45672(C1814 c1814) {
        if (c1814 == null) {
            throw new IllegalArgumentException("Transport layer factory may not be null");
        }
        this.f64133.f13952 = c1814;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45671(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(0L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Socket timeout should be less than 2147483647ms");
        }
        this.f64133.f13947 = (int) millis;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4332 m45668() {
        C4332 c4332 = this.f64133;
        if (c4332.f13950.isEmpty()) {
            throw new IllegalStateException("At least one SMB dialect should be specified");
        }
        if (!c4332.f13943 && EnumC22094.m49679(c4332.f13950)) {
            throw new IllegalStateException("Signing cannot be disabled when using SMB3.x dialects");
        }
        if (c4332.f13938 && !EnumC22094.m49679(c4332.f13950)) {
            throw new IllegalStateException("If encryption is advertised, at least one dialect should be SMB3.x compatible");
        }
        c4332.f13946 = this.f64134.m50564();
        return new C4332(c4332);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45682() {
        this.f64133.getClass();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45680(boolean z) {
        this.f64133.f13936 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45675(C21266 c21266) {
        this.f64133.getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45676(boolean z) {
        this.f64133.f13938 = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m45685() {
        this.f64133.getClass();
    }
}
