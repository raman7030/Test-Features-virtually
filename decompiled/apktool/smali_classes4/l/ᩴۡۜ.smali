.class public final Ll/ᩴۡۜ;
.super Ljava/lang/Object;
.source "46X2"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:Z

.field public ܽ:Ljava/lang/String;

.field public ܿ:Z

.field public ᩳ:Ljava/lang/String;

.field public ᩻:Z


# direct methods
.method public static ֫(Ll/ᩴۡۜ;)Z
    .locals 1

    .line 776
    iget v0, p0, Ll/ᩴۡۜ;->ۧ:I

    if-gtz v0, :cond_1

    iget v0, p0, Ll/ᩴۡۜ;->֫:I

    if-gtz v0, :cond_1

    iget-boolean p0, p0, Ll/ᩴۡۜ;->᩻:Z

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
