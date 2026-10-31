.class public Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;
.super Ljava/lang/Object;
.source "SnackbarManager.java"


# instance fields
.field public final callback:Ljava/lang/ref/WeakReference;

.field public duration:I

.field public paused:Z


# direct methods
.method public constructor <init>(ILcom/google/android/material/snackbar/SnackbarManager$Callback;)V
    .locals 1

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;->callback:Ljava/lang/ref/WeakReference;

    .line 181
    iput p1, p0, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;->duration:I

    return-void
.end method


# virtual methods
.method public isSnackbar(Lcom/google/android/material/snackbar/SnackbarManager$Callback;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 185
    iget-object v0, p0, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;->callback:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
