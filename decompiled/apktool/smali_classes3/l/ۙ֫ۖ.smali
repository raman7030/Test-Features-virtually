.class public final synthetic Ll/ۙ֫ۖ;
.super Ljava/lang/Object;
.source "17QI"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۙ֫ۖ;->᩸:I

    iput-object p2, p0, Ll/ۙ֫ۖ;->᩹:Ljava/lang/Object;

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
    iget v0, p0, Ll/ۙ֫ۖ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۙ֫ۖ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Lcom/google/android/material/color/utilities/TemperatureCache;

    .line 11
    check-cast p1, Lcom/google/android/material/color/utilities/Hct;

    .line 14
    invoke-static {v0, p1}, Lcom/google/android/material/color/utilities/TemperatureCache;->$r8$lambda$VKoHiU00a9ybz_sbHTTerV8DYaI(Lcom/google/android/material/color/utilities/TemperatureCache;Lcom/google/android/material/color/utilities/Hct;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 18
    :pswitch_0
    iget-object v0, p0, Ll/ۙ֫ۖ;->᩹:Ljava/lang/Object;

    .line 20
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 22
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 25
    invoke-static {v0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$iktiPh2eC0EW4rhZMdfP8gj5o4A(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;

    move-result-object p1

    return-object p1

    .line 29
    :pswitch_1
    iget-object v0, p0, Ll/ۙ֫ۖ;->᩹:Ljava/lang/Object;

    .line 31
    check-cast v0, Ll/֡ۡ֨;

    .line 33
    check-cast p1, Ll/ۗܺ֨;

    .line 3040
    invoke-interface {v0}, Ll/۬ܺ֨;->֫()Ll/ۗܺ֨;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
