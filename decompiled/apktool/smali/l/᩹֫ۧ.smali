.class public final Ll/᩹֫ۧ;
.super Ljava/lang/Object;
.source "18OR"

# interfaces
.implements Ll/֡ܽۧ;


# instance fields
.field public final ᩸:Ll/֡ܽۧ;

.field public final ᩹:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ll/֡ܽۧ;Ljava/util/List;)V
    .locals 0

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    iput-object p1, p0, Ll/᩹֫ۧ;->᩸:Ll/֡ܽۧ;

    .line 157
    invoke-static {p2}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹֫ۧ;->᩹:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 183
    iget-object v0, p0, Ll/᩹֫ۧ;->᩸:Ll/֡ܽۧ;

    invoke-interface {v0}, Ll/֡ܽۧ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۨۙ֫;)Z
    .locals 1

    .line 178
    iget-object v0, p0, Ll/᩹֫ۧ;->᩸:Ll/֡ܽۧ;

    invoke-interface {v0, p1}, Ll/֡ܽۧ;->֫(Ll/ۨۙ֫;)Z

    move-result p1

    return p1
.end method

.method public final ۜ()J
    .locals 2

    .line 168
    iget-object v0, p0, Ll/᩹֫ۧ;->᩸:Ll/֡ܽۧ;

    invoke-interface {v0}, Ll/֡ܽۧ;->ۜ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ()J
    .locals 2

    .line 173
    iget-object v0, p0, Ll/᩹֫ۧ;->᩸:Ll/֡ܽۧ;

    invoke-interface {v0}, Ll/֡ܽۧ;->ۧ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(J)V
    .locals 1

    .line 188
    iget-object v0, p0, Ll/᩹֫ۧ;->᩸:Ll/֡ܽۧ;

    invoke-interface {v0, p1, p2}, Ll/֡ܽۧ;->ۧ(J)V

    return-void
.end method

.method public final ᩳ()Ll/ܳ۬ܺ;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/᩹֫ۧ;->᩹:Ll/ܳ۬ܺ;

    return-object v0
.end method
