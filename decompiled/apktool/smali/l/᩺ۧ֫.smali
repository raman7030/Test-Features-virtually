.class public final Ll/᩺ۧ֫;
.super Ljava/lang/Object;
.source "RB4Y"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic ᩸:Ll/ܰۧ֫;


# direct methods
.method public constructor <init>(Ll/ܰۧ֫;)V
    .locals 0

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۧ֫;->᩸:Ll/ܰۧ֫;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 2

    .line 207
    iget-object p1, p0, Ll/᩺ۧ֫;->᩸:Ll/ܰۧ֫;

    iget-object p1, p1, Ll/ۨۧ֫;->֫:Ll/ۤۧ֫;

    .line 60
    iget-object p1, p1, Ll/ۤۧ֫;->֫:Ll/۟ۧ֫;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 61
    invoke-virtual {p1, v0, v1}, Ll/۟ۧ֫;->֫(J)V

    .line 62
    iget-object p2, p1, Ll/۟ۧ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_0

    .line 63
    invoke-virtual {p1}, Ll/۟ۧ֫;->֫()Ll/ۨۧ֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨۧ֫;->֫()V

    :cond_0
    return-void
.end method
