.class public final Ll/۬ܶۖ;
.super Ll/۫ۙ;
.source "65Z3"


# instance fields
.field public final synthetic ֫:Ll/ܽ᩸ۖ;

.field public final synthetic ۧ:Ljava/util/HashMap;

.field public final synthetic ܽ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ܽ᩸ۖ;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, p0, Ll/۬ܶۖ;->֫:Ll/ܽ᩸ۖ;

    iput-object p2, p0, Ll/۬ܶۖ;->ۧ:Ljava/util/HashMap;

    iput-object p3, p0, Ll/۬ܶۖ;->ܽ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖ᩹ۖ;IILl/ܰ۠ۖ;)V
    .locals 0

    .line 93
    sget-object p2, Ll/۫ܶۖ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 101
    :pswitch_0
    invoke-virtual {p4}, Ll/ܰ۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/۬ܶۖ;->֫:Ll/ܽ᩸ۖ;

    iget-object p2, p2, Ll/ܽ᩸ۖ;->᩶:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 102
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4}, Ll/ܰ۠ۖ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 103
    iget-object p2, p0, Ll/۬ܶۖ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    iget-object p2, p0, Ll/۬ܶۖ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖ᩸ۖ;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 107
    iput-object p2, p1, Ll/ۖ᩸ۖ;->᩶:Ljava/lang/Object;

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
