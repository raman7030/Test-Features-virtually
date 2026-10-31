.class public abstract Ll/ܳۘܺ;
.super Ljava/lang/Object;
.source "WB9P"

# interfaces
.implements Ll/֡ᩴܺ;
.implements Ljava/lang/Cloneable;


# instance fields
.field public final ᩸:Ll/ܽۘܺ;

.field public ᩹:Ll/᩸ۡܺ;


# direct methods
.method public constructor <init>(Ll/᩸ۡܺ;Ll/ܽۘܺ;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 52
    iput-object p2, p0, Ll/ܳۘܺ;->᩸:Ll/ܽۘܺ;

    .line 53
    iput-object p1, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    return-void

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "block == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/֨ۡܺ;Ll/ܽۘܺ;)Ll/۫ۖܺ;
    .locals 1

    .line 64
    new-instance v0, Ll/۫ۖܺ;

    invoke-direct {v0, p0, p1}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/ܳۘܺ;->clone()Ll/ܳۘܺ;

    move-result-object v0

    return-object v0
.end method

.method public clone()Ll/ܳۘܺ;
    .locals 3

    .line 73
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۘܺ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 75
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "unexpected"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public ֡()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ֨()Z
.end method

.method public final ֫(I)V
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {v0, p1}, Ll/᩸ۡܺ;->ۧ(I)Ll/᩸ۡܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗۘۢ;)V
    .locals 2

    .line 163
    iget-object v0, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    .line 165
    invoke-virtual {p1, v0}, Ll/ۗۘۢ;->֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;

    move-result-object v1

    iput-object v1, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    .line 166
    iget-object v1, p0, Ll/ܳۘܺ;->᩸:Ll/ܽۘܺ;

    invoke-virtual {v1}, Ll/ܽۘܺ;->ܿ()Ll/᩷ۘܺ;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Ll/᩷ۘܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;)V

    .line 167
    invoke-virtual {p0, p1}, Ll/ܳۘܺ;->ۧ(Ll/ۗۘۢ;)V

    return-void
.end method

.method public abstract ֫(Ll/ܿۘܺ;)V
.end method

.method public final ֫(Ll/ᩴۡܺ;)V
    .locals 2

    .line 148
    iget-object v0, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    invoke-virtual {v0}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v0

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_0

    .line 150
    iget-object v0, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    .line 151
    invoke-virtual {v0}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 152
    :cond_0
    iget-object v0, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    .line 153
    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    iget-object v1, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    invoke-virtual {v1}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v1

    .line 152
    invoke-static {v0, v1, p1}, Ll/᩸ۡܺ;->ܽ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩸ۡܺ;)V
    .locals 0

    .line 98
    iput-object p1, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    return-void
.end method

.method public final ۖ()Ll/᩸ۡܺ;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    return-object v0
.end method

.method public abstract ۘ()Ll/᩶ۡܺ;
.end method

.method public ۚ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ۜ()Ll/ۗۡܺ;
.end method

.method public abstract ۠()Ll/ܺۡܺ;
.end method

.method public abstract ۧ(Ll/ۗۘۢ;)V
.end method

.method public ܳ()Ll/᩸ۡܺ;
    .locals 1

    .line 206
    iget-object v0, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract ܺ()Ll/ܺۡܺ;
.end method

.method public abstract ܽ()Z
.end method

.method public final ܽ(I)Z
    .locals 1

    .line 125
    iget-object v0, p0, Ll/ܳۘܺ;->᩹:Ll/᩸ۡܺ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ()Ll/ܽۘܺ;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ܳۘܺ;->᩸:Ll/ܽۘܺ;

    return-object v0
.end method

.method public abstract ᩵()Z
.end method
