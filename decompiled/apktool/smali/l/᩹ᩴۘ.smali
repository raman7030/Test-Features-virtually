.class public final Ll/᩹ᩴۘ;
.super Ll/᩸ᩴۘ;
.source "M8DT"


# instance fields
.field public ܽ:D


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Current"

    .line 26
    invoke-direct {p0, v0}, Ll/᩸ᩴۘ;-><init>(Ljava/lang/String;)V

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 27
    iput-wide v0, p0, Ll/᩹ᩴۘ;->ܽ:D

    return-void
.end method


# virtual methods
.method public final ֫(D)V
    .locals 0

    .line 35
    iput-wide p1, p0, Ll/᩹ᩴۘ;->ܽ:D

    return-void
.end method

.method public final ᩳ()D
    .locals 2

    .line 47
    iget-wide v0, p0, Ll/᩹ᩴۘ;->ܽ:D

    return-wide v0
.end method
