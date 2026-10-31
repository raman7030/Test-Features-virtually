.class public Lcom/google/android/material/search/SearchBar$1;
.super Ljava/lang/Object;
.source "SearchBar.java"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/search/SearchBar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/search/SearchBar;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/google/android/material/search/SearchBar$1;->this$0:Lcom/google/android/material/search/SearchBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 233
    iget-object p1, p0, Lcom/google/android/material/search/SearchBar$1;->this$0:Lcom/google/android/material/search/SearchBar;

    .line 234
    invoke-static {p1}, Lcom/google/android/material/search/SearchBar;->access$000(Lcom/google/android/material/search/SearchBar;)Landroid/view/accessibility/AccessibilityManager;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/search/SearchBar$1;->this$0:Lcom/google/android/material/search/SearchBar;

    invoke-static {v0}, Lcom/google/android/material/search/SearchBar;->access$100(Lcom/google/android/material/search/SearchBar;)Ll/ۛܰ;

    move-result-object v0

    .line 233
    invoke-static {p1, v0}, Ll/᩺ܰ;->֫(Landroid/view/accessibility/AccessibilityManager;Ll/ۛܰ;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 239
    iget-object p1, p0, Lcom/google/android/material/search/SearchBar$1;->this$0:Lcom/google/android/material/search/SearchBar;

    .line 240
    invoke-static {p1}, Lcom/google/android/material/search/SearchBar;->access$000(Lcom/google/android/material/search/SearchBar;)Landroid/view/accessibility/AccessibilityManager;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/search/SearchBar$1;->this$0:Lcom/google/android/material/search/SearchBar;

    invoke-static {v0}, Lcom/google/android/material/search/SearchBar;->access$100(Lcom/google/android/material/search/SearchBar;)Ll/ۛܰ;

    move-result-object v0

    .line 239
    invoke-static {p1, v0}, Ll/᩺ܰ;->ۧ(Landroid/view/accessibility/AccessibilityManager;Ll/ۛܰ;)V

    return-void
.end method
