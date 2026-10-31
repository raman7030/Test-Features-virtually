.class public final synthetic Ll/ۧۨ᩷;
.super Ljava/lang/Object;
.source "51FV"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧۨ᩷;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ۧۨ᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ۙۧۖ;

    .line 343
    invoke-virtual {p1}, Ll/ۙۧۖ;->֫()Ll/ܰۤܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1

    .line 0
    :pswitch_0
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$B_D-gTGcm4cAQoYwC3mea_UZ1LM(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$1bchGPUnKbUncNl3I6Xbs8s6dzg(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$p0ZyPwwgGi9y2_b70meVKSuhL_s(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ll/ᩳۜܳ;

    .line 294
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "$RECYCLE.BIN$"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_4
    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Ll/ۚۚ᩻;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ll/ܶ᩵ܿ;

    .line 31
    new-instance v0, Ll/᩶֫ᩳ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/᩶֫ᩳ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 0
    :pswitch_6
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
