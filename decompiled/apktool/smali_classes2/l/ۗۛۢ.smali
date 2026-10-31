.class public final Ll/ۗۛۢ;
.super Ljava/lang/Object;
.source "M6O6"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public final ᩶:Ljava/lang/CharSequence;

.field public final ᩸:Ll/ۙۛۢ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ll/ۙۛۢ;)V
    .locals 0

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۛۢ;->᩶:Ljava/lang/CharSequence;

    iput-object p2, p0, Ll/ۗۛۢ;->᩸:Ll/ۙۛۢ;

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    .line 200
    iget v0, p0, Ll/ۗۛۢ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۗۛۢ;->᩹:I

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۗۛۢ;->᩸:Ll/ۙۛۢ;

    invoke-virtual {v0}, Ll/ۙۛۢ;->֫()V

    .line 201
    :cond_0
    iget-object v0, p0, Ll/ۗۛۢ;->᩶:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final length()I
    .locals 1

    .line 198
    iget-object v0, p0, Ll/ۗۛۢ;->᩶:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 203
    new-instance v0, Ll/۬۬ۡ;

    invoke-direct {v0, p1, p2, p0}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    return-object v0
.end method
