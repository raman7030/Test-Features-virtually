.class public final Ll/᩷᩻ܺ;
.super Ll/ۨܿܺ;
.source "EBEF"


# static fields
.field public static final ֫:Ll/᩷᩻ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Ll/᩷᩻ܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    sput-object v0, Ll/᩷᩻ܺ;->֫:Ll/᩷᩻ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final ֫(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 2

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v1

    invoke-static {v1}, Ll/ۨܿܺ;->ܽ(Ll/᩶ۡܺ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {p1}, Ll/ۙܿܺ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 4

    .line 113
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 114
    move-object v1, p2

    check-cast v1, Ll/᩸ܿܺ;

    invoke-virtual {v1}, Ll/᩸ܿܺ;->ۘ()I

    move-result v1

    .line 115
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    .line 116
    :goto_0
    invoke-virtual {v0}, Ll/᩶ۡܺ;->֨()I

    move-result v0

    .line 118
    invoke-static {p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    int-to-short v0, v1

    int-to-short v1, v3

    .line 581
    invoke-virtual {p1, p2}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 582
    invoke-virtual {p1, v0}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 583
    invoke-virtual {p1, v1}, Ll/ᩳᩴܺ;->ܳ(I)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    .line 62
    invoke-virtual {p1}, Ll/ۙܿܺ;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 3

    .line 81
    instance-of v0, p1, Ll/᩸ܿܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 85
    :cond_0
    check-cast p1, Ll/᩸ܿܺ;

    .line 86
    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۘ()I

    move-result v0

    .line 87
    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object v2

    .line 89
    invoke-static {v0}, Ll/ۨܿܺ;->ܽ(I)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 93
    :cond_1
    instance-of v0, v2, Ll/᩹ܺܺ;

    if-nez v0, :cond_2

    instance-of v0, v2, Ll/۫ܺܺ;

    if-nez v0, :cond_2

    instance-of v0, v2, Ll/᩻ܺܺ;

    if-nez v0, :cond_2

    return v1

    .line 99
    :cond_2
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 100
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    .line 102
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    if-eqz v0, :cond_4

    .line 103
    invoke-static {p1}, Ll/ۨܿܺ;->֫(Ll/᩶ۡܺ;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 104
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {v0}, Ll/ۨܿܺ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 105
    invoke-virtual {p1}, Ll/᩶ۡܺ;->֨()I

    move-result p1

    invoke-static {p1}, Ll/ۨܿܺ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    return v1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
