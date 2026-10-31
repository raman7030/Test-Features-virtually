.class public final Ll/᩵ۘۧ;
.super Ljava/lang/Object;
.source "48MG"


# instance fields
.field public ֫:I

.field public ۧ:J

.field public final ܳ:Ll/ᩳ֨֫;

.field public ܽ:I

.field public ܿ:I

.field public final ᩳ:[I

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xff

    new-array v1, v0, [I

    .line 60
    iput-object v1, p0, Ll/᩵ۘۧ;->ᩳ:[I

    .line 62
    new-instance v1, Ll/ᩳ֨֫;

    invoke-direct {v1, v0}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v1, p0, Ll/᩵ۘۧ;->ܳ:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;J)Z
    .locals 9

    .line 105
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v0

    invoke-interface {p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    cmp-long v6, v0, v2

    if-nez v6, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 106
    iget-object v0, p0, Ll/᩵ۘۧ;->ܳ:Ll/ᩳ֨֫;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    :goto_1
    const-wide/16 v2, -0x1

    cmp-long v6, p2, v2

    if-eqz v6, :cond_1

    .line 107
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    const-wide/16 v7, 0x4

    add-long/2addr v2, v7

    cmp-long v7, v2, p2

    if-gez v7, :cond_3

    .line 109
    :cond_1
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    .line 116
    :try_start_0
    invoke-interface {p1, v5, v4, v1, v2}, Ll/۠᩷ۧ;->ۧ(ZII[B)Z

    move-result v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_3

    .line 110
    invoke-virtual {v0, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 111
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    const-wide/32 v6, 0x4f676753

    cmp-long v8, v2, v6

    if-nez v8, :cond_2

    .line 112
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    return v5

    .line 116
    :cond_2
    invoke-interface {p1, v5}, Ll/۠᩷ۧ;->ܽ(I)V

    goto :goto_1

    :cond_3
    :goto_3
    if-eqz v6, :cond_4

    .line 119
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v0

    cmp-long v2, v0, p2

    if-gez v2, :cond_5

    .line 120
    :cond_4
    invoke-interface {p1, v5}, Ll/۠᩷ۧ;->ۧ(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    goto :goto_3

    :cond_5
    return v4
.end method

.method public final ֫(Ll/۠᩷ۧ;Z)Z
    .locals 7

    const/4 v0, 0x0

    .line 67
    iput v0, p0, Ll/᩵ۘۧ;->᩻:I

    const-wide/16 v1, 0x0

    .line 68
    iput-wide v1, p0, Ll/᩵ۘۧ;->ۧ:J

    .line 72
    iput v0, p0, Ll/᩵ۘۧ;->ܿ:I

    .line 73
    iput v0, p0, Ll/᩵ۘۧ;->ܽ:I

    .line 74
    iput v0, p0, Ll/᩵ۘۧ;->֫:I

    .line 135
    iget-object v1, p0, Ll/᩵ۘۧ;->ܳ:Ll/ᩳ֨֫;

    const/16 v2, 0x1b

    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 136
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 116
    :try_start_0
    invoke-interface {p1, p2, v0, v2, v3}, Ll/۠᩷ۧ;->ۧ(ZII[B)Z

    move-result v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    if-eqz p2, :cond_7

    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_6

    .line 137
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    const-wide/32 v4, 0x4f676753

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    goto :goto_3

    .line 141
    :cond_0
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    if-eqz v2, :cond_2

    if-eqz p2, :cond_1

    goto :goto_3

    :cond_1
    const-string p1, "unsupported bit stream revision"

    .line 146
    invoke-static {p1}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 150
    :cond_2
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    iput v2, p0, Ll/᩵ۘۧ;->᩻:I

    .line 152
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ۢ()J

    move-result-wide v2

    iput-wide v2, p0, Ll/᩵ۘۧ;->ۧ:J

    .line 153
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܺ()J

    .line 154
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܺ()J

    .line 155
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܺ()J

    .line 156
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    iput v2, p0, Ll/᩵ۘۧ;->ܿ:I

    add-int/lit8 v3, v2, 0x1b

    .line 157
    iput v3, p0, Ll/᩵ۘۧ;->ܽ:I

    .line 160
    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 161
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    iget v3, p0, Ll/᩵ۘۧ;->ܿ:I

    .line 116
    :try_start_1
    invoke-interface {p1, p2, v0, v3, v2}, Ll/۠᩷ۧ;->ۧ(ZII[B)Z

    move-result p1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_3

    goto :goto_3

    .line 164
    :cond_3
    :goto_2
    iget p1, p0, Ll/᩵ۘۧ;->ܿ:I

    if-ge v0, p1, :cond_4

    .line 165
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    iget-object p2, p0, Ll/᩵ۘۧ;->ᩳ:[I

    aput p1, p2, v0

    .line 166
    iget p2, p0, Ll/᩵ۘۧ;->֫:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/᩵ۘۧ;->֫:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    const/4 p1, 0x1

    return p1

    .line 121
    :cond_5
    throw p1

    :cond_6
    :goto_3
    return v0

    :cond_7
    throw v2
.end method
