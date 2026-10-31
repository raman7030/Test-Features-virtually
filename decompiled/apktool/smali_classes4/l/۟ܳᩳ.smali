.class public abstract Ll/۟ܳᩳ;
.super Ljava/lang/Object;
.source "8B3M"

# interfaces
.implements Ll/ܰܳᩳ;


# instance fields
.field public final ᩸:Ll/ܺܰܳ;


# direct methods
.method public constructor <init>(Ll/ܺܰܳ;)V
    .locals 0

    .line 448
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 449
    iput-object p1, p0, Ll/۟ܳᩳ;->᩸:Ll/ܺܰܳ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 464
    iget-object v0, p0, Ll/۟ܳᩳ;->᩸:Ll/ܺܰܳ;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public final synthetic ۜ(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ܽ()V
    .locals 1

    .line 454
    iget-object v0, p0, Ll/۟ܳᩳ;->᩸:Ll/ܺܰܳ;

    invoke-virtual {v0}, Ll/ۘ۠ۢ;->cancel()V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 459
    iget-object v0, p0, Ll/۟ܳᩳ;->᩸:Ll/ܺܰܳ;

    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final synthetic ᩻֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
