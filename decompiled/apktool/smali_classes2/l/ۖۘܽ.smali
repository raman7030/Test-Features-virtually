.class public final synthetic Ll/ۖۘܽ;
.super Ljava/lang/Object;
.source "81EW"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖۘܽ;->᩸:I

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
    iget v0, p0, Ll/ۖۘܽ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ۚۚ۠;

    .line 227
    check-cast p1, Ll/ۢۚ۠;

    return-object p1

    .line 0
    :pswitch_0
    check-cast p1, Ll/֨᩵۠;

    .line 1742
    invoke-virtual {p1}, Ll/֨᩵۠;->᩻֫()Ll/۠֡۠;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1743
    invoke-virtual {p1}, Ll/֨᩵۠;->᩻֫()Ll/۠֡۠;

    move-result-object p1

    .line 654
    iget-object p1, p1, Ll/۠֡۠;->۫:Ll/۫᩵۠;

    .line 1743
    invoke-static {p1}, Ll/۟ۚ۠;->ۜ(Ll/ۚۚ۠;)Ll/ۤܶ۠;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    .line 0
    :pswitch_1
    check-cast p1, Ll/۫֡֨;

    .line 2485
    iget-object p1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    return-object p1

    .line 0
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    sget p1, Ll/ܿᩳ֨;->᩵ۧ:I

    const-string p1, "???"

    return-object p1

    :pswitch_3
    check-cast p1, Ll/ۙ۬ۚ;

    invoke-virtual {p1}, Ll/ۙ۬ۚ;->ۧ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$lf6QqT-V0VT-UvRf04inOXEZUJQ(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$oWKrh1xMeI11GzXIIxhxMNyEFeA(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$rBhGBWuHAfj9lJ3VpNsyZltEQ4U(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$EHvXVIuPCC6-2HjTJZCQ14VkpZw(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 582
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 0
    :pswitch_9
    check-cast p1, Ll/ܺۗ֡;

    invoke-virtual {p1}, Ll/ܺۗ֡;->֫()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ll/ۡۘܽ;

    invoke-virtual {p1}, Ll/ۡۘܽ;->֫()Ll/᩵ۘܽ;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
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
