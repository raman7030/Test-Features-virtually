.class public final Ll/ܿۨܽ;
.super Ll/۬ۗܿ;
.source "H5BW"


# instance fields
.field public final synthetic ۟:Ll/ۗۘ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ۗۘ;)V
    .locals 0

    .line 418
    iput-object p2, p0, Ll/ܿۨܽ;->۟:Ll/ۗۘ;

    const/4 p2, -0x1

    .line 40
    invoke-direct {p0, p1, p2}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 2

    .line 422
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 423
    iget-object v1, p0, Ll/ܿۨܽ;->۟:Ll/ۗۘ;

    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 424
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Ll/ۗۘ;->setChecked(Z)V

    .line 425
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
