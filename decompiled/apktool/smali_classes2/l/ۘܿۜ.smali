.class public final Ll/ۘܿۜ;
.super Ljava/lang/Object;
.source "L78E"


# instance fields
.field public ֫:Z

.field public final ۜ:Ljava/util/ArrayList;

.field public ۢ:I

.field public ۧ:Z

.field public final ܳ:Ljava/util/ArrayList;

.field public ܽ:Ll/ᩳܿۜ;

.field public ܿ:Z

.field public final ᩳ:Ll/᩻ۜۜ;

.field public final ᩷:Ljava/util/ArrayList;

.field public final ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩻ۜۜ;)V
    .locals 1

    .line 2028
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2013
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘܿۜ;->ܳ:Ljava/util/ArrayList;

    .line 2014
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘܿۜ;->᩻:Ljava/util/ArrayList;

    .line 2015
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘܿۜ;->᩷:Ljava/util/ArrayList;

    .line 2016
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘܿۜ;->ۜ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 2021
    iput v0, p0, Ll/ۘܿۜ;->ۢ:I

    .line 2029
    iput-object p1, p0, Ll/ۘܿۜ;->ᩳ:Ll/᩻ۜۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 2043
    iget-object v0, p0, Ll/ۘܿۜ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2044
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/ۗۛ᩻;)V
    .locals 2

    .line 2052
    iget-object v0, p0, Ll/ۘܿۜ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2053
    new-instance v0, Ll/᩷᩷ۜ;

    iget-object v1, p2, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, v1, p2}, Ll/᩷᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Ll/ۘܿۜ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ᩳܿۜ;)V
    .locals 0

    .line 2109
    iput-object p1, p0, Ll/ۘܿۜ;->ܽ:Ll/ᩳܿۜ;

    return-void
.end method

.method public final ֫(Ll/᩻᩷ۜ;)V
    .locals 1

    .line 2036
    iget-object v0, p0, Ll/ۘܿۜ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 2101
    iget-object v0, p0, Ll/ۘܿۜ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Ll/ۘܿۜ;->ᩳ:Ll/᩻ۜۜ;

    iget v1, v1, Ll/᩻ۜۜ;->ۜ:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
