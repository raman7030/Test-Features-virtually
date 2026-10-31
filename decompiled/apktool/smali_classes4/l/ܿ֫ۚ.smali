.class public final Ll/ܿ֫ۚ;
.super Ljava/lang/Object;
.source "SAW5"


# instance fields
.field public final ֫:Ll/ۜ֫ۚ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ll/ۜ֫ۚ;

    invoke-direct {v0}, Ll/ۜ֫ۚ;-><init>()V

    iput-object v0, p0, Ll/ܿ֫ۚ;->֫:Ll/ۜ֫ۚ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴܽۚ;)Ll/ܳ֫ۚ;
    .locals 4

    .line 10
    new-instance v0, Ll/ܳ֫ۚ;

    invoke-interface {p1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Ll/ܿ֫ۚ;->֫:Ll/ۜ֫ۚ;

    invoke-direct {v0, v3, v1, v2, p1}, Ll/ܳ֫ۚ;-><init>(Ll/ۜ֫ۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ll/ۚܽۚ;)Ll/᩻֫ۚ;
    .locals 7

    .line 14
    new-instance v6, Ll/᩻֫ۚ;

    invoke-interface {p1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v4

    invoke-interface {p1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Ll/ܿ֫ۚ;->֫:Ll/ۜ֫ۚ;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/᩻֫ۚ;-><init>(Ll/ۜ֫ۚ;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v6
.end method
