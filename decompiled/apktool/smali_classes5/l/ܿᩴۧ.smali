.class public abstract Ll/ܿᩴۧ;
.super Ll/᩶᩸֫;
.source "Y8JY"

# interfaces
.implements Ll/ܰۘۧ;


# instance fields
.field public ۗ:J

.field public ۬:Ll/ܰۘۧ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ll/᩶᩸֫;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ܿᩴۧ;->۬:Ll/ܰۘۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    invoke-interface {v0}, Ll/ܰۘۧ;->֫()I

    move-result v0

    return v0
.end method

.method public final ֫(J)I
    .locals 3

    .line 61
    iget-object v0, p0, Ll/ܿᩴۧ;->۬:Ll/ܰۘۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    iget-wide v1, p0, Ll/ܿᩴۧ;->ۗ:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Ll/ܰۘۧ;->֫(J)I

    move-result p1

    return p1
.end method

.method public final ֫(I)J
    .locals 4

    .line 56
    iget-object v0, p0, Ll/ܿᩴۧ;->۬:Ll/ܰۘۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    invoke-interface {v0, p1}, Ll/ܰۘۧ;->֫(I)J

    move-result-wide v0

    iget-wide v2, p0, Ll/ܿᩴۧ;->ۗ:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ֫(JLl/ܰۘۧ;J)V
    .locals 2

    .line 43
    iput-wide p1, p0, Ll/᩶᩸֫;->ۙ:J

    .line 44
    iput-object p3, p0, Ll/ܿᩴۧ;->۬:Ll/ܰۘۧ;

    const-wide v0, 0x7fffffffffffffffL

    cmp-long p3, p4, v0

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    move-wide p1, p4

    .line 46
    :goto_0
    iput-wide p1, p0, Ll/ܿᩴۧ;->ۗ:J

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 71
    invoke-super {p0}, Ll/᩶᩸֫;->ۧ()V

    const/4 v0, 0x0

    .line 72
    iput-object v0, p0, Ll/ܿᩴۧ;->۬:Ll/ܰۘۧ;

    return-void
.end method

.method public final ܽ(J)Ljava/util/List;
    .locals 3

    .line 66
    iget-object v0, p0, Ll/ܿᩴۧ;->۬:Ll/ܰۘۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    iget-wide v1, p0, Ll/ܿᩴۧ;->ۗ:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Ll/ܰۘۧ;->ܽ(J)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
