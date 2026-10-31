.class public final synthetic Ll/ۙܿۢ;
.super Ljava/lang/Object;
.source "I5G5"

# interfaces
.implements Ll/۫ܿۢ;


# instance fields
.field public final synthetic ᩸:Ll/ܶۜۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶۜۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙܿۢ;->᩸:Ll/ܶۜۢ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 9

    .line 189
    new-instance v6, Ll/᩹ۛ᩷;

    .line 180
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 190
    invoke-static {p1, p4, p3}, Ll/ۗۛ᩷;->ۧ(Ljava/lang/String;ZZ)Ll/ۨۘܽ;

    move-result-object p1

    const-string p3, ""

    invoke-virtual {p1, p3}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p1

    .line 191
    iget-object p3, p0, Ll/ۙܿۢ;->᩸:Ll/ܶۜۢ;

    invoke-virtual {p3}, Ll/ܶۜۢ;->ܽ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ll/ܺۜۢ;

    .line 192
    invoke-virtual {v8}, Ll/ܺۜۢ;->ۧ()Ljava/lang/String;

    move-result-object v0

    move-object v1, p2

    move-object v2, p1

    move v3, p4

    move v4, p5

    move-object v5, v6

    invoke-static/range {v0 .. v5}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;Ljava/lang/String;Ll/۫ۘܽ;ZZLl/᩹ۛ᩷;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 194
    invoke-virtual {v8, v0}, Ll/ܺۜۢ;->֫(Ljava/lang/String;)Z

    goto :goto_0

    .line 197
    :cond_1
    invoke-virtual {p3}, Ll/ܶۜۢ;->ᩳ()V

    .line 198
    invoke-virtual {p3}, Ll/ܶۜۢ;->ܿ()V

    .line 199
    invoke-virtual {p3}, Ll/ܶۜۢ;->ۧ()Ll/᩶ۗۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 194
    iget p1, v6, Ll/᩹ۛ᩷;->ۧ:I

    .line 200
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p1, p2, p4

    const p1, 0x7f120897

    invoke-virtual {p3, p1, p2}, Ll/ۡ᩻֫;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void
.end method
