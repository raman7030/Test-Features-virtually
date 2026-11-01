package p067l;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchView;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19368 implements InterfaceC9934, InterfaceC6782, InterfaceC24424, InterfaceC21477, ViewUtils.OnApplyWindowInsetsListener, InterfaceC22339 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f57821;

    public /* synthetic */ C19368(Object obj) {
        this.f57821 = obj;
    }

    public /* synthetic */ C19368(C2772 c2772, List list) {
        this.f57821 = list;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public C1914 onApplyWindowInsets(View view, C1914 c1914, ViewUtils.RelativePadding relativePadding) {
        return ((SearchView) this.f57821).lambda$setUpToolbarInsetListener$4(view, c1914, relativePadding);
    }

    @Override // p067l.InterfaceC24424
    public /* synthetic */ void onCanceled() {
    }

    @Override // p067l.InterfaceC21477
    /* JADX INFO: renamed from: ֫ */
    public void mo15100(Object obj) {
        C16684.m37775((C16684) this.f57821);
    }

    @Override // p067l.InterfaceC24424
    /* JADX INFO: renamed from: ֫ */
    public void mo10533(String str) {
        C17305.m39218((C17305) this.f57821, str);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC6782
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo7890() {
        return C18950.m43047(new C18279((AbstractC17043) this.f57821));
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        Type type = (Type) this.f57821;
        if (!(type instanceof ParameterizedType)) {
            throw new C15611("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C15611("Invalid EnumMap type: " + type.toString());
    }
}
