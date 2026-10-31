.class public final Ll/ۜ۟ᩳ;
.super Ljava/lang/Object;
.source "1BJ4"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩸:Ll/᩺ܰᩳ;

.field public final synthetic ᩹:Ll/᩷۟ᩳ;


# direct methods
.method public constructor <init>(Ll/᩷۟ᩳ;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ۟ᩳ;->᩹:Ll/᩷۟ᩳ;

    .line 19
    invoke-static {p1}, Ll/᩷۟ᩳ;->ۧ(Ll/᩷۟ᩳ;)Ll/ۧ۟ᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    new-instance v0, Ll/᩺ܰᩳ;

    invoke-direct {v0, p1}, Ll/᩺ܰᩳ;-><init>(Ll/ۧ۟ᩳ;)V

    .line 19
    iput-object v0, p0, Ll/ۜ۟ᩳ;->᩸:Ll/᩺ܰᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ۜ۟ᩳ;->᩸:Ll/᩺ܰᩳ;

    invoke-virtual {v0}, Ll/᩺ܰᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۜ۟ᩳ;->᩹:Ll/᩷۟ᩳ;

    invoke-static {v0}, Ll/᩷۟ᩳ;->ܽ(Ll/᩷۟ᩳ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۨܰᩳ;)V
    .locals 1

    .line 21
    iget-object v0, p0, Ll/ۜ۟ᩳ;->᩸:Ll/᩺ܰᩳ;

    invoke-virtual {v0, p1}, Ll/᩺ܰᩳ;->֫(Ll/ۨܰᩳ;)V

    return-void
.end method
