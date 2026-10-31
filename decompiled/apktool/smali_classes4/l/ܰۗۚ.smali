.class public abstract Ll/ܰۗۚ;
.super Ljava/lang/Object;
.source "47EO"

# interfaces
.implements Ll/ۗۗۚ;


# instance fields
.field public ۧ:Ll/ܶ۬ۚ;

.field public final ܽ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/᩸۬ۚ;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ܰۗۚ;->ܽ:Ljava/lang/String;

    .line 54
    iput-object p2, p0, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    return-void
.end method

.method public static varargs ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    .line 32
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ܰۗۚ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public varargs ֫(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 46
    new-instance p1, Ll/۬ۗۚ;

    invoke-direct {p1}, Ll/۬ۗۚ;-><init>()V

    throw p1
.end method

.method public varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 69
    new-instance p1, Ll/۬ۗۚ;

    invoke-direct {p1}, Ll/۬ۗۚ;-><init>()V

    throw p1
.end method

.method public ֫(Ljava/lang/Throwable;)V
    .locals 3

    .line 73
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-wide/32 v1, 0x7fffffff

    invoke-interface {p0, v1, v2, p1, v0}, Ll/ۗۗۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ֫(Ll/᩻۬ۚ;)V
    .locals 1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    invoke-interface {p1}, Ll/᩻۬ۚ;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ۡ۠ᩴ;->get(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۗۚ;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ܰۗۚ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public varargs abstract ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
.end method
