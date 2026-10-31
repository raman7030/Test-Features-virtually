.class public final Ll/ۛ֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"

# interfaces
.implements Ll/᩹֡ܽ;


# instance fields
.field public final ֫:[I

.field public final ۧ:[I


# direct methods
.method public constructor <init>([I[I)V
    .locals 0

    .line 2805
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2806
    iput-object p1, p0, Ll/ۛ֨ܽ;->ۧ:[I

    .line 2807
    iput-object p2, p0, Ll/ۛ֨ܽ;->֫:[I

    return-void
.end method


# virtual methods
.method public final negate()Ll/۟᩵ܽ;
    .locals 1

    .line 2395
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2374
    invoke-static {p0}, Ll/۟᩵ܽ;->ܽ(Ll/ۧۚܽ;)Ll/۟᩵ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩸֡ܽ;->֫(Ll/᩹֡ܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Z
    .locals 8

    .line 2821
    iget-object v0, p0, Ll/ۛ֨ܽ;->ۧ:[I

    array-length v1, v0

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-gt v4, v1, :cond_2

    add-int v5, v4, v1

    ushr-int/2addr v5, v2

    mul-int/lit8 v6, v5, 0x2

    .line 2824
    aget v7, v0, v6

    add-int/2addr v6, v2

    .line 2825
    aget v6, v0, v6

    if-ge p1, v7, :cond_0

    add-int/lit8 v1, v5, -0x1

    goto :goto_0

    :cond_0
    if-le p1, v6, :cond_1

    add-int/lit8 v4, v5, 0x1

    goto :goto_0

    :cond_1
    return v2

    .line 2838
    :cond_2
    iget-object v0, p0, Ll/ۛ֨ܽ;->֫:[I

    array-length v1, v0

    const/16 v4, 0x10

    if-gt v1, v4, :cond_5

    .line 2839
    array-length v1, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_6

    aget v5, v0, v4

    if-ne v5, p1, :cond_3

    goto :goto_2

    :cond_3
    if-le v5, p1, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 2845
    :cond_5
    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p1

    if-ltz p1, :cond_6

    :goto_2
    return v2

    :cond_6
    :goto_3
    return v3
.end method

.method public final synthetic ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩸֡ܽ;->ۧ(Ll/᩹֡ܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method
