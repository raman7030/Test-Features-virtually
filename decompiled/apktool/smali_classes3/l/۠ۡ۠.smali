.class public final synthetic Ll/۠ۡ۠;
.super Ljava/lang/Object;
.source "D445"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠ۡ۠;->᩸:I

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
    iget v0, p0, Ll/۠ۡ۠;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ۙ۬ۚ;

    .line 10
    invoke-virtual {p1}, Ll/ۙ۬ۚ;->᩻()I

    move-result p1

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 18
    :pswitch_0
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 21
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$HAH-STEuX22IL2ey_pp6sRoXIPI(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    .line 25
    :pswitch_1
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 28
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$N0MqKgI37q-hoL-3eM5Ia-8Wdtw(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 32
    :pswitch_2
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 35
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$A3DBdzdQzx7JQYDdDVwbAgSxEsQ(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    .line 39
    :pswitch_3
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 42
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$xsYIQTlu6U77Wv6zuCHLvgqGlPQ(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    .line 46
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 930
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 0
    :pswitch_5
    check-cast p1, Ll/֨᩵۠;

    .line 1735
    invoke-virtual {p1}, Ll/֨᩵۠;->ܳ֫()Ll/ۘ֡۠;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3065
    iget-object p1, p1, Ll/ۘ֡۠;->ۤ:Ll/۫᩵۠;

    .line 1737
    invoke-static {p1}, Ll/۟ۚ۠;->ۜ(Ll/ۚۚ۠;)Ll/ۤܶ۠;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
