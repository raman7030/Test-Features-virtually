.class public Ll/֨ۜ֡;
.super Ll/۬ۜ֡;
.source "6ASE"


# instance fields
.field public final ܽ:Ll/᩻᩷֡;


# direct methods
.method public constructor <init>(Ll/᩺ܳ֡;Ll/᩻᩷֡;)V
    .locals 1

    .line 18
    invoke-direct {p0, p1}, Ll/۬ۜ֡;-><init>(Ll/᩺ܳ֡;)V

    if-nez p2, :cond_0

    .line 70
    new-instance p2, Ll/᩻᩷֡;

    const/4 p1, 0x0

    new-array v0, p1, [I

    invoke-direct {p2, v0}, Ll/᩻᩷֡;-><init>([I)V

    .line 71
    invoke-virtual {p2, p1}, Ll/᩻᩷֡;->֫(I)V

    .line 20
    :cond_0
    iput-object p2, p0, Ll/֨ۜ֡;->ܽ:Ll/᩻᩷֡;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Ll/֨ۜ֡;->ܽ:Ll/᩻᩷֡;

    invoke-virtual {v0}, Ll/᩻᩷֡;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()I
    .locals 1

    const/4 v0, 0x7

    return v0
.end method

.method public ֫(II)Z
    .locals 0

    .line 34
    iget-object p2, p0, Ll/֨ۜ֡;->ܽ:Ll/᩻᩷֡;

    invoke-virtual {p2, p1}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result p1

    return p1
.end method

.method public final ܽ()Ll/᩻᩷֡;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/֨ۜ֡;->ܽ:Ll/᩻᩷֡;

    return-object v0
.end method
