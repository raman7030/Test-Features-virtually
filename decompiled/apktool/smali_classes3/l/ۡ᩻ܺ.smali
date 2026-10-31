.class public final Ll/ۡ᩻ܺ;
.super Ll/ۨܿܺ;
.source "OBBX"


# static fields
.field public static final ֫:Ll/ۡ᩻ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Ll/ۡ᩻ܺ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۡ᩻ܺ;->֫:Ll/ۡ᩻ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final ֫(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 2

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v1

    invoke-static {v1}, Ll/ۨܿܺ;->ܽ(Ll/᩶ۡܺ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    invoke-virtual {p1}, Ll/ۙܿܺ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 5

    .line 118
    move-object v0, p2

    check-cast v0, Ll/ᩳܳܺ;

    const/4 v1, 0x0

    .line 119
    invoke-virtual {v0, v1}, Ll/ᩳܳܺ;->ᩳ(I)I

    move-result v2

    int-to-short v2, v2

    const/4 v3, 0x1

    .line 120
    invoke-virtual {v0, v3}, Ll/ᩳܳܺ;->ᩳ(I)I

    move-result v0

    int-to-short v0, v0

    .line 122
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v3

    .line 124
    invoke-virtual {v3}, Ll/ܿᩴܺ;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 125
    invoke-virtual {v3, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    int-to-short v1, v1

    .line 127
    :cond_0
    invoke-virtual {v3}, Ll/᩶ۡܺ;->֨()I

    move-result v3

    .line 130
    invoke-static {p2, v3}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    .line 597
    invoke-virtual {p1, p2}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 598
    invoke-virtual {p1, v2}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 599
    invoke-virtual {p1, v1}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 600
    invoke-virtual {p1, v0}, Ll/ᩳᩴܺ;->ܳ(I)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    .line 61
    invoke-virtual {p1}, Ll/ۙܿܺ;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 4

    .line 80
    instance-of v0, p1, Ll/ᩳܳܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 84
    :cond_0
    check-cast p1, Ll/ᩳܳܺ;

    .line 85
    invoke-virtual {p1, v1}, Ll/ᩳܳܺ;->ᩳ(I)I

    move-result v0

    const/4 v2, 0x1

    .line 86
    invoke-virtual {p1, v2}, Ll/ᩳܳܺ;->ᩳ(I)I

    move-result v3

    .line 87
    invoke-static {v0}, Ll/ۨܿܺ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v3}, Ll/ۨܿܺ;->ܽ(I)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 91
    :cond_1
    invoke-virtual {p1, v1}, Ll/ᩳܳܺ;->ܽ(I)Ll/ܰۡܺ;

    move-result-object v0

    .line 92
    instance-of v0, v0, Ll/᩹ܺܺ;

    if-nez v0, :cond_2

    return v1

    .line 96
    :cond_2
    invoke-virtual {p1, v2}, Ll/ᩳܳܺ;->ܽ(I)Ll/ܰۡܺ;

    move-result-object v0

    .line 97
    instance-of v0, v0, Ll/ۙܺܺ;

    if-nez v0, :cond_3

    return v1

    .line 101
    :cond_3
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    if-nez v0, :cond_4

    return v2

    .line 107
    :cond_4
    invoke-virtual {p1}, Ll/᩶ۡܺ;->֨()I

    move-result v3

    invoke-static {v3}, Ll/ۨܿܺ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 108
    invoke-static {v0}, Ll/ۨܿܺ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 109
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {v0}, Ll/ۨܿܺ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 110
    invoke-static {p1}, Ll/ۨܿܺ;->֫(Ll/᩶ۡܺ;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    :goto_0
    return v1
.end method
