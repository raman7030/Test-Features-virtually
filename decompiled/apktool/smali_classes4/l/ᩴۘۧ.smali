.class public final Ll/ᩴۘۧ;
.super Ljava/lang/Object;
.source "L8J4"


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ᩳ֨֫;

.field public final ܽ:Ll/᩵ۘۧ;

.field public ܿ:I

.field public ᩳ:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ll/᩵ۘۧ;

    invoke-direct {v0}, Ll/᩵ۘۧ;-><init>()V

    iput-object v0, p0, Ll/ᩴۘۧ;->ܽ:Ll/᩵ۘۧ;

    .line 33
    new-instance v0, Ll/ᩳ֨֫;

    const v1, 0xfe01

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ᩳ֨֫;-><init>([BI)V

    iput-object v0, p0, Ll/ᩴۘۧ;->ۧ:Ll/ᩳ֨֫;

    const/4 v0, -0x1

    .line 36
    iput v0, p0, Ll/ᩴۘۧ;->֫:I

    return-void
.end method

.method private ֫(I)I
    .locals 5

    const/4 v0, 0x0

    .line 141
    iput v0, p0, Ll/ᩴۘۧ;->ܿ:I

    .line 143
    :cond_0
    iget v1, p0, Ll/ᩴۘۧ;->ܿ:I

    add-int v2, p1, v1

    iget-object v3, p0, Ll/ᩴۘۧ;->ܽ:Ll/᩵ۘۧ;

    iget v4, v3, Ll/᩵ۘۧ;->ܿ:I

    if-ge v2, v4, :cond_1

    .line 144
    iget-object v3, v3, Ll/᩵ۘۧ;->ᩳ:[I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ᩴۘۧ;->ܿ:I

    aget v1, v3, v2

    add-int/2addr v0, v1

    const/16 v2, 0xff

    if-eq v1, v2, :cond_0

    :cond_1
    return v0
.end method


# virtual methods
.method public final ֫()Ll/᩵ۘۧ;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ᩴۘۧ;->ܽ:Ll/᩵ۘۧ;

    return-object v0
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 60
    :goto_0
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    .line 62
    iget-boolean v2, p0, Ll/ᩴۘۧ;->ᩳ:Z

    iget-object v3, p0, Ll/ᩴۘۧ;->ۧ:Ll/ᩳ֨֫;

    if-eqz v2, :cond_1

    .line 63
    iput-boolean v1, p0, Ll/ᩴۘۧ;->ᩳ:Z

    .line 64
    invoke-virtual {v3, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 67
    :cond_1
    :goto_1
    iget-boolean v2, p0, Ll/ᩴۘۧ;->ᩳ:Z

    if-nez v2, :cond_9

    .line 68
    iget v2, p0, Ll/ᩴۘۧ;->֫:I

    iget-object v4, p0, Ll/ᩴۘۧ;->ܽ:Ll/᩵ۘۧ;

    if-gez v2, :cond_5

    const-wide/16 v5, -0x1

    .line 84
    invoke-virtual {v4, p1, v5, v6}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;J)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 70
    invoke-virtual {v4, p1, v0}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;Z)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_3

    .line 74
    :cond_2
    iget v2, v4, Ll/᩵ۘۧ;->ܽ:I

    .line 75
    iget v5, v4, Ll/᩵ۘۧ;->᩻:I

    and-int/2addr v5, v0

    if-ne v5, v0, :cond_3

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v5

    if-nez v5, :cond_3

    .line 78
    invoke-direct {p0, v1}, Ll/ᩴۘۧ;->֫(I)I

    move-result v5

    add-int/2addr v2, v5

    .line 79
    iget v5, p0, Ll/ᩴۘۧ;->ܿ:I

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    .line 91
    :goto_2
    :try_start_0
    invoke-interface {p1, v2}, Ll/۠᩷ۧ;->ܽ(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    iput v5, p0, Ll/ᩴۘۧ;->֫:I

    goto :goto_4

    :catch_0
    :cond_4
    :goto_3
    return v1

    .line 87
    :cond_5
    :goto_4
    iget v2, p0, Ll/ᩴۘۧ;->֫:I

    invoke-direct {p0, v2}, Ll/ᩴۘۧ;->֫(I)I

    move-result v2

    .line 88
    iget v5, p0, Ll/ᩴۘۧ;->֫:I

    iget v6, p0, Ll/ᩴۘۧ;->ܿ:I

    add-int/2addr v5, v6

    if-lez v2, :cond_7

    .line 90
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v6

    add-int/2addr v6, v2

    invoke-virtual {v3, v6}, Ll/ᩳ֨֫;->֫(I)V

    .line 91
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v7

    .line 77
    :try_start_1
    invoke-interface {p1, v6, v7, v2}, Ll/۠᩷ۧ;->readFully([BII)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1

    .line 94
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v6

    add-int/2addr v6, v2

    invoke-virtual {v3, v6}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 95
    iget-object v2, v4, Ll/᩵ۘۧ;->ᩳ:[I

    add-int/lit8 v6, v5, -0x1

    aget v2, v2, v6

    const/16 v6, 0xff

    if-eq v2, v6, :cond_6

    const/4 v2, 0x1

    goto :goto_5

    :cond_6
    const/4 v2, 0x0

    :goto_5
    iput-boolean v2, p0, Ll/ᩴۘۧ;->ᩳ:Z

    goto :goto_6

    :catch_1
    return v1

    .line 99
    :cond_7
    :goto_6
    iget v2, v4, Ll/᩵ۘۧ;->ܿ:I

    if-ne v5, v2, :cond_8

    const/4 v5, -0x1

    :cond_8
    iput v5, p0, Ll/ᩴۘۧ;->֫:I

    goto :goto_1

    :cond_9
    return v0
.end method

.method public final ۧ()Ll/ᩳ֨֫;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ᩴۘۧ;->ۧ:Ll/ᩳ֨֫;

    return-object v0
.end method

.method public final ܽ()V
    .locals 4

    .line 67
    iget-object v0, p0, Ll/ᩴۘۧ;->ܽ:Ll/᩵ۘۧ;

    const/4 v1, 0x0

    iput v1, v0, Ll/᩵ۘۧ;->᩻:I

    const-wide/16 v2, 0x0

    .line 68
    iput-wide v2, v0, Ll/᩵ۘۧ;->ۧ:J

    .line 72
    iput v1, v0, Ll/᩵ۘۧ;->ܿ:I

    .line 73
    iput v1, v0, Ll/᩵ۘۧ;->ܽ:I

    .line 74
    iput v1, v0, Ll/᩵ۘۧ;->֫:I

    .line 43
    iget-object v0, p0, Ll/ᩴۘۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    const/4 v0, -0x1

    .line 44
    iput v0, p0, Ll/ᩴۘۧ;->֫:I

    .line 45
    iput-boolean v1, p0, Ll/ᩴۘۧ;->ᩳ:Z

    return-void
.end method

.method public final ᩳ()V
    .locals 4

    .line 125
    iget-object v0, p0, Ll/ᩴۘۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    array-length v1, v1

    const v2, 0xfe01

    if-ne v1, v2, :cond_0

    return-void

    .line 130
    :cond_0
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 129
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    .line 131
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    .line 128
    invoke-virtual {v0, v2, v1}, Ll/ᩳ֨֫;->֫(I[B)V

    return-void
.end method
