.class public final Ll/۟ۤ֫;
.super Landroid/os/Handler;
.source "58TM"


# instance fields
.field public final synthetic ֫:Ll/ۧۛ֫;


# direct methods
.method public constructor <init>(Ll/ۧۛ֫;Landroid/os/Looper;)V
    .locals 0

    .line 614
    iput-object p1, p0, Ll/۟ۤ֫;->֫:Ll/ۧۛ֫;

    .line 615
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 621
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/util/Pair;

    .line 622
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 623
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 624
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x1

    iget-object v3, p0, Ll/۟ۤ֫;->֫:Ll/ۧۛ֫;

    if-eq p1, v2, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    return-void

    .line 629
    :cond_0
    invoke-static {v3, v1, v0}, Ll/ۧۛ֫;->֫(Ll/ۧۛ֫;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 626
    :cond_1
    invoke-static {v3, v1, v0}, Ll/ۧۛ֫;->ۧ(Ll/ۧۛ֫;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
