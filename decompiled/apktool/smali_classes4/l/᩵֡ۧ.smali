.class public final Ll/᩵֡ۧ;
.super Ljava/lang/Object;
.source "98SV"


# instance fields
.field public ֫:Z

.field public ۜ:I

.field public final ۧ:Ll/᩵ۢۧ;

.field public ܳ:J

.field public ܽ:Z

.field public ܿ:J

.field public ᩳ:Z

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/᩵ۢۧ;)V
    .locals 0

    .line 456
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 457
    iput-object p1, p0, Ll/᩵֡ۧ;->ۧ:Ll/᩵ۢۧ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 461
    iput-boolean v0, p0, Ll/᩵֡ۧ;->ܽ:Z

    .line 462
    iput-boolean v0, p0, Ll/᩵֡ۧ;->֫:Z

    .line 463
    iput-boolean v0, p0, Ll/᩵֡ۧ;->ᩳ:Z

    const/4 v0, -0x1

    .line 464
    iput v0, p0, Ll/᩵֡ۧ;->᩻:I

    return-void
.end method

.method public final ֫(II[B)V
    .locals 2

    .line 478
    iget-boolean v0, p0, Ll/᩵֡ۧ;->֫:Z

    if-eqz v0, :cond_2

    add-int/lit8 v0, p1, 0x1

    .line 479
    iget v1, p0, Ll/᩵֡ۧ;->ۜ:I

    sub-int/2addr v0, v1

    if-ge v0, p2, :cond_1

    .line 481
    aget-byte p1, p3, v0

    and-int/lit16 p1, p1, 0xc0

    shr-int/lit8 p1, p1, 0x6

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/᩵֡ۧ;->ᩳ:Z

    .line 482
    iput-boolean p2, p0, Ll/᩵֡ۧ;->֫:Z

    return-void

    :cond_1
    sub-int/2addr p2, p1

    add-int/2addr p2, v1

    .line 484
    iput p2, p0, Ll/᩵֡ۧ;->ۜ:I

    :cond_2
    return-void
.end method

.method public final ֫(IJ)V
    .locals 4

    .line 468
    iput p1, p0, Ll/᩵֡ۧ;->᩻:I

    const/4 v0, 0x0

    .line 469
    iput-boolean v0, p0, Ll/᩵֡ۧ;->ᩳ:Z

    const/4 v1, 0x1

    const/16 v2, 0xb6

    if-eq p1, v2, :cond_1

    const/16 v3, 0xb3

    if-ne p1, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 470
    :goto_1
    iput-boolean v3, p0, Ll/᩵֡ۧ;->ܽ:Z

    if-ne p1, v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 472
    :goto_2
    iput-boolean v1, p0, Ll/᩵֡ۧ;->֫:Z

    .line 473
    iput v0, p0, Ll/᩵֡ۧ;->ۜ:I

    .line 474
    iput-wide p2, p0, Ll/᩵֡ۧ;->ܳ:J

    return-void
.end method

.method public final ֫(JIZ)V
    .locals 9

    .line 491
    iget-wide v0, p0, Ll/᩵֡ۧ;->ܳ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 492
    iget v0, p0, Ll/᩵֡ۧ;->᩻:I

    const/16 v1, 0xb6

    if-ne v0, v1, :cond_1

    if-eqz p4, :cond_1

    iget-boolean p4, p0, Ll/᩵֡ۧ;->ܽ:Z

    if-eqz p4, :cond_1

    .line 493
    iget-wide v0, p0, Ll/᩵֡ۧ;->ܿ:J

    sub-long v0, p1, v0

    long-to-int v6, v0

    .line 494
    iget-boolean v5, p0, Ll/᩵֡ۧ;->ᩳ:Z

    .line 495
    iget-wide v3, p0, Ll/᩵֡ۧ;->ܳ:J

    const/4 v8, 0x0

    iget-object v2, p0, Ll/᩵֡ۧ;->ۧ:Ll/᩵ۢۧ;

    move v7, p3

    invoke-interface/range {v2 .. v8}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 500
    :cond_1
    iget p3, p0, Ll/᩵֡ۧ;->᩻:I

    const/16 p4, 0xb3

    if-eq p3, p4, :cond_2

    .line 501
    iput-wide p1, p0, Ll/᩵֡ۧ;->ܿ:J

    :cond_2
    return-void
.end method
