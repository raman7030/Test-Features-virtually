.class public final Ll/ܽۗۖ;
.super Ll/᩶᩹ۖ;
.source "75QI"


# instance fields
.field public final synthetic ֫:Ll/ۚ᩹ۖ;

.field public final synthetic ۧ:Ll/֫ۙۖ;


# direct methods
.method public constructor <init>(Ll/ۚ᩹ۖ;Ll/֫ۙۖ;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    iput-object p1, p0, Ll/ܽۗۖ;->֫:Ll/ۚ᩹ۖ;

    iput-object p2, p0, Ll/ܽۗۖ;->ۧ:Ll/֫ۙۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;
    .locals 6

    .line 141
    sget-object v0, Ll/ᩳۗۖ;->ۧ:[I

    iget-object v1, p1, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 194
    :pswitch_0
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_8

    aget-object v3, v0, v1

    .line 195
    iget-object v4, v3, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v5, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    if-ne v4, v5, :cond_1

    .line 196
    move-object v4, v3

    check-cast v4, Ll/ۨ᩹ۖ;

    .line 197
    iget-object v4, v4, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-ltz v4, :cond_0

    .line 200
    invoke-virtual {p0, v3}, Ll/ܽۗۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    goto :goto_1

    .line 198
    :cond_0
    invoke-static {}, Ll/ܳۗۖ;->ۧ()Ll/ܿۗۖ;

    move-result-object p1

    throw p1

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 186
    :pswitch_1
    invoke-virtual {p1}, Ll/۠᩶ۖ;->֫()Ll/۠᩶ۖ;

    move-result-object v0

    iget-object v0, v0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_8

    .line 187
    invoke-virtual {p1}, Ll/۠᩶ۖ;->֫()Ll/۠᩶ۖ;

    move-result-object v0

    check-cast v0, Ll/ۨ᩹ۖ;

    .line 188
    iget-object v0, v0, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ltz v0, :cond_2

    goto/16 :goto_3

    .line 189
    :cond_2
    invoke-static {}, Ll/ܳۗۖ;->ۧ()Ll/ܿۗۖ;

    move-result-object p1

    throw p1

    .line 177
    :pswitch_2
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    iget-object v0, v0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_8

    .line 178
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    check-cast v0, Ll/ۨ᩹ۖ;

    .line 179
    iget-object v0, v0, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    goto/16 :goto_3

    .line 180
    :cond_3
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܽۗۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    .line 181
    invoke-static {}, Ll/ܳۗۖ;->֫()Ll/ܿۗۖ;

    move-result-object p1

    throw p1

    .line 168
    :pswitch_3
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    iget-object v0, v0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_8

    .line 169
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    check-cast v0, Ll/ۨ᩹ۖ;

    .line 170
    iget-object v0, v0, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    .line 171
    :cond_4
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܽۗۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    .line 172
    invoke-static {}, Ll/ܳۗۖ;->֫()Ll/ܿۗۖ;

    move-result-object p1

    throw p1

    .line 162
    :pswitch_4
    invoke-virtual {p1}, Ll/۠᩶ۖ;->֫()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0}, Ll/ܳۗۖ;->֫(Ll/۠᩶ۖ;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    .line 163
    :cond_5
    invoke-static {}, Ll/ܳۗۖ;->ܽ()Ll/ܿۗۖ;

    move-result-object p1

    throw p1

    .line 155
    :pswitch_5
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0}, Ll/ܳۗۖ;->֫(Ll/۠᩶ۖ;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    .line 156
    :cond_6
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܽۗۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    .line 157
    invoke-static {}, Ll/ܳۗۖ;->ܽ()Ll/ܿۗۖ;

    move-result-object p1

    throw p1

    .line 145
    :pswitch_6
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v0

    .line 146
    aget-object v1, v0, v1

    invoke-static {v1}, Ll/ܳۗۖ;->֫(Ll/۠᩶ۖ;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 p1, 0x1

    .line 147
    :goto_2
    array-length v1, v0

    if-ge p1, v1, :cond_7

    .line 148
    aget-object v1, v0, p1

    :try_start_0
    invoke-virtual {p0, v1}, Ll/ܽۗۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    throw p1

    .line 150
    :cond_7
    invoke-static {}, Ll/ܳۗۖ;->ܽ()Ll/ܿۗۖ;

    move-result-object p1

    throw p1

    .line 207
    :cond_8
    :goto_3
    invoke-super {p0, p1}, Ll/᩶᩹ۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    .line 208
    iget-object v0, p1, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-eq v0, v1, :cond_a

    sget-object v1, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_9

    goto :goto_4

    .line 211
    :cond_9
    new-instance v0, Ll/ᩳ᩶ۖ;

    invoke-direct {v0}, Ll/ᩳ᩶ۖ;-><init>()V

    .line 212
    iget-object v1, p0, Ll/ܽۗۖ;->֫:Ll/ۚ᩹ۖ;

    iget-object v2, v1, Ll/ۚ᩹ۖ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    iget-object v1, v1, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    iget-object v2, p0, Ll/ܽۗۖ;->ۧ:Ll/֫ۙۖ;

    invoke-static {v0, p1}, Ll/ᩳۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠᩶ۖ;)Ll/᩸᩶ۖ;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Ll/ܽۙۖ;->ۧ(Ll/֫ۙۖ;Ll/֫ۙۖ;)V

    return-object v0

    :cond_a
    :goto_4
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
