.class public final synthetic Ll/ܳ֫֨;
.super Ljava/lang/Object;
.source "R7DV"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳ֫֨;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۗᩴ۠;)V
    .locals 0

    const/16 p1, 0x8

    .line 0
    iput p1, p0, Ll/ܳ֫֨;->᩸:I

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
    iget v0, p0, Ll/ܳ֫֨;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ۢ᩹۠;

    .line 10
    invoke-static {p1}, Ll/ۗᩴ۠;->֫(Ll/ۢ᩹۠;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 14
    :pswitch_0
    check-cast p1, Ll/ۢۚ۠;

    .line 1185
    iget-object p1, p1, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    return-object p1

    .line 0
    :pswitch_1
    check-cast p1, Ll/֡֡֨;

    .line 1674
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    return-object p1

    .line 0
    :pswitch_2
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$ox8YgcersNQGkj7RqfgNgKZqYB4(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$BP08d14uw5Tb0y_ZBi-n10CGqfs(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$LLPa16n5lyuPbyhpn1WW8my6RbA(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/String;

    sget v0, Ll/ۗܰܳ;->ᩴ֫:I

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 128
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_6
    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

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
