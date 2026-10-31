.class public final Ll/֡ۢۧ;
.super Ljava/lang/Object;
.source "28II"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:Z

.field public ܽ:I

.field public ܿ:J

.field public ᩳ:I

.field public final ᩻:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v0, v0, [B

    .line 41
    iput-object v0, p0, Ll/֡ۢۧ;->᩻:[B

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Ll/֡ۢۧ;->ܳ:Z

    .line 46
    iput v0, p0, Ll/֡ۢۧ;->ܽ:I

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)V
    .locals 6

    .line 50
    iget-boolean v0, p0, Ll/֡ۢۧ;->ܳ:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/16 v0, 0xa

    const/4 v1, 0x0

    .line 53
    iget-object v2, p0, Ll/֡ۢۧ;->᩻:[B

    invoke-interface {p1, v1, v0, v2}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 54
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    const/4 p1, 0x4

    .line 580
    aget-byte p1, v2, p1

    const/4 v0, -0x8

    const/4 v3, 0x1

    if-ne p1, v0, :cond_4

    const/4 p1, 0x5

    aget-byte p1, v2, p1

    const/16 v0, 0x72

    if-ne p1, v0, :cond_4

    const/4 p1, 0x6

    aget-byte p1, v2, p1

    const/16 v0, 0x6f

    if-ne p1, v0, :cond_4

    const/4 p1, 0x7

    aget-byte v0, v2, p1

    and-int/lit16 v4, v0, 0xfe

    const/16 v5, 0xba

    if-eq v4, v5, :cond_1

    goto :goto_1

    :cond_1
    and-int/lit16 v0, v0, 0xff

    const/16 v4, 0xbb

    if-ne v0, v4, :cond_2

    const/4 v1, 0x1

    :cond_2
    if-eqz v1, :cond_3

    const/16 v0, 0x9

    goto :goto_0

    :cond_3
    const/16 v0, 0x8

    .line 587
    :goto_0
    aget-byte v0, v2, v0

    shr-int/lit8 v0, v0, 0x4

    and-int/2addr p1, v0

    const/16 v0, 0x28

    shl-int v1, v0, p1

    :cond_4
    :goto_1
    if-nez v1, :cond_5

    :goto_2
    return-void

    .line 58
    :cond_5
    iput-boolean v3, p0, Ll/֡ۢۧ;->ܳ:Z

    return-void
.end method

.method public final ֫(Ll/᩵ۢۧ;JIIILl/ᩴۢۧ;)V
    .locals 3

    .line 68
    iget v0, p0, Ll/֡ۢۧ;->ۧ:I

    add-int v1, p5, p6

    const/4 v2, 0x0

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "TrueHD chunk samples must be contiguous in the sample queue."

    invoke-static {v1, v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/String;Z)V

    .line 71
    iget-boolean v0, p0, Ll/֡ۢۧ;->ܳ:Z

    if-nez v0, :cond_1

    goto :goto_1

    .line 74
    :cond_1
    iget v0, p0, Ll/֡ۢۧ;->ܽ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/֡ۢۧ;->ܽ:I

    if-nez v0, :cond_2

    .line 76
    iput-wide p2, p0, Ll/֡ۢۧ;->ܿ:J

    .line 77
    iput p4, p0, Ll/֡ۢۧ;->֫:I

    .line 78
    iput v2, p0, Ll/֡ۢۧ;->ᩳ:I

    .line 80
    :cond_2
    iget p2, p0, Ll/֡ۢۧ;->ᩳ:I

    add-int/2addr p2, p5

    iput p2, p0, Ll/֡ۢۧ;->ᩳ:I

    .line 81
    iput p6, p0, Ll/֡ۢۧ;->ۧ:I

    const/16 p2, 0x10

    if-lt v1, p2, :cond_3

    .line 83
    invoke-virtual {p0, p1, p7}, Ll/֡ۢۧ;->֫(Ll/᩵ۢۧ;Ll/ᩴۢۧ;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final ֫(Ll/᩵ۢۧ;Ll/ᩴۢۧ;)V
    .locals 8

    .line 89
    iget v0, p0, Ll/֡ۢۧ;->ܽ:I

    if-lez v0, :cond_0

    .line 90
    iget-wide v2, p0, Ll/֡ۢۧ;->ܿ:J

    iget v4, p0, Ll/֡ۢۧ;->֫:I

    iget v5, p0, Ll/֡ۢۧ;->ᩳ:I

    iget v6, p0, Ll/֡ۢۧ;->ۧ:I

    move-object v1, p1

    move-object v7, p2

    invoke-interface/range {v1 .. v7}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    const/4 p1, 0x0

    .line 91
    iput p1, p0, Ll/֡ۢۧ;->ܽ:I

    :cond_0
    return-void
.end method
