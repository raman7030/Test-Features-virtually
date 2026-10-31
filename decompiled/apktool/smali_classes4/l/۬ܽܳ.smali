.class public final Ll/۬ܽܳ;
.super Ljava/lang/Object;
.source "970R"

# interfaces
.implements Ll/᩹ܽܳ;


# instance fields
.field public final ֫:Ll/ۧᩳܳ;

.field public final ۧ:[B


# direct methods
.method public constructor <init>(Ll/ۧᩳܳ;[B)V
    .locals 2

    .line 700
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 701
    invoke-virtual {p1}, Ll/ۧᩳܳ;->ܽ()I

    move-result v0

    array-length v1, p2

    if-ne v0, v1, :cond_0

    array-length v0, p2

    if-eqz v0, :cond_0

    .line 704
    iput-object p1, p0, Ll/۬ܽܳ;->֫:Ll/ۧᩳܳ;

    .line 705
    iput-object p2, p0, Ll/۬ܽܳ;->ۧ:[B

    return-void

    .line 702
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid literal patch layer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ֫(Ll/۬ܽܳ;I[B[JII)V
    .locals 2

    sub-int/2addr p5, p1

    .line 720
    iget-object p0, p0, Ll/۬ܽܳ;->ۧ:[B

    aget-byte p0, p0, p4

    aput-byte p0, p2, p5

    ushr-int/lit8 p0, p5, 0x6

    .line 721
    aget-wide p1, p3, p0

    and-int/lit8 p4, p5, 0x3f

    const-wide/16 v0, 0x1

    shl-long p4, v0, p4

    or-long/2addr p1, p4

    aput-wide p1, p3, p0

    return-void
.end method

.method public static synthetic ֫(Ll/۬ܽܳ;[BIIII)V
    .locals 0

    add-int/2addr p2, p5

    sub-int/2addr p2, p3

    .line 712
    iget-object p0, p0, Ll/۬ܽܳ;->ۧ:[B

    aget-byte p0, p0, p4

    aput-byte p0, p1, p2

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 4

    .line 755
    iget-object v0, p0, Ll/۬ܽܳ;->֫:Ll/ۧᩳܳ;

    invoke-virtual {v0}, Ll/ۧᩳܳ;->ܽ()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x9

    mul-long v0, v0, v2

    const-wide/16 v2, 0x80

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ֫(II[J)V
    .locals 1

    .line 728
    new-instance v0, Ll/ۙܽܳ;

    invoke-direct {v0, p1, p3}, Ll/ۙܽܳ;-><init>(I[J)V

    iget-object p3, p0, Ll/۬ܽܳ;->֫:Ll/ۧᩳܳ;

    invoke-virtual {p3, p1, p2, v0}, Ll/ۧᩳܳ;->֫(IILl/᩸ܽܳ;)V

    return-void
.end method

.method public final ֫(I[BII)V
    .locals 1

    .line 711
    new-instance v0, Ll/ۗܽܳ;

    invoke-direct {v0, p0, p2, p4, p1}, Ll/ۗܽܳ;-><init>(Ll/۬ܽܳ;[BII)V

    iget-object p2, p0, Ll/۬ܽܳ;->֫:Ll/ۧᩳܳ;

    invoke-virtual {p2, p1, p3, v0}, Ll/ۧᩳܳ;->֫(IILl/᩸ܽܳ;)V

    return-void
.end method

.method public final ֫(Ljava/io/DataOutputStream;II)V
    .locals 3

    .line 768
    iget-object v0, p0, Ll/۬ܽܳ;->֫:Ll/ۧᩳܳ;

    invoke-virtual {v0, p2, p3}, Ll/ۧᩳܳ;->֫(II)I

    move-result v1

    .line 769
    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    const/4 v1, 0x0

    .line 770
    :goto_0
    invoke-virtual {v0}, Ll/ۧᩳܳ;->ܽ()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 771
    invoke-virtual {v0, v1}, Ll/ۧᩳܳ;->ܽ(I)I

    move-result v2

    if-lt v2, p2, :cond_0

    if-ge v2, p3, :cond_0

    sub-int/2addr v2, p2

    .line 773
    invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 774
    iget-object v2, p0, Ll/۬ܽܳ;->ۧ:[B

    aget-byte v2, v2, v1

    invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫([BII[J)V
    .locals 1

    .line 718
    new-instance v0, Ll/᩶ܽܳ;

    invoke-direct {v0, p0, p2, p1, p4}, Ll/᩶ܽܳ;-><init>(Ll/۬ܽܳ;I[B[J)V

    iget-object p1, p0, Ll/۬ܽܳ;->֫:Ll/ۧᩳܳ;

    invoke-virtual {p1, p2, p3, v0}, Ll/ۧᩳܳ;->֫(IILl/᩸ܽܳ;)V

    return-void
.end method

.method public final ֫(II)Z
    .locals 1

    .line 743
    iget-object v0, p0, Ll/۬ܽܳ;->֫:Ll/ۧᩳܳ;

    .line 1132
    invoke-virtual {v0, p1, p2}, Ll/ۧᩳܳ;->֫(II)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/᩹ܽܳ;)Z
    .locals 1

    .line 762
    instance-of v0, p1, Ll/۬ܽܳ;

    if-eqz v0, :cond_0

    .line 761
    check-cast p1, Ll/۬ܽܳ;

    iget-object v0, p0, Ll/۬ܽܳ;->֫:Ll/ۧᩳܳ;

    iget-object p1, p1, Ll/۬ܽܳ;->֫:Ll/ۧᩳܳ;

    .line 762
    invoke-virtual {v0, p1}, Ll/ۧᩳܳ;->֫(Ll/ۧᩳܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(II)J
    .locals 0

    .line 687
    invoke-virtual {p0}, Ll/۬ܽܳ;->֫()J

    move-result-wide p1

    return-wide p1
.end method

.method public final ܿ()J
    .locals 4

    .line 749
    iget-object v0, p0, Ll/۬ܽܳ;->֫:Ll/ۧᩳܳ;

    invoke-virtual {v0}, Ll/ۧᩳܳ;->ۧ()J

    move-result-wide v0

    iget-object v2, p0, Ll/۬ܽܳ;->ۧ:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method
