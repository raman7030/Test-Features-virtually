.class public final Ll/ۖۨ֡;
.super Ll/۫ۛ֡;
.source "B62G"


# instance fields
.field public final ᩶:I

.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ll/۫ۛ֡;-><init>()V

    .line 43
    iput-object p1, p0, Ll/ۖۨ֡;->᩸:Ll/۬ۛ֡;

    .line 44
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ܺ()I

    move-result p1

    iput p1, p0, Ll/ۖۨ֡;->᩶:I

    .line 45
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ܺ()I

    move-result p1

    iput p1, p0, Ll/ۖۨ֡;->᩹:I

    return-void
.end method


# virtual methods
.method public final ۟()I
    .locals 1

    .line 56
    iget v0, p0, Ll/ۖۨ֡;->᩹:I

    return v0
.end method

.method public final ܽۧ()Ljava/lang/String;
    .locals 2

    .line 51
    iget-object v0, p0, Ll/ۖۨ֡;->᩸:Ll/۬ۛ֡;

    iget v1, p0, Ll/ۖۨ֡;->᩶:I

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
