.class public final enum Ll/᩶ܺ۠;
.super Ll/֡ۖ۠;
.source "H7RN"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 616
    invoke-direct/range {v0 .. v7}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 7

    const-string v3, "-XD"

    const/4 v4, 0x0

    const-string v1, "XD"

    const/16 v2, 0x47

    move-object v0, p0

    move-object v5, p1

    move-object v6, p2

    .line 0
    invoke-direct/range {v0 .. v6}, Ll/᩶ܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;)V
    .locals 1

    .line 623
    iget-object v0, p0, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Ll/᩶ܺ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/16 p2, 0x3d

    .line 628
    invoke-virtual {p3, p2}, Ljava/lang/String;->indexOf(I)I

    move-result p2

    if-gez p2, :cond_0

    move-object v0, p3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 629
    invoke-virtual {p3, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-gez p2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 630
    invoke-virtual {p3, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    .line 631
    :goto_1
    invoke-virtual {p1, v0, p3}, Ll/֨ۖ۠;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 1

    .line 619
    iget-object v0, p0, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
