.class public Ll/ᩴۤܿ;
.super Ljava/lang/Object;
.source "964K"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public ᩸:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/᩵ۤܿ;)V
    .locals 1

    .line 431
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 432
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ᩴۤܿ;->᩸:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 1

    .line 437
    iget-object v0, p0, Ll/ᩴۤܿ;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۤܿ;

    if-nez v0, :cond_0

    .line 439
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    return-void

    .line 441
    :cond_0
    sget-object p1, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_1

    .line 442
    invoke-static {v0}, Ll/᩵ۤܿ;->ۘ(Ll/᩵ۤܿ;)V

    :cond_1
    return-void
.end method
