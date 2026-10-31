.class public final synthetic Ll/ܶᩴᩳ;
.super Ljava/lang/Object;
.source "J6S5"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶᩴᩳ;->᩸:I

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
    .locals 1

    .line 2
    iget v0, p0, Ll/ܶᩴᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ᩴܶ۠;

    .line 10
    invoke-virtual {p1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    .line 14
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 16
    sget p1, Ll/۬ᩳ֨;->᩷ۧ:I

    const/4 p1, 0x0

    return-object p1

    .line 20
    :pswitch_1
    check-cast p1, Ll/֫۬ܺ;

    .line 23
    invoke-virtual {p1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1

    .line 27
    :pswitch_2
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 30
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$X0whBdiYao_CTmOvJXJdFM9Lerw(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    .line 34
    :pswitch_3
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 37
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$nYm0QxMry84fY5ECHJfCeAbryh0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 41
    :pswitch_4
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 44
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$Gm82oI5ddtfzwMalHXOMfzVwgGQ(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    .line 48
    :pswitch_5
    check-cast p1, Ll/۬ۜܽ;

    .line 51
    invoke-static {p1}, Ll/ܿ᩸᩻;->֫(Ll/۬ۜܽ;)Ll/ܿ᩸᩻;

    move-result-object p1

    return-object p1

    .line 55
    :pswitch_6
    check-cast p1, Ll/ۡ۟ܽ;

    .line 57
    sget v0, Ll/۫۟ܽ;->᩸ۧ:I

    .line 335
    iget-object p1, p1, Ll/ۡ۟ܽ;->ܿ:Ljava/lang/String;

    return-object p1

    .line 0
    :pswitch_7
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Ll/᩹ᩴᩳ;->֫(Ljava/util/Map$Entry;)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
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
