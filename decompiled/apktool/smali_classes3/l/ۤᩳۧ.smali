.class public final Ll/ۤᩳۧ;
.super Ll/ᩳܿۧ;
.source "18UV"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ۗ:I

.field public final ۬:I


# direct methods
.method public constructor <init>(ILl/۬᩵֫;ILl/᩺ᩳۧ;I)V
    .locals 0

    .line 4231
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳܿۧ;-><init>(ILl/۬᩵֫;I)V

    .line 4233
    iget-boolean p1, p4, Ll/᩺ᩳۧ;->ۢ֫:Z

    invoke-static {p5, p1}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result p1

    .line 4235
    iput p1, p0, Ll/ۤᩳۧ;->۬:I

    .line 4236
    iget-object p1, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    .line 1319
    iget p2, p1, Ll/۠ᩴ֫;->᩷֫:I

    const/4 p3, -0x1

    if-eq p2, p3, :cond_1

    iget p1, p1, Ll/۠ᩴ֫;->۠:I

    if-ne p1, p3, :cond_0

    goto :goto_0

    :cond_0
    mul-int p3, p2, p1

    .line 4236
    :cond_1
    :goto_0
    iput p3, p0, Ll/ۤᩳۧ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 4205
    check-cast p1, Ll/ۤᩳۧ;

    invoke-virtual {p0, p1}, Ll/ۤᩳۧ;->֫(Ll/ۤᩳۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫()I
    .locals 1

    .line 4241
    iget v0, p0, Ll/ۤᩳۧ;->۬:I

    return v0
.end method

.method public final ֫(Ll/ۤᩳۧ;)I
    .locals 1

    .line 4251
    iget v0, p0, Ll/ۤᩳۧ;->ۗ:I

    iget p1, p1, Ll/ۤᩳۧ;->ۗ:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic ֫(Ll/ᩳܿۧ;)Z
    .locals 0

    .line 4205
    check-cast p1, Ll/ۤᩳۧ;

    const/4 p1, 0x0

    return p1
.end method
