.class public final Ll/ۨ᩷;
.super Ll/᩷ۜ;
.source "P55W"


# instance fields
.field public final synthetic ֫:Ll/ܿۢ;


# direct methods
.method public constructor <init>(Ll/ܿۢ;)V
    .locals 0

    .line 340
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 800
    iput-object p1, p0, Ll/ۨ᩷;->֫:Ll/ܿۢ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۢ᩷;
    .locals 1

    .line 805
    iget-object v0, p0, Ll/ۨ᩷;->֫:Ll/ܿۢ;

    iget-object v0, v0, Ll/ܿۢ;->᩺:Ll/ۛ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ᩳ᩷;->ܽ()Ll/ۧ᩷;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
