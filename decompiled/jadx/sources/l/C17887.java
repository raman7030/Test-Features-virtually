package l;

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
public final /* synthetic */ class C17887 implements InterfaceC7961, InterfaceC4644, InterfaceC23206, InterfaceC20106, ViewUtils.OnApplyWindowInsetsListener, InterfaceC21013 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54624;

    public /* synthetic */ C17887(Object obj) {
        this.f54624 = obj;
    }

    public /* synthetic */ C17887(C0425 c0425, List list) {
        this.f54624 = list;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public C21610 onApplyWindowInsets(View view, C21610 c21610, ViewUtils.RelativePadding relativePadding) {
        return ((SearchView) this.f54624).lambda$setUpToolbarInsetListener$4(view, c21610, relativePadding);
    }

    @Override // l.InterfaceC23206
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC20106
    /* JADX INFO: renamed from: ֫ */
    public void mo13218(Object obj) {
        C15063.m35617((C15063) this.f54624);
    }

    @Override // l.InterfaceC23206
    /* JADX INFO: renamed from: ֫ */
    public void mo8486(String str) {
        C15716.m37049((C15716) this.f54624, str);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC4644
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo5660() {
        return C17447.m40789(new C16741((AbstractC15440) this.f54624));
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        Type type = (Type) this.f54624;
        if (!(type instanceof ParameterizedType)) {
            throw new C13934("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C13934("Invalid EnumMap type: " + type.toString());
    }
}
