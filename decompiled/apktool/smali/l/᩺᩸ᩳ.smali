.class public final Ll/᩺᩸ᩳ;
.super Ljava/lang/Object;
.source "06R7"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic ᩶:Ll/۟᩸ᩳ;

.field public ᩸:Z

.field public final ᩹:Ll/᩹᩹ᩳ;


# direct methods
.method public constructor <init>(Ll/۟᩸ᩳ;II)V
    .locals 1

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩸ᩳ;->᩶:Ll/۟᩸ᩳ;

    .line 226
    new-instance v0, Ll/᩹᩹ᩳ;

    invoke-static {p1}, Ll/۟᩸ᩳ;->ܽ(Ll/۟᩸ᩳ;)Ll/۫᩹ᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3}, Ll/᩹᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;II)V

    iput-object v0, p0, Ll/᩺᩸ᩳ;->᩹:Ll/᩹᩹ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 238
    iget-boolean v0, p0, Ll/᩺᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 239
    iput-boolean v0, p0, Ll/᩺᩸ᩳ;->᩸:Z

    .line 240
    iget-object v0, p0, Ll/᩺᩸ᩳ;->᩹:Ll/᩹᩹ᩳ;

    invoke-virtual {v0}, Ll/᩹᩹ᩳ;->close()V

    return-void
.end method

.method public final ֫()I
    .locals 2

    .line 231
    iget-object v0, p0, Ll/᩺᩸ᩳ;->᩶:Ll/۟᩸ᩳ;

    invoke-static {v0}, Ll/۟᩸ᩳ;->ܿ(Ll/۟᩸ᩳ;)V

    .line 232
    iget-boolean v0, p0, Ll/᩺᩸ᩳ;->᩸:Z

    if-nez v0, :cond_0

    .line 233
    iget-object v0, p0, Ll/᩺᩸ᩳ;->᩹:Ll/᩹᩹ᩳ;

    invoke-virtual {v0}, Ll/᩹᩹ᩳ;->֫()I

    move-result v0

    return v0

    .line 232
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Line cursor is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
