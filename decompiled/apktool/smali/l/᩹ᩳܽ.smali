.class public abstract Ll/᩹ᩳܽ;
.super Ljava/lang/Object;
.source "29QF"

# interfaces
.implements Ll/᩵᩻ܽ;


# instance fields
.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput p1, p0, Ll/᩹ᩳܽ;->᩹:I

    .line 12
    iput p2, p0, Ll/᩹ᩳܽ;->᩸:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩻ܽ;)V
    .locals 2

    .line 27
    check-cast p1, Ll/᩵᩻ܽ;

    .line 17
    iget v0, p0, Ll/᩹ᩳܽ;->᩹:I

    .line 28
    invoke-interface {p1}, Ll/᩵᩻ܽ;->ᩴ֫()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 22
    iget v0, p0, Ll/᩹ᩳܽ;->᩸:I

    .line 31
    invoke-interface {p1}, Ll/᩵᩻ܽ;->ᩳۧ()I

    move-result p1

    if-ne v0, p1, :cond_0

    return-void

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ᩳۧ()I
    .locals 1

    .line 22
    iget v0, p0, Ll/᩹ᩳܽ;->᩸:I

    return v0
.end method

.method public final ᩴ֫()I
    .locals 1

    .line 17
    iget v0, p0, Ll/᩹ᩳܽ;->᩹:I

    return v0
.end method
