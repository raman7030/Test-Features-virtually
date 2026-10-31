.class public Lcom/google/android/material/navigation/DrawerLayoutUtils$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "DrawerLayoutUtils.java"


# instance fields
.field public final synthetic val$drawerLayout:Ll/۬ۧ֫;

.field public final synthetic val$drawerView:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/۬ۧ֫;Landroid/view/View;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;->val$drawerLayout:Ll/۬ۧ֫;

    iput-object p2, p0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;->val$drawerView:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 68
    iget-object p1, p0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;->val$drawerLayout:Ll/۬ۧ֫;

    iget-object v0, p0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;->val$drawerView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ll/۬ۧ֫;->֫(Landroid/view/View;Z)V

    .line 69
    iget-object p1, p0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;->val$drawerLayout:Ll/۬ۧ֫;

    const/high16 v0, -0x67000000

    invoke-virtual {p1, v0}, Ll/۬ۧ֫;->ܳ(I)V

    return-void
.end method
