.class public final Ll/ۜۙۧ;
.super Ljava/lang/Object;
.source "I5WF"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:I


# virtual methods
.method public final ֫()I
    .locals 3

    .line 536
    iget v0, p0, Ll/ۜۙۧ;->֫:I

    iget v1, p0, Ll/ۜۙۧ;->ᩳ:I

    sub-int/2addr v0, v1

    iget v1, p0, Ll/ۜۙۧ;->ۧ:I

    iget v2, p0, Ll/ۜۙۧ;->ܿ:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method
