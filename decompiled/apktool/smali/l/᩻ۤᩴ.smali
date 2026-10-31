.class public abstract Ll/᩻ۤᩴ;
.super Ll/ܶۤᩴ;
.source "N673"


# instance fields
.field public final i:Ll/ۧۤᩴ;

.field public j:Ll/֡ۤᩴ;


# direct methods
.method public constructor <init>([Ll/֡ۤᩴ;IILl/ۧۤᩴ;)V
    .locals 1

    const/4 v0, 0x0

    .line 3429
    invoke-direct {p0, p1, p2, v0, p3}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 3430
    iput-object p4, p0, Ll/᩻ۤᩴ;->i:Ll/ۧۤᩴ;

    .line 3431
    invoke-virtual {p0}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    return-void
.end method


# virtual methods
.method public final hasMoreElements()Z
    .locals 1

    .line 3435
    iget-object v0, p0, Ll/ܶۤᩴ;->b:Ll/֡ۤᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasNext()Z
    .locals 1

    .line 3434
    iget-object v0, p0, Ll/ܶۤᩴ;->b:Ll/֡ۤᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final remove()V
    .locals 3

    .line 3439
    iget-object v0, p0, Ll/᩻ۤᩴ;->j:Ll/֡ۤᩴ;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3441
    iput-object v1, p0, Ll/᩻ۤᩴ;->j:Ll/֡ۤᩴ;

    .line 3442
    iget-object v2, p0, Ll/᩻ۤᩴ;->i:Ll/ۧۤᩴ;

    iget-object v0, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    invoke-virtual {v2, v0, v1, v1}, Ll/ۧۤᩴ;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 3440
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
