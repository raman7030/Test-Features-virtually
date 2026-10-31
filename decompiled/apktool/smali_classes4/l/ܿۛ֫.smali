.class public final Ll/ܿۛ֫;
.super Landroid/os/Handler;
.source "08RN"


# instance fields
.field public final synthetic ֫:Ll/ۖۛ֫;


# direct methods
.method public constructor <init>(Ll/ۖۛ֫;Landroid/os/Looper;)V
    .locals 0

    .line 798
    iput-object p1, p0, Ll/ܿۛ֫;->֫:Ll/ۖۛ֫;

    .line 799
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 804
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    if-nez v0, :cond_0

    goto :goto_0

    .line 809
    :cond_0
    iget-object v1, p0, Ll/ܿۛ֫;->֫:Ll/ۖۛ֫;

    invoke-static {v1}, Ll/ۖۛ֫;->ۢ(Ll/ۖۛ֫;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧۛ֫;

    .line 810
    invoke-virtual {v2, v0}, Ll/ۧۛ֫;->֫([B)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 811
    iget p1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, p1}, Ll/ۧۛ֫;->֫(I)V

    :cond_2
    :goto_0
    return-void
.end method
