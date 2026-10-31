.class public final Ll/۠֡ۚ;
.super Ll/ۤ֡ۚ;
.source "W1I5"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ll/ۤ֡ۚ;-><init>()V

    .line 29
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 30
    invoke-static {p2}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 31
    invoke-static {p3}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    const-string v0, "name"

    .line 12
    invoke-super {p0, v0, p1}, Ll/ۤ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    const-string p1, "publicId"

    invoke-super {p0, p1, p2}, Ll/ۤ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    const-string p2, "systemId"

    invoke-super {p0, p2, p3}, Ll/ۤ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    .line 44
    invoke-direct {p0, p1}, Ll/۠֡ۚ;->᩻(Ljava/lang/String;)Z

    move-result p1

    const-string p3, "pubSysKey"

    if-eqz p1, :cond_0

    const-string p1, "PUBLIC"

    .line 12
    invoke-super {p0, p3, p1}, Ll/ۤ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    return-void

    .line 46
    :cond_0
    invoke-direct {p0, p2}, Ll/۠֡ۚ;->᩻(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "SYSTEM"

    .line 12
    invoke-super {p0, p3, p1}, Ll/ۤ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    :cond_1
    return-void
.end method

.method private ᩻(Ljava/lang/String;)Z
    .locals 0

    .line 12
    invoke-super {p0, p1}, Ll/ۤ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 107
    invoke-static {p1}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    .locals 3

    .line 82
    iget p2, p0, Ll/ۨ֡ۚ;->᩹:I

    if-lez p2, :cond_0

    invoke-virtual {p3}, Ll/֡֡ۚ;->ۜ()Z

    move-result p2

    if-eqz p2, :cond_0

    const/16 p2, 0xa

    .line 83
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 85
    :cond_0
    invoke-virtual {p3}, Ll/֡֡ۚ;->᩷()Ll/᩵֡ۚ;

    move-result-object p2

    sget-object p3, Ll/᩵֡ۚ;->᩹:Ll/᩵֡ۚ;

    const-string v0, "systemId"

    const-string v1, "publicId"

    if-ne p2, p3, :cond_1

    invoke-direct {p0, v1}, Ll/۠֡ۚ;->᩻(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-direct {p0, v0}, Ll/۠֡ۚ;->᩻(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "<!doctype"

    .line 87
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_1
    const-string p2, "<!DOCTYPE"

    .line 89
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_0
    const-string p2, "name"

    .line 91
    invoke-direct {p0, p2}, Ll/۠֡ۚ;->᩻(Ljava/lang/String;)Z

    move-result p3

    const-string v2, " "

    if-eqz p3, :cond_2

    .line 92
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p3

    .line 12
    invoke-super {p0, p2}, Ll/ۤ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 92
    invoke-interface {p3, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_2
    const-string p2, "pubSysKey"

    .line 93
    invoke-direct {p0, p2}, Ll/۠֡ۚ;->᩻(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 94
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p3

    .line 12
    invoke-super {p0, p2}, Ll/ۤ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 94
    invoke-interface {p3, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 95
    :cond_3
    invoke-direct {p0, v1}, Ll/۠֡ۚ;->᩻(Ljava/lang/String;)Z

    move-result p2

    const/16 p3, 0x22

    const-string v2, " \""

    if-eqz p2, :cond_4

    .line 96
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    .line 12
    invoke-super {p0, v1}, Ll/ۤ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 96
    invoke-interface {p2, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 97
    :cond_4
    invoke-direct {p0, v0}, Ll/۠֡ۚ;->᩻(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 98
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    .line 12
    invoke-super {p0, v0}, Ll/ۤ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 98
    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_5
    const/16 p2, 0x3e

    .line 99
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public final ۧ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    .locals 0

    return-void
.end method

.method public final ܳ()Ll/ۨ֡ۚ;
    .locals 0

    return-object p0
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "pubSysKey"

    .line 12
    invoke-super {p0, v0, p1}, Ll/ۤ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    :cond_0
    return-void
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    const-string v0, "#doctype"

    return-object v0
.end method

.method public final bridge synthetic ᩳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
