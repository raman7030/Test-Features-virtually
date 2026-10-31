.class public final synthetic Ll/ᩳܶܽ;
.super Ljava/lang/Object;
.source "Q151"

# interfaces
.implements Ll/ܿܶܽ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ᩳܶܽ;->᩸:I

    iput p2, p0, Ll/ᩳܶܽ;->᩹:I

    return-void
.end method


# virtual methods
.method public final ֫(II)I
    .locals 1

    const/16 v0, 0x10

    if-lt p1, v0, :cond_0

    const/16 v0, 0x1f

    if-gt p1, v0, :cond_0

    .line 221
    iget p1, p0, Ll/ᩳܶܽ;->᩸:I

    if-ne p2, p1, :cond_0

    .line 0
    iget p1, p0, Ll/ᩳܶܽ;->᩹:I

    return p1

    :cond_0
    return p2
.end method
