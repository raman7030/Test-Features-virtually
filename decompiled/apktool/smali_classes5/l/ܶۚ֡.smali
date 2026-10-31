.class public final Ll/ܶۚ֡;
.super Ll/ᩴۚ֡;
.source "58ZY"


# instance fields
.field public ۜ:Ljava/lang/String;

.field public ᩷:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ll/ᩴۚ֡;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    .line 62
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/ܶۚ֡;->᩷:Ljava/lang/Integer;

    return-void
.end method

.method public final ֫(Ljava/lang/Integer;)V
    .locals 0

    .line 34
    iput-object p1, p0, Ll/ܶۚ֡;->᩷:Ljava/lang/Integer;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Ll/ܶۚ֡;->ۜ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/ۤۚ֡;)V
    .locals 0

    .line 23
    invoke-interface {p1, p0}, Ll/ۤۚ֡;->֫(Ll/ܶۚ֡;)V

    return-void
.end method

.method public final ۡ()Ljava/lang/Integer;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ܶۚ֡;->᩷:Ljava/lang/Integer;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ܶۚ֡;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܺ()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 54
    iget-object v0, p0, Ll/ܶۚ֡;->᩷:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
