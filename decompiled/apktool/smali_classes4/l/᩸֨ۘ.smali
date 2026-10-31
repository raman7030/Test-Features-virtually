.class public final Ll/᩸֨ۘ;
.super Ljava/lang/Object;
.source "Q8DM"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-wide p1, p0, Ll/᩸֨ۘ;->᩸:D

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 22
    check-cast p1, Ll/᩸֨ۘ;

    invoke-virtual {p0, p1}, Ll/᩸֨ۘ;->֫(Ll/᩸֨ۘ;)I

    move-result p1

    return p1
.end method

.method public final ֫()D
    .locals 2

    .line 30
    iget-wide v0, p0, Ll/᩸֨ۘ;->᩸:D

    return-wide v0
.end method

.method public final ֫(Ll/᩸֨ۘ;)I
    .locals 4

    .line 38
    iget-wide v0, p1, Ll/᩸֨ۘ;->᩸:D

    iget-wide v2, p0, Ll/᩸֨ۘ;->᩸:D

    cmpg-double p1, v2, v0

    if-gez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    cmpl-double p1, v2, v0

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
