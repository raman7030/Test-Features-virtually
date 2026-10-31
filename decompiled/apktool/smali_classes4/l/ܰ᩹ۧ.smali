.class public final Ll/ܰ᩹ۧ;
.super Ljava/lang/Object;
.source "39N7"

# interfaces
.implements Ll/ۧ᩶ۧ;


# instance fields
.field public final synthetic ֫:Ll/۟᩹ۧ;


# direct methods
.method public constructor <init>(Ll/۟᩹ۧ;)V
    .locals 0

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩹ۧ;->֫:Ll/۟᩹ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 177
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 166
    :goto_0
    iget-object p2, p0, Ll/ܰ᩹ۧ;->֫:Ll/۟᩹ۧ;

    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void
.end method
