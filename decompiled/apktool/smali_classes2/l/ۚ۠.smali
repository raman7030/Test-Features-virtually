.class public final Ll/ۚ۠;
.super Ljava/lang/Object;
.source "91K6"


# instance fields
.field public ֫:Ljava/util/HashSet;

.field public ۜ:Ll/ۚ۠;

.field public ۧ:I

.field public final ܳ:Ll/ܶ۠;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:Z

.field public final ᩷:Ll/֡۠;

.field public ᩻:Ll/ܺ۠;


# direct methods
.method public constructor <init>(Ll/ܶ۠;Ll/֡۠;)V
    .locals 1

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    const/4 v0, 0x0

    .line 98
    iput v0, p0, Ll/ۚ۠;->ܿ:I

    const/4 v0, -0x1

    .line 99
    iput v0, p0, Ll/ۚ۠;->ܽ:I

    .line 132
    iput-object p1, p0, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 133
    iput-object p2, p0, Ll/ۚ۠;->᩷:Ll/֡۠;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 409
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    invoke-virtual {v1}, Ll/ܶ۠;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۚ۠;->᩷:Ll/֡۠;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/HashSet;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 70
    iput p1, p0, Ll/ۚ۠;->ۧ:I

    const/4 p1, 0x1

    .line 71
    iput-boolean p1, p0, Ll/ۚ۠;->ᩳ:Z

    return-void
.end method

.method public final ֫(ILl/֡ܶ;Ljava/util/ArrayList;)V
    .locals 2

    .line 41
    iget-object v0, p0, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ۠;

    .line 43
    iget-object v1, v1, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    invoke-static {v1, p1, p3, p2}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۚ۠;I)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 246
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/ۚ۠;->֫(Ll/ۚ۠;IIZ)Z

    return-void
.end method

.method public final ֫(Ll/ۚ۠;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 263
    :cond_0
    iget-object v1, p1, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 163
    iget-object p1, p1, Ll/ۚ۠;->᩷:Ll/֡۠;

    .line 267
    iget-object v2, p0, Ll/ۚ۠;->᩷:Ll/֡۠;

    const/4 v3, 0x1

    if-ne p1, v2, :cond_3

    .line 268
    sget-object p1, Ll/֡۠;->᩹:Ll/֡۠;

    if-ne v2, p1, :cond_2

    .line 269
    invoke-virtual {v1}, Ll/ܶ۠;->᩶()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 157
    iget-object p1, p0, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 269
    invoke-virtual {p1}, Ll/ܶ۠;->᩶()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    return v0

    :cond_2
    return v3

    .line 274
    :cond_3
    sget-object v4, Ll/᩵۠;->֫:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 302
    new-instance p1, Ljava/lang/AssertionError;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    return v0

    .line 290
    :pswitch_1
    sget-object v2, Ll/֡۠;->ۨ:Ll/֡۠;

    if-eq p1, v2, :cond_5

    sget-object v2, Ll/֡۠;->᩶:Ll/֡۠;

    if-ne p1, v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v2, 0x1

    .line 291
    :goto_1
    instance-of v1, v1, Ll/ۗ۠;

    if-eqz v1, :cond_8

    if-nez v2, :cond_7

    .line 292
    sget-object v1, Ll/֡۠;->۬:Ll/֡۠;

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    return v0

    :cond_7
    :goto_2
    return v3

    :cond_8
    return v2

    .line 282
    :pswitch_2
    sget-object v2, Ll/֡۠;->۫:Ll/֡۠;

    if-eq p1, v2, :cond_a

    sget-object v2, Ll/֡۠;->ۛ:Ll/֡۠;

    if-ne p1, v2, :cond_9

    goto :goto_3

    :cond_9
    const/4 v2, 0x0

    goto :goto_4

    :cond_a
    :goto_3
    const/4 v2, 0x1

    .line 283
    :goto_4
    instance-of v1, v1, Ll/ۗ۠;

    if-eqz v1, :cond_d

    if-nez v2, :cond_c

    .line 284
    sget-object v1, Ll/֡۠;->ۗ:Ll/֡۠;

    if-ne p1, v1, :cond_b

    goto :goto_5

    :cond_b
    return v0

    :cond_c
    :goto_5
    return v3

    :cond_d
    return v2

    .line 277
    :pswitch_3
    sget-object v1, Ll/֡۠;->᩹:Ll/֡۠;

    if-eq p1, v1, :cond_e

    sget-object v1, Ll/֡۠;->ۗ:Ll/֡۠;

    if-eq p1, v1, :cond_e

    sget-object v1, Ll/֡۠;->۬:Ll/֡۠;

    if-eq p1, v1, :cond_e

    return v3

    :cond_e
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ۚ۠;IIZ)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    .line 216
    invoke-virtual {p0}, Ll/ۚ۠;->ۢ()V

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p4, :cond_1

    .line 219
    invoke-virtual {p0, p1}, Ll/ۚ۠;->֫(Ll/ۚ۠;)Z

    move-result p4

    if-nez p4, :cond_1

    return v1

    .line 222
    :cond_1
    iput-object p1, p0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    .line 223
    iget-object p4, p1, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    if-nez p4, :cond_2

    .line 224
    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p1, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    .line 226
    :cond_2
    iget-object p1, p0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    iget-object p1, p1, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    if-eqz p1, :cond_3

    .line 227
    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    if-lez p2, :cond_4

    .line 230
    iput p2, p0, Ll/ۚ۠;->ܿ:I

    goto :goto_0

    .line 232
    :cond_4
    iput v1, p0, Ll/ۚ۠;->ܿ:I

    .line 234
    :goto_0
    iput p3, p0, Ll/ۚ۠;->ܽ:I

    return v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Ll/ۚ۠;->ᩳ:Z

    return v0
.end method

.method public final ۡ()V
    .locals 1

    const/4 v0, 0x0

    .line 82
    iput-boolean v0, p0, Ll/ۚ۠;->ᩳ:Z

    .line 83
    iput v0, p0, Ll/ۚ۠;->ۧ:I

    return-void
.end method

.method public final ۢ()V
    .locals 2

    .line 190
    iget-object v0, p0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    .line 191
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 192
    iget-object v0, p0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    iget-object v0, v0, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 193
    iget-object v0, p0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    iput-object v1, v0, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    .line 196
    :cond_0
    iput-object v1, p0, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    .line 197
    iput-object v1, p0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    const/4 v0, 0x0

    .line 198
    iput v0, p0, Ll/ۚ۠;->ܿ:I

    const/4 v1, -0x1

    .line 199
    iput v1, p0, Ll/ۚ۠;->ܽ:I

    .line 200
    iput-boolean v0, p0, Ll/ۚ۠;->ᩳ:Z

    .line 201
    iput v0, p0, Ll/ۚ۠;->ۧ:I

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 75
    iget-boolean v0, p0, Ll/ۚ۠;->ᩳ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 78
    :cond_0
    iget v0, p0, Ll/ۚ۠;->ۧ:I

    return v0
.end method

.method public final ܳ()Z
    .locals 3

    .line 57
    iget-object v0, p0, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 60
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚ۠;

    .line 61
    invoke-virtual {v2}, Ll/ۚ۠;->ᩳ()Ll/ۚ۠;

    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ll/ۚ۠;->᩷()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public final ܺ()V
    .locals 2

    .line 146
    iget-object v0, p0, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    if-nez v0, :cond_0

    .line 147
    new-instance v0, Ll/ܺ۠;

    sget-object v1, Ll/ۡ۠;->۬:Ll/ۡ۠;

    invoke-direct {v0, v1}, Ll/ܺ۠;-><init>(Ll/ۡ۠;)V

    iput-object v0, p0, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    return-void

    .line 149
    :cond_0
    invoke-virtual {v0}, Ll/ܺ۠;->֫()V

    return-void
.end method

.method public final ܽ()I
    .locals 3

    .line 170
    iget-object v0, p0, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    invoke-virtual {v0}, Ll/ܶ۠;->۠()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 173
    :cond_0
    iget v0, p0, Ll/ۚ۠;->ܽ:I

    const/4 v2, -0x1

    if-le v0, v2, :cond_1

    iget-object v0, p0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 174
    invoke-virtual {v0}, Ll/ܶ۠;->۠()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 175
    iget v0, p0, Ll/ۚ۠;->ܽ:I

    return v0

    .line 177
    :cond_1
    iget v0, p0, Ll/ۚ۠;->ܿ:I

    return v0
.end method

.method public final ܿ()Ll/ܺ۠;
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    return-object v0
.end method

.method public final ᩳ()Ll/ۚ۠;
    .locals 3

    .line 489
    sget-object v0, Ll/᩵۠;->֫:[I

    iget-object v1, p0, Ll/ۚ۠;->᩷:Ll/֡۠;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    iget-object v2, p0, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    packed-switch v0, :pswitch_data_0

    .line 509
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 500
    :pswitch_0
    iget-object v0, v2, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    return-object v0

    .line 497
    :pswitch_1
    iget-object v0, v2, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    return-object v0

    .line 494
    :pswitch_2
    iget-object v0, v2, Ll/ܶ۠;->۫:Ll/ۚ۠;

    return-object v0

    .line 491
    :pswitch_3
    iget-object v0, v2, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    return-object v0

    :pswitch_4
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public final ᩷()Z
    .locals 1

    .line 254
    iget-object v0, p0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 50
    iget-object v0, p0, Ll/ۚ۠;->֫:Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 53
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method
