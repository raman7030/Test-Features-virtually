.class public final Ll/ۧۨܽ;
.super Ljava/lang/Object;
.source "H5BW"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/ܳۡ֫;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ܳۡ֫;)V
    .locals 0

    .line 368
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۨܽ;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۧۨܽ;->᩹:Ll/ܳۡ֫;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 371
    iget-object p1, p0, Ll/ۧۨܽ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    iget-object v0, p0, Ll/ۧۨܽ;->᩹:Ll/ܳۡ֫;

    invoke-virtual {p1, v0}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 376
    iget-object p1, p0, Ll/ۧۨܽ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    iget-object v0, p0, Ll/ۧۨܽ;->᩹:Ll/ܳۡ֫;

    invoke-virtual {p1, v0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    return-void
.end method
