.class public final Ll/᩻ۖܿ;
.super Ll/ۜۖܿ;
.source "M701"


# instance fields
.field public final ܳ:[Ll/᩸᩷ܿ;

.field public final ܿ:[I


# direct methods
.method public constructor <init>([I[Ll/᩸᩷ܿ;)V
    .locals 9

    .line 595
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget v4, p1, v2

    const v5, 0x7fffffff

    and-int/2addr v4, v5

    int-to-long v5, v3

    int-to-long v3, v4

    add-long/2addr v5, v3

    long-to-int v3, v5

    int-to-long v7, v3

    cmp-long v4, v5, v7

    if-nez v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 473
    :cond_1
    array-length v0, p1

    .line 606
    array-length v2, p2

    const/4 v4, 0x0

    :goto_1
    const/4 v5, 0x1

    if-ge v4, v2, :cond_4

    aget-object v6, p2, v4

    .line 601
    invoke-virtual {v6}, Ll/᩸᩷ܿ;->ܽ()I

    move-result v7

    ushr-int/lit8 v7, v7, 0x18

    const/4 v8, 0x6

    if-eq v7, v8, :cond_3

    invoke-virtual {v6}, Ll/᩸᩷ܿ;->ᩴ()I

    move-result v6

    ushr-int/lit8 v6, v6, 0x18

    if-ne v6, v8, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    const/4 v1, 0x1

    .line 473
    :cond_4
    invoke-direct {p0, v3, v0, v5, v1}, Ll/ۜۖܿ;-><init>(IIIZ)V

    .line 474
    iput-object p1, p0, Ll/᩻ۖܿ;->ܿ:[I

    .line 475
    iput-object p2, p0, Ll/᩻ۖܿ;->ܳ:[Ll/᩸᩷ܿ;

    return-void
.end method
