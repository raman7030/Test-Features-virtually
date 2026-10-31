.class public final Ll/ܺۧۢ;
.super Ll/ۖۧۢ;
.source "0BM3"


# instance fields
.field public ۗ:Ll/ۡ᩹ۡ;

.field public ۙ:Ll/ۖۧۢ;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ll/᩷ᩳۢ;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/ܺۧۢ;->ۙ:Ll/ۖۧۢ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    .line 81
    iput-boolean v0, p0, Ll/ܺۧۢ;->᩶:Z

    .line 82
    iget-object v0, p0, Ll/ܺۧۢ;->ۙ:Ll/ۖۧۢ;

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-void
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ܺۧۢ;->ۙ:Ll/ۖۧۢ;

    invoke-virtual {v0}, Ll/ۖۧۢ;->֫()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(IILl/᩷ۧۢ;)V
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ܺۧۢ;->ۙ:Ll/ۖۧۢ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۖۧۢ;->֫(IILl/᩷ۧۢ;)V

    return-void
.end method

.method public final ֫(Ll/ۖۧۢ;)V
    .locals 2

    .line 62
    iget-boolean v0, p0, Ll/ܺۧۢ;->᩶:Z

    if-eqz v0, :cond_0

    .line 63
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-void

    .line 66
    :cond_0
    iget-object v0, p0, Ll/ܺۧۢ;->ۙ:Ll/ۖۧۢ;

    if-ne v0, p1, :cond_1

    return-void

    :cond_1
    if-eqz v0, :cond_2

    .line 68
    iget-object v1, v0, Ll/ۖۧۢ;->᩸:Ll/ۜۧۢ;

    iput-object v1, p1, Ll/ۖۧۢ;->᩸:Ll/ۜۧۢ;

    .line 69
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 71
    :cond_2
    iget-object v0, p0, Ll/ܺۧۢ;->ۗ:Ll/ۡ᩹ۡ;

    invoke-virtual {p1, v0}, Ll/ۖۧۢ;->֫(Ll/ۡ᩹ۡ;)V

    .line 72
    iput-object p1, p0, Ll/ܺۧۢ;->ۙ:Ll/ۖۧۢ;

    return-void
.end method

.method public final ֫(Ll/ۜۧۢ;)V
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ܺۧۢ;->ۙ:Ll/ۖۧۢ;

    invoke-virtual {v0, p1}, Ll/ۖۧۢ;->֫(Ll/ۜۧۢ;)V

    return-void
.end method

.method public final ֫(Ll/ۡ᩹ۡ;)V
    .locals 1

    .line 76
    iput-object p1, p0, Ll/ܺۧۢ;->ۗ:Ll/ۡ᩹ۡ;

    .line 77
    iget-object v0, p0, Ll/ܺۧۢ;->ۙ:Ll/ۖۧۢ;

    invoke-virtual {v0, p1}, Ll/ۖۧۢ;->֫(Ll/ۡ᩹ۡ;)V

    return-void
.end method

.method public final ֫(Ll/۫ۧۢ;Ljava/lang/CharSequence;)V
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ܺۧۢ;->ۙ:Ll/ۖۧۢ;

    invoke-virtual {v0, p1, p2}, Ll/ۖۧۢ;->֫(Ll/۫ۧۢ;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ()Ll/ۖۧۢ;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ܺۧۢ;->ۙ:Ll/ۖۧۢ;

    return-object v0
.end method
