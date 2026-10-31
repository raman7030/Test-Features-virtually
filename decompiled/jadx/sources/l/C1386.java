package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.֨᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 143X */
/* JADX INFO: loaded from: classes2.dex */
public class C1386 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumSet f5023;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC3109 f5024;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumSet f5025;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3109 m4871() {
        return this.f5024;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo4874(EnumC20347 enumC20347) {
        this.f5023.add(enumC20347);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m4873(EnumC20347 enumC20347) {
        this.f5025.add(enumC20347);
    }

    public C1386(InterfaceC3109 interfaceC3109) {
        this.f5024 = null;
        this.f5023 = EnumSet.noneOf(EnumC20347.class);
        this.f5025 = EnumSet.noneOf(EnumC20347.class);
        this.f5024 = interfaceC3109;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4870(EnumC20347 enumC20347) {
        return this.f5025.contains(enumC20347) || this.f5023.contains(enumC20347);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m4872(EnumC20347 enumC20347) {
        return this.f5023.contains(enumC20347);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4869() {
        this.f5023.clear();
        this.f5025.clear();
    }

    public C1386() {
        this(null);
    }
}
