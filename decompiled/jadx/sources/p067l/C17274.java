package p067l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ܺۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D3ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17274 {

    /* JADX INFO: renamed from: ۜ */
    public static final C6468 f51482 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final C18537 f51483;

    /* JADX INFO: renamed from: ۧ */
    public final C23623 f51484;

    /* JADX INFO: renamed from: ܳ */
    public final C5876 f51485;

    /* JADX INFO: renamed from: ܽ */
    public final C8200 f51486;

    /* JADX INFO: renamed from: ܿ */
    public final C24387 f51487;

    /* JADX INFO: renamed from: ᩳ */
    public final C13565 f51488;

    /* JADX INFO: renamed from: ᩻ */
    public final EnumC17840 f51489;

    /* JADX INFO: renamed from: ֫ */
    public static C17274 m39125(C5127 c5127) {
        C17274 c17274 = (C17274) c5127.m10905(f51482);
        return c17274 == null ? new C17274(c5127) : c17274;
    }

    public C17274(C5127 c5127) {
        c5127.m10908(f51482, this);
        this.f51483 = C18537.m42139(c5127);
        C9641.m22438(c5127);
        this.f51484 = C23623.m52439(c5127);
        this.f51486 = C8200.m18988(c5127);
        if (((C6547) c5127.m10905(C6547.f16898)) == null) {
            new C6547(c5127);
        }
        this.f51489 = EnumC17840.m40515(c5127);
        this.f51487 = C24387.m53737(c5127);
        this.f51488 = C13565.m30871(c5127);
        this.f51485 = C5876.m13194(c5127);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15933 m39126(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4) {
        C4535 c4535;
        C4535 c4536;
        C5876 c5876 = this.f51485;
        c5876.getClass();
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) charSequence;
            if (z) {
                c4536 = new C4535(c5876, new C21970(c5876, charBuffer));
            } else {
                c4536 = new C4535(c5876, new C6508(c5876, charBuffer));
            }
        } else {
            char[] charArray = charSequence.toString().toCharArray();
            int length = charArray.length;
            if (z) {
                c4535 = new C4535(c5876, new C21970(c5876, charArray, length));
            } else {
                c4535 = new C4535(c5876, new C6508(c5876, charArray, length));
            }
            c4536 = c4535;
        }
        return new C15933(this, c4536, z, z3, z2, z4);
    }
}
