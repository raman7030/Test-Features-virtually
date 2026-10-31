.class public final Ll/ۢۢ۠;
.super Ll/᩷ۢ۠;
.source "07RX"


# instance fields
.field public final ᩸:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 634
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 574
    iput-boolean p1, p0, Ll/ۢۢ۠;->᩸:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 569
    check-cast p1, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2, p1}, Ll/ۢۢ۠;->֫(Ll/ۙ֨֨;Ljava/lang/StringBuilder;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۚۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 569
    check-cast p2, Ljava/lang/StringBuilder;

    const-string v0, "["

    .line 585
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1418
    iget-object p1, p1, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    .line 586
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙ֨֨;

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 569
    check-cast p2, Ljava/lang/StringBuilder;

    .line 598
    iget-boolean v0, p0, Ll/ۢۢ۠;->᩸:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p1}, Ll/ۛ֡֨;->۫()Ll/ۤܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 599
    :cond_0
    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p1}, Ll/ۛ֡֨;->۟()Ll/ۤܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/16 v0, 0x2e

    const/16 v1, 0x2f

    .line 600
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    const-string v0, "L"

    .line 601
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ";"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۙ֨֨;Ljava/lang/StringBuilder;)Ll/ۙ֨֨;
    .locals 2

    .line 591
    invoke-virtual {p1}, Ll/ۙ֨֨;->֡֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 604
    sget-object v0, Ll/᩻ۢ۠;->֫:[I

    invoke-virtual {p1}, Ll/ۙ֨֨;->֫()Ll/֡᩹۠;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/16 v0, 0xb

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const-string p1, "unknown type: should not happen"

    .line 615
    invoke-static {p1}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    const-string p1, "D"

    goto :goto_0

    :pswitch_1
    const-string p1, "F"

    goto :goto_0

    :pswitch_2
    const-string p1, "C"

    goto :goto_0

    :pswitch_3
    const-string p1, "J"

    goto :goto_0

    :pswitch_4
    const-string p1, "I"

    goto :goto_0

    :pswitch_5
    const-string p1, "S"

    goto :goto_0

    :pswitch_6
    const-string p1, "B"

    goto :goto_0

    :pswitch_7
    const-string p1, "Z"

    goto :goto_0

    :cond_0
    const-string p1, "V"

    .line 592
    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v1

    .line 595
    :cond_1
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙ֨֨;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
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
