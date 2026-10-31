.class public final Ll/᩺᩸;
.super Ljava/lang/Object;
.source "S6AR"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# instance fields
.field public final synthetic ᩸:Ll/ᩳ᩹;


# direct methods
.method public constructor <init>(Ll/ᩳ᩹;)V
    .locals 0

    .line 3218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩸;->᩸:Ll/ᩳ᩹;

    return-void
.end method


# virtual methods
.method public final onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 3223
    iget-object v0, p0, Ll/᩺᩸;->᩸:Ll/ᩳ᩹;

    iget-object v0, v0, Ll/ᩳ᩹;->mOnHierarchyChangeListener:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    if-eqz v0, :cond_0

    .line 3224
    invoke-interface {v0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewAdded(Landroid/view/View;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x2

    .line 3230
    iget-object v1, p0, Ll/᩺᩸;->᩸:Ll/ᩳ᩹;

    invoke-virtual {v1, v0}, Ll/ᩳ᩹;->onChildViewsChanged(I)V

    .line 3232
    iget-object v0, v1, Ll/ᩳ᩹;->mOnHierarchyChangeListener:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    if-eqz v0, :cond_0

    .line 3233
    invoke-interface {v0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V

    :cond_0
    return-void
.end method
