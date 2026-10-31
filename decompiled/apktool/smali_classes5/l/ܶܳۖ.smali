.class public final Ll/ܶܳۖ;
.super Ll/֨ܳۖ;
.source "H86F"


# instance fields
.field public volatile ֫:Ll/۠ᩳۖ;

.field public final ۧ:Ll/۫ܽۖ;

.field public final ܽ:Z

.field public final ܿ:Ll/ܽۜۖ;

.field public final ᩳ:Ll/ܶᩳۖ;


# direct methods
.method public constructor <init>(Ll/ܿᩳۖ;Ll/ۨܽۖ;Ll/۫ܽۖ;Ll/ܽۜۖ;Ll/ܶᩳۖ;Z)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ll/֨ܳۖ;-><init>()V

    .line 71
    iput-object p3, p0, Ll/ܶܳۖ;->ۧ:Ll/۫ܽۖ;

    .line 72
    iput-object p4, p0, Ll/ܶܳۖ;->ܿ:Ll/ܽۜۖ;

    .line 73
    iput-object p5, p0, Ll/ܶܳۖ;->ᩳ:Ll/ܶᩳۖ;

    .line 74
    iput-boolean p6, p0, Ll/ܶܳۖ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 3

    .line 115
    iget-object v0, p0, Ll/ܶܳۖ;->֫:Ll/۠ᩳۖ;

    if-nez v0, :cond_0

    .line 117
    iget-object v0, p0, Ll/ܶܳۖ;->ۧ:Ll/۫ܽۖ;

    iget-object v1, p0, Ll/ܶܳۖ;->ᩳ:Ll/ܶᩳۖ;

    iget-object v2, p0, Ll/ܶܳۖ;->ܿ:Ll/ܽۜۖ;

    invoke-virtual {v0, v1, v2}, Ll/۫ܽۖ;->֫(Ll/ܶᩳۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ܶܳۖ;->֫:Ll/۠ᩳۖ;

    .line 89
    :cond_0
    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 3

    .line 115
    iget-object v0, p0, Ll/ܶܳۖ;->֫:Ll/۠ᩳۖ;

    if-nez v0, :cond_0

    .line 117
    iget-object v0, p0, Ll/ܶܳۖ;->ۧ:Ll/۫ܽۖ;

    iget-object v1, p0, Ll/ܶܳۖ;->ᩳ:Ll/ܶᩳۖ;

    iget-object v2, p0, Ll/ܶܳۖ;->ܿ:Ll/ܽۜۖ;

    invoke-virtual {v0, v1, v2}, Ll/۫ܽۖ;->֫(Ll/ܶᩳۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ܶܳۖ;->֫:Ll/۠ᩳۖ;

    .line 101
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ()Ll/۠ᩳۖ;
    .locals 3

    .line 115
    iget-object v0, p0, Ll/ܶܳۖ;->֫:Ll/۠ᩳۖ;

    if-nez v0, :cond_0

    .line 117
    iget-object v0, p0, Ll/ܶܳۖ;->ۧ:Ll/۫ܽۖ;

    iget-object v1, p0, Ll/ܶܳۖ;->ᩳ:Ll/ܶᩳۖ;

    iget-object v2, p0, Ll/ܶܳۖ;->ܿ:Ll/ܽۜۖ;

    invoke-virtual {v0, v1, v2}, Ll/۫ܽۖ;->֫(Ll/ܶᩳۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ܶܳۖ;->֫:Ll/۠ᩳۖ;

    :cond_0
    return-object v0
.end method
