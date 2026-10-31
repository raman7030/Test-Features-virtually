.class public final Ll/᩹ۖ;
.super Ljava/lang/Object;
.source "A513"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic ᩸:Landroid/view/View;

.field public final synthetic ᩹:Landroid/widget/ListView;


# direct methods
.method public constructor <init>(Landroid/widget/ListView;Landroid/view/View;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۖ;->᩹:Landroid/widget/ListView;

    iput-object p2, p0, Ll/᩹ۖ;->᩸:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 2

    .line 74
    iget-object v0, p0, Ll/᩹ۖ;->᩸:Landroid/view/View;

    iget-object v1, p0, Ll/᩹ۖ;->᩹:Landroid/widget/ListView;

    invoke-static {v1, v0}, Ll/᩶ۖ;->֫(Landroid/widget/ListView;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 76
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 77
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
