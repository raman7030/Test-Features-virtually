.class public Ll/۠᩶᩷;
.super Ll/֡᩶᩷;
.source "86W4"


# instance fields
.field public ܿۧ:Z

.field public ᩳۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ll/֡᩶᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Z)V
    .locals 0

    .line 32
    iput-boolean p1, p0, Ll/۠᩶᩷;->ᩳۧ:Z

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "McpActivity"

    return-object v0
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 27
    iput-boolean p1, p0, Ll/۠᩶᩷;->ܿۧ:Z

    return-void
.end method

.method public final ۨ()V
    .locals 0

    .line 20
    invoke-static {p0}, Ll/ܿۤ᩻;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ᩺()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Ll/۠᩶᩷;->ܿۧ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/۠᩶᩷;->ᩳۧ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
