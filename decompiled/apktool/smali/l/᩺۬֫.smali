.class public final Ll/᩺۬֫;
.super Ljava/lang/Object;
.source "N8HX"


# instance fields
.field public ֫:Landroid/media/metrics/LogSessionId;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    invoke-static {}, Ll/ۛۙܽ;->֫()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    iput-object v0, p0, Ll/᩺۬֫;->֫:Landroid/media/metrics/LogSessionId;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/media/metrics/LogSessionId;)V
    .locals 2

    .line 107
    iget-object v0, p0, Ll/᩺۬֫;->֫:Landroid/media/metrics/LogSessionId;

    invoke-static {}, Ll/ۛۙܽ;->֫()Landroid/media/metrics/LogSessionId;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/metrics/LogSessionId;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 108
    iput-object p1, p0, Ll/᩺۬֫;->֫:Landroid/media/metrics/LogSessionId;

    return-void
.end method
