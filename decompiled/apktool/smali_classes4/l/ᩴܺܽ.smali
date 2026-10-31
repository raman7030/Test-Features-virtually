.class public final Ll/ᩴܺܽ;
.super Ljava/lang/Object;
.source "19TR"


# instance fields
.field public ֫:[B

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 8
    iput-object v0, p0, Ll/ᩴܺܽ;->֫:[B

    .line 9
    array-length v0, v0

    iput v0, p0, Ll/ᩴܺܽ;->ۧ:I

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Ll/ᩴܺܽ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/InputStream;)Z
    .locals 5

    .line 34
    iget v0, p0, Ll/ᩴܺܽ;->ۧ:I

    const/high16 v1, 0x80000

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return v2

    :cond_0
    mul-int/lit8 v0, v0, 0x2

    .line 38
    iget-object v1, p0, Ll/ᩴܺܽ;->֫:[B

    array-length v3, v1

    if-le v0, v3, :cond_1

    .line 39
    new-array v3, v0, [B

    .line 40
    iget v4, p0, Ll/ᩴܺܽ;->ܽ:I

    invoke-static {v1, v2, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 41
    iput-object v3, p0, Ll/ᩴܺܽ;->֫:[B

    .line 43
    :cond_1
    iput v0, p0, Ll/ᩴܺܽ;->ۧ:I

    .line 49
    iget-object v1, p0, Ll/ᩴܺܽ;->֫:[B

    .line 50
    iget v2, p0, Ll/ᩴܺܽ;->ܽ:I

    :goto_0
    if-ge v2, v0, :cond_3

    sub-int v3, v0, v2

    .line 53
    invoke-virtual {p1, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-gez v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v2, v3

    goto :goto_0

    .line 59
    :cond_3
    :goto_1
    iput v2, p0, Ll/ᩴܺܽ;->ܽ:I

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫()[B
    .locals 1

    .line 13
    iget-object v0, p0, Ll/ᩴܺܽ;->֫:[B

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 17
    iget v0, p0, Ll/ᩴܺܽ;->ܽ:I

    return v0
.end method

.method public final ۧ(Ljava/io/InputStream;)Z
    .locals 5

    const/4 v0, 0x0

    .line 29
    iput v0, p0, Ll/ᩴܺܽ;->ܽ:I

    .line 49
    iget-object v1, p0, Ll/ᩴܺܽ;->֫:[B

    .line 51
    iget v2, p0, Ll/ᩴܺܽ;->ۧ:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    sub-int v4, v2, v3

    .line 53
    invoke-virtual {p1, v1, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-gez v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v3, v4

    goto :goto_0

    .line 59
    :cond_1
    :goto_1
    iput v3, p0, Ll/ᩴܺܽ;->ܽ:I

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 21
    iget v0, p0, Ll/ᩴܺܽ;->ۧ:I

    iget v1, p0, Ll/ᩴܺܽ;->ܽ:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
