.class public Ll/ᩴ֫;
.super Ll/᩻֫;
.source "N5R1"


# instance fields
.field public final ܿ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/᩵֫;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "android.support.v4.media.session.IMediaControllerCallback"

    .line 67
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 924
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ᩴ֫;->ܿ:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵ۧ;)V
    .locals 0

    .line 945
    iget-object p1, p0, Ll/ᩴ֫;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵֫;

    return-void
.end method

.method public final ۛ()V
    .locals 1

    .line 1029
    iget-object v0, p0, Ll/ᩴ֫;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫;

    return-void
.end method

.method public final ۤ()V
    .locals 1

    .line 986
    iget-object v0, p0, Ll/ᩴ֫;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫;

    return-void
.end method

.method public final ۨ()V
    .locals 1

    .line 999
    iget-object v0, p0, Ll/ᩴ֫;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫;

    return-void
.end method

.method public final ۫()V
    .locals 1

    .line 929
    iget-object v0, p0, Ll/ᩴ֫;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫;

    return-void
.end method

.method public final ۬()V
    .locals 1

    .line 977
    iget-object v0, p0, Ll/ᩴ֫;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫;

    return-void
.end method
