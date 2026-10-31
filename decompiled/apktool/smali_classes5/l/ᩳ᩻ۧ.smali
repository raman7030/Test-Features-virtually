.class public final Ll/ᩳ᩻ۧ;
.super Ljava/lang/Object;
.source "Z8VY"

# interfaces
.implements Ll/֫۟֫;
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final ᩸:Landroid/os/Handler;

.field public final synthetic ᩹:Ll/ܿ᩻ۧ;


# direct methods
.method public constructor <init>(Ll/ܿ᩻ۧ;Ll/ۧ۟֫;)V
    .locals 0

    .line 2840
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ᩻ۧ;->᩹:Ll/ܿ᩻ۧ;

    .line 2841
    invoke-static {p0}, Ll/ۘ֨֫;->֫(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ᩻ۧ;->᩸:Landroid/os/Handler;

    .line 2842
    invoke-interface {p2, p0, p1}, Ll/ۧ۟֫;->֫(Ll/֫۟֫;Landroid/os/Handler;)V

    return-void
.end method

.method private ۧ(J)V
    .locals 4

    .line 2879
    iget-object v0, p0, Ll/ᩳ᩻ۧ;->᩹:Ll/ܿ᩻ۧ;

    iget-object v1, v0, Ll/ܿ᩻ۧ;->᩷ᩳ:Ll/ᩳ᩻ۧ;

    if-ne p0, v1, :cond_2

    invoke-static {v0}, Ll/ܿ᩻ۧ;->ܿ(Ll/ܿ᩻ۧ;)Ll/ۧ۟֫;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide v1, 0x7fffffffffffffffL

    cmp-long v3, p1, v1

    if-nez v3, :cond_1

    .line 2884
    invoke-static {v0}, Ll/ܿ᩻ۧ;->ܽ(Ll/ܿ᩻ۧ;)V

    return-void

    .line 2887
    :cond_1
    :try_start_0
    invoke-virtual {v0, p1, p2}, Ll/ܿ᩻ۧ;->ܳ(J)V
    :try_end_0
    .catch Ll/ᩳ᩶֫; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 2889
    invoke-static {v0, p1}, Ll/ܿ᩻ۧ;->֫(Ll/ܿ᩻ۧ;Ll/ᩳ᩶֫;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 6

    .line 2869
    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2871
    :cond_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget p1, p1, Landroid/os/Message;->arg2:I

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    const/16 v4, 0x20

    shl-long/2addr v0, v4

    int-to-long v4, p1

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Ll/ᩳ᩻ۧ;->ۧ(J)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(J)V
    .locals 2

    .line 2854
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v1, v0

    long-to-int p2, p1

    .line 2856
    iget-object p1, p0, Ll/ᩳ᩻ۧ;->᩸:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object p2

    .line 2861
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    return-void

    .line 2863
    :cond_0
    invoke-direct {p0, p1, p2}, Ll/ᩳ᩻ۧ;->ۧ(J)V

    return-void
.end method
