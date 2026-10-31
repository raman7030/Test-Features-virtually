.class public final Ll/ۧۛ᩷;
.super Ljava/lang/Object;
.source "31K1"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public static bridge synthetic ֫(Ll/ۧۛ᩷;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۧۛ᩷;->֫:I

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ۧۛ᩷;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧۛ᩷;->֫:I

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۧۛ᩷;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۧۛ᩷;->ۧ:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۧۛ᩷;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧۛ᩷;->ۧ:I

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۧۛ᩷;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۧۛ᩷;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۧۛ᩷;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧۛ᩷;->ܽ:I

    return-void
.end method

.method public static ܿ(Ll/ۧۛ᩷;)Z
    .locals 1

    .line 1932
    iget v0, p0, Ll/ۧۛ᩷;->ۧ:I

    if-gtz v0, :cond_1

    iget v0, p0, Ll/ۧۛ᩷;->ᩳ:I

    if-gtz v0, :cond_1

    iget v0, p0, Ll/ۧۛ᩷;->֫:I

    if-gtz v0, :cond_1

    iget p0, p0, Ll/ۧۛ᩷;->ܽ:I

    if-lez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۧۛ᩷;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۧۛ᩷;->ᩳ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۧۛ᩷;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧۛ᩷;->ᩳ:I

    return-void
.end method
