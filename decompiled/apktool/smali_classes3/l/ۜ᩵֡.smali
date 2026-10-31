.class public final Ll/ۜ᩵֡;
.super Ll/ۡ֨֡;
.source "J8YO"


# instance fields
.field public final ֫:Ll/᩺֡֡;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ll/᩺֡֡;

    invoke-direct {v0}, Ll/᩺֡֡;-><init>()V

    iput-object v0, p0, Ll/ۜ᩵֡;->֫:Ll/᩺֡֡;

    return-void
.end method

.method public static ֫(Ll/᩵֨֡;I)Z
    .locals 2

    .line 44
    invoke-interface {p0}, Ll/᩵֨֡;->getLine()Ll/ܽ֨֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    .line 45
    invoke-interface {p0}, Ll/᩵֨֡;->ܽ()I

    move-result p0

    const/4 v1, 0x4

    if-ge p0, v1, :cond_0

    .line 46
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-ge p1, p0, :cond_0

    .line 47
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    const/16 p1, 0x3e

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/᩵᩵֡;I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۜ᩵֡;->֫(Ll/᩵֨֡;I)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;
    .locals 4

    .line 30
    invoke-interface {p1}, Ll/᩵֨֡;->ᩳ()I

    move-result v0

    .line 31
    invoke-static {p1, v0}, Ll/ۜ᩵֡;->֫(Ll/᩵֨֡;I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 32
    invoke-interface {p1}, Ll/᩵֨֡;->ۧ()I

    move-result v1

    invoke-interface {p1}, Ll/᩵֨֡;->ܽ()I

    move-result v2

    add-int/2addr v2, v1

    add-int/lit8 v1, v2, 0x1

    .line 34
    invoke-interface {p1}, Ll/᩵֨֡;->getLine()Ll/ܽ֨֡;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    .line 47
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 48
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    const/16 v0, 0x20

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v2, 0x2

    .line 19
    :cond_1
    :goto_0
    new-instance p1, Ll/ܳ᩵֡;

    const/4 v0, -0x1

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Ll/ܳ᩵֡;-><init>(IIZ)V

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ܿ()Ll/ۨ֡֡;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ۜ᩵֡;->֫:Ll/᩺֡֡;

    return-object v0
.end method
