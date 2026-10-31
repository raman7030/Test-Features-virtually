.class public Ll/۟ܳ᩷;
.super Ljava/lang/Object;
.source "55FS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩸:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;)V
    .locals 1

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/۟ܳ᩷;->᩸:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public synthetic constructor <init>(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;Ll/ܰܳ᩷;)V
    .locals 0

    .line 175
    invoke-direct {p0, p1}, Ll/۟ܳ᩷;-><init>(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 184
    iget-object v0, p0, Ll/۟ܳ᩷;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;

    if-eqz v0, :cond_0

    .line 185
    invoke-static {v0}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->access$100(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 186
    invoke-static {v0, v1}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->access$102(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;Z)Z

    .line 187
    invoke-static {v0}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->access$200(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;)Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    move-result-object v0

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->show()V

    :cond_0
    return-void
.end method
