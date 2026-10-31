package com.google.android.material.color.utilities;

import java.util.function.Function;
import l.C20696;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda80 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda80(MaterialDynamicColors materialDynamicColors, int i) {
        this.$r8$classId = i;
        this.f$0 = materialDynamicColors;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$secondaryFixedDim$122((DynamicScheme) obj);
            default:
                return this.f$0.lambda$onErrorContainer$102((DynamicScheme) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
