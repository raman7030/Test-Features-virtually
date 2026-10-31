.class public final synthetic Ll/ۛۚۢ;
.super Ljava/lang/Object;
.source "91T6"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛۚۢ;->᩸:I

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
    iget v0, p0, Ll/ۛۚۢ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/᩶ۘ۠;

    .line 3023
    sget-object p1, Ll/᩶ۘ۠;->ۖ֫:Ll/᩶ۘ۠;

    sget-object v0, Ll/᩶ۘ۠;->ۤ:Ll/᩶ۘ۠;

    invoke-static {p1, v0}, Ll/ۛᩴ۠;->֫(Ll/᩶ۘ۠;Ll/᩶ۘ۠;)Ll/۫۠۠;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "??? Invalid constant_pool reference #%d"

    .line 19
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_1
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$djQKupSoSTntMf6ekHtg36iWFow(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$WOlE5kxkT79msWjD-gzf1fx-044(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$H-1i7GPC40INAGTYtXpu0ngHMoU(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$UYTtgMKDlM81iLvDgzjUYqkWlBo(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ll/ۘᩳۜ;

    .line 248
    iget-object p1, p1, Ll/ۘᩳۜ;->ۜ:Ljava/lang/String;

    return-object p1

    .line 0
    :pswitch_6
    new-instance v0, Ll/ۢۧ᩻;

    check-cast p1, Ll/ܶ᩵ܿ;

    invoke-direct {v0, p1}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    return-object v0

    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 57
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 0
    :pswitch_8
    check-cast p1, Ll/۬ۜܽ;

    .line 50
    sget-object p1, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    return-object p1

    .line 0
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ll/ۨۚۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
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
