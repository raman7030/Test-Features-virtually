.class public final Ll/ۡۖܽ;
.super Ljava/lang/Object;
.source "T4Z8"


# instance fields
.field public ֫:I

.field public ۧ:[I

.field public ܽ:Ljava/io/InputStream;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 4

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0xffffff

    .line 8
    iput v0, p0, Ll/ۡۖܽ;->֫:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Ll/ۡۖܽ;->ᩳ:Z

    .line 14
    iput-object p1, p0, Ll/ۡۖܽ;->ܽ:Ljava/io/InputStream;

    const/16 p1, 0x100

    new-array v0, p1, [I

    .line 15
    iput-object v0, p0, Ll/ۡۖܽ;->ۧ:[I

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_2

    const/4 v1, 0x0

    move v2, v0

    :goto_1
    const/16 v3, 0x8

    if-ge v1, v3, :cond_1

    and-int/lit8 v3, v2, 0x1

    shr-int/lit8 v2, v2, 0x1

    if-eqz v3, :cond_0

    const v3, -0x12477dd0

    xor-int/2addr v2, v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 24
    :cond_1
    iget-object v1, p0, Ll/ۡۖܽ;->ۧ:[I

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    .line 33
    iget v0, p0, Ll/ۡۖܽ;->֫:I

    .line 34
    invoke-virtual {p0}, Ll/ۡۖܽ;->ܳ()I

    move-result v1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۡۖܽ;->ܽ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final ܳ()I
    .locals 2

    .line 73
    invoke-virtual {p0}, Ll/ۡۖܽ;->ܿ()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0}, Ll/ۡۖܽ;->ܿ()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/ۡۖܽ;->ܿ()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/ۡۖܽ;->ܿ()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Ll/ۡۖܽ;->ᩳ:Z

    return-void
.end method

.method public final ܿ()I
    .locals 4

    .line 46
    iget-object v0, p0, Ll/ۡۖܽ;->ܽ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 47
    iget-boolean v1, p0, Ll/ۡۖܽ;->ᩳ:Z

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    not-int v0, v0

    and-int/lit16 v0, v0, 0xff

    .line 49
    :cond_0
    iget v1, p0, Ll/ۡۖܽ;->֫:I

    xor-int v2, v1, v0

    and-int/lit16 v2, v2, 0xff

    iget-object v3, p0, Ll/ۡۖܽ;->ۧ:[I

    aget v2, v3, v2

    shr-int/lit8 v1, v1, 0x8

    xor-int/2addr v1, v2

    iput v1, p0, Ll/ۡۖܽ;->֫:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 29
    iget v0, p0, Ll/ۡۖܽ;->֫:I

    return v0
.end method

.method public final ᩻()V
    .locals 1

    const v0, 0xffffff

    .line 38
    iput v0, p0, Ll/ۡۖܽ;->֫:I

    return-void
.end method
