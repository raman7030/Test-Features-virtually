package p067l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4TI */
/* JADX INFO: loaded from: classes.dex */
public final class C25042 extends AbstractC19535 {

    /* JADX INFO: renamed from: ۙ */
    public final int f79926;

    /* JADX INFO: renamed from: ᩶ */
    public final String f79927;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC8146 f79928;

    public C25042(int i, String str, Collection collection) {
        this.f79926 = i;
        this.f79927 = str;
        this.f79928 = C22361.m50193(collection);
    }

    @Override // p067l.InterfaceC21909
    public final int getVisibility() {
        return this.f79926;
    }

    @Override // p067l.InterfaceC21909
    public final String getType() {
        return this.f79927;
    }

    @Override // p067l.InterfaceC21909
    public final Set getElements() {
        return this.f79928;
    }
}
