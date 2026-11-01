package p067l;

import android.view.View;
import android.widget.TextView;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22894 implements InterfaceC3986, InterfaceC1666, InterfaceC14297, InterfaceC7132 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f72051;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f72052;

    public /* synthetic */ C22894(Object obj, Object obj2) {
        this.f72051 = obj;
        this.f72052 = obj2;
    }

    @Override // p067l.InterfaceC1666
    public C1914 onApplyWindowInsets(View view, C1914 c1914) {
        ActivityC12088.m27734((ActivityC12088) this.f72051, (C0990) this.f72052, c1914);
        return c1914;
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        C13087 c13087 = (C13087) this.f72051;
        C13087.m29944((TextView) this.f72052, textView, c13087.f36788.m41270().mo8217(), c13087.f36786);
    }

    @Override // p067l.InterfaceC14297
    /* JADX INFO: renamed from: ֫ */
    public void mo15853(String str, String str2, boolean z, boolean z2, boolean z3) {
        ViewOnClickListenerC12286.m28304((ViewOnClickListenerC12286) this.f72051, (Set) this.f72052, str, str2, z, z2, z3);
    }

    @Override // p067l.InterfaceC7132
    /* JADX INFO: renamed from: ֫ */
    public void mo16410(C3108 c3108, EnumC20544 enumC20544, AbstractC6462 abstractC6462, boolean z) {
        C3108 c3109 = (C3108) this.f72051;
        C20271 c20271 = (C20271) this.f72052;
        c3109.getClass();
        C1446.m31704(c3108 == c3109);
        c20271.m45777(new C24293(enumC20544, abstractC6462));
    }

    @Override // p067l.InterfaceC7132
    /* JADX INFO: renamed from: ֫ */
    public void mo16409(C3108 c3108) {
        C1446.m31698();
        throw null;
    }
}
