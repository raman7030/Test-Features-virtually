.class public final Ll/ܿ᩵ܿ;
.super Ljava/lang/Object;
.source "01UY"


# static fields
.field public static ܿ:Ll/ᩳ᩵ܿ;

.field public static final ᩳ:Ll/ۧ᩵ܿ;


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/ۧ᩵ܿ;

.field public ܽ:Ll/ᩳ᩵ܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Ll/ۧ᩵ܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܿ᩵ܿ;->ᩳ:Ll/ۧ᩵ܿ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    sget-object v0, Ll/ܿ᩵ܿ;->ᩳ:Ll/ۧ᩵ܿ;

    iput-object v0, p0, Ll/ܿ᩵ܿ;->ۧ:Ll/ۧ᩵ܿ;

    return-void
.end method

.method public constructor <init>(Ll/ᩳ᩵ܿ;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ll/ܿ᩵ܿ;-><init>()V

    .line 61
    iput-object p1, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    const/4 p1, 0x1

    .line 62
    iput-boolean p1, p0, Ll/ܿ᩵ܿ;->֫:Z

    return-void
.end method

.method public static ܿ(Ll/ܶ᩵ܿ;)Ll/ۧ᩹ܿ;
    .locals 2

    .line 202
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object p0

    return-object p0

    .line 205
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    .line 0
    instance-of v0, p0, Ll/۬۠ܿ;

    if-eqz v0, :cond_1

    .line 206
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۧ()Ll/۬۠ܿ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۬۠ܿ;->᩶ۧ()Ll/ۧ᩹ܿ;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;)Ll/ܽ᩵ܿ;
    .locals 3

    const/4 v0, 0x0

    .line 82
    iput-object v0, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    .line 83
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    :try_start_0
    iget-object v0, p0, Ll/ܿ᩵ܿ;->ۧ:Ll/ۧ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {p1}, Landroid/system/Os;->stat(Ljava/lang/String;)Landroid/system/StructStat;

    move-result-object p1

    .line 25
    new-instance v0, Ll/ᩳ᩵ܿ;

    iget v1, p1, Landroid/system/StructStat;->st_mode:I

    and-int/lit16 v1, v1, 0xfff

    iget v2, p1, Landroid/system/StructStat;->st_uid:I

    iget p1, p1, Landroid/system/StructStat;->st_gid:I

    invoke-direct {v0, v1, v2, p1}, Ll/ᩳ᩵ܿ;-><init>(III)V

    .line 85
    iput-object v0, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    .line 86
    sget-object p1, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 88
    :catch_0
    sget-object p1, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    return-object p1

    .line 0
    :cond_0
    instance-of v0, p1, Ll/۬ܶܿ;

    if-eqz v0, :cond_2

    .line 92
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩻()Ll/۬ܶܿ;

    move-result-object p1

    .line 93
    invoke-virtual {p1}, Ll/۬ܶܿ;->ۡܽ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 94
    sget-object p1, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    return-object p1

    .line 96
    :cond_1
    invoke-virtual {p1}, Ll/۬ܶܿ;->᩷ܽ()Ll/ۗܶܿ;

    move-result-object p1

    .line 97
    new-instance v0, Ll/ᩳ᩵ܿ;

    invoke-virtual {p1}, Ll/ۗܶܿ;->ܿ()I

    move-result v1

    invoke-virtual {p1}, Ll/ۗܶܿ;->ܳ()I

    move-result v2

    invoke-virtual {p1}, Ll/ۗܶܿ;->֫()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Ll/ᩳ᩵ܿ;-><init>(III)V

    iput-object v0, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    .line 98
    sget-object p1, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;

    return-object p1

    .line 100
    :cond_2
    invoke-static {p1}, Ll/ܿ᩵ܿ;->ܿ(Ll/ܶ᩵ܿ;)Ll/ۧ᩹ܿ;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 101
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 104
    :cond_3
    invoke-virtual {p1}, Ll/ۧ᩹ܿ;->ۛۧ()Ll/ܿ᩹ܿ;

    move-result-object v0

    if-nez v0, :cond_4

    .line 107
    :try_start_1
    invoke-virtual {p1}, Ll/ۧ᩹ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 109
    :catch_1
    sget-object p1, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    return-object p1

    .line 112
    :cond_4
    :goto_0
    new-instance p1, Ll/ᩳ᩵ܿ;

    invoke-direct {p1, v0}, Ll/ᩳ᩵ܿ;-><init>(Ll/ܿ᩹ܿ;)V

    iput-object p1, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    .line 113
    sget-object p1, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;

    return-object p1

    .line 102
    :cond_5
    :goto_1
    sget-object p1, Ll/ܽ᩵ܿ;->ۗ:Ll/ܽ᩵ܿ;

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 52
    iput-boolean v0, p0, Ll/ܿ᩵ܿ;->֫:Z

    return-void
.end method

.method public final ֫(Ll/ᩳ᩵ܿ;)V
    .locals 0

    .line 44
    iput-object p1, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    return-void
.end method

.method public final ۧ()Ll/ᩳ᩵ܿ;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    return-object v0
.end method

.method public final ۧ(Ll/ܶ᩵ܿ;)V
    .locals 3

    .line 222
    iget-boolean v0, p0, Ll/ܿ᩵ܿ;->֫:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 225
    iput-object v0, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    .line 226
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 0
    instance-of v0, p1, Ll/۬ܶܿ;

    if-eqz v0, :cond_7

    .line 228
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩻()Ll/۬ܶܿ;

    move-result-object p1

    .line 229
    invoke-virtual {p1}, Ll/۬ܶܿ;->ۡܽ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 230
    invoke-virtual {p1}, Ll/۬ܶܿ;->᩷ܽ()Ll/ۗܶܿ;

    move-result-object p1

    .line 231
    new-instance v0, Ll/ᩳ᩵ܿ;

    invoke-virtual {p1}, Ll/ۗܶܿ;->ܿ()I

    move-result v1

    invoke-virtual {p1}, Ll/ۗܶܿ;->ܳ()I

    move-result v2

    invoke-virtual {p1}, Ll/ۗܶܿ;->֫()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Ll/ᩳ᩵ܿ;-><init>(III)V

    iput-object v0, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    return-void

    .line 238
    :cond_1
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v1

    invoke-interface {v1}, Ll/֡᩶ܿ;->֫()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 240
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 241
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ۛۧ()Ll/ܿ᩹ܿ;

    move-result-object v0

    goto :goto_0

    .line 0
    :cond_2
    instance-of v1, p1, Ll/۬۠ܿ;

    if-eqz v1, :cond_3

    .line 242
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۧ()Ll/۬۠ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۬۠ܿ;->᩶ۧ()Ll/ۧ᩹ܿ;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 243
    invoke-virtual {v1}, Ll/ۧ᩹ܿ;->ۛۧ()Ll/ܿ᩹ܿ;

    move-result-object v0

    if-nez v0, :cond_5

    .line 246
    :try_start_0
    invoke-virtual {v1}, Ll/ۧ᩹ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 251
    :cond_3
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 253
    sget-object v1, Ll/ܿ᩵ܿ;->ܿ:Ll/ᩳ᩵ܿ;

    if-eqz v1, :cond_4

    .line 254
    iput-object v1, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    return-void

    :cond_4
    const/4 v2, 0x1

    :cond_5
    :goto_0
    if-nez v0, :cond_6

    .line 261
    :try_start_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    :cond_6
    :goto_1
    if-eqz v0, :cond_7

    .line 267
    new-instance p1, Ll/ᩳ᩵ܿ;

    invoke-direct {p1, v0}, Ll/ᩳ᩵ܿ;-><init>(Ll/ܿ᩹ܿ;)V

    iput-object p1, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    if-eqz v2, :cond_7

    const/16 v0, 0x1ff

    .line 270
    iput v0, p1, Ll/ᩳ᩵ܿ;->ۧ:I

    .line 271
    sput-object p1, Ll/ܿ᩵ܿ;->ܿ:Ll/ᩳ᩵ܿ;

    :cond_7
    :goto_2
    return-void
.end method

.method public final ܽ(Ll/ܶ᩵ܿ;)Ll/ܽ᩵ܿ;
    .locals 8

    .line 120
    iget-object v0, p0, Ll/ܿ᩵ܿ;->ۧ:Ll/ۧ᩵ܿ;

    iget-object v1, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    if-nez v1, :cond_0

    .line 122
    sget-object p1, Ll/ܽ᩵ܿ;->ۗ:Ll/ܽ᩵ܿ;

    return-object p1

    .line 121
    :cond_0
    iget v2, v1, Ll/ᩳ᩵ܿ;->ܽ:I

    iget v3, v1, Ll/ᩳ᩵ܿ;->֫:I

    .line 124
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_9

    .line 127
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {v4}, Landroid/system/Os;->stat(Ljava/lang/String;)Landroid/system/StructStat;

    move-result-object v4

    .line 25
    iget v6, v4, Landroid/system/StructStat;->st_mode:I

    and-int/lit16 v6, v6, 0xfff

    iget v7, v4, Landroid/system/StructStat;->st_uid:I

    iget v4, v4, Landroid/system/StructStat;->st_gid:I
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2

    if-ne v7, v2, :cond_2

    if-eq v4, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v4, 0x1

    :goto_1
    if-eqz v4, :cond_3

    .line 136
    :try_start_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    invoke-static {v7, v2, v3}, Landroid/system/Os;->chown(Ljava/lang/String;II)V
    :try_end_1
    .catch Landroid/system/ErrnoException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v2, 0x1

    :goto_3
    if-nez v4, :cond_4

    .line 142
    iget v3, v1, Ll/ᩳ᩵ܿ;->ۧ:I

    if-eq v6, v3, :cond_5

    .line 144
    :cond_4
    :try_start_2
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    iget v1, v1, Ll/ᩳ᩵ܿ;->ۧ:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-static {p1, v1}, Landroid/system/Os;->chmod(Ljava/lang/String;I)V
    :try_end_2
    .catch Landroid/system/ErrnoException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    const/4 v5, 0x0

    :cond_5
    :goto_4
    if-eqz v5, :cond_6

    if-eqz v2, :cond_6

    .line 192
    sget-object p1, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;

    goto :goto_6

    :cond_6
    if-nez v5, :cond_8

    if-eqz v2, :cond_7

    goto :goto_5

    .line 197
    :cond_7
    sget-object p1, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    goto :goto_6

    .line 195
    :cond_8
    :goto_5
    sget-object p1, Ll/ܽ᩵ܿ;->᩶:Ll/ܽ᩵ܿ;

    :goto_6
    return-object p1

    .line 129
    :catch_2
    sget-object p1, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    return-object p1

    .line 0
    :cond_9
    instance-of v0, p1, Ll/۬ܶܿ;

    const/4 v4, -0x1

    if-eqz v0, :cond_c

    .line 152
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩻()Ll/۬ܶܿ;

    move-result-object p1

    iget v0, v1, Ll/ᩳ᩵ܿ;->ۧ:I

    invoke-virtual {p1, v0}, Ll/۬ܶܿ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_b

    if-ne v2, v4, :cond_a

    if-ne v3, v4, :cond_a

    .line 156
    sget-object p1, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;

    return-object p1

    :cond_a
    sget-object p1, Ll/ܽ᩵ܿ;->᩶:Ll/ܽ᩵ܿ;

    return-object p1

    .line 157
    :cond_b
    sget-object p1, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    return-object p1

    .line 159
    :cond_c
    invoke-static {p1}, Ll/ܿ᩵ܿ;->ܿ(Ll/ܶ᩵ܿ;)Ll/ۧ᩹ܿ;

    move-result-object v0

    if-eqz v0, :cond_15

    .line 160
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v7

    invoke-interface {v7}, Ll/֡᩶ܿ;->֫()Z

    move-result v7

    if-nez v7, :cond_d

    goto :goto_d

    .line 163
    :cond_d
    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    if-eq v2, v4, :cond_f

    if-eq v3, v4, :cond_f

    .line 166
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧ᩹ܿ;->֫ܽ()Z

    move-result p1

    if-eqz p1, :cond_e

    goto :goto_8

    .line 171
    :cond_e
    :try_start_3
    invoke-static {v0, v2, v3, v6, v6}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;IIZZ)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_7

    :cond_f
    if-ne v2, v4, :cond_11

    if-eq v3, v4, :cond_10

    goto :goto_8

    :cond_10
    :goto_7
    const/4 p1, 0x1

    goto :goto_9

    :catch_3
    :cond_11
    :goto_8
    const/4 p1, 0x0

    .line 181
    :goto_9
    :try_start_4
    iget v1, v1, Ll/ᩳ᩵ܿ;->ۧ:I

    invoke-static {v0, v1, v6, v6}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;IZZ)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_a

    :catch_4
    const/4 v5, 0x0

    :goto_a
    if-eqz v5, :cond_12

    if-eqz p1, :cond_12

    .line 192
    sget-object p1, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;

    goto :goto_c

    :cond_12
    if-nez v5, :cond_14

    if-eqz p1, :cond_13

    goto :goto_b

    .line 197
    :cond_13
    sget-object p1, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    goto :goto_c

    .line 195
    :cond_14
    :goto_b
    sget-object p1, Ll/ܽ᩵ܿ;->᩶:Ll/ܽ᩵ܿ;

    :goto_c
    return-object p1

    .line 161
    :cond_15
    :goto_d
    sget-object p1, Ll/ܽ᩵ܿ;->ۗ:Ll/ܽ᩵ܿ;

    return-object p1
.end method

.method public final ᩳ(Ll/ܶ᩵ܿ;)V
    .locals 5

    .line 317
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 0
    :cond_0
    instance-of v0, p1, Ll/۬ܶܿ;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ll/۬۠ܿ;

    if-eqz v0, :cond_6

    .line 322
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 282
    :goto_0
    iget-object v0, p0, Ll/ܿ᩵ܿ;->ܽ:Ll/ᩳ᩵ܿ;

    if-nez v0, :cond_2

    goto :goto_3

    .line 283
    :cond_2
    iget v1, v0, Ll/ᩳ᩵ܿ;->֫:I

    iget v2, v0, Ll/ᩳ᩵ܿ;->ܽ:I

    .line 0
    instance-of v3, p1, Ll/۬ܶܿ;

    if-eqz v3, :cond_3

    .line 287
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩻()Ll/۬ܶܿ;

    move-result-object p1

    iget v0, v0, Ll/ᩳ᩵ܿ;->ۧ:I

    invoke-virtual {p1, v0}, Ll/۬ܶܿ;->֫(I)Z

    return-void

    .line 291
    :cond_3
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v3

    invoke-interface {v3}, Ll/֡᩶ܿ;->֫()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 0
    instance-of v3, p1, Ll/۬۠ܿ;

    if-eqz v3, :cond_4

    .line 293
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۧ()Ll/۬۠ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۬۠ܿ;->᩶ۧ()Ll/ۧ᩹ܿ;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 294
    invoke-virtual {v3}, Ll/ۧ᩹ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 296
    :cond_4
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    :goto_1
    const/4 v4, 0x0

    .line 299
    :try_start_0
    iget v0, v0, Ll/ᩳ᩵ܿ;->ۧ:I

    invoke-static {v3, v0, v4, v4}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;IZZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    :goto_2
    const/4 v0, -0x1

    if-eq v2, v0, :cond_6

    if-eq v1, v0, :cond_6

    .line 304
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧ᩹ܿ;->֫ܽ()Z

    move-result p1

    if-nez p1, :cond_6

    .line 306
    :cond_5
    :try_start_1
    invoke-static {v3, v2, v1, v4, v4}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;IIZZ)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_6
    :goto_3
    return-void
.end method
