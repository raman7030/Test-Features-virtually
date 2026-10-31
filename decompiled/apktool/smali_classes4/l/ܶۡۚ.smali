.class public final Ll/ܶۡۚ;
.super Ljava/io/InputStream;
.source "95GT"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ᩶:Ll/᩸ۡۚ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/᩸ۡۚ;I)V
    .locals 0

    .line 88
    iput-object p1, p0, Ll/ܶۡۚ;->᩶:Ll/᩸ۡۚ;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 89
    iput p2, p0, Ll/ܶۡۚ;->᩹:I

    .line 90
    iput p2, p0, Ll/ܶۡۚ;->᩸:I

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 137
    iget-object v0, p0, Ll/ܶۡۚ;->᩶:Ll/᩸ۡۚ;

    invoke-static {v0}, Ll/᩸ۡۚ;->ۧ(Ll/᩸ۡۚ;)I

    move-result v0

    iget v1, p0, Ll/ܶۡۚ;->᩹:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final mark(I)V
    .locals 0

    .line 142
    iget p1, p0, Ll/ܶۡۚ;->᩹:I

    iput p1, p0, Ll/ܶۡۚ;->᩸:I

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .locals 3

    .line 94
    iget v0, p0, Ll/ܶۡۚ;->᩹:I

    iget-object v1, p0, Ll/ܶۡۚ;->᩶:Ll/᩸ۡۚ;

    invoke-static {v1}, Ll/᩸ۡۚ;->ۧ(Ll/᩸ۡۚ;)I

    move-result v2

    if-lt v0, v2, :cond_0

    const/4 v0, -0x1

    return v0

    .line 97
    :cond_0
    invoke-static {v1}, Ll/᩸ۡۚ;->֫(Ll/᩸ۡۚ;)[B

    move-result-object v0

    iget v1, p0, Ll/ܶۡۚ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܶۡۚ;->᩹:I

    aget-byte v0, v0, v1

    return v0
.end method

.method public final read([B)I
    .locals 4

    .line 102
    array-length v0, p1

    iget-object v1, p0, Ll/ܶۡۚ;->᩶:Ll/᩸ۡۚ;

    invoke-static {v1}, Ll/᩸ۡۚ;->ۧ(Ll/᩸ۡۚ;)I

    move-result v2

    iget v3, p0, Ll/ܶۡۚ;->᩹:I

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v2, 0x0

    if-gtz v0, :cond_1

    .line 104
    iget p1, p0, Ll/ܶۡۚ;->᩹:I

    invoke-static {v1}, Ll/᩸ۡۚ;->ۧ(Ll/᩸ۡۚ;)I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    return v2

    .line 109
    :cond_1
    invoke-static {v1}, Ll/᩸ۡۚ;->֫(Ll/᩸ۡۚ;)[B

    move-result-object v1

    iget v3, p0, Ll/ܶۡۚ;->᩹:I

    invoke-static {v1, v3, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 110
    iget p1, p0, Ll/ܶۡۚ;->᩹:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ܶۡۚ;->᩹:I

    return v0
.end method

.method public final read([BII)I
    .locals 3

    .line 116
    iget-object v0, p0, Ll/ܶۡۚ;->᩶:Ll/᩸ۡۚ;

    invoke-static {v0}, Ll/᩸ۡۚ;->ۧ(Ll/᩸ۡۚ;)I

    move-result v1

    iget v2, p0, Ll/ܶۡۚ;->᩹:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    if-gtz p3, :cond_1

    .line 118
    iget p1, p0, Ll/ܶۡۚ;->᩹:I

    invoke-static {v0}, Ll/᩸ۡۚ;->ۧ(Ll/᩸ۡۚ;)I

    move-result p2

    if-lt p1, p2, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 123
    :cond_1
    invoke-static {v0}, Ll/᩸ۡۚ;->֫(Ll/᩸ۡۚ;)[B

    move-result-object v0

    iget v1, p0, Ll/ܶۡۚ;->᩹:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 124
    iget p1, p0, Ll/ܶۡۚ;->᩹:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ܶۡۚ;->᩹:I

    return p3
.end method

.method public final reset()V
    .locals 1

    .line 147
    iget v0, p0, Ll/ܶۡۚ;->᩸:I

    iput v0, p0, Ll/ܶۡۚ;->᩹:I

    return-void
.end method

.method public final skip(J)J
    .locals 2

    .line 130
    iget-object v0, p0, Ll/ܶۡۚ;->᩶:Ll/᩸ۡۚ;

    invoke-static {v0}, Ll/᩸ۡۚ;->ۧ(Ll/᩸ۡۚ;)I

    move-result v0

    iget v1, p0, Ll/ܶۡۚ;->᩹:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    .line 131
    iget p1, p0, Ll/ܶۡۚ;->᩹:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ܶۡۚ;->᩹:I

    int-to-long p1, p2

    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
