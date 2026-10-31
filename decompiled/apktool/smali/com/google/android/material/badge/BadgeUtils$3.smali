.class public Lcom/google/android/material/badge/BadgeUtils$3;
.super Ll/ܽۛ;
.source "BadgeUtils.java"


# instance fields
.field public final synthetic val$badgeDrawable:Lcom/google/android/material/badge/BadgeDrawable;


# direct methods
.method public constructor <init>(Lcom/google/android/material/badge/BadgeDrawable;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/google/android/material/badge/BadgeUtils$3;->val$badgeDrawable:Lcom/google/android/material/badge/BadgeDrawable;

    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 0

    .line 168
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 169
    iget-object p1, p0, Lcom/google/android/material/badge/BadgeUtils$3;->val$badgeDrawable:Lcom/google/android/material/badge/BadgeDrawable;

    invoke-virtual {p1}, Lcom/google/android/material/badge/BadgeDrawable;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܳ۟;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method
