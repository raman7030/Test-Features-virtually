.class public final Ll/ᩴ۠֫;
.super Ll/ۖ۠֫;
.source "V1VQ"


# instance fields
.field public ۜ:I

.field public final ۢ:Ll/ۛ᩺ۡ;

.field public ܳ:[B

.field public ܿ:I

.field public ᩷:Landroid/net/Uri;

.field public ᩻:Z


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 63
    new-instance v0, Ll/ۛ᩺ۡ;

    invoke-direct {v0, p1}, Ll/ۛ᩺ۡ;-><init>(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 74
    invoke-direct {p0, v1}, Ll/ۖ۠֫;-><init>(Z)V

    .line 75
    iput-object v0, p0, Ll/ᩴ۠֫;->ۢ:Ll/ۛ᩺ۡ;

    .line 64
    array-length p1, p1

    if-lez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 120
    iget-boolean v0, p0, Ll/ᩴ۠֫;->᩻:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 121
    iput-boolean v0, p0, Ll/ᩴ۠֫;->᩻:Z

    .line 122
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    :cond_0
    const/4 v0, 0x0

    .line 124
    iput-object v0, p0, Ll/ᩴ۠֫;->᩷:Landroid/net/Uri;

    .line 125
    iput-object v0, p0, Ll/ᩴ۠֫;->ܳ:[B

    return-void
.end method

.method public final read([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 100
    :cond_0
    iget v0, p0, Ll/ᩴ۠֫;->ܿ:I

    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    .line 104
    :cond_1
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 105
    iget-object v0, p0, Ll/ᩴ۠֫;->ܳ:[B

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget v1, p0, Ll/ᩴ۠֫;->ۜ:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 106
    iget p1, p0, Ll/ᩴ۠֫;->ۜ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ᩴ۠֫;->ۜ:I

    .line 107
    iget p1, p0, Ll/ᩴ۠֫;->ܿ:I

    sub-int/2addr p1, p3

    iput p1, p0, Ll/ᩴ۠֫;->ܿ:I

    .line 108
    invoke-virtual {p0, p3}, Ll/ۖ۠֫;->ᩳ(I)V

    return p3
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 8

    .line 80
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ۧ(Ll/ۗ۠֫;)V

    .line 81
    iget-object v0, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-wide v1, p1, Ll/ۗ۠֫;->ܳ:J

    iput-object v0, p0, Ll/ᩴ۠֫;->᩷:Landroid/net/Uri;

    .line 82
    iget-object v0, p0, Ll/ᩴ۠֫;->ۢ:Ll/ۛ᩺ۡ;

    iget-object v0, v0, Ll/ۛ᩺ۡ;->᩸:Ljava/lang/Object;

    check-cast v0, [B

    iput-object v0, p0, Ll/ᩴ۠֫;->ܳ:[B

    .line 83
    iget-wide v3, p1, Ll/ۗ۠֫;->᩻:J

    array-length v5, v0

    int-to-long v5, v5

    cmp-long v7, v3, v5

    if-gtz v7, :cond_2

    long-to-int v4, v3

    .line 86
    iput v4, p0, Ll/ᩴ۠֫;->ۜ:I

    .line 87
    array-length v0, v0

    sub-int/2addr v0, v4

    iput v0, p0, Ll/ᩴ۠֫;->ܿ:I

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    int-to-long v3, v0

    .line 89
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v0, v3

    iput v0, p0, Ll/ᩴ۠֫;->ܿ:I

    :cond_0
    const/4 v0, 0x1

    .line 91
    iput-boolean v0, p0, Ll/ᩴ۠֫;->᩻:Z

    .line 92
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    if-eqz v5, :cond_1

    return-wide v1

    .line 93
    :cond_1
    iget p1, p0, Ll/ᩴ۠֫;->ܿ:I

    int-to-long v0, p1

    return-wide v0

    .line 84
    :cond_2
    new-instance p1, Ll/᩹۠֫;

    const/16 v0, 0x7d8

    invoke-direct {p1, v0}, Ll/᩹۠֫;-><init>(I)V

    throw p1
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ᩴ۠֫;->᩷:Landroid/net/Uri;

    return-object v0
.end method
