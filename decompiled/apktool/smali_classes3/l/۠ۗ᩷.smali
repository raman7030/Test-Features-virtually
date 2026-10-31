.class public final Ll/۠ۗ᩷;
.super Ll/۬ۗܿ;
.source "Z3WS"


# instance fields
.field public final synthetic ֫֫:Ll/ۗܺ᩷;

.field public final synthetic ۟:Ll/᩶ۗ᩷;

.field public final synthetic ۧ֫:Ll/֡ۚۢ;

.field public final synthetic ܽ֫:Ll/۟᩵ۡ;


# direct methods
.method public constructor <init>(Ll/᩶ۗ᩷;Ll/ۗܺ᩷;Ll/۟᩵ۡ;Ll/ۗܺ᩷;Ll/֡ۚۢ;)V
    .locals 0

    .line 177
    iput-object p1, p0, Ll/۠ۗ᩷;->۟:Ll/᩶ۗ᩷;

    iput-object p3, p0, Ll/۠ۗ᩷;->ܽ֫:Ll/۟᩵ۡ;

    iput-object p4, p0, Ll/۠ۗ᩷;->֫֫:Ll/ۗܺ᩷;

    iput-object p5, p0, Ll/۠ۗ᩷;->ۧ֫:Ll/֡ۚۢ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 2

    .line 181
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 182
    iget-object v1, p0, Ll/۠ۗ᩷;->ܽ֫:Ll/۟᩵ۡ;

    invoke-virtual {v1}, Ll/۟᩵ۡ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 183
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 190
    :cond_0
    new-instance v1, Ll/֨ۗ᩷;

    invoke-direct {v1, p0, v0}, Ll/֨ۗ᩷;-><init>(Ll/۠ۗ᩷;Ljava/lang/String;)V

    .line 221
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
