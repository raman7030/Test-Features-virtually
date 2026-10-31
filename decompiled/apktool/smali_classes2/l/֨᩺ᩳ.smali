.class public final Ll/֨᩺ᩳ;
.super Ll/۬ۗܿ;
.source "G4ML"


# instance fields
.field public final synthetic ۟:Ll/ܶ᩺ᩳ;


# direct methods
.method public constructor <init>(Ll/ܶ᩺ᩳ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 928
    iput-object p1, p0, Ll/֨᩺ᩳ;->۟:Ll/ܶ᩺ᩳ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 2

    .line 933
    :try_start_0
    iget-object v0, p0, Ll/֨᩺ᩳ;->۟:Ll/ܶ᩺ᩳ;

    invoke-static {v0}, Ll/ܶ᩺ᩳ;->᩻(Ll/ܶ᩺ᩳ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->ܳ(I)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f12030d

    .line 934
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 939
    :catch_0
    :cond_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
