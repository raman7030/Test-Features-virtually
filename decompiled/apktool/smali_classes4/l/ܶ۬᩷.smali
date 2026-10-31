.class public Ll/ܶ۬᩷;
.super Ljava/lang/Object;
.source "S1JV"


# instance fields
.field public final ֫:Ll/ۧ۫᩷;


# direct methods
.method public constructor <init>(Ll/ۧ۫᩷;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Ll/ܶ۬᩷;->֫:Ll/ۧ۫᩷;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۧ۫᩷;
    .locals 3

    .line 17
    new-instance v0, Ll/ۧ۫᩷;

    iget-object v1, p0, Ll/ܶ۬᩷;->֫:Ll/ۧ۫᩷;

    const-string v2, "cache"

    invoke-direct {v0, v1, v2}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ll/ܿۛ᩷;)V
    .locals 3

    .line 29
    new-instance v0, Ll/֫۫᩷;

    new-instance v1, Ll/᩶۬᩷;

    iget-object v2, p0, Ll/ܶ۬᩷;->֫:Ll/ۧ۫᩷;

    invoke-direct {v1, v2}, Ll/᩶۬᩷;-><init>(Ll/ۧ۫᩷;)V

    invoke-direct {v0, p1, v1}, Ll/֫۫᩷;-><init>(Ll/ܿۛ᩷;Ll/᩶۬᩷;)V

    invoke-virtual {v0}, Ll/֫۫᩷;->֫()V

    return-void
.end method

.method public final ۧ()Ll/ۧ۫᩷;
    .locals 3

    .line 25
    new-instance v0, Ll/ۧ۫᩷;

    iget-object v1, p0, Ll/ܶ۬᩷;->֫:Ll/ۧ۫᩷;

    const-string v2, "out"

    invoke-direct {v0, v1, v2}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ܽ()Ll/ۧ۫᩷;
    .locals 1

    .line 13
    iget-object v0, p0, Ll/ܶ۬᩷;->֫:Ll/ۧ۫᩷;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 33
    iget-object v0, p0, Ll/ܶ۬᩷;->֫:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v0

    return v0
.end method

.method public final ᩳ()Ll/ۧ۫᩷;
    .locals 3

    .line 21
    new-instance v0, Ll/ۧ۫᩷;

    iget-object v1, p0, Ll/ܶ۬᩷;->֫:Ll/ۧ۫᩷;

    const-string v2, "state"

    invoke-direct {v0, v1, v2}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    return-object v0
.end method
