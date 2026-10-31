.class public final Ll/۬ۨᩳ;
.super Ljava/lang/Object;
.source "X68P"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:Ll/۟᩺ᩳ;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;II)V
    .locals 0

    .line 1372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1373
    iput p2, p0, Ll/۬ۨᩳ;->֫:I

    .line 1374
    iput p3, p0, Ll/۬ۨᩳ;->ܿ:I

    .line 1375
    invoke-static {p1}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object p2

    iput-object p2, p0, Ll/۬ۨᩳ;->ᩳ:Ll/۟᩺ᩳ;

    .line 1376
    iget p3, p1, Ll/۫ۨᩳ;->ۢ֫:I

    iput p3, p0, Ll/۬ۨᩳ;->ۧ:I

    .line 1377
    invoke-interface {p2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p2

    iput p2, p0, Ll/۬ۨᩳ;->ܽ:I

    .line 1378
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result p2

    iput p2, p0, Ll/۬ۨᩳ;->᩻:I

    .line 1379
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۬֫()I

    move-result p1

    iput p1, p0, Ll/۬ۨᩳ;->ܳ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۨᩳ;)Z
    .locals 3

    .line 1383
    invoke-static {p1}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object v0

    iget-object v1, p0, Ll/۬ۨᩳ;->ᩳ:Ll/۟᩺ᩳ;

    if-ne v1, v0, :cond_0

    iget v0, p0, Ll/۬ۨᩳ;->ۧ:I

    iget v2, p1, Ll/۫ۨᩳ;->ۢ֫:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Ll/۬ۨᩳ;->ܽ:I

    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/۬ۨᩳ;->᩻:I

    .line 1384
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/۬ۨᩳ;->ܳ:I

    invoke-virtual {p1}, Ll/۫ۨᩳ;->۬֫()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
