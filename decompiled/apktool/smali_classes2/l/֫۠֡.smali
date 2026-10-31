.class public final Ll/֫۠֡;
.super Ljava/lang/Object;
.source "N7S0"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 169
    iput-object p1, p0, Ll/֫۠֡;->ܽ:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 3

    .line 126
    iget v0, p0, Ll/֫۠֡;->֫:I

    .line 127
    iget v1, p0, Ll/֫۠֡;->ۧ:I

    if-ge v1, p1, :cond_2

    :goto_0
    if-ge v1, p1, :cond_1

    .line 131
    iget-object v2, p0, Ll/֫۠֡;->ܽ:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v2

    if-ltz v2, :cond_0

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x8

    goto :goto_0

    .line 134
    :cond_0
    new-instance p1, Ll/᩻۠֡;

    const-string v0, "Insufficient data"

    .line 20
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 134
    throw p1

    .line 141
    :cond_1
    iput v0, p0, Ll/֫۠֡;->֫:I

    :cond_2
    sub-int/2addr v1, p1

    .line 145
    iput v1, p0, Ll/֫۠֡;->ۧ:I

    ushr-int/2addr v0, v1

    const/4 v1, 0x1

    shl-int p1, v1, p1

    sub-int/2addr p1, v1

    and-int/2addr p1, v0

    return p1
.end method

.method public final ֫()Z
    .locals 3

    .line 59
    iget v0, p0, Ll/֫۠֡;->֫:I

    .line 60
    iget v1, p0, Ll/֫۠֡;->ۧ:I

    if-lez v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 65
    :cond_0
    iget-object v2, p0, Ll/֫۠֡;->ܽ:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v2

    if-ltz v2, :cond_2

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x7

    .line 73
    iput v0, p0, Ll/֫۠֡;->֫:I

    .line 76
    :goto_0
    iput v1, p0, Ll/֫۠֡;->ۧ:I

    const/4 v2, 0x1

    shl-int v1, v2, v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    return v0

    .line 68
    :cond_2
    new-instance v0, Ll/᩻۠֡;

    const-string v1, "Insufficient data"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 68
    throw v0
.end method

.method public final ۧ()I
    .locals 4

    .line 89
    iget v0, p0, Ll/֫۠֡;->֫:I

    .line 90
    iget v1, p0, Ll/֫۠֡;->ۧ:I

    const/4 v2, 0x0

    :goto_0
    if-lez v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 97
    :cond_0
    iget-object v3, p0, Ll/֫۠֡;->ܽ:Ljava/io/InputStream;

    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    move-result v3

    if-ltz v3, :cond_2

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x7

    :goto_1
    const/4 v3, 0x1

    shl-int/2addr v3, v1

    and-int/2addr v3, v0

    if-nez v3, :cond_1

    .line 108
    iput v0, p0, Ll/֫۠֡;->֫:I

    .line 109
    iput v1, p0, Ll/֫۠֡;->ۧ:I

    return v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 100
    :cond_2
    new-instance v0, Ll/᩻۠֡;

    const-string v1, "Insufficient data"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 100
    throw v0
.end method
