.class public final Ll/۠ۤۧ;
.super Landroid/view/animation/Animation;
.source "85MM"


# instance fields
.field public final synthetic ᩸:Ll/۫ۤۧ;


# direct methods
.method public constructor <init>(Ll/۫ۤۧ;)V
    .locals 0

    .line 557
    iput-object p1, p0, Ll/۠ۤۧ;->᩸:Ll/۫ۤۧ;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 1

    const/high16 p2, 0x3f800000    # 1.0f

    sub-float/2addr p2, p1

    .line 521
    iget-object p1, p0, Ll/۠ۤۧ;->᩸:Ll/۫ۤۧ;

    iget-object v0, p1, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0, p2}, Landroid/view/View;->setScaleX(F)V

    .line 522
    iget-object p1, p1, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method
