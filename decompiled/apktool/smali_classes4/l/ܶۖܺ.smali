.class public final Ll/ܶۖܺ;
.super Ljava/lang/Object;
.source "ABG3"

# interfaces
.implements Ll/ܿۘܺ;


# instance fields
.field public final synthetic ֫:Ll/᩸ۖܺ;

.field public final synthetic ۧ:Ll/᩻ۡܺ;


# direct methods
.method public constructor <init>(Ll/᩸ۖܺ;Ll/᩻ۡܺ;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۖܺ;->֫:Ll/᩸ۖܺ;

    iput-object p2, p0, Ll/ܶۖܺ;->ۧ:Ll/᩻ۡܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۖܺ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ܰۖܺ;)V
    .locals 0

    return-void
.end method

.method public final ۧ(Ll/۫ۖܺ;)V
    .locals 9

    .line 101
    invoke-virtual {p1}, Ll/۫ۖܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v0

    .line 102
    invoke-virtual {v0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v0

    .line 103
    invoke-virtual {p1}, Ll/۫ۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v1

    .line 106
    iget-object v2, p0, Ll/ܶۖܺ;->֫:Ll/᩸ۖܺ;

    invoke-static {v2, p1}, Ll/᩸ۖܺ;->֫(Ll/᩸ۖܺ;Ll/۫ۖܺ;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_1

    .line 108
    :cond_0
    invoke-virtual {v1}, Ll/ܿᩴܺ;->size()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    goto/16 :goto_1

    .line 113
    :cond_1
    invoke-virtual {v0}, Ll/ۗۡܺ;->ۧ()I

    move-result v3

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v3, v4, :cond_3

    .line 117
    invoke-virtual {v1, v6}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v3

    .line 74
    instance-of v4, v3, Ll/֨ܺܺ;

    const-wide/16 v6, 0x0

    if-eqz v4, :cond_2

    .line 75
    check-cast v3, Ll/֨ܺܺ;

    .line 76
    invoke-virtual {v3}, Ll/֨ܺܺ;->֡()J

    move-result-wide v3

    cmp-long v8, v3, v6

    if-nez v8, :cond_2

    .line 118
    invoke-virtual {v1}, Ll/᩶ۡܺ;->۠()Ll/᩶ۡܺ;

    move-result-object v1

    .line 119
    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 528
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v1, "Unrecognized IF regop: "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 528
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const/16 v0, 0x9

    goto :goto_0

    :pswitch_1
    const/16 v0, 0xa

    goto :goto_0

    :pswitch_2
    const/16 v0, 0xb

    goto :goto_0

    :pswitch_3
    const/16 v0, 0xc

    .line 118
    :goto_0
    :pswitch_4
    invoke-static {v2, p1, v1, v0}, Ll/᩸ۖܺ;->֫(Ll/᩸ۖܺ;Ll/۫ۖܺ;Ll/᩶ۡܺ;I)V

    return-void

    .line 120
    :cond_2
    invoke-virtual {v1, v5}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v3

    .line 74
    instance-of v4, v3, Ll/֨ܺܺ;

    if-eqz v4, :cond_5

    .line 75
    check-cast v3, Ll/֨ܺܺ;

    .line 76
    invoke-virtual {v3}, Ll/֨ܺܺ;->֡()J

    move-result-wide v3

    cmp-long v5, v3, v6

    if-nez v5, :cond_5

    .line 121
    invoke-virtual {v1}, Ll/᩶ۡܺ;->ܶ()Ll/᩶ۡܺ;

    move-result-object v1

    .line 122
    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v0

    .line 121
    invoke-static {v2, p1, v1, v0}, Ll/᩸ۖܺ;->֫(Ll/᩸ۖܺ;Ll/۫ۖܺ;Ll/᩶ۡܺ;I)V

    return-void

    .line 125
    :cond_3
    invoke-virtual {v1, v6}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v1, v5}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    .line 124
    iget-object v4, p0, Ll/ܶۖܺ;->ۧ:Ll/᩻ۡܺ;

    invoke-virtual {v4, v0, v2, v3}, Ll/᩻ۡܺ;->֫(Ll/ۗۡܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 126
    invoke-virtual {p1}, Ll/۫ۖܺ;->ܶ()V

    return-void

    .line 127
    :cond_4
    invoke-virtual {v0}, Ll/ۗۡܺ;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 129
    invoke-virtual {v1, v5}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v1, v6}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    .line 128
    invoke-virtual {v4, v0, v2, v3}, Ll/᩻ۡܺ;->֫(Ll/ۗۡܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 136
    invoke-virtual {v1, v5}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v1, v6}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    .line 135
    invoke-static {v0, v1}, Ll/᩶ۡܺ;->֫(Ll/᩸ۡܺ;Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object v0

    .line 134
    invoke-virtual {p1, v0}, Ll/۫ۖܺ;->֫(Ll/᩶ۡܺ;)V

    .line 138
    invoke-virtual {p1}, Ll/۫ۖܺ;->ܶ()V

    :cond_5
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
