.class public final Ll/֨ۚ֡;
.super Ljava/lang/Object;
.source "Q18Y"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ᩸:Ll/֡ۚ֡;

.field public ᩹:Ll/֡ۚ֡;


# direct methods
.method public constructor <init>(Ll/֡ۚ֡;Ll/֡ۚ֡;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Ll/֨ۚ֡;->᩹:Ll/֡ۚ֡;

    .line 42
    iput-object p2, p0, Ll/֨ۚ֡;->᩸:Ll/֡ۚ֡;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 47
    iget-object v0, p0, Ll/֨ۚ֡;->᩹:Ll/֡ۚ֡;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/֨ۚ֡;->᩸:Ll/֡ۚ֡;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 52
    iget-object v0, p0, Ll/֨ۚ֡;->᩹:Ll/֡ۚ֡;

    .line 53
    invoke-virtual {v0}, Ll/֡ۚ֡;->ܽ()Ll/֡ۚ֡;

    move-result-object v1

    iput-object v1, p0, Ll/֨ۚ֡;->᩹:Ll/֡ۚ֡;

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 59
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
