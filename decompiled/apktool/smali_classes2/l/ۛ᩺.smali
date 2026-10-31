.class public final Ll/ۛ᩺;
.super Ljava/lang/Object;
.source "R9NW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Landroid/view/View;

.field public final synthetic ᩶:Landroid/animation/ValueAnimator;

.field public final synthetic ᩸:Ll/ܿܰ;

.field public final synthetic ᩹:Ll/ۗ᩺;


# direct methods
.method public constructor <init>(Landroid/view/View;Ll/ܿܰ;Ll/ۗ᩺;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 848
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩺;->ۙ:Landroid/view/View;

    iput-object p2, p0, Ll/ۛ᩺;->᩸:Ll/ܿܰ;

    iput-object p3, p0, Ll/ۛ᩺;->᩹:Ll/ۗ᩺;

    iput-object p4, p0, Ll/ۛ᩺;->᩶:Landroid/animation/ValueAnimator;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 851
    iget-object v0, p0, Ll/ۛ᩺;->᩸:Ll/ܿܰ;

    iget-object v1, p0, Ll/ۛ᩺;->᩹:Ll/ۗ᩺;

    iget-object v2, p0, Ll/ۛ᩺;->ۙ:Landroid/view/View;

    invoke-static {v2, v0, v1}, Ll/᩺᩺;->֫(Landroid/view/View;Ll/ܿܰ;Ll/ۗ᩺;)V

    .line 852
    iget-object v0, p0, Ll/ۛ᩺;->᩶:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
