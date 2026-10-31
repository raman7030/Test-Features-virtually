package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.᩷ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20625 extends C4356 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3691 f66346;

    public C20625(C3691 c3691, CharBuffer charBuffer) {
        super(c3691, charBuffer);
        this.f66346 = c3691;
    }

    public C20625(C3691 c3691, char[] cArr, int i) {
        super(c3691, cArr, i);
        this.f66346 = c3691;
    }

    @Override // l.C4356
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5102 mo13064(int i, int i2, EnumC0162 enumC0162) {
        return new C23446(enumC0162, this.f66346, m29585(i, i2), i);
    }

    @Override // l.C4356
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC13896 mo13069() {
        char[] cArrM29592 = m29592();
        return C11265.m27877(cArrM29592, cArrM29592.length, true);
    }
}
