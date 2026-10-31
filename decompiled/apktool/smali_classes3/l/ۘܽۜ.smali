.class public final synthetic Ll/ۘܽۜ;
.super Ljava/lang/Object;
.source "G7AI"

# interfaces
.implements Ll/ۗܽۜ;


# instance fields
.field public final synthetic ֫:Ll/᩸ܽۜ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ܽۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘܽۜ;->֫:Ll/᩸ܽۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)V
    .locals 11

    .line 1738
    invoke-interface {p2}, Ll/᩷᩻ܽ;->ۧ֫()I

    move-result v0

    iget-object v1, p0, Ll/ۘܽۜ;->֫:Ll/᩸ܽۜ;

    iget v2, v1, Ll/᩸ܽۜ;->ۜ:I

    if-eq v0, v2, :cond_0

    goto :goto_1

    .line 1741
    :cond_0
    iget-object v0, v1, Ll/᩸ܽۜ;->ᩳ:Ll/۬ܽۜ;

    if-nez v0, :cond_1

    .line 1742
    invoke-static {p2}, Ll/ۡᩳۜ;->ۧ(Ll/᩷᩻ܽ;)Ll/۬ܽۜ;

    move-result-object v0

    iput-object v0, v1, Ll/᩸ܽۜ;->ᩳ:Ll/۬ܽۜ;

    .line 1744
    :cond_1
    iget-object v2, v1, Ll/᩸ܽۜ;->֫:Ll/ᩴܽۜ;

    iget-object v9, v1, Ll/᩸ܽۜ;->᩷:Ljava/util/Set;

    const/4 v10, 0x0

    const/16 v5, 0x12c

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v2 .. v10}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;IIIILjava/util/Set;Ljava/util/HashMap;)Ll/ۧᩳۜ;

    move-result-object p2

    .line 1746
    invoke-static {p1}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object p1

    .line 1747
    iget-object v0, v1, Ll/᩸ܽۜ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1748
    iput-object p2, v1, Ll/᩸ܽۜ;->ܿ:Ll/ۧᩳۜ;

    goto :goto_0

    :cond_2
    const-string v0, "default"

    .line 1749
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1750
    iput-object p2, v1, Ll/᩸ܽۜ;->ۧ:Ll/ۧᩳۜ;

    .line 1752
    :cond_3
    :goto_0
    iget-object v0, v1, Ll/᩸ܽۜ;->ܽ:Ll/ۧᩳۜ;

    if-eqz v0, :cond_5

    iget-object v0, v0, Ll/ۧᩳۜ;->֨:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ۡᩳۜ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-gez p1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    return-void

    .line 1753
    :cond_5
    :goto_2
    iput-object p2, v1, Ll/᩸ܽۜ;->ܽ:Ll/ۧᩳۜ;

    return-void
.end method
