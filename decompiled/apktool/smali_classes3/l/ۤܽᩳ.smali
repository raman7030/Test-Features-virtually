.class public final synthetic Ll/ۤܽᩳ;
.super Ljava/lang/Object;
.source "L19N"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۤܽᩳ;->᩸:I

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
    iget v0, p0, Ll/ۤܽᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 10
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$vaAZIi5q1TOCHx4eliio5Y8fE9g(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 14
    :pswitch_0
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 17
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$i0JwaRK1pCjknPe2N74wPm0FuzM(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    .line 21
    :pswitch_1
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 24
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$v2Ghw74VdLASLWYLzckC4RqoDDs(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 28
    :pswitch_2
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    check-cast p1, Ljava/lang/Integer;

    .line 33
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 37
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0

    .line 40
    :pswitch_3
    check-cast p1, Ll/᩷۠ᩴ;

    .line 43
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 47
    :pswitch_4
    check-cast p1, Ll/ۡ۟ܽ;

    .line 49
    sget v0, Ll/۫۟ܽ;->᩸ۧ:I

    .line 787
    iget-object p1, p1, Ll/ۡ۟ܽ;->ܿ:Ljava/lang/String;

    return-object p1

    .line 0
    :pswitch_5
    check-cast p1, Ll/֫ܽᩳ;

    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/֫ܽᩳ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/֫ܽᩳ;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
