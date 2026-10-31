.class public final Ll/ᩳᩴ֨;
.super Ljava/lang/Object;
.source "W403"


# static fields
.field public static final ܽ:Ll/ۗ۠۠;

.field public static final ᩳ:Ll/ۙ֨۠;


# instance fields
.field public ֫:Ll/ۗ۠۠;

.field public ۧ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ᩳᩴ֨;->ᩳ:Ll/ۙ֨۠;

    .line 118
    new-instance v0, Ll/ۧᩴ֨;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ᩳᩴ֨;->ܽ:Ll/ۗ۠۠;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ᩳᩴ֨;
    .locals 3

    .line 49
    sget-object v0, Ll/ᩳᩴ֨;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳᩴ֨;

    if-nez v1, :cond_0

    .line 51
    new-instance v1, Ll/ᩳᩴ֨;

    .line 55
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Ll/ᩳᩴ֨;->ۧ:Ljava/util/HashMap;

    .line 56
    invoke-virtual {p0, v0, v1}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 57
    sget-object p0, Ll/ᩳᩴ֨;->ܽ:Ll/ۗ۠۠;

    iput-object p0, v1, Ll/ᩳᩴ֨;->֫:Ll/ۗ۠۠;

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final ֫()Ll/ۗ۠۠;
    .locals 2

    .line 106
    iget-object v0, p0, Ll/ᩳᩴ֨;->֫:Ll/ۗ۠۠;

    .line 107
    sget-object v1, Ll/ᩳᩴ֨;->ܽ:Ll/ۗ۠۠;

    iput-object v1, p0, Ll/ᩳᩴ֨;->֫:Ll/ۗ۠۠;

    return-object v0
.end method

.method public final ֫(Ll/ۗ۠۠;)Ll/ۗ۠۠;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ᩳᩴ֨;->֫:Ll/ۗ۠۠;

    .line 107
    iput-object p1, p0, Ll/ᩳᩴ֨;->֫:Ll/ۗ۠۠;

    return-object v0
.end method

.method public final ֫(Ll/ۚۚ۠;)V
    .locals 3

    .line 92
    iget-object v0, p0, Ll/ᩳᩴ֨;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴܶ۠;

    if-eqz v1, :cond_1

    .line 94
    invoke-virtual {v1}, Ll/ᩴܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽᩴ֨;

    .line 95
    invoke-interface {v2}, Ll/ܽᩴ֨;->֫()V

    goto :goto_0

    .line 97
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ܽᩴ֨;)V
    .locals 3

    .line 78
    iget-object v0, p0, Ll/ᩳᩴ֨;->ۧ:Ljava/util/HashMap;

    iget-object v1, p0, Ll/ᩳᩴ֨;->֫:Ll/ۗ۠۠;

    sget-object v2, Ll/ᩳᩴ֨;->ܽ:Ll/ۗ۠۠;

    if-ne v1, v2, :cond_0

    .line 79
    invoke-interface {p1}, Ll/ܽᩴ֨;->֫()V

    return-void

    .line 81
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴܶ۠;

    if-nez v1, :cond_1

    .line 83
    iget-object v1, p0, Ll/ᩳᩴ֨;->֫:Ll/ۗ۠۠;

    new-instance v2, Ll/ᩴܶ۠;

    invoke-direct {v2}, Ll/ᩴܶ۠;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v2

    .line 85
    :cond_1
    invoke-virtual {v1, p1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    return-void
.end method
