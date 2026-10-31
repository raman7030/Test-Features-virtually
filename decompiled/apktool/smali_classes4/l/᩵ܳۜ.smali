.class public final Ll/᩵ܳۜ;
.super Ljava/lang/Object;
.source "H7AC"


# instance fields
.field public ֫:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 479
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0xc000

    .line 480
    iput v0, p0, Ll/᩵ܳۜ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/֡ܳۜ;
    .locals 5

    .line 513
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->codePointCount(II)I

    move-result v0

    .line 500
    iget v2, p0, Ll/᩵ܳۜ;->֫:I

    if-gt v0, v2, :cond_0

    sub-int/2addr v2, v0

    .line 501
    iput v2, p0, Ll/᩵ܳۜ;->֫:I

    .line 502
    new-instance v0, Ll/֡ܳۜ;

    invoke-direct {v0, p1, v1}, Ll/֡ܳۜ;-><init>(Ljava/lang/String;Z)V

    return-object v0

    .line 504
    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 505
    iput v1, p0, Ll/᩵ܳۜ;->֫:I

    .line 506
    new-instance v3, Ll/֡ܳۜ;

    if-gtz v2, :cond_1

    const-string p1, ""

    goto :goto_0

    .line 523
    :cond_1
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->offsetByCodePoints(II)I

    move-result v4

    .line 524
    invoke-virtual {p1, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-le v0, v2, :cond_2

    const/4 v1, 0x1

    .line 506
    :cond_2
    invoke-direct {v3, p1, v1}, Ll/֡ܳۜ;-><init>(Ljava/lang/String;Z)V

    return-object v3
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 2

    .line 513
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->codePointCount(II)I

    move-result p1

    .line 488
    iget v0, p0, Ll/᩵ܳۜ;->֫:I

    if-le p1, v0, :cond_0

    return v1

    :cond_0
    sub-int/2addr v0, p1

    .line 491
    iput v0, p0, Ll/᩵ܳۜ;->֫:I

    const/4 p1, 0x1

    return p1
.end method
