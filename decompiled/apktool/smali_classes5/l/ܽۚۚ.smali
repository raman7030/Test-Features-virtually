.class public final Ll/ܽۚۚ;
.super Ll/ۤ֡ۚ;
.source "R8V9"


# instance fields
.field public final ۗ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ll/ۤ֡ۚ;-><init>()V

    .line 22
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 23
    iput-object p1, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    .line 24
    iput-boolean p2, p0, Ll/ܽۚۚ;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 91
    invoke-super {p0}, Ll/ۨ֡ۚ;->clone()Ll/ۨ֡ۚ;

    move-result-object v0

    check-cast v0, Ll/ܽۚۚ;

    return-object v0
.end method

.method public final clone()Ll/ۨ֡ۚ;
    .locals 1

    .line 91
    invoke-super {p0}, Ll/ۨ֡ۚ;->clone()Ll/ۨ֡ۚ;

    move-result-object v0

    check-cast v0, Ll/ܽۚۚ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 86
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۖ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    .locals 14

    move-object v7, p1

    const-string v0, "<"

    .line 72
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object v0

    const-string v8, "?"

    const-string v9, "!"

    move-object v10, p0

    .line 73
    iget-boolean v11, v10, Ll/ܽۚۚ;->ۗ:Z

    if-eqz v11, :cond_0

    move-object v1, v9

    goto :goto_0

    :cond_0
    move-object v1, v8

    :goto_0
    invoke-interface {v0, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object v0

    .line 74
    invoke-virtual {p0}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 54
    invoke-virtual {p0}, Ll/ۤ֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 327
    :goto_1
    invoke-static {v12}, Ll/ܺ֡ۚ;->ۧ(Ll/ܺ֡ۚ;)I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 328
    iget-object v1, v12, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-static {v12, v1}, Ll/ܺ֡ۚ;->֫(Ll/ܺ֡ۚ;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 334
    :cond_1
    invoke-static {v12}, Ll/ܺ֡ۚ;->ۧ(Ll/ܺ֡ۚ;)I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 339
    new-instance v1, Ll/ۢ֡ۚ;

    iget-object v2, v12, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    aget-object v2, v2, v0

    iget-object v3, v12, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aget-object v3, v3, v0

    check-cast v3, Ljava/lang/String;

    invoke-direct {v1, v2, v3, v12}, Ll/ۢ֡ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܺ֡ۚ;)V

    add-int/lit8 v13, v0, 0x1

    .line 55
    invoke-virtual {v1}, Ll/ۢ֡ۚ;->getKey()Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-virtual {v1}, Ll/ۢ֡ۚ;->getValue()Ljava/lang/String;

    move-result-object v1

    const-string v2, "#declaration"

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const/16 v2, 0x20

    .line 58
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 60
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 61
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "=\""

    .line 62
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v0, p1

    move-object/from16 v2, p3

    .line 63
    invoke-static/range {v0 .. v6}, Ll/۬֡ۚ;->֫(Ljava/lang/Appendable;Ljava/lang/String;Ll/֡֡ۚ;ZZZZ)V

    const/16 v0, 0x22

    .line 64
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_2
    move v0, v13

    goto :goto_1

    :cond_3
    if-eqz v11, :cond_4

    move-object v8, v9

    .line 77
    :cond_4
    invoke-interface {p1, v8}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object v0

    const-string v1, ">"

    .line 78
    invoke-interface {v0, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

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

.method public final ܺ()Ljava/lang/String;
    .locals 1

    const-string v0, "#declaration"

    return-object v0
.end method

.method public final bridge synthetic ᩳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
