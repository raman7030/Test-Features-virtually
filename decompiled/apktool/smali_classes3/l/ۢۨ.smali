.class public final synthetic Ll/ۢۨ;
.super Ljava/lang/Object;
.source "A9BS"

# interfaces
.implements Landroid/view/WindowInsetsController$OnControllableInsetsChangedListener;


# instance fields
.field public final synthetic ֫:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۨ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final onControllableInsetsChanged(Landroid/view/WindowInsetsController;I)V
    .locals 0

    .line 2
    iget-object p1, p0, Ll/ۢۨ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    and-int/lit8 p2, p2, 0x8

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 212
    :goto_0
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
