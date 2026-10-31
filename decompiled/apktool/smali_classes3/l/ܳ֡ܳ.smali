.class public final Ll/ܳ֡ܳ;
.super Ljava/lang/Object;
.source "N12S"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:J

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:J


# direct methods
.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;)V
    .locals 13

    move-object v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "folder"

    .line 116
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "application/vnd.android.package-archive"

    const-string v6, "application/zip"

    const-string v7, "application/x-jar"

    const-string v8, "application/vnd.android.package-archives"

    const-string v9, "zip"

    const-string v10, "apk"

    const-string v11, "."

    if-eqz v4, :cond_0

    goto :goto_2

    .line 119
    :cond_0
    invoke-virtual {v11, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۖ֨ܿ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 120
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x3

    goto :goto_1

    :sswitch_1
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x2

    goto :goto_1

    :sswitch_2
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x1

    goto :goto_1

    :sswitch_3
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x0

    goto :goto_1

    :goto_0
    const/4 v4, -0x1

    :goto_1
    packed-switch v4, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    move-object v4, v10

    goto :goto_3

    :pswitch_1
    move-object v4, v9

    goto :goto_3

    :goto_2
    move-object v4, v1

    .line 89
    :goto_3
    iput-object v4, v0, Ll/ܳ֡ܳ;->ܿ:Ljava/lang/String;

    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_6

    .line 119
    :cond_5
    invoke-virtual {v11, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/ۖ֨ܿ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_1

    goto :goto_4

    :sswitch_4
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    const/4 v3, 0x3

    goto :goto_5

    :sswitch_5
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    const/4 v3, 0x2

    goto :goto_5

    :sswitch_6
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    const/4 v3, 0x1

    goto :goto_5

    :sswitch_7
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    goto :goto_5

    :goto_4
    const/4 v3, -0x1

    :goto_5
    packed-switch v3, :pswitch_data_1

    goto :goto_6

    :pswitch_2
    move-object v9, v10

    goto :goto_7

    :goto_6
    move-object v9, v2

    .line 90
    :goto_7
    :pswitch_3
    iput-object v9, v0, Ll/ܳ֡ܳ;->ܳ:Ljava/lang/String;

    .line 91
    iput-object v1, v0, Ll/ܳ֡ܳ;->֫:Ljava/lang/String;

    .line 92
    iput-object v2, v0, Ll/ܳ֡ܳ;->ۧ:Ljava/lang/String;

    move-wide v1, p1

    .line 93
    iput-wide v1, v0, Ll/ܳ֡ܳ;->ܽ:J

    move-wide/from16 v1, p3

    .line 94
    iput-wide v1, v0, Ll/ܳ֡ܳ;->ᩳ:J

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6a11f968 -> :sswitch_3
        -0x505c5e39 -> :sswitch_2
        -0x4a67ee1e -> :sswitch_1
        0x4d6213b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x6a11f968 -> :sswitch_7
        -0x505c5e39 -> :sswitch_6
        -0x4a67ee1e -> :sswitch_5
        0x4d6213b -> :sswitch_4
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public final ֫()Z
    .locals 5

    const-string v0, "zip"

    .line 102
    iget-object v1, p0, Ll/ܳ֡ܳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "apk"

    iget-object v4, p0, Ll/ܳ֡ܳ;->ܳ:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 103
    :cond_0
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ܳ֡ܳ;->ܿ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܳ֡ܳ;->ܳ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
