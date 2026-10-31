.class public final synthetic Ll/ۗ᩸ᩳ;
.super Ljava/lang/Object;
.source "CB2D"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:I

.field public final synthetic ᩶:Ljava/lang/CharSequence;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/CharSequence;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۗ᩸ᩳ;->᩸:I

    iput p2, p0, Ll/ۗ᩸ᩳ;->᩹:I

    iput-object p3, p0, Ll/ۗ᩸ᩳ;->᩶:Ljava/lang/CharSequence;

    iput p4, p0, Ll/ۗ᩸ᩳ;->ۙ:I

    iput p5, p0, Ll/ۗ᩸ᩳ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 6

    .line 2
    iget v5, p0, Ll/ۗ᩸ᩳ;->ۗ:I

    .line 5
    move-object v0, p1

    check-cast v0, Ll/ܺ᩹ᩳ;

    .line 320
    iget v1, p0, Ll/ۗ᩸ᩳ;->᩸:I

    iget v2, p0, Ll/ۗ᩸ᩳ;->᩹:I

    iget-object v3, p0, Ll/ۗ᩸ᩳ;->᩶:Ljava/lang/CharSequence;

    iget v4, p0, Ll/ۗ᩸ᩳ;->ۙ:I

    invoke-virtual/range {v0 .. v5}, Ll/ܺ᩹ᩳ;->֫(IILjava/lang/CharSequence;II)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
