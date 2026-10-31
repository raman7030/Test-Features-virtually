package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C16654 implements InterfaceC7941 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23710 f51143;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f51144;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18274 f51145;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8396[] f51146;

    @Override // l.InterfaceC5119
    /* JADX INFO: renamed from: ֫ */
    public final C18274 mo11293(C18274 c18274, C21802 c21802) {
        return c18274;
    }

    public C16654(C18274 c18274, C23710 c23710, AbstractC8396[] abstractC8396Arr, ArrayList arrayList) {
        this.f51145 = c18274;
        this.f51143 = c23710;
        this.f51146 = abstractC8396Arr;
        this.f51144 = arrayList;
    }

    @Override // l.InterfaceC0885
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo3235(C18274 c18274) {
        if (this.f51145 != c18274) {
            return c18274;
        }
        C7753 c7753 = new C7753(this.f51146, this.f51143.f76778);
        this.f51144.add(c7753);
        return c7753;
    }
}
