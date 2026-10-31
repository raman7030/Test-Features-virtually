.class public Ll/᩻ܰۘ;
.super Ll/ۚܰۘ;
.source "CCCZ"


# instance fields
.field public final synthetic ᩸:Ll/ۜܰۘ;


# direct methods
.method public constructor <init>(Ll/ۜܰۘ;)V
    .locals 0

    .line 51
    iput-object p1, p0, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 64
    iget-object v0, p0, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    invoke-interface {v0}, Ll/֡֫ᩴ;->comparator()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 59
    iget-object v0, p0, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    invoke-virtual {v0}, Ll/ᩳܰۘ;->size()I

    move-result v0

    return v0
.end method

.method public final ᩻(C)Z
    .locals 1

    .line 54
    iget-object v0, p0, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    invoke-virtual {v0, p1}, Ll/ܳܰۘ;->֫(C)Z

    move-result p1

    return p1
.end method
