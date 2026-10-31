.class public final synthetic Ll/ܳܰۜ;
.super Ljava/lang/Object;
.source "G6MJ"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:D

.field public final synthetic ᩹:D


# direct methods
.method public synthetic constructor <init>(DD)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ܳܰۜ;->᩸:D

    iput-wide p3, p0, Ll/ܳܰۜ;->᩹:D

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 8

    .line 2
    check-cast p1, Ll/᩻ܰۜ;

    .line 4
    check-cast p2, Ll/᩻ܰۜ;

    .line 70
    iget-object v0, p1, Ll/᩻ܰۜ;->ۧ:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    float-to-double v0, v0

    iget-wide v2, p0, Ll/ܳܰۜ;->᩸:D

    sub-double/2addr v0, v2

    iget-object p1, p1, Ll/᩻ܰۜ;->ۧ:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    float-to-double v4, p1

    iget-wide v6, p0, Ll/ܳܰۜ;->᩹:D

    sub-double/2addr v4, v6

    mul-double v0, v0, v0

    mul-double v4, v4, v4

    add-double/2addr v4, v0

    iget-object p1, p2, Ll/᩻ܰۜ;->ۧ:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    float-to-double v0, p1

    sub-double/2addr v0, v2

    iget-object p1, p2, Ll/᩻ܰۜ;->ۧ:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    float-to-double p1, p1

    sub-double/2addr p1, v6

    mul-double v0, v0, v0

    mul-double p1, p1, p1

    add-double/2addr p1, v0

    .line 48
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    return p1
.end method
