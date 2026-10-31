.class public final Ll/᩸᩺ۜ;
.super Ljava/lang/Object;
.source "V6MU"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:Ll/ܶۨۜ;

.field public ۙ:Ll/ܰۛۜ;

.field public ۫:Z

.field public ۬:Ll/᩹ۛۜ;

.field public ᩶:Ljava/lang/Throwable;

.field public ᩸:Ll/᩹ۨۜ;

.field public ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 1192
    iput-boolean v0, p0, Ll/᩸᩺ۜ;->۫:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1204
    iget-object v0, p0, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩹ۨۜ;->close()V

    :cond_0
    const/4 v0, 0x0

    .line 1205
    iput-object v0, p0, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    .line 1206
    iget-object v1, p0, Ll/᩸᩺ۜ;->ۙ:Ll/ܰۛۜ;

    if-eqz v1, :cond_1

    iget-object v2, p0, Ll/᩸᩺ۜ;->۬:Ll/᩹ۛۜ;

    invoke-virtual {v1, v2}, Ll/ܰۛۜ;->֫(Ll/᩹ۛۜ;)V

    goto :goto_0

    .line 1207
    :cond_1
    iget-object v1, p0, Ll/᩸᩺ۜ;->۬:Ll/᩹ۛۜ;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/᩹ۛۜ;->close()V

    .line 1208
    :cond_2
    :goto_0
    iput-object v0, p0, Ll/᩸᩺ۜ;->ۙ:Ll/ܰۛۜ;

    .line 1209
    iput-object v0, p0, Ll/᩸᩺ۜ;->۬:Ll/᩹ۛۜ;

    return-void
.end method
