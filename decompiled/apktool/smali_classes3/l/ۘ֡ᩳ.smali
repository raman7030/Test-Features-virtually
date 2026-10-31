.class public final Ll/ۘ֡ᩳ;
.super Ll/֡ܽ;
.source "PAPA"


# instance fields
.field public final synthetic ᩳ:Ll/֨֡ᩳ;


# direct methods
.method public constructor <init>(Ll/֨֡ᩳ;)V
    .locals 0

    .line 83
    iput-object p1, p0, Ll/ۘ֡ᩳ;->ᩳ:Ll/֨֡ᩳ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/֡ܽ;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 2

    .line 86
    iget-object v0, p0, Ll/ۘ֡ᩳ;->ᩳ:Ll/֨֡ᩳ;

    iget-object v1, v0, Ll/֨֡ᩳ;->ܳۧ:Ll/ܶ᩺ᩳ;

    invoke-virtual {v1}, Ll/ܶ᩺ᩳ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 87
    iget-object v0, v0, Ll/֨֡ᩳ;->ܳۧ:Ll/ܶ᩺ᩳ;

    invoke-virtual {v0}, Ll/ܶ᩺ᩳ;->ܽ()V

    return-void

    .line 89
    :cond_0
    invoke-static {v0}, Ll/֨֡ᩳ;->ܿ(Ll/֨֡ᩳ;)V

    return-void
.end method
