.class public final Ll/ۗ᩻֫;
.super Ljava/lang/Object;
.source "P1H0"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᩸:Ll/۬᩻֫;

.field public final synthetic ᩹:Ll/ۛۜ֫;


# direct methods
.method public constructor <init>(Ll/۬᩻֫;Ll/ۛۜ֫;)V
    .locals 0

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ᩻֫;->᩸:Ll/۬᩻֫;

    iput-object p2, p0, Ll/ۗ᩻֫;->᩹:Ll/ۛۜ֫;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 163
    iget-object p1, p0, Ll/ۗ᩻֫;->᩹:Ll/ۛۜ֫;

    invoke-virtual {p1}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v0

    .line 164
    invoke-virtual {p1}, Ll/ۛۜ֫;->ۢ()V

    .line 165
    iget-object p1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    .line 166
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Ll/ۗ᩻֫;->᩸:Ll/۬᩻֫;

    iget-object v0, v0, Ll/۬᩻֫;->᩸:Ll/ۚۜ֫;

    invoke-static {p1, v0}, Ll/ۗ᩷֫;->֫(Landroid/view/ViewGroup;Ll/ۚۜ֫;)Ll/ۗ᩷֫;

    move-result-object p1

    .line 168
    invoke-virtual {p1}, Ll/ۗ᩷֫;->ۧ()V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
