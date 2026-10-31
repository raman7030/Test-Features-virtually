.class public final Ll/ۚ᩻ܺ;
.super Ll/ۗۜܺ;
.source "LBD2"


# instance fields
.field public ۗ:Ll/֡᩻ܺ;


# direct methods
.method public constructor <init>(Ll/֡᩻ܺ;)V
    .locals 1

    const/4 v0, 0x4

    .line 47
    invoke-direct {p0, v0, v0}, Ll/ۗۜܺ;-><init>(II)V

    .line 53
    iput-object p1, p0, Ll/ۚ᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 61
    sget-object v0, Ll/ۘۜܺ;->ۤ:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 1

    .line 69
    invoke-virtual {p1}, Ll/֫ۜܺ;->ۚ()Ll/ۙۜܺ;

    move-result-object p1

    .line 71
    iget-object v0, p0, Ll/ۚ᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    invoke-virtual {p1, v0}, Ll/ۙۜܺ;->ۧ(Ll/ۗۜܺ;)Ll/ۗۜܺ;

    move-result-object p1

    check-cast p1, Ll/֡᩻ܺ;

    iput-object p1, p0, Ll/ۚ᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    return-void
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ۚ᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    invoke-virtual {v0}, Ll/֡᩻ܺ;->ۢ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 2

    .line 87
    iget-object p1, p0, Ll/ۚ᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    invoke-virtual {p1}, Ll/ۗۜܺ;->ܿ()I

    move-result p1

    .line 89
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    invoke-static {p1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "  annotations_off: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p2, v1, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 93
    :cond_0
    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method
