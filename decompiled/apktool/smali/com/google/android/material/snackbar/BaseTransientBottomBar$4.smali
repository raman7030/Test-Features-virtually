.class public Lcom/google/android/material/snackbar/BaseTransientBottomBar$4;
.super Ll/ܽۛ;
.source "BaseTransientBottomBar.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V
    .locals 0

    .line 415
    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$4;->this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 0

    .line 419
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    const/high16 p1, 0x100000

    .line 420
    invoke-virtual {p2, p1}, Ll/ܳ۟;->֫(I)V

    const/4 p1, 0x1

    .line 421
    invoke-virtual {p2, p1}, Ll/ܳ۟;->ܿ(Z)V

    return-void
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    const/high16 v0, 0x100000

    if-ne p2, v0, :cond_0

    .line 427
    iget-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$4;->this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->dismiss()V

    const/4 p1, 0x1

    return p1

    .line 430
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ll/ܽۛ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
