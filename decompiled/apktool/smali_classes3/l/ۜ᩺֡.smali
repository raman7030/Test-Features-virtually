.class public final Ll/ۜ᩺֡;
.super Ll/ۢܰ֡;
.source "F64Z"

# interfaces
.implements Ll/ۡۧۚ;


# static fields
.field public static final ۬:Ll/֨ۗ֡;


# instance fields
.field public final ۗ:I

.field public final ۙ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 45
    sget-object v0, Ll/֨ۗ֡;->۫֫:Ll/֨ۗ֡;

    sput-object v0, Ll/ۜ᩺֡;->۬:Ll/֨ۗ֡;

    return-void
.end method

.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 6

    .line 54
    sget-object v0, Ll/ۜ᩺֡;->۬:Ll/֨ۗ֡;

    invoke-direct {p0, p1, v0, p2}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    .line 56
    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    add-int/lit8 v1, p2, 0x2

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 p1, 0x1

    .line 58
    iput p1, p0, Ll/ۜ᩺֡;->ۗ:I

    .line 59
    iput v1, p0, Ll/ۜ᩺֡;->ۙ:I

    return-void

    .line 61
    :cond_0
    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object p1

    add-int/lit8 p2, p2, 0x4

    invoke-virtual {p1, p2}, Ll/ۘۨ֡;->ۧ(I)I

    move-result p1

    int-to-long v2, v0

    int-to-long v4, p1

    mul-long v2, v2, v4

    const-wide/32 v4, 0x7fffffff

    cmp-long p2, v2, v4

    if-gtz p2, :cond_1

    .line 65
    iput v0, p0, Ll/ۜ᩺֡;->ۗ:I

    .line 66
    iput p1, p0, Ll/ۜ᩺֡;->ۙ:I

    return-void

    .line 63
    :cond_1
    new-instance p1, Ll/ܶ᩵ۚ;

    new-array p2, v1, [Ljava/lang/Object;

    const/4 v0, 0x0

    const-string v1, "Invalid array-payload instruction: element width*count overflows"

    .line 46
    invoke-direct {p1, v0, v1, p2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    throw p1
.end method


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ۚ()I
    .locals 2

    .line 127
    iget v0, p0, Ll/ۜ᩺֡;->ۗ:I

    iget v1, p0, Ll/ۜ᩺֡;->ۙ:I

    mul-int v0, v0, v1

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public final ۬()Ljava/util/List;
    .locals 5

    .line 78
    iget v0, p0, Ll/ۢܰ֡;->᩹:I

    const/16 v1, 0x8

    add-int/2addr v0, v1

    .line 87
    iget v2, p0, Ll/ۜ᩺֡;->ۗ:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_2

    const/4 v4, 0x4

    if-eq v2, v4, :cond_1

    if-ne v2, v1, :cond_0

    .line 113
    new-instance v1, Ll/᩻᩺֡;

    invoke-direct {v1, p0, v0}, Ll/᩻᩺֡;-><init>(Ll/ۜ᩺֡;I)V

    return-object v1

    .line 121
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x0

    const-string v3, "Invalid element width: %d"

    .line 46
    invoke-direct {v0, v1, v3, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    throw v0

    .line 105
    :cond_1
    new-instance v1, Ll/ܳ᩺֡;

    invoke-direct {v1, p0, v0}, Ll/ܳ᩺֡;-><init>(Ll/ۜ᩺֡;I)V

    return-object v1

    .line 97
    :cond_2
    new-instance v1, Ll/ܿ᩺֡;

    invoke-direct {v1, p0, v0}, Ll/ܿ᩺֡;-><init>(Ll/ۜ᩺֡;I)V

    return-object v1

    .line 89
    :cond_3
    new-instance v1, Ll/ܽ᩺֡;

    invoke-direct {v1, p0, v0}, Ll/ܽ᩺֡;-><init>(Ll/ۜ᩺֡;I)V

    return-object v1
.end method

.method public final ᩷()I
    .locals 1

    .line 72
    iget v0, p0, Ll/ۜ᩺֡;->ۗ:I

    return v0
.end method
