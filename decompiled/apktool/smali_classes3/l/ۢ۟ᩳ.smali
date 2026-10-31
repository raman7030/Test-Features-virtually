.class public final synthetic Ll/ۢ۟ᩳ;
.super Ljava/lang/Object;
.source "35IJ"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic ֫:Ll/ۡ۟ᩳ;

.field public final synthetic ۧ:Landroid/graphics/Bitmap;

.field public final synthetic ܽ:I

.field public final synthetic ܿ:Landroid/view/View;

.field public final synthetic ᩳ:I


# direct methods
.method public synthetic constructor <init>(Ll/ۡ۟ᩳ;Landroid/graphics/Bitmap;IILandroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ۟ᩳ;->֫:Ll/ۡ۟ᩳ;

    iput-object p2, p0, Ll/ۢ۟ᩳ;->ۧ:Landroid/graphics/Bitmap;

    iput p3, p0, Ll/ۢ۟ᩳ;->ܽ:I

    iput p4, p0, Ll/ۢ۟ᩳ;->ᩳ:I

    iput-object p5, p0, Ll/ۢ۟ᩳ;->ܿ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 6

    .line 0
    iget-object v0, p0, Ll/ۢ۟ᩳ;->֫:Ll/ۡ۟ᩳ;

    iget-object v1, p0, Ll/ۢ۟ᩳ;->ۧ:Landroid/graphics/Bitmap;

    iget v2, p0, Ll/ۢ۟ᩳ;->ܽ:I

    iget v3, p0, Ll/ۢ۟ᩳ;->ᩳ:I

    iget-object v4, p0, Ll/ۢ۟ᩳ;->ܿ:Landroid/view/View;

    move v5, p1

    invoke-static/range {v0 .. v5}, Ll/ۡ۟ᩳ;->֫(Ll/ۡ۟ᩳ;Landroid/graphics/Bitmap;IILandroid/view/View;I)V

    return-void
.end method
