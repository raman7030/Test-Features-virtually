.class public Lcom/google/android/material/progressindicator/BaseProgressIndicator$1;
.super Ljava/lang/Object;
.source "BaseProgressIndicator.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/progressindicator/BaseProgressIndicator;


# direct methods
.method public constructor <init>(Lcom/google/android/material/progressindicator/BaseProgressIndicator;)V
    .locals 0

    .line 811
    iput-object p1, p0, Lcom/google/android/material/progressindicator/BaseProgressIndicator$1;->this$0:Lcom/google/android/material/progressindicator/BaseProgressIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 814
    iget-object v0, p0, Lcom/google/android/material/progressindicator/BaseProgressIndicator$1;->this$0:Lcom/google/android/material/progressindicator/BaseProgressIndicator;

    invoke-static {v0}, Lcom/google/android/material/progressindicator/BaseProgressIndicator;->access$000(Lcom/google/android/material/progressindicator/BaseProgressIndicator;)V

    return-void
.end method
