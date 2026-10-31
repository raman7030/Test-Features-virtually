.class public final Ll/᩸ᩳۢ;
.super Ljava/lang/Object;
.source "D4IW"


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(Ll/۫ۘܽ;)V
    .locals 1

    .line 434
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "name"

    .line 435
    invoke-virtual {p1, v0}, Ll/۫ۘܽ;->ۧ(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/᩸ᩳۢ;->ۧ:I

    .line 436
    invoke-virtual {p1}, Ll/۫ۘܽ;->end()I

    move-result p1

    iput p1, p0, Ll/᩸ᩳۢ;->֫:I

    return-void
.end method
