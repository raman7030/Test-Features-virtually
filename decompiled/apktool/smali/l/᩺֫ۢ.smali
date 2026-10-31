.class public final Ll/᩺֫ۢ;
.super Ljava/lang/Object;
.source "KAQ1"


# instance fields
.field public final ֫:[Ljava/lang/String;

.field public final ۧ:[Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:[Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:[Ljava/lang/String;

.field public final ᩻:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۡ֫ۚ;)V
    .locals 4

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-interface {p1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩺֫ۢ;->ܳ:Ljava/lang/String;

    .line 34
    invoke-interface {p1}, Ll/ۡ֫ۚ;->ۜܽ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩺֫ۢ;->ܿ:Ljava/lang/String;

    .line 35
    invoke-interface {p1}, Ll/ۡ֫ۚ;->ܳ֫()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/᩺֫ۢ;->ܽ:[Ljava/lang/String;

    .line 36
    new-instance v0, Ll/᩺۠ܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v1, Ll/۬֫ۢ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-interface {p1}, Ll/ۡ֫ۚ;->ۨ֫()Ljava/lang/Iterable;

    move-result-object v2

    invoke-static {v2, v0}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ll/ܽܶܺ;)Ljava/lang/Iterable;

    move-result-object v2

    const-class v3, Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    iput-object v2, p0, Ll/᩺֫ۢ;->ᩳ:[Ljava/lang/String;

    .line 39
    invoke-interface {p1}, Ll/ۡ֫ۚ;->ܰۧ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-static {v2, v0}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ll/ܽܶܺ;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0, v3}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/᩺֫ۢ;->ۧ:[Ljava/lang/String;

    .line 40
    invoke-interface {p1}, Ll/ۡ֫ۚ;->ۧܽ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ll/ܽܶܺ;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0, v3}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/᩺֫ۢ;->֫:[Ljava/lang/String;

    .line 41
    invoke-interface {p1}, Ll/ۡ֫ۚ;->ܿܽ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ll/ܽܶܺ;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-static {p1, v3}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Ll/᩺֫ۢ;->᩻:[Ljava/lang/String;

    return-void
.end method
