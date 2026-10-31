.class public final synthetic Ll/۠ۜܳ;
.super Ljava/lang/Object;
.source "969A"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠ۜܳ;->᩸:I

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
    iget v0, p0, Ll/۠ۜܳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ljava/lang/Iterable;

    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1

    .line 14
    :pswitch_0
    check-cast p1, Ll/֨᩺ۚ;

    .line 2309
    new-instance v0, Ll/᩹ᩳ֨;

    sget-object v1, Ll/۫ۧ֨;->ۜ֫:Ll/۫ۧ֨;

    invoke-virtual {p1}, Ll/֨᩺ۚ;->֫()I

    move-result v1

    .line 43
    iget-object p1, p1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 2309
    invoke-direct {v0, v1, p1}, Ll/᩹ᩳ֨;-><init>(ILjava/lang/String;)V

    return-object v0

    .line 0
    :pswitch_1
    check-cast p1, Ll/ܰ۬ۚ;

    invoke-virtual {p1}, Ll/ܰ۬ۚ;->ۧ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$x3LnDgb3xNC46Ib6PFdrv_gYe6k(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$7xH019cRObx7qv97igFapMRW9Pk(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$eLf7xrTGoPWlb5ZlhDVNG9g2q8U(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$NJ7YNOWyINHOGhQpWKrdSsDudr8(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ll/֫᩻ۜ;

    .line 53
    iget-object p1, p1, Ll/֫᩻ۜ;->ܺ:Ljava/lang/String;

    return-object p1

    .line 0
    :pswitch_7
    check-cast p1, Ll/֫֡ܽ;

    invoke-static {p1}, Ll/ۖᩴܽ;->֫(Ll/֫֡ܽ;)Ll/ۢ۠ܽ;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ll/ۛۢܳ;

    .line 450
    invoke-virtual {p1}, Ll/ۛۢܳ;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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
