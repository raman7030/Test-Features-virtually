.class public final synthetic Ll/۬ܺܳ;
.super Ljava/lang/Object;
.source "VAIY"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۬ܺܳ;->᩸:I

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
    iget v0, p0, Ll/۬ܺܳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/᩶ۘ۠;

    .line 10
    invoke-static {p1}, Ll/ۛᩴ۠;->֫(Ll/᩶ۘ۠;)Ll/۫۠۠;

    move-result-object p1

    return-object p1

    .line 14
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 25
    :pswitch_1
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 28
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$EDhObFLVkvtGXX6UZ8WS3YGDOn4(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 32
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 78
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 0
    :pswitch_3
    check-cast p1, Ljava/util/Map$Entry;

    .line 202
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_4
    check-cast p1, Ll/۫ܺܳ;

    .line 210
    iget-object p1, p1, Ll/۫ܺܳ;->ۧ:Ljava/lang/String;

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
