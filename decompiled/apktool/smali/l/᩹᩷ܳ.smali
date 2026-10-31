.class public final synthetic Ll/᩹᩷ܳ;
.super Ljava/lang/Object;
.source "123V"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹᩷ܳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۗᩴ۠;)V
    .locals 0

    const/16 p1, 0x8

    .line 0
    iput p1, p0, Ll/᩹᩷ܳ;->᩸:I

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
    .locals 3

    .line 2
    iget v0, p0, Ll/᩹᩷ܳ;->᩸:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast p1, Ll/ܺ᩹۠;

    .line 12
    invoke-static {p1}, Ll/ۗᩴ۠;->֫(Ll/ܺ᩹۠;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 16
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "#%d"

    .line 19
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "#%d?"

    .line 19
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    sget p1, Ll/۠֫֨;->᩷ۧ:I

    const-string p1, "????"

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$zqyuLwUAMpA4ob-jlLAhcLHX_M8(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ll/ᩳۧۢ;

    .line 9
    iget-object p1, p1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    return-object p1

    .line 0
    :pswitch_5
    check-cast p1, Ll/ۧܶۡ;

    invoke-virtual {p1}, Ll/ۧܶۡ;->ܿ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ll/ᩳۜܳ;

    .line 64
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_7
    check-cast p1, Ll/ᩳۜܳ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

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
