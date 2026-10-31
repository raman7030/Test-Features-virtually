.class public final Ll/ۧۖܿ;
.super Ll/ۜۖܿ;
.source "M701"


# instance fields
.field public final ܳ:Ll/ۜۖܿ;

.field public final ܿ:Ll/ۜۖܿ;


# direct methods
.method public constructor <init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V
    .locals 7

    .line 486
    iget v0, p1, Ll/ۜۖܿ;->ܽ:I

    iget v1, p2, Ll/ۜۖܿ;->ܽ:I

    int-to-long v2, v0

    int-to-long v0, v1

    add-long/2addr v2, v0

    long-to-int v0, v2

    int-to-long v4, v0

    cmp-long v1, v2, v4

    if-nez v1, :cond_3

    iget v1, p1, Ll/ۜۖܿ;->ᩳ:I

    iget v2, p2, Ll/ۜۖܿ;->ᩳ:I

    int-to-long v3, v1

    int-to-long v1, v2

    add-long/2addr v3, v1

    long-to-int v1, v3

    int-to-long v5, v1

    cmp-long v2, v3, v5

    if-nez v2, :cond_2

    iget v2, p1, Ll/ۜۖܿ;->ۧ:I

    iget v3, p2, Ll/ۜۖܿ;->ۧ:I

    .line 487
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iget-boolean v4, p1, Ll/ۜۖܿ;->֫:Z

    if-nez v4, :cond_1

    iget-boolean v4, p2, Ll/ۜۖܿ;->֫:Z

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 486
    :cond_1
    :goto_0
    invoke-direct {p0, v0, v1, v2, v3}, Ll/ۜۖܿ;-><init>(IIIZ)V

    .line 488
    iput-object p1, p0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    .line 489
    iput-object p2, p0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    return-void

    .line 0
    :cond_2
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method
