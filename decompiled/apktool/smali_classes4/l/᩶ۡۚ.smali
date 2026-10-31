.class public final Ll/᩶ۡۚ;
.super Ljava/io/OutputStream;
.source "I5HO"


# instance fields
.field public ᩶:I

.field public final ᩸:Ljava/util/ArrayList;

.field public ᩹:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    iput-object v0, p0, Ll/᩶ۡۚ;->᩸:Ljava/util/ArrayList;

    const/16 v0, 0x4000

    new-array v0, v0, [B

    .line 26
    iput-object v0, p0, Ll/᩶ۡۚ;->᩹:[B

    return-void
.end method

.method public static ֫()Ll/֡ۡۚ;
    .locals 1

    .line 36
    new-instance v0, Ll/᩹ۡۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final write(I)V
    .locals 3

    .line 92
    iget-object v0, p0, Ll/᩶ۡۚ;->᩹:[B

    array-length v1, v0

    iget v2, p0, Ll/᩶ۡۚ;->᩶:I

    sub-int/2addr v1, v2

    if-nez v1, :cond_0

    .line 59
    iget-object v1, p0, Ll/᩶ۡۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    iget-object v0, p0, Ll/᩶ۡۚ;->᩹:[B

    array-length v0, v0

    new-array v0, v0, [B

    iput-object v0, p0, Ll/᩶ۡۚ;->᩹:[B

    const/4 v0, 0x0

    .line 61
    iput v0, p0, Ll/᩶ۡۚ;->᩶:I

    .line 63
    :cond_0
    iget-object v0, p0, Ll/᩶ۡۚ;->᩹:[B

    iget v1, p0, Ll/᩶ۡۚ;->᩶:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩶ۡۚ;->᩶:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 68
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/᩶ۡۚ;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 6

    .line 92
    iget-object v0, p0, Ll/᩶ۡۚ;->᩹:[B

    array-length v0, v0

    iget v1, p0, Ll/᩶ۡۚ;->᩶:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    sub-int v3, p3, v2

    if-lez v3, :cond_1

    .line 76
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int v3, p2, v2

    .line 77
    iget-object v4, p0, Ll/᩶ۡۚ;->᩹:[B

    iget v5, p0, Ll/᩶ۡۚ;->᩶:I

    invoke-static {p1, v3, v4, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v2, v0

    .line 79
    iget v3, p0, Ll/᩶ۡۚ;->᩶:I

    add-int/2addr v3, v0

    iput v3, p0, Ll/᩶ۡۚ;->᩶:I

    .line 92
    iget-object v0, p0, Ll/᩶ۡۚ;->᩹:[B

    array-length v4, v0

    sub-int v3, v4, v3

    if-nez v3, :cond_0

    .line 83
    iget-object v3, p0, Ll/᩶ۡۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    iget-object v0, p0, Ll/᩶ۡۚ;->᩹:[B

    array-length v0, v0

    new-array v3, v0, [B

    iput-object v3, p0, Ll/᩶ۡۚ;->᩹:[B

    .line 85
    iput v1, p0, Ll/᩶ۡۚ;->᩶:I

    goto :goto_0

    :cond_0
    move v0, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ܺۜۚ;)V
    .locals 4

    .line 46
    iget-object v0, p0, Ll/᩶ۡۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    .line 47
    invoke-virtual {p1, v2}, Ll/ܺۜۚ;->write([B)V

    goto :goto_0

    .line 49
    :cond_0
    iget v1, p0, Ll/᩶ۡۚ;->᩶:I

    const/4 v2, 0x0

    if-lez v1, :cond_1

    .line 50
    iget-object v3, p0, Ll/᩶ۡۚ;->᩹:[B

    invoke-virtual {p1, v3, v2, v1}, Ll/ܺۜۚ;->write([BII)V

    .line 52
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 53
    iput v2, p0, Ll/᩶ۡۚ;->᩶:I

    return-void
.end method
