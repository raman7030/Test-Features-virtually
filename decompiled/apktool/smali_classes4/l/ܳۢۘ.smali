.class public final synthetic Ll/ܳۢۘ;
.super Ljava/lang/Object;
.source "U7Z7"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳۢۘ;->᩸:I

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
    iget v0, p0, Ll/ܳۢۘ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 10
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$_42detWe0fsyTkbR_-PTZRTdlVA(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 14
    :pswitch_0
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 17
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$czEyzXYmhR1TgMNUxS3C1bLOX5Y(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 21
    :pswitch_1
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 24
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$WKuM40qTBNXHU7wm0V72um7qmSk(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 28
    :pswitch_2
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 31
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$JDcw6RJkkwdPhup_6Meo6Ome-JY(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    .line 35
    :pswitch_3
    new-instance v0, Ll/֫ۨܳ;

    .line 37
    check-cast p1, Ll/۬ۜܽ;

    .line 40
    invoke-direct {v0, p1}, Ll/֫ۨܳ;-><init>(Ll/۬ۜܽ;)V

    return-object v0

    .line 43
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    const-string v0, "ecdsa-sha2-"

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
