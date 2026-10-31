.class public Lcom/google/android/material/bottomappbar/BottomAppBar$8;
.super Ljava/lang/Object;
.source "BottomAppBar.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/bottomappbar/BottomAppBar;

.field public final synthetic val$actionMenuView:Ll/ۡۢ;

.field public final synthetic val$fabAlignmentMode:I

.field public final synthetic val$fabAttached:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomappbar/BottomAppBar;Ll/ۡۢ;IZ)V
    .locals 0

    .line 1115
    iput-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$8;->this$0:Lcom/google/android/material/bottomappbar/BottomAppBar;

    iput-object p2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$8;->val$actionMenuView:Ll/ۡۢ;

    iput p3, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$8;->val$fabAlignmentMode:I

    iput-boolean p4, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$8;->val$fabAttached:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1118
    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$8;->val$actionMenuView:Ll/ۡۢ;

    iget-object v1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$8;->this$0:Lcom/google/android/material/bottomappbar/BottomAppBar;

    iget v2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$8;->val$fabAlignmentMode:I

    iget-boolean v3, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$8;->val$fabAttached:Z

    .line 1119
    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getActionMenuViewTranslationX(Ll/ۡۢ;IZ)I

    move-result v1

    int-to-float v1, v1

    .line 1118
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method
