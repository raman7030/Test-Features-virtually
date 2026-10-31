.class public final Ll/ۘ᩵֫;
.super Ljava/lang/Object;
.source "98OO"


# instance fields
.field public final ֫:Ll/֡ᩴ֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 567
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 568
    new-instance v0, Ll/֡ᩴ֫;

    invoke-direct {v0}, Ll/֡ᩴ֫;-><init>()V

    iput-object v0, p0, Ll/ۘ᩵֫;->֫:Ll/֡ᩴ֫;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ᩴ᩵֫;
    .locals 2

    .line 687
    new-instance v0, Ll/ᩴ᩵֫;

    iget-object v1, p0, Ll/ۘ᩵֫;->֫:Ll/֡ᩴ֫;

    invoke-virtual {v1}, Ll/֡ᩴ֫;->֫()Ll/ۚᩴ֫;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ᩴ᩵֫;-><init>(Ll/ۚᩴ֫;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 585
    iget-object v0, p0, Ll/ۘ᩵֫;->֫:Ll/֡ᩴ֫;

    invoke-virtual {v0, p1}, Ll/֡ᩴ֫;->֫(I)V

    return-void
.end method

.method public final ֫(IZ)V
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ۘ᩵֫;->֫:Ll/֡ᩴ֫;

    if-eqz p2, :cond_0

    .line 75
    invoke-virtual {v0, p1}, Ll/֡ᩴ֫;->֫(I)V

    return-void

    .line 599
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(Ll/ᩴ᩵֫;)V
    .locals 3

    .line 625
    invoke-static {p1}, Ll/ᩴ᩵֫;->֫(Ll/ᩴ᩵֫;)Ll/ۚᩴ֫;

    move-result-object p1

    iget-object v0, p0, Ll/ۘ᩵֫;->֫:Ll/֡ᩴ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 104
    :goto_0
    invoke-virtual {p1}, Ll/ۚᩴ֫;->֫()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 105
    invoke-virtual {p1, v1}, Ll/ۚᩴ֫;->ۧ(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ll/֡ᩴ֫;->֫(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final varargs ֫([I)V
    .locals 4

    .line 612
    iget-object v0, p0, Ll/ۘ᩵֫;->֫:Ll/֡ᩴ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, p1, v2

    .line 90
    invoke-virtual {v0, v3}, Ll/֡ᩴ֫;->֫(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
