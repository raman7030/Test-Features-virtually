package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4TI */
/* JADX INFO: loaded from: classes.dex */
public final class C23857 extends AbstractC18063 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f77176;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f77177;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC6079 f77178;

    public C23857(int i, String str, Collection collection) {
        this.f77176 = i;
        this.f77177 = str;
        this.f77178 = C21036.m47863(collection);
    }

    @Override // l.InterfaceC20561
    public final int getVisibility() {
        return this.f77176;
    }

    @Override // l.InterfaceC20561
    public final String getType() {
        return this.f77177;
    }

    @Override // l.InterfaceC20561
    public final Set getElements() {
        return this.f77178;
    }
}
