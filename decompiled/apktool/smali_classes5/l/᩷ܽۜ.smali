.class public final synthetic Ll/᩷ܽۜ;
.super Ljava/lang/Object;
.source "G7AI"

# interfaces
.implements Ll/ۗܽۜ;


# instance fields
.field public final synthetic ֫:Ll/ܶܽۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶܽۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ܽۜ;->֫:Ll/ܶܽۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)V
    .locals 12

    .line 1833
    iget-object v0, p0, Ll/᩷ܽۜ;->֫:Ll/ܶܽۜ;

    iget-object v1, v0, Ll/ܶܽۜ;->ܳ:Ljava/lang/String;

    invoke-interface {p2}, Ll/᩷᩻ܽ;->ۧ֫()I

    move-result v2

    iget v3, v0, Ll/ܶܽۜ;->᩷:I

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 1836
    :cond_0
    iget-object v2, v0, Ll/ܶܽۜ;->ܽ:Ll/۬ܽۜ;

    if-nez v2, :cond_1

    .line 1837
    invoke-interface {p2}, Ll/᩷᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v2

    .line 1838
    invoke-interface {p2}, Ll/᩷᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v3

    .line 1839
    new-instance v11, Ll/۬ܽۜ;

    iget v6, v0, Ll/ܶܽۜ;->᩷:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v7

    .line 1840
    invoke-interface {v3}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v8

    invoke-interface {p2}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p2}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v9

    move-object v4, v11

    invoke-direct/range {v4 .. v10}, Ll/۬ܽۜ;-><init>(Ljava/lang/String;IIIILjava/lang/String;)V

    iput-object v11, v0, Ll/ܶܽۜ;->ܽ:Ll/۬ܽۜ;

    .line 1842
    :cond_1
    invoke-static {p1}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v2

    .line 1843
    iget-object v3, v0, Ll/ܶܽۜ;->ۘ:Ljava/util/LinkedHashSet;

    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const-string v3, "*"

    .line 1844
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 1847
    :cond_2
    iget-object v0, v0, Ll/ܶܽۜ;->֫:Ljava/util/ArrayList;

    new-instance v1, Ll/ۚܽۜ;

    invoke-direct {v1, p1, p2}, Ll/ۚܽۜ;-><init>(Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method
