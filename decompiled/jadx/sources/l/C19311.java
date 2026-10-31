package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩵۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E61U */
/* JADX INFO: loaded from: classes5.dex */
public final class C19311 extends AbstractC20886 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f60729;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f60730;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f60731;

    public C19311(String str, String str2, Set set) {
        this.f60730 = set;
        this.f60731 = str;
        this.f60729 = str2;
    }

    @Override // l.InterfaceC0098
    public final Set getAnnotations() {
        return this.f60730;
    }

    @Override // l.InterfaceC0098, l.InterfaceC21972
    public final String getName() {
        return this.f60731;
    }

    @Override // l.InterfaceC21699
    public final String getType() {
        return this.f60729;
    }
}
