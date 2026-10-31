.class public final synthetic Ll/ܿܺܿ;
.super Ljava/lang/Object;
.source "U4S1"

# interfaces
.implements Ll/ۖۗܿ;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:I

.field public final synthetic ᩶:Ll/᩶᩸ᩳ;

.field public final synthetic ᩸:Ljava/lang/String;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILl/᩶᩸ᩳ;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܺܿ;->᩸:Ljava/lang/String;

    iput p2, p0, Ll/ܿܺܿ;->᩹:I

    iput-object p3, p0, Ll/ܿܺܿ;->᩶:Ll/᩶᩸ᩳ;

    iput p4, p0, Ll/ܿܺܿ;->ۙ:I

    iput p5, p0, Ll/ܿܺܿ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final ۧ(I)V
    .locals 3

    .line 559
    iget v0, p0, Ll/ܿܺܿ;->᩹:I

    iget-object v1, p0, Ll/ܿܺܿ;->᩸:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Ll/ۡۜܿ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 561
    iget-object v0, p0, Ll/ܿܺܿ;->᩶:Ll/᩶᩸ᩳ;

    iget v1, p0, Ll/ܿܺܿ;->ۙ:I

    iget v2, p0, Ll/ܿܺܿ;->ۗ:I

    invoke-interface {v0, v1, v2, p1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 562
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ll/᩶᩸ᩳ;->setSelection(I)V

    :cond_0
    return-void
.end method
