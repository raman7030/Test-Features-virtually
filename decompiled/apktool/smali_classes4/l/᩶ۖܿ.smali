.class public final Ll/᩶ۖܿ;
.super Ljava/lang/Object;
.source "96ZZ"


# instance fields
.field public ֫:Ll/ۢۖܿ;

.field public final ۧ:Ll/ᩳۖܿ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ll/ᩳۖܿ;

    invoke-direct {v0}, Ll/ᩳۖܿ;-><init>()V

    iput-object v0, p0, Ll/᩶ۖܿ;->ۧ:Ll/ᩳۖܿ;

    .line 12
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۖܿ;->֫:Ll/ۢۖܿ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 57
    iget-object v0, p0, Ll/᩶ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v0}, Ll/ᩳۖܿ;->֫()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۢۖܿ;)V
    .locals 1

    const-string v0, "runs"

    .line 16
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/᩶ۖܿ;->֫:Ll/ۢۖܿ;

    .line 17
    iget-object v0, p0, Ll/᩶ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v0, p1}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    return-void
.end method

.method public final ֫(I)Z
    .locals 2

    .line 32
    iget-object v0, p0, Ll/᩶ۖܿ;->ۧ:Ll/ᩳۖܿ;

    if-ltz p1, :cond_1

    iget-object v1, p0, Ll/᩶ۖܿ;->֫:Ll/ۢۖܿ;

    invoke-virtual {v1}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-le p1, v1, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v0, p1}, Ll/ᩳۖܿ;->֫(I)Z

    move-result p1

    return p1

    .line 34
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/᩶ۖܿ;->֫:Ll/ۢۖܿ;

    invoke-virtual {v0, p1}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 52
    iget-object v0, p0, Ll/᩶ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v0}, Ll/ᩳۖܿ;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 47
    iget-object v0, p0, Ll/᩶ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v0}, Ll/ᩳۖܿ;->ܳ()Z

    move-result v0

    return v0
.end method

.method public final ܽ()Ll/᩸᩷ܿ;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/᩶ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v0}, Ll/ᩳۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 42
    iget-object v0, p0, Ll/᩶ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v0}, Ll/ᩳۖܿ;->ܿ()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 67
    iget-object v0, p0, Ll/᩶ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v0}, Ll/ᩳۖܿ;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final ᩻()V
    .locals 2

    .line 23
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۖܿ;->֫:Ll/ۢۖܿ;

    .line 24
    iget-object v1, p0, Ll/᩶ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v1, v0}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    return-void
.end method
