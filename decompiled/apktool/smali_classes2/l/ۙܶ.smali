.class public final Ll/ۙܶ;
.super Landroid/view/ViewOutlineProvider;
.source "B1CI"


# instance fields
.field public final synthetic ֫:Ll/۬ܶ;


# direct methods
.method public constructor <init>(Ll/۬ܶ;)V
    .locals 0

    .line 547
    iput-object p1, p0, Ll/ۙܶ;->֫:Ll/۬ܶ;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 6

    .line 550
    iget-object p1, p0, Ll/ۙܶ;->֫:Ll/۬ܶ;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 551
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    const/4 v2, 0x0

    .line 552
    invoke-static {p1}, Ll/۬ܶ;->ۧ(Ll/۬ܶ;)F

    move-result v5

    const/4 v1, 0x0

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method
