.class public final Ll/ۙᩳۖ;
.super Ll/۠ᩳۖ;
.source "P86L"


# instance fields
.field public volatile ֫:Ll/۠ᩳۖ;

.field public final synthetic ۧ:Ll/ۗᩳۖ;

.field public final synthetic ܳ:Ll/ܽۜۖ;

.field public final synthetic ܽ:Ll/۫ܽۖ;

.field public final synthetic ܿ:Z

.field public final synthetic ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ۗᩳۖ;ZZLl/۫ܽۖ;Ll/ܽۜۖ;)V
    .locals 0

    .line 121
    iput-object p1, p0, Ll/ۙᩳۖ;->ۧ:Ll/ۗᩳۖ;

    iput-boolean p2, p0, Ll/ۙᩳۖ;->ᩳ:Z

    iput-boolean p3, p0, Ll/ۙᩳۖ;->ܿ:Z

    iput-object p4, p0, Ll/ۙᩳۖ;->ܽ:Ll/۫ܽۖ;

    iput-object p5, p0, Ll/ۙᩳۖ;->ܳ:Ll/ܽۜۖ;

    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 3

    .line 130
    iget-boolean v0, p0, Ll/ۙᩳۖ;->ᩳ:Z

    if-eqz v0, :cond_0

    .line 131
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩺()V

    const/4 p1, 0x0

    return-object p1

    .line 149
    :cond_0
    iget-object v0, p0, Ll/ۙᩳۖ;->֫:Ll/۠ᩳۖ;

    if-nez v0, :cond_1

    .line 151
    iget-object v0, p0, Ll/ۙᩳۖ;->ܽ:Ll/۫ܽۖ;

    iget-object v1, p0, Ll/ۙᩳۖ;->ۧ:Ll/ۗᩳۖ;

    iget-object v2, p0, Ll/ۙᩳۖ;->ܳ:Ll/ܽۜۖ;

    invoke-virtual {v0, v1, v2}, Ll/۫ܽۖ;->֫(Ll/ܶᩳۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙᩳۖ;->֫:Ll/۠ᩳۖ;

    .line 134
    :cond_1
    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 3

    .line 139
    iget-boolean v0, p0, Ll/ۙᩳۖ;->ܿ:Z

    if-eqz v0, :cond_0

    .line 140
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 149
    :cond_0
    iget-object v0, p0, Ll/ۙᩳۖ;->֫:Ll/۠ᩳۖ;

    if-nez v0, :cond_1

    .line 151
    iget-object v0, p0, Ll/ۙᩳۖ;->ܽ:Ll/۫ܽۖ;

    iget-object v1, p0, Ll/ۙᩳۖ;->ۧ:Ll/ۗᩳۖ;

    iget-object v2, p0, Ll/ۙᩳۖ;->ܳ:Ll/ܽۜۖ;

    invoke-virtual {v0, v1, v2}, Ll/۫ܽۖ;->֫(Ll/ܶᩳۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙᩳۖ;->֫:Ll/۠ᩳۖ;

    .line 143
    :cond_1
    invoke-virtual {v0, p1, p2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    return-void
.end method
