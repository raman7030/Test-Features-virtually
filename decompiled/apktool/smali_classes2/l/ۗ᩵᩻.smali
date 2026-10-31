.class public final Ll/ۗ᩵᩻;
.super Ljava/lang/Object;
.source "99YG"


# instance fields
.field public final ֫:Z

.field public final ۧ:Z

.field public final ܽ:J

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Ll/ۖۤۖ;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-virtual {p1}, Ll/᩷ۤۖ;->֫()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۗ᩵᩻;->ܿ:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Ll/ۖۤۖ;->ᩳ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗ᩵᩻;->ᩳ:J

    .line 45
    invoke-virtual {p1}, Ll/ۖۤۖ;->ܳ()Ll/᩺۫ۖ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 47
    invoke-virtual {p1}, Ll/ۖۤۖ;->ܽ()Ll/᩺۫ۖ;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {v0}, Ll/᩺۫ۖ;->ۧ()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, -0x1

    :goto_0
    iput-wide v0, p0, Ll/ۗ᩵᩻;->ܽ:J

    .line 50
    invoke-virtual {p1}, Ll/ۖۤۖ;->ܿ()J

    move-result-wide v0

    .line 56
    sget-object p1, Ll/֫ۤۖ;->ۗ:Ll/֫ۤۖ;

    invoke-static {v0, v1, p1}, Ll/ܶܰۖ;->֫(JLl/᩸ܰۖ;)Z

    move-result p1

    .line 51
    iput-boolean p1, p0, Ll/ۗ᩵᩻;->ۧ:Z

    .line 60
    sget-object p1, Ll/֫ۤۖ;->۫:Ll/֫ۤۖ;

    invoke-static {v0, v1, p1}, Ll/ܶܰۖ;->֫(JLl/᩸ܰۖ;)Z

    move-result p1

    .line 52
    iput-boolean p1, p0, Ll/ۗ᩵᩻;->֫:Z

    return-void
.end method

.method public constructor <init>(Ll/ۤۡ᩵;)V
    .locals 3

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-interface {p1}, Ll/ۤۡ᩵;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 0
    invoke-static {v2, v1, v0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 27
    :cond_0
    iput-object v0, p0, Ll/ۗ᩵᩻;->ܿ:Ljava/lang/String;

    .line 28
    invoke-interface {p1}, Ll/ۤۡ᩵;->ۚ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗ᩵᩻;->ܽ:J

    .line 29
    invoke-interface {p1}, Ll/ۤۡ᩵;->isDirectory()Z

    move-result v0

    iput-boolean v0, p0, Ll/ۗ᩵᩻;->ۧ:Z

    .line 30
    invoke-interface {p1}, Ll/ۤۡ᩵;->֨()Z

    move-result v1

    iput-boolean v1, p0, Ll/ۗ᩵᩻;->֫:Z

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    .line 31
    :cond_1
    invoke-interface {p1}, Ll/ۤۡ᩵;->length()J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Ll/ۗ᩵᩻;->ᩳ:J

    return-void
.end method

.method public constructor <init>(Ll/۬ۚۘ;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-virtual {p1}, Ll/۬ۚۘ;->֫()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩵᩻;->ܿ:Ljava/lang/String;

    const-wide/16 v0, -0x1

    .line 36
    iput-wide v0, p0, Ll/ۗ᩵᩻;->ܽ:J

    .line 37
    iput-wide v0, p0, Ll/ۗ᩵᩻;->ᩳ:J

    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Ll/ۗ᩵᩻;->ۧ:Z

    const-string v0, "$"

    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۗ᩵᩻;->֫:Z

    return-void
.end method
