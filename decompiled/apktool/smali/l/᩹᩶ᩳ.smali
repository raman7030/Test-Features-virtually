.class public final Ll/᩹᩶ᩳ;
.super Ljava/lang/Object;
.source "66T2"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I


# virtual methods
.method public final ֫(I)I
    .locals 2

    mul-int/lit8 p1, p1, 0x1f

    .line 46
    iget v0, p0, Ll/᩹᩶ᩳ;->ܽ:I

    if-nez v0, :cond_0

    iget v0, p0, Ll/᩹᩶ᩳ;->ۧ:I

    goto :goto_0

    :cond_0
    iget v0, p0, Ll/᩹᩶ᩳ;->ۧ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/᩹᩶ᩳ;->֫:I

    add-int/2addr v0, v1

    :goto_0
    add-int/2addr p1, v0

    return p1
.end method

.method public final ֫([CI)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    .line 42
    iget v2, p0, Ll/᩹᩶ᩳ;->֫:I

    mul-int/lit8 v2, v2, 0x1f

    aget-char v3, p1, v1

    add-int/2addr v2, v3

    iput v2, p0, Ll/᩹᩶ᩳ;->֫:I

    .line 43
    iget v3, p0, Ll/᩹᩶ᩳ;->ܽ:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Ll/᩹᩶ᩳ;->ܽ:I

    const/16 v4, 0x3994

    if-ne v3, v4, :cond_0

    iget v3, p0, Ll/᩹᩶ᩳ;->ۧ:I

    mul-int/lit8 v3, v3, 0x1f

    add-int/2addr v3, v2

    iput v3, p0, Ll/᩹᩶ᩳ;->ۧ:I

    iput v0, p0, Ll/᩹᩶ᩳ;->ܽ:I

    iput v0, p0, Ll/᩹᩶ᩳ;->֫:I

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
