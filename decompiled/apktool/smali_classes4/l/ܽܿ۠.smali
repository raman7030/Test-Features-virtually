.class public final Ll/ܽܿ۠;
.super Ljava/lang/Object;
.source "77LO"


# static fields
.field public static final ۧ:Ll/ۙ֨۠;


# instance fields
.field public ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ܽܿ۠;->ۧ:Ll/ۙ֨۠;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ܽܿ۠;
    .locals 3

    .line 46
    sget-object v0, Ll/ܽܿ۠;->ۧ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽܿ۠;

    if-nez v1, :cond_0

    .line 48
    new-instance v1, Ll/ܽܿ۠;

    .line 53
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Ll/ܽܿ۠;->֫:Ljava/util/HashMap;

    .line 55
    invoke-virtual {p0, v0, v1}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final ֫(Ll/᩶֡֨;)Ll/֫ۤ֨;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܽܿ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۤ֨;

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ܽܿ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final ֫(Ll/᩶֡֨;Ll/֫ۤ֨;)V
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ܽܿ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۤ֨;

    return-void
.end method

.method public final ۧ()Ljava/util/Collection;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ܽܿ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/᩶֡֨;)Ll/֫ۤ֨;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ܽܿ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۤ֨;

    return-object p1
.end method
