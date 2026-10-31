.class public final Ll/ۨۛ֡;
.super Ll/ۖ۟֡;
.source "Z556"


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ܽۨ֡;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/ܽۨ֡;II)V
    .locals 0

    .line 266
    iput-object p1, p0, Ll/ۨۛ֡;->᩸:Ll/ܽۨ֡;

    iput p2, p0, Ll/ۨۛ֡;->᩹:I

    iput p3, p0, Ll/ۨۛ֡;->᩶:I

    .line 43
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 275
    iget v0, p0, Ll/ۨۛ֡;->᩶:I

    return v0
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 3

    .line 270
    iget-object v0, p0, Ll/ۨۛ֡;->᩸:Ll/ܽۨ֡;

    iget-object v0, v0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    mul-int/lit8 p1, p1, 0x2

    iget v2, p0, Ll/ۨۛ֡;->᩹:I

    add-int/2addr p1, v2

    invoke-virtual {v1, p1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
