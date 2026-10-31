.class public final synthetic Ll/ۢܽۜ;
.super Ljava/lang/Object;
.source "G7AI"

# interfaces
.implements Ll/۫ܽۜ;


# instance fields
.field public final synthetic ֫:Ll/᩷ᩳۜ;

.field public final synthetic ۧ:Ll/ᩴܽۜ;

.field public final synthetic ܽ:Ljava/util/HashSet;


# direct methods
.method public synthetic constructor <init>(Ll/᩷ᩳۜ;Ll/ᩴܽۜ;Ljava/util/HashSet;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܽۜ;->֫:Ll/᩷ᩳۜ;

    iput-object p2, p0, Ll/ۢܽۜ;->ۧ:Ll/ᩴܽۜ;

    iput-object p3, p0, Ll/ۢܽۜ;->ܽ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Z
    .locals 12

    .line 1911
    iget-object v0, p0, Ll/ۢܽۜ;->֫:Ll/᩷ᩳۜ;

    iget-object v1, v0, Ll/᩷ᩳۜ;->ܽ:Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1912
    invoke-static {p2}, Ll/ۡᩳۜ;->ܽ(Ll/᩷᩻ܽ;)Ljava/lang/String;

    move-result-object v1

    .line 1913
    iget-object v2, v0, Ll/᩷ᩳۜ;->ۧ:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const/4 v9, 0x0

    const/4 v11, 0x0

    .line 1914
    iget-object v3, p0, Ll/ۢܽۜ;->ۧ:Ll/ᩴܽۜ;

    const/16 v6, 0x12c

    const/4 v7, -0x1

    const/4 v8, 0x0

    iget-object v10, p0, Ll/ۢܽۜ;->ܽ:Ljava/util/HashSet;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v3 .. v11}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;IIIILjava/util/Set;Ljava/util/HashMap;)Ll/ۧᩳۜ;

    move-result-object p1

    const-string p2, "item_list"

    .line 1916
    iget-object v1, p1, Ll/ۧᩳۜ;->ᩴ:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 1917
    iget-object p2, v0, Ll/᩷ᩳۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
