.class public final Ll/ܳۘ᩵;
.super Ll/ۤۖ᩵;
.source "PA1K"


# instance fields
.field public ۗ֫:B

.field public ۙ֫:J

.field public ۬֫:[Ll/᩺ۖ᩵;

.field public ܶ֫:I

.field public ᩶֫:B

.field public ᩸֫:Z

.field public ᩹֫:[Ll/᩺ۖ᩵;


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Ll/ۤۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 166
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComLockingAndX["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    invoke-super {p0}, Ll/ۤۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܳۘ᩵;->ܶ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",typeOfLock="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Ll/ܳۘ᩵;->ۗ֫:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",newOplockLevel="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Ll/ܳۘ᩵;->᩶֫:B

    const-string v3, "]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 167
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۧ(I[B)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, p1

    .line 142
    :goto_0
    iget-object v3, p0, Ll/ܳۘ᩵;->۬֫:[Ll/᩺ۖ᩵;

    array-length v4, v3

    if-ge v1, v4, :cond_0

    .line 160
    new-instance v4, Ll/᩺ۖ᩵;

    iget-boolean v5, p0, Ll/ܳۘ᩵;->᩸֫:Z

    invoke-direct {v4, v5}, Ll/᩺ۖ᩵;-><init>(Z)V

    .line 143
    aput-object v4, v3, v1

    .line 144
    array-length v3, p2

    invoke-virtual {v4, v2, v3, p2}, Ll/᩺ۖ᩵;->֫(II[B)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 147
    :cond_0
    :goto_1
    iget-object v1, p0, Ll/ܳۘ᩵;->᩹֫:[Ll/᩺ۖ᩵;

    array-length v3, v1

    if-ge v0, v3, :cond_1

    .line 160
    new-instance v3, Ll/᩺ۖ᩵;

    iget-boolean v4, p0, Ll/ܳۘ᩵;->᩸֫:Z

    invoke-direct {v3, v4}, Ll/᩺ۖ᩵;-><init>(Z)V

    .line 148
    aput-object v3, v1, v0

    .line 149
    array-length v1, p2

    invoke-virtual {v3, v2, v1, p2}, Ll/᩺ۖ᩵;->֫(II[B)I

    move-result v1

    add-int/2addr v2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    sub-int/2addr p1, v2

    return p1
.end method

.method public final ܽ(I[B)I
    .locals 2

    .line 86
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ܳۘ᩵;->ܶ֫:I

    add-int/lit8 v0, p1, 0x2

    .line 89
    aget-byte v0, p2, v0

    iput-byte v0, p0, Ll/ܳۘ᩵;->ۗ֫:B

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    .line 92
    iput-boolean v0, p0, Ll/ܳۘ᩵;->᩸֫:Z

    :cond_0
    add-int/lit8 v0, p1, 0x3

    .line 95
    aget-byte v0, p2, v0

    iput-byte v0, p0, Ll/ܳۘ᩵;->᩶֫:B

    add-int/lit8 v0, p1, 0x4

    .line 98
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Ll/ܳۘ᩵;->ۙ֫:J

    add-int/lit8 v0, p1, 0x8

    .line 101
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    .line 102
    new-array v0, v0, [Ll/᩺ۖ᩵;

    iput-object v0, p0, Ll/ܳۘ᩵;->۬֫:[Ll/᩺ۖ᩵;

    add-int/lit8 v0, p1, 0xa

    .line 105
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result p2

    .line 106
    new-array p2, p2, [Ll/᩺ۖ᩵;

    iput-object p2, p0, Ll/ܳۘ᩵;->᩹֫:[Ll/᩺ۖ᩵;

    add-int/lit8 p2, p1, 0xc

    sub-int/2addr p1, p2

    return p1
.end method

.method public final ܿ(I[B)I
    .locals 6

    .line 120
    iget-object v0, p0, Ll/ܳۘ᩵;->۬֫:[Ll/᩺ۖ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 121
    array-length v2, v0

    const/4 v3, 0x0

    move v4, p1

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v5, v0, v3

    .line 122
    invoke-virtual {v5, v4, p2}, Ll/᩺ۖ᩵;->֫(I[B)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    move v4, p1

    .line 125
    :cond_1
    iget-object v0, p0, Ll/ܳۘ᩵;->᩹֫:[Ll/᩺ۖ᩵;

    if-eqz v0, :cond_2

    .line 126
    array-length v2, v0

    :goto_1
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    .line 127
    invoke-virtual {v3, v4, p2}, Ll/᩺ۖ᩵;->֫(I[B)I

    move-result v3

    add-int/2addr v4, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    sub-int/2addr p1, v4

    return p1
.end method

.method public final ᩻(I[B)I
    .locals 6

    .line 58
    iget v0, p0, Ll/ܳۘ᩵;->ܶ֫:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 61
    iget-byte v1, p0, Ll/ܳۘ᩵;->ۗ֫:B

    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x3

    .line 62
    iget-byte v1, p0, Ll/ܳۘ᩵;->᩶֫:B

    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x4

    .line 65
    iget-wide v1, p0, Ll/ܳۘ᩵;->ۙ֫:J

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x8

    .line 68
    iget-object v1, p0, Ll/ܳۘ᩵;->۬֫:[Ll/᩺ۖ᩵;

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    array-length v1, v1

    int-to-long v4, v1

    goto :goto_0

    :cond_0
    move-wide v4, v2

    :goto_0
    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0xa

    .line 71
    iget-object v1, p0, Ll/ܳۘ᩵;->᩹֫:[Ll/᩺ۖ᩵;

    if-eqz v1, :cond_1

    array-length v1, v1

    int-to-long v2, v1

    :cond_1
    invoke-static {v2, v3, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 p2, p1, 0xc

    sub-int/2addr p1, p2

    return p1
.end method
