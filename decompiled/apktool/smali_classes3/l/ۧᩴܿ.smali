.class public final Ll/ۧᩴܿ;
.super Ljava/lang/Object;
.source "DAO7"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Ll/ۧᩴܿ;->֫:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Ll/ۧᩴܿ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ۧᩴܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 26
    iput-object p1, p0, Ll/ۧᩴܿ;->ܽ:Ljava/lang/String;

    .line 27
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧᩴܿ;->֫:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Ll/ۧᩴܿ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 35
    iput-object p1, p0, Ll/ۧᩴܿ;->ᩳ:Ljava/lang/String;

    .line 36
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧᩴܿ;->ۧ:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public final ܽ()V
    .locals 3

    .line 17
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    iget-object v1, p0, Ll/ۧᩴܿ;->֫:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۧᩴܿ;->ܽ:Ljava/lang/String;

    .line 18
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    iget-object v1, p0, Ll/ۧᩴܿ;->ۧ:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۧᩴܿ;->ᩳ:Ljava/lang/String;

    return-void
.end method
