.class public final Ll/ۘۖۡ;
.super Ll/ۗ۬ۡ;
.source "W5L3"


# instance fields
.field public final synthetic ᩸:Ll/ۖۖۡ;


# direct methods
.method public constructor <init>(Ll/ۖۖۡ;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 539
    iput-object p1, p0, Ll/ۘۖۡ;->᩸:Ll/ۖۖۡ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 542
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object p1

    .line 543
    iget-object v0, p0, Ll/ۘۖۡ;->᩸:Ll/ۖۖۡ;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v1, 0x12c

    .line 544
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
