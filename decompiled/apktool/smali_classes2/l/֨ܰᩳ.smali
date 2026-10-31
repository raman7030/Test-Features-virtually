.class public final Ll/֨ܰᩳ;
.super Ljava/lang/Object;
.source "XAZX"


# instance fields
.field public ֫:Ll/ۚܰᩳ;

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public final synthetic ᩻:Ll/᩸ܰᩳ;


# direct methods
.method public constructor <init>(Ll/᩸ܰᩳ;)V
    .locals 0

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܰᩳ;->᩻:Ll/᩸ܰᩳ;

    const/4 p1, -0x1

    .line 194
    iput p1, p0, Ll/֨ܰᩳ;->ܿ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ܰᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֨ܰᩳ;->ۧ:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/֨ܰᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֨ܰᩳ;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/֨ܰᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֨ܰᩳ;->ᩳ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/֨ܰᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֨ܰᩳ;->ܳ:I

    return p0
.end method


# virtual methods
.method public final ֫()C
    .locals 2

    .line 210
    iget-object v0, p0, Ll/֨ܰᩳ;->֫:Ll/ۚܰᩳ;

    iget-object v0, v0, Ll/ۚܰᩳ;->֫:[I

    iget v1, p0, Ll/֨ܰᩳ;->ᩳ:I

    aget v0, v0, v1

    ushr-int/lit8 v0, v0, 0x10

    int-to-char v0, v0

    return v0
.end method

.method public final ֫(I)Z
    .locals 3

    .line 214
    iget-object v0, p0, Ll/֨ܰᩳ;->֫:Ll/ۚܰᩳ;

    iget v1, p0, Ll/֨ܰᩳ;->ᩳ:I

    invoke-virtual {v0, v1}, Ll/ۚܰᩳ;->ۧ(I)I

    move-result v0

    iget-object v1, p0, Ll/֨ܰᩳ;->֫:Ll/ۚܰᩳ;

    iget v2, p0, Ll/֨ܰᩳ;->ᩳ:I

    invoke-virtual {v1, v2}, Ll/ۚܰᩳ;->֫(I)I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    .line 215
    iget-object v2, p0, Ll/֨ܰᩳ;->֫:Ll/ۚܰᩳ;

    iget-object v2, v2, Ll/ۚܰᩳ;->ۧ:[C

    aget-char v2, v2, v0

    if-ne v2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 3

    .line 211
    iget-object v0, p0, Ll/֨ܰᩳ;->֫:Ll/ۚܰᩳ;

    iget v1, p0, Ll/֨ܰᩳ;->ᩳ:I

    invoke-virtual {v0, v1}, Ll/ۚܰᩳ;->֫(I)I

    move-result v0

    iget-object v1, p0, Ll/֨ܰᩳ;->֫:Ll/ۚܰᩳ;

    iget v2, p0, Ll/֨ܰᩳ;->ᩳ:I

    invoke-virtual {v1, v2}, Ll/ۚܰᩳ;->ۧ(I)I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ۧ(I)I
    .locals 3

    .line 212
    iget-object v0, p0, Ll/֨ܰᩳ;->֫:Ll/ۚܰᩳ;

    iget-object v1, v0, Ll/ۚܰᩳ;->ۧ:[C

    iget v2, p0, Ll/֨ܰᩳ;->ᩳ:I

    invoke-virtual {v0, v2}, Ll/ۚܰᩳ;->ۧ(I)I

    move-result v0

    invoke-virtual {p0}, Ll/֨ܰᩳ;->ۧ()I

    move-result v2

    invoke-static {p1, v2}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    add-int/2addr p1, v0

    aget-char p1, v1, p1

    return p1
.end method

.method public final ܽ()I
    .locals 2

    .line 209
    iget-object v0, p0, Ll/֨ܰᩳ;->֫:Ll/ۚܰᩳ;

    iget-object v0, v0, Ll/ۚܰᩳ;->֫:[I

    iget v1, p0, Ll/֨ܰᩳ;->ᩳ:I

    aget v0, v0, v1

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0
.end method

.method public final ܽ(I)Z
    .locals 3

    if-ltz p1, :cond_3

    .line 197
    iget-object v0, p0, Ll/֨ܰᩳ;->᩻:Ll/᩸ܰᩳ;

    invoke-static {v0}, Ll/᩸ܰᩳ;->ۧ(Ll/᩸ܰᩳ;)I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 198
    :cond_0
    iget v1, p0, Ll/֨ܰᩳ;->ܿ:I

    invoke-static {v0}, Ll/᩸ܰᩳ;->ܽ(Ll/᩸ܰᩳ;)I

    move-result v2

    if-ne v1, v2, :cond_1

    iget v1, p0, Ll/֨ܰᩳ;->ܳ:I

    if-lt p1, v1, :cond_1

    iget v1, p0, Ll/֨ܰᩳ;->ܽ:I

    if-lt p1, v1, :cond_2

    .line 199
    :cond_1
    invoke-static {v0, p1}, Ll/᩸ܰᩳ;->ۧ(Ll/᩸ܰᩳ;I)I

    move-result v1

    iput v1, p0, Ll/֨ܰᩳ;->ۧ:I

    .line 200
    invoke-static {v0}, Ll/᩸ܰᩳ;->֫(Ll/᩸ܰᩳ;)Ljava/util/ArrayList;

    move-result-object v1

    iget v2, p0, Ll/֨ܰᩳ;->ۧ:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚܰᩳ;

    iput-object v1, p0, Ll/֨ܰᩳ;->֫:Ll/ۚܰᩳ;

    .line 201
    iget v1, p0, Ll/֨ܰᩳ;->ۧ:I

    invoke-static {v0, v1}, Ll/᩸ܰᩳ;->֫(Ll/᩸ܰᩳ;I)I

    move-result v1

    iput v1, p0, Ll/֨ܰᩳ;->ܳ:I

    .line 202
    iget-object v2, p0, Ll/֨ܰᩳ;->֫:Ll/ۚܰᩳ;

    iget v2, v2, Ll/ۚܰᩳ;->ᩳ:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/֨ܰᩳ;->ܽ:I

    .line 203
    invoke-static {v0}, Ll/᩸ܰᩳ;->ܽ(Ll/᩸ܰᩳ;)I

    move-result v0

    iput v0, p0, Ll/֨ܰᩳ;->ܿ:I

    .line 205
    :cond_2
    iget v0, p0, Ll/֨ܰᩳ;->ܳ:I

    sub-int/2addr p1, v0

    iput p1, p0, Ll/֨ܰᩳ;->ᩳ:I

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
