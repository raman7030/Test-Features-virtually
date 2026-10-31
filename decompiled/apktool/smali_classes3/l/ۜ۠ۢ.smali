.class public final synthetic Ll/ۜ۠ۢ;
.super Ljava/lang/Object;
.source "VAJH"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۜ۠ۢ;->᩸:I

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
    iget v0, p0, Ll/ۜ۠ۢ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ۚ᩹۠;

    .line 683
    invoke-interface {p1}, Ll/ۚ᩹۠;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_0
    check-cast p1, Ll/۫֡֨;

    .line 1220
    iget-object p1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    return-object p1

    .line 0
    :pswitch_1
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$MyPp93FDMjmChZbGciitu9bX3ZM(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$BudreMWMW90tFtQmj9Tje4mFw2Q(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ll/ۗ᩺ۡ;

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    sget p1, Ll/ۘܽ᩻;->ܽۧ:I

    .line 210
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 0
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

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
