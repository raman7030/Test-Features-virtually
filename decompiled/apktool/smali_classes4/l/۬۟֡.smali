.class public final Ll/۬۟֡;
.super Ll/֨۬֡;
.source "N4QO"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩶:I

.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Ll/۬۟֡;->᩸:Ll/۬ۛ֡;

    .line 55
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ܺ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۬۟֡;->ۙ:Ljava/lang/String;

    .line 56
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ܺ()I

    move-result p1

    iput p1, p0, Ll/۬۟֡;->᩹:I

    .line 57
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ۧ()I

    move-result v0

    iput v0, p0, Ll/۬۟֡;->᩶:I

    .line 58
    invoke-static {p2, p1}, Ll/۬۟֡;->֫(Ll/ᩴۨ֡;I)V

    return-void
.end method

.method public static ֫(Ll/ᩴۨ֡;)V
    .locals 1

    .line 62
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֡()V

    .line 63
    invoke-virtual {p0}, Ll/ᩴۨ֡;->ܺ()I

    move-result v0

    .line 64
    invoke-static {p0, v0}, Ll/۬۟֡;->֫(Ll/ᩴۨ֡;I)V

    return-void
.end method

.method public static ֫(Ll/ᩴۨ֡;I)V
    .locals 1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 69
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֡()V

    .line 70
    invoke-static {p0}, Ll/ۤ᩵ۚ;->֫(Ll/ᩴۨ֡;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final getElements()Ljava/util/Set;
    .locals 4

    .line 83
    new-instance v0, Ll/ۗ۟֡;

    iget v1, p0, Ll/۬۟֡;->᩶:I

    iget v2, p0, Ll/۬۟֡;->᩹:I

    iget-object v3, p0, Ll/۬۟֡;->᩸:Ll/۬ۛ֡;

    invoke-direct {v0, p0, v3, v1, v2}, Ll/ۗ۟֡;-><init>(Ll/۬۟֡;Ll/۬ۛ֡;II)V

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/۬۟֡;->ۙ:Ljava/lang/String;

    return-object v0
.end method
