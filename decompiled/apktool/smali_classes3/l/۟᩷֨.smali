.class public final Ll/۟᩷֨;
.super Ll/ۛۢ֨;
.source "P5QW"


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩹:Ll/֫ۢ֨;


# direct methods
.method public constructor <init>(Ll/֫ۢ֨;Ll/֫ۢ֨;I)V
    .locals 0

    .line 533
    iput-object p1, p0, Ll/۟᩷֨;->᩹:Ll/֫ۢ֨;

    iput p3, p0, Ll/۟᩷֨;->᩶:I

    invoke-direct {p0, p2}, Ll/ۛۢ֨;-><init>(Ll/֫ۢ֨;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 536
    iget-object v0, p0, Ll/۟᩷֨;->᩹:Ll/֫ۢ֨;

    iget-object v1, v0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    iget v2, p0, Ll/۟᩷֨;->᩶:I

    iget-object v0, v0, Ll/֫ۢ֨;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2, v0}, Lpl/droidsonroids/gif/GifInfoHandle;->֫(ILandroid/graphics/Bitmap;)V

    .line 537
    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    iget-object v0, v0, Ll/֫ۢ֨;->ۙ:Ll/ۗۢ֨;

    const/4 v1, -0x1

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    return-void
.end method
