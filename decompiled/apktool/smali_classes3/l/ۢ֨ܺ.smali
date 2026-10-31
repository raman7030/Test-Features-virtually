.class public final Ll/ۢ֨ܺ;
.super Ll/ۖ֨ܺ;
.source "TB7B"


# instance fields
.field public ֫:Landroid/graphics/Path;

.field public final synthetic ۧ:Ll/ᩴ֨ܺ;

.field public ܽ:F

.field public ᩳ:F


# direct methods
.method public constructor <init>(Ll/ᩴ֨ܺ;FFLandroid/graphics/Path;)V
    .locals 0

    .line 1578
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4196
    iput-object p1, p0, Ll/ۢ֨ܺ;->ۧ:Ll/ᩴ֨ܺ;

    .line 4197
    iput p2, p0, Ll/ۢ֨ܺ;->ܽ:F

    .line 4198
    iput p3, p0, Ll/ۢ֨ܺ;->ᩳ:F

    .line 4199
    iput-object p4, p0, Ll/ۢ֨ܺ;->֫:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 9

    .line 4216
    iget-object v0, p0, Ll/ۢ֨ܺ;->ۧ:Ll/ᩴ֨ܺ;

    invoke-static {v0}, Ll/ᩴ֨ܺ;->ܽ(Ll/ᩴ֨ܺ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4219
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 4220
    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v2

    iget-object v2, v2, Ll/ۡ֨ܺ;->֫:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    iget v6, p0, Ll/ۢ֨ܺ;->ܽ:F

    iget v7, p0, Ll/ۢ֨ܺ;->ᩳ:F

    const/4 v4, 0x0

    move-object v3, p1

    move-object v8, v1

    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    .line 4221
    iget-object v2, p0, Ll/ۢ֨ܺ;->֫:Landroid/graphics/Path;

    invoke-virtual {v2, v1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 4225
    :cond_0
    iget v1, p0, Ll/ۢ֨ܺ;->ܽ:F

    invoke-static {v0}, Ll/ᩴ֨ܺ;->ۧ(Ll/ᩴ֨ܺ;)Ll/ۡ֨ܺ;

    move-result-object v0

    iget-object v0, v0, Ll/ۡ֨ܺ;->֫:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    add-float/2addr p1, v1

    iput p1, p0, Ll/ۢ֨ܺ;->ܽ:F

    return-void
.end method

.method public final ֫(Ll/ۤۚܺ;)Z
    .locals 0

    .line 4205
    instance-of p1, p1, Ll/ۛۚܺ;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
