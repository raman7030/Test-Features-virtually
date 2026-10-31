.class public final Ll/ۙܽ;
.super Ljava/lang/Object;
.source "K234"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic ֫:Ll/֫᩹᩵;

.field public final synthetic ۧ:Ll/֫᩹᩵;

.field public final synthetic ܽ:Ll/ܺ᩹᩵;

.field public final synthetic ᩳ:Ll/ܺ᩹᩵;


# direct methods
.method public constructor <init>(Ll/ܺ᩹᩵;Ll/ܺ᩹᩵;Ll/֫᩹᩵;Ll/֫᩹᩵;)V
    .locals 0

    .line 382
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ۙܽ;->ᩳ:Ll/ܺ᩹᩵;

    iput-object p2, p0, Ll/ۙܽ;->ܽ:Ll/ܺ᩹᩵;

    iput-object p3, p0, Ll/ۙܽ;->ۧ:Ll/֫᩹᩵;

    iput-object p4, p0, Ll/ۙܽ;->֫:Ll/֫᩹᩵;

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 396
    iget-object v0, p0, Ll/ۙܽ;->֫:Ll/֫᩹᩵;

    invoke-interface {v0}, Ll/֫᩹᩵;->֫()Ljava/lang/Object;

    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    .line 392
    iget-object v0, p0, Ll/ۙܽ;->ۧ:Ll/֫᩹᩵;

    invoke-interface {v0}, Ll/֫᩹᩵;->֫()Ljava/lang/Object;

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    iget-object v0, p0, Ll/ۙܽ;->ܽ:Ll/ܺ᩹᩵;

    new-instance v1, Ll/᩶ۧ;

    invoke-direct {v1, p1}, Ll/᩶ۧ;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    iget-object v0, p0, Ll/ۙܽ;->ᩳ:Ll/ܺ᩹᩵;

    new-instance v1, Ll/᩶ۧ;

    invoke-direct {v1, p1}, Ll/᩶ۧ;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
