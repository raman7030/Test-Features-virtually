.class public abstract Ll/ۢۡۘ;
.super Ljava/lang/Object;
.source "Y7ZE"


# instance fields
.field public ֫:Ll/ܺ᩻ۘ;

.field public ۧ:Ll/۠ۢۘ;

.field public ܽ:Ll/ᩴۡۘ;

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ll/۟ۢۘ;)Z
    .locals 1

    .line 44
    invoke-virtual {p1}, Ll/۟ۢۘ;->᩷()Ll/ᩴۡۘ;

    move-result-object v0

    iput-object v0, p0, Ll/ۢۡۘ;->ܽ:Ll/ᩴۡۘ;

    .line 45
    iget-object v0, p1, Ll/۟ۢۘ;->ۖ֫:Ll/۠ۢۘ;

    iput-object v0, p0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    .line 119
    iget-object v0, v0, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    .line 46
    iput-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 3089
    iget-object p1, p1, Ll/۟ۢۘ;->ܰ֫:Ljava/lang/String;

    .line 47
    iput-object p1, p0, Ll/ۢۡۘ;->ᩳ:Ljava/lang/String;

    const/4 p1, 0x1

    return p1
.end method
