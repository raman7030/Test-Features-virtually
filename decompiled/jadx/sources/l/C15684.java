package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ܺۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D3ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15684 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C4314 f48344 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17013 f48345;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22364 f48346;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3691 f48347;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6136 f48348;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23168 f48349;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11781 f48350;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC16280 f48351;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15684 m36959(C2903 c2903) {
        C15684 c15684 = (C15684) c2903.m8838(f48344);
        return c15684 == null ? new C15684(c2903) : c15684;
    }

    public C15684(C2903 c2903) {
        c2903.m8841(f48344, this);
        this.f48345 = C17013.m39896(c2903);
        C7652.m20458(c2903);
        this.f48346 = C22364.m50099(c2903);
        this.f48348 = C6136.m17057(c2903);
        if (((C4397) c2903.m8838(C4397.f14082)) == null) {
            new C4397(c2903);
        }
        this.f48351 = EnumC16280.m38301(c2903);
        this.f48349 = C23168.m51341(c2903);
        this.f48350 = C11781.m28823(c2903);
        this.f48347 = C3691.m11248(c2903);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14273 m36960(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4) {
        C2280 c2280;
        C2280 c2281;
        C3691 c3691 = this.f48347;
        c3691.getClass();
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) charSequence;
            if (z) {
                c2281 = new C2280(c3691, new C20625(c3691, charBuffer));
            } else {
                c2281 = new C2280(c3691, new C4356(c3691, charBuffer));
            }
        } else {
            char[] charArray = charSequence.toString().toCharArray();
            int length = charArray.length;
            if (z) {
                c2280 = new C2280(c3691, new C20625(c3691, charArray, length));
            } else {
                c2280 = new C2280(c3691, new C4356(c3691, charArray, length));
            }
            c2281 = c2280;
        }
        return new C14273(this, c2281, z, z3, z2, z4);
    }
}
