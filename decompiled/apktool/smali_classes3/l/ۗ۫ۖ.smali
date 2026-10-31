.class public final Ll/ۗ۫ۖ;
.super Ll/ۛ۫ۖ;
.source "39IB"


# instance fields
.field public ۙ:I

.field public ᩶:[Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ۨ۬ۖ;[BI)V
    .locals 4

    .line 34
    invoke-direct {p0, p1, p2}, Ll/ۛ۫ۖ;-><init>(Ll/ۨ۬ۖ;[B)V

    .line 35
    iput p3, p0, Ll/ۗ۫ۖ;->ۙ:I

    .line 118
    array-length p1, p2

    mul-int/lit8 p1, p1, 0x8

    sub-int/2addr p1, p3

    .line 83
    new-array p3, p1, [Z

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    .line 108
    div-int/lit8 v1, v0, 0x8

    .line 109
    aget-byte v1, p2, v1

    .line 110
    rem-int/lit8 v2, v0, 0x8

    rsub-int/lit8 v2, v2, 0x7

    const/4 v3, 0x1

    shl-int v2, v3, v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    .line 85
    :goto_1
    aput-boolean v3, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 36
    :cond_1
    iput-object p3, p0, Ll/ۗ۫ۖ;->᩶:[Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۗ۫ۖ;)I
    .locals 0

    .line 28
    iget p0, p0, Ll/ۗ۫ۖ;->ۙ:I

    return p0
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 93
    iget-object v0, p0, Ll/ۗ۫ۖ;->᩶:[Z

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۗ۫ۖ;->᩶:[Z

    invoke-static {v0}, Ljava/util/Arrays;->toString([Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
