.class public final Ll/ۛۧۘ;
.super Ll/᩺ۧۘ;
.source "X9GZ"


# static fields
.field public static final ܽ:Ll/֫᩻֨;


# instance fields
.field public ۧ:Ll/᩸ۧۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    const-class v0, Ll/ۛۧۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۛۧۘ;->ܽ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/᩸ۧۘ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ۛۧۘ;->ۧ:Ll/᩸ۧۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳۨۖ;)V
    .locals 4

    .line 43
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ܿ()I

    move-result v0

    iget-object v1, p0, Ll/ۛۧۘ;->ۧ:Ll/᩸ۧۘ;

    invoke-virtual {v1, v0}, Ll/᩸ۧۘ;->֫(I)V

    .line 44
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ܿ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1}, Ll/᩸ۧۘ;->֫()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sget-object v0, Ll/ۛۧۘ;->ܽ:Ll/֫᩻֨;

    const-string v1, "Server granted us {} credits for {}, now available: {} credits"

    invoke-interface {v0, v1, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    iget-object v0, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    invoke-virtual {v0, p1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V

    return-void
.end method
