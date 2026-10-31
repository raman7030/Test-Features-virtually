.class public Ll/۟ܶ۠;
.super Ljava/lang/Object;
.source "O3Z6"

# interfaces
.implements Ll/ܰܶ۠;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 195
    iput v0, p0, Ll/۟ܶ۠;->ۧ:I

    const/4 v0, 0x1

    .line 196
    iput v0, p0, Ll/۟ܶ۠;->֫:I

    return-void
.end method


# virtual methods
.method public ֫(I)I
    .locals 4

    .line 199
    iget v0, p0, Ll/۟ܶ۠;->ۧ:I

    if-ne p1, v0, :cond_0

    .line 200
    iget p1, p0, Ll/۟ܶ۠;->֫:I

    return p1

    .line 202
    :cond_0
    iput p1, p0, Ll/۟ܶ۠;->ۧ:I

    .line 205
    iget-object v0, p0, Ll/۟ܶ۠;->ܽ:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_3

    add-int v2, v1, v0

    shr-int/lit8 v2, v2, 0x1

    .line 208
    iget-object v3, p0, Ll/۟ܶ۠;->ܽ:[I

    aget v3, v3, v2

    if-ge v3, p1, :cond_1

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_1
    if-le v3, p1, :cond_2

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 215
    iput v2, p0, Ll/۟ܶ۠;->֫:I

    return v2

    .line 219
    :cond_3
    iput v1, p0, Ll/۟ܶ۠;->֫:I

    return v1
.end method

.method public ۧ(I)I
    .locals 2

    .line 229
    iget-object v0, p0, Ll/۟ܶ۠;->ܽ:[I

    invoke-virtual {p0, p1}, Ll/۟ܶ۠;->֫(I)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    sub-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public ܽ(I)V
    .locals 0

    return-void
.end method
