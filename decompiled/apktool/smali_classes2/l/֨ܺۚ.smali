.class public final Ll/֨ܺۚ;
.super Ll/۫ᩳ֡;
.source "S6B2"


# direct methods
.method public constructor <init>(Ll/ܰᩴۚ;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16709
    iput-object p1, p0, Ll/۫ᩳ֡;->᩻:Ll/ܰᩴۚ;

    const/16 p1, 0x2b

    .line 16710
    iput p1, p0, Ll/۫ᩳ֡;->ۧ:I

    .line 16711
    sget-object p1, Ll/ܰᩴۚ;->ۛ:[S

    iput-object p1, p0, Ll/۫ᩳ֡;->ᩳ:[S

    .line 16712
    sget-object p1, Ll/ܰᩴۚ;->ۤ:[S

    iput-object p1, p0, Ll/۫ᩳ֡;->ܽ:[S

    .line 16713
    sget-object p1, Ll/ܰᩴۚ;->᩺:[C

    iput-object p1, p0, Ll/۫ᩳ֡;->ܳ:[C

    .line 16714
    sget-object p1, Ll/ܰᩴۚ;->ۨ:[C

    iput-object p1, p0, Ll/۫ᩳ֡;->ܿ:[C

    .line 16715
    sget-object p1, Ll/ܰᩴۚ;->۫:[S

    iput-object p1, p0, Ll/۫ᩳ֡;->֫:[S

    .line 16716
    sget-object p1, Ll/ܰᩴۚ;->ܰ:[S

    iput-object p1, p0, Ll/۫ᩳ֡;->ۜ:[S

    .line 16717
    sget-object p1, Ll/ܰᩴۚ;->۟:[[S

    iput-object p1, p0, Ll/۫ᩳ֡;->᩷:[[S

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "()* loopback of 785:5: ({...}? annotation )*"

    return-object v0
.end method

.method public final ۧ(ILl/ۨᩳ֡;)I
    .locals 3

    .line 16725
    check-cast p2, Ll/᩷ܿ֡;

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 16729
    invoke-interface {p2, p1}, Ll/ۨᩳ֡;->ۧ(I)I

    .line 16731
    invoke-interface {p2}, Ll/ۨᩳ֡;->index()I

    move-result v0

    .line 16732
    invoke-interface {p2}, Ll/ۨᩳ֡;->ܳ()V

    .line 16734
    invoke-interface {p2, p1}, Ll/ۨᩳ֡;->ۧ(I)I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    const/16 p1, 0x47

    .line 16737
    :cond_0
    invoke-interface {p2, v0}, Ll/ۨᩳ֡;->֫(I)V

    return p1

    .line 16741
    :cond_1
    new-instance v0, Ll/ܽܿ֡;

    const-string v1, "()* loopback of 785:5: ({...}? annotation )*"

    const/16 v2, 0x2b

    .line 16742
    invoke-direct {v0, v1, v2, p1, p2}, Ll/ܽܿ֡;-><init>(Ljava/lang/String;IILl/ۨᩳ֡;)V

    .line 16744
    throw v0
.end method
