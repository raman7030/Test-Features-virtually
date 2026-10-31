.class public final Ll/ᩴ᩹ۚ;
.super Ll/᩸᩹ۚ;
.source "0BJO"


# instance fields
.field public final ۧ:Ll/ۛܶۚ;


# direct methods
.method public constructor <init>(Ll/᩷᩹ۚ;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ll/᩷᩹ۚ;-><init>()V

    .line 23
    iput-object p1, p0, Ll/᩸᩹ۚ;->֫:Ll/᩷᩹ۚ;

    .line 24
    new-instance v0, Ll/ۛܶۚ;

    invoke-direct {v0, p1}, Ll/ۛܶۚ;-><init>(Ll/᩷᩹ۚ;)V

    iput-object v0, p0, Ll/ᩴ᩹ۚ;->ۧ:Ll/ۛܶۚ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 43
    iget-object v0, p0, Ll/᩸᩹ۚ;->֫:Ll/᩷᩹ۚ;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, ":has(%s)"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 3

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-virtual {p2}, Ll/᩶֡ۚ;->ᩳ()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 31
    invoke-virtual {p2, v0}, Ll/ۨ֡ۚ;->֫(I)Ll/ۨ֡ۚ;

    move-result-object v1

    .line 32
    instance-of v2, v1, Ll/᩶֡ۚ;

    if-eqz v2, :cond_0

    .line 33
    iget-object v2, p0, Ll/ᩴ᩹ۚ;->ۧ:Ll/ۛܶۚ;

    check-cast v1, Ll/᩶֡ۚ;

    invoke-virtual {v2, p2, v1}, Ll/ۛܶۚ;->֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Ll/᩶֡ۚ;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return p1
.end method
