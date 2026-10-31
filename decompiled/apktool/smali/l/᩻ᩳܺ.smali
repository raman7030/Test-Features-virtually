.class public final Ll/᩻ᩳܺ;
.super Ll/ۜᩳܺ;
.source "5BHG"


# instance fields
.field public ۧ:I


# virtual methods
.method public final ֫()I
    .locals 2

    .line 1507
    iget v0, p0, Ll/ۜᩳܺ;->֫:I

    iget v1, p0, Ll/᩻ᩳܺ;->ۧ:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    .line 1510
    iput v1, p0, Ll/ۜᩳܺ;->֫:I

    return v0

    .line 1508
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method
