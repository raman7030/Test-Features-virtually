.class public Ll/۬ۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ᩸:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 3025
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۛᩳ;->᩸:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 1

    .line 3029
    sget-object v0, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-ne p2, v0, :cond_0

    .line 3030
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    .line 3031
    iget-object p1, p0, Ll/۬ۛᩳ;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫ۨᩳ;

    if-eqz p1, :cond_0

    .line 3032
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۚܽ()V

    :cond_0
    return-void
.end method
