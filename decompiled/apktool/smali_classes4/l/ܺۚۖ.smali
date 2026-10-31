.class public final Ll/ܺۚۖ;
.super Ljava/lang/Object;
.source "194T"

# interfaces
.implements Ll/ۢۜۖ;


# instance fields
.field public ֫:Ll/᩶ۘۖ;

.field public ۧ:Z

.field public ܽ:Ll/ۘᩴۖ;

.field public ᩳ:Ll/ۢۜۖ;


# direct methods
.method public constructor <init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    iput-object p1, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    .line 58
    iput-object p2, p0, Ll/ܺۚۖ;->ᩳ:Ll/ۢۜۖ;

    .line 59
    iput-boolean p3, p0, Ll/ܺۚۖ;->ۧ:Z

    return-void
.end method

.method private ᩻()V
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ܺۚۖ;->֫:Ll/᩶ۘۖ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 196
    iput-object v0, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    .line 198
    :cond_0
    iget-boolean v0, p0, Ll/ܺۚۖ;->ۧ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܺۚۖ;->ᩳ:Ll/ۢۜۖ;

    if-eqz v0, :cond_1

    .line 199
    invoke-interface {v0}, Ll/ۢۜۖ;->֫()V

    const/4 v0, 0x0

    .line 202
    iput-boolean v0, p0, Ll/ܺۚۖ;->ۧ:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    .line 208
    invoke-direct {p0}, Ll/ܺۚۖ;->᩻()V

    return-void
.end method

.method public final ֫(Ll/ۘᩴۖ;)V
    .locals 2

    .line 155
    iget-object v0, p0, Ll/ܺۚۖ;->֫:Ll/᩶ۘۖ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    invoke-interface {v0}, Ll/ۘ֡ۖ;->getDefaultInstanceForType()Ll/᩻֡ۖ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 156
    iput-object p1, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {p0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    .line 160
    :goto_0
    invoke-direct {p0}, Ll/ܺۚۖ;->᩻()V

    return-void
.end method

.method public final ۧ()Ll/ۘᩴۖ;
    .locals 1

    const/4 v0, 0x1

    .line 91
    iput-boolean v0, p0, Ll/ܺۚۖ;->ۧ:Z

    .line 92
    invoke-virtual {p0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ۘᩴۖ;)V
    .locals 1

    .line 138
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    iput-object p1, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    .line 139
    iget-object p1, p0, Ll/ܺۚۖ;->֫:Ll/᩶ۘۖ;

    if-eqz p1, :cond_0

    .line 140
    invoke-virtual {p1}, Ll/᩶ۘۖ;->dispose()V

    const/4 p1, 0x0

    .line 141
    iput-object p1, p0, Ll/ܺۚۖ;->֫:Ll/᩶ۘۖ;

    .line 143
    :cond_0
    invoke-direct {p0}, Ll/ܺۚۖ;->᩻()V

    return-void
.end method

.method public final ܳ()Ll/ۘ֡ۖ;
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ܺۚۖ;->֫:Ll/᩶ۘۖ;

    if-eqz v0, :cond_0

    return-object v0

    .line 126
    :cond_0
    iget-object v0, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Ll/ܺۚۖ;->ᩳ:Ll/ۢۜۖ;

    return-void
.end method

.method public final ܿ()Ll/ۘᩴۖ;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    if-nez v0, :cond_0

    .line 78
    iget-object v0, p0, Ll/ܺۚۖ;->֫:Ll/᩶ۘۖ;

    invoke-interface {v0}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object v0

    check-cast v0, Ll/ۘᩴۖ;

    iput-object v0, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    .line 80
    :cond_0
    iget-object v0, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    return-object v0
.end method

.method public final ᩳ()Ll/᩶ۘۖ;
    .locals 2

    .line 103
    iget-object v0, p0, Ll/ܺۚۖ;->֫:Ll/᩶ۘۖ;

    if-nez v0, :cond_0

    .line 108
    iget-object v0, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    invoke-virtual {v0, p0}, Ll/ۡۜۖ;->newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/᩶ۘۖ;

    iput-object v0, p0, Ll/ܺۚۖ;->֫:Ll/᩶ۘۖ;

    .line 109
    iget-object v1, p0, Ll/ܺۚۖ;->ܽ:Ll/ۘᩴۖ;

    invoke-virtual {v0, v1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    .line 110
    iget-object v0, p0, Ll/ܺۚۖ;->֫:Ll/᩶ۘۖ;

    invoke-virtual {v0}, Ll/᩶ۘۖ;->markClean()V

    .line 112
    :cond_0
    iget-object v0, p0, Ll/ܺۚۖ;->֫:Ll/᩶ۘۖ;

    return-object v0
.end method
