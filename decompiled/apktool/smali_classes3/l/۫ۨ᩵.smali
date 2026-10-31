.class public final Ll/۫ۨ᩵;
.super Ljava/lang/Object;
.source "S8D3"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I


# virtual methods
.method public final ֫()I
    .locals 2

    .line 71
    iget v0, p0, Ll/۫ۨ᩵;->ܽ:I

    iget v1, p0, Ll/۫ۨ᩵;->֫:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 65
    iget v0, p0, Ll/۫ۨ᩵;->ܽ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/۫ۨ᩵;->ܽ:I

    .line 66
    iget v0, p0, Ll/۫ۨ᩵;->ۧ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/۫ۨ᩵;->ۧ:I

    .line 67
    iget v0, p0, Ll/۫ۨ᩵;->֫:I

    sub-int/2addr v0, p1

    iput v0, p0, Ll/۫ۨ᩵;->֫:I

    return-void
.end method
