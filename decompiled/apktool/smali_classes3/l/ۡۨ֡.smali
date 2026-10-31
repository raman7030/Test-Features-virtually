.class public final Ll/ۡۨ֡;
.super Ll/ܶ۟֡;
.source "M6BE"


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Ll/ܺۨ֡;


# direct methods
.method public constructor <init>(Ll/ܺۨ֡;Ll/۬ۛ֡;III)V
    .locals 0

    .line 87
    iput-object p1, p0, Ll/ۡۨ֡;->ۙ:Ll/ܺۨ֡;

    iput p5, p0, Ll/ۡۨ֡;->ۗ:I

    invoke-direct {p0, p2, p3, p4}, Ll/ܶ۟֡;-><init>(Ll/۬ۛ֡;II)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴۨ֡;I)Ljava/lang/Object;
    .locals 1

    .line 91
    iget v0, p0, Ll/ۡۨ֡;->ۗ:I

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 92
    new-instance p2, Ll/ܿۛ֡;

    invoke-direct {p2, p1}, Ll/ܿۛ֡;-><init>(Ll/ᩴۨ֡;)V

    return-object p2

    .line 94
    :cond_0
    new-instance p2, Ll/ۖۨ֡;

    iget-object v0, p0, Ll/ۡۨ֡;->ۙ:Ll/ܺۨ֡;

    iget-object v0, v0, Ll/ܺۨ֡;->֫:Ll/۬ۛ֡;

    invoke-direct {p2, v0, p1}, Ll/ۖۨ֡;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;)V

    return-object p2
.end method
