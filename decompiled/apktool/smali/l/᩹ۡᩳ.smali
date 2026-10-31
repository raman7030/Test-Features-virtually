.class public final Ll/᩹ۡᩳ;
.super Ljava/lang/Object;
.source "N1X5"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic ᩸:Ll/ۙۡᩳ;


# direct methods
.method public constructor <init>(Ll/ۙۡᩳ;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۡᩳ;->᩸:Ll/ۙۡᩳ;

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 101
    sget p1, Ll/ۘܺᩳ;->ܿ:I

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string p1, "bin.mt.dstr.ipc.IDecryptorAidlInterface"

    .line 99
    invoke-interface {p2, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 100
    instance-of v0, p1, Ll/ᩴܺᩳ;

    if-eqz v0, :cond_1

    .line 101
    check-cast p1, Ll/ᩴܺᩳ;

    goto :goto_0

    .line 103
    :cond_1
    new-instance p1, Ll/ۖܺᩳ;

    invoke-direct {p1, p2}, Ll/ۖܺᩳ;-><init>(Landroid/os/IBinder;)V

    .line 101
    :goto_0
    iget-object p2, p0, Ll/᩹ۡᩳ;->᩸:Ll/ۙۡᩳ;

    invoke-static {p2, p1}, Ll/ۙۡᩳ;->֫(Ll/ۙۡᩳ;Ll/ᩴܺᩳ;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 107
    iget-object p1, p0, Ll/᩹ۡᩳ;->᩸:Ll/ۙۡᩳ;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/ۙۡᩳ;->֫(Ll/ۙۡᩳ;Ll/ᩴܺᩳ;)V

    return-void
.end method
