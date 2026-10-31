.class public final synthetic Ll/ᩳ۫ۡ;
.super Ljava/lang/Object;
.source "1AG9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:F

.field public final synthetic ۙ:I

.field public final synthetic ۫:Landroid/graphics/Paint;

.field public final synthetic ۬:F

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Landroid/graphics/Canvas;

.field public final synthetic ᩹:Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ۫ۡ;->᩸:Landroid/graphics/Canvas;

    iput-object p2, p0, Ll/ᩳ۫ۡ;->᩹:Ljava/lang/CharSequence;

    iput p3, p0, Ll/ᩳ۫ۡ;->᩶:I

    iput p4, p0, Ll/ᩳ۫ۡ;->ۙ:I

    iput p5, p0, Ll/ᩳ۫ۡ;->ۗ:F

    iput p6, p0, Ll/ᩳ۫ۡ;->۬:F

    iput-object p7, p0, Ll/ᩳ۫ۡ;->۫:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 2
    iget v5, p0, Ll/ᩳ۫ۡ;->۬:F

    .line 4
    iget-object v6, p0, Ll/ᩳ۫ۡ;->۫:Landroid/graphics/Paint;

    .line 1079
    iget-object v0, p0, Ll/ᩳ۫ۡ;->᩸:Landroid/graphics/Canvas;

    iget-object v1, p0, Ll/ᩳ۫ۡ;->᩹:Ljava/lang/CharSequence;

    iget v2, p0, Ll/ᩳ۫ۡ;->᩶:I

    iget v3, p0, Ll/ᩳ۫ۡ;->ۙ:I

    iget v4, p0, Ll/ᩳ۫ۡ;->ۗ:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    return-void
.end method
