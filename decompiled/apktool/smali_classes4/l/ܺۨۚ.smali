.class public final Ll/ܺۨۚ;
.super Ll/ܳ۬ۚ;
.source "H7CX"


# instance fields
.field public final synthetic ܿ:Ll/ۘۨۚ;


# direct methods
.method public constructor <init>(Ll/ۘۨۚ;Ljava/io/DataInputStream;)V
    .locals 0

    .line 168
    iput-object p1, p0, Ll/ܺۨۚ;->ܿ:Ll/ۘۨۚ;

    .line 169
    invoke-direct {p0, p2}, Ll/ܳ۬ۚ;-><init>(Ljava/io/DataInputStream;)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 8

    const-string v0, "Invalid escape character"

    .line 206
    iget-object v1, p0, Ll/ܺۨۚ;->ܿ:Ll/ۘۨۚ;

    iget-object v2, p0, Ll/ܳ۬ۚ;->ᩳ:Ljava/lang/String;

    :goto_0
    const/4 v3, 0x0

    :try_start_0
    iget v4, p0, Ll/ܳ۬ۚ;->֫:I

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x75

    if-ne v4, v5, :cond_0

    .line 207
    iget v4, p0, Ll/ܳ۬ۚ;->֫:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Ll/ܳ۬ۚ;->֫:I

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x4

    if-ge v5, v7, :cond_1

    packed-switch v4, :pswitch_data_0

    packed-switch v4, :pswitch_data_1

    packed-switch v4, :pswitch_data_2

    .line 216
    iget-wide v4, p0, Ll/ܳ۬ۚ;->ܽ:J

    goto :goto_3

    :pswitch_0
    shl-int/lit8 v6, v6, 0x4

    add-int/2addr v6, v4

    add-int/lit8 v6, v6, -0x30

    goto :goto_2

    :pswitch_1
    shl-int/lit8 v6, v6, 0x4

    add-int/lit8 v6, v6, 0xa

    add-int/2addr v6, v4

    add-int/lit8 v6, v6, -0x41

    goto :goto_2

    :pswitch_2
    shl-int/lit8 v6, v6, 0x4

    add-int/lit8 v6, v6, 0xa

    add-int/2addr v6, v4

    add-int/lit8 v6, v6, -0x61

    .line 220
    :goto_2
    iget v4, p0, Ll/ܳ۬ۚ;->֫:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Ll/ܳ۬ۚ;->֫:I

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :goto_3
    new-array v2, v3, [Ljava/lang/Object;

    .line 216
    invoke-virtual {v1, v4, v5, v0, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return v6

    .line 224
    :catch_0
    iget-wide v4, p0, Ll/ܳ۬ۚ;->ܽ:J

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5, v0, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, -0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x41
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x61
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final ۧ()I
    .locals 2

    .line 174
    :try_start_0
    iget-object v0, p0, Ll/ܳ۬ۚ;->ᩳ:Ljava/lang/String;

    iget v1, p0, Ll/ܳ۬ۚ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/4 v0, -0x1

    return v0
.end method

.method public final ܽ()I
    .locals 6

    .line 183
    iget-object v0, p0, Ll/ܳ۬ۚ;->ᩳ:Ljava/lang/String;

    iget v1, p0, Ll/ܳ۬ۚ;->ۧ:I

    int-to-long v1, v1

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    iget v3, p0, Ll/ܳ۬ۚ;->֫:I

    int-to-long v4, v3

    or-long/2addr v1, v4

    iput-wide v1, p0, Ll/ܳ۬ۚ;->ܽ:J

    .line 185
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 186
    iget v2, p0, Ll/ܳ۬ۚ;->֫:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ܳ۬ۚ;->֫:I

    const/16 v3, 0xa

    if-eq v1, v3, :cond_2

    const/16 v4, 0xd

    if-eq v1, v4, :cond_0

    return v1

    .line 191
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v3, :cond_1

    .line 192
    iget v0, p0, Ll/ܳ۬ۚ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܳ۬ۚ;->֫:I

    .line 194
    :cond_1
    iget v0, p0, Ll/ܳ۬ۚ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܳ۬ۚ;->ۧ:I

    return v1

    .line 189
    :cond_2
    iget v0, p0, Ll/ܳ۬ۚ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܳ۬ۚ;->ۧ:I
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    const/4 v0, -0x1

    return v0
.end method
