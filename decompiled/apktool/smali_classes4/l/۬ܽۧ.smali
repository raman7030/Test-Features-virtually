.class public final Ll/۬ܽۧ;
.super Ljava/lang/Object;
.source "K8M4"

# interfaces
.implements Ll/ᩴܽۧ;


# instance fields
.field public final ֫:Ll/ᩴܽۧ;

.field public final ۧ:J


# direct methods
.method public constructor <init>(Ll/ᩴܽۧ;J)V
    .locals 0

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    iput-object p1, p0, Ll/۬ܽۧ;->֫:Ll/ᩴܽۧ;

    .line 185
    iput-wide p2, p0, Ll/۬ܽۧ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final ֫(J)I
    .locals 2

    .line 214
    iget-wide v0, p0, Ll/۬ܽۧ;->ۧ:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Ll/۬ܽۧ;->֫:Ll/ᩴܽۧ;

    invoke-interface {v0, p1, p2}, Ll/ᩴܽۧ;->֫(J)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I
    .locals 4

    .line 205
    iget-object v0, p0, Ll/۬ܽۧ;->֫:Ll/ᩴܽۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/ᩴܽۧ;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result p1

    const/4 p3, -0x4

    if-ne p1, p3, :cond_0

    .line 207
    iget-wide v0, p2, Ll/᩸᩸֫;->ۤ:J

    iget-wide v2, p0, Ll/۬ܽۧ;->ۧ:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Ll/᩸᩸֫;->ۤ:J

    :cond_0
    return p1
.end method

.method public final ֫()V
    .locals 1

    .line 199
    iget-object v0, p0, Ll/۬ܽۧ;->֫:Ll/ᩴܽۧ;

    invoke-interface {v0}, Ll/ᩴܽۧ;->֫()V

    return-void
.end method

.method public final ۧ()Ll/ᩴܽۧ;
    .locals 1

    .line 189
    iget-object v0, p0, Ll/۬ܽۧ;->֫:Ll/ᩴܽۧ;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 194
    iget-object v0, p0, Ll/۬ܽۧ;->֫:Ll/ᩴܽۧ;

    invoke-interface {v0}, Ll/ᩴܽۧ;->ܿ()Z

    move-result v0

    return v0
.end method
