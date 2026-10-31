package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩹ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22073 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f70732 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f70733;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f70734;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70735;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC5700 f70736;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f70737;

    public C22073(int i) {
        this.f70735 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49663(InterfaceC23338 interfaceC23338) {
        this.f70733 = interfaceC23338;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49661(EnumC5700 enumC5700) {
        C13997.m33482(enumC5700, "syntax");
        this.f70736 = enumC5700;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49664(boolean z) {
        this.f70737 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49665(int[] iArr) {
        this.f70732 = iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49662(C15680 c15680) {
        if (this.f70734) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.f70735.add(c15680);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19957 m49660() {
        if (this.f70734) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.f70736 == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.f70734 = true;
        ArrayList arrayList = this.f70735;
        Collections.sort(arrayList);
        return new C19957(this.f70736, this.f70737, this.f70732, (C15680[]) arrayList.toArray(new C15680[0]), this.f70733);
    }
}
