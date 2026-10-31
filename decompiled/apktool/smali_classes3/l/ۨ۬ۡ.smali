.class public final Ll/ۨ۬ۡ;
.super Ljava/lang/Object;
.source "0APD"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public final ᩸:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Ll/ۨ۬ۡ;->᩸:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    .line 19
    iget-object v0, p0, Ll/ۨ۬ۡ;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    return p1
.end method

.method public final length()I
    .locals 1

    .line 14
    iget-object v0, p0, Ll/ۨ۬ۡ;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    .line 26
    new-instance v0, Ll/ۨ۬ۡ;

    iget-object v1, p0, Ll/ۨ۬ۡ;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v1, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۨ۬ۡ;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method
