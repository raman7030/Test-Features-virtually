.class public final Ll/ۚܰۡ;
.super Ljava/io/OutputStream;
.source "84GI"


# instance fields
.field public final ۗ:Ljava/io/OutputStream;

.field public ۙ:Z

.field public final ۫:Z

.field public ۬:I

.field public final ᩶:Ll/֨ܰۡ;

.field public ᩸:[B

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Ljava/lang/String;IZ)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 16
    iput-object v0, p0, Ll/ۚܰۡ;->᩸:[B

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Ll/ۚܰۡ;->۬:I

    .line 19
    iput-boolean v0, p0, Ll/ۚܰۡ;->᩹:Z

    .line 22
    iput-object p1, p0, Ll/ۚܰۡ;->ۗ:Ljava/io/OutputStream;

    .line 23
    iput-boolean p4, p0, Ll/ۚܰۡ;->۫:Z

    .line 24
    new-instance p1, Ll/֨ܰۡ;

    invoke-direct {p1, p2, p3}, Ll/֨ܰۡ;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Ll/ۚܰۡ;->᩶:Ll/֨ܰۡ;

    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Ll/ۚܰۡ;->ۙ:Z

    return-void
.end method

.method private ֫(Z)V
    .locals 6

    .line 49
    iget-boolean v0, p0, Ll/ۚܰۡ;->ۙ:Z

    iget-object v1, p0, Ll/ۚܰۡ;->᩶:Ll/֨ܰۡ;

    iget-object v2, p0, Ll/ۚܰۡ;->ۗ:Ljava/io/OutputStream;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 50
    iput-boolean v3, p0, Ll/ۚܰۡ;->ۙ:Z

    .line 51
    iget-boolean v0, p0, Ll/ۚܰۡ;->۫:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    new-array v0, v0, [B

    const-wide v4, 0x5952434e452d544dL    # 1.8863762007861363E122

    .line 53
    invoke-static {v4, v5, v3, v0}, Ll/ܺܰۡ;->֫(JI[B)V

    .line 54
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 56
    :cond_0
    invoke-virtual {v1}, Ll/֨ܰۡ;->ܽ()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 57
    invoke-virtual {v1}, Ll/֨ܰۡ;->֫()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    :cond_1
    if-nez p1, :cond_3

    .line 59
    iget p1, p0, Ll/ۚܰۡ;->۬:I

    const/16 v0, 0x10

    if-ne p1, v0, :cond_2

    goto :goto_0

    .line 60
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 61
    :cond_3
    :goto_0
    iget p1, p0, Ll/ۚܰۡ;->۬:I

    iget-object v0, p0, Ll/ۚܰۡ;->᩸:[B

    invoke-virtual {v1, p1, v0}, Ll/֨ܰۡ;->֫(I[B)V

    .line 62
    iget p1, p0, Ll/ۚܰۡ;->۬:I

    invoke-virtual {v2, v0, v3, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 63
    iput v3, p0, Ll/ۚܰۡ;->۬:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 68
    iget-boolean v0, p0, Ll/ۚܰۡ;->᩹:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Ll/ۚܰۡ;->᩹:Z

    .line 70
    iget v1, p0, Ll/ۚܰۡ;->۬:I

    iget-object v2, p0, Ll/ۚܰۡ;->᩶:Ll/֨ܰۡ;

    iget-object v3, p0, Ll/ۚܰۡ;->ۗ:Ljava/io/OutputStream;

    if-lez v1, :cond_0

    .line 71
    invoke-direct {p0, v0}, Ll/ۚܰۡ;->֫(Z)V

    goto :goto_0

    .line 72
    :cond_0
    iget-boolean v0, p0, Ll/ۚܰۡ;->ۙ:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 73
    iput-boolean v0, p0, Ll/ۚܰۡ;->ۙ:Z

    .line 74
    iget-boolean v1, p0, Ll/ۚܰۡ;->۫:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x8

    new-array v1, v1, [B

    const-wide v4, 0x5952434e452d544dL    # 1.8863762007861363E122

    .line 76
    invoke-static {v4, v5, v0, v1}, Ll/ܺܰۡ;->֫(JI[B)V

    .line 77
    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write([B)V

    .line 79
    :cond_1
    invoke-virtual {v2}, Ll/֨ܰۡ;->ܽ()[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write([B)V

    .line 80
    invoke-virtual {v2}, Ll/֨ܰۡ;->֫()[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write([B)V

    .line 82
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ll/֨ܰۡ;->ۧ()[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write([B)V

    .line 83
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    :cond_3
    return-void
.end method

.method public final write(I)V
    .locals 3

    .line 43
    iget v0, p0, Ll/ۚܰۡ;->۬:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۚܰۡ;->۬:I

    int-to-byte p1, p1

    iget-object v2, p0, Ll/ۚܰۡ;->᩸:[B

    aput-byte p1, v2, v0

    const/16 p1, 0x10

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 45
    invoke-direct {p0, p1}, Ll/ۚܰۡ;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final write([BII)V
    .locals 4

    :cond_0
    :goto_0
    if-lez p3, :cond_1

    .line 31
    iget v0, p0, Ll/ۚܰۡ;->۬:I

    const/16 v1, 0x10

    rsub-int/lit8 v0, v0, 0x10

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 32
    iget-object v2, p0, Ll/ۚܰۡ;->᩸:[B

    iget v3, p0, Ll/ۚܰۡ;->۬:I

    invoke-static {p1, p2, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    iget v2, p0, Ll/ۚܰۡ;->۬:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ۚܰۡ;->۬:I

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    if-ne v2, v1, :cond_0

    const/4 v0, 0x0

    .line 37
    invoke-direct {p0, v0}, Ll/ۚܰۡ;->֫(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method
