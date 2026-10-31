.class public final Ll/᩻ۡܿ;
.super Ljava/lang/Object;
.source "O700"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/᩺ܺܿ;

.field public final ܽ:Ll/ۢۖܿ;

.field public final ܿ:Ll/۟᩺ᩳ;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;Ll/ۢۖܿ;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Ll/᩻ۡܿ;->ܿ:Ll/۟᩺ᩳ;

    .line 86
    iput-object p2, p0, Ll/᩻ۡܿ;->ۧ:Ll/᩺ܺܿ;

    .line 87
    iput-object p3, p0, Ll/᩻ۡܿ;->ܽ:Ll/ۢۖܿ;

    .line 88
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p2

    iput p2, p0, Ll/᩻ۡܿ;->֫:I

    .line 89
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Ll/᩻ۡܿ;->ᩳ:I

    .line 90
    invoke-virtual {p3}, Ll/ۢۖܿ;->֫()I

    move-result p2

    if-ne p2, p1, :cond_0

    return-void

    .line 91
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Line background store length differs from text"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
