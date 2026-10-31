.class public Lcom/google/android/material/badge/BadgeUtils$1;
.super Ljava/lang/Object;
.source "BadgeUtils.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic val$badgeDrawable:Lcom/google/android/material/badge/BadgeDrawable;

.field public final synthetic val$customBadgeParent:Landroid/widget/FrameLayout;

.field public final synthetic val$menuItemId:I

.field public final synthetic val$toolbar:Ll/ۢᩴ;


# direct methods
.method public constructor <init>(Ll/ۢᩴ;ILcom/google/android/material/badge/BadgeDrawable;Landroid/widget/FrameLayout;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$toolbar:Ll/ۢᩴ;

    iput p2, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$menuItemId:I

    iput-object p3, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$badgeDrawable:Lcom/google/android/material/badge/BadgeDrawable;

    iput-object p4, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$customBadgeParent:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 137
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$toolbar:Ll/ۢᩴ;

    iget v1, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$menuItemId:I

    .line 138
    invoke-static {v0, v1}, Lcom/google/android/material/internal/ToolbarUtils;->getActionMenuItemView(Ll/ۢᩴ;I)Ll/ۢۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 140
    iget-object v1, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$badgeDrawable:Lcom/google/android/material/badge/BadgeDrawable;

    iget-object v2, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$toolbar:Ll/ۢᩴ;

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/material/badge/BadgeUtils;->setToolbarOffset(Lcom/google/android/material/badge/BadgeDrawable;Landroid/content/res/Resources;)V

    .line 141
    iget-object v1, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$badgeDrawable:Lcom/google/android/material/badge/BadgeDrawable;

    iget-object v2, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$customBadgeParent:Landroid/widget/FrameLayout;

    invoke-static {v1, v0, v2}, Lcom/google/android/material/badge/BadgeUtils;->attachBadgeDrawable(Lcom/google/android/material/badge/BadgeDrawable;Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 142
    iget-object v1, p0, Lcom/google/android/material/badge/BadgeUtils$1;->val$badgeDrawable:Lcom/google/android/material/badge/BadgeDrawable;

    invoke-static {v1, v0}, Lcom/google/android/material/badge/BadgeUtils;->access$000(Lcom/google/android/material/badge/BadgeDrawable;Landroid/view/View;)V

    :cond_0
    return-void
.end method
