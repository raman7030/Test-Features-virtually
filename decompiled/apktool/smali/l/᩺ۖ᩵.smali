.class public final Ll/᩺ۖ᩵;
.super Ljava/lang/Object;
.source "VA0B"

# interfaces
.implements Ll/᩹ۡ᩵;
.implements Ll/۠ۡ᩵;


# instance fields
.field public ۙ:I

.field public ᩶:J

.field public ᩸:J

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-boolean p1, p0, Ll/᩺ۖ᩵;->᩹:Z

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 126
    iget-boolean v0, p0, Ll/᩺ۖ᩵;->᩹:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x14

    return v0

    :cond_0
    const/16 v0, 0xa

    return v0
.end method

.method public final ֫(II[B)I
    .locals 2

    .line 77
    iget-boolean p2, p0, Ll/᩺ۖ᩵;->᩹:Z

    if-eqz p2, :cond_0

    .line 78
    invoke-static {p1, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result p2

    iput p2, p0, Ll/᩺ۖ᩵;->ۙ:I

    add-int/lit8 p2, p1, 0x4

    .line 79
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    add-int/lit8 v0, p1, 0x8

    .line 80
    invoke-static {v0, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    shl-int/lit8 p2, p2, 0x20

    or-int/2addr p2, v0

    int-to-long v0, p2

    .line 82
    iput-wide v0, p0, Ll/᩺ۖ᩵;->᩸:J

    add-int/lit8 p2, p1, 0xc

    .line 84
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    add-int/lit8 p1, p1, 0x10

    .line 85
    invoke-static {p1, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p1

    shl-int/lit8 p2, p2, 0x20

    or-int/2addr p1, p2

    int-to-long p1, p1

    .line 87
    iput-wide p1, p0, Ll/᩺ۖ᩵;->᩶:J

    const/16 p1, 0x14

    return p1

    .line 90
    :cond_0
    invoke-static {p1, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result p2

    iput p2, p0, Ll/᩺ۖ᩵;->ۙ:I

    add-int/lit8 p2, p1, 0x2

    .line 91
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    int-to-long v0, p2

    iput-wide v0, p0, Ll/᩺ۖ᩵;->᩸:J

    add-int/lit8 p1, p1, 0x6

    .line 92
    invoke-static {p1, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Ll/᩺ۖ᩵;->᩶:J

    const/16 p1, 0xa

    return p1
.end method

.method public final ֫(I[B)I
    .locals 4

    .line 104
    iget-boolean v0, p0, Ll/᩺ۖ᩵;->᩹:Z

    if-eqz v0, :cond_0

    .line 105
    iget v0, p0, Ll/᩺ۖ᩵;->ۙ:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 106
    iget-wide v0, p0, Ll/᩺ۖ᩵;->᩸:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    add-int/lit8 v3, p1, 0x4

    invoke-static {v0, v1, v3, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 107
    iget-wide v0, p0, Ll/᩺ۖ᩵;->᩸:J

    add-int/lit8 v3, p1, 0x8

    invoke-static {v0, v1, v3, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 108
    iget-wide v0, p0, Ll/᩺ۖ᩵;->᩶:J

    shr-long/2addr v0, v2

    add-int/lit8 v2, p1, 0xc

    invoke-static {v0, v1, v2, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 109
    iget-wide v0, p0, Ll/᩺ۖ᩵;->᩶:J

    add-int/lit8 p1, p1, 0x10

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    const/16 p1, 0x14

    return p1

    .line 112
    :cond_0
    iget v0, p0, Ll/᩺ۖ᩵;->ۙ:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 113
    iget-wide v0, p0, Ll/᩺ۖ᩵;->᩸:J

    add-int/lit8 v2, p1, 0x2

    invoke-static {v0, v1, v2, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 114
    iget-wide v0, p0, Ll/᩺ۖ᩵;->᩶:J

    add-int/lit8 p1, p1, 0x6

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    const/16 p1, 0xa

    return p1
.end method
