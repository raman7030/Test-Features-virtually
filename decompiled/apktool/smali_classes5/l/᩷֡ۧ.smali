.class public final Ll/᩷֡ۧ;
.super Ljava/lang/Object;
.source "J8S4"

# interfaces
.implements Ll/ᩴۚۧ;


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 125
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ll/᩷֡ۧ;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    iput p1, p0, Ll/᩷֡ۧ;->ۧ:I

    .line 140
    iput-object p2, p0, Ll/᩷֡ۧ;->֫:Ljava/util/List;

    return-void
.end method

.method private ֫(Ll/ۘۚۧ;)Ljava/util/List;
    .locals 11

    const/16 v0, 0x20

    .line 269
    invoke-direct {p0, v0}, Ll/᩷֡ۧ;->֫(I)Z

    move-result v0

    iget-object v1, p0, Ll/᩷֡ۧ;->֫:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v1

    .line 272
    :cond_0
    new-instance v0, Ll/ᩳ֨֫;

    iget-object p1, p1, Ll/ۘۚۧ;->ۧ:[B

    invoke-direct {v0, p1}, Ll/ᩳ֨֫;-><init>([B)V

    .line 274
    :goto_0
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    if-lez p1, :cond_8

    .line 275
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    .line 276
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    .line 277
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    add-int/2addr v3, v2

    const/16 v2, 0x86

    if-ne p1, v2, :cond_7

    .line 280
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 281
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    and-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_6

    const/4 v5, 0x3

    .line 510
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v5, v6}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v5

    .line 284
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    and-int/lit16 v7, v6, 0x80

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    const/4 v7, 0x1

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_2

    and-int/lit8 v6, v6, 0x3f

    const-string v9, "application/cea-708"

    goto :goto_3

    :cond_2
    const-string v9, "application/cea-608"

    const/4 v6, 0x1

    .line 297
    :goto_3
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֨()I

    move-result v10

    int-to-byte v10, v10

    .line 299
    invoke-virtual {v0, v8}, Ll/ᩳ֨֫;->ܳ(I)V

    if-eqz v7, :cond_5

    and-int/lit8 v7, v10, 0x40

    if-eqz v7, :cond_3

    const/4 v7, 0x1

    goto :goto_4

    :cond_3
    const/4 v7, 0x0

    .line 306
    :goto_4
    sget v10, Ll/ᩳۚ֫;->֫:I

    if-eqz v7, :cond_4

    new-array v7, v8, [B

    aput-byte v8, v7, v2

    goto :goto_5

    :cond_4
    new-array v7, v8, [B

    aput-byte v2, v7, v2

    .line 98
    :goto_5
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_6

    :cond_5
    const/4 v7, 0x0

    .line 309
    :goto_6
    new-instance v8, Ll/֨ᩴ֫;

    invoke-direct {v8}, Ll/֨ᩴ֫;-><init>()V

    .line 311
    invoke-virtual {v8, v9}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 312
    invoke-virtual {v8, v5}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 313
    invoke-virtual {v8, v6}, Ll/֨ᩴ֫;->֫(I)V

    .line 314
    invoke-virtual {v8, v7}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 315
    invoke-virtual {v8}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v5

    .line 309
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    move-object v1, p1

    .line 320
    :cond_7
    invoke-virtual {v0, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_0

    :cond_8
    return-object v1
.end method

.method private ֫(I)Z
    .locals 1

    .line 327
    iget v0, p0, Ll/᩷֡ۧ;->ۧ:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫(ILl/ۘۚۧ;)Ll/֡ۚۧ;
    .locals 5

    .line 151
    iget-object v0, p2, Ll/ۘۚۧ;->ᩳ:Ljava/lang/String;

    const-string v1, "video/mp2t"

    const/4 v2, 0x2

    if-eq p1, v2, :cond_e

    const/4 v3, 0x3

    if-eq p1, v3, :cond_d

    const/4 v3, 0x4

    if-eq p1, v3, :cond_d

    const/16 v4, 0x15

    if-eq p1, v4, :cond_c

    const/16 v4, 0x1b

    if-eq p1, v4, :cond_a

    const/16 v3, 0x24

    if-eq p1, v3, :cond_9

    const/16 v3, 0x2d

    if-eq p1, v3, :cond_8

    const/16 v3, 0x59

    if-eq p1, v3, :cond_7

    const/16 v3, 0xac

    if-eq p1, v3, :cond_6

    const/16 v3, 0x101

    if-eq p1, v3, :cond_5

    const/16 v3, 0x8a

    if-eq p1, v3, :cond_4

    const/16 v3, 0x8b

    if-eq p1, v3, :cond_3

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    packed-switch p1, :pswitch_data_2

    goto/16 :goto_0

    .line 163
    :pswitch_0
    invoke-direct {p0, v2}, Ll/᩷֡ۧ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_0

    .line 165
    :cond_0
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v1, Ll/᩶֡ۧ;

    .line 166
    invoke-virtual {p2}, Ll/ۘۚۧ;->֫()I

    move-result p2

    invoke-direct {v1, v0, p2}, Ll/᩶֡ۧ;-><init>(Ljava/lang/String;I)V

    invoke-direct {p1, v1}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 198
    :pswitch_1
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v0, Ll/֡֡ۧ;

    .line 256
    new-instance v1, Ll/֨ۚۧ;

    invoke-direct {p0, p2}, Ll/᩷֡ۧ;->֫(Ll/ۘۚۧ;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v1, p2}, Ll/֨ۚۧ;-><init>(Ljava/util/List;)V

    .line 198
    invoke-direct {v0, v1}, Ll/֡֡ۧ;-><init>(Ll/֨ۚۧ;)V

    invoke-direct {p1, v0}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 157
    :pswitch_2
    invoke-direct {p0, v2}, Ll/᩷֡ۧ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    .line 159
    :cond_1
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v2, Ll/ۜ֡ۧ;

    const/4 v3, 0x0

    .line 161
    invoke-virtual {p2}, Ll/ۘۚۧ;->֫()I

    move-result p2

    invoke-direct {v2, v0, p2, v1, v3}, Ll/ۜ֡ۧ;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    invoke-direct {p1, v2}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    :pswitch_3
    const/16 p1, 0x40

    .line 175
    invoke-direct {p0, p1}, Ll/᩷֡ۧ;->֫(I)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    .line 169
    :pswitch_4
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v2, Ll/ᩳ֡ۧ;

    .line 170
    invoke-virtual {p2}, Ll/ۘۚۧ;->֫()I

    move-result p2

    invoke-direct {v2, v0, p2, v1}, Ll/ᩳ֡ۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-direct {p1, v2}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    :pswitch_5
    const/16 p1, 0x10

    .line 211
    invoke-direct {p0, p1}, Ll/᩷֡ۧ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_2

    goto/16 :goto_0

    .line 213
    :cond_2
    new-instance p1, Ll/ܿۚۧ;

    new-instance p2, Ll/ۨ֡ۧ;

    const-string v0, "application/x-scte35"

    invoke-direct {p2, v0}, Ll/ۨ֡ۧ;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ll/ܿۚۧ;-><init>(Ll/ᩳۚۧ;)V

    return-object p1

    .line 188
    :cond_3
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v1, Ll/ۢ֡ۧ;

    .line 191
    invoke-virtual {p2}, Ll/ۘۚۧ;->֫()I

    move-result p2

    const/16 v2, 0x1520

    invoke-direct {v1, v0, p2, v2}, Ll/ۢ֡ۧ;-><init>(Ljava/lang/String;II)V

    invoke-direct {p1, v1}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 181
    :cond_4
    :pswitch_6
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v1, Ll/ۢ֡ۧ;

    .line 184
    invoke-virtual {p2}, Ll/ۘۚۧ;->֫()I

    move-result p2

    const/16 v2, 0x1000

    invoke-direct {v1, v0, p2, v2}, Ll/ۢ֡ۧ;-><init>(Ljava/lang/String;II)V

    invoke-direct {p1, v1}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 222
    :cond_5
    new-instance p1, Ll/ܿۚۧ;

    new-instance p2, Ll/ۨ֡ۧ;

    const-string v0, "application/vnd.dvb.ait"

    invoke-direct {p2, v0}, Ll/ۨ֡ۧ;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ll/ܿۚۧ;-><init>(Ll/ᩳۚۧ;)V

    return-object p1

    .line 172
    :cond_6
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v2, Ll/ܳ֡ۧ;

    .line 173
    invoke-virtual {p2}, Ll/ۘۚۧ;->֫()I

    move-result p2

    invoke-direct {v2, v0, p2, v1}, Ll/ܳ֡ۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-direct {p1, v2}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 220
    :cond_7
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v0, Ll/ۡ֡ۧ;

    iget-object p2, p2, Ll/ۘۚۧ;->ܽ:Ljava/util/List;

    invoke-direct {v0, p2}, Ll/ۡ֡ۧ;-><init>(Ljava/util/List;)V

    invoke-direct {p1, v0}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 227
    :cond_8
    new-instance p1, Ll/᩺֡ۧ;

    new-instance p2, Ll/ۗ֡ۧ;

    invoke-direct {p2}, Ll/ۗ֡ۧ;-><init>()V

    invoke-direct {p1, p2}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 209
    :cond_9
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v0, Ll/᩸֡ۧ;

    .line 243
    new-instance v1, Ll/ܳۚۧ;

    invoke-direct {p0, p2}, Ll/᩷֡ۧ;->֫(Ll/ۘۚۧ;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v1, p2}, Ll/ܳۚۧ;-><init>(Ljava/util/List;)V

    .line 209
    invoke-direct {v0, v1}, Ll/᩸֡ۧ;-><init>(Ll/ܳۚۧ;)V

    invoke-direct {p1, v0}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 200
    :cond_a
    invoke-direct {p0, v3}, Ll/᩷֡ۧ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_b

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 202
    :cond_b
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v0, Ll/۠֡ۧ;

    .line 243
    new-instance v1, Ll/ܳۚۧ;

    invoke-direct {p0, p2}, Ll/᩷֡ۧ;->֫(Ll/ۘۚۧ;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v1, p2}, Ll/ܳۚۧ;-><init>(Ljava/util/List;)V

    const/4 p2, 0x1

    .line 205
    invoke-direct {p0, p2}, Ll/᩷֡ۧ;->֫(I)Z

    move-result p2

    const/16 v2, 0x8

    .line 206
    invoke-direct {p0, v2}, Ll/᩷֡ۧ;->֫(I)Z

    move-result v2

    invoke-direct {v0, v1, p2, v2}, Ll/۠֡ۧ;-><init>(Ll/ܳۚۧ;ZZ)V

    invoke-direct {p1, v0}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 218
    :cond_c
    new-instance p1, Ll/᩺֡ۧ;

    new-instance p2, Ll/᩹֡ۧ;

    invoke-direct {p2}, Ll/᩹֡ۧ;-><init>()V

    invoke-direct {p1, p2}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 154
    :cond_d
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v2, Ll/ۙ֡ۧ;

    .line 155
    invoke-virtual {p2}, Ll/ۘۚۧ;->֫()I

    move-result p2

    invoke-direct {v2, v0, p2, v1}, Ll/ۙ֡ۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-direct {p1, v2}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    .line 196
    :cond_e
    :pswitch_7
    new-instance p1, Ll/᩺֡ۧ;

    new-instance v0, Ll/ۘ֡ۧ;

    .line 256
    new-instance v2, Ll/֨ۚۧ;

    invoke-direct {p0, p2}, Ll/᩷֡ۧ;->֫(Ll/ۘۚۧ;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v2, p2}, Ll/֨ۚۧ;-><init>(Ljava/util/List;)V

    .line 196
    invoke-direct {v0, v2, v1}, Ll/ۘ֡ۧ;-><init>(Ll/֨ۚۧ;Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ll/᩺֡ۧ;-><init>(Ll/ܺ֡ۧ;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_7
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x86
        :pswitch_5
        :pswitch_4
        :pswitch_6
    .end packed-switch
.end method
