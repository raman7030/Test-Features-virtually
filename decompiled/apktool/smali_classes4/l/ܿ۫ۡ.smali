.class public final synthetic Ll/ܿ۫ۡ;
.super Ljava/lang/Object;
.source "1AG9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:F

.field public final synthetic ۙ:F

.field public final synthetic ۬:Landroid/graphics/Paint;

.field public final synthetic ᩶:F

.field public final synthetic ᩸:Landroid/graphics/Canvas;

.field public final synthetic ᩹:F


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۫ۡ;->᩸:Landroid/graphics/Canvas;

    iput p3, p0, Ll/ܿ۫ۡ;->᩹:F

    iput p4, p0, Ll/ܿ۫ۡ;->᩶:F

    iput p5, p0, Ll/ܿ۫ۡ;->ۙ:F

    iput p6, p0, Ll/ܿ۫ۡ;->ۗ:F

    iput-object p2, p0, Ll/ܿ۫ۡ;->۬:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 2
    iget v4, p0, Ll/ܿ۫ۡ;->ۗ:F

    .line 4
    iget-object v5, p0, Ll/ܿ۫ۡ;->۬:Landroid/graphics/Paint;

    .line 1104
    iget-object v0, p0, Ll/ܿ۫ۡ;->᩸:Landroid/graphics/Canvas;

    iget v1, p0, Ll/ܿ۫ۡ;->᩹:F

    iget v2, p0, Ll/ܿ۫ۡ;->᩶:F

    iget v3, p0, Ll/ܿ۫ۡ;->ۙ:F

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method
