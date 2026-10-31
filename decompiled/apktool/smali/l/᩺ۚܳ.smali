.class public final synthetic Ll/᩺ۚܳ;
.super Ljava/lang/Object;
.source "QB4F"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ᩸:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۚܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 2
    iget-object p1, p0, Ll/᩺ۚܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 248
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
