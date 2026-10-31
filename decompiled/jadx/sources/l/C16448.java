package l;

import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܽۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes4.dex */
public final class C16448 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f50582;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f50578 = new HashMap();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public UUID f50577 = C23875.f77203;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C19373 f50576 = C18025.f56199;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f50583 = new int[0];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f50581 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23135 f50580 = new C23135();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f50579 = 300000;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38754(UUID uuid) {
        uuid.getClass();
        this.f50577 = uuid;
        this.f50576 = C18025.f56199;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38755(boolean z) {
        this.f50582 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38756(int... iArr) {
        for (int i : iArr) {
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            C22632.m50631(z);
        }
        this.f50583 = (int[]) iArr.clone();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38757(boolean z) {
        this.f50581 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2338 m38753(C17319 c17319) {
        return new C2338(this.f50577, this.f50576, c17319, this.f50578, this.f50582, this.f50583, this.f50581, this.f50580, this.f50579);
    }
}
