.class public final Ll/ܳ᩵ۧ;
.super Ljava/lang/Object;
.source "C8PP"


# instance fields
.field public final ֫:I

.field public final ۜ:I

.field public final ۡ:I

.field public final ۢ:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIIIIIIIIII)V
    .locals 0

    .line 342
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 343
    iput p1, p0, Ll/ܳ᩵ۧ;->᩻:I

    .line 344
    iput p2, p0, Ll/ܳ᩵ۧ;->֫:I

    .line 345
    iput p3, p0, Ll/ܳ᩵ۧ;->᩷:I

    .line 346
    iput p4, p0, Ll/ܳ᩵ۧ;->ۜ:I

    .line 347
    iput p5, p0, Ll/ܳ᩵ۧ;->ᩳ:I

    .line 348
    iput p6, p0, Ll/ܳ᩵ۧ;->ۧ:I

    .line 349
    iput p7, p0, Ll/ܳ᩵ۧ;->ܿ:I

    .line 350
    iput p8, p0, Ll/ܳ᩵ۧ;->ۡ:I

    .line 351
    iput p9, p0, Ll/ܳ᩵ۧ;->ۢ:I

    .line 352
    iput p10, p0, Ll/ܳ᩵ۧ;->ܽ:I

    .line 353
    iput p11, p0, Ll/ܳ᩵ۧ;->ܳ:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ܳ᩵ۧ;
    .locals 14

    const/4 v0, 0x7

    .line 374
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, ","

    invoke-static {p0, v0}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/4 v12, -0x1

    .line 375
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_a

    .line 376
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v13

    sparse-switch v13, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v13, "outlinecolour"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v2, 0x9

    goto/16 :goto_2

    :sswitch_1
    const-string v13, "alignment"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v2, 0x8

    goto/16 :goto_2

    :sswitch_2
    const-string v13, "borderstyle"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x7

    goto :goto_2

    :sswitch_3
    const-string v13, "fontsize"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x6

    goto :goto_2

    :sswitch_4
    const-string v13, "name"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x5

    goto :goto_2

    :sswitch_5
    const-string v13, "bold"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x4

    goto :goto_2

    :sswitch_6
    const-string v13, "primarycolour"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    const/4 v2, 0x3

    goto :goto_2

    :sswitch_7
    const-string v13, "strikeout"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_1

    :cond_7
    const/4 v2, 0x2

    goto :goto_2

    :sswitch_8
    const-string v13, "underline"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_1

    :cond_8
    const/4 v2, 0x1

    goto :goto_2

    :sswitch_9
    const-string v13, "italic"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_1

    :cond_9
    const/4 v2, 0x0

    goto :goto_2

    :goto_1
    const/4 v2, -0x1

    :goto_2
    packed-switch v2, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    move v6, v1

    goto :goto_3

    :pswitch_1
    move v4, v1

    goto :goto_3

    :pswitch_2
    move v12, v1

    goto :goto_3

    :pswitch_3
    move v7, v1

    goto :goto_3

    :pswitch_4
    move v3, v1

    goto :goto_3

    :pswitch_5
    move v8, v1

    goto :goto_3

    :pswitch_6
    move v5, v1

    goto :goto_3

    :pswitch_7
    move v11, v1

    goto :goto_3

    :pswitch_8
    move v10, v1

    goto :goto_3

    :pswitch_9
    move v9, v1

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_a
    if-eq v3, v0, :cond_b

    .line 410
    new-instance v0, Ll/ܳ᩵ۧ;

    array-length v13, p0

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Ll/ܳ᩵ۧ;-><init>(IIIIIIIIIII)V

    return-object v0

    :cond_b
    const/4 p0, 0x0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x4642c5d0 -> :sswitch_9
        -0x3d363934 -> :sswitch_8
        -0xb7325a4 -> :sswitch_7
        -0x43a3db2 -> :sswitch_6
        0x2e3a85 -> :sswitch_5
        0x337a8b -> :sswitch_4
        0x15d92cd0 -> :sswitch_3
        0x2dbc6505 -> :sswitch_2
        0x695fa1e3 -> :sswitch_1
        0x76840c8e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
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
