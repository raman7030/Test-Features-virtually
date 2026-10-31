.class public final Ll/ᩴۧܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ll/ܺۧܳ;
.implements Ll/᩶֫ܳ;


# instance fields
.field public final ᩸:[B

.field public ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 5891
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5892
    new-array p1, p1, [B

    iput-object p1, p0, Ll/ᩴۧܳ;->᩸:[B

    return-void
.end method


# virtual methods
.method public final synthetic close()V
    .locals 0

    return-void
.end method

.method public final finish()V
    .locals 2

    .line 5915
    iget v0, p0, Ll/ᩴۧܳ;->᩹:I

    iget-object v1, p0, Ll/ᩴۧܳ;->᩸:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    return-void

    .line 5916
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete hex clipboard memory backing"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final length()I
    .locals 1

    .line 5922
    iget-object v0, p0, Ll/ᩴۧܳ;->᩸:[B

    array-length v0, v0

    return v0
.end method

.method public final ֫(Ll/᩷ᩳܳ;Ll/ܿۖ᩷;)I
    .locals 7

    .line 5898
    iget v0, p0, Ll/ᩴۧܳ;->᩹:I

    int-to-long v0, v0

    iget v2, p1, Ll/᩷ᩳܳ;->֫:I

    int-to-long v3, v2

    add-long/2addr v0, v3

    iget-object v3, p0, Ll/ᩴۧܳ;->᩸:[B

    array-length v4, v3

    int-to-long v4, v4

    cmp-long v6, v0, v4

    if-gtz v6, :cond_2

    .line 5901
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5904
    iget v0, p0, Ll/ᩴۧܳ;->᩹:I

    const/4 v1, 0x0

    .line 5905
    invoke-virtual {p1, v1, v3, v0, v2}, Ll/᩷ᩳܳ;->֫(I[BII)V

    .line 5906
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-nez p1, :cond_0

    .line 5909
    iget p1, p0, Ll/ᩴۧܳ;->᩹:I

    add-int/2addr p1, v2

    iput p1, p0, Ll/ᩴۧܳ;->᩹:I

    return v0

    .line 5907
    :cond_0
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    .line 5902
    :cond_1
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    .line 5899
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Hex clipboard memory backing overflow"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final ֫(I[BII)V
    .locals 3

    .line 5932
    iget v0, p0, Ll/ᩴۧܳ;->᩹:I

    iget-object v1, p0, Ll/ᩴۧܳ;->᩸:[B

    array-length v2, v1

    if-ne v0, v2, :cond_0

    .line 5935
    array-length v0, v1

    invoke-static {v0, p1, p4}, Ll/ۡܽܳ;->ܽ(III)V

    .line 5936
    array-length v0, p2

    invoke-static {v0, p3, p4}, Ll/ۡܽܳ;->ۧ(III)V

    .line 5937
    invoke-static {v1, p1, p2, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 5933
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Hex clipboard memory backing is incomplete"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic ۫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()J
    .locals 2

    .line 84
    invoke-virtual {p0}, Ll/ᩴۧܳ;->ܿ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()J
    .locals 2

    .line 5927
    iget-object v0, p0, Ll/ᩴۧܳ;->᩸:[B

    array-length v0, v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ᩺ۧ()Ll/ᩴܽܳ;
    .locals 0

    return-object p0
.end method
